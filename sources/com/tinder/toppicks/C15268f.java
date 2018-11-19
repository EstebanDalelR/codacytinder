package com.tinder.toppicks;

import android.support.annotation.StringRes;
import com.tinder.R;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.paywall.legacy.TopPicksPaywallSource;
import com.tinder.paywall.viewmodels.C10084g;
import com.tinder.paywall.viewmodels.PaywallItemViewModelColor;
import com.tinder.paywall.views.PaywallItemGroupView.PaywallItemSelectListener;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.toppicks.TopPicksPaywallViewModel.BylineType;
import com.tinder.toppicks.TopPicksPaywallViewModel.ViewType;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0011H\u0003J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nH\u0003J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nH\u0003J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/tinder/toppicks/TopPicksPaywallViewModelFactory;", "", "paywallItemGroupViewModelFactory", "Lcom/tinder/paywall/viewmodels/PaywallGroupViewModelFactory;", "offerRepository", "Lcom/tinder/purchase/domain/repository/OfferRepository;", "(Lcom/tinder/paywall/viewmodels/PaywallGroupViewModelFactory;Lcom/tinder/purchase/domain/repository/OfferRepository;)V", "create", "Lcom/tinder/toppicks/TopPicksPaywallViewModel;", "source", "Lcom/tinder/paywall/legacy/TopPicksPaywallSource;", "listener", "Lcom/tinder/paywall/views/PaywallItemGroupView$PaywallItemSelectListener;", "countDownTime", "", "createButtonText", "", "Lcom/tinder/toppicks/TopPicksPaywallViewModel$ViewType;", "createByline", "createBylineType", "Lcom/tinder/toppicks/TopPicksPaywallViewModel$BylineType;", "createTitle", "createViewType", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.f */
public final class C15268f {
    /* renamed from: a */
    private final C10084g f47389a;
    /* renamed from: b */
    private final OfferRepository f47390b;

    @Inject
    public C15268f(@NotNull C10084g c10084g, @NotNull OfferRepository offerRepository) {
        C2668g.b(c10084g, "paywallItemGroupViewModelFactory");
        C2668g.b(offerRepository, "offerRepository");
        this.f47389a = c10084g;
        this.f47390b = offerRepository;
    }

    @NotNull
    /* renamed from: a */
    public final TopPicksPaywallViewModel m57372a(@NotNull TopPicksPaywallSource topPicksPaywallSource, @NotNull PaywallItemSelectListener paywallItemSelectListener, long j) {
        C2668g.b(topPicksPaywallSource, "source");
        C2668g.b(paywallItemSelectListener, "listener");
        ViewType c = m57370c(topPicksPaywallSource);
        ProductType productType = ProductType.TOP_PICKS;
        BylineType a = m57368a(topPicksPaywallSource);
        if (c == ViewType.PAYWALL_ITEMS) {
            C10084g c10084g = this.f47389a;
            List offers = this.f47390b.getOffers(productType);
            C2668g.a(offers, "offerRepository.getOffers(productType)");
            paywallItemSelectListener = c10084g.a(productType, offers, PaywallItemViewModelColor.GOLD, paywallItemSelectListener);
        } else {
            paywallItemSelectListener = null;
        }
        return new TopPicksPaywallViewModel(m57369b(topPicksPaywallSource), m57371d(topPicksPaywallSource), a, m57367a(c), c, paywallItemSelectListener, j);
    }

    /* renamed from: a */
    private final BylineType m57368a(TopPicksPaywallSource topPicksPaywallSource) {
        switch (C15269g.f47391a[topPicksPaywallSource.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return BylineType.TIMER;
            case 7:
                return BylineType.PLAIN_TEXT;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @StringRes
    /* renamed from: b */
    private final int m57369b(TopPicksPaywallSource topPicksPaywallSource) {
        switch (C15269g.f47392b[topPicksPaywallSource.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return R.string.top_picks_alc_paywall_get_more_tps_title;
            case 6:
                return R.string.top_picks_alc_paywall_out_of_tps_title;
            case 7:
                return R.string.top_picks_alc_paywall_tps_not_available_title;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: c */
    private final ViewType m57370c(TopPicksPaywallSource topPicksPaywallSource) {
        switch (C15269g.f47393c[topPicksPaywallSource.ordinal()]) {
            case 1:
                return ViewType.PICKS_NOT_AVAILABLE;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return ViewType.PAYWALL_ITEMS;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @StringRes
    /* renamed from: d */
    private final int m57371d(TopPicksPaywallSource topPicksPaywallSource) {
        switch (C15269g.f47394d[topPicksPaywallSource.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return R.string.top_picks_alc_paywall_get_more_tps_byline;
            case 6:
                return R.string.top_picks_alc_paywall_out_of_tps_byline;
            case 7:
                return R.string.top_picks_alc_paywall_tps_not_available_byline;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @StringRes
    /* renamed from: a */
    private final int m57367a(ViewType viewType) {
        switch (C15269g.f47395e[viewType.ordinal()]) {
            case 1:
                return R.string.paywall_continue;
            case 2:
                return R.string.discovery_settings;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
