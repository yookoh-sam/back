package mutsa.heeseo.storelike;

import lombok.RequiredArgsConstructor;
import mutsa.heeseo.store.Store;
import mutsa.heeseo.store.StoreRepository;
import mutsa.heeseo.user.User;
import mutsa.heeseo.user.UserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StoreLikeService {

    private final StoreLikeRepository storeLikeRepository;
    private final StoreRepository storeRepository;
    private final UserRepository userRepository;

    public StoreLikeResponse likeToggle(Long storeId, StoreLikeRequest request) {
        Store store = storeRepository.findById(storeId)
                .orElseThrow(() -> new IllegalStateException("해당 Id를 가진 store가 없습니다."));
        User user = userRepository.findById(request.getUserId())
                .orElseThrow(() -> new IllegalStateException("해당 Id를 가진 유저가 존재하지 않습니다"));

        if (storeLikeRepository.existsByUserUserIdAndStoreStoreId(user.getUserId(),
                store.getStoreId())) {
            StoreLike storeLike = storeLikeRepository.findByUserUserIdAndStoreStoreId(
                    user.getUserId(), storeId).get();
            storeLikeRepository.delete(storeLike);
            return new StoreLikeResponse("좋아요 취소됨");
        }else{
            StoreLike storeLike = new StoreLike(store, user);
            storeLikeRepository.save(storeLike);
            return new StoreLikeResponse("좋아요 성공");
        }
    }

}
