
import java.util.Scanner;

class Switch7 {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter day");
        String day = myObj.nextLine();
        System.out.println("day is " + day);

        switch (day.toLowerCase()) {
            case "sun":
                System.out.println("Sunday");
                break;
            case "mon":
                System.out.println("Monday");
                break;
            case "tue":
                System.out.println("Tuesday");
                break;
            case "wed":
                System.out.println("Wednesday");
                break;
            case "thu":
                System.out.println("Thursday");
                break;
            case "fri":
                System.out.println("Friday");
                break;
            case "sat":
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
