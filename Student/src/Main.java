public class Main {
    public static void main(String[] args) {

        Control control = new Control();

        while (control.setAnswer()) {
            // add students
        }

        Integer median = control.calculateMedian();

        System.out.println("The median of the class is: " + median);
    }
}