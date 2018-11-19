package com.tinder.domain.profile.usecase;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.model.Gender.Value;
import com.tinder.domain.common.model.User;
import com.tinder.domain.profile.model.GenderSettings;
import com.tinder.domain.profile.model.ProfileUserUpdateRequest;
import io.reactivex.functions.BiFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/domain/profile/model/ProfileUserUpdateRequest;", "user", "Lcom/tinder/domain/common/model/User;", "genderSettings", "Lcom/tinder/domain/profile/model/GenderSettings;", "apply"}, k = 3, mv = {1, 1, 10})
final class UpdateProfile$execute$1<T1, T2, R> implements BiFunction<User, GenderSettings, ProfileUserUpdateRequest> {
    final /* synthetic */ ProfileUserUpdateRequest $request;
    final /* synthetic */ UpdateProfile this$0;

    UpdateProfile$execute$1(UpdateProfile updateProfile, ProfileUserUpdateRequest profileUserUpdateRequest) {
        this.this$0 = updateProfile;
        this.$request = profileUserUpdateRequest;
    }

    @NotNull
    public final ProfileUserUpdateRequest apply(@NotNull User user, @NotNull GenderSettings genderSettings) {
        C2668g.b(user, ManagerWebServices.PARAM_USER);
        C2668g.b(genderSettings, "genderSettings");
        return this.$request.copy((String) this.this$0.valueIfChanged(this.$request.getBio(), user.bio()), (Value) this.this$0.valueIfChanged(this.$request.getGender(), user.gender().value()), (String) this.this$0.valueIfChanged(this.$request.getCustomGender(), user.gender().customGender()), (Boolean) this.this$0.valueIfChanged(this.$request.getShowGenderOnProfile(), Boolean.valueOf(genderSettings.getShowGenderOnProfile())));
    }
}
