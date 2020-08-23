package arrays.arraylists.bankApp;

import java.util.ArrayList;
//import java.util.Scanner;

public class Branch {
    
   // private static Scanner scanner = new Scanner(System.in);

    private String branchName;
    private ArrayList<Customers> branch1;
    
    public  Branch(String branchName) {
        this.branchName = branchName;
        this.branch1 = new ArrayList<Customers>();
    }
    public String getBranchName() {
        return branchName;
    }
    public ArrayList<Customers> getBranch1() {
        return branch1;
    }
    public void newCustomer(String name,Double amount) {
        this.branch1.add(new Customers(name,amount));
    }
    // public void addCustomer(Customers newCustomer) {
    //     System.out.println("enter customer name ");
    //     String a = scanner.nextLine();
    //     System.out.println("enter initial amount ");
    //     Double b = scanner.nextDouble();
    //     Customers temp = Customers.createCustomers(a, b);
    //     this.branch1.add(temp);
    // }
    public void addCustomerTransaction(String name,Double amount){
        Customers temp = findCustomer(name);
        if(temp !=null){
            temp.addTransaction(amount);
        }
    }
    private Customers findCustomer(String customerName) {
        for(int i=0;i<branch1.size();i++){
            if(branch1.get(i).getName()==customerName){
                Customers foundCustomer = branch1.get(i);
                return foundCustomer;
            }
        }
        return null;
        
    }
}