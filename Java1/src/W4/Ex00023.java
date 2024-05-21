public class Ex00023 {
    public static void main(String[] args) {
        int array2[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j]);
                System.out.print(',');
            }
            System.out.println();
        }

    }
}