package am.user.application.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class ProfileRequest {
    @NotBlank(message = "닉네임은 필수 입력값입니다.")
    @Pattern(regexp = "^[a-z0-9_]{1,30}$", message = "닉네임은 영문 대소문자, 숫자, 특수문자만 가능하며 최대 30자 입니다")
    private String nickname;
    private String bio;
}
