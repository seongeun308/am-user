package am.user.application.dto.request;

import lombok.Data;

@Data
public class AccountRequest {
    private String email;
    private String password;
}
