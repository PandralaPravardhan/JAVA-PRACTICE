import java.util.ArrayList;
import java.util.Scanner;

public class restaurantsim {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> Order = new ArrayList<>();
        ArrayList<Integer> Bill = new ArrayList<>();

        System.out.println("Please Choose one:- ");
        System.out.println("Menu or EXIT");

        String Z = sc.nextLine();

        if (Z.equals("Menu")) {

            System.out.println("1. Chicken Biryani - 160");
            System.out.println("2. Chicken 65 - 120");
            System.out.println("3. Chicken Kabab - 180");
            System.out.println("4. Grilled Chicken - 260");

            int Bill1 = 160;
            int Bill2 = 120;
            int Bill3 = 180;
            int Bill4 = 260;

            System.out.println("Enter the number of items you want to order:");
            int count = sc.nextInt();

            for (int i = 0; i < count; i++) {
                System.out.println("Enter item number:");
                int item = sc.nextInt();

                if (item == 1) {
                    Order.add("Chicken Biryani");
                    Bill.add(Bill1);
                }
                else if (item == 2) {
                    Order.add("Chicken 65");
                    Bill.add(Bill2);
                }
                else if (item == 3) {
                    Order.add("Chicken Kabab");
                    Bill.add(Bill3);
                }
                else if (item == 4) {
                    Order.add("Grilled Chicken");
                    Bill.add(Bill4);
                }
                else {
                    System.out.println("Invalid item");
                }
            }

            int sum = 0;
            for (int price : Bill) {
                sum += price;
            }

            System.out.println("\nYour Order is:");
            System.out.println(Order);

            System.out.println("Your Total Bill is:");
            System.out.println(sum);
        } 
        else {
            System.out.println("Thank you");
        }

        
    }
}
