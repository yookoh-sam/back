package mutsa.heeseo.userlike;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import mutsa.heeseo.store.Store;
import mutsa.heeseo.user.User;

public class UserLike {
    @Id
    private Long userLikeId;

    @ManyToOne
    @JoinColumn(name = "fromId")
    private User fromUser;

    @ManyToOne
    @JoinColumn(name = "toId")
    private User toUser;
}
