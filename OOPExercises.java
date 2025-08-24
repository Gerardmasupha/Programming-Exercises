/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oopexercises;

/**
 *
 * @author T440s
 */
public class OOPExercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        System.out.println("--- OBJECT-ORIENTED PROGRAMMING (OOP) ---");

        System.out.println("\n1. Class 'Car' with attributes and methods");
        Car myCar = new Car("Toyota", "Corolla", 2020);
        System.out.println("My car is a " + myCar.getYear() + " " + myCar.getMake() + " " + myCar.getModel());
        myCar.startEngine();
        myCar.stopEngine();

        System.out.println("\n2. Class 'BankAccount' with deposit and withdraw methods");
        BankAccount account = new BankAccount("John Doe", 1000.0);
        System.out.println("Current balance for " + account.getAccountHolder() + ": $" + account.getBalance());
        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(2000.0);
        System.out.println("Final balance: $" + account.getBalance());

        System.out.println("\n3. Constructor overloading in 'Box' class");
        Box box1 = new Box();
        Box box2 = new Box(10.0);
        Box box3 = new Box(5.0, 6.0, 7.0);
        System.out.println("Box1 volume: " + box1.getVolume());
        System.out.println("Box2 volume: " + box2.getVolume());
        System.out.println("Box3 volume: " + box3.getVolume());

        System.out.println("\n4. Method overriding with inheritance");
        Animal animal = new Dog();
        animal.makeSound();

        System.out.println("\n5. Class hierarchy: Shape -> Circle, Rectangle");
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}

class Car {
    String make;
    String model;
    int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void startEngine() {
        System.out.println("The " + make + " engine has started.");
    }

    public void stopEngine() {
        System.out.println("The " + make + " engine has stopped.");
    }

    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
}

class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Withdrawal failed. Insufficient funds or invalid amount.");
        }
    }

    public String getAccountHolder() { return accountHolder; }
    public double getBalance() { return balance; }
}

class Box {
    double width, height, depth;

    public Box() {
        width = height = depth = 1.0;
    }

    public Box(double side) {
        width = height = depth = side;
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getVolume() {
        return width * height * depth;
    }
}

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}

class Shape {
    public double calculateArea() {
        return 0.0;
    }
}

class Circle extends Shape {
    private final double radius;
    public Circle(double radius) { this.radius = radius; }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private final double length;
    private final double width;
    public Rectangle(double length, double width) { this.length = length; this.width = width; }
    @Override
    public double calculateArea() {
        return length * width;
    }
}
