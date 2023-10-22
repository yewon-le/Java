import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        String[] gmArr = {"국어", "영어", "수학", "미술", "체육"};
        int[] scoreArr = new int[5];
        
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print(gmArr[i] + " = ");
            scoreArr[i] = scanner.nextInt();
        }
    
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += scoreArr[i];
        }
        double average = (double) sum / 5;

        System.out.println("---------------성적 처리 -------");
        for (int i = 0; i < 5; i++) {
            System.out.println(gmArr[i] + " = " + scoreArr[i]);
        }
        System.out.println("합계 = " + sum);
        System.out.println("평균 = " + average);
        System.out.println("-------------------------------");
    }
}
