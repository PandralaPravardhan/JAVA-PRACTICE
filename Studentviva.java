import java.util.ArrayList;

class Students {
    ArrayList<String> s = new ArrayList<>();

    // Enqueue → add at rear
    public void enqueue(String newData) {
        s.add(newData);
    }

    // Front → first element
    public String front() {
        if (s.isEmpty()) {
            return "Queue is empty";
        }
        return s.get(0);
    }

    // Dequeue → remove first element
    public String dequeue() {
        if (s.isEmpty()) {
            return "Queue is empty";
        }
        return s.remove(0);
    } 
}

public class Studentviva {
    public static void main(String[] args) {

        Students q1 = new Students();

        q1.enqueue("Rahul");
        q1.enqueue("15");
        q1.enqueue("69");
        q1.enqueue("72");

        System.out.println(q1.front());    // Rahul
        System.out.println(q1.dequeue());  // Rahul
        System.out.println(q1.front());    // 15
    }
}
