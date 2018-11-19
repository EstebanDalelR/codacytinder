package com.tinder.superlike.p421e;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.profile.model.ProfileOption.SuperLikes;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.superlike.SuperlikeStatus;
import hu.akarnokd.rxjava.interop.C15551e;
import io.reactivex.BackpressureStrategy;
import javax.inject.Inject;
import javax.inject.Singleton;
import rx.Observable;
import rx.subjects.C19785a;

@Singleton
/* renamed from: com.tinder.superlike.e.f */
public class C15082f {
    /* renamed from: a */
    private final C19785a<Boolean> f46934a = C19785a.w();
    /* renamed from: b */
    private final C19785a<SuperlikeStatus> f46935b;
    /* renamed from: c */
    private final LoadProfileOptionData f46936c;
    /* renamed from: d */
    private final AbTestUtility f46937d;

    @Inject
    public C15082f(LoadProfileOptionData loadProfileOptionData, AbTestUtility abTestUtility) {
        this.f46936c = loadProfileOptionData;
        this.f46937d = abTestUtility;
        this.f46934a.onNext(Boolean.valueOf(null));
        this.f46935b = C19785a.w();
    }

    /* renamed from: a */
    public Observable<Boolean> m56831a() {
        return this.f46934a.e().g();
    }

    /* renamed from: b */
    public boolean m56835b() {
        return ((Boolean) this.f46934a.A()).booleanValue();
    }

    /* renamed from: a */
    public void m56834a(boolean z) {
        this.f46934a.onNext(Boolean.valueOf(z));
    }

    @Nullable
    @Deprecated
    /* renamed from: c */
    public SuperlikeStatus m56836c() {
        return (SuperlikeStatus) this.f46935b.A();
    }

    /* renamed from: d */
    public Observable<SuperlikeStatus> m56837d() {
        return this.f46935b.e().m();
    }

    /* renamed from: e */
    public Observable<SuperlikeStatus> m56838e() {
        if (!this.f46937d.profileV2EnabledForRevenue()) {
            return this.f46935b.e().m();
        }
        Observable a = C15551e.m58077a(this.f46936c.execute(SuperLikes.INSTANCE), BackpressureStrategy.LATEST);
        C19785a c19785a = this.f46935b;
        c19785a.getClass();
        return Observable.b(a.b(C18933g.m67425a(c19785a)).i(), this.f46935b.e().m());
    }

    @Deprecated
    /* renamed from: a */
    public void m56833a(@NonNull SuperlikeStatus superlikeStatus) {
        this.f46935b.onNext(superlikeStatus);
    }

    /* renamed from: a */
    public void m56832a(int i) {
        this.f46935b.onNext(((SuperlikeStatus) this.f46935b.A()).toBuilder().remainingCount(i).build());
    }
}
