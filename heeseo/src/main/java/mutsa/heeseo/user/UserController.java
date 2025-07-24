package mutsa.heeseo.user;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    //유저 생성
    @PostMapping
    public ResponseEntity<Long> addUser(@RequestBody UserRequest userRequest) {
        log.info("user post");
//        log.info("nickname"+ userRequest)
        Long id = userService.createUser(userRequest);
        return ResponseEntity.ok(id);
    }


    // 유저 정보 불러오기 (id로 조회)
    @GetMapping("/{userId}")
    public ResponseEntity<UserResponse> getUser(@PathVariable Long userId) {

        UserResponse userResponse = userService.getUserById(userId);

        return ResponseEntity.ok(userResponse);
    }

}
