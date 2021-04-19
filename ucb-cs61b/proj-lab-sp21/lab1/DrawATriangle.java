public class DrawATriangle {
    public static void main(String[] args) {
        int rowSize = 5;
        int colSize = 1;
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                System.out.print("*");
            }
            System.out.println("");
            colSize++;
        }
    }
}