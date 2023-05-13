public class Department {

    private String name;

    // --------------------------------------- constructor methods --------------------------------------- //

    Department (String name) {
        setName(name);
    }

    Department () {
    }

    // --------------------------------------- return the values --------------------------------------- //

    public String tellDepart () {
        return this.name;
    }

    // --------------------------------------- values to the attributes --------------------------------------- //

    public void setName(String name) {
        this.name = name;
    }

}
