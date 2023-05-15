import java.util.InputMismatchException;
import java.util.Scanner;

public class VectorExcep {

    private Integer[] numArray = new Integer[10];

    VectorExcep(){}

    public void addToArray() {
        Scanner scanner = new Scanner(System.in);
        Integer num = -1, i = 0;

        while(num != 0) {
            try {
                System.out.println("Type the number to add to the array: ");
                num = scanner.nextInt();

                numArray[i] = num;
                i++;

            } catch (InputMismatchException e) {
                num = 0;
                System.out.println("Error: input mismatch");
                e.printStackTrace();

            } catch (ArrayIndexOutOfBoundsException e) {
                num = 0;
                System.out.println("Error: array index out of bounds");
                e.printStackTrace();
            }
        }



    }



}
