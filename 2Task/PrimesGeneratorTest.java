import java.util.*;

public class PrimesGeneratorTest {
    public static void main(String[] args) {
        int number = 17;
        PrimesGenerator generator = new PrimesGenerator(number);
        List<Integer> primeList = new ArrayList<Integer>();
        for (int prime : generator){
            primeList.add(prime);
        }

        // Вывод в прямом порядке
        System.out.print("Простые числа в прямом порядке: ");
        for (int i = 0; i < primeList.size(); i++) {
            System.out.print(primeList.get(i));
            if (i < primeList.size() - 1){
                System.out.print(", ");
            }
        }
        System.out.println();

        // Вывод в обратном порядке
        System.out.print("Простые числа в обратном порядке: ");
        List<Integer> primeReversed = new ArrayList<>(primeList);
        Collections.reverse(primeReversed);
        for (int i = 0; i < primeReversed.size(); i++) {
            System.out.print(primeReversed.get(i));
            if (i < primeReversed.size() - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
