package problem2;

public class Main {
    public static void main(String[] args) {

        Bank campusBank = new Bank("Campus Bank");

        System.out.println("Adding Customers...");
        Customer c1 = new Customer("Adam", campusBank);
        c1.addTransaction(500);
        Customer c2 = new Customer("Ahmed", campusBank);
        c2.addTransaction(1000);
        Customer c3 = new Customer("Mohammed", campusBank);
        c3.addTransaction(250);

        campusBank.addCustomer(c1);
        campusBank.addCustomer(c2);
        campusBank.addCustomer(c3);

        System.out.println("\nAdding Transactions...");

        campusBank.processTransaction(c1, 200.00);
        campusBank.processTransaction(c2, -50.00);
        campusBank.processTransaction(c3, -200.00);
        campusBank.processTransaction(c2, 50.00);

        System.out.println("\nPrinting statements...");
        campusBank.printStatement(c1);
        System.out.println("-------------------------");
        campusBank.printStatement(c2);
        System.out.println("-------------------------");

    }
}