import java.util.Scanner;
public class Banking {
    int acc_no;
    String Account_holder_name;
    double balance;
    int cont_no;
    double opening_balance;
    Scanner ob = new Scanner(System.in);

    public Banking() {
        acc_no = 0;
        Account_holder_name = "null";
        balance = 0;
        cont_no = 0;
        opening_balance = 3000;
    }
    public void getvalue() {
        System.out.println("Enter your account number:");
        acc_no = ob.nextInt();
        System.out.println("Enter your account holder name:");
        Account_holder_name = ob.next();
        System.out.println("Enter your contact number:");
        cont_no = ob.nextInt();
        System.out.println("Enter the amount to deposit:");
        balance = ob.nextDouble();
    }

    public void deposit() {
        balance = balance + opening_balance;
    }

    public void withdraw() {
        System.out.println("Enter the amount to withdraw:");
        double withdrawalAmount = ob.nextDouble();
        if (balance < withdrawalAmount) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - withdrawalAmount;
        }
    }

    public void showbalance() {
        System.out.println("Your account number: " + acc_no);
        System.out.println("Your name: " + Account_holder_name);
        System.out.println("Your contact number: " + cont_no);
        System.out.println("Your current balance is: " + balance);
    }

    public static void main(String[] args) {
        Banking b = new Banking();
        b.getvalue();
        b.deposit();
        b.showbalance();
        b.withdraw();
        b.showbalance();
}
}