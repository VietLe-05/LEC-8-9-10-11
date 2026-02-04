package com.mycompany.agm6_lab1;

import java.util.ArrayList;

public class Agm6_Lab2 {
    public static void main(String[] args){
        ArrayList<String> colors = new ArrayList<>();
        
        colors.add("Xam");
        colors.add("Xanh la");
        colors.add("Do");
        colors.add("Xanh bien");
        colors.add("Den");
        
        colors.set(1, "Vang");
        
        System.out.println("Danh sach da cap nhat:");
        for(int i=0; i < colors.size(); i++){
            System.out.println(colors.get(i));
        }
    }
}
