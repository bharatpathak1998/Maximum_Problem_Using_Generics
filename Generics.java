import java.util.Scanner;

public class Generics {
    static void maxString(String a, String b, String c) {
        String max = a;
        if (b.compareTo(max) > 0 && b.compareTo(c) > 0) {
            max = b;
        } else if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println("Maximum String : "+max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Name : ");
        String  a = sc.nextLine();
        System.out.println("Enter The Second Name : ");
        String  b = sc.nextLine();
        System.out.println("Enter The Third Name : ");
        String  c = sc.nextLine();

        maxString(a, b, c);
    }
}