import java.util.Scanner;

public class Generics {
    public static <T extends Comparable <T>> T maxTest(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0 && b.compareTo(c) > 0) {
            max = b;
        } else if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Integer : ");
        Integer i1 = sc.nextInt();
        System.out.print("Enter Second Integer : ");
        Integer i2 = sc.nextInt();
        System.out.print("Enter Third Integer : ");
        Integer i3 = sc.nextInt();

        Integer maxInteger = maxTest(i1, i2, i3);

        System.out.print("\nEnter First Float : ");
        Float f1 = sc.nextFloat();
        System.out.print("Enter Second Float : ");
        Float f2 = sc.nextFloat();
        System.out.print("Enter Third Float : ");
        Float f3 = sc.nextFloat();

        Float maxFloat = maxTest(f1, f2, f3);

        System.out.print("\nEnter First String : ");
        String  s1 = sc.nextLine();
        sc.nextLine();
        System.out.print("Enter Second String : ");
        String  s2 = sc.nextLine();
        System.out.print("Enter Third String : ");
        String  s3 = sc.nextLine();

        String maxString = maxTest(s1, s2, s3);

        System.out.println("\nMax Integer : "+maxInteger);
        System.out.println("Max Float : "+maxFloat);
        System.out.println("Max String : "+maxString);
    }
}