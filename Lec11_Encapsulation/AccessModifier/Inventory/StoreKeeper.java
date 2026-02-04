package Lec11_Encapsulation.AccessModifier.Inventory;

public class StoreKeeper {

    public void checkItem() {
        Item item = new Item();
        System.out.println("--- StoreKeeper ---");
        System.out.println("Stock: " + item.stockCount);
        System.out.println("Promo: " + item.promoCode);
        System.out.println("Name: " + item.itemName);
    }
}
