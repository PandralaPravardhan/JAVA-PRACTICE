import java.util.Scanner;

public class trailingzeroes {

    public static int factor(int a){
        if (a == 0 || a == 1){
            return 1;
        }
        return a * factor(a - 1);
    }

    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int v = factor(a);
        System.out.println("The factorial is " + v);
        while (v % 10 == 0) {
            count++;
            v = v / 10;
        }

        System.out.println(count);
    }
}
