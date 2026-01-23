package application;

import entities.AccountBank;
import java.util.Scanner;
import entities.GenerateNumberAccount;

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

            int numberAccount =0;

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

                if (AccountBank.listNumbersAccounts.contains(accountNumber)) {

                    int indexNameAccount = AccountBank.listNumbersAccounts.indexOf(numberAccount);
                    int numberAccountGenereted = AccountBank.listNumbersAccounts.get(indexNameAccount+1);
                    String nameAccount = AccountBank.listNamesAccounts.get(indexNameAccount+1);

                    System.out.println("Account find: ");
                    System.out.printf("Number Account: %d%n", numberAccountGenereted);
                    System.out.printf("Name: %s%n", nameAccount);

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
                System.out.print("Write your first name: ");
                String firstName = sc.next();
                System.out.println("Loading...");

                try {
                    Thread.sleep(3500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                try {

                    int numberAccountGenerated = GenerateNumberAccount.generateNumberAccount();
                    AccountBank.listNamesAccounts.add(firstName);
                    AccountBank.listNumbersAccounts.add(numberAccountGenerated);
                    System.out.println("Account saved with success.");
                    System.out.printf("Save your account number: %d%n", numberAccountGenerated);

                } catch (Exception e) {
                    System.out.printf("Ops, an error has occurred: %s", e);
                }
            }

        } while (exit != 0);

    }

}