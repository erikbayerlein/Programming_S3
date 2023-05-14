import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the polygon type: ");

        String polyType = myObj.nextLine();  // Read user input


        Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the size of the sides: ");

        float sidesSize = Float.parseFloat(myObj2.nextLine());  // Read user input


        RegPol polygon;

        if (polyType.equals("triangle")) {
            polygon = new EqTriangleDeriv(sidesSize);
        } else if (polyType.equals("square")) {
            polygon = new EqTriangleDeriv(sidesSize);
        } else {
            Scanner myObj3 = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter the polygon type");

            float numSides = Float.parseFloat(myObj3.nextLine());  // Read user input

            polygon = new PolN(numSides, sidesSize);
        }


        System.out.println("The perimeter is: " + polygon.perimeter());
        System.out.println("The area is: " + polygon.area());

    }
}