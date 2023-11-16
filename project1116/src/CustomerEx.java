
public class CustomerEx {
    public static void main(String[] args) {
        Customer customer1 = new Customer("미미", "목동", "010-2555-5678", 101, 500);
        Customer customer2 = new Customer("나나", "영등포", "010-5555-8765", 102, 750);

        customer1.printCust();
        System.out.println("------------------------");
        customer2.printCust();
    }
}

