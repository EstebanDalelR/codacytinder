package com.tinder.ads;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.C2671a;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001 \u0001*\u0006\u0012\u0002\b\u00030\u0002*\u0006\b\u0001\u0010\u0003 \u0000*\n\b\u0002\u0010\u0004 \u0000*\u00020\u00052\u00020\u0006:\u0001\rJ\b\u0010\u0007\u001a\u00020\bH&J\u0014\u0010\t\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&¨\u0006\u000e"}, d2 = {"Lcom/tinder/ads/AdSourceFetcher;", "AD", "Lcom/tinder/ads/Ad;", "WRAPPED", "SOURCE", "Lcom/tinder/ads/AdSource;", "", "cancel", "", "loadNext", "Lrx/Single;", "scheduler", "Lrx/Scheduler;", "AdFactory", "aggregator_release"}, k = 1, mv = {1, 1, 7})
public interface AdSourceFetcher<AD extends Ad<?>, WRAPPED, SOURCE extends AdSource> {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u0000*\u0006\b\u0003\u0010\u0001 \u0001*\u0006\b\u0004\u0010\u0002 \u0000*\u0006\b\u0005\u0010\u0003 \u00002\u00020\u0004J\u001d\u0010\u0005\u001a\u00028\u00032\u0006\u0010\u0006\u001a\u00028\u00052\u0006\u0010\u0007\u001a\u00028\u0004H&¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/tinder/ads/AdSourceFetcher$AdFactory;", "AD", "WRAPPED", "SOURCE", "", "createAd", "source", "wrapped", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "aggregator_release"}, k = 1, mv = {1, 1, 7})
    public interface AdFactory<AD, WRAPPED, SOURCE> {
        AD createAd(SOURCE source, WRAPPED wrapped);
    }

    void cancel();

    @NotNull
    Single<? extends Ad<?>> loadNext();

    @NotNull
    C2671a scheduler();
}
