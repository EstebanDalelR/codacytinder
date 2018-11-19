package com.tinder.addy.cache;

import com.tinder.addy.Ad;
import com.tinder.addy.cache.ExpiringAdQueue.ExpirationPolicy;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/addy/cache/AdSourceExpirationPolicy;", "Lcom/tinder/addy/cache/ExpiringAdQueue$ExpirationPolicy;", "()V", "DEFAULT_EXPIRATION_TIME", "", "FAN_EXPIRATION_TIME", "expirationTime", "ad", "Lcom/tinder/addy/Ad;", "insertionTime", "addy_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.addy.cache.a */
public final class C7295a implements ExpirationPolicy {
    /* renamed from: a */
    private final long f26399a = TimeUnit.HOURS.toMillis(1);
    /* renamed from: b */
    private final long f26400b = TimeUnit.DAYS.toMillis(1);

    public long expirationTime(@NotNull Ad ad, long j) {
        C2668g.b(ad, "ad");
        return j + this.f26400b;
    }
}
