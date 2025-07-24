package mutsa.heeseo.store;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="store")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long storeId;

    private String name;


}
