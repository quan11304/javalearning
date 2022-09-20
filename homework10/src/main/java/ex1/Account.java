package ex1;

import java.util.ArrayList;

public class Account implements IAccount {
    public static ArrayList<Account> alaccount = new ArrayList<>();
    protected String name, email;
    protected int accountNumber;
    protected double accountBalance;

    public Account(String name, String email, int accountNumber, double accountBalance) {
        this.name = name;
        this.email = email;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public void recharge(double amount) {
        this.accountBalance += amount;
    }

    @Override
    public void changeEmail(String email) {
        this.email = email;
    }

    @Override
    public void displayInfo() {
        for (Account temp: alaccount) {
            System.out.printf("Name: %s | Email: %s | Account No.: %d | Balance: %.2f\n",
                    temp.name,temp.email,temp.accountNumber,temp.accountBalance);
        }
    }
}
