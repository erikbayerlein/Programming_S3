public class University {

    private String uniName;

    private Department department = new Department();

    // --------------------------------------- constructor methods --------------------------------------- //


    University (String uniName, String depart) {
        setName(uniName);
        setDepartment(depart);
    }

    University (String uniName) {
        setName(uniName);
    }

    University () {
    }

    // --------------------------------------- return the values --------------------------------------- //


    public String tellUni () {
        return this.uniName;
    }

    public String tellDepart () {
        return this.department.tellDepart();
    }

    // --------------------------------------- values to the attributes --------------------------------------- //

    public void setName (String uniName) {
        this.uniName = uniName;
    }

    public void setDepartment (String depart) { // public bc you can add later
        this.department.setName(depart);
    }

}
