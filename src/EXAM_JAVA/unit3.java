package EXAM_JAVA;


//Anonymous object=>object without reference
/*Data d=new Date();
int a=d.getYear();
int a=new Date().getYear();*/


//Anonymous class=>classes without name
/*Thread thread=new Thread(new Runnable() {
    @Override
    public void run() {
        //Thread logic
    }
});
thread.start();*/




//Functional Intefaces
//interface contains only one abstract method. this method is called functional method
// and any number of default and static


/*
import java.util.function.Function;
interface calculator{
    int sum(int a, int b);
}
public class unit3{
    public static void main(String[] args) {
        calculator c= (a,b)->a+b;
        System.out.println(c.sum(10,20));
    }
}
*/



//Functional interface with default
/*
interface interf{
    public abstract void m1();
    default void m2(){
        System.out.println("hello");
    }
}*/




//Default method in interface
/* interface MyInterface {
    // Abstract method
    void abstractMethod();

    // Default method
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }
}

class MyClass implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Implemented abstract method.");
    }
}

public class unit3 {
    public static void main(String[] args) {
        // Create an instance of MyClass
        MyClass myClass = new MyClass();
        // Call the default method using the instance
        myClass.defaultMethod();
        // Call the abstract method using the instance
        myClass.abstractMethod();
    }
}*/






//STATIC METHOD IN INTERFACE

/*
interface MyInterface {
    // Abstract method
    void abstractMethod();

    // Default method
    static void staticmethod() {
        System.out.println("This is a default method.");
    }
}

class MyClass implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Implemented abstract method.");
    }
}

public class unit3 {
    public static void main(String[] args) {
        // Create an instance of MyClass
        MyClass myClass = new MyClass();

        //static method would be invoked by interface only
        MyInterface.staticmethod();

        // Call the abstract method using the instance
        myClass.abstractMethod();
    }
}
*/


//Sealed classes and sealed interfaces
/*public sealed class unit3 permits Circle,Square,Rectangle{

}*/


//LAMBDA FUNCTION
//more readable code when dealing with functional interfaces

/*interface calculator{
    int sum(int a, int b);
}
public class unit3{
    public static void main(String[] args) {
        calculator c= (a,b)->a+b;
        System.out.println(c.sum(10,20));
    }
}*/



//METHOD REFERENCE
//Reference to a static method

/*interface A{
    void sum(int a, int b);
}
class B{
    static void add(int x, int y){
        int c=x+y;
        System.out.println(c);
    }
}

public  class unit3 {
    public static void main(String[] args) {
        A a=B::add;
        a.sum(10,20);
    }
}*/



//REFRENCE TO A INSTANCE METHOD
/*Interface A{
    void sum(int a, int b);
}
class B{
    void add(int x, int y){
        int c=x+y;
        System.out.println(c);
    }
}

public  class unit3 {
    public static void main(String[] args) {
        B b=new B();
        A a=b::add;
        a.sum(10,20);
    }
}*/



//REFERNCE TO A CONSTRUCTOR
/*interface A{
    void sum(int a, int b);
}
class B{
    B(int x, int y){
        int c=x+y;
        System.out.println(c);
    }
}

public  class unit3 {
    public static void main(String[] args) {
        A a=B::new;
        a.sum(10,20);
    }
}*/


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Base64;

//BASE 64 ENCODE AND DECODE IN JAVA
/*public class unit3 {
    public static void main(String[] args) {
        String str="Example of base 64 conversion";
        byte[] b=str.getBytes();
        //convert into base64
        String base64= Base64.getEncoder().encodeToString(b);
        System.out.println(base64);

        //convert base 64 to binary
        byte[] decodebyte=Base64.getDecoder().decode(base64);
        String s=new String(decodebyte);
        System.out.println(s);
    }
}*/


//TRY WITH RESOURCES

/*class unit3{
    public static void main(String[] args) {
        BufferedReader bfr=null;
        try{
            bfr=new BufferedReader(new FileReader("a50.java"));
            while(true){
                String line= bfr.readLine();
                if(line==null) break;
                System.out.println(line);
            }
        }catch (Exception e){
            System.out.println("exe");
        }finally {
            if(bfr!=null) bfr.close();
        }
    }
}*/

//comparator in java
/*import java.util.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }
}

class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.age, p2.age);
    }
}

public class unit3 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35)
        );

        System.out.println("Before sorting: " + people);

        Collections.sort(people, new AgeComparator());

        System.out.println("After sorting by age: " + people);
    }
}
*/




