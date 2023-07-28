package question1;
//Java program that stores an ArrayList of animals and print all the animals in
//the collection
import java.util.ArrayList;

public class Collection {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cows");
        animals.add("goats");
        animals.add("dogs");
        animals.add("sheep");
        animals.add("pigs");

        System.out.println(animals);
    }
}