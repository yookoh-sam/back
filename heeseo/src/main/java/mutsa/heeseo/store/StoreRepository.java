package mutsa.heeseo.store;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StoreRepository {

    List<Store> name(String name);

    //매장 검색
    List<Store> findbyName(String name);
    
}
