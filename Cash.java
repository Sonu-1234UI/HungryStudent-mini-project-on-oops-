public class Cash extends Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Payment Method: Cash");
        System.out.println("Cash payment successful!");
    }
}