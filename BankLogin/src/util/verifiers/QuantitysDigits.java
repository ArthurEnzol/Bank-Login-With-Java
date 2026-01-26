package util.verifiers;

import entities.enums.StatusErrors;

public class QuantitysDigits {

    public static boolean quantityDigits(int accountNumber) {

        try {

            String accountNumberString = String.valueOf(accountNumber);
            int quantityDigits = accountNumberString.length();

            if (quantityDigits == 8) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            System.out.println("Ops,an error occurred while checking the number of digits in the account: " + e);
            return false;
        }



    }

}
