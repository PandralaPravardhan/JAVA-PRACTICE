import java.util.Scanner;

public class factorial {

    public static int factor(int a){
        if (a == 0){
            return 1;
        }
        else if (a == 1){
            return 1;
        }
        else  {
            return a * factor(a - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("The factorial is " + factor(a));
    }
}
