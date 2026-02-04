package Lec9_Inheritance.MethodOverriding;

public class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Meow Meow");
    }
}
