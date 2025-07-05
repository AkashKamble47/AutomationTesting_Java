package Practice;
import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Age is valid.");
        } else {
            System.out.println("Age must be 18 or older");
        }

        scanner.close();
    }
}




