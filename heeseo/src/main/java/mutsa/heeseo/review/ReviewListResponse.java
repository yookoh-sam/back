package mutsa.heeseo.review;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ReviewListResponse {
    List<ReviewResponse> reviews;
    int numOfReview;
}
