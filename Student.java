public class Student {

    private String name;
    private String studentId;
    private double walletBalance;
    private int hungerLevel;

    public Student(String name, String studentId, double walletBalance, int hungerLevel) {
        this.name = name;
        this.studentId = studentId;
        this.walletBalance = walletBalance;
        this.hungerLevel = hungerLevel;
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            walletBalance += amount;
            System.out.println("Money added successfully!");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public boolean orderFood(FoodOrder order) {

        if (hungerLevel > 80) {
            System.out.println("EMERGENCY! Feed the student immediately!");
        }

        double total = order.calculateTotal();

        if (total > walletBalance) {
            System.out.println("Order failed! Not enough wallet balance.");
            return false;
        }

        walletBalance -= total;
        System.out.println("Order placed successfully!");
        return true;
    }

    public void showBalance() {
        System.out.println("Wallet Balance: Rs." + walletBalance);
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }
}