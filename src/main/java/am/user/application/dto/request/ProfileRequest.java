package am.user.application.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class ProfileRequest {
    private String nickname;
    private String bio;
}
