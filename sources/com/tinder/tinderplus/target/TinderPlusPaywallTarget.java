package com.tinder.tinderplus.target;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.paywall.viewmodels.C10093o;
import com.tinder.paywall.viewmodels.PaywallItemViewModelColor;
import com.tinder.paywall.viewmodels.PaywallPerk;
import com.tinder.paywall.views.PaywallBaseView.ColorScheme;
import com.tinder.purchase.domain.model.C14510e;
import java.util.List;

public interface TinderPlusPaywallTarget {
    void dismiss();

    void setupViews(@NonNull List<C10093o> list, @NonNull List<C14510e> list2, boolean z, @Nullable PaywallPerk paywallPerk, @NonNull ColorScheme colorScheme, @NonNull PaywallItemViewModelColor paywallItemViewModelColor);

    void showDiscountOffers(long j);

    void showErrorMessageAndDismiss();

    void showProgressLoading();

    void showRegularOffers();
}
