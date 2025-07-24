package mutsa.heeseo.review;

import lombok.Getter;
import mutsa.heeseo.user.UserService ;
import mutsa.heeseo.review.ReviewService;


@Getter
public class ReviewResponse {


        private Long reviewId;
        private Long userId;
        private Long storeId;
        private String content;

        public ReviewResponse(Review review) {
            this.reviewId = review.getReviewId();
            this.userId = review.getUser().getUserId();
            this.storeId = review.getStore().getStoreId();
            this.content = review.getContent();
        }


}
