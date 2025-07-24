package mutsa.heeseo.storelike;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.NoArgsConstructor;
import mutsa.heeseo.store.Store;
import mutsa.heeseo.user.User;

@Entity
@NoArgsConstructor
public class StoreLike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long storeLikeId;

    @ManyToOne
    @JoinColumn(name = "storeId")
    private Store store;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    public StoreLike(Store store, User user) {
        this.store = store;
        this.user = user;
    }
}

