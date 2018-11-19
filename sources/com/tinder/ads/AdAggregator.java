package com.tinder.ads;

import com.tinder.ads.cache.AdQueue;
import com.tinder.ads.cache.AdSourceExpirationPolicy;
import com.tinder.ads.cache.ExpiringAdQueue;
import com.tinder.ads.validation.AdValidator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.Subscription;
import rx.p494a.p496b.C19397a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u000201B'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010J\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190\u0018J\u0006\u0010\u001a\u001a\u00020\u0012J\f\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0019J\u0006\u0010\u001c\u001a\u00020\u0012J\u0006\u0010\u001d\u001a\u00020\u0012J\b\u0010\u001e\u001a\u00020\u0012H\u0002J\u0006\u0010\u001f\u001a\u00020\tJ\u000e\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\tJ\u0006\u0010$\u001a\u00020\tJ\u0014\u0010%\u001a\u00020\u00122\n\u0010&\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0002J\u0018\u0010'\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u000e\u0010+\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010J\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00160-J\u0006\u0010.\u001a\u00020\u0012J\u0006\u0010/\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/tinder/ads/AdAggregator;", "", "adQueue", "Lcom/tinder/ads/cache/AdQueue;", "sourceMediator", "Lcom/tinder/ads/SourceMediator;", "adValidator", "Lcom/tinder/ads/validation/AdValidator;", "enabled", "", "(Lcom/tinder/ads/cache/AdQueue;Lcom/tinder/ads/SourceMediator;Lcom/tinder/ads/validation/AdValidator;Z)V", "fetchSubscription", "Lrx/Subscription;", "initialized", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/tinder/ads/AdAggregator$Listener;", "addListener", "", "listener", "addSource", "source", "Lcom/tinder/ads/AdSource;", "ads", "", "Lcom/tinder/ads/Ad;", "clearQueue", "consumeAd", "disable", "enable", "fetchForNextSource", "hasAdsAvailable", "initialize", "adRegistrar", "Lcom/tinder/ads/AdRegistrar;", "isBuffering", "isInitialized", "notifyAdAdded", "ad", "notifyAdFailed", "throwable", "", "notifyAdRequestSent", "removeListener", "sources", "", "startBuffering", "stopBuffering", "Builder", "Listener", "aggregator_release"}, k = 1, mv = {1, 1, 7})
public final class AdAggregator {
    private final AdQueue adQueue;
    private final AdValidator adValidator;
    private boolean enabled;
    private Subscription fetchSubscription;
    private boolean initialized;
    private final CopyOnWriteArraySet<AdAggregator$Listener> listeners;
    private final SourceMediator sourceMediator;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/ads/AdAggregator$Builder;", "", "()V", "adQueue", "Lcom/tinder/ads/cache/AdQueue;", "adValidator", "Lcom/tinder/ads/validation/AdValidator;", "enabled", "", "sourceMediator", "Lcom/tinder/ads/SourceMediator;", "build", "Lcom/tinder/ads/AdAggregator;", "aggregator_release"}, k = 1, mv = {1, 1, 7})
    public static final class Builder {
        private AdQueue adQueue = new ExpiringAdQueue(new AdSourceExpirationPolicy());
        private AdValidator adValidator = new AdValidator();
        private boolean enabled = true;
        private SourceMediator sourceMediator;

        @NotNull
        public final Builder sourceMediator(@NotNull SourceMediator sourceMediator) {
            C2668g.b(sourceMediator, "sourceMediator");
            this.sourceMediator = sourceMediator;
            return this;
        }

        @NotNull
        public final Builder enabled(boolean z) {
            this.enabled = z;
            return this;
        }

        @NotNull
        public final Builder adQueue(@NotNull AdQueue adQueue) {
            C2668g.b(adQueue, "adQueue");
            this.adQueue = adQueue;
            return this;
        }

        @NotNull
        public final Builder adValidator(@NotNull AdValidator adValidator) {
            C2668g.b(adValidator, "adValidator");
            this.adValidator = adValidator;
            return this;
        }

        @NotNull
        public final AdAggregator build() {
            if (this.sourceMediator == null) {
                throw new IllegalStateException("Must supply a non-null SourceMediator");
            }
            AdQueue adQueue = this.adQueue;
            SourceMediator sourceMediator = this.sourceMediator;
            if (sourceMediator == null) {
                C2668g.a();
            }
            return new AdAggregator(adQueue, sourceMediator, this.adValidator, this.enabled);
        }
    }

    private AdAggregator(AdQueue adQueue, SourceMediator sourceMediator, AdValidator adValidator, boolean z) {
        this.adQueue = adQueue;
        this.sourceMediator = sourceMediator;
        this.adValidator = adValidator;
        this.enabled = z;
        this.listeners = new CopyOnWriteArraySet();
    }

    public final void initialize(@NotNull AdRegistrar adRegistrar) {
        C2668g.b(adRegistrar, "adRegistrar");
        if (this.initialized) {
            C0001a.c("AdAggregator already initialized", new Object[0]);
            return;
        }
        adRegistrar.registerAdSources(this);
        this.initialized = true;
    }

    public final void enable() {
        this.enabled = true;
    }

    public final void disable() {
        this.enabled = false;
        stopBuffering();
        this.adQueue.clear();
    }

    public final void startBuffering() {
        if (this.enabled) {
            if (this.fetchSubscription != null) {
                Subscription subscription = this.fetchSubscription;
                if (subscription == null) {
                    C2668g.a();
                }
                if (!subscription.isUnsubscribed()) {
                    C0001a.c("Already subscribed to Source Fetcher, waiting to hear back", new Object[0]);
                    return;
                }
            }
            fetchForNextSource();
            return;
        }
        C0001a.c("Attempt to start buffering while AdsAggregator is disabled", new Object[0]);
    }

    public final void stopBuffering() {
        if (this.fetchSubscription != null) {
            Subscription subscription = this.fetchSubscription;
            if (subscription == null) {
                C2668g.a();
            }
            subscription.unsubscribe();
        }
    }

    public final boolean isInitialized() {
        return this.initialized;
    }

    public final boolean isBuffering() {
        if (this.fetchSubscription != null) {
            Subscription subscription = this.fetchSubscription;
            if (subscription == null) {
                C2668g.a();
            }
            if (!subscription.isUnsubscribed()) {
                return true;
            }
        }
        return false;
    }

    public final boolean hasAdsAvailable() {
        return this.adQueue.isEmpty() ^ 1;
    }

    @Nullable
    public final Ad<?> consumeAd() {
        return this.adQueue.poll();
    }

    public final void addSource(@NotNull AdSource adSource) {
        C2668g.b(adSource, "source");
        this.sourceMediator.addSource(adSource);
    }

    public final void addListener(@NotNull AdAggregator$Listener adAggregator$Listener) {
        C2668g.b(adAggregator$Listener, "listener");
        this.listeners.add(adAggregator$Listener);
    }

    public final void removeListener(@NotNull AdAggregator$Listener adAggregator$Listener) {
        C2668g.b(adAggregator$Listener, "listener");
        this.listeners.remove(adAggregator$Listener);
    }

    public final void clearQueue() {
        this.adQueue.clear();
    }

    @NotNull
    public final List<Ad<?>> ads() {
        return this.adQueue.getAll();
    }

    @NotNull
    public final Set<AdSource> sources() {
        return this.sourceMediator.sources();
    }

    private final void fetchForNextSource() {
        AdSource nextSource = this.sourceMediator.nextSource();
        if (nextSource != null) {
            AdSourceFetcher createSourceFetcher = nextSource.createSourceFetcher();
            this.fetchSubscription = createSourceFetcher.loadNext().d(new AdAggregator$fetchForNextSource$1(this)).b(createSourceFetcher.scheduler()).a(C19397a.a()).a(new AdAggregator$fetchForNextSource$2(this, nextSource)).b(new AdAggregator$fetchForNextSource$3(createSourceFetcher)).a(new AdAggregator$fetchForNextSource$4(this), new AdAggregator$fetchForNextSource$5(this, nextSource));
        }
    }

    private final void notifyAdFailed(AdSource adSource, Throwable th) {
        Iterator it = this.listeners.iterator();
        while (it.hasNext()) {
            ((AdAggregator$Listener) it.next()).onAdFailed(adSource, th);
        }
    }

    private final void notifyAdAdded(Ad<?> ad) {
        Iterator it = this.listeners.iterator();
        while (it.hasNext()) {
            ((AdAggregator$Listener) it.next()).onAdAdded(ad);
        }
    }

    private final void notifyAdRequestSent(AdSource adSource) {
        Iterator it = this.listeners.iterator();
        while (it.hasNext()) {
            ((AdAggregator$Listener) it.next()).onAdRequestSent(adSource);
        }
    }
}
