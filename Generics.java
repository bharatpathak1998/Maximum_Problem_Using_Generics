import java.util.Scanner;

public class Generics {
    static void maxNum(Integer a,Integer b, Integer c) {
        Integer max = a;
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
        Integer a = sc.nextInt();
        System.out.println("Enter The Second Number : ");
        Integer b = sc.nextInt();
        System.out.println("Enter The Third Number : ");
        Integer c = sc.nextInt();

        maxNum(a, b, c);
    }
}