package am.user.application.service;

import am.user.application.dto.request.AccountRequest;
import am.user.application.repository.UserAccountRepository;
import am.user.common.mapper.UserMapper;
import am.user.core.domain.UserAccount;
import am.user.core.domain.UserRole;
import am.user.core.service.PasswordEncoder;
import am.user.core.service.UserAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserAccountServiceImpl implements UserAccountService {

    private final UserAccountRepository userAccountRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserAccount add(AccountRequest request, UserRole role) {
        String encodedPassword = passwordEncoder.encode(request.getPassword());
        request.setPassword(encodedPassword);

        UserAccount account = UserMapper.toAccount(request, role);
        return userAccountRepository.save(account);
    }
}
