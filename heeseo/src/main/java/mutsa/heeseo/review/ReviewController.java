package mutsa.heeseo.review;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor

public class ReviewController {

    private ReviewService reviewService;

//    @PostMapping("/store/{storeId}/reviews")
//    public ResponseEntity<ReviewResponse> createReview(@RequestBody ReviewRequest request) {
//        reviewService.createReview(request);
//    }

}
