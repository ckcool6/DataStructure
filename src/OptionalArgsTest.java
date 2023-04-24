public class OptionalArgsTest {
    public static void main(String[] args) {
        int sum = getSum(1, 2, 3, 4, 5);
        System.out.println(sum);
    }

    public static int getSum(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
