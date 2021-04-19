public class Exercise1 {
    public static int smaller(int a, int b) {
        return a <= b ? a : b;
    }

    public static void main(String[] args) {
        /* java: incompatible types: int cannot be converted to java.lang.String */
        // String x = smaller(10, 20) + 3;
        int x = smaller(10, 20) + 3;
    }
}
