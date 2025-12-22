import java.util.Scanner;

public class calculator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First num: ");
        int a = sc.nextInt();
        System.out.println("Second num: ");
        int b = sc.nextInt();
        System.out.println("operator: ");
        char c =sc.next().charAt(0);
        int sum = a + b;
        int diff = a - b;
        int mul = a * b;
        float div = (float) a / b;

        if (c =='+') {
            System.out.println("The sum is equals to " + sum);
        } else if (c=='-') {
            System.out.println("The difference is equals to " + diff);
        } else if (c == '*') {
            System.out.println("The product is equals to " + mul);
        } else if (c == '/') {
            System.out.println("The quotient is equals to " + div);
        } else {
            System.out.println("Invalid operator");
        }
    }
    
}
