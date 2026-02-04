package Lec6;

import java.util.ArrayList;

public class Agm6_Lab1 {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        
        for(int i=1; i<=10; i++){
            number.add(i);
        }
        
        System.out.println("Cac phan tu trong ArrayList");
        for(int i = 0; i < number.size(); i++){
            System.out.print(number.get(i) + " ");
        }
    }
}
