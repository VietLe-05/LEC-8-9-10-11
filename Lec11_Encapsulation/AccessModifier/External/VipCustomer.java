package Lec11_Encapsulation.AccessModifier.External;

import Lec11_Encapsulation.AccessModifier.Inventory.Item;

public class VipCustomer extends Item {

    public void checkPrivileges() {
        System.out.println("--- VIP Customer ---");
        System.out.println("Promo: " + promoCode);
        System.out.println("Name: " + itemName);
    }
}
