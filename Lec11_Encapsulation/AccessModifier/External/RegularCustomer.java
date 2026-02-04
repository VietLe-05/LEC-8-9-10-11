
package Lec11_Encapsulation.AccessModifier.External;

import Lec11_Encapsulation.AccessModifier.Inventory.Item; 

public class RegularCustomer {
    public void browseItem() {
        Item item = new Item();
        System.out.println("--- Regular Customer ---");
        // System.out.println(item.costPrice);  // Lỗi
        // System.out.println(item.stockCount); // Lỗi
        // System.out.println(item.promoCode);  // Lỗi (Không extends)
        
        // Chỉ thấy Public
        System.out.println("Name: " + item.itemName); 
    }
}