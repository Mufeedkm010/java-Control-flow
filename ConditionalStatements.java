import java.util.Scanner;
public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println(num + " is positive.");
        } else if (num < 0) {
            System.out.println(num + " is negative.");
        } else {
            System.out.println(num + " is zero.");
        }
        String day;
        switch (num) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid day (Please enter a number between 1 and 7)";
        }
        System.out.println("Day " + num + ": " + day);
        System.out.println("Numbers from 1 to " + num + ":");
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        System.out.println("Numbers in descending order from " + num + ":");
        for (int i = num; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Numbers from 1 to 3:");
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 3);
        System.out.println();

        sc.close();
    }
}
