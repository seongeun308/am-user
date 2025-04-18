package am.user.core.service;

import am.user.application.dto.UserAccountDto;
import am.user.core.domain.UserAccount;

public interface UserAccountService {
    UserAccount add(UserAccountDto accountDto);
}
