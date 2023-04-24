import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        //method1();
        TreeSet<Teacher> ts = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                //o1表示现在要存入的元素
                //o2表示已经存入到集合的元素
                int result = o1.getAge() - o2.getAge(); //主要条件
                result = result == 0 ? o1.getName().compareTo(o2.getName()) : result; //次要条件
                return result;
            }
        });

        Teacher t1 = new Teacher("zhangsan",23);
        Teacher t2 = new Teacher("lisi",24);
        Teacher t3 = new Teacher("wangwu",25);

        ts.add(t1);
        ts.add(t2);
        ts.add(t3);

        System.out.println(ts);

    }

    private static void method1() {
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
