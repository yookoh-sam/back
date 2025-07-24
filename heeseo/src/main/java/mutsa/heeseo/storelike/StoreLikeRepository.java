package mutsa.heeseo.storelike;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreLikeRepository extends JpaRepository<StoreLike,Long> {
    Optional<StoreLike> findByUserUserIdAndStoreStoreId(Long userId, Long storeId);
    boolean existsByUserUserIdAndStoreStoreId(Long userId, Long storeId);


}
