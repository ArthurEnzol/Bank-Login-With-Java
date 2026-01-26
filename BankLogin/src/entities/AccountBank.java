package entities;

import entities.enums.StatusErrors;

import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;

public class AccountBank {

    private int numberAccount;
    private String nameTitleAccount;
    private double sale;

    public static ArrayList<Integer> listNumbersAccounts = new ArrayList<>();
    public static ArrayList<String> listNamesAccounts = new ArrayList<>();

    public AccountBank(String nameTitleAccount, double deposity){
        this.nameTitleAccount = nameTitleAccount;
    }

    public String getNameTitleAccount() {
        return nameTitleAccount;
    }

    public int getNumberAccount() {
        return numberAccount;
    }
}