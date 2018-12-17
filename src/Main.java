import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1. Declare variables (dayOfWeek & day)
        int dayOfWeek;
        String day;
        Scanner scn = new Scanner(System.in);
        //2. Prompt user to enter 1 - 7
        System.out.println("Enter the day of the week (1-7):");
        dayOfWeek = scn.nextInt();
        //3. Use switch statement to initialize the day
        switch (dayOfWeek) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "I'm not sure!";
                break;
        }
        //4. Print the value of day to the console
        System.out.println("The day of the week is: " + day);
    }
}
