package HashMaps;

import java.util.HashMap;

public class HashMapNotes {
    public static void main(String[] args){
//        HashMap<String, String> postalCodes = new HashMap<>();
//        postalCodes.put("00710", "Helsinki");
//        postalCodes.put("90014", "Oulu");
//        postalCodes.put("33720", "Tampere");
//        postalCodes.put("33014", "Tampere");
//
//        System.out.println(postalCodes.get("00710"));
//
//        HashMap<String, String> numbers = new HashMap<>();
//        numbers.put("One", "Uno");
//        numbers.put("Two", "Dos");
//
//        String translation = numbers.get("One");
//        System.out.println(translation);
//
//        System.out.println(numbers.get("Two"));
//        System.out.println(numbers.get("Three"));
//        System.out.println(numbers.get("Uno"));
//        HashMap<String, String> numbers = new HashMap<>();
//        numbers.put("Uno", "One");
//        numbers.put("Dos", "Zwei");
//        numbers.put("Uno", "Ein");
//
//        String translation = numbers.get("Uno");
//        System.out.println(translation);
//
//        System.out.println(numbers.get("Dos"));
//        System.out.println(numbers.get("Tres"));
//

        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");
        HashMap<String, Book> directory = new HashMap<>();
        directory.put(senseAndSensibility.getName(), senseAndSensibility);
        directory.put(prideAndPrejudice.getName(), prideAndPrejudice);
        Book book = directory.get("Persuasion");
        System.out.println(book);
        System.out.println();
        book = directory.get("Pride and Prejudice");
        System.out.println(book);
    }
}
