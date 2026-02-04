package Lec11_Encapsulation.AccessModifier.Inventory;

public class Item {

    private double costPrice = 50.0;
    int stockCount = 100;
    protected String promoCode = "VIP";
    public String itemName = "Laptop";

    public void showDetails() {
        System.out.println("--- Inside Item ---");
        System.out.println("Cost: " + costPrice);
        System.out.println("Stock: " + stockCount);
        System.out.println("Promo: " + promoCode);
        System.out.println("Name: " + itemName);
    }
}
