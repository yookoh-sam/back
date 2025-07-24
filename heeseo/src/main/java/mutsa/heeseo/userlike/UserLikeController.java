package mutsa.heeseo.userlike;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserLikeController {

    private final UserLikeService userLikeService;
    @PostMapping("/user/likes")
    public ResponseEntity<Long> followToggle(@RequestBody UserLikeRequest followRequestDto) {
        return ResponseEntity.status(200)
                .body(userLikeService.followToggle(followRequestDto.getFromId(),
                        followRequestDto.getToId()));
    }
}
