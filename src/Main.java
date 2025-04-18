import user.User;
import user.UserHobby;

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

        // set: List와 비슷하지만 중복 값을 허용하지 않음
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);

        System.out.println(numbers); // [1, 2]

        /*
        * map: 객체
        * */

        // value에 다양한 데이터타입으로 구성되어야 하는경우엔 "Object"로 구성
        // Generic:<String, Object> 부분으로 파라미터에 어떤 자료형의 인자값이 전달되어야 하는지 호출시점에 지정하는 것
        Map<String, Object> student1 = new HashMap<>();
        student1.put("name", "chutzrit");
        student1.put("age", 20);
        student1.put("isFemale", true);

        System.out.println("student1 추가 후" + student1);

        // 데이터 불러오기
        System.out.println("name: " + student1.get("name"));

        // 데이터 변경
        student1.put("name", "후츠릿");
        System.out.println("student1 변경 후" + student1);

        // 데이터 삭제
        student1.remove("isFemale");
        System.out.println("student1 삭제 후" + student1);

        // 미션1: 정수 배열을 받아 총 합을 구하는 메서드
        // List<Integer> numberList = new ArrayList<>();
        int[] numberList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("numberList[0]" + numberList[0]); // 배열에서 요소를 꺼내오는 법

        int sum = 0;
        for (int number: numberList) {
            // number: 배열의 각 요소
            sum += number;
        }
        System.out.println("sum: " + sum);

        // 미션2: Map을 사용해 여러명의 사용자 정보를 저장하고 줄력(이름, 나이, 이메일)
        List<Map<String, Object>> userInfoList = new ArrayList<>();

        // 각 사용자 정보
        Map<String, Object> user1 = Map.of("name", "후츠릿", "age", 30, "email", "aaa@gmail.com");
        Map<String, Object> user2 = Map.of("name", "김다솜", "age", 25, "email", "bbb@gmail.com");
        Map<String, Object> user3 = Map.of("name", "이유진", "age", 19, "email", "ccc@gmail.com");

        userInfoList.add(user1);
        userInfoList.add(user2);
        userInfoList.add(user3);

        System.out.println("userInfoList" + userInfoList);

        System.out.println("userInfoList 첫번째 요소" + userInfoList.get(0)); // List형식에서 요소를 꺼내오는 방법

        for(Map<String, Object> user: userInfoList) {
            System.out.println("userName: " + user.get("name"));
        }

        // --------------------------------------------------------------

        // 클래스와 객체
        // 동일한 품질의 데이터를 생성하기 위해 클래스를 정의하고 클래스에서 데이터의 흐름을 강제함
        Car myCar = new Car(); // 인스턴스 생성
        myCar.color = "빨강"; // 인스턴스의 멤버변수 값 변경
        myCar.drive(); // 인스턴스의 메소드 호출

        User chuztrit = new User("후츠릿", 20, "chutzrit", "aaa#gmail.com");
        User noUser = new User();

        chuztrit.setName("김다솜");
        String userName = chuztrit.getName();
        int userAge = chuztrit.age;

        System.out.println("userName: " + userName);
        System.out.println("userAge: " + userAge);

        System.out.println("noUser Name =>" +  noUser.getName());
        System.out.println("noUser age =>" +  noUser.age);

        List<String> hobbyList = new ArrayList<>(Arrays.asList("reading", "music", "drawing"));
        UserHobby childUser = new UserHobby("아이유", 30, "iu333", "bbb@gmail.com", hobbyList);

        System.out.println("childUser hobby: " + childUser.getHobbyList());
        System.out.println("childUser name: " + childUser.getName());

    /*
    * 객체지향
    * - 대단위 프로젝트에서 동일한 품질의 객체(인스턴스)를 대량 생성하기위한 시스템적인 툴
    * - 웹에서의 인스턴스: 개별적인 게시글(강제된 개별적 게시글 데이터 형식)
    * - 클래스: 인스턴스 생성하는 시스템적인 툴
    * - 인터페이스: 클래스의 형식을 강제하는 설계서로서 정의된 메소드가 실제 클래스에 구현되어있지 않으면 에러발생
    * - extends: 기존 클래스 상속받아 새로운 클래스에 확장
    * - override: 기존 클래스의 특정 메서드 덮어쓰기
    * */

    }
}
