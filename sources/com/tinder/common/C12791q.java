package com.tinder.common;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.core.experiment.ProfileV2MigrationExperiment.Experiment;
import com.tinder.data.user.CurrentUserProvider;
import com.tinder.domain.common.model.ProfileUser;
import com.tinder.domain.meta.model.CurrentUser;
import com.tinder.domain.profile.model.FacebookInformation;
import com.tinder.domain.profile.model.GenderSettings;
import com.tinder.domain.profile.model.ProfileOption.Facebook;
import com.tinder.domain.profile.model.ProfileOption.Instagram;
import com.tinder.domain.profile.model.ProfileOption.ShowGender;
import com.tinder.domain.profile.model.ProfileOption.User;
import com.tinder.domain.profile.repository.ProfileLocalRepository;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import io.reactivex.BackpressureStrategy;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.Completable;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J4\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/tinder/common/ProfileV2CurrentUserProvider;", "Lcom/tinder/data/user/CurrentUserProvider;", "legacyProvider", "Lcom/tinder/common/LegacyUserCurrentUserProvider;", "profileLocalRepository", "Lcom/tinder/domain/profile/repository/ProfileLocalRepository;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "(Lcom/tinder/common/LegacyUserCurrentUserProvider;Lcom/tinder/domain/profile/repository/ProfileLocalRepository;Lcom/tinder/core/experiment/AbTestUtility;)V", "clear", "Lrx/Completable;", "get", "Lcom/tinder/domain/common/model/ProfileUser;", "mergeUsers", "legacyMetaUser", "profileV2User", "Lcom/tinder/domain/common/model/User;", "genderSettings", "Lcom/tinder/domain/profile/model/GenderSettings;", "instagram", "Lcom/tinder/domain/common/model/Instagram;", "facebookInformation", "Lcom/tinder/domain/profile/model/FacebookInformation;", "observe", "Lrx/Observable;", "update", "", "profileUser", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.common.q */
public final class C12791q implements CurrentUserProvider {
    /* renamed from: a */
    private final C12781h f41187a;
    /* renamed from: b */
    private final ProfileLocalRepository f41188b;
    /* renamed from: c */
    private final AbTestUtility f41189c;

    @Inject
    public C12791q(@NotNull C12781h c12781h, @NotNull ProfileLocalRepository profileLocalRepository, @NotNull AbTestUtility abTestUtility) {
        C2668g.b(c12781h, "legacyProvider");
        C2668g.b(profileLocalRepository, "profileLocalRepository");
        C2668g.b(abTestUtility, "abTestUtility");
        this.f41187a = c12781h;
        this.f41188b = profileLocalRepository;
        this.f41189c = abTestUtility;
    }

    @NotNull
    public Completable clear() {
        Completable clear = this.f41187a.clear();
        C2668g.a(clear, "legacyProvider.clear()");
        return clear;
    }

    @Nullable
    public ProfileUser get() {
        C0001a.d("Async get for user, user might not be up to date", new Object[0]);
        return this.f41187a.get();
    }

    @NotNull
    public Observable<ProfileUser> observe() {
        Observable<ProfileUser> a = Observable.a(this.f41187a.observe(), RxJavaInteropExtKt.toV1Observable(this.f41188b.loadProfileOption(User.INSTANCE, CurrentUser.CURRENT_GUEST_USER), BackpressureStrategy.LATEST), RxJavaInteropExtKt.toV1Observable(this.f41188b.loadProfileOption(ShowGender.INSTANCE, GenderSettings.Companion.getDEFAULT()), BackpressureStrategy.LATEST), RxJavaInteropExtKt.toV1Observable(this.f41188b.loadProfileOption(Instagram.INSTANCE, com.tinder.domain.common.model.Instagram.DISCONNECTED), BackpressureStrategy.LATEST), RxJavaInteropExtKt.toV1Observable(this.f41188b.loadProfileOption(Facebook.INSTANCE), BackpressureStrategy.LATEST), new C12792r(new ProfileV2CurrentUserProvider$observe$1(this)));
        C2668g.a(a, "Observable.combineLatest…   ::mergeUsers\n        )");
        return a;
    }

    public void update(@NotNull ProfileUser profileUser) {
        C2668g.b(profileUser, "profileUser");
        C0001a.d("ProfileUser provider update", new Object[0]);
        this.f41187a.update(profileUser);
    }

    /* renamed from: a */
    private final ProfileUser m50283a(ProfileUser profileUser, com.tinder.domain.common.model.User user, GenderSettings genderSettings, com.tinder.domain.common.model.Instagram instagram, FacebookInformation facebookInformation) {
        if (profileUser == null) {
            return null;
        }
        if (C2668g.a(user, CurrentUser.CURRENT_GUEST_USER)) {
            return profileUser;
        }
        profileUser = profileUser.toBuilder().jobs(user.jobs()).schools(user.schools()).gender(user.gender()).bio(user.bio()).showGenderOnProfile(genderSettings.getShowGenderOnProfile()).instagram(instagram).connectionCount(facebookInformation.getConnectionCount());
        if (this.f41189c.profileV2MigrationEnabled(Experiment.PHOTOS) != null) {
            profileUser.photos(user.photos());
        }
        return profileUser.build();
    }
}
