package com.tinder.domain.profile.usecase;

import com.tinder.domain.common.reactivex.usecase.SingleUseCase;
import com.tinder.domain.profile.model.EditProfileUpdateStatus;
import com.tinder.domain.profile.model.ProfileOption.ShowGender;
import com.tinder.domain.profile.model.ProfileOption.User;
import com.tinder.domain.profile.model.ProfileUserUpdateRequest;
import com.tinder.domain.profile.repository.ProfileLocalRepository;
import com.tinder.domain.profile.repository.ProfileRemoteRepository;
import io.reactivex.C3958c;
import io.reactivex.C3960g;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J)\u0010\f\u001a\u0004\u0018\u0001H\r\"\u0004\b\u0000\u0010\r2\b\u0010\u000e\u001a\u0004\u0018\u0001H\r2\b\u0010\u000f\u001a\u0004\u0018\u0001H\rH\u0002¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/domain/profile/usecase/UpdateProfile;", "Lcom/tinder/domain/common/reactivex/usecase/SingleUseCase;", "Lcom/tinder/domain/profile/model/ProfileUserUpdateRequest;", "Lcom/tinder/domain/profile/model/EditProfileUpdateStatus;", "profileLocalRepository", "Lcom/tinder/domain/profile/repository/ProfileLocalRepository;", "profileRemoteRepository", "Lcom/tinder/domain/profile/repository/ProfileRemoteRepository;", "(Lcom/tinder/domain/profile/repository/ProfileLocalRepository;Lcom/tinder/domain/profile/repository/ProfileRemoteRepository;)V", "execute", "Lio/reactivex/Single;", "request", "valueIfChanged", "T", "newValue", "existingValue", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class UpdateProfile implements SingleUseCase<ProfileUserUpdateRequest, EditProfileUpdateStatus> {
    private final ProfileLocalRepository profileLocalRepository;
    private final ProfileRemoteRepository profileRemoteRepository;

    @Inject
    public UpdateProfile(@NotNull ProfileLocalRepository profileLocalRepository, @NotNull ProfileRemoteRepository profileRemoteRepository) {
        C2668g.b(profileLocalRepository, "profileLocalRepository");
        C2668g.b(profileRemoteRepository, "profileRemoteRepository");
        this.profileLocalRepository = profileLocalRepository;
        this.profileRemoteRepository = profileRemoteRepository;
    }

    @NotNull
    public C3960g<EditProfileUpdateStatus> execute(@NotNull ProfileUserUpdateRequest profileUserUpdateRequest) {
        C2668g.b(profileUserUpdateRequest, "request");
        if (profileUserUpdateRequest.hasChanges()) {
            profileUserUpdateRequest = C3958c.a(this.profileLocalRepository.getProfileOption(User.INSTANCE), this.profileLocalRepository.getProfileOption(ShowGender.INSTANCE), new UpdateProfile$execute$1(this, profileUserUpdateRequest)).d(new UpdateProfile$execute$2(this));
            C2668g.a(profileUserUpdateRequest, "Maybe.zip(\n             …          }\n            }");
            return profileUserUpdateRequest;
        }
        profileUserUpdateRequest = C3960g.a(EditProfileUpdateStatus.NO_CHANGE);
        C2668g.a(profileUserUpdateRequest, "Single.just(EditProfileUpdateStatus.NO_CHANGE)");
        return profileUserUpdateRequest;
    }

    private final <T> T valueIfChanged(T t, T t2) {
        return (t == null || C2668g.a(t, t2) || (t2 == null && C2668g.a(t, "") != null)) ? null : t;
    }
}
