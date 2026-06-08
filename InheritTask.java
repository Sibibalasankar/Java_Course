package Basic_java;

// *Single Inheritance* – Practice Problems
// 1.Create a class Employee with a method work().
// Create a class Manager that inherits Employee and adds manage().

// 2.Create a class Vehicle with method fuelType().
// Create Bike as a subclass and add method speed().

// 3.Create a class Person with variables name and age.
// Create Student class that displays student details using inherited data

// *Multilevel Inheritance* – Practice Problems
// 4.Create a class LivingBeing → Human → Teacher
// Each class should have one method.

// 5.Create Animal → Mammal → Dog
// Methods: eat(), walk(), bark().

// 6.Create Company → Department → Employee
// Display company name, department name, and employee name.

/**
class Employee{
    void work(){
        System.out.println("From Employee Class");
    }
}

class Manager extends Employee{
    void manage(){
        System.out.println("From Manager class");
    }
} */

/**

class Vehicle{
    void fuelType(){
        System.out.println("From Vehicle!");
    }
}

class Bike extends Vehicle{
    void speed(){
        System.out.println("From Bike Class!");
    }
}
 */

/**
 * class Person{
 * String name ="ABC" ;
 * int age=123;
 * }
 * 
 * class Student extends Person{
 * void displays(){
 * System.out.println("Name: " + name + "\nAge: " + age);
 * }
 * }
 */
/**
 * class LivingBeing {
 * void show() {
 * System.out.println("LivingBeing");
 * }
 * }
 * 
 * class Human extends LivingBeing {
 * void show() {
 * System.out.println("Human");
 * }
 * }
 * 
 * class Teacher extends Human {
 * void show() {
 * System.out.println("Teacher");
 * }
 * }
 */
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Walking");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Barking");
    }
}

public class InheritTask {
    public static void main(String[] args) {
        // Manager m = new Manager();
        // m.manage();
        // m.work();
        // Bike b = new Bike();
        // b.speed();
        // b.fuelType();
        // Student s =new Student();
        // s.displays();
        // Teacher t = new Teacher();
        // t.show();
        // Dog d = new Dog();
        // d.eat();
        // d.bark();
        // d.walk();

    }
}
