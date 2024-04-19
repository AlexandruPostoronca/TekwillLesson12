public class Programmer extends Employee {
    private int yearsOfExperience;

    public Programmer(long baseSalary, int yearsOfExperience) {
        super(baseSalary);
        this.yearsOfExperience = yearsOfExperience;
    }

    public long calcSalary() {
        return yearsOfExperience * 500 + super.baseSalary;
    }
}
