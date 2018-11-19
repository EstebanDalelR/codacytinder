package com.tinder.boost.provider;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.fernandocejas.frodo.annotation.RxLogObservable;
import com.tinder.boost.model.BoostState;
import com.tinder.boost.repository.BoostStatusRepository;
import com.tinder.domain.boost.model.BoostStatus;
import com.tinder.tinderplus.provider.LikeStatusProvider;
import javax.inject.Inject;
import javax.inject.Singleton;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.subjects.C19785a;

@Singleton
/* renamed from: com.tinder.boost.provider.c */
public class C2639c {
    @NonNull
    /* renamed from: a */
    private final LikeStatusProvider f8236a;
    @NonNull
    /* renamed from: b */
    private final C19785a<BoostState> f8237b = C19785a.w();
    @NonNull
    /* renamed from: c */
    private final BoostStatusRepository f8238c;
    @NonNull
    /* renamed from: d */
    private final BoostUpdateProvider f8239d;
    @NonNull
    /* renamed from: e */
    private final C8349a f8240e;

    @Inject
    public C2639c(@NonNull LikeStatusProvider likeStatusProvider, @NonNull BoostStatusRepository boostStatusRepository, @NonNull BoostUpdateProvider boostUpdateProvider, @NonNull C8349a c8349a) {
        this.f8236a = likeStatusProvider;
        this.f8238c = boostStatusRepository;
        this.f8239d = boostUpdateProvider;
        this.f8240e = c8349a;
        m9981d();
    }

    @RxLogObservable
    /* renamed from: a */
    public Observable<BoostState> m9982a() {
        return this.f8237b.e();
    }

    @Nullable
    /* renamed from: b */
    public BoostState m9985b() {
        return (BoostState) this.f8237b.A();
    }

    /* renamed from: a */
    public void m9983a(@NonNull BoostState boostState) {
        Object obj = ((((BoostState) this.f8237b.A()) == null && boostState == BoostState.BOOSTING) || boostState == BoostState.ACTIVATED) ? 1 : null;
        if (obj != null) {
            m9980c();
        }
        this.f8237b.onNext(boostState);
        switch (c$1.f29663a[boostState.ordinal()]) {
            case 1:
                this.f8236a.resetLikeStatus();
                return;
            case 2:
                this.f8239d.m9978e();
                return;
            default:
                return;
        }
    }

    /* renamed from: c */
    private void m9980c() {
        BoostStatus boostStatus = this.f8238c.getBoostStatus();
        if (boostStatus == null) {
            C0001a.m31d("Can't start boost updates with a null BoostStatus", new Object[0]);
            return;
        }
        this.f8239d.m9973a(boostStatus, this.f8240e.a().c());
    }

    /* renamed from: d */
    private void m9981d() {
        this.f8239d.m9977d().a(new C13653d(this), C13654e.f43497a);
    }

    /* renamed from: a */
    final /* synthetic */ void m9984a(BoostUpdateProvider$CountdownState boostUpdateProvider$CountdownState) {
        if (boostUpdateProvider$CountdownState == BoostUpdateProvider$CountdownState.FINISHED) {
            m9983a(BoostState.COMPLETED);
        }
    }
}
