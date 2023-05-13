public class Main {
    public static void main(String[] args) {

        Person p1 = new Person (4, 1, 1643, "Isaac Newton", "Princeton", "Physics");
        Person p2 = new Person (14, 3, 1879, "Albert Einstein");

        System.out.println( p1.tellName() + " is " + p1.tellAge() + " years old");
        System.out.println( p2.tellName() + " is " + p2.tellAge() + " years old");

        System.out.println("\n");

        p2.setUniDepart("Cambridge", "Physics and Math");

        System.out.println( p2.tellName() + " worked in " + p2.tellUni()); // returns null if the uni wasn't especified
        System.out.println( p1.tellName() + " worked in " + p1.tellUni());

        System.out.println("\n");

        System.out.println(p1.tellDepart());
        System.out.println(p2.tellDepart());

    }
}