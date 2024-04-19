public class Announcement extends Publication {

    private final int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }

    // write your code here


    @Override
    public String getDetails() {
        return super.getDetails() + ", daysToExpire=" + daysToExpire ;
    }
}
