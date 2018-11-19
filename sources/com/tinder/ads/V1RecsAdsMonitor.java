package com.tinder.ads;

import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.recsads.RecsAdsMonitor;
import com.tinder.recsads.RecsAdsRegistrar;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Subscription;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/ads/V1RecsAdsMonitor;", "Lcom/tinder/recsads/RecsAdsMonitor;", "adAggregator", "Lcom/tinder/ads/AdAggregator;", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "adAggregatorListeners", "", "Lcom/tinder/ads/AdAggregator$Listener;", "(Lcom/tinder/ads/AdAggregator;Lcom/tinder/domain/purchase/SubscriptionProvider;Ljava/util/Set;)V", "subscriptionProviderSubscription", "Lrx/Subscription;", "clear", "", "register", "registrar", "Lcom/tinder/recsads/RecsAdsRegistrar;", "start", "stop", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class V1RecsAdsMonitor implements RecsAdsMonitor {
    private final AdAggregator adAggregator;
    private final Set<AdAggregator$Listener> adAggregatorListeners;
    private final SubscriptionProvider subscriptionProvider;
    private Subscription subscriptionProviderSubscription;

    public V1RecsAdsMonitor(@NotNull AdAggregator adAggregator, @NotNull SubscriptionProvider subscriptionProvider, @NotNull Set<? extends AdAggregator$Listener> set) {
        C2668g.b(adAggregator, "adAggregator");
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        C2668g.b(set, "adAggregatorListeners");
        this.adAggregator = adAggregator;
        this.subscriptionProvider = subscriptionProvider;
        this.adAggregatorListeners = set;
    }

    public void register(@NotNull RecsAdsRegistrar recsAdsRegistrar) {
        C2668g.b(recsAdsRegistrar, "registrar");
        if (!this.adAggregator.isInitialized()) {
            this.adAggregator.initialize((RecsAdSourceRegistrar) recsAdsRegistrar);
        }
    }

    public void start() {
        for (AdAggregator$Listener addListener : this.adAggregatorListeners) {
            this.adAggregator.addListener(addListener);
        }
        this.subscriptionProviderSubscription = this.subscriptionProvider.observe().b(Schedulers.io()).d(new V1RecsAdsMonitor$start$2(this));
    }

    public void stop() {
        Subscription subscription = this.subscriptionProviderSubscription;
        if (subscription != null) {
            subscription.unsubscribe();
        }
        for (AdAggregator$Listener removeListener : this.adAggregatorListeners) {
            this.adAggregator.removeListener(removeListener);
        }
    }

    public void clear() {
        this.adAggregator.clearQueue();
    }
}
