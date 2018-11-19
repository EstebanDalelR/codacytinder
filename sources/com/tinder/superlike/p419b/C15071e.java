package com.tinder.superlike.p419b;

import android.annotation.SuppressLint;
import android.support.annotation.Nullable;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.profile.model.ProfileDataRequest;
import com.tinder.domain.profile.model.ProfileOption.SuperLikes;
import com.tinder.domain.profile.usecase.SyncProfileData;
import com.tinder.domain.superlike.SuperlikeStatus;
import com.tinder.model.DefaultObserver;
import com.tinder.superlike.p421e.C15080a;
import com.tinder.superlike.p421e.C15081c;
import com.tinder.superlike.p421e.C15082f;
import com.tinder.utils.RxUtils;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.C15756a;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.joda.time.DateTime;
import rx.Observable;
import rx.Single;
import rx.Subscription;

@Singleton
/* renamed from: com.tinder.superlike.b.e */
public class C15071e {
    /* renamed from: a */
    private final C15080a f46910a;
    /* renamed from: b */
    private final C15081c f46911b;
    /* renamed from: c */
    private final C15082f f46912c;
    /* renamed from: d */
    private final AbTestUtility f46913d;
    /* renamed from: e */
    private final SyncProfileData f46914e;
    /* renamed from: f */
    private Subscription f46915f;

    /* renamed from: b */
    final /* synthetic */ Observable m56819b(SuperlikeStatus superlikeStatus) {
        return m56814c(superlikeStatus);
    }

    @Inject
    public C15071e(C15082f c15082f, C15080a c15080a, C15081c c15081c, AbTestUtility abTestUtility, SyncProfileData syncProfileData) {
        this.f46912c = c15082f;
        this.f46910a = c15080a;
        this.f46911b = c15081c;
        this.f46913d = abTestUtility;
        this.f46914e = syncProfileData;
    }

    /* renamed from: a */
    public boolean m56817a() {
        return this.f46910a.m56828a().mo12481a();
    }

    @Nullable
    /* renamed from: b */
    public SuperlikeStatus m56818b() {
        return this.f46912c.m56836c();
    }

    /* renamed from: c */
    public boolean m56820c() {
        SuperlikeStatus b = m56818b();
        boolean z = false;
        if (b == null) {
            return false;
        }
        DateTime resetDate = b.resetDate();
        if (resetDate == null) {
            return false;
        }
        if (!b.hasSuperlikes() && resetDate.h()) {
            z = true;
        }
        return z;
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: d */
    public void m56821d() {
        if (this.f46913d.profileV2EnabledForRevenue()) {
            this.f46914e.execute(ProfileDataRequest.builder().with(SuperLikes.INSTANCE).build()).b(C15756a.m59010b()).a(Functions.f48541c, C16884f.f52036a);
            return;
        }
        Single a = this.f46911b.m56830a().a(RxUtils.a().m67518a());
        C15082f c15082f = this.f46912c;
        c15082f.getClass();
        a.a(C18930g.m67424a(c15082f), C18931h.f58588a);
    }

    /* renamed from: e */
    public void m56822e() {
        if (this.f46915f == null) {
            this.f46915f = Observable.d(m56815f()).a(DefaultObserver.create(new C18932i(this)));
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m56816a(SuperlikeStatus superlikeStatus) {
        m56821d();
    }

    /* renamed from: f */
    private Observable<Observable<SuperlikeStatus>> m56815f() {
        return this.f46912c.m56838e().k(new C18187j(this));
    }

    /* renamed from: c */
    private Observable<SuperlikeStatus> m56814c(SuperlikeStatus superlikeStatus) {
        if (superlikeStatus.resetDate() == null) {
            return Observable.c();
        }
        if (superlikeStatus.millisUntilResetDate() == 0) {
            return Observable.c();
        }
        return Observable.a(superlikeStatus).d(superlikeStatus.millisUntilResetDate(), TimeUnit.MILLISECONDS);
    }
}
