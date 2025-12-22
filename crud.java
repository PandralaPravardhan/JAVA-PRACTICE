import java.util.ArrayList;
import java.util.Collections;

public class crud {
    public static void main(String[] args) {
        ArrayList<String> VP=new ArrayList<>();
        VP.add("VP1");
        VP.add("VP2");
        System.out.println(VP);
        String A=VP.get(0);
        System.out.println(A);
        VP.set(1, "Vishnu PriyA");
        System.out.println(VP);
        VP.remove(0);
        System.out.println(VP);
    }
    
}
