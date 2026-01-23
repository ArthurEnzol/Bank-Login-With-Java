package application;

import entities.AccountBank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean haveAccount = false;
        int exit = 1;
        String resp;
        AccountBank accountBank = null;

        do {

            do {

                System.out.print("You have a account? [Y/N] ");
                resp = sc.next().toUpperCase();

                if (resp.equals("Y") || resp.equals("N")) {

                    switch (resp) {
                        case "Y":
                            haveAccount = true;
                            break;
                        case "N":
                            haveAccount = false;
                            break;
                    }

                }
                else {
                    System.out.println("Write just Y or N. ");
                    System.out.println();
                }


            } while (!resp.equals("Y") && !resp.equals("N"));

            int numberAccount = 0;

            switch (resp) {
                case "Y":
                    haveAccount = true;
                    break;
                case "N":
                    haveAccount = false;
                    break;
            }

            if (haveAccount) {
                System.out.println("Press enter for login. ");
                sc.nextLine();
                System.out.print("Account number: ");
                int accountNumber = sc.nextInt();
                int quantityDigitsOfAccountNumber = String.valueOf(accountNumber).length();

                if (AccountBank.listNumbersAccounts.contains(numberAccount)) {

                    int indexNameAccount = AccountBank.listNumbersAccounts.indexOf(numberAccount);
                    String nameAccount = AccountBank.listNamesAccounts.get(indexNameAccount);
                    System.out.println("Account find: ");
                    System.out.printf("Number Account: ", numberAccount);
                    System.out.printf("Name: ", nameAccount);

                }
                else {

                    System.out.println("Account not found");
                    System.out.println("Closing program...");
                    break;

                }

                if (quantityDigitsOfAccountNumber == 8) {
                    boolean numberAccountExist = false;

                    for (int number: AccountBank.listNumbersAccounts) {

                        if (number == accountNumber) {
                            numberAccountExist = true;
                            numberAccount = number;
                            break;
                        }

                    }

                    if (numberAccountExist == true) {
                        int indexNameToNumberAccount = AccountBank.listNumbersAccounts.indexOf(numberAccount);
                        System.out.println("You name is: " + AccountBank.listNamesAccounts.indexOf(indexNameToNumberAccount + "? "));
                    }

                }
            }
            else {
                System.out.println("Follow the step-by-step guide to create an account: ");
                System.out.println("Write your first name: ");
                String firstName = sc.next();
                System.out.println("Loading...");
                try {
                    Thread.sleep(3500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    AccountBank.listNamesAccounts.add(firstName);
                    AccountBank.listNumbersAccounts.add(numberAccount);
                    System.out.println("Account saved with success.");
                    System.out.printf("Save your account number: %d" + numberAccount);

                } catch (Exception e) {
                    System.out.printf("Ops, an error has occurred: %s", e);
                }
            }

        } while (exit != 0);

    }

}