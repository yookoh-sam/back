package mutsa.heeseo.user;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class UserRequest {

    private String nickname;

    public  User toEntity() {
        return new User(nickname);
    }
}
