public class Article extends Publication {

    private final String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }

    // write your code here

    @Override
    public String getDetails() {
        return super.getDetails()+", author=\"" + author + "\"";
    }
}