package am.user.application.service;

import am.user.application.dto.request.RegisterRequest;
import am.user.core.domain.UserAccount;
import am.user.core.domain.UserRole;
import am.user.core.service.UserAccountService;
import am.user.core.service.UserBusinessService;
import am.user.core.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserBusinessServiceImpl implements UserBusinessService {

    private final UserAccountService userAccountService;
    private final UserProfileService userProfileService;

    @Override
    public UserAccount register(RegisterRequest request, UserRole role) {
        UserAccount account = userAccountService.add(request.getAccountRequest(), role);
        userProfileService.add(request.getProfileRequest(), account);
        return account;
    }
}
