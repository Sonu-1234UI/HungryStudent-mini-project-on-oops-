public class UPI extends Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Payment Method: UPI");
        System.out.println("Payment successful through UPI!");
    }
}