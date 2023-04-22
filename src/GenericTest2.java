import java.util.ArrayList;

public class GenericTest2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        printList(list1);
        printList(list2);
    }

    private static void printList(ArrayList<?> list) {

    }
    private static void method1(ArrayList<? extends Number> list) {

    }
    private static void method2(ArrayList<? super Number> list) {

    }
}
