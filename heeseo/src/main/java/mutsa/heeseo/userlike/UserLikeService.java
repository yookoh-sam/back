package mutsa.heeseo.userlike;

import lombok.RequiredArgsConstructor;
import mutsa.heeseo.user.User;
import mutsa.heeseo.user.UserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserLikeService {

    private final UserlikeRepository userlikeRepository;
    private final UserRepository userRepository;
    public Long followToggle(Long fromId, Long toId) {
        if(fromId == toId){
            throw new IllegalStateException("본인은 팔로우 할 수 없습니다");
        }
        User fromUser = userRepository.findById(fromId)
                .orElseThrow(() -> new IllegalStateException("해당 fromId를 id로 가지는 유저가 존재하지 않습니다."));
        User toUser = userRepository.findById(toId)
                .orElseThrow(() -> new IllegalStateException("해당 toId를 id로 가지는 유저가 존재하지 않습니다."));
        if(userlikeRepository.findByFromUser_UserIdAndToUser_UserId(fromUser.getUserId(), toUser.getUserId()).isPresent()) {
            UserLike follow = userlikeRepository.findByFromUser_UserIdAndToUser_UserId(fromUser.getUserId(),
                    toUser.getUserId()).get();
            userlikeRepository.delete(follow);
            return -1L;
        }else{
            UserLike follow = new UserLike(fromUser, toUser);
            return userlikeRepository.save(follow).getUserLikeId();
        }
    }
}
