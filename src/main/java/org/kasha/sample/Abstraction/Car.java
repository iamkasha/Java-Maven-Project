package Abstraction;

public class Car extends Vehicle {
    public void move(){
        System.out.println("driving a car");
    }
}
class bmw extends Car{
    public void move(){
        System.out.println("Driving bmw");
    }
}
