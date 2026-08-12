import java.util.*;
//autoboxing->primitive datatype to object wrappper class 
public class autoboxing {
    public static void main(String[] args) {
      int num=10;
      Integer obj=num;
      System.out.println(obj);
      
      double balance=99.89;
      Double amt=balance;
      System.out.println(amt);
      
      
      //auto unboxing
      Integer obj3=100;
      int n=obj3;
      System.out.println(n);
      
    }
}


// class Student{
//     String name;
//     int roll;
//     Student(String name,int roll){
//         this.name=name;
//         this.roll=roll;
//     }
//     //copy constructor
//     Student(Student s){
//         this.name=s.name;
//         this.roll=s.roll;
//     }
//     void display(){
//         System.out.println(name+roll);
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//      //copy constructor
//      Student shinchan = new Student("shinchan",5);
//      Student kasama = new Student(shinchan);
//      kasama.name="kasama";
//      kasama.display();
      
//     }
// }