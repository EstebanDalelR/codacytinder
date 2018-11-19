package com.tinder.toppicks;

import android.support.annotation.StringRes;
import com.tinder.purchase.domain.model.C14510e;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0012\u0010\n\u001a\u00020\u00032\b\b\u0001\u0010\u000b\u001a\u00020\fH&J\u0012\u0010\r\u001a\u00020\u00032\b\b\u0001\u0010\u000b\u001a\u00020\fH&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0010"}, d2 = {"Lcom/tinder/toppicks/TopPicksPaywallViewTarget;", "", "bind", "", "viewModel", "Lcom/tinder/toppicks/TopPicksPaywallViewModel;", "dismissPaywall", "onPaywallItemInFocusTap", "offer", "Lcom/tinder/purchase/domain/model/Offer;", "onPurchaseFailure", "messageRes", "", "onPurchaseFailureNonFatal", "onPurchaseSuccess", "showEmptyState", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface TopPicksPaywallViewTarget {
    void bind(@NotNull TopPicksPaywallViewModel topPicksPaywallViewModel);

    void dismissPaywall();

    void onPaywallItemInFocusTap(@Nullable C14510e c14510e);

    void onPurchaseFailure(@StringRes int i);

    void onPurchaseFailureNonFatal(@StringRes int i);

    void onPurchaseSuccess();

    void showEmptyState(@NotNull TopPicksPaywallViewModel topPicksPaywallViewModel);
}
