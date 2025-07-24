package mutsa.heeseo.user;

public class UserResponse {

    private Long id;
    private String name;

    public UserResponse(User user) {

        this.id = user.getUserId();
        this.name = user.getNickname();

    }
}
