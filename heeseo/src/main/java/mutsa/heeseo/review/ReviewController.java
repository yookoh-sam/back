package mutsa.heeseo.review;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class ReviewController {

    private final ReviewService reviewService;


    //리뷰 생성
    @PostMapping("/store/{storeId}/reviews")
    public ResponseEntity<ReviewResponse> createReview(@PathVariable Long storeId,@RequestBody ReviewRequest request) {
        ReviewResponse response = reviewService.createReview(storeId, request);
        return ResponseEntity.ok(response);
    }

    //전체 리뷰리스트 조회

    @GetMapping("/store/{storeId}/reviews")
    public ResponseEntity<ReviewListResponse> getAllReviews(@PathVariable Long storeId) {
        ReviewListResponse reviews = reviewService.getAllReviewsByStoreId(storeId);
        return ResponseEntity.ok(reviews);
    }


}
