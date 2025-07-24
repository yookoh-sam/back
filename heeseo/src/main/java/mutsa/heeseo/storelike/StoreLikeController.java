package mutsa.heeseo.storelike;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StoreLikeController {

    private final StoreLikeService storeLikeService;

    @PostMapping("store/{storeId}/likes")
    public ResponseEntity<StoreLikeResponse> likeToggle(@PathVariable Long storeId,
            @RequestBody StoreLikeRequest request) {
        return ResponseEntity.ok(storeLikeService.likeToggle(storeId, request));

    }
}
