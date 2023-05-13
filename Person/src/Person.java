import java.time.*;

public class Person {

    private Integer age;
    private Integer day;
    private Integer month;
    private Integer year;
    private String name;

    private University university = new University();

    // --------------------------------------- constructor methods --------------------------------------- //

    Person (Integer day, Integer month, Integer year, String name, String uniName, String depart) { // if everything is informed
        this.setAge(day, month, year);
        this.setName(name);
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
        this.setUniDepart(uniName, depart);
    }

    Person (Integer day, Integer month, Integer year, String name, String uniName) { // if the department name wasn't informed
        this.setAge(day, month, year);
        this.setName(name);
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
        this.setUni(uniName);
    }

    Person (Integer day, Integer month, Integer year, String name) { // if both the uni name and the depart name weren't informed
        this.setAge(day, month, year);
        this.setName(name);
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }

    // --------------------------------------- return the values --------------------------------------- //

    private Integer calculateAge (Integer day, Integer month, Integer year) {

        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(year, month, day);

        Integer ageYears = today.getYear() - birthDate.getYear();

        return ageYears;
    }

    public String tellName () {
        return this.name;
    }

    public Integer tellDay () {
        return this.day;
    }

    public Integer tellMonth () {
        return this.month;
    }

    public Integer tellYear () {
        return this.year;
    }

    public Integer tellAge () {
        return this.age;
    }

    public String tellUni () {
        return this.university.tellUni();
    }

    public String tellDepart () {
        return this.university.tellDepart();
    }

    // --------------------------------------- values to the attributes --------------------------------------- //

    private void setName (String name) {
        this.name = name;
    }

    private void setAge (Integer day, Integer month, Integer year) {
        this.age = calculateAge(day, month, year);
    }

    private void setDay (Integer day) {
        this.day = day;
    }

    private void setMonth (Integer month) {
        this.month = month;
    }

    private void setYear (Integer year) {
        this.year = year;
    }

    public void setUni (String uniName) { // able to add it later
        this.university.setName(uniName);
    }

    public void setUniDepart (String uniName, String depart) { // able to add it later
        this.university.setName(uniName);
        this.university.setDepartment(depart);
    }

}
