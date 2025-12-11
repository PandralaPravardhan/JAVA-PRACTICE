import java.util.Random;
import java.util.Scanner;

public class votingsim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random R=new Random();
        System.out.println("Enter ur name:-");
        String Name = sc.nextLine();
        System.out.println("Enter ur Age:-");
        int a = sc.nextInt();
        sc.nextLine();
        int pravardhan=0;
        int sridevi=0;
        int rahul=0;
        int sathwika=0;


        if (a >= 18) {
            System.out.println("Congrats You are Eligible to vote");
            System.out.println("Choose one among the following");
            System.out.println("sridevi");
            System.out.println("Pravardhan");
            System.out.println("rahul");
            System.out.println("sathwika");
            String Vote = sc.nextLine();
            
            if (Vote.equalsIgnoreCase("sridevi")) {
                sridevi++;
                System.out.println("You Successfully casted your vote");
            }
            else if (Vote.equalsIgnoreCase("pravardhan")) {
                pravardhan++;
                System.out.println("You Successfully casted your vote");
            }
            else if (Vote.equalsIgnoreCase("rahul")) {
                rahul++;
                System.out.println("You Successfully casted your vote");
            }
            else if (Vote.equalsIgnoreCase("sathwika")) {
                sathwika++;
                System.out.println("You Successfully casted your vote");
            }
            else {
                System.out.println("Invalid Party");
            }

        } else {
            System.out.println("Sorry you are not eligible to vote");
        }
        sridevi += R.nextInt(100);
        pravardhan += R.nextInt(100);
        rahul += R.nextInt(100);
        sathwika += R.nextInt(100);
        System.out.println("Voting Results");
        System.out.println("sridevi Votes: " + sridevi);
        System.out.println("pravardhan Votes: " + pravardhan);
        System.out.println("rahul Votes: " + rahul);
        System.out.println("sathwika Votes: " + sathwika);
        
        }
        

        

    }

