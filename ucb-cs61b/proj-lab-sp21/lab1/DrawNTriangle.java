public class DrawNTriangle {
    public static void drawTriangle(int n ) {
        int rowSize = n;
        int colSize = 1;
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                System.out.print("*");
            }
            System.out.println("");
            colSize++;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        drawTriangle(n);
    }
}
