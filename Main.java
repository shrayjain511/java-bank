package arrays.arraylists.bankApp;

public class Main {
    public static void main(String[] args) {
        Bank mybank = new Bank("state bank");
        mybank.addBranch("rohini");
        mybank.fillCustomer("rohini", "shrayansh", 5000);
        mybank.fillCustomer("rohini", "shray", 10000);
        mybank.fillCustomer("rohini", "ray", 1000.50);

        mybank.addBranch("pitampura");
        mybank.fillCustomer("pitampura", "shray", 2000);
        mybank.fillCustomer("pitampura", "shrayansh", 7000);
        
        mybank.fillTransacton("pitampura", "shrayansh", 500);
        mybank.fillTransacton("pitampura", "shrayansh", 2300);
        mybank.fillTransacton("pitampura", "shray", 2100);

        mybank.listCustomers("pitampura", false);
    }
}