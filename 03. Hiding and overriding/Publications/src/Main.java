import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split("; ");
        String type = parts[0];

        Publication publication = switch (type) {
            case "Newspaper" -> new Newspaper(parts[1], parts[2]);
            case "Article" -> new Article(parts[1], parts[2]);
            case "Announcement" -> new Announcement(parts[1], Integer.parseInt(parts[2]));
            default -> new Publication(parts[1]);
        };
        System.out.println(publication.getDetails());
    }
}
