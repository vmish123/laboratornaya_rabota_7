import java.util.*;

public class invertMap {

    public static <K, V> Map<V, Collection<K>> invertmap(Map<K, V> sourceMap) {
        if (sourceMap == null) {
            return Collections.emptyMap();
        }

        Map<V, Collection<K>> invertedMap = new HashMap<>();

        for (Map.Entry<K, V> entry : sourceMap.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();

            Collection<K> keysCollection = invertedMap.get(value);

            if (keysCollection == null) {
                keysCollection = new ArrayList<>();
                invertedMap.put(value, keysCollection);
            }
            keysCollection.add(key);
        }

        return invertedMap;
    }
    public static void main(String[] args) {
        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("John", 5);
        studentGrades.put("Ivan", 4);
        studentGrades.put("Alex", 5);
        studentGrades.put("Edward", 3);
        studentGrades.put("Charles", 4);

        System.out.println("Исходный Map: " + studentGrades);

        Map<Integer, Collection<String>> gradesToStudents = invertmap(studentGrades);

        System.out.println("Инвертированный Map: " + gradesToStudents);
    }

}
