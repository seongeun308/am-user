package am.user.core.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserProfile {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long profileId;
    private String nickname;
    private String bio;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserAccount userAccount;
}
