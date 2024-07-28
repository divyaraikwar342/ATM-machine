import java.util.Scanner;

class atm{
    float Balance;
    int PIN= 5674;

    public void checkpin(){
        System.out.println("Enter your PIN:");
        Scanner sc = new Scanner(System.in);
        int enterpin = sc.nextInt();
        if (enterpin==PIN) {
            menu();
        } else {
            System.out.println("Enter a valid PIN ");
        }
    }

    public void menu(){
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check Accont Balance:");
        System.out.println("2. Withdraw Money ");
        System.out.println("3. Deposit Money ");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

       if (opt==1) {
        checkBalance();
       } 
       else if (opt==2) {
        withdrawMawoney();
       }
       else if (opt==3) {
        depositMoney();
    }
       else if (opt==4) {
        System.out.println("Thank you for using our ATM!");
        return;
       }
       else{
        System.out.println("Enter a valid choice");
       }
    }

    public void checkBalance(){
        System.out.println("Balance: " + Balance);
        menu();
    }

    public void withdrawMawoney(){
        System.out.println("Enter amount to withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount>Balance) {
            System.out.println("insufficient Balance");
        } else {
            Balance = Balance - amount;
            System.out.println("Money withdrawl successful");
            menu();
        }
    }
        
        public void depositMoney() {
            System.out.println("Enter your amount: ");
            Scanner sc = new Scanner(System.in);
            float amount = sc.nextFloat();
            Balance = Balance + amount;
            System.out.println("Money Deposited successfully");
        }

}

public class atmmachine {
    public static void main(String[] args) {
        atm obj = new atm();
        obj.checkpin();
    }
}
