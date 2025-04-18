package am.user.core.service;

import am.user.application.dto.request.RegisterRequest;
import am.user.core.domain.UserAccount;

public interface UserBusinessService {
    UserAccount register(RegisterRequest request);
}
