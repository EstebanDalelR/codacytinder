package com.tinder.analytics.attribution;

import android.support.annotation.VisibleForTesting;
import com.tinder.common.p077b.C8524b;
import java.util.Set;
import javax.inject.Inject;

class g$a {
    /* renamed from: a */
    static final Set<String> f22770a = C8524b.b(new String[]{"BoostPaywall.Purchase", "SuperLikePaywall.Purchase", "Gold.Purchase", "TinderPlus.Purchase"});
    @VisibleForTesting
    /* renamed from: b */
    static final Set<String> f22771b = C8524b.a(new String[]{"App.Open"});

    static {
        f22771b.addAll(f22770a);
    }

    @Inject
    g$a() {
    }

    /* renamed from: a */
    boolean m26835a(String str) {
        return f22771b.contains(str);
    }

    /* renamed from: b */
    boolean m26836b(String str) {
        return f22770a.contains(str);
    }
}
