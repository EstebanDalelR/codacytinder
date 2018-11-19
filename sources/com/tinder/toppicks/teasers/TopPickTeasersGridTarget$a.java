package com.tinder.toppicks.teasers;

import com.tinder.paywall.legacy.GoldPaywallSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C17554o;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
public final class TopPickTeasersGridTarget$a {
    /* renamed from: a */
    public static /* synthetic */ void m57430a(TopPickTeasersGridTarget topPickTeasersGridTarget, List list, GoldPaywallSource goldPaywallSource, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showPaywall");
        }
        if ((i & 1) != 0) {
            list = C17554o.m64195a();
        }
        topPickTeasersGridTarget.showPaywall(list, goldPaywallSource);
    }
}
