package com.tinder.boost.provider;

import android.os.CountDownTimer;

class BoostUpdateProvider$1 extends CountDownTimer {
    /* renamed from: a */
    final /* synthetic */ long f29653a;
    /* renamed from: b */
    final /* synthetic */ double f29654b;
    /* renamed from: c */
    final /* synthetic */ double f29655c;
    /* renamed from: d */
    final /* synthetic */ double f29656d;
    /* renamed from: e */
    final /* synthetic */ BoostUpdateProvider f29657e;

    BoostUpdateProvider$1(BoostUpdateProvider boostUpdateProvider, long j, long j2, long j3, double d, double d2, double d3) {
        this.f29657e = boostUpdateProvider;
        this.f29653a = j3;
        this.f29654b = d;
        this.f29655c = d2;
        this.f29656d = d3;
        super(j, j2);
    }

    public void onTick(long j) {
        BoostUpdateProvider.a(this.f29657e, j);
        BoostUpdateProvider.a(this.f29657e).onNext(Long.valueOf(j));
        long j2 = this.f29653a - j;
        BoostUpdateProvider.a(this.f29657e, ((float) j2) / ((float) this.f29653a));
        BoostUpdateProvider.a(this.f29657e, Math.max(BoostUpdateProvider.b(this.f29657e), 0.0f));
        this.f29657e.f8227b.onNext(Float.valueOf(BoostUpdateProvider.b(this.f29657e)));
        BoostUpdateProvider.a(this.f29657e, BoostUpdateProvider.a(this.f29657e, j > this.f29653a - 10000 ? ((double) j2) * this.f29654b : (((double) j2) * this.f29655c) + this.f29656d));
        BoostUpdateProvider.d(this.f29657e).onNext(BoostUpdateProvider.c(this.f29657e));
    }

    public void onFinish() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.valueOf(BoostUpdateProvider.e(this.f29657e)));
        stringBuilder.append("x");
        BoostUpdateProvider.d(this.f29657e).onNext(stringBuilder.toString());
        BoostUpdateProvider.a(this.f29657e).onNext(Long.valueOf(0));
        this.f29657e.f8227b.onNext(Float.valueOf(1.0f));
        BoostUpdateProvider.f(this.f29657e).onNext(BoostUpdateProvider$CountdownState.FINISHED);
    }
}
