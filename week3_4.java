import java.util.Scanner;

public class Week3_4 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1, number2, number3;
        System.out.print("Enter first number: ");
        number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        number2 = sc.nextInt();
        System.out.print("Enter third number: ");
        number3 = sc.nextInt();
        if (number1 > number2 && number1 > number3) {
            System.out.println("Is the first number the largest? Yes");
        } else {
            System.out.println("Is the first number the largest? No");
        }
        if (number2 > number1 && number2 > number3) {
            System.out.println("Is the second number the largest? Yes");
        } else {
            System.out.println("Is the second number the largest? No");
        }
        if (number3 > number1 && number3 > number2) {
            System.out.println("Is the third number the largest? Yes");
        } else {
            System.out.println("Is the third number the largest? No");
        }
        sc.close();
    }
}

