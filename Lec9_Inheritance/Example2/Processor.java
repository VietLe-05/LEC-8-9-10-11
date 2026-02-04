package Lec9_Inheritance.Example2;

class Processor {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
        System.out.println("Cat ID: " + cat.catID);
        cat.catchMouse();
    }
}
