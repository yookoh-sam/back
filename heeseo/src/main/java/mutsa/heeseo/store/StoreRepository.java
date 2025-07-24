package mutsa.heeseo.store;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StoreRepository extends JpaRepository<Store, Long> {

    // 매장 이름으로 검색
    List<Store> findByName(String name);
}
