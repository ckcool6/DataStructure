import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StreamTest2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(
                List.of("aaa",
                        "aaa",
                        "ccc",
                        "ddd",
                        "eee"));
        //System.out.println(list);

        list.stream().filter(
                s -> s.startsWith("a")
        ).forEach(
                s -> System.out.println(s));
    }
}
