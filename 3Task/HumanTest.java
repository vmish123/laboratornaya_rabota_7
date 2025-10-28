import java.util.*;

public class HumanTest {
    public static void main(String[] args) {
        Set<Human> s = new HashSet<>();
        s.add(new Human("Gaius", "Octavius", 25));
        s.add(new Human("Tiberius", "Claudius", 30));
        s.add(new Human("Titus", "Domitianus", 22));
        s.add(new Human("Terentius ", "Maximus", 25));
        // Пункт a
        System.out.println("Коллекция на основе HashSet:");
        for (Human h : s)
            System.out.println(h);
        // Пункт b
        Set<Human> linked = new LinkedHashSet<>(s);
        System.out.println("Коллекция LinkedHashSet:");
        for (Human h : linked)
            System.out.println(h);
        // Пункт c
        Set<Human> tree1 = new TreeSet<>(s);
        System.out.println("Коллекция TreeSet:");
        for (Human h : tree1)
            System.out.println(h);
        // Пункт d
        Set<Human> tree2 = new TreeSet<>(new HumanComparatorByLName());
        tree2.addAll(s);
        System.out.println("Коллекция TreeSet с компаратором HumanComparatorByLName:");
        for (Human h : tree2)
            System.out.println(h);
        // Пункт e
        Set<Human> tree3 = new TreeSet<>(new Comparator<Human>()
        {
            @Override
            public int compare(Human h1, Human h2) {
                return Integer.compare(h1.getAge(), h2.getAge());
            }
        }
        );
        tree3.addAll(s);
        System.out.println("Коллекция TreeSet с компаратором по возрасту:");
        for (Human h : tree3)
            System.out.println(h);
    }
}
