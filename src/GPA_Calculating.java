import java.util.Scanner;
public class GPA_Calculating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 이수 학점을 사용자가 입력한다.
        System.out.print("Java 과목 이수 학점을 입력하세요: ");
        double java = scanner.nextDouble();

        System.out.print("Mobile 과목 이수 학점을 입력하세요: ");
        double mobile = scanner.nextDouble();

        System.out.print("Excel 과목 이수 학점을 입력하세요: ");
        double excel = scanner.nextDouble();

        // 사용자로부터 각 과목의 성적 입력받기
        System.out.print("Java 과목의 성적을 입력하세요. : ");
        String javaGrade = scanner.next();  // 문  자열  로 입력받기

        System.out.print("Mobile 과목의 등급을 입력하세요. : ");
        String mobileGrade = scanner.next();

        System.out.print("Excel 과목의 등급을 입력하세요. : ");
        String excelGrade = scanner.next();

        // 등급을 점수로 변환하는 메소드 사용
        double javaScore = getScore(javaGrade);
        double mobileScore = getScore(mobileGrade);
        double excelScore = getScore(excelGrade);


        double avg = (javaScore * java + mobileScore * mobile + excelScore * excel) / (java + mobile + excel);
        avg = Math.round(avg * 100.0) / 100.0;

        System.out.println("평균 학점: " + avg);
    }

    // 등급(String)을 점수(double)로 변환하는 메소드를 사용한다.
    public static double getScore(String grade) {
        switch (grade) {
            case "A": return 4.5;
            case "A0": return 4.0;
            case "B": return 3.5;
            default: return 0.0;  // 예외 처리용
        }
    }
}