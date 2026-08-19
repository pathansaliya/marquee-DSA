import java.util.*;
class Outer{
    
    // static class Inner{
    //     void display(){
    //         System.out.println("u are inside static class");
    //     }
    // }
}
public class static_nonStatic {
    static { //static block runs even before main method by jvm
        System.out.println("Static block");
    }
    public static void main(String[] args) {
      //Outer out=new Outer(); no undefined
    //   Outer.Inner obj=new Outer.Inner();
    //   obj.display();
    System.out.println("Main method");
      
    }
}


// learn method hiding (static methods)
// // class Animal{
//   static void sound(){
//     System.out.println("animal sound");
//   }
// }

// class Dog extends Animal{
//   static void sound(){
//     System.out.println("dog sound");
//   }
// }

// public class Main {
//     public static void main(String[] args) {
//       Animal a = new Dog();
//       Dog d = new Dog();
//       a.sound();
//       d.sound();
//     }
// }