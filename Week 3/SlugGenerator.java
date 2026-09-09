import java.util.Random;

public class SlugGenerator {
    public static void main(String[] args) {
        String[] adjectives = {"Brave", "Clever", "Daring", "Eager",
                                "Fierce", "Gentle", "Happy", "Jumpy", "Quick"};
        String[] animals    = {"Badger", "Cat", "Dolphin", "Eagle",
                                "Fox", "Gecko", "Hippo", "Jaguar", "Quail"};

        Random random = new Random();
        
        // Since the adjectives and animals are parallel arrays,
        // they will always start with the same letter!
        int index = random.nextInt(adjectives.length);
        
        String slug = adjectives[index] + "-" + animals[index];
        System.out.println(slug);
    }
}