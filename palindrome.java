import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Name=sc.nextLine();
        StringBuilder sb=new StringBuilder(Name);
        sb.reverse();
        if (Name.equals(sb.toString())){
            System.out.println("Yes its a Palindrome");
        }

        else System.out.println("Its not a Palindrome");
        
        }
    }

