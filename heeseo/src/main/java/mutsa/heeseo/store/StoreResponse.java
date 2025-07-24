package mutsa.heeseo.store;

public class StoreResponse {


    private Long id;
    private String name;

    public StoreResponse(Store store) {
        this.id=store.getStoreId();
        this.name=store.getName();

    }
}
