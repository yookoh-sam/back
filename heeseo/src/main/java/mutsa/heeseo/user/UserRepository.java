package mutsa.heeseo.user;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findBySocialIdAndSocialType(String socialId, SocialType socialType);

    boolean existsBySocialIdAndSocialType(String socialId, SocialType socialType);

    Optional<User> findBySocialId(String socialId);

}
