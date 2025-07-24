package mutsa.heeseo.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UserResponse {

    private Long id;
    private String nickname;
    private int score;

    public UserResponse(User user, int score) {

        this.id = user.getUserId();
        this.nickname = user.getNickname();
        this.score = score;
    }


    public UserResponse(User user) {
        this.id = user.getUserId();
        this.nickname = user.getNickname();
    }

    public static UserResponse from(User user, int score) {
        return new UserResponse(user,score);
    }
}

