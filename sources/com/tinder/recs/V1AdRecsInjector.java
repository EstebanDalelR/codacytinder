package com.tinder.recs;

import com.tinder.ads.AdAggregator;
import com.tinder.domain.recs.RecsEngine;
import com.tinder.recsads.model.RecsAdsConfig;
import com.tinder.recsads.rule.AdRecsInjector;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0014\u001a\u00020\u0015H\u0017J\b\u0010\u0016\u001a\u00020\u0015H\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/recs/V1AdRecsInjector;", "Lcom/tinder/recsads/rule/AdRecsInjector;", "adAggregator", "Lcom/tinder/ads/AdAggregator;", "recsEngine", "Lcom/tinder/domain/recs/RecsEngine;", "adsConfig", "Lcom/tinder/recsads/model/RecsAdsConfig;", "(Lcom/tinder/ads/AdAggregator;Lcom/tinder/domain/recs/RecsEngine;Lcom/tinder/recsads/model/RecsAdsConfig;)V", "currentCadence", "", "currentRound", "hasPassedInjectionThreshold", "", "injectionPlacementMargin", "injectionThreshold", "numberOfSwipes", "requestOffsetFactor", "", "requestThreshold", "computeNewSwipe", "", "initializeNewRound", "ThresholdCalculator", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class V1AdRecsInjector implements AdRecsInjector {
    public static final ThresholdCalculator ThresholdCalculator = new ThresholdCalculator();
    private final AdAggregator adAggregator;
    private final RecsAdsConfig adsConfig;
    private int currentCadence = -1;
    private int currentRound = -1;
    private boolean hasPassedInjectionThreshold;
    private final int injectionPlacementMargin = this.adsConfig.injectionPlacementMargin();
    private int injectionThreshold = -1;
    private int numberOfSwipes = -1;
    private final RecsEngine recsEngine;
    private final double requestOffsetFactor = this.adsConfig.requestOffsetFactor();
    private int requestThreshold = -1;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/tinder/recs/V1AdRecsInjector$ThresholdCalculator;", "", "()V", "calculateInjectionThreshold", "", "cadence", "injectionMargin", "calculateRequestThreshold", "requestOffset", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class ThresholdCalculator {
        public final int calculateInjectionThreshold(int i, int i2) {
            return i - i2;
        }

        private ThresholdCalculator() {
        }

        public final int calculateRequestThreshold(int i, double d) {
            return (int) Math.ceil(((double) i) / d);
        }
    }

    public V1AdRecsInjector(@NotNull AdAggregator adAggregator, @NotNull RecsEngine recsEngine, @NotNull RecsAdsConfig recsAdsConfig) {
        C2668g.b(adAggregator, "adAggregator");
        C2668g.b(recsEngine, "recsEngine");
        C2668g.b(recsAdsConfig, "adsConfig");
        this.adAggregator = adAggregator;
        this.recsEngine = recsEngine;
        this.adsConfig = recsAdsConfig;
        initializeNewRound();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void computeNewSwipe() {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r7.numberOfSwipes;	 Catch:{ all -> 0x00b2 }
        r1 = 1;
        r0 = r0 + r1;
        r7.numberOfSwipes = r0;	 Catch:{ all -> 0x00b2 }
        r0 = "numberOfSwipes was set to %d";
        r2 = new java.lang.Object[r1];	 Catch:{ all -> 0x00b2 }
        r3 = r7.numberOfSwipes;	 Catch:{ all -> 0x00b2 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x00b2 }
        r4 = 0;
        r2[r4] = r3;	 Catch:{ all -> 0x00b2 }
        p000a.p001a.C0001a.b(r0, r2);	 Catch:{ all -> 0x00b2 }
        r0 = r7.numberOfSwipes;	 Catch:{ all -> 0x00b2 }
        r2 = r7.currentCadence;	 Catch:{ all -> 0x00b2 }
        if (r0 < r2) goto L_0x002a;
    L_0x001d:
        r0 = r7.adAggregator;	 Catch:{ all -> 0x00b2 }
        r0 = r0.hasAdsAvailable();	 Catch:{ all -> 0x00b2 }
        if (r0 != 0) goto L_0x002a;
    L_0x0025:
        r7.initializeNewRound();	 Catch:{ all -> 0x00b2 }
        monitor-exit(r7);
        return;
    L_0x002a:
        r0 = r7.requestThreshold;	 Catch:{ all -> 0x00b2 }
        r2 = r7.numberOfSwipes;	 Catch:{ all -> 0x00b2 }
        if (r0 != r2) goto L_0x0053;
    L_0x0030:
        r0 = "Request threshold was hit";
        r2 = new java.lang.Object[r4];	 Catch:{ all -> 0x00b2 }
        p000a.p001a.C0001a.b(r0, r2);	 Catch:{ all -> 0x00b2 }
        r0 = r7.adAggregator;	 Catch:{ all -> 0x00b2 }
        r0 = r0.hasAdsAvailable();	 Catch:{ all -> 0x00b2 }
        if (r0 != 0) goto L_0x0053;
    L_0x003f:
        r0 = r7.adAggregator;	 Catch:{ all -> 0x00b2 }
        r0 = r0.isBuffering();	 Catch:{ all -> 0x00b2 }
        if (r0 != 0) goto L_0x0053;
    L_0x0047:
        r0 = "Starting to buffer for ads";
        r2 = new java.lang.Object[r4];	 Catch:{ all -> 0x00b2 }
        p000a.p001a.C0001a.b(r0, r2);	 Catch:{ all -> 0x00b2 }
        r0 = r7.adAggregator;	 Catch:{ all -> 0x00b2 }
        r0.startBuffering();	 Catch:{ all -> 0x00b2 }
    L_0x0053:
        r0 = r7.numberOfSwipes;	 Catch:{ all -> 0x00b2 }
        r2 = r7.injectionThreshold;	 Catch:{ all -> 0x00b2 }
        if (r0 != r2) goto L_0x005b;
    L_0x0059:
        r7.hasPassedInjectionThreshold = r1;	 Catch:{ all -> 0x00b2 }
    L_0x005b:
        r0 = r7.adAggregator;	 Catch:{ all -> 0x00b2 }
        r0 = r0.hasAdsAvailable();	 Catch:{ all -> 0x00b2 }
        if (r0 == 0) goto L_0x00a9;
    L_0x0063:
        r0 = r7.hasPassedInjectionThreshold;	 Catch:{ all -> 0x00b2 }
        if (r0 != 0) goto L_0x0068;
    L_0x0067:
        goto L_0x00a9;
    L_0x0068:
        r0 = r7.adAggregator;	 Catch:{ all -> 0x00b2 }
        r0 = r0.consumeAd();	 Catch:{ all -> 0x00b2 }
        if (r0 == 0) goto L_0x00a7;
    L_0x0070:
        r2 = new com.tinder.recs.model.AdRec;	 Catch:{ all -> 0x00b2 }
        r2.<init>(r0);	 Catch:{ all -> 0x00b2 }
        r0 = "User swiped on %d recs, so injecting ad at position %d";
        r3 = 2;
        r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x00b2 }
        r5 = r7.numberOfSwipes;	 Catch:{ all -> 0x00b2 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x00b2 }
        r3[r4] = r5;	 Catch:{ all -> 0x00b2 }
        r5 = r7.numberOfSwipes;	 Catch:{ all -> 0x00b2 }
        r6 = r7.injectionPlacementMargin;	 Catch:{ all -> 0x00b2 }
        r5 = r5 + r6;
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x00b2 }
        r3[r1] = r5;	 Catch:{ all -> 0x00b2 }
        p000a.p001a.C0001a.b(r0, r3);	 Catch:{ all -> 0x00b2 }
        r0 = r7.recsEngine;	 Catch:{ all -> 0x00b2 }
        r2 = (com.tinder.domain.recs.model.Rec) r2;	 Catch:{ all -> 0x00b2 }
        r1 = r7.injectionPlacementMargin;	 Catch:{ all -> 0x00b2 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.recs.V1AdRecsInjector.computeNewSwipe():void");
    }

    private final synchronized void initializeNewRound() {
        int secondaryCadence;
        this.hasPassedInjectionThreshold = false;
        this.numberOfSwipes = 0;
        this.currentRound++;
        if (this.currentRound != 0) {
            secondaryCadence = this.adsConfig.secondaryCadence();
        } else {
            secondaryCadence = this.adsConfig.cadence();
        }
        this.currentCadence = secondaryCadence;
        this.requestThreshold = ThresholdCalculator.calculateRequestThreshold(this.currentCadence, this.requestOffsetFactor);
        this.injectionThreshold = ThresholdCalculator.calculateInjectionThreshold(this.currentCadence, this.injectionPlacementMargin);
    }
}
