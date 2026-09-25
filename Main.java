import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("        HUNGRY STUDENT APP");
        System.out.println("     College Food Delivery System");
        System.out.println("======================================");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student ID: ");
        String studentId = sc.nextLine();

        System.out.print("Enter Wallet Balance: Rs.");
        double balance = sc.nextDouble();

        System.out.print("Enter Hunger Level (0-100): ");
        int hunger = sc.nextInt();

        Student student = new Student(name, studentId, balance, hunger);

        System.out.println("\n----------- FOOD MENU -----------");
        System.out.println("1. Biryani - Rs.150");
        System.out.println("2. Pizza   - Rs.200");
        System.out.println("3. Burger  - Rs.120");

        System.out.print("Choose Food: ");
        int choice = sc.nextInt();

        String foodName;
        double price;

        switch (choice) {
            case 1:
                foodName = "Biryani";
                price = 150;
                break;

            case 2:
                foodName = "Pizza";
                price = 200;
                break;

            case 3:
                foodName = "Burger";
                price = 120;
                break;

            default:
                System.out.println("Invalid food choice.");
                sc.close();
                return;
        }

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        FoodOrder order = new FoodOrder(101, foodName, price, quantity);

        System.out.println("\n----------- ORDER DETAILS -----------");

        System.out.println("Student: " + student.getName());
        order.showOrder();

        System.out.println("\n----------- ORDER PROCESS -----------");

        if (!student.orderFood(order)) {
            student.showBalance();
            sc.close();
            return;
        }

        System.out.println("\nChoose Payment Method:");
        System.out.println("1. UPI");
        System.out.println("2. Credit Card");
        System.out.println("3. Cash");

        System.out.print("Enter choice: ");
        int paymentChoice = sc.nextInt();

        Payment payment;

        switch (paymentChoice) {
            case 1:
                payment = new UPI();
                break;

            case 2:
                payment = new CreditCard();
                break;

            case 3:
                payment = new Cash();
                break;

            default:
                System.out.println("Invalid payment method.");
                sc.close();
                return;
        }

        payment.pay(order.calculateTotal());

        System.out.println("\nChoose Delivery Method:");
        System.out.println("1. Bike");
        System.out.println("2. Drone");

        System.out.print("Enter choice: ");
        int deliveryChoice = sc.nextInt();

        Delivery delivery;

        switch (deliveryChoice) {
            case 1:
                delivery = new BikeDelivery();
                break;

            case 2:
                delivery = new DroneDelivery();
                break;

            default:
                System.out.println("Invalid delivery method.");
                sc.close();
                return;
        }

        System.out.println();
        delivery.deliver(order.getFoodName());

        System.out.println("\n----------- FINAL STATUS -----------");
        student.showBalance();

        System.out.println("Thank you for using Hungry Student!");

        sc.close();
    }
}