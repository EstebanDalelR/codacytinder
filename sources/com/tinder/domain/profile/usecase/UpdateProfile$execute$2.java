package com.tinder.domain.profile.usecase;

import com.tinder.domain.profile.model.EditProfileUpdateStatus;
import com.tinder.domain.profile.model.ProfileUserUpdateRequest;
import io.reactivex.C3960g;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/tinder/domain/profile/model/EditProfileUpdateStatus;", "kotlin.jvm.PlatformType", "updateRequest", "Lcom/tinder/domain/profile/model/ProfileUserUpdateRequest;", "apply"}, k = 3, mv = {1, 1, 10})
final class UpdateProfile$execute$2<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ UpdateProfile this$0;

    UpdateProfile$execute$2(UpdateProfile updateProfile) {
        this.this$0 = updateProfile;
    }

    public final C3960g<EditProfileUpdateStatus> apply(@NotNull ProfileUserUpdateRequest profileUserUpdateRequest) {
        C2668g.b(profileUserUpdateRequest, "updateRequest");
        if (profileUserUpdateRequest.hasChanges()) {
            return this.this$0.profileRemoteRepository.update(profileUserUpdateRequest).a(EditProfileUpdateStatus.UPDATED);
        }
        return C3960g.a(EditProfileUpdateStatus.NO_CHANGE);
    }
}
