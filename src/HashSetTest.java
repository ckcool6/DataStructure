import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("hello");
        hs.add("world");
        hs.add("java");
        hs.add("java");

        Iterator<String> it = hs.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("==============================");

        for (String s : hs){
            System.out.println(s);
        }
    }
}
