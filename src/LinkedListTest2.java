import java.util.LinkedList;

public class LinkedListTest2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        list.addFirst("qqq");
        list.addLast("eee");
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

    }
}
