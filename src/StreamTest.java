import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        //method1();
        //method2();
        //method3();
        //method4();
    }

    private static void method4() {
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8).forEach(s -> System.out.println(s));
    }

    private static void method3() {
        int[] arr = {1, 2, 3, 4, 5};
        Arrays.stream(arr).forEach(s -> System.out.println(s));
    }

    private static void method2() {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("zhangsan", 23);
        hm.put("lisi", 20);
        hm.put("wangwu", 22);
        hm.put("zhaoliu", 21);
        hm.put("xiaohei", 19);
        hm.put("xiaobai", 18);

        //hm.keySet().stream().forEach(s -> System.out.println(s));
        hm.entrySet().stream().forEach(s -> System.out.println(s));
    }

    private static void method1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        list.stream().forEach(s -> System.out.println(s));
    }
}
