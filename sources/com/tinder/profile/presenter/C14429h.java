package com.tinder.profile.presenter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.common.repository.MyUserRepository;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.domain.common.model.PerspectableUser;
import com.tinder.domain.common.model.ProfileUser;
import com.tinder.domain.profile.experiment.NewPhotoGridExperiment;
import com.tinder.domain.profile.model.FacebookInformation;
import com.tinder.domain.profile.model.GenderSettings;
import com.tinder.domain.profile.model.ProfileOption;
import com.tinder.domain.profile.model.ProfileOption.Facebook;
import com.tinder.domain.profile.model.ProfileOption.Instagram;
import com.tinder.domain.profile.model.ProfileOption.Interests;
import com.tinder.domain.profile.model.ProfileOption.ShowGender;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.managers.bk;
import com.tinder.model.User;
import com.tinder.profile.adapters.C14367k;
import com.tinder.profile.model.Profile;
import com.tinder.profile.model.Profile.Adornment;
import com.tinder.profile.model.Profile.C14418b;
import com.tinder.profile.model.Profile.Source;
import com.tinder.profile.p363b.C14385i;
import com.tinder.profile.target.CurrentUserProfileTarget;
import com.tinder.utils.RxUtils;
import hu.akarnokd.rxjava.interop.C15551e;
import io.reactivex.BackpressureStrategy;
import io.reactivex.C3959e;
import javax.inject.Inject;
import rx.Observable;
import rx.Subscription;

/* renamed from: com.tinder.profile.presenter.h */
public class C14429h {
    @DeadshotTarget
    /* renamed from: a */
    CurrentUserProfileTarget f45709a;
    @NonNull
    /* renamed from: b */
    private final C14385i f45710b;
    @NonNull
    /* renamed from: c */
    private final MyUserRepository f45711c;
    @NonNull
    /* renamed from: d */
    private final C14367k f45712d;
    @NonNull
    /* renamed from: e */
    private final bk f45713e;
    @NonNull
    /* renamed from: f */
    private final C14418b f45714f;
    @NonNull
    /* renamed from: g */
    private final NewPhotoGridExperiment f45715g;
    @NonNull
    /* renamed from: h */
    private final LoadProfileOptionData f45716h;
    @Nullable
    /* renamed from: i */
    private Subscription f45717i;

    /* renamed from: a */
    final /* synthetic */ void m55082a(User user) {
        m55075b(user);
    }

    /* renamed from: b */
    final /* synthetic */ Observable m55084b(PerspectableUser perspectableUser) {
        return m55076c(perspectableUser);
    }

    @Inject
    C14429h(C14385i c14385i, MyUserRepository myUserRepository, C14367k c14367k, bk bkVar, C14418b c14418b, NewPhotoGridExperiment newPhotoGridExperiment, LoadProfileOptionData loadProfileOptionData) {
        this.f45710b = c14385i;
        this.f45711c = myUserRepository;
        this.f45712d = c14367k;
        this.f45713e = bkVar;
        this.f45714f = c14418b;
        this.f45715g = newPhotoGridExperiment;
        this.f45716h = loadProfileOptionData;
    }

    /* renamed from: a */
    public void m55081a() {
        RxUtils.b(this.f45717i);
        this.f45717i = m55078e().p(new C17765i(this)).k(new C17766j(this)).a(RxUtils.a()).a(new C18591k(this), C18592l.f57983a);
    }

    /* renamed from: a */
    final /* synthetic */ Profile m55080a(PerspectableUser perspectableUser) {
        return this.f45714f.m54930a(perspectableUser, Source.USER, new Adornment[0]);
    }

    /* renamed from: a */
    final /* synthetic */ void m55083a(Profile profile) {
        m55077d().bindProfile(profile);
    }

    @Drop
    /* renamed from: b */
    public void m55085b() {
        RxUtils.b(this.f45717i);
    }

    /* renamed from: c */
    public void m55086c() {
        this.f45710b.m54803a();
        m55077d().showEditProfile();
    }

    /* renamed from: d */
    private CurrentUserProfileTarget m55077d() {
        return this.f45709a;
    }

    /* renamed from: c */
    private Observable<PerspectableUser> m55076c(PerspectableUser perspectableUser) {
        return C15551e.m58077a(C3959e.combineLatest(this.f45716h.execute(ProfileOption.User.INSTANCE, perspectableUser), this.f45716h.execute(ShowGender.INSTANCE), this.f45716h.execute(Interests.INSTANCE), this.f45716h.execute(Instagram.INSTANCE), this.f45716h.execute(Facebook.INSTANCE), new C16116m(this, perspectableUser.profileUser(), perspectableUser)), BackpressureStrategy.LATEST);
    }

    /* renamed from: a */
    final /* synthetic */ PerspectableUser m55079a(ProfileUser profileUser, PerspectableUser perspectableUser, com.tinder.domain.common.model.User user, GenderSettings genderSettings, com.tinder.domain.profile.model.Interests interests, com.tinder.domain.common.model.Instagram instagram, FacebookInformation facebookInformation) throws Exception {
        profileUser = profileUser.toBuilder().schools(user.schools()).jobs(user.jobs()).gender(user.gender()).bio(user.bio());
        if (this.f45715g.getEnabled()) {
            user = user.photos();
        } else {
            user = perspectableUser.photos();
        }
        return perspectableUser.toBuilder().profileUser(profileUser.photos(user).showGenderOnProfile(genderSettings.getShowGenderOnProfile()).instagram(instagram).connectionCount(facebookInformation.getConnectionCount()).build()).commmonInterests(interests.getInterests()).build();
    }

    /* renamed from: e */
    private Observable<PerspectableUser> m55078e() {
        Observable b = this.f45711c.loadMyUser().b(new C18593n(this));
        C14367k c14367k = this.f45712d;
        c14367k.getClass();
        return b.k(C17767o.m64956a(c14367k));
    }

    /* renamed from: b */
    private void m55075b(User user) {
        if (this.f45713e.Q()) {
            user.setHideAge(true);
        }
        if (this.f45713e.R()) {
            user.setHideDistance(true);
        }
    }
}
