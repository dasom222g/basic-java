public class User {
    private String name;
    public int age;

    // 생성자 함수: 클래스 이름과 동일, 반환값 없음
    public User(String userName, int userAge) {
        name = userName;
        age = userAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String userName) {
        name = userName;
    }
}
