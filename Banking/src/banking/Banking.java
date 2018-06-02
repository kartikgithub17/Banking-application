/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;
import java.util.Scanner;

/**
 *
 * @author Kartik Kulkarni
 */
public class Banking {
        double accountnumber;
    double balance;
    
    
    void deposit(double depositamount)
    {
        balance+=depositamount;
    }
    
    void withdraw(double withdrawamt)
    {
        if(balance>withdrawamt)
        balance-=withdrawamt; 
        else
            System.out.println("Insufficient balance");
    }
    
    void Display()
    {
        System.out.println("Total Balance = "+balance);
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int index,c;
        c=0;
        Scanner input = new Scanner(System.in);
       Banking[] a = new Banking[20];
       for(index=0;index<a.length;index++)
       {
           a[index]=new Banking();
       }
       exit:
       
       while(true)
       {
           
       System.out.println("Enter 1.Create 2.Deposit 3.Withdraw 4.Transfer 5.Total amount 6.Richest person. 7.Exit ");
       System.out.println("Enter the choice ");
       int ch = input.nextInt();
       
       switch(ch)
       {
           case 1:{ 
                    System.out.println("Enter the account number ");
                    int account = input.nextInt();
 
                    for(index=0;index<a.length;index++)
                    {
                        if(a[index].accountnumber==account)
                        {
                            System.out.println("Account exists");
                            break;
                        }
                    }
                       a[c].accountnumber= account;
                       System.out.println("Enter the initial amount ");
                       a[c].balance= input.nextDouble();
                       c++;
                       System.out.println("Amount has been added successfully");
                        
                            break;
                        
                   }
           
           case 2:{ 
                    System.out.println("Enter the account number ");
                    int account = input.nextInt();
                    System.out.println("Enter the deposit amount ");
                    double depositamt = input.nextDouble();
                    
                    for(index=0;index<a.length;index++)
                    {
                        if(a[index].accountnumber==account)
                        {
                            a[index].deposit(depositamt);
                            a[index].Display();
                            break;
                        }
                    }
                        if(index==a.length)
                       System.out.println("Account doesnot exist!! ");
                        
                           break;
                        
                   }
           case 3: {    
                       System.out.println("Enter the account number ");
                    int acc = input.nextInt();
                    System.out.println("Enter the withdrawal amount ");
                    double wamt = input.nextDouble();
                    
                    for(index=0;index<a.length;index++)
                    {
                        if(a[index].accountnumber==acc)
                        {
                            a[index].withdraw(wamt);
                            System.out.println("Amount withdrawned Successfully");
                            a[index].Display();
                            
                            break;
                        }
                    }
                        if(index==a.length)
                       System.out.println("Account doesnot exist!! ");
                        
                           break;
                        
                   } 
            case 4: {
                    System.out.println("Enter the account number from which you want to transfer ");
                    int acc1 = input.nextInt();
                    
                    System.out.println("Enter the account number to which you want to transfer ");
                    int acc2 = input.nextInt();
                    
                    System.out.println("Enter the transfering amount ");
                    double tamt = input.nextDouble();
                    
                    for(index=0;index<a.length;index++)
                    {
                        if(a[index].accountnumber==acc1)
                        {
                            a[index].withdraw(tamt);
                            
                            System.out.println("The Aamount Remaining the account which has received money from other accountis:");
                            a[index].Display();
                            break;
                        }
                    }
                    
                    for(index=0;index<a.length;index++)
                    {
                        if(a[index].accountnumber==acc2)
                        {
                            a[index].deposit(tamt);
                            System.out.println("Total Amount in the Account is: ");
                            a[index].Display();
                            break;
                        }
                    }
                        if(index==a.length)
                       System.out.println("Account doesnot exist!! ");
                        
                           break;
                        
                   
                    }
            case 5:{
                        double totalamount=0;
                        for(index=0;index<a.length;index++)
                        {
                            totalamount+=a[index].balance;
                        }
                        System.out.println("Total Amount in the bank = "+totalamount);
                            
                        break;
                
                    }
            case 6:{
                        double highbalance=0;
                        int j=0;
                        for(index=0;index<a.length;index++)
                        {
                            if(a[index].balance>highbalance)
                            {
                                highbalance=a[index].balance;
                                j=index;
                            }
                                
                        }
                System.out.println("Richest person in the bank is with account number "+a[j].accountnumber);
                            break;
                

        // TODO code application logic here
    }
       }   

       }
    
    }