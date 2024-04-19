public class DataAnalyst extends Employee {

    // write fields
    protected String[] methods;
    protected boolean phd;

    // write constructor

    public DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        this.methods = methods;
    }
    // write getters

    public String[] getMethods() {
        return methods;
    }

    public boolean isPhd() {
        return phd;
    }
}