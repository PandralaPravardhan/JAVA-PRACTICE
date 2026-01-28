import java.util.Scanner;

public class coingame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of coins:");
        int x = sc.nextInt();
        System.out.println("Enter the number of coins:");
        int p = sc.nextInt();
        int count = 0;
        while (x > 0 && p >= 4) {
            x = x - 1;
            p = p - 4;
            count++;
        }
        if (count % 2 == 1) {
            System.out.println("Alice");
        } else {
            System.out.println("Bob");
        }
    }
}
