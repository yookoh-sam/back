package mutsa.heeseo.userlike;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserlikeRepository extends JpaRepository<UserLike,Long> {


    Optional<UserLike> findByFromUser_UserIdAndToUser_UserId(Long fromUserId, Long toUserId);

    List<UserLike> findByFromUser_UserId(Long fromUserId);

    List<UserLike> findByToUser_UserId(Long toUserId);
}
