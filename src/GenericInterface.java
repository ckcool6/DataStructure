public class GenericInterface {
    public static void main(String[] args) {
        GenericityImpl<String> genericity = new GenericityImpl<>();
        genericity.method("hahahaha");
    }
}

interface Genericity<E> {
    void method(E e);
}

class GenericityImpl<E> implements Genericity<E> {

    @Override
    public void method(E e) {
        System.out.println(e);
    }
}
