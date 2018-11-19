package com.tinder.recsads.rule;

import com.tinder.addy.AdAggregator;
import com.tinder.domain.recs.RecsEngine;
import com.tinder.recsads.model.RecsAdsConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0014\u001a\u00020\u0015H\u0017J\b\u0010\u0016\u001a\u00020\u0015H\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/recsads/rule/V2AdRecsInjector;", "Lcom/tinder/recsads/rule/AdRecsInjector;", "adAggregator", "Lcom/tinder/addy/AdAggregator;", "recsEngine", "Lcom/tinder/domain/recs/RecsEngine;", "adsConfig", "Lcom/tinder/recsads/model/RecsAdsConfig;", "(Lcom/tinder/addy/AdAggregator;Lcom/tinder/domain/recs/RecsEngine;Lcom/tinder/recsads/model/RecsAdsConfig;)V", "currentCadence", "", "currentRound", "hasPassedInjectionThreshold", "", "injectionPlacementMargin", "injectionThreshold", "numberOfSwipes", "requestOffsetFactor", "", "requestThreshold", "computeNewSwipe", "", "initializeNewRound", "ThresholdCalculator", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recsads.rule.e */
public final class C16473e implements AdRecsInjector {
    /* renamed from: a */
    public static final C14762a f51111a = new C14762a();
    /* renamed from: b */
    private final double f51112b = this.f51122l.requestOffsetFactor();
    /* renamed from: c */
    private final int f51113c = this.f51122l.injectionPlacementMargin();
    /* renamed from: d */
    private int f51114d = -1;
    /* renamed from: e */
    private int f51115e = -1;
    /* renamed from: f */
    private int f51116f = -1;
    /* renamed from: g */
    private int f51117g = -1;
    /* renamed from: h */
    private int f51118h = -1;
    /* renamed from: i */
    private boolean f51119i;
    /* renamed from: j */
    private final AdAggregator f51120j;
    /* renamed from: k */
    private final RecsEngine f51121k;
    /* renamed from: l */
    private final RecsAdsConfig f51122l;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/tinder/recsads/rule/V2AdRecsInjector$ThresholdCalculator;", "", "()V", "calculateInjectionThreshold", "", "cadence", "injectionMargin", "calculateRequestThreshold", "requestOffset", "", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.rule.e$a */
    public static final class C14762a {
        /* renamed from: a */
        public final int m56034a(int i, int i2) {
            return i - i2;
        }

        private C14762a() {
        }

        /* renamed from: a */
        public final int m56033a(int i, double d) {
            return (int) Math.ceil(((double) i) / d);
        }
    }

    public C16473e(@NotNull AdAggregator adAggregator, @NotNull RecsEngine recsEngine, @NotNull RecsAdsConfig recsAdsConfig) {
        C2668g.b(adAggregator, "adAggregator");
        C2668g.b(recsEngine, "recsEngine");
        C2668g.b(recsAdsConfig, "adsConfig");
        this.f51120j = adAggregator;
        this.f51121k = recsEngine;
        this.f51122l = recsAdsConfig;
        m61896a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void computeNewSwipe() {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r7.f51114d;	 Catch:{ all -> 0x00b2 }
        r1 = 1;
        r0 = r0 + r1;
        r7.f51114d = r0;	 Catch:{ all -> 0x00b2 }
        r0 = "numberOfSwipes was set to %d";
        r2 = new java.lang.Object[r1];	 Catch:{ all -> 0x00b2 }
        r3 = r7.f51114d;	 Catch:{ all -> 0x00b2 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x00b2 }
        r4 = 0;
        r2[r4] = r3;	 Catch:{ all -> 0x00b2 }
        p000a.p001a.C0001a.b(r0, r2);	 Catch:{ all -> 0x00b2 }
        r0 = r7.f51114d;	 Catch:{ all -> 0x00b2 }
        r2 = r7.f51115e;	 Catch:{ all -> 0x00b2 }
        if (r0 < r2) goto L_0x002a;
    L_0x001d:
        r0 = r7.f51120j;	 Catch:{ all -> 0x00b2 }
        r0 = r0.g();	 Catch:{ all -> 0x00b2 }
        if (r0 != 0) goto L_0x002a;
    L_0x0025:
        r7.m61896a();	 Catch:{ all -> 0x00b2 }
        monitor-exit(r7);
        return;
    L_0x002a:
        r0 = r7.f51117g;	 Catch:{ all -> 0x00b2 }
        r2 = r7.f51114d;	 Catch:{ all -> 0x00b2 }
        if (r0 != r2) goto L_0x0053;
    L_0x0030:
        r0 = "Request threshold was hit";
        r2 = new java.lang.Object[r4];	 Catch:{ all -> 0x00b2 }
        p000a.p001a.C0001a.b(r0, r2);	 Catch:{ all -> 0x00b2 }
        r0 = r7.f51120j;	 Catch:{ all -> 0x00b2 }
        r0 = r0.g();	 Catch:{ all -> 0x00b2 }
        if (r0 != 0) goto L_0x0053;
    L_0x003f:
        r0 = r7.f51120j;	 Catch:{ all -> 0x00b2 }
        r0 = r0.f();	 Catch:{ all -> 0x00b2 }
        if (r0 != 0) goto L_0x0053;
    L_0x0047:
        r0 = "Starting to buffer for ads";
        r2 = new java.lang.Object[r4];	 Catch:{ all -> 0x00b2 }
        p000a.p001a.C0001a.b(r0, r2);	 Catch:{ all -> 0x00b2 }
        r0 = r7.f51120j;	 Catch:{ all -> 0x00b2 }
        r0.a();	 Catch:{ all -> 0x00b2 }
    L_0x0053:
        r0 = r7.f51114d;	 Catch:{ all -> 0x00b2 }
        r2 = r7.f51118h;	 Catch:{ all -> 0x00b2 }
        if (r0 != r2) goto L_0x005b;
    L_0x0059:
        r7.f51119i = r1;	 Catch:{ all -> 0x00b2 }
    L_0x005b:
        r0 = r7.f51120j;	 Catch:{ all -> 0x00b2 }
        r0 = r0.g();	 Catch:{ all -> 0x00b2 }
        if (r0 == 0) goto L_0x00a9;
    L_0x0063:
        r0 = r7.f51119i;	 Catch:{ all -> 0x00b2 }
        if (r0 != 0) goto L_0x0068;
    L_0x0067:
        goto L_0x00a9;
    L_0x0068:
        r0 = r7.f51120j;	 Catch:{ all -> 0x00b2 }
        r0 = r0.h();	 Catch:{ all -> 0x00b2 }
        if (r0 == 0) goto L_0x00a7;
    L_0x0070:
        r2 = new com.tinder.recsads.model.a;	 Catch:{ all -> 0x00b2 }
        r2.<init>(r0);	 Catch:{ all -> 0x00b2 }
        r0 = "User swiped on %d recs, so injecting ad at position %d";
        r3 = 2;
        r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x00b2 }
        r5 = r7.f51114d;	 Catch:{ all -> 0x00b2 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x00b2 }
        r3[r4] = r5;	 Catch:{ all -> 0x00b2 }
        r5 = r7.f51114d;	 Catch:{ all -> 0x00b2 }
        r6 = r7.f51113c;	 Catch:{ all -> 0x00b2 }
        r5 = r5 + r6;
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x00b2 }
        r3[r1] = r5;	 Catch:{ all -> 0x00b2 }
        p000a.p001a.C0001a.b(r0, r3);	 Catch:{ all -> 0x00b2 }
        r0 = r7.f51121k;	 Catch:{ all -> 0x00b2 }
        r2 = (com.tinder.domain.recs.model.Rec) r2;	 Catch:{ all -> 0x00b2 }
        r1 = r7.f51113c;	 Catch:{ all -> 0x00b2 }
        r0 = r0.insertRec(r2, r1);	 Catch:{ all -> 0x00b2 }
        r0 = r0.b();	 Catch:{ all -> 0x00b2 }
        if (r0 == 0) goto L_0x00a7;
    L_0x00a0:
        r1 = "Unable to insert Ad rec into the recs queue";
        r2 = new java.lang.Object[r4];	 Catch:{ all -> 0x00b2 }
        p000a.p001a.C0001a.b(r0, r1, r2);	 Catch:{ all -> 0x00b2 }
    L_0x00a7:
        monitor-exit(r7);
        return;
    L_0x00a9:
        r0 = "Swipe threshold was hit, but no ads were available";
        r1 = new java.lang.Object[r4];	 Catch:{ all -> 0x00b2 }
        p000a.p001a.C0001a.b(r0, r1);	 Catch:{ all -> 0x00b2 }
        monitor-exit(r7);
        return;
    L_0x00b2:
        r0 = move-exception;
        monitor-exit(r7);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.recsads.rule.e.computeNewSwipe():void");
    }

    /* renamed from: a */
    private final synchronized void m61896a() {
        int secondaryCadence;
        this.f51119i = false;
        this.f51114d = 0;
        this.f51116f++;
        if (this.f51116f != 0) {
            secondaryCadence = this.f51122l.secondaryCadence();
        } else {
            secondaryCadence = this.f51122l.cadence();
        }
        this.f51115e = secondaryCadence;
        this.f51117g = f51111a.m56033a(this.f51115e, this.f51112b);
        this.f51118h = f51111a.m56034a(this.f51115e, this.f51113c);
    }
}
