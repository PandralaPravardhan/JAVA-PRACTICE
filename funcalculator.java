import java.util.Scanner;

public class funcalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First num: ");
        int a = sc.nextInt();
        System.out.println("Second num: ");
        int b = sc.nextInt();
        System.out.println("operator: ");
        char c = sc.next().charAt(0);

        if (c == '+') {
            System.out.println(add(a, b));
        } else if (c == '-') {
            System.out.println(sub(a, b));
        } else if (c == '*') {
            System.out.println(product(a, b));
        } else if (c == '/') {
            System.out.println(divide(a, b));
        } else {
            System.out.println("Invalid operator");
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }
        public static int product(int a, int b){
            return a * b;
        }
        public static int divide(int a, int b){
            return a/b;
        }
    }

   