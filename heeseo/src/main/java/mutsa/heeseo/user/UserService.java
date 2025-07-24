package mutsa.heeseo.user;


import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mutsa.heeseo.userlike.UserLike;
import mutsa.heeseo.userlike.UserlikeRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private final UserRepository userRepository;
    private final UserlikeRepository userlikeRepository;

    //유저 생성
        public Long createUser(UserRequest userRequest) {
            User user = userRequest.toEntity();
            log.info("createUser" + user.getNickname());
            return userRepository.save(user).getUserId();
        }



    //유저 정보 불러오기
        public UserResponse getUserById(Long id) {
            User user = userRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("유저가 조회되지 않습니다: " + id));
            List<UserLike> byToUserUserId = userlikeRepository.findByToUser_UserId(id);
            return UserResponse.from(user,byToUserUserId.size());
        }

}
