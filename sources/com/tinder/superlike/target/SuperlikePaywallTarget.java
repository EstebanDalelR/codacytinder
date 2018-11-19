package com.tinder.superlike.target;

import android.support.annotation.NonNull;
import com.tinder.paywall.viewmodels.PaywallItemViewModelColor;
import com.tinder.paywall.views.PaywallBaseView.ColorScheme;
import com.tinder.purchase.domain.model.C14510e;
import java.util.List;

public interface SuperlikePaywallTarget {
    void dismiss();

    void displayPaywall(@NonNull List<C14510e> list, @NonNull ColorScheme colorScheme, @NonNull PaywallItemViewModelColor paywallItemViewModelColor);

    void displayUserImage(int i, @NonNull String str);

    void hideCountdownTimer();

    void hideStarAnimation();

    void hideTinderPlusUpsellSection();

    void showDefaultHeader();

    void showOutOfSuperlikesHeader(@NonNull String str);

    void showStarIcon(int i);

    void showTinderPlusUpsellSection(@NonNull String str);

    void startCountdownTimer(long j);

    void startStarAnimation(int i, int i2);
}
