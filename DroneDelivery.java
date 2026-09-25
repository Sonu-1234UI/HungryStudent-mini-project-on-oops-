public class DroneDelivery extends Delivery {

    @Override
    public void deliver(String foodName) {
        System.out.println("Delivery Method: Drone");
        System.out.println("Your food is flying to you");
        System.out.println("Your " + foodName + " is on the way!");
    }
}