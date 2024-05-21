public class Ex00015 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) { // 9가 될 때까지 단수 올리면서 반복
            for (int j = 1; j <= 9; j++) { // 9가 될 때까지 곱해지는 수를 올리면서 반복
                System.out.print(i + " × " + j + " = " + (i * j) + "\t"); // i * j = i*j 출력
            }
            System.out.println();
            if (i % 3 == 0) {
                System.out.println("--------------------");
            }
        }
    }
}