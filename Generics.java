import java.util.Scanner;

public class Generics {
    static void maxFloat(Float a, Float b, Float c) {
        Float max = a;
        if (b.compareTo(max) > 0 && b.compareTo(c) > 0) {
            max = b;
        } else if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println("Maximum Number : "+max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number : ");
        Float a = sc.nextFloat();
        System.out.println("Enter The Second Number : ");
        Float b = sc.nextFloat();
        System.out.println("Enter The Third Number : ");
        Float c = sc.nextFloat();

        maxFloat(a, b, c);
    }
}