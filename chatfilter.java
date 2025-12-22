import java.util.ArrayList;
import java.util.Scanner;

public class chatfilter {
    public static void main(String[] args) {

        ArrayList<String> BW = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        BW.add("BW1");
        BW.add("BW2");
        BW.add("BW3");
        BW.add("BW4");
        BW.add("BW5");

        System.out.println("Enter ur message:");
        String a = sc.nextLine();

        for (int i = 0; i < BW.size(); i++) {
            String word = BW.get(i);

            if (a.equals(word)) {
                System.out.println("***");
                return;
            }
        }

        
        System.out.println(a);
    }
}
