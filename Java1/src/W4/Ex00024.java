import java.util.Scanner;

public class Ex00024 {
    public static void main(String[] args) {
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("국어 점수를 입력하세요 : ");
        double korean = scanner.nextDouble();
        System.out.println("영어 점수를 입력하세요 : ");
        double english = scanner.nextDouble();
        System.out.println("수학 점수를 입력하세요 : ");
        double math = scanner.nextDouble();
        double score[] = { korean, english, math };
        String subject[] = { "국어", "영어", "수학" };

        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }

        System.out.println("국어 점수 : " + score[0] + "점");
        System.out.println("영어 점수 : " + score[1] + "점");
        System.out.println("수학 점수 : " + score[2] + "점");

        double max = Math.max(korean, Math.max(english, math));
        double min = Math.min(korean, Math.min(english, math));

        System.out.println("평균 점수 : " + sum / score.length + "점");
        if (korean == max) {
            System.out.println("최고점 과목 : " + subject[0] + ",   점수 : " + korean + "점");
        } else if (english == max) {
            System.out.println("최고점 과목 : " + subject[2] + ",   점수 : " + math + "점");
        } else if (math == max) {
            System.out.println("최고점 과목 : " + subject[1] + ",   점수 : " + english + "점");
        }

        if (korean == min) {
            System.out.println("최저점 과목 : " + subject[0] + ",   점수 : " + korean + "점");
        } else if (english == min) {
            System.out.println("최저점 과목 : " + subject[1] + ",   점수 : " + english + "점");
        } else if (math == min) {
            System.out.println("최저점 과목 : " + subject[2] + ",   점수 : " + math + "점");
        }
        scanner.close();
    }

}
