import java.util.*;

public class FirstCollections {
    public static void main(String[] args) {
        // Пункт a
        int N = 10;
        Integer[] intArray = new Integer[N];
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            intArray[i] = random.nextInt(5);
        }
        System.out.println("Массив из N=15 случайных чисел: " + Arrays.toString(intArray));

        // Пункт b
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(intArray));
        System.out.println("Список из N=15 случайных чисел: " + list);

        // Пункт c
        Collections.sort(list);
        System.out.println("Отсортированный список: " + list);

        // Пункт d
        list.sort(Collections.reverseOrder());
        System.out.println("Отсортированный в обратном порядке список: " + list);

        // Пункт e
        Collections.shuffle(list);
        System.out.println("Перемешанный список: " + list);

        // Пункт f
        Collections.rotate(list, 1);
        System.out.println("Список, сдвинутый на 1 элемент: " + list);

        // Пункт g
        List<Integer> listUnique = new ArrayList<>();
        for (Integer num : list) {
            if (Collections.frequency(list, num) == 1){
                listUnique.add(num);
            }
        }
        System.out.println("Список, содержащий только уникальные элементы: " + listUnique);

        // Пункт h
        List<Integer> listDuplicate = new ArrayList<>();
        for (Integer num : list) {
            if (Collections.frequency(list, num) > 1){
                listDuplicate.add(num);
            }
        }
        System.out.println("Список, содержащий только дубликаты: " + listDuplicate);

        // Пункт i
        Integer[] intArray2 = list.toArray(new Integer[list.size()]);
        Integer[] intArray3 = listUnique.toArray(new Integer[listUnique.size()]);
        Integer[] intArray4 = listDuplicate.toArray(new Integer[listDuplicate.size()]);
        System.out.println("Массив из исходного списка: " + Arrays.toString(intArray2));
        System.out.println("Массив из списка с уникальными элементами: " + Arrays.toString(intArray3));
        System.out.println("Массив из списка с дублирующимися элементами: " + Arrays.toString(intArray4));
    }
}