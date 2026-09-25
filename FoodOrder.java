public class FoodOrder {

    private int orderId;
    private String foodName;
    private double price;
    private int quantity;

    public FoodOrder(int orderId, String foodName, double price, int quantity) {
        this.orderId = orderId;
        this.foodName = foodName;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateTotal() {
        return price * quantity;
    }

    public void showOrder() {

        System.out.println("Order ID: " + orderId);
        System.out.println("Food: " + foodName);
        System.out.println("Price: Rs." + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: Rs." + calculateTotal());

        if (foodName.equalsIgnoreCase("Biryani")) {
            System.out.println("Student has chosen happiness");
        }

        if (quantity > 3) {
            System.out.println("Bro, are you feeding the entire class?");
        }
    }

    public String getFoodName() {
        return foodName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getOrderId() {
        return orderId;
    }
}