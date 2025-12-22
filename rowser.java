import java.util.ArrayList;
import java.util.Scanner;
public class rowser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> menu = new ArrayList<>();
        System.out.println("Please Enter your first website:- ");
        String A = sc.nextLine();   
        menu.add(A);
        System.out.println("Please enter Your second website:- ");  
        String B = sc.nextLine();
        menu.add(B);
        System.out.println("Your websites are:- " + menu);
        System.out.println("Please Enter Your last visited website");
        String C = sc.nextLine();
        if (C.equals(A)) {
            menu.remove(A);
            System.out.println("Your remaining website is " + menu);
        } else {
            menu.remove(B);
            System.out.println("Your remaining website is " + menu);
        }
        
    }

    
}