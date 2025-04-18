package am.user.application.service;

import am.user.application.dto.request.ProfileRequest;
import am.user.application.repository.UserProfileRepository;
import am.user.common.mapper.UserMapper;
import am.user.core.domain.UserAccount;
import am.user.core.domain.UserProfile;
import am.user.core.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserProfileServiceImpl implements UserProfileService {

    private final UserProfileRepository userProfileRepository;

    @Override
    public UserProfile add(ProfileRequest request, UserAccount account) {
        UserProfile profile = UserMapper.toProfile(request, account);
        return userProfileRepository.save(profile);
    }
}
