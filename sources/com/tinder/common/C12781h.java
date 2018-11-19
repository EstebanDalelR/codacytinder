package com.tinder.common;

import com.tinder.data.user.CurrentUserProvider;
import com.tinder.domain.common.model.ProfileUser;
import com.tinder.model.adapter.domain.CurrentUserLegacyUserAdapter;
import com.tinder.p238f.p336c.C11600a;
import java8.util.Objects;
import javax.annotation.Nullable;
import javax.inject.Inject;
import rx.Completable;
import rx.Observable;
import rx.schedulers.Schedulers;
import rx.subjects.C19785a;

/* renamed from: com.tinder.common.h */
public class C12781h implements CurrentUserProvider {
    /* renamed from: a */
    private C19785a<ProfileUser> f41174a = C19785a.w();

    @Inject
    public C12781h(CurrentUserLegacyUserAdapter currentUserLegacyUserAdapter, C11600a c11600a) {
        c11600a = c11600a.observe().a(Schedulers.io()).f(C12782i.f41175a).k(C12783j.f41176a);
        currentUserLegacyUserAdapter.getClass();
        c11600a.k(C12784k.m50263a(currentUserLegacyUserAdapter)).a(new C13769l(this), C13770m.f43759a);
    }

    @Nullable
    public ProfileUser get() {
        return (ProfileUser) this.f41174a.A();
    }

    public Observable<ProfileUser> observe() {
        return this.f41174a.e().m();
    }

    public void update(ProfileUser profileUser) {
        if (!Objects.a((ProfileUser) this.f41174a.A(), profileUser)) {
            this.f41174a.onNext(profileUser);
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m50262a() {
        this.f41174a.onNext(null);
    }

    public Completable clear() {
        return Completable.a(new C13771n(this));
    }
}
