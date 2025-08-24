/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritancepolymorphism;

/**
 *
 * @author T440s
 */
public class InheritancePolymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   System.out.println("--- INHERITANCE & POLYMORPHISM ---");

        System.out.println("\n1. Single Inheritance (Cat extends Animal)");
        Cat myCat = new Cat();
        myCat.eat();
        myCat.meow();

        System.out.println("\n2. Hierarchical Inheritance (Dog and Cat extend Animal)");
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();
        myCat.eat();
        myCat.meow();

        System.out.println("\n3. Abstract Class (Shape with abstract area method)");
        Shape1 myCircle = new Circle1(10);
        Shape1 myRectangle = new Rectangle1(5, 8);
        System.out.println("Area of circle: " + myCircle.getArea());
        System.out.println("Area of rectangle: " + myRectangle.getArea());

        System.out.println("\n4. Multiple Inheritance with Interfaces (SmartPhone implements Camera and Phone)");
        SmartPhone mySmartPhone = new SmartPhone();
        mySmartPhone.takePicture();
        mySmartPhone.makeCall();
        mySmartPhone.sendText();

        System.out.println("\n5. Dynamic Method Dispatch");
        Vehicle myVehicle = new Car2();
        myVehicle.drive();
        myVehicle = new Bicycle();
        myVehicle.drive();
    }
}

class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

abstract class Shape1 {
    abstract double getArea();
}

class Circle1 extends Shape1 {
    double radius;
    Circle1(double radius) {
        this.radius = radius;
    }
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle1 extends Shape1 {
    double length, width;
    Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    double getArea() {
        return length * width;
    }
}

interface Camera {
    void takePicture();
}

interface Phone {
    void makeCall();
    void sendText();
}

class SmartPhone implements Camera, Phone {
    @Override
    public void takePicture() {
        System.out.println("Taking a picture.");
    }
    @Override
    public void makeCall() {
        System.out.println("Making a call.");
    }
    @Override
    public void sendText() {
        System.out.println("Sending a text message.");
    }
}

class Vehicle {
    void drive() {
        System.out.println("Vehicle is driving.");
    }
}

class Car2 extends Vehicle {
    @Override
    void drive() {
        System.out.println("Car is driving.");
    }
}

class Bicycle extends Vehicle {
    @Override
    void drive() {
        System.out.println("Bicycle is pedaling.");
    }
}

