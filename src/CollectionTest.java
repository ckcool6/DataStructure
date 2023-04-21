import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        System.out.println(collection);
        boolean result = collection.remove("aaa");
        System.out.println(result);
        System.out.println(collection);
        //method1(collection);
        boolean result2 = collection.contains("bbb");
        System.out.println(result2);
        boolean empty = collection.isEmpty();
        System.out.println(empty);
    }

    private static void method1(Collection<String> collection) {
        collection.removeIf(
                (String s)->{return s.length() == 3;}
        );
        System.out.println(collection);
    }
}
