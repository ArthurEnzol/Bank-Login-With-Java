package util;

import java.util.InputMismatchException;
import java.util.Scanner;
import entities.enums.StatusErrors;

public class HaveAccount {

    public static boolean haveAccount(Scanner sc) {

        StatusErrors statusErrors = StatusErrors.ERROR;
        String resp;

        while (statusErrors == StatusErrors.ERROR) {

            try {

                System.out.print("You have a account? [Y/N] ");
                resp = sc.next().toUpperCase();
                statusErrors = StatusErrors.SUCCESS;

                if (resp.equals("Y") || resp.equals("N")) {

                    switch (resp) {
                        case "Y":
                            return true;
                        case "N":
                            return false;
                    }
                    break;

                } else {
                    throw new InputMismatchException();
                }

            } catch (InputMismatchException e) {

                System.out.println("Just write Y or N...");
                sc.nextLine();
                statusErrors = StatusErrors.ERROR;

            }

        }

        return false;
    }
}
