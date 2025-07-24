package mutsa.heeseo.review;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import mutsa.heeseo.store.Store;
import mutsa.heeseo.user.User;

@Getter
@Setter
public class ReviewRequest {

        private Long userId;
        private Long storeId;
        private String content;
    }




