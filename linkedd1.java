import java.util.LinkedList;



public class linkedd1 {
    public static void main(String[] args) {
        LinkedList<Integer> list =new LinkedList<>();
        for (int i=1;i<=10;i++){
            list.add(i*10);
        }
        for (int i=0;i<10;i++){
            System.out.println(list.get(i)+ " ");

        }
        list.addFirst(1000);
        System.out.println();
        for (int i=0;i<10;i++){
            System.out.println(list.get(i)+" ");
        }
    }

}
