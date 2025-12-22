import java.util.Scanner;
import java.util.LinkedList;
class song{
    String Title;
    String Genre;
    String artist;
    int duration;
    public void display(){
        System.out.println("The title of the play list is:-"+Title+"The genre is:- "+Genre+"artis is "+artist+"The duration is "+duration);
    }
}
public class playlist {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    song s1=new song();  
    s1.Title="Neek Endhuku";
    s1.Genre="Pichi peaks";
    s1.artist="VDSP";
    s1.duration=42;
    s1.display();
    LinkedList<String> SONGS=new LinkedList<>();
    System.out.println("Enter your song name");
    String A=sc.nextLine();
    SONGS.add(A);
    System.out.println("Enter your song name 2");
    String B=sc.nextLine();
    SONGS.add(B);
    System.out.println("Enter ur song name 3");
    String C=sc.nextLine();
    SONGS.add(C);
    System.out.println("Enter ur Current song to find the next song ");
    String D=sc.nextLine();
    if (D.equals(C)){
        System.out.println("This is the end");
    }
    else if (D.equals(B)){
        System.out.println("Your next song is:-"+C);
    }
    else if (D.equals(A)){
        System.out.println("Your next songs are "+B+" , "+C);
    }
    else {
        System.out.println("This is out of the playlist");
    }
    System.out.println("Enter ur Current song to find the previous song ");
    String E=sc.nextLine();
    if (E.equals(C)){
        System.out.println("ur previous songs are"+A+" , "+B);
    }
    else if (E.equals(B)){
        System.out.println("Your previous song is:-"+A);
    }
    else if (E.equals(A)){
        System.out.println("This is the End ");
    }
    else {
        System.out.println("This is out of the playlist");
    }
    System.out.println("Enter the song to delete: ");
    String F=sc.nextLine();
    if (F.equals(A)){
    SONGS.remove(A);
    System.out.println(SONGS);}
    else if(F.equals(B)){
        SONGS.remove(B);
        System.out.println(SONGS);
    }
    else if (F.equals(C)){
        SONGS.remove(C);
        System.out.println(SONGS);
    }
    else {
        System.out.println("Invalid input ");
    }

    

    }
    
}