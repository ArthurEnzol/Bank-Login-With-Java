package util;

import entities.AccountBank;
import entities.enums.StatusErrors;
import entities.AccountBank;
import java.util.Scanner;

public class AddAccount {

    public StatusErrors addAccount(AccountBank accountBank, Scanner sc) {

        try {

            if (AccountBank.listNamesAccounts.contains(accountBank.nameTitleAccount) || listNumbersAccounts.contains(accountBank.numberAccount)) {
                System.out.printf("Ops, this account already exists: %d %s%n", accountBank.numberAccount, accountBank.nameTitleAccount);
                throw new RuntimeException();
            } else {
                AccountBank.listNamesAccounts.add(accountBank.nameTitleAccount);
            }

            AccountBank.listNumbersAccounts.add(accountBank.numberAccount);
            return StatusErrors.SUCCESS;

        } catch (RuntimeException x) {

            System.out.println("Try to log in to that account");
            return StatusErrors.ERROR;

        } catch (Exception e) {

            System.out.printf("Ops, an error occurred in 'addAccont': %s", e);
            sc.nextLine();
            return StatusErrors.ERROR;

        }

    }

}
