package mutsa.heeseo.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

//    public Long createUser(UserRequest userRequest) {
//        User user = userRequest.toEntity();
//        return userRepository.save(user).getUserId();
//    }


}
