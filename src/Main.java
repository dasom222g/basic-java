import java.util.*;

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

        // Scanner: 사용자의 입력값을 받기위한 라이브러리로 관련 기능의 인스턴스 객체 반환
        Scanner scanner = new Scanner(System.in);

        // 문자열을 입력받을수 있는 메서드 호출
        /*
        *
        System.out.print("이름을 입력하세요: ");
        String userName = scanner.nextLine(); // nextLine: 문자열 반환

        System.out.print("나이를 입력하세요: ");
        int userAge =  scanner.nextInt(); // nextInt: 정수 반환

        System.out.print("키을 입력하세요: ");
        double userHeight =  scanner.nextDouble(); // nextDouble: 실수 반환

        System.out.printf("내 이름은 %s 이고 나이는 %d 살이며 키는 %.1fcm 입니다", userName, userAge, userHeight);
        */

        // 사용자가 입력한 점수가 80점 이상이면 "A등급", 70점 이상이면 "B등급", 그외는 "C등급" 출력
        /*
        System.out.println("점수를 입력하세요: ");
        int score = scanner.nextInt();
        String level = "C";
        if (score >= 80) {
            level = "A";
        } else if (score >= 70) {
            level = "B";
        }

        System.out.println(level + "등급");

        scanner.close();
         */

        // java에서의 배열은 {}로 감싸주고 등록되는 모든 값은 자료형이 동일해야 함

        /*
         * 자바에서 Array와 List의 차이점
         * Array: 크기 고정, 값 추가 불가
         * List: 크기 가변, 값 추가 가능
         * */


        // 배열(Array)
        String[] colors = {"red", "green", "blue"};
        System.out.println("colors address: " + colors); // 배열의 주소 출력
        System.out.println("colors: " + Arrays.toString(colors)); // 배열값 출력

        // 리스트(List)
        List<String> names = new ArrayList<>();
        // 가변형이기 때문에 names인스턴스에서는 add, remove같은 데이터 변경 가능한 메서드 존재
        names.add("후츠릿");
        names.add("김다솜");
        System.out.println("names1" + names);

        names.remove("후츠릿");

        System.out.println("names2" + names);

        /*
        * map: 객체
        * */

        // value에 다양한 데이터타입으로 구성되어야 하는경우엔 "Object"로 구성
        Map<String, Object> student1 = new HashMap<>();
        student1.put("name", "chutzrit");
        student1.put("age", 20);
        student1.put("isFemale", true);

        System.out.println("student1" + student1);


    }

}