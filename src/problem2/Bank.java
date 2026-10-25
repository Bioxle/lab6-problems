package problem2;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Bank {

    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer c) {
        customers.add(c);
    }

    public void processTransaction(Customer c, double transaction) {
        if (!findCustomer(c)) {return;}
        c.addTransaction(transaction);
    }

    public void printStatement(Customer c) {
        if (!findCustomer(c)) {return;}
        System.out.println("================ Bank Statement ===============");
        System.out.println("Customer : " + c.getName());
        System.out.println("\nTransactions: \n");
        for (double trans : c.getTransactions()) {
            System.out.print(trans + ", ");
        }
        System.out.println();
    }


    // ==================
    //
    // Helper Methods
    //
    // ==================

    private boolean findCustomer(Customer c) {
        for (Customer customer : customers) {
            if (customer.equals(c)) {
                return true;
            }
        }

        return false;
    }
}
