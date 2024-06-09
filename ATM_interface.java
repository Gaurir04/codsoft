import java.util.Scanner;

public class ATM_interface {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your name:");
        String name = sc.next();

        int balance = 10000;

        while(true) {
            System.out.println("select any operation you want to perform:");
            System.out.println("1.Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. EXIT");
            System.out.println("Enter correct number");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("enter the amount you want to withdraw:");
                    int withdraw = sc.nextInt();

                    if (withdraw >= balance) {
                        System.out.println("you have insufficient balance!!!!");
                    } else {
                        balance = balance - withdraw;
                        System.out.println("your amount withdraw successfully!!!");
                    }
                    break;

                case 2:
                    System.out.println("enter the amount you want to deposit:");
                    int deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("you have successfully deposited!!!");
                    break;

                case 3:
                    System.out.println("your account balance is:" + balance);
                    break;

                case 4:
                    System.out.println("you have exited the system:");
                    System.exit(0);
                    break;

                default:
                    break;
            }
        }
    }
}
