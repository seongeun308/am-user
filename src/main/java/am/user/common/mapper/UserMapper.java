package am.user.common.mapper;

import am.user.application.dto.request.AccountRequest;
import am.user.application.dto.request.ProfileRequest;
import am.user.core.domain.UserAccount;
import am.user.core.domain.UserProfile;
import am.user.core.domain.UserRole;

public abstract class UserMapper {

    public static UserAccount toAccount(AccountRequest accountRequest, UserRole role) {
        return UserAccount.builder()
                .email(accountRequest.getEmail())
                .password(accountRequest.getPassword())
                .role(role)
                .build();
    }

    public static UserProfile toProfile(ProfileRequest profileRequest, UserAccount userAccount) {
        return UserProfile.builder()
                .userAccount(userAccount)
                .nickname(profileRequest.getNickname())
                .bio(profileRequest.getBio())
                .build();
    }
}
