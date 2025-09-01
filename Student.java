import java.util.*;

public class Student {

    public static void display(String str) {
        System.out.println(str);
    }

    public static void stringPoolConstant() {
        String a = "kritika";
        String b = "kritika";
        String c = new String("kritika");

        System.out.println("a == b: " + (a == b));
        System.out.println("a == c: " + (a == c));
        System.out.println("a.equals(c): " + a.equals(c));
    }

    public static void immutable() {
        String a = "five";
        String new1 = a.concat("star");
        System.out.println("Original: " + a);
        System.out.println("New String: " + new1);
    }

    public static void Register(String str, String[] arr) {
        int flag = 0;
        for (String s : arr) {
            if (s.equals(str)) {
                flag = 1;
            }
        }
        if (flag == 1) {
            System.out.println("Student Registered ");
        } else {
            System.out.println("Student Not Found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "hello";
        String s2 = "world";
        display(s1);
        display(s2);
        stringPoolConstant();
        immutable();

        String str = sc.next();
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        Register(str, arr);
        sc.close();

        StringBuffer sb = new StringBuffer("Nice");
        sb.append(" game");
        sb.append("bro");
        sb.delete(0, 3);
        sb.insert(3, 2);
        System.out.println(sb);
        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(" World");
        sb1.append("system");
        sb1.delete(0, 2);
        sb1.insert(2, "Java");
        System.out.println(sb1);
    }

}
