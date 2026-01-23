package entities;

import java.lang.Math;
import java.util.ArrayList;

public class AccountBank {

    private int numberAccount;
    private String nameTitleAccount;
    private double sale;
    public static ArrayList<Integer> listNumbersAccounts = new ArrayList<>();
    public static ArrayList<String> listNamesAccounts = new ArrayList<>();

    public AccountBank(String nameTitleAccount, double deposity){
        this.nameTitleAccount = nameTitleAccount;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public String getNameTitleAccount() {
        return nameTitleAccount;
    }

    public void setNameTitleAccount(String nameTitleAccount) {
        this.nameTitleAccount = nameTitleAccount;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }





}