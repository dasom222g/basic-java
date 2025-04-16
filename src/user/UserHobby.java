package user;

import java.util.List;

public class UserHobby extends User {
    private List<String> hobbyList;

    // 생성자 함수
    public UserHobby (String name, int age, String userId, String email, List<String> hobbyList) {
        super(name, age, userId, email); // 부모의 생성자 호출하여 기본값 세팅
        this.hobbyList = hobbyList;
    }

    public List<String> getHobbyList() {
        return hobbyList;
    }

    public void setHobbyList(List<String> hobbyList) {
        this.hobbyList = hobbyList;
    }

    public void addHobby(String hobby) {
        this.hobbyList.add(hobby);
    }

    @Override
    public String getName() {
        return super.getName() + " 입니다!";
    }
}
