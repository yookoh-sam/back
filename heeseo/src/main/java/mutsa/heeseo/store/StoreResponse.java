package mutsa.heeseo.store;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class StoreResponse {


    private Long id;
    private String name;

    public StoreResponse(Store store) {
        this.id=store.getStoreId();
        this.name=store.getName();

    }
}
