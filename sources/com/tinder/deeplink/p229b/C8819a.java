package com.tinder.deeplink.p229b;

import android.support.annotation.NonNull;
import com.tinder.model.User;
import com.tinder.recs.model.DeepLinkReferralInfo;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java8.util.Optional;
import javax.inject.Inject;
import javax.inject.Singleton;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.subjects.PublishSubject;

@Singleton
/* renamed from: com.tinder.deeplink.b.a */
public class C8819a {
    @NonNull
    /* renamed from: a */
    private PublishSubject<Optional<Void>> f30919a = PublishSubject.w();
    @NonNull
    /* renamed from: b */
    private PublishSubject<Optional<Void>> f30920b = PublishSubject.w();
    @NonNull
    /* renamed from: c */
    private PublishSubject<Optional<C8818a>> f30921c = PublishSubject.w();
    /* renamed from: d */
    private Set<C8818a> f30922d = new LinkedHashSet();

    /* renamed from: com.tinder.deeplink.b.a$a */
    public static class C8818a {
        @NonNull
        /* renamed from: a */
        private final User f30917a;
        @NonNull
        /* renamed from: b */
        private final DeepLinkReferralInfo f30918b;

        public C8818a(@NonNull User user, @NonNull DeepLinkReferralInfo deepLinkReferralInfo) {
            this.f30917a = user;
            this.f30918b = deepLinkReferralInfo;
        }

        @NonNull
        /* renamed from: a */
        public User m37520a() {
            return this.f30917a;
        }

        @NonNull
        /* renamed from: b */
        public DeepLinkReferralInfo m37521b() {
            return this.f30918b;
        }
    }

    @Inject
    C8819a() {
    }

    /* renamed from: a */
    public Observable<Optional<C8818a>> m37523a() {
        if (!this.f30922d.isEmpty()) {
            Observable.b(5, TimeUnit.MILLISECONDS).a(new C13892b(this), C13893c.f44027a);
        }
        return this.f30921c.e();
    }

    /* renamed from: a */
    final /* synthetic */ void m37525a(Long l) {
        m37522d();
    }

    /* renamed from: b */
    public Observable<Optional<Void>> m37527b() {
        return this.f30919a.e();
    }

    /* renamed from: c */
    public Observable<Optional<Void>> m37528c() {
        return this.f30920b.e();
    }

    /* renamed from: a */
    public void m37524a(@NonNull C8818a c8818a) {
        try {
            if (this.f30921c.x()) {
                this.f30921c.onNext(Optional.a(c8818a));
            } else {
                this.f30922d.add(c8818a);
            }
        } catch (C8818a c8818a2) {
            C0001a.c(c8818a2);
        }
    }

    /* renamed from: a */
    public void m37526a(@NonNull Throwable th) {
        this.f30921c.onNext(Optional.a());
    }

    /* renamed from: d */
    private void m37522d() {
        for (C8818a a : this.f30922d) {
            this.f30921c.onNext(Optional.a(a));
        }
        this.f30922d.clear();
    }
}
