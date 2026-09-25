public class BikeDelivery extends Delivery {

    @Override
    public void deliver(String foodName) {
        System.out.println("Delivery Method: Bike");
        System.out.println("Your food is coming by bike");
        System.out.println("Your " + foodName + " is on the way!");
    }
}