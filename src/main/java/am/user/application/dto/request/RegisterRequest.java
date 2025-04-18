package am.user.application.dto.request;

import lombok.Data;

@Data
public class RegisterRequest {
    private AccountRequest accountRequest;
    private ProfileRequest profileRequest;
}
