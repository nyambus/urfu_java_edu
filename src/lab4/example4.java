package lab4;

public class example4 {
    public static void main(String[] args) {
        int figure = 10;
        char[][] triangle = new char[figure][figure];
        int i;
        int j;
        for (i = 0; i < figure; i++) {
            for (j = 0; j <= i; j++) {
                triangle[i][j] = '+';
            }
        }
        for (i = 0; i < figure; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(triangle[i][j]);
            }
            System.out.println();
        }
    }
}
