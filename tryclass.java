class Pravardhan{
    String name;
    int age;
    public void display(){
        System.out.println("Name is :- "+name+" and" +" Age:-"+age);
    }

}

public class tryclass {
    public static void main(String[] args) {
        Pravardhan p1=new Pravardhan();
        p1.name="Pravardhan";
        p1.age=20;
        p1.display();

        Pravardhan s1=new Pravardhan();
        s1.name="Sridevi";
    }
    
}
