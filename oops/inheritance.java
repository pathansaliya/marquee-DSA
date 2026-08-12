import java.util.*;
//single inheritance
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

public class inheritance {
    public static void main(String[]args){
        Dog d=new Dog();
    }
}


//multilevel inheritance
// class Animal {
//     void eat() {
//         System.out.println("Animal eats");
//     }
// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("Dog barks");
//     }
// }

// class Puppy extends Dog {
//     void play() {
//         System.out.println("Puppy plays");
//     }
// }

// public class main {
//     public static void main(String[] args) {

//         Puppy p = new Puppy();

//         p.eat();   
//         p.bark();  
//         p.play();  
//     }
// }

//heirarchical inheritance
// class Animal {
//     void eat() {
//         System.out.println("Animal eats");
//     }
// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("Dog barks");
//     }
// }

// class Puppy extends Animal {
//     void play() {
//         System.out.println("Puppy plays");
//     }
// }

// public class main {
//     public static void main(String[] args) {

//         Puppy p = new Puppy();

//         p.eat();   
//         p.bark();  
//         p.play();  
//     }
// }

