import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();
        Student s1 = new Student("小花",28);
        Student s2 = new Student("小he",24);
        Student s3 = new Student("小li",22);
        Student s4 = new Student("Alice",28);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        System.out.println(ts);
    }
}
