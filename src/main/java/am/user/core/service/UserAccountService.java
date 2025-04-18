package am.user.core.service;

import am.user.application.dto.request.AccountRequest;
import am.user.core.domain.UserAccount;
import am.user.core.domain.UserRole;

public interface UserAccountService {
    UserAccount add(AccountRequest request, UserRole role);
}
