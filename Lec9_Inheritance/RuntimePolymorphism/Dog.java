package Lec9_Inheritance.RuntimePolymorphism;

public class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Barks barks");
    }
}
