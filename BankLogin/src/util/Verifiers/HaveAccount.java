package util.Verifiers;

import java.util.InputMismatchException;
import java.util.Scanner;
import entities.enums.StatusErrors;

public class HaveAccount {

    public static boolean haveAccount(Scanner sc) {

        StatusErrors statusErrors = StatusErrors.SUCCESS;
        String resp;

        do {

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

        } while (true);

        return false;

    }
}
