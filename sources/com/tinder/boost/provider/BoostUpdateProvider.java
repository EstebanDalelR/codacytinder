package com.tinder.boost.provider;

import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.fernandocejas.frodo.annotation.RxLogObservable;
import com.tinder.domain.boost.model.BoostStatus;
import com.tinder.domain.boost.model.BoostStatusExt;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.subjects.C19785a;
import rx.subjects.PublishSubject;

@Singleton
public class BoostUpdateProvider {
    /* renamed from: a */
    CountDownTimer f8226a;
    /* renamed from: b */
    C19785a<Float> f8227b = C19785a.w();
    /* renamed from: c */
    private double f8228c;
    /* renamed from: d */
    private C19785a<String> f8229d = C19785a.w();
    /* renamed from: e */
    private C19785a<Long> f8230e = C19785a.w();
    /* renamed from: f */
    private PublishSubject<BoostUpdateProvider$CountdownState> f8231f = PublishSubject.w();
    /* renamed from: g */
    private BoostStatus f8232g;
    /* renamed from: h */
    private long f8233h;
    /* renamed from: i */
    private float f8234i;
    /* renamed from: j */
    private String f8235j;

    /* renamed from: a */
    public void m9973a(@Nullable BoostStatus boostStatus, long j) {
        if (boostStatus == null) {
            C0001a.m31d("No Boost Status", new Object[0]);
        } else if (this.f8232g == null || !this.f8232g.equals(boostStatus)) {
            this.f8232g = boostStatus;
            this.f8228c = BoostStatusExt.multiplierWithFallback(boostStatus);
            m9975b(boostStatus, j);
        } else {
            boostStatus = new StringBuilder();
            boostStatus.append("Already Boosting: ");
            boostStatus.append(this.f8232g.getBoostId());
            C0001a.m22a(boostStatus.toString(), new Object[0]);
        }
    }

    /* renamed from: a */
    public Observable<String> m9972a() {
        return this.f8229d.e();
    }

    /* renamed from: b */
    public Observable<Long> m9974b() {
        return this.f8230e.e();
    }

    /* renamed from: c */
    public Observable<Float> m9976c() {
        return this.f8227b.e();
    }

    @RxLogObservable
    /* renamed from: d */
    public Observable<BoostUpdateProvider$CountdownState> m9977d() {
        return this.f8231f.e();
    }

    @VisibleForTesting
    /* renamed from: b */
    void m9975b(BoostStatus boostStatus, long j) {
        double d = this.f8228c * 0.8d;
        double d2 = d / 10000.0d;
        long j2 = j;
        double d3 = (this.f8228c - d) / ((double) j2);
        long expiresAt = boostStatus.getExpiresAt() - System.currentTimeMillis();
        m9978e();
        this.f8226a = new BoostUpdateProvider$1(this, expiresAt % TimeUnit.HOURS.toMillis(1), 800, j2, d2, d3, d).start();
        this.f8231f.onNext(BoostUpdateProvider$CountdownState.TICKING);
    }

    /* renamed from: e */
    public void m9978e() {
        if (this.f8226a != null) {
            this.f8226a.cancel();
        }
    }

    /* renamed from: f */
    public BoostUpdateProvider$a m9979f() {
        return new BoostUpdateProvider$a(this, this.f8233h, this.f8235j, this.f8234i);
    }

    /* renamed from: g */
    private double m9971g() {
        return (new Random().nextDouble() * 0.4d) - 22.4d;
    }

    /* renamed from: a */
    private String m9962a(double d) {
        d += m9971g();
        if (d < 0.0d) {
            d = 0.0d;
        } else if (d >= this.f8228c) {
            d = this.f8228c;
        }
        d = new BigDecimal(Math.max(d, 2.0d)).setScale(1, 2.0E-323d);
        return String.format(Locale.getDefault(), "%.1fx", new Object[]{Double.valueOf(d.doubleValue())});
    }
}
