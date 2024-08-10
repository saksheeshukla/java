package EXAM_JAVA;
//how to create object or instance of a class
/*class Car{
    String brands;
    String model;
    int year;
    public Car(String brands, String model, int year){
        this.brands= brands;
        this.model=model;
        this.year=year;
    }
    public void displayinfo(){
        System.out.println(brands+""+model);
    }
}
public class unit1{
    public static void main(String[] args) {
        created an object
        Car mycar=new Car("Toyoto","as",2022);
        mycar.displayinfo();
    }
}*/


//USE OF THIS KEYWORD
/*public class unit1{
    private int x;
    private int y;

    public unit1(){
        this(0,0);
    }
    public unit1(int x, int y){
        this.x=x;
        this.y=y;
    }

    public static void main(String[] args) {
        unit1 point1=new unit1();
        unit1 point2=new unit1(3,4);
        System.out.println(point1.y);
        System.out.println(point2.y);
    }
}*/


//SUPER
/*class unit1{
    public unit1(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Dog dog=new Dog();
    }
}
class Dog extends unit1{
    public Dog(){
        super("Dog");
        System.out.println("Dog constructor");
    }
}*/


//OVERLOADING
// Class representing a box
/*class box {
    int x, y, z;  //Dimensions of the box
     Default constructor
    box() {
        x = 2;  //Initialize x with a default value
        y = 3;  //Initialize y with a default value
        z = 2;  //Initialize z with a default value
    }
     //Parameterized constructor (overloading the constructor)
    box(int a, int b, int c) {
        x = a;  //Initialize x with the given value a
        y = b;  //Initialize y with the given value b
        z = c;  //Initialize z with the given value c
    }

     //Method to calculate the volume of the box
    void volume() {
        System.out.println(x * y * z);  //Calculate and print the volume
    }
}

public class unit1{
    public static void main(String[] args) {
         //Object creation using the default constructor
        box b1 = new box();  //Create an instance of Box using the default constructor
        b1.volume(); // Call the volume method to display the volume

         //Object creation using the parameterized constructor
        box b2 = new box(2, 5, 3);  //Create an instance of Box using the parameterized constructor
        b2.volume();//  Call the volume method to display the volume
    }
}*/


//if we have defined function that is already in super class so this is knows as function overriding
//OVERRIDING
/*class A{
    void f1(){
        System.out.println("A1");
    }
    void f2(){
        System.out.println("A2");
    }
}
class B extends A{
    void f2(){
        System.out.println("B1");
    }
    void f3(){
        System.out.println("B2");
    }
}
public class unit1{
    public static void main(String[] args) {
        //jiska object hota usi ke function chalte
        B b=new B();
        b.f1(); A1
        b.f2(); B1
        b.f3(); B2

        A a=b;
        a.f1(); A1
        a.f2(); B1
        a.f3(); error
    }
}*/


//INHERITANCE
 //Superclass (Parent Class)
/*class Person {
    String name;  //Instance variable to hold the name of the person

   //  Method in the superclass
    void f1() {
        System.out.println("Hi");
    }
}

 //Subclass (Child Class)
class Students extends Person {
    String course;  //Instance variable to hold the course of the student
     //Method in the subclass
    void f2() {
        System.out.println("F2");
    }
}

public class unit1 {
    public static void main(String[] args) {
         //Creating an object of the Students class
        Students s = new Students();

        // Assigning values to instance variables
        s.name = "John";  //Setting the name of the student
        s.course = "Computer Science";  //Setting the course of the student

        // Calling methods
        s.f1();  //Calls the f1() method from the Person class
        s.f2();  //Calls the f2() method from the Students class
    }
}*/


//ABSTRACT CLASSES
/*abstract class Animal{
    abstract void makesound();
}
class Dog extends Animal{
    void makesound(){
        System.out.println("Bark");
    }
}

class unit1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makesound();
    }
}*/

//Abstract
/*
abstract class Shape {
    String color;

     //Abstract method (no body)
    public abstract double area();

    // Concrete method (with body)
    public void fill(String color) {
        this.color = color;
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

*/


//DATA HIDING
/*public class unit1{
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}*/


//INTERFACES
/*
interface drawable{
    void draw();
}
interface resizable{
    void resize(int factor);
}

class Image implements drawable, resizable{
    public void draw(){
        System.out.println("drawing");
    }
    public void resize(int factor){
        System.out.println(factor);
    }
}
public  class unit1 {
    public static void main(String[] args) {
        Image img=new Image();
        img.draw();
        img.resize(50);
    }
}*/


/*
Write a Java program to create a Animal interface with a method called
        bark() that takes no arguments and returns void. Create a Dog class that
        implements Animal and overrides speak() to print "Dog is barking".
*/

/*// Define the Animal interface
interface Animal {
    void bark();  // Method with no arguments and returns void
}

// Implement the Animal interface in the Dog class
class Dog implements Animal {
    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }
}

// Main class to test the Dog class
public class AnimalTest {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.bark();  // Output: Dog is barking
    }
}*/


/* Write a Java program to create a class Employee with a method called
calculateSalary(). Create two subclasses Manager and Programmer. In each
subclass, override the calculateSalary() method to calculate and return the salary
based on their specific roles.*/

/*// Define the Employee class with a method to calculate salary
abstract class Employee {
    abstract double calculateSalary();  // Abstract method for salary calculation
}

// Manager class extending Employee
class Manager extends Employee {
    private double baseSalary;
    private double bonus;

    // Constructor to initialize base salary and bonus
    public Manager(double baseSalary, double bonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;  // Salary is base salary plus bonus
    }
}

// Programmer class extending Employee
class Programmer extends Employee {
    private double baseSalary;
    private double overtimePay;

    // Constructor to initialize base salary and overtime pay
    public Programmer(double baseSalary, double overtimePay) {
        this.baseSalary = baseSalary;
        this.overtimePay = overtimePay;
    }

    @Override
    double calculateSalary() {
        return baseSalary + overtimePay;  // Salary is base salary plus overtime pay
    }
}

// Main class to test the Manager and Programmer classes
public class EmployeeTest {
    public static void main(String[] args) {
        Manager manager = new Manager(80000, 10000);
        Programmer programmer = new Programmer(60000, 5000);

        System.out.println("Manager's Salary: $" + manager.calculateSalary());  // Output: Manager's Salary: $90000.0
        System.out.println("Programmer's Salary: $" + programmer.calculateSalary());  // Output: Programmer's Salary: $65000.0
    }
}*/