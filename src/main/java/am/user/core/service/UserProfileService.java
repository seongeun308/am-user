package am.user.core.service;

import am.user.application.dto.request.ProfileRequest;
import am.user.core.domain.UserAccount;
import am.user.core.domain.UserProfile;

public interface UserProfileService {
    UserProfile add(ProfileRequest request, UserAccount account);
}
