package com.tinder.ads.analytics;

import com.tinder.addy.Ad;
import com.tinder.addy.AdAggregator.Listener;
import com.tinder.addy.AdLoader;
import com.tinder.recsads.analytics.C16435l;
import com.tinder.recsads.analytics.C16435l.C14740a;
import com.tinder.recsads.analytics.C16437n;
import com.tinder.recsads.analytics.C16437n.C14741a;
import com.tinder.utils.RxUtils;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/ads/analytics/AnalyticsAdAggregatorListener;", "Lcom/tinder/addy/AdAggregator$Listener;", "addAdRequestSendEvent", "Lcom/tinder/recsads/analytics/AddAdRequestSendEvent;", "addAdRequestReceiveEvent", "Lcom/tinder/recsads/analytics/AddAdRequestReceiveEvent;", "(Lcom/tinder/recsads/analytics/AddAdRequestSendEvent;Lcom/tinder/recsads/analytics/AddAdRequestReceiveEvent;)V", "onAdAdded", "", "ad", "Lcom/tinder/addy/Ad;", "onAdRequestFailed", "adLoader", "Lcom/tinder/addy/AdLoader;", "exception", "", "onAdRequestSent", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class AnalyticsAdAggregatorListener implements Listener {
    private final C16435l addAdRequestReceiveEvent;
    private final C16437n addAdRequestSendEvent;

    public void onAdRequestFailed(@NotNull AdLoader adLoader, @NotNull Throwable th) {
        C2668g.b(adLoader, "adLoader");
        C2668g.b(th, "exception");
    }

    @Inject
    public AnalyticsAdAggregatorListener(@NotNull C16437n c16437n, @NotNull C16435l c16435l) {
        C2668g.b(c16437n, "addAdRequestSendEvent");
        C2668g.b(c16435l, "addAdRequestReceiveEvent");
        this.addAdRequestSendEvent = c16437n;
        this.addAdRequestReceiveEvent = c16435l;
    }

    public void onAdAdded(@NotNull Ad ad) {
        C2668g.b(ad, "ad");
        this.addAdRequestReceiveEvent.a(new C14740a(), ad).b(Schedulers.io()).b(RxUtils.b());
    }

    public void onAdRequestSent(@NotNull AdLoader adLoader) {
        C2668g.b(adLoader, "adLoader");
        this.addAdRequestSendEvent.a(new C14741a(adLoader)).b(C15756a.b()).a(AnalyticsAdAggregatorListener$onAdRequestSent$1.INSTANCE, AnalyticsAdAggregatorListener$onAdRequestSent$2.INSTANCE);
    }
}
