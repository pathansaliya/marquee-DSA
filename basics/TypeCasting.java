package basics;
public class TypeCasting {
    public static void main(String[] args) {

        // Double to int conversion
        double d1 = 99.999999;
        int d2 = (int) d1;

        System.out.println(d1);
        System.out.println(d2);

        // Int to char conversion
        int a = 66;
        char ch = (char) a;

        System.out.println(ch);

        // Byte overflow
        byte b = (byte) -129;
        System.out.println(b);

        byte c = -128;
        c--;
        System.out.println(c);

        byte d = 127;
        d++;
        System.out.println(d);
    }
}
