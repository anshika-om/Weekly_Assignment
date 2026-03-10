import java.util.Scanner;

public class Week3_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.print("Enter a year: ");
        year = sc.nextInt();
        if (year < 1582) {
            System.out.println("Leap Year program works only for year >= 1582");
        } else {
            if (year % 400 == 0) {
                System.out.println("The year is a Leap Year");
            } else if (year % 100 == 0) {
                System.out.println("The year is not a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println("The year is a Leap Year");
            } else {
                System.out.println("The year is not a Leap Year");
            }
        }
        sc.close();
    }
}
