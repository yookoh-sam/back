package mutsa.heeseo.user;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name="user")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder

public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String nickname;


}
