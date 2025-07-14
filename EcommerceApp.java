public class EcommerceApp {
    public static void main(String[] args) {
        ElectronicProduct product1 = new ElectronicProduct();
        product1.setProductId(3214);
        product1.setName("AC");
        product1.setManufacturer("LG");
        product1.setPrice(50000);
        product1.setProductDescription("3 × 1.5‑ton LG AC");
        product1.setWarranty(2);
        product1.setRatings(3);

        ClothingProduct product2 = new ClothingProduct();
        product2.setProductId(54321);
        product2.setName("Jeans");
        product2.setBrand("NetPlay");
        product2.setFabric("Cotton");
        product2.setPrice(2000);
        product2.setColor("Blue");
        product2.setSize(34);

        System.out.println("Electronic Product Details: " + product1);
        System.out.println("Clothing Product Details: " + product2);
    }
    
}