
class Customer extends Person {
    int cusNo;
    int mile;

    public Customer(String name, String addr, String phone, int cusNo, int mile) {
        super(name, addr, phone);
        this.cusNo = cusNo;
        this.mile = mile;
    }

    public void printCust() {
        System.out.println("Customer Information:");
        System.out.println("Customer No: " + cusNo);
        System.out.println("Name: " + name);
        System.out.println("Mileage: " + mile);
        System.out.println("Address: " + addr);
        System.out.println("Phone: " + phone);
    }
}

