package mutsa.heeseo.user;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    //유저 생성
        public User createUser(User user) {
            return userRepository.save(user);
        }



    //유저 정보 불러오기
        public User getUserById(Long id) {
            return userRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("유저가 조회되지 않습니다: " + id));
        }


}
