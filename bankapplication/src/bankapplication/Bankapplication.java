
package bankapplication;
import java.util.Scanner; 
import java.util.*;
 class Account{
    private int accno;
    private String addr;
    private String name;
    double balance=0;

void addcust(){
    Scanner S = new Scanner(System.in);
    System.out.println("Enter the account number which is generated:   ");
    accno=S.nextInt();
     System.out.print("Enter the name :  ");
     name=S.next();
      System.out.print("Enter the address : ");
      addr=S.next();
      
       System.out.println("Enter the initial money to be deposited(min=500) ");
      balance=S.nextInt();
        if(balance>=500){
            System.out.println("Account has been created Successfully  ");
        }
        else{
             System.out.println("Balance must be more than 500 , Please try again  ");
        }
 }    
    
    

void deposit(){
  double damt=0;
System.out.println("Enter the Amount to be deposited: ");
Scanner S = new Scanner(System.in);
damt=S.nextDouble();

balance=balance+damt;

}

void withdrawal(){
    double wamt;
 System.out.println("Enter the amount to be withdrawned:  ");
 Scanner S = new Scanner(System.in);
wamt=S.nextDouble();

if((balance-wamt)<500){
     System.out.println("Insufficient balance to withdraw ");
}
else{
    balance=balance-wamt;
} 
}
   
void transfer(){
    double transamt;
    double temp;
    Scanner S = new Scanner(System.in);
    System.out.println("Enter the AccountNumber to where money should be transfered  " );
    accno=S.nextInt();
     System.out.println("Enter the AccountNumber from where money should be transfered  " );
     accno=S.nextInt();
     System.out.println("Enter the amount to be transferred:  " );
     transamt=S.nextDouble();
     
     if((balance-transamt)<500){
     System.out.println("Insufficient balance to withdraw ");
}
     else{
         balance =balance-transamt;
         }
     
     



}


 }






















public class Bankapplication {

   
    public static void main(String[] args) {
        ArrayList<Integer> = new ArrayList<Integer>(n);
        
        int ch;
        Scanner S = new Scanner(System.in);
        do{
            System.out.println("1.Add Customer:  ");
            System.out.println("2.Deposit Money:  ");
            System.out.println("3.Withdraw money:  ");
            System.out.println("4.Transfer Money:  ");
            System.out.println("5.Balance Enquiry");
            System.out.println("6.Person with highest bank balance:  ");
            System.out.println("7.Exit  ");
            System.out.println("Enter your choice: "); 
            ch =S.nextInt();
            
           switch(ch){
               case 1: 
               
               
               
               
           } 
            
            
            
        }while(ch!=7);
           
           
           
           
           
           
           
       } 
        
        
        
        
    }
    
