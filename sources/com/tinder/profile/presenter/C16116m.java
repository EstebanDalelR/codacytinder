package com.tinder.profile.presenter;

import com.tinder.domain.common.model.Instagram;
import com.tinder.domain.common.model.PerspectableUser;
import com.tinder.domain.common.model.ProfileUser;
import com.tinder.domain.common.model.User;
import com.tinder.domain.profile.model.FacebookInformation;
import com.tinder.domain.profile.model.GenderSettings;
import com.tinder.domain.profile.model.Interests;
import io.reactivex.functions.Function5;

/* renamed from: com.tinder.profile.presenter.m */
final /* synthetic */ class C16116m implements Function5 {
    /* renamed from: a */
    private final C14429h f50188a;
    /* renamed from: b */
    private final ProfileUser f50189b;
    /* renamed from: c */
    private final PerspectableUser f50190c;

    C16116m(C14429h c14429h, ProfileUser profileUser, PerspectableUser perspectableUser) {
        this.f50188a = c14429h;
        this.f50189b = profileUser;
        this.f50190c = perspectableUser;
    }

    public Object apply(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return this.f50188a.m55079a(this.f50189b, this.f50190c, (User) obj, (GenderSettings) obj2, (Interests) obj3, (Instagram) obj4, (FacebookInformation) obj5);
    }
}
