import java.util.HashMap;
import java.util.Map;

class Restaurant {
    private Map<String, Double> menuItems;
    private Map<String, Integer> ratings;

    public Restaurant() {
        menuItems = new HashMap<>();
        ratings = new HashMap<>();
    }

    public void addItem(String itemName, double price, int rating) {
        menuItems.put(itemName, price);
        ratings.put(itemName, rating);
    }

    public void removeItem(String itemName) {
        menuItems.remove(itemName);
        ratings.remove(itemName);
    }

    public double calculateAverageRating() {
        if (ratings.isEmpty()) {
            return 0.0;
        }

        int totalRatings = 0;
        for (int rating : ratings.values()) {
            totalRatings += rating;
        }

        return (double) totalRatings / ratings.size();
    }

    public void displayMenu() {
        System.out.println("Menu Items:");
        for (String itemName : menuItems.keySet()) {
            double price = menuItems.get(itemName);
            int rating = ratings.get(itemName);
            System.out.println(itemName + " - Price: $" + price + " - Rating: " + rating);
        }
    }
}

public class General {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        // Adding menu items with their prices and ratings
        restaurant.addItem("Pizza", 12.99, 4);
        restaurant.addItem("Burger", 8.99, 3);
        restaurant.addItem("Salad", 6.99, 5);

        // Displaying the menu
        restaurant.displayMenu();

        // Calculating and displaying average rating
        double averageRating = restaurant.calculateAverageRating();
        System.out.println("Average Rating: " + averageRating);

        // Removing an item
        restaurant.removeItem("Burger");

        // Displaying the updated menu
        restaurant.displayMenu();

        // Calculating and displaying average rating after removal
        averageRating = restaurant.calculateAverageRating();
        System.out.println("Average Rating: " + averageRating);
    }
}
