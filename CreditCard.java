public class CreditCard extends Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Payment Method: Credit Card");
        System.out.println("Payment successful through Credit Card!");
    }
}