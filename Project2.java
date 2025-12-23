import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        String[] shifts = { "Morning", "Night" };

        ArrayList<String> Employees = new ArrayList<>();
        LinkedList<String> Schedule = new LinkedList<>();

        Employees.add("Pravardhan");
        Employees.add("Sridevi");
        Employees.add("Rahul");
        Employees.add("Sanju");
        Employees.add("VP");

        int empIndex = 0;

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < shifts.length; j++) {

                String checkIn, checkOut;

                if (shifts[j].equals("Morning")) {
                    checkIn = "9:00 AM";
                    checkOut = "5:00 PM";
                } else {
                    checkIn = "6:00 PM";
                    checkOut = "2:00 AM";
                }

                Schedule.add(
                        days[i] + " - " + shifts[j] + " Shift - " + Employees.get(empIndex) + " | Check-In: " + checkIn
                                + " | Check-Out: " + checkOut);

                empIndex++;
                if (empIndex == Employees.size()) {
                    empIndex = 0;
                }
            }
        }

        System.out.print("Enter Day: ");
        String userDay = sc.nextLine();

        System.out.print("Enter Shift (Morning/Night): ");
        String userShift = sc.nextLine();

        System.out.println("\nYour Schedule:");

        for (int i = 0; i < Schedule.size(); i++) {

            String entry = Schedule.get(i);

            
            for (int d = 0; d < days.length; d++) {
                if (days[d].equalsIgnoreCase(userDay) && entry.startsWith(days[d])) {

                   
                    for (int s = 0; s < shifts.length; s++) {
                        if (shifts[s].equalsIgnoreCase(userShift) &&
                                entry.contains(shifts[s])) {

                            System.out.println(entry);
                            break;
                        }
                    }
                    break;
                }
            }
        }

    }
}
