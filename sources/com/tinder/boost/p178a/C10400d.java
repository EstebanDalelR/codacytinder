package com.tinder.boost.p178a;

import android.support.annotation.Nullable;
import com.tinder.api.TinderApiClient;
import com.tinder.boost.model.BoostState;
import com.tinder.boost.model.C8345b;
import com.tinder.boost.provider.BoostUpdateProvider;
import com.tinder.boost.provider.C2639c;
import com.tinder.boost.provider.C8349a;
import com.tinder.boost.repository.BoostStatusRepository;
import com.tinder.data.boost.BoostStatusProvider;
import com.tinder.domain.boost.model.BoostStatus;
import com.tinder.domain.boost.repository.BoostProfileFacesRepository;
import com.tinder.managers.bk;
import com.tinder.utils.RxUtils;
import com.tinder.utils.ad;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import p000a.p001a.C0001a;
import rx.Observable;

/* renamed from: com.tinder.boost.a.d */
public class C10400d implements BoostStatusProvider {
    /* renamed from: a */
    private final TinderApiClient f33931a;
    /* renamed from: b */
    private final bk f33932b;
    /* renamed from: c */
    private final BoostProfileFacesRepository f33933c;
    /* renamed from: d */
    private final BoostUpdateProvider f33934d;
    /* renamed from: e */
    private final C2639c f33935e;
    /* renamed from: f */
    private final BoostStatusRepository f33936f;
    /* renamed from: g */
    private final C8349a f33937g;

    /* renamed from: b */
    static final /* synthetic */ void m42268b(BoostStatus boostStatus) {
    }

    @Inject
    public C10400d(TinderApiClient tinderApiClient, bk bkVar, BoostProfileFacesRepository boostProfileFacesRepository, BoostUpdateProvider boostUpdateProvider, C2639c c2639c, BoostStatusRepository boostStatusRepository, C8349a c8349a) {
        this.f33931a = tinderApiClient;
        this.f33932b = bkVar;
        this.f33933c = boostProfileFacesRepository;
        this.f33934d = boostUpdateProvider;
        this.f33935e = c2639c;
        this.f33936f = boostStatusRepository;
        this.f33937g = c8349a;
    }

    /* renamed from: a */
    public boolean m42274a() {
        return this.f33937g.m35551a().mo9312a();
    }

    public boolean isUserBoosting() {
        BoostStatus e = m42282e();
        return e != null && System.currentTimeMillis() < e.getExpiresAt();
    }

    /* renamed from: b */
    public boolean m42276b() {
        BoostStatus e = m42282e();
        if (e != null) {
            if (e.getRemaining() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public long m42277c() {
        return m42270n() - System.currentTimeMillis();
    }

    /* renamed from: d */
    public long m42280d() {
        BoostStatus e = m42282e();
        if (e == null) {
            return 0;
        }
        return e.getResetAt();
    }

    @Nullable
    /* renamed from: e */
    public BoostStatus m42282e() {
        return this.f33936f.getBoostStatus();
    }

    /* renamed from: f */
    public Observable<BoostStatus> m42283f() {
        return this.f33936f.observeBoostStatus();
    }

    /* renamed from: g */
    public int m42284g() {
        return Math.round((float) TimeUnit.MILLISECONDS.toMinutes(m42285h()));
    }

    /* renamed from: h */
    public long m42285h() {
        return this.f33937g.m35551a().mo9314c();
    }

    /* renamed from: i */
    public void m42286i() {
        this.f33936f.createBoost().a(RxUtils.a()).a(new C13634e(this), new C13635f(this));
    }

    /* renamed from: c */
    final /* synthetic */ void m42278c(BoostStatus boostStatus) {
        m42271a(boostStatus);
        this.f33932b.setBoostCursor("0");
    }

    /* renamed from: d */
    final /* synthetic */ void m42281d(Throwable th) {
        ad.a(th);
        this.f33935e.a(BoostState.NETWORK_ERROR);
    }

    /* renamed from: j */
    public void m42287j() {
        this.f33936f.loadBoostStatus().a(RxUtils.a().a()).a(C13636g.f43469a, new C13637h(this));
    }

    /* renamed from: c */
    final /* synthetic */ void m42279c(Throwable th) {
        ad.a(th);
        this.f33935e.a(BoostState.NETWORK_ERROR);
    }

    /* renamed from: k */
    public void m42288k() {
        this.f33931a.getBoostResult().a(RxUtils.a()).a(new C13638i(this), new C13639j(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m42273a(Void voidR) {
        this.f33935e.a(BoostState.COMPLETED);
        m42287j();
    }

    /* renamed from: b */
    final /* synthetic */ void m42275b(Throwable th) {
        C0001a.c(th);
        this.f33935e.a(BoostState.NETWORK_ERROR);
    }

    /* renamed from: l */
    public void m42289l() {
        BoostStatus e = m42282e();
        if (e != null) {
            this.f33932b.g(e.getBoostId());
        }
    }

    /* renamed from: m */
    public boolean m42290m() {
        BoostStatus e = m42282e();
        if (!(e == null || this.f33932b.h(e.getBoostId()))) {
            if (m42274a()) {
                if ((e.getResultViewedAt() != 0 || !e.isBoostEnded()) && (e.getExpiresAt() <= 0 || System.currentTimeMillis() <= e.getExpiresAt() || e.getResultViewedAt() != 0)) {
                    return this.f33932b.V();
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    void m42271a(BoostStatus boostStatus) {
        if (m42276b() && m42270n() == 0) {
            this.f33935e.a(BoostState.OUT_OF_BOOST);
        } else if (boostStatus.isStillInBoost()) {
            this.f33935e.a(BoostState.BOOSTING);
            m42269d(boostStatus);
        } else {
            this.f33935e.a(BoostState.ACTIVATED);
            m42269d(boostStatus);
            this.f33933c.clearUrls().d();
        }
    }

    /* renamed from: d */
    private void m42269d(BoostStatus boostStatus) {
        if (this.f33937g.m35551a().mo9314c() <= 0) {
            this.f33937g.m35553b().f(C12623k.f40725a).a(new C13640l(this, boostStatus), C13641m.f43475a);
        } else {
            this.f33934d.a(boostStatus, m42285h());
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Boolean m42266a(C8345b c8345b) {
        return Boolean.valueOf(c8345b.mo9314c() > 0 ? true : null);
    }

    /* renamed from: a */
    final /* synthetic */ void m42272a(BoostStatus boostStatus, C8345b c8345b) {
        this.f33934d.a(boostStatus, c8345b.mo9314c());
    }

    /* renamed from: n */
    private long m42270n() {
        BoostStatus e = m42282e();
        if (e == null) {
            return 0;
        }
        return e.getExpiresAt();
    }
}
