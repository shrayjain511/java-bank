package arrays.arraylists.bankApp;

import java.util.ArrayList;

public class Customers {
    private ArrayList<Double> transactions;
    private String name;

    public String getName() {
        return name;
    }
    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public Customers(String name,Double initialTransaction) {
       
        this.name = name;
        this.transactions = new ArrayList<Double>();
        transactions.add(initialTransaction); //using arraylist feature to add
    }

    public static Customers createCustomers(String name,Double amount) {
       return new Customers(name, amount);
    }
    public void addTransaction(Double newAmount){
        this.transactions.add(newAmount);
        
    }
}