package com.tinder.recsads.analytics;

import com.tinder.addy.Ad;
import com.tinder.addy.AdLoader;
import com.tinder.addy.source.fan.FanAdLoader;
import com.tinder.addy.source.nativedfp.NativeDfpLoader;
import com.tinder.recsads.model.RecsAdType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0006\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/tinder/recsads/analytics/Provider;", "", "key", "", "(Ljava/lang/String;ILjava/lang/Number;)V", "DFP", "FAN", "OTHER", "Companion", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
public enum Provider {
    ;
    
    public static final C14731a Companion = null;
    private final Number key;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lcom/tinder/recsads/analytics/Provider$Companion;", "", "()V", "forSource", "Lcom/tinder/recsads/analytics/Provider;", "ad", "Lcom/tinder/addy/Ad;", "fromLoader", "adLoader", "Lcom/tinder/addy/AdLoader;", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.analytics.Provider$a */
    public static final class C14731a {
        private C14731a() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final Provider m55992a(@NotNull Ad ad) {
            C2668g.b(ad, "ad");
            ad = ad.adType();
            if (ad == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.recsads.model.RecsAdType");
            }
            switch (ac.f46309a[((RecsAdType) ad).ordinal()]) {
                case 1:
                case 2:
                case 3:
                    return Provider.DFP;
                case 4:
                case 5:
                    return Provider.FAN;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final Provider m55993a(@NotNull AdLoader adLoader) {
            C2668g.b(adLoader, "adLoader");
            if (adLoader instanceof FanAdLoader) {
                return Provider.FAN;
            }
            if ((adLoader instanceof NativeDfpLoader) != null) {
                return Provider.DFP;
            }
            return Provider.OTHER;
        }
    }

    @JvmStatic
    @NotNull
    public static final Provider forSource(@NotNull Ad ad) {
        return Companion.m55992a(ad);
    }

    @JvmStatic
    @NotNull
    public static final Provider fromLoader(@NotNull AdLoader adLoader) {
        return Companion.m55993a(adLoader);
    }

    protected Provider(Number number) {
        C2668g.b(number, "key");
        this.key = number;
    }

    static {
        Companion = new C14731a();
    }

    @NotNull
    public final Number key() {
        return this.key;
    }
}
