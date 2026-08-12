//custom wrapper class
class MyInteger{
    int value;
    MyInteger(int value){
        this.value=value;
    }
    void increment(){
        value++;
    }
    void decrement(){
        value--;
    }
    void display(){
        System.out.println(value);
    }
}
public class wrapper_class {
    public static void main(String[]args){
      MyInteger a=new MyInteger(10);
      a.increment();
      a.increment();
      a.display();
      a.decrement();
      a.display();
    }
}
// class Car{
//     String name;
// }
// public class wrapper_class {
//     public static void main(String[]args){
//        Car c1=new Car();
//        c1.name="Porsche";
//         Car c2=new Car();
//         c2=c1;
//         c2.name="Thar";
//         System.out.println(c1.name);//both c1 and c2 become thar 
//         System.out.println(c2.name);


//     }
// }
//
