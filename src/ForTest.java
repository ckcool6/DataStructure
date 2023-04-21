//增强for循环

import java.util.ArrayList;

public class ForTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        for (String str : list) {
            System.out.println(str);
        }
        for (String str : list) {
            str = "q";    //不会修改集合里的值
            System.out.println(str);
        }

        System.out.println(list);
    }
}
