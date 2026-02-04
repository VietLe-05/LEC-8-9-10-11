package Lec6;

import java.util.ArrayList;
import java.util.Random;
public class Amg6_Lab5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100) + 1);
        }

        System.out.println("Danh sách ban đầu:");
        System.out.println(numbers);
        numbers.remove(3);
        System.out.println("Danh sách sau khi xóa phần tử ở index 3:");
        System.out.println(numbers);
    }
}
