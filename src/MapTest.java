import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("hj001", "小美");
        map.put("hj002", "李四");
        map.put("hj003", "小张");
        map.put("hj004", "小黑");
        map.put("hj005", "小白");

        System.out.println(map);
        map.remove("hj001");
        System.out.println(map);
        boolean result = map.containsKey("hj002");
        System.out.println(result);

    }
}
