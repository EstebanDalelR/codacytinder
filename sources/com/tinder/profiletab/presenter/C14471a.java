package com.tinder.profiletab.presenter;

import com.tinder.controlla.model.AdvertisingPageType;
import com.tinder.paywall.legacy.BoostPaywallSource;
import com.tinder.paywall.legacy.GoldPaywallSource;
import com.tinder.paywall.legacy.PaywallTypeSource;
import com.tinder.paywall.legacy.PlusPaywallSource;
import com.tinder.paywall.legacy.SuperlikePaywallSource;
import com.tinder.paywall.paywallflow.C10076o;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\u0004¨\u0006\f"}, d2 = {"Lcom/tinder/profiletab/presenter/ControllaPaywallFlowFactory;", "", "()V", "createBoostPaywallFlow", "Lcom/tinder/paywall/paywallflow/PaywallFlow;", "createGoldPaywallFlow", "source", "Lcom/tinder/paywall/legacy/PaywallTypeSource;", "createPaywallFlow", "pageType", "Lcom/tinder/controlla/model/AdvertisingPageType;", "createSuperLikePaywallFlow", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.profiletab.presenter.a */
public final class C14471a {
    @NotNull
    /* renamed from: a */
    public final C10076o m55235a(@NotNull AdvertisingPageType advertisingPageType) {
        C2668g.b(advertisingPageType, "pageType");
        if (C14472b.f45815a[advertisingPageType.ordinal()] != 1) {
            advertisingPageType = C10076o.a((PaywallTypeSource) PlusPaywallSource.PROFILE_TAB);
            C2668g.a(advertisingPageType, "PaywallFlow.create(PlusPaywallSource.PROFILE_TAB)");
            return advertisingPageType;
        }
        advertisingPageType = C10076o.a((PaywallTypeSource) GoldPaywallSource.CONTROLLA_FASTMATCH_FEATURE);
        C2668g.a(advertisingPageType, "PaywallFlow.create(GoldP…TROLLA_FASTMATCH_FEATURE)");
        return advertisingPageType;
    }

    @NotNull
    /* renamed from: a */
    public final C10076o m55234a() {
        C10076o a = C10076o.a(BoostPaywallSource.PROFILE_TAB_BOOST);
        C2668g.a(a, "PaywallFlow.create(Boost…Source.PROFILE_TAB_BOOST)");
        return a;
    }

    @NotNull
    /* renamed from: b */
    public final C10076o m55237b() {
        C10076o a = C10076o.a(SuperlikePaywallSource.PROFILE_TAB_SUPERLIKE);
        C2668g.a(a, "PaywallFlow.create(Super…ce.PROFILE_TAB_SUPERLIKE)");
        return a;
    }

    @NotNull
    /* renamed from: a */
    public final C10076o m55236a(@NotNull PaywallTypeSource paywallTypeSource) {
        C2668g.b(paywallTypeSource, "source");
        paywallTypeSource = C10076o.a(paywallTypeSource);
        C2668g.a(paywallTypeSource, "PaywallFlow.create(source)");
        return paywallTypeSource;
    }
}
