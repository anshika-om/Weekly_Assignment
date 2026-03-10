import java.util.Scanner;

public class Week3_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary;
        int yearsOfService;
        System.out.print("Enter salary: ");
        salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        yearsOfService = sc.nextInt();
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount = " + bonus);
        } else {
            System.out.println("Bonus amount = 0");
        }
        sc.close();
    }
}
