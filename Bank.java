package arrays.arraylists.bankApp;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> list1;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.list1 = new ArrayList<Branch>();
    }

    public String getBankName() {
        return bankName;
    }
    
    public void addBranch(String name) {
         this.list1.add(new Branch(name));
    }
    public void fillCustomer(String branchName,String customerName,double initialAmount) {
        Branch tempBranch = findBranch(branchName);
        if(tempBranch!=null){
            tempBranch.newCustomer(customerName, initialAmount);
        }
    }
    public void fillTransacton(String branchName,String customerName,double amount) {
        Branch tempBranch = findBranch(branchName);
        if(tempBranch!=null){
            tempBranch.addCustomerTransaction(customerName, amount);
        }
    }
    private Branch findBranch(String name){
        for(int i=0;i<list1.size();i++){
            Branch foundBranch = list1.get(i);
            if(foundBranch.getBranchName().equals(name))
            return foundBranch;
        }
        return null;
    }
    public void listCustomers(String branchName, boolean showTransactions) {
        Branch a=findBranch(branchName);
        if(a!=null){
            System.out.println("customers in the "+a.getBranchName()+" branch are: ");
            ArrayList <Customers> aCustomers = a.getBranch1();
            for(int i=0;i<aCustomers.size();i++){
                Customers b = aCustomers.get(i);
                System.out.println(b.getName()+" ["+(i+1)+"]");
                if(showTransactions){
                    ArrayList<Double> listTransactions = b.getTransactions();
                    System.out.println("transactions for this customer are: ");
                    for(int j=0;j<listTransactions.size();j++){
                        System.out.println(listTransactions.get(j));
                    } 
                }
            }
        }
    }
}