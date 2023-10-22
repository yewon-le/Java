import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("그룹명을 입력하세요: ");
        String group = scanner.nextLine();
        System.out.print("인원수를 입력하세요: ");
        int su = scanner.nextInt();

        String[] names = new String[su];
        double[] ki = new double[su];

        for (int i = 0; i < su; i++) {
            scanner.nextLine();
            System.out.print("이름: ");
            names[i] = scanner.nextLine();
            System.out.print("키: ");
            ki[i] = scanner.nextDouble();
        }

        double totalKi = 0;
        for (double k : ki) {
            totalKi += k;
        }
        double averageKi = totalKi / su;

        System.out.println(group + "의 평균키 = " + averageKi);
        System.out.print("평균 키 이상인 멤버:");
        for (int i = 0; i < su; i++) {
            if (ki[i] > averageKi) {
                System.out.print(names[i] + " = " + ki[i]);
            }
        }

        scanner.close();
    }
}
