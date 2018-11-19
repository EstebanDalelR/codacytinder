package com.tinder.paywall.viewmodels;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ae;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C19068g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0001\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0018"}, d2 = {"Lcom/tinder/paywall/viewmodels/PaywallPerk;", "", "stringVal", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getStringVal", "()Ljava/lang/String;", "setStringVal", "(Ljava/lang/String;)V", "UNLIMITED_LIKES", "UNDO", "NO_ADS", "PASSPORT", "SUPER_LIKE", "DISCOUNT", "BOOST", "YOUR_PROFILE", "WHO_SEES_YOU", "FAST_MATCH", "TINDER_PLUS_FEATURES", "TOP_PICKS_TEASER", "TOP_PICKS_FEATURE", "UNKNOWN", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public enum PaywallPerk {
    ;
    
    public static final C10081a Companion = null;
    @NotNull
    private static final Map<String, PaywallPerk> valueMap = null;
    @NotNull
    private String stringVal;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0005R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/tinder/paywall/viewmodels/PaywallPerk$Companion;", "", "()V", "valueMap", "", "", "Lcom/tinder/paywall/viewmodels/PaywallPerk;", "getValueMap", "()Ljava/util/Map;", "fromStringValue", "stringVal", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.paywall.viewmodels.PaywallPerk$a */
    public static final class C10081a {
        private C10081a() {
        }

        @NotNull
        /* renamed from: a */
        public final Map<String, PaywallPerk> m41199a() {
            return PaywallPerk.valueMap;
        }

        @NotNull
        /* renamed from: a */
        public final PaywallPerk m41198a(@NotNull String str) {
            C2668g.b(str, "stringVal");
            PaywallPerk paywallPerk = (PaywallPerk) m41199a().get(str);
            return paywallPerk != null ? paywallPerk : PaywallPerk.UNKNOWN;
        }
    }

    protected PaywallPerk(String str) {
        C2668g.b(str, "stringVal");
        this.stringVal = str;
    }

    @NotNull
    public final String getStringVal() {
        return this.stringVal;
    }

    public final void setStringVal(@NotNull String str) {
        C2668g.b(str, "<set-?>");
        this.stringVal = str;
    }

    static {
        Companion = new C10081a();
        PaywallPerk[] values = values();
        Map linkedHashMap = new LinkedHashMap(C19068g.c(ae.a(values.length), 16));
        int length = values.length;
        int i;
        while (i < length) {
            PaywallPerk paywallPerk = values[i];
            linkedHashMap.put(paywallPerk.stringVal, paywallPerk);
            i++;
        }
        valueMap = linkedHashMap;
    }
}
