package util;

import entities.AccountBank;
import entities.GenerateNumberAccount;
import entities.enums.StatusErrors;

import java.util.Scanner;

public class CreateAccount {

    public static boolean createAccount(Scanner sc) {

        String accountName;
        StatusErrors statusErrors = StatusErrors.ERROR;
        int idAccount;

        try {

            while (statusErrors == StatusErrors.ERROR){

                System.out.println("Follow the step-by-step guide to create an account: ");
                System.out.print("Write your first name: ");
                accountName = sc.next();
                System.out.println("Loading...");

                try {
                    Thread.sleep(3500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (AccountBank.listNamesAccounts.contains(accountName)) {
                    System.out.println("Sorry, this account already exist: ");
                    System.out.println("Restarting program...");
                    Thread.sleep(2000);
                }
                else {
                    try {
                        AccountBank.listNamesAccounts.add(accountName);
                        idAccount = GenerateNumberAccount.generateNumberAccount();
                        AccountBank.listNumbersAccounts.add(idAccount);

                        System.out.println("Account creating...");
                        Thread.sleep(2500);
                        System.out.println("========================");
                        System.out.println("Account data: ");
                        System.out.printf("Name: %s%n ID: %d%n", accountName, idAccount);
                        System.out.println("========================");

                        return true;
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }

            }



        } catch (RuntimeException x) {

            System.out.println("Try to log in to that account");
            return false;

        } catch (Exception e) {

            System.out.printf("Ops, an error occurred in 'addAccont': %s", e);
            sc.nextLine();
            return false;

        }

        return false;

    }

}
