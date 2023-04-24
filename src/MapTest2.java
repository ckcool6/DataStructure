import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest2 {
    public static void main(String[] args) {
        Map<String, String> couple = new HashMap<>();

        couple.put("001H", "001W");
        couple.put("002H", "002W");
        couple.put("003H", "003W");
        couple.put("004H", "004W");
        couple.put("005H", "005W");

        Set<String> keys = couple.keySet();
        for (String key : keys) {
            String value = couple.get(key);
            System.out.println(key + "---" + value);
        }
        System.out.println("---------------------------------");

        Set<Map.Entry<String, String>> entries = couple.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "---" + value);
        }
        System.out.println("----------------------------------");
        couple.forEach(
                (String key, String value) -> {
                    System.out.println(key + "---" + value);
                }
        );
    }
}
