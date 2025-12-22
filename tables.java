import java.util.Scanner;

public class tables {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Value");
    int a = sc.nextInt();
    for (int i=0;i<=10;i++)
        System.out.println(a+"x"+i+"="+a*i);
       }
}
