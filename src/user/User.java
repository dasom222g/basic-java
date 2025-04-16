package user;

public class User {
    private String name;
    public int age;

    private String userId;
    private String email;

    // 생성자 함수: 클래스 이름과 동일, 반환값 없음
    public User(String name, int age, String userId, String email) {
        this.name = name;
        this.age = age;
        this.userId = userId;
        this.email = email;
    }

    // 매개변수 없는 생성자 함수
    public User() {
        // 임의의 값으로 초기화
        this.name = "Anonymous";
        this.age = 0;
        this.userId = "";
        this.email = "";
    }

    // name getter, setter
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // userId getter, setter
    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    // email getter, setter
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
