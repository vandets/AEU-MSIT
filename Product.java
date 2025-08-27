class Product {
    // Private fields (Encapsulation)
    private String name;
    private double price;
    private int quantity;

    // Constructor to initialize fields
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Public methods
    public void displayInfo() {
        System.out.println("Product: " + name + ", Price: $" + price + ", Quantity: " + quantity);
    }

    public void updatePrice(double newPrice) {
        if (newPrice > 0) {
            this.price = newPrice;
            System.out.println("Price updated to $" + newPrice);
        } else {
            System.out.println("Invalid price!");
        }
    }

    public boolean isInStock() {
        return quantity > 0;
    }

    // Getter methods for accessing private fields
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Main method to test functionality
    public static void main(String[] args) {
        // Create 3 product objects
        Product p1 = new Product("Laptop", 1200.50, 5);
        Product p2 = new Product("Headphones", 50.00, 0);
        Product p3 = new Product("Mouse", 25.00, 10);

        // Test all methods
        p1.displayInfo();
        p2.displayInfo();
        p3.displayInfo();

        System.out.println("Is " + p2.getName() + " in stock? " + p2.isInStock());

        p1.updatePrice(1300.00);
        p1.displayInfo();
    }
}
