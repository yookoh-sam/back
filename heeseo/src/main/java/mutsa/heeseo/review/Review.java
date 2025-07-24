package mutsa.heeseo.review;

import jakarta.persistence.*;
import lombok.*;
import mutsa.heeseo.store.Store;
import mutsa.heeseo.user.User;

@Entity
@Table(name="review")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "storeId")
    private Store store;

    private String content;


}
