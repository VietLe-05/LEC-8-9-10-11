package Lec9_Inheritance.RuntimePolymorphism;

public class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Meow Meow");
    }
}
