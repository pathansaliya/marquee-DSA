import java.util.*;
class Animal{
    void sound(){
        System.out.print("Hi,human");
    }
}
class Lion extends Animal{
    @Override
    void sound(){
        System.out.print("Hi from the jungle king.");
    }
}
public class methodOverriding {
    public static void main(String[] args) {
        Animal a=new Lion();
    	a.sound();
    	System.out.println();
        Animal b=new Animal();
        b.sound();
        System.out.println();
        Lion lion=new Lion();
	    lion.sound();
    }
}

