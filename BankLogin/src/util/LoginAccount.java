package util;

import entities.AccountBank;
import entities.enums.StatusErrors;
import util.verifiers.QuantitysDigits;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoginAccount {

    public static boolean login(Scanner sc) {

        StatusErrors statusErrors = StatusErrors.ERROR;
        int accountNumber, indexAccountNumber;
        int attempts = 0;
        String accountName = "", resp = "S";
        boolean quantityDigitsOfAccountNumber;

        while (statusErrors == StatusErrors.ERROR){

            try {

                    System.out.println("Press enter for login. ");
                    sc.nextLine();
                while (true) {

                    if (attempts >= 3) {

                        System.out.print("Do you actually have an account created [Y/N]?");
                        resp = sc.next().toUpperCase();

                        switch (resp) {
                            case "N":
                                System.out.println("Okay, I'll redirect you...");
                                Thread.sleep(5000);
                                return false;
                        }

                    }
                    System.out.print("Account number: ");
                    accountNumber = sc.nextInt();

                    quantityDigitsOfAccountNumber = QuantitysDigits.quantityDigits(accountNumber);

                    try {
                        if (AccountBank.listNumbersAccounts.contains(accountNumber)) {

                            indexAccountNumber = AccountBank.listNumbersAccounts.indexOf(accountNumber);
                            accountName = AccountBank.listNamesAccounts.get(indexAccountNumber);
                            accountNumber = AccountBank.listNumbersAccounts.get(indexAccountNumber);

                            if (quantityDigitsOfAccountNumber) {

                                System.out.println("Account find...");
                                Thread.sleep(3500);
                                System.out.printf("Number: %d Name: %s%n", accountNumber, accountName);
                                return true;

                            }
                        } else {
                            attempts++;
                            System.out.printf("Attempts: %d%n", attempts);
                        }
                    } catch (Exception e) {
                        sc.nextLine();
                        throw new RuntimeException(e);
                    }
                }



            } catch (InputMismatchException e) {
                System.out.println("Write just 8 numbers in your account number.");
                statusErrors = StatusErrors.ERROR;

            } catch (RuntimeException x) {
                System.out.println("Ops,an error occurred while e were trying to log in to your account: " + x);
                statusErrors = StatusErrors.ERROR;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

        return false;
    }

}
