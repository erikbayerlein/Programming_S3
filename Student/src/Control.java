import java.util.*;

public class Control {

    private Vector<Student> studentsClass = new Vector<>();
    private Student student = new Student();

    // -------------------------------- constructor method -------------------------------- //

    // -------------------------------- returning attributes values -------------------------------- //

    public Integer calculateMedian() {
        Integer sum = 0;

        for (int i = 0; i < studentsClass.size(); i++) {
            sum += studentsClass.elementAt(i).getA1();
            sum += studentsClass.elementAt(i).getA2();
        }

        Integer median = sum / (2 * studentsClass.size());

        return median;
    }

    // -------------------------------- setting attributes values -------------------------------- //

    public boolean setAnswer () {
        Scanner userAnswer = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter -end- if you want to stop adding students: ");

        String ans = userAnswer.nextLine();  // Read user input

        if (!ans.equals("end")) {
            setStudent();
            return true;
        }

        return false;
    }

    private void setStudent () {
        Scanner studName = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the student's name: ");

        String name = studName.nextLine();  // Read user input


        Scanner studA1 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the student's a1: ");

        Integer a1 = Integer.valueOf(studA1.nextLine());  // Read user input


        Scanner studA2 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the student's a2: ");

        Integer a2 = Integer.valueOf(studA2.nextLine());  // Read user input


        student.setName(name);
        student.setA1(a1);
        student.setA2(a2);

        studentsClass.addElement(student);
    }

}
