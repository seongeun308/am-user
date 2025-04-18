package am.user.core.service;

import am.user.application.dto.UserProfileDto;
import am.user.core.domain.UserProfile;

public interface UserProfileService {
    UserProfile add(UserProfileDto profileDto);
}
