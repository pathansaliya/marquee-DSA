import java.util.*;

class Address{
  String city;

  Address(String city){
    this.city = city;
  }
}

class Employee{
  String name;
  Address address;

  Employee(String name, Address address){
    this.name = name;
    this.address = address;
  }

  Employee(Employee e){
    this.name = e.name;
    this.address = new Address(e.address.city);
  }
}

public class deep_copy{
  public static void main(String[] args) {
    Address a = new Address("Delhi");
    Employee e1 = new Employee("Praveen", a);
    Employee e2 = new Employee(e1);
    System.out.println(e1.address.city);
    e2.address.city = "mumbai";
    System.out.println(e1.address.city);
    System.out.println(e2.address.city);
  }
}
