package mutsa.heeseo.review;

import lombok.Getter;
import mutsa.heeseo.store.StoreResponse;
import mutsa.heeseo.user.UserResponse;
import mutsa.heeseo.user.UserService ;
import mutsa.heeseo.review.ReviewService;


@Getter
public class ReviewResponse {


        private Long reviewId;
        private StoreResponse store;
        private UserResponse userInfo;
        private String content;


    public ReviewResponse(Review review) {
        this.reviewId = review.getReviewId();
        this.store = new StoreResponse(review.getStore());
        this.userInfo = new UserResponse(review.getUser());
        this.content = review.getContent();
    }
}
