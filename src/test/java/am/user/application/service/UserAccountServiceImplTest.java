package am.user.application.service;

import am.user.application.dto.request.AccountRequest;
import am.user.core.domain.UserAccount;
import am.user.core.domain.UserRole;
import am.user.core.service.UserAccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserAccountServiceImplTest {

    @Autowired
    private UserAccountService userAccountService;

    @Test
    void 계정_저장_성공_시_account_반환() {
        AccountRequest request = new AccountRequest();
        request.setEmail("test@test.com");
        request.setPassword("test123!");

        UserAccount account = userAccountService.add(request, UserRole.USER);

        assertThat(account.getUserId()).isNotNull();
        assertEquals(request.getEmail(), account.getEmail());
        assertEquals(request.getPassword(), account.getPassword());
    }
}