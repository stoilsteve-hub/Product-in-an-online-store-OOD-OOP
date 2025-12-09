public class Main {
    public static void main(String[] args) {

        //product object
        Product p = new Product(
                1,
                "Laptop",
                "A powerful gaming laptop",
                1200.0,
                10,
                "Electronics"
        );

        System.out.println("Initial product:");
        System.out.println(p);

        // Apply discount
        p.applyDiscount(10); // 10% discount

        // Reduce stock
        p.reduceStock(3);

        // Print updated product
        System.out.println("\nAfter discount and stock reduction:");
        System.out.println(p);
    }
}
