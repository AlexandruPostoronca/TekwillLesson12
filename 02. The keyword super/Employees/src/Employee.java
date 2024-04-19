public class Employee {

    // write fields
    protected String name;
    protected String email;
    protected int experience;
    // write constructor


    public Employee(String name, String email, int experience) {
        this.email = email;
        this.experience = experience;
        this.name = name;
    }

    // write getters
    public String getEmail() {
        return email;
    }

    public int getExperience() {
        return experience;
    }

    public String getName() {
        return name;
    }
}