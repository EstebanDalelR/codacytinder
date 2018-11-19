package com.tinder.common;

import com.tinder.domain.common.model.Instagram;
import com.tinder.domain.common.model.ProfileUser;
import com.tinder.domain.common.model.User;
import com.tinder.domain.profile.model.FacebookInformation;
import com.tinder.domain.profile.model.GenderSettings;
import kotlin.Metadata;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0017\u0010\u0002\u001a\u0013\u0018\u00010\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u00052\u0015\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b2\u0015\u0010\t\u001a\u00110\n¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u000b2\u0015\u0010\f\u001a\u00110\r¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u000e2\u0015\u0010\u000f\u001a\u00110\u0010¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0011¢\u0006\u0002\b\u0012"}, d2 = {"<anonymous>", "Lcom/tinder/domain/common/model/ProfileUser;", "p1", "Lkotlin/ParameterName;", "name", "legacyMetaUser", "p2", "Lcom/tinder/domain/common/model/User;", "profileV2User", "p3", "Lcom/tinder/domain/profile/model/GenderSettings;", "genderSettings", "p4", "Lcom/tinder/domain/common/model/Instagram;", "instagram", "p5", "Lcom/tinder/domain/profile/model/FacebookInformation;", "facebookInformation", "invoke"}, k = 3, mv = {1, 1, 10})
final class ProfileV2CurrentUserProvider$observe$1 extends FunctionReference implements Function5<ProfileUser, User, GenderSettings, Instagram, FacebookInformation, ProfileUser> {
    ProfileV2CurrentUserProvider$observe$1(C12791q c12791q) {
        super(5, c12791q);
    }

    public final String getName() {
        return "mergeUsers";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C12791q.class);
    }

    public final String getSignature() {
        return "mergeUsers(Lcom/tinder/domain/common/model/ProfileUser;Lcom/tinder/domain/common/model/User;Lcom/tinder/domain/profile/model/GenderSettings;Lcom/tinder/domain/common/model/Instagram;Lcom/tinder/domain/profile/model/FacebookInformation;)Lcom/tinder/domain/common/model/ProfileUser;";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m54054a((ProfileUser) obj, (User) obj2, (GenderSettings) obj3, (Instagram) obj4, (FacebookInformation) obj5);
    }

    @Nullable
    /* renamed from: a */
    public final ProfileUser m54054a(@Nullable ProfileUser profileUser, @NotNull User user, @NotNull GenderSettings genderSettings, @NotNull Instagram instagram, @NotNull FacebookInformation facebookInformation) {
        C2668g.b(user, "p2");
        C2668g.b(genderSettings, "p3");
        C2668g.b(instagram, "p4");
        C2668g.b(facebookInformation, "p5");
        return ((C12791q) this.receiver).m50283a(profileUser, user, genderSettings, instagram, facebookInformation);
    }
}
