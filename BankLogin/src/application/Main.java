package application;

import java.util.Scanner;
import util.CreateAccount;
import util.verifiers.HaveAccount;
import util.LoginAccount;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean haveAccount, login, create;
        int exit = 1;

        do {

            haveAccount = HaveAccount.haveAccount(sc);

            if (haveAccount) {
                login = LoginAccount.login(sc);
                if (!login) {
                    create = CreateAccount.createAccount(sc);
                }
            } else {
                create = CreateAccount.createAccount(sc);
            }

        } while (exit != 0);

    }

}