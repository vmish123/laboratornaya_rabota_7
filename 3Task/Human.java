public class Human implements Comparable<Human> {
    private String FirstName;
    private String LastName;
    private int age;

    public Human(String FirstName, String LastName, int age) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.age = age;
    }

    public String getFName() {
        return FirstName;
    }
    public String getLName() {
        return LastName;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return FirstName + " " + LastName + " (" + age + ")";
    }

    @Override
    public int compareTo(Human o) {
        int rez;
        if (this.equals(o))
            return 0;
        rez = FirstName.compareToIgnoreCase(o.getFName());
        if (rez != 0)
            return rez;
        rez = LastName.compareToIgnoreCase(o.getLName());
        if (rez != 0)
            return rez;
        else
            return age - o.getAge();
    }
}