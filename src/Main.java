import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 타입지정
        String name = "Chutzrit";
        int age = 20;
        double height = 171.2;
        boolean isFemale = true;

        // 문자열 템플릿 사용 (JDK 21, 미리보기 기능)
        // System.out.println(STR."My name is \{name} and I'm \{age} years old.");

        // System.out.println("Hello, World!");

        // 해당 클래스는 관련 기능 메서드들을 품고있는 인스턴스 객체를 반환
        Scanner scanner = new Scanner(System.in);

        // 문자열을 입력받을수 있는 메서드 호출
        System.out.print("이름을 입력하세요: ");
        String userName = scanner.nextLine(); // nextLine: 문자열 반환

        System.out.print("나이를 입력하세요: ");
        int userAge =  scanner.nextInt(); // nextInt: 정수 반환

        System.out.print("키을 입력하세요: ");
        double userHeight =  scanner.nextDouble(); // nextDouble: 실수 반환

        System.out.printf("내 이름은 %s 이고 나이는 %d 살이며 키는 %.1fcm 입니다", userName, userAge, userHeight);
    }

}