public class function {
    public void fun(int age){
        if(age<18){
            System.out.println("child");
        }
        else if(age>=18 && age<40){
            System.out.println("Adult");
        }
        else{
            System.out.println("Senior citizen");
        }
    }
    public static void main(String[]args){
        function obj= new function();
        obj.fun(22);
        System.out.println(10%3); //if numerator is negative answer is negative
        System.out.println(-10%3);
        System.out.println(10%-3);
        System.out.println(-10%-3);
        float celcius=30;
        float fahrenheit=((9/5)*celcius+32);
        System.out.println(fahrenheit);

    }
}
