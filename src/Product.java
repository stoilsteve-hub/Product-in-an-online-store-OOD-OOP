public class Product {

    // attributes
    private int productId;
    private String name;
    private String description;
    private double price;
    private int quantityInStock;
    private String category;



    // constructor
    public Product(int productId, String name, String description,
                   double price, int quantityInStock, String category) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityInStock = quantityInStock;
        this.category = category;
    }

    // Getters and setters
    public int getProductId() {
        return productId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        if (quantityInStock >= 0) {
            this.quantityInStock = quantityInStock;
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    // Reduce stock when a purchase happens
    public boolean reduceStock(int amount) {
        if (amount > 0 && amount <= quantityInStock) {
            quantityInStock -= amount;
            return true;
        }
        return false; // not enough stock or invalid amount
    }

    // Increase stock when new items arrive
    public void increaseStock(int amount) {
        if (amount > 0) {
            quantityInStock += amount;
        }
    }

    // Apply discount as a percentage (e.g. 10 means 10%)
    public void applyDiscount(double percent) {
        if (percent > 0 && percent < 100) {
            double discountAmount = price * (percent / 100.0);
            price -= discountAmount;
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantityInStock=" + quantityInStock +
                ", category='" + category + '\'' +
                '}';
    }

}
