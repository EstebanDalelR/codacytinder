package com.tinder.paywall.viewmodels;

import com.tinder.boost.p178a.C10400d;
import com.tinder.tinderplus.p428a.C15192e;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/paywall/viewmodels/PerkOrderResolver;", "", "tinderPlusDiscountInteractor", "Lcom/tinder/tinderplus/interactors/TinderPlusDiscountInteractor;", "boostInteractor", "Lcom/tinder/boost/interactor/BoostInteractor;", "(Lcom/tinder/tinderplus/interactors/TinderPlusDiscountInteractor;Lcom/tinder/boost/interactor/BoostInteractor;)V", "getPerkOrder", "", "", "firstPerk", "Lcom/tinder/paywall/viewmodels/PaywallPerk;", "orderedPerks", "isFromDiscountNotification", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.paywall.viewmodels.p */
public final class C10094p {
    /* renamed from: a */
    private final C15192e f33014a;
    /* renamed from: b */
    private final C10400d f33015b;

    @Inject
    public C10094p(@NotNull C15192e c15192e, @NotNull C10400d c10400d) {
        C2668g.b(c15192e, "tinderPlusDiscountInteractor");
        C2668g.b(c10400d, "boostInteractor");
        this.f33014a = c15192e;
        this.f33015b = c10400d;
    }

    @NotNull
    /* renamed from: a */
    public final List<String> m41265a(@Nullable PaywallPerk paywallPerk, @NotNull List<String> list, boolean z) {
        C2668g.b(list, "orderedPerks");
        if (list.isEmpty()) {
            return C19301m.a();
        }
        list = C19301m.d(list);
        if (!this.f33014a.d()) {
            if (!z) {
                list.remove(PaywallPerk.DISCOUNT.getStringVal());
                if (!this.f33015b.m42274a()) {
                    list.remove(PaywallPerk.BOOST.getStringVal());
                }
                list.remove(PaywallPerk.FAST_MATCH.getStringVal());
                if (paywallPerk != null) {
                    paywallPerk = list.indexOf(paywallPerk.getStringVal());
                    if (paywallPerk > true) {
                        Collections.swap(list, 0, paywallPerk);
                    }
                }
                return list;
            }
        }
        if (list.contains(PaywallPerk.DISCOUNT.getStringVal()) == null) {
            list.add(0, PaywallPerk.DISCOUNT.getStringVal());
        }
        paywallPerk = PaywallPerk.DISCOUNT;
        if (this.f33015b.m42274a()) {
            list.remove(PaywallPerk.BOOST.getStringVal());
        }
        list.remove(PaywallPerk.FAST_MATCH.getStringVal());
        if (paywallPerk != null) {
            paywallPerk = list.indexOf(paywallPerk.getStringVal());
            if (paywallPerk > true) {
                Collections.swap(list, 0, paywallPerk);
            }
        }
        return list;
    }
}
