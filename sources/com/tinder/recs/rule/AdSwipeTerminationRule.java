package com.tinder.recs.rule;

import android.text.TextUtils;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.tinder.addy.Ad;
import com.tinder.addy.tracker.AdUrlTracker;
import com.tinder.ads.RecsNativeAd;
import com.tinder.ads.analytics.V1AddAdOpenEvent;
import com.tinder.ads.analytics.V1AddAdOpenEvent.Request;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.model.Swipe.Method;
import com.tinder.domain.recs.model.Swipe.Type;
import com.tinder.domain.recs.model.SwipeMethod;
import com.tinder.domain.recs.rule.SuccessfulSwipeTerminationRule;
import com.tinder.domain.recs.rule.SwipeProcessingRule.ResultType;
import com.tinder.recs.model.AdRec;
import com.tinder.recsads.analytics.AddAdOpenEvent;
import com.tinder.recsads.analytics.AddAdOpenEvent.AdOpenMethodType;
import com.tinder.recsads.analytics.AddAdOpenEvent.C14730a;
import com.tinder.recsads.analytics.C16438p;
import com.tinder.recsads.analytics.C16438p.C14743a;
import com.tinder.recsads.analytics.CtaBounceBackTimer;
import com.tinder.recsads.model.C16464a;
import com.tinder.recsads.model.C16468f;
import com.tinder.recsads.model.RecsAdTrackingEvent;
import com.tinder.recsads.model.RecsAdsConfig;
import io.reactivex.C3956a;
import io.reactivex.p453a.p455b.C15674a;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.functions.Action0;
import rx.schedulers.Schedulers;
import rx.subjects.PublishSubject;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020!H\u0002J\u0018\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%H\u0002J\u001c\u0010&\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030'H\u0002J\"\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013H\u0002J\u0010\u0010.\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010/\u001a\u00020\u00172\u0006\u0010$\u001a\u00020%H\u0002J\u0018\u00100\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u00101\u001a\u000202H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/tinder/recs/rule/AdSwipeTerminationRule;", "Lcom/tinder/domain/recs/rule/SuccessfulSwipeTerminationRule;", "config", "Lcom/tinder/recsads/model/RecsAdsConfig;", "adUrlTracker", "Lcom/tinder/addy/tracker/AdUrlTracker;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "addAdSelectEvent", "Lcom/tinder/recsads/analytics/AddAdSelectEvent;", "ctaBounceBackTimer", "Lcom/tinder/recsads/analytics/CtaBounceBackTimer;", "addAdOpenEvent", "Lcom/tinder/recsads/analytics/AddAdOpenEvent;", "v1AddAdOpenEvent", "Lcom/tinder/ads/analytics/V1AddAdOpenEvent;", "(Lcom/tinder/recsads/model/RecsAdsConfig;Lcom/tinder/addy/tracker/AdUrlTracker;Lcom/tinder/core/experiment/AbTestUtility;Lcom/tinder/recsads/analytics/AddAdSelectEvent;Lcom/tinder/recsads/analytics/CtaBounceBackTimer;Lcom/tinder/recsads/analytics/AddAdOpenEvent;Lcom/tinder/ads/analytics/V1AddAdOpenEvent;)V", "adRuleSubject", "Lrx/subjects/PublishSubject;", "", "observe", "Lrx/Observable;", "openClickThroughUrl", "", "clickthroughUrl", "perform", "Lcom/tinder/domain/recs/rule/SwipeProcessingRule$ResultType;", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "sendAdOpenEvent", "ad", "Lcom/tinder/addy/Ad;", "sendClickAnalytics", "Lcom/tinder/recsads/model/RecsNativeDfpAd;", "sendClickAnalyticsV1", "lineItemId", "nativeCustomTemplateAd", "Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "sendV1AdOpenEvent", "Lcom/tinder/ads/Ad;", "shouldOpenClickthroughUrl", "", "swipeType", "Lcom/tinder/domain/recs/model/Swipe$Type;", "swipeMethod", "Lcom/tinder/domain/recs/model/Swipe$Method;", "trackAdSelectEvent", "trackDfpClick", "tryOpenClickthroughUrl", "rec", "Lcom/tinder/domain/recs/model/Rec;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class AdSwipeTerminationRule implements SuccessfulSwipeTerminationRule {
    private final AbTestUtility abTestUtility;
    private final PublishSubject<String> adRuleSubject;
    private final AdUrlTracker adUrlTracker;
    private final AddAdOpenEvent addAdOpenEvent;
    private final C16438p addAdSelectEvent;
    private final RecsAdsConfig config;
    private final CtaBounceBackTimer ctaBounceBackTimer;
    private final V1AddAdOpenEvent v1AddAdOpenEvent;

    @Inject
    public AdSwipeTerminationRule(@NotNull RecsAdsConfig recsAdsConfig, @NotNull AdUrlTracker adUrlTracker, @NotNull AbTestUtility abTestUtility, @NotNull C16438p c16438p, @NotNull CtaBounceBackTimer ctaBounceBackTimer, @NotNull AddAdOpenEvent addAdOpenEvent, @NotNull V1AddAdOpenEvent v1AddAdOpenEvent) {
        C2668g.b(recsAdsConfig, "config");
        C2668g.b(adUrlTracker, "adUrlTracker");
        C2668g.b(abTestUtility, "abTestUtility");
        C2668g.b(c16438p, "addAdSelectEvent");
        C2668g.b(ctaBounceBackTimer, "ctaBounceBackTimer");
        C2668g.b(addAdOpenEvent, "addAdOpenEvent");
        C2668g.b(v1AddAdOpenEvent, "v1AddAdOpenEvent");
        this.config = recsAdsConfig;
        this.adUrlTracker = adUrlTracker;
        this.abTestUtility = abTestUtility;
        this.addAdSelectEvent = c16438p;
        this.ctaBounceBackTimer = ctaBounceBackTimer;
        this.addAdOpenEvent = addAdOpenEvent;
        this.v1AddAdOpenEvent = v1AddAdOpenEvent;
        recsAdsConfig = PublishSubject.w();
        C2668g.a(recsAdsConfig, "PublishSubject.create()");
        this.adRuleSubject = recsAdsConfig;
    }

    @NotNull
    public final Observable<String> observe() {
        Observable<String> e = this.adRuleSubject.e();
        C2668g.a(e, "adRuleSubject.asObservable()");
        return e;
    }

    @NotNull
    public ResultType perform(@NotNull Swipe swipe) {
        C2668g.b(swipe, "swipe");
        Rec rec = swipe.getRec();
        if ((rec instanceof AdRec) || (rec instanceof C16464a)) {
            tryOpenClickthroughUrl(swipe, rec);
            return ResultType.PROCEED;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Illegal type (");
        stringBuilder.append(swipe.getRec().getType());
        stringBuilder.append(") of rec used for AdSwipeTerminationRule");
        C0001a.b(stringBuilder.toString(), new Object[0]);
        return ResultType.PROCEED;
    }

    private final void tryOpenClickthroughUrl(Swipe swipe, Rec rec) {
        if (this.abTestUtility.isAddyV2Enabled()) {
            if (rec == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.recsads.model.AdRec");
            }
            rec = ((C16464a) rec).m61877c();
            if (rec instanceof C16468f) {
                C16468f c16468f = (C16468f) rec;
                if (shouldOpenClickthroughUrl(swipe.getType(), swipe.getActionContext().getMethod(), c16468f.getClickthroughUrl())) {
                    sendClickAnalytics(c16468f);
                    openClickThroughUrl(c16468f.getClickthroughUrl());
                    sendAdOpenEvent(swipe, rec);
                }
            }
        } else if (rec == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.recs.model.AdRec");
        } else {
            rec = ((AdRec) rec).getAd();
            if (rec instanceof RecsNativeAd) {
                RecsNativeAd recsNativeAd = (RecsNativeAd) rec;
                if (shouldOpenClickthroughUrl(swipe.getType(), swipe.getActionContext().getMethod(), recsNativeAd.clickthroughUrl())) {
                    sendClickAnalyticsV1(recsNativeAd.lineItemId(), recsNativeAd.getNativeCustomTemplateAd());
                    openClickThroughUrl(recsNativeAd.clickthroughUrl());
                    sendV1AdOpenEvent(swipe, rec);
                }
            }
        }
    }

    private final boolean shouldOpenClickthroughUrl(Type type, Method method, String str) {
        if (type != Type.PASS) {
            if (TextUtils.isEmpty(str) == null) {
                if (method == SwipeMethod.AD_CLICK) {
                    type = true;
                } else {
                    type = this.config.isSwipeToOpenEnabled();
                }
                return type;
            }
        }
        return null;
    }

    private final void sendClickAnalytics(C16468f c16468f) {
        this.adUrlTracker.a(c16468f.getLineItemId(), RecsAdTrackingEvent.CLICK);
        trackDfpClick(c16468f.getNativeCustomTemplateAd());
        Ad ad = c16468f;
        trackAdSelectEvent(ad);
        this.ctaBounceBackTimer.m55989a(ad);
    }

    private final void sendClickAnalyticsV1(String str, NativeCustomTemplateAd nativeCustomTemplateAd) {
        this.adUrlTracker.a(str, RecsAdTrackingEvent.CLICK);
        trackDfpClick(nativeCustomTemplateAd);
    }

    private final void openClickThroughUrl(String str) {
        if (str != null) {
            this.adRuleSubject.onNext(str);
        }
    }

    private final void trackDfpClick(NativeCustomTemplateAd nativeCustomTemplateAd) {
        C3956a.a(new AdSwipeTerminationRule$trackDfpClick$1(nativeCustomTemplateAd)).b(C15674a.m58830a()).a(AdSwipeTerminationRule$trackDfpClick$2.INSTANCE, AdSwipeTerminationRule$trackDfpClick$3.INSTANCE);
    }

    private final void trackAdSelectEvent(Ad ad) {
        this.addAdSelectEvent.m56002a((Object) C14743a.m56012d().mo12176a(5).mo12177a(), ad).b(Schedulers.io()).a(AdSwipeTerminationRule$trackAdSelectEvent$1.INSTANCE, AdSwipeTerminationRule$trackAdSelectEvent$2.INSTANCE);
    }

    private final void sendAdOpenEvent(Swipe swipe, Ad ad) {
        if (swipe.getActionContext().getMethod() == SwipeMethod.AD_CLICK) {
            swipe = AdOpenMethodType.TAP;
        } else {
            swipe = AdOpenMethodType.SWIPE;
        }
        this.addAdOpenEvent.m56002a((Object) new C14730a(swipe), ad).b(Schedulers.io()).a((Action0) AdSwipeTerminationRule$sendAdOpenEvent$1.INSTANCE, AdSwipeTerminationRule$sendAdOpenEvent$2.INSTANCE);
    }

    private final void sendV1AdOpenEvent(Swipe swipe, com.tinder.ads.Ad<?> ad) {
        if (swipe.getActionContext().getMethod() == SwipeMethod.AD_CLICK) {
            swipe = V1AddAdOpenEvent.AdOpenMethodType.TAP;
        } else {
            swipe = V1AddAdOpenEvent.AdOpenMethodType.SWIPE;
        }
        this.v1AddAdOpenEvent.execute(new Request(swipe), ad).b(Schedulers.io()).a((Action0) AdSwipeTerminationRule$sendV1AdOpenEvent$1.INSTANCE, AdSwipeTerminationRule$sendV1AdOpenEvent$2.INSTANCE);
    }
}
