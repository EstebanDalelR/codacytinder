package com.tinder.ads.cache;

import com.tinder.ads.Ad;
import com.tinder.ads.cache.ExpiringAdQueue.ExpirationPolicy;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "ad", "Lcom/tinder/ads/Ad;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 7})
final class ExpiringAdQueue$evictExpiredPolled$1 extends Lambda implements Function1<Ad<?>, Boolean> {
    final /* synthetic */ ExpiringAdQueue this$0;

    ExpiringAdQueue$evictExpiredPolled$1(ExpiringAdQueue expiringAdQueue) {
        this.this$0 = expiringAdQueue;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((Ad) obj));
    }

    public final boolean invoke(Ad<?> ad) {
        Long l = (Long) this.this$0.adFetchTimeMap.get(ad);
        if (l == null) {
            return true;
        }
        long time = new Date().getTime();
        ExpirationPolicy access$getExpirationPolicy$p = this.this$0.expirationPolicy;
        C2668g.a(ad, "ad");
        C2668g.a(l, "it");
        if (time > access$getExpirationPolicy$p.expirationTime(ad, l.longValue())) {
            return true;
        }
        return false;
    }
}
