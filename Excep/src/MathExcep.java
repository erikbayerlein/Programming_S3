import java.util.InputMismatchException;
import java.util.Scanner;

public class MathExcep {

    MathExcep (){}

    public void division () {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        Double num1 = null, num2 = null, result = null;

        try {
            System.out.println("Enter the first num: ");
            num1 = scanner.nextDouble();// Read user input

            System.out.println("Enter the second num: ");
            num2 = scanner.nextDouble();// Read user input

        } catch (InputMismatchException e) {
            System.out.println("Error: input isn't numeric");
        }

        try{
            result = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Error: division by 0");
        }

        System.out.println("The result is: " + result);

    }

}
