package com.mycompany.agm6_lab1;

import java.util.ArrayList;

public class Amg6_Lab3 {
    public static void main(String[] args) {
        ArrayList<Double> prices = new ArrayList<>();
    
        prices.add(21.990);
        prices.add(17.550);
        prices.add(24.490);
        prices.add(89.990);
        prices.add(10.440);
        prices.add(5.550);
        
        System.out.println("Danh sach gia");
        for(int i = 0; i<prices.size(); i++){
            System.out.println(prices.get(i));
        }
    }
}
