import java.util.*;
//constructor chaining
// Constructor chaining avoids code duplication.
// this() chains constructors within the same class.
// super() chains constructors between parent and child classes.
// Both must be the first statement in a constructor.
class Animal{
 Animal(String name){
     System.out.println("Animal constructor");
     System.out.println(name);
 }
 
}
class Dog extends Animal{
    Dog(){
        super("saliya");
        System.out.println("Dog constructor");
    }
}

public class Main {
    public static void main(String[] args) {
      Dog d=new Dog();
      //System.out.println();
    }
}

// this method 
// class Student{
//   String name;
//   int roll;
//   Student(){
//     this("saliya",2);
//   }
//   Student(String name,int roll){
//     this.name=name;
//     this.roll=roll;
//   }
// }

// public class Main {
//     public static void main(String[] args) {
//       Student s=new Student();x
//       System.out.println(s.name);
//     }
// }

