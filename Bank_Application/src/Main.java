

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // input username and password
        Scanner input = new Scanner(System.in);
        char l ='y';
        while(l=='y'){    // login loop un less incase its not correct
            int  pass =5418;
            String user ="anjan";
            System.out.println("**** Welcome to XYZ Bank ****");
            System.out.println("Enter your username.");
            String username = input.nextLine();
            System.out.println("Enter your password.");
            int a = input.nextInt();
//             if else for  passport
            if(username.equals(user)&& a ==pass){
                double balance =10000;
                char b='y';
                while(b=='y') {
                    System.out.println("Choose Your Transaction");
                    System.out.println("1. Check Balance \n2. Deposit Balance \n3. Withdraw \n4. Exit");
                    int choice = input.nextInt();
                    switch (choice) {
                        case 1: {
                            System.out.println("Your balance is :" + balance);
                            break;
                        }
                        case 2: {
                            System.out.println("Enter the amount you want to deposit.");
                            double de = input.nextDouble();
                            balance += de;
                            System.out.println("Your new balance is :" + balance);
                            break;
                        }
                        case 3: {
                            System.out.println("Enter the amount you want to withdraw.");
                            double wd = input.nextDouble();
                            if (balance <= wd) {
                                System.out.println("You have insufficent balance. You have only Rs. "+balance);
                            } else {
                                System.out.println("Your new balance is :" + (balance - wd));

                            }
                            break;
                        }
                        case 4: {
                            System.out.println("Thank You !!!! for your visit......");
                            System.exit(0);
                        }
                    }
                    System.out.println("Do you want other transaction ????? Please type 'y' for yes and 'n' to exit...?");
                    b=input.next().charAt(0);
                    if(b=='n'){
                        System.exit(0);
                    }
                }

            }
            else{
                System.out.println("Please check your login....!!!! . Do you want to retry type 'y' for yes and 'n' to exit...?");
            }

        }
    }
}
