package mutsa.heeseo.store;

import mutsa.heeseo.store.Store;
import mutsa.heeseo.store.StoreService;
import lombok.RequiredArgsConstructor;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/store/{storeId}")
@RequiredArgsConstructor

public class StoreController {

private final StoreService storeService;

//가게 정보 불러오기
@GetMapping("/{storeId}")
    public ResponseEntity<Store> getStoreById(@PathVariable Long storeId) {
        Store store = storeService.getStoreById(storeId);
        return ResponseEntity.ok(store);
    }

}
