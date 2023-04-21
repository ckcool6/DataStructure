import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class GenericTest {
    public static void main(String[] args) {
        //method1();
        ArrayList<String> list = new ArrayList<>();
        list.add("haha");
        list.add("haha1");
        list.add("haha2");

        Object[] array = list.toArray();
        System.out.println(Arrays.toString(array));
        String[] array1 = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(array1));

    }

    private static void method1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        System.out.println(list);

        MyGenericClass<String> myGenericClass = new MyGenericClass<>();
        myGenericClass.setElement("字符串");
        String element = myGenericClass.getElement();
        System.out.println(element);
    }
}
