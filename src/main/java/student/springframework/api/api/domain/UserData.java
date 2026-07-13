package student.springframework.api.api.domain;

import java.util.List;

public class UserData {

    List<User> userData;

    public List<User> getUserData() {
        return userData;
    }

    public void setUserData(List<User> userData) {
        this.userData = userData;
    }
}
