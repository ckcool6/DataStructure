import java.util.HashSet;

public class HashSetTest2 {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();

        Student s1 = new Student("lisi",21);
        Student s2 = new Student("zhangsan",22);
        Student s3 = new Student("zhangsan",22);

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);

        for (Student student : hs) {
            System.out.println(student);
        }
    }
}
