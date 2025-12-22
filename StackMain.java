import java.util.ArrayList;

class Stack {
    ArrayList<Integer> s = new ArrayList<>();
    public int peek(){
        return s.get(s.size()-1);
    }
    public void push(int newData){
        s.add(newData);
    }
    public int pop(){
        int temp = s.get(s.size()-1);
        s.remove(s.size()-1);
        return temp;
    }

}

public class StackMain {
    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(10);
        st.push(15);
        st.push(69);
        st.push(72);
        st.peek();
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.pop());
        st.peek();
        System.out.println(st.peek());
        
        
      
    }
}
