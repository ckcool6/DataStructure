import java.util.ArrayList;

public class SteamTest3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        list.stream().filter(s -> s % 2 == 0).forEach(s -> System.out.println(s));
        System.out.println("======================");
        for (Integer integer : list){
            System.out.println(integer);
        }
    }
}
