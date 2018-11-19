package com.tinder.addy.cache;

import com.tinder.addy.Ad;
import com.tinder.addy.cache.ExpiringAdQueue.ExpirationPolicy;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "ad", "Lcom/tinder/addy/Ad;", "invoke"}, k = 3, mv = {1, 1, 10})
final class ExpiringAdQueue$evictExpiredPolled$1 extends Lambda implements Function1<Ad, Boolean> {
    /* renamed from: a */
    final /* synthetic */ ExpiringAdQueue f29114a;

    ExpiringAdQueue$evictExpiredPolled$1(ExpiringAdQueue expiringAdQueue) {
        this.f29114a = expiringAdQueue;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(m34526a((Ad) obj));
    }

    /* renamed from: a */
    public final boolean m34526a(@NotNull Ad ad) {
        C2668g.b(ad, "ad");
        Long l = (Long) this.f29114a.f26397b.get(ad);
        if (l == null) {
            return true;
        }
        long time = new Date().getTime();
        ExpirationPolicy b = this.f29114a.f26398c;
        C2668g.a(l, "it");
        if (time > b.expirationTime(ad, l.longValue())) {
            return true;
        }
        return false;
    }
}
