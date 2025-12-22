import java.util.ArrayList;
class QUE {
    ArrayList<Integer> s = new ArrayList<>();
    public int front(){
        return s.get(s.size()-1);
    }
    public void enqueue(int newData){
        s.add(newData);
    }
    public int deque(){
        int temp = s.get(s.size()-1);
        s.remove(s.size()-1);
        return temp;
    }

}

public class que1 {
      public static void main(String[] args) {
        QUE q1 = new QUE();

        q1.enqueue(10);
        q1.enqueue(15);
        q1.enqueue(69);
        q1.enqueue(72);
        q1.front();
        System.out.println(q1.front());
        q1.deque();
        System.out.println(q1.deque());
        q1.front();
        System.out.println(q1.front());
        
        
      
    }
}
