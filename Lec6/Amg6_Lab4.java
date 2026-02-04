package Lec6;

import java.util.ArrayList;

public class Amg6_Lab4 {
    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<>();
        
        city.add("DaNang");
        city.add("HaNoi");
        city.add("HoChiMinh");
        city.add("HaiPhong");
        city.add("CanTho");
        
        if(city.contains("Danang")){
            System.out.println("Trong danh sach co London");
        }else{
            System.out.println("Trong danh sach khong co London");
        }
    }
}
    