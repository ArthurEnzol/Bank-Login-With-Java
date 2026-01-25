package util.Verifiers;

import entities.enums.StatusErrors;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoginAccount {

    public static boolean login(Scanner sc) {

        StatusErrors statusErrors = StatusErrors.ERROR;

        while (statusErrors == StatusErrors.ERROR){

            try {

                System.out.println("Press enter for login. ");
                sc.nextLine();
                System.out.print("Account number: ");
                int accountNumber = sc.nextInt();
                int quantityDigitsOfAccountNumber = String.valueOf(accountNumber).length();

            } catch (InputMismatchException e) {
                System.out.println("Write just numbers in your account number.");
                statusErrors = StatusErrors.ERROR;
            }

        }

        return false;
    }

}
