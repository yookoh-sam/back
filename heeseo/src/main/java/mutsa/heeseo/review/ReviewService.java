package mutsa.heeseo.review;

import java.util.List;
import lombok.RequiredArgsConstructor;
import mutsa.heeseo.store.Store;
import mutsa.heeseo.store.StoreRepository;
import mutsa.heeseo.user.User;
import mutsa.heeseo.user.UserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReviewService {

    private final ReviewRepository reviewRepository;
    private final StoreRepository storeRepository;
    private final UserRepository userRepository;

    // 리뷰 생성
    public ReviewResponse createReview(Long storeId, ReviewRequest request) {
        Store store = storeRepository.findById(storeId)
                .orElseThrow(() -> new RuntimeException("해당 가게를 찾을 수 없습니다: " + storeId));

        User user = userRepository.findById(request.getUserId())
                .orElseThrow(() -> new RuntimeException("해당 유저를 찾을 수 없습니다: " + request.getUserId()));

        Review review = new Review();
        review.setStore(store);
        review.setUser(user);
        review.setContent(request.getContent());

        Review saved = reviewRepository.save(review);
        return new ReviewResponse(saved);
    }

    // 특정 가게 리뷰 전체 조회
    public List<ReviewResponse> getAllReviewsByStoreId(Long storeId) {
        List<Review> reviews = reviewRepository.findAllByStoreId(storeId);
        return reviews.stream()
                .map(ReviewResponse::new)
                .collect(Collectors.toList());
    }
}
