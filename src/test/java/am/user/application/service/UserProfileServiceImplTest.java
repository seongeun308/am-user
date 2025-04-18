package am.user.application.service;

import am.user.application.dto.request.ProfileRequest;
import am.user.application.repository.UserAccountRepository;
import am.user.core.domain.UserAccount;
import am.user.core.domain.UserProfile;
import am.user.core.domain.UserRole;
import am.user.core.service.UserProfileService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserProfileServiceImplTest {

    @Autowired
    private UserProfileService userProfileService;
    @Autowired
    private UserAccountRepository userAccountRepository;

    @Test
    void 프로필_저장_성공_시_profile_반환() {
        ProfileRequest request = new ProfileRequest();
        request.setNickname("hello");
        request.setBio("i am hello");

        UserAccount account = saveRandomAccount();
        UserProfile profile = userProfileService.add(request, account);

        assertNotNull(profile);
        assertEquals(account.getUserId(), profile.getUserAccount().getUserId());
        assertEquals(request.getNickname(), profile.getNickname());
        assertEquals(request.getBio(), profile.getBio());
    }

    private UserAccount saveRandomAccount() {
        long num = getRandomNumber();
        UserAccount account = UserAccount.builder()
                .email("test" + num + "@gmail.com")
                .password("test123!")
                .role(UserRole.USER)
                .build();

        return userAccountRepository.save(account);
    }

    private long getRandomNumber() {
        return new Random().nextLong();
    }
}