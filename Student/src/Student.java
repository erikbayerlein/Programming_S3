class Student {

    private Integer a1, a2;
    private String name;

    // -------------------------------- constructor method -------------------------------- //

    Student() {
    }

    // -------------------------------- returning attributes values -------------------------------- //

    public Integer getA1 () {
        return this.a1;
    }

    public Integer getA2 () {
        return this.a2;
    }

    public String getName () {
        return this.name;
    }

    // -------------------------------- setting attributes values -------------------------------- //

    public void setA1 (Integer a1) {
        this.a1 = a1;
    }

    public void setA2 (Integer a2) {
        this.a2 = a2;
    }

    public void setName (String name) {
        this.name = name;
    }
}
