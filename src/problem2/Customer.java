package problem2;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;
    private Bank bank;

    public Customer(String name, Bank bank) {
        this.name = name;
        this.bank = bank;
        bank.addCustomer(this);
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(double transaction) {this.transactions.add(transaction);}
    public ArrayList<Double> getTransactions() {return transactions;}

    public String getName() {return name;}
}
