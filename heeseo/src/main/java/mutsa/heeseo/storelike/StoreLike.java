package mutsa.heeseo.storelike;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import mutsa.heeseo.store.Store;
import mutsa.heeseo.user.User;

@Entity
public class StoreLike {

    @Id
    private Long storeLikeId;

    @ManyToOne
    @JoinColumn(name = "storeId")
    private Store store;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;
}
