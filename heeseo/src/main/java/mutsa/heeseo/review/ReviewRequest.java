package mutsa.heeseo.review;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ReviewRequest {
    private Long userId;
    private String content;
}
