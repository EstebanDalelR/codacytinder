package com.tinder.ads.cache;

import com.tinder.ads.Ad;
import com.tinder.ads.AdSource.Type;
import com.tinder.ads.cache.ExpiringAdQueue.ExpirationPolicy;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0006\u001a\u00020\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/ads/cache/AdSourceExpirationPolicy;", "Lcom/tinder/ads/cache/ExpiringAdQueue$ExpirationPolicy;", "()V", "DEFAULT_EXPIRATION_TIME", "", "FAN_EXPIRATION_TIME", "expirationTime", "ad", "Lcom/tinder/ads/Ad;", "insertionTime", "aggregator_release"}, k = 1, mv = {1, 1, 7})
public final class AdSourceExpirationPolicy implements ExpirationPolicy {
    private final long DEFAULT_EXPIRATION_TIME = TimeUnit.DAYS.toMillis(1);
    private final long FAN_EXPIRATION_TIME = TimeUnit.HOURS.toMillis(1);

    @Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 7})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Type.values().length];

        static {
            $EnumSwitchMapping$0[Type.FACEBOOK_AUDIENCE_NETWORK.ordinal()] = 1;
        }
    }

    public long expirationTime(@NotNull Ad<?> ad, long j) {
        C2668g.b(ad, "ad");
        if (WhenMappings.$EnumSwitchMapping$0[ad.source().type().ordinal()] != 1) {
            return j + this.DEFAULT_EXPIRATION_TIME;
        }
        return j + this.FAN_EXPIRATION_TIME;
    }
}
