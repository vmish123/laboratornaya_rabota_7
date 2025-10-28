import java.util.*;

public class FourthFrequency {
    public static void main(String[] args) {

        String s = "House, House, Mouse, Dog, Dog, Dog, Dog.";
        s = s.replaceAll("[^A-Za-z ]", " ");
        String[] words = s.split("\\s+");

        HashMap<String, Integer> count = new HashMap<>();
        for (String wrd : words) {
            if (!wrd.isEmpty()) {
                count.put(wrd, count.getOrDefault(wrd, 0) + 1);
            }
        }

        System.out.println("Список слов и их частота:");
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}