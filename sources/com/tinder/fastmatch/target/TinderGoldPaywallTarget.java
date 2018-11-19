package com.tinder.fastmatch.target;

import com.tinder.fastmatch.view.UpgradeGoldPaywallItem.C9415a;
import com.tinder.paywall.viewmodels.C10093o;
import com.tinder.paywall.viewmodels.PaywallItemViewModelColor;
import com.tinder.purchase.domain.model.C14510e;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u001e\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u001e\u0010\u000f\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\u0012\u001a\u00020\u0013H&¨\u0006\u0014"}, d2 = {"Lcom/tinder/fastmatch/target/TinderGoldPaywallTarget;", "", "dismiss", "", "prepGoldUpgradeState", "showErrorAndDismiss", "showGoldPaywallForNonSubscribers", "offers", "", "Lcom/tinder/purchase/domain/model/Offer;", "color", "Lcom/tinder/paywall/viewmodels/PaywallItemViewModelColor;", "showGoldUpgrade", "viewModel", "Lcom/tinder/fastmatch/view/UpgradeGoldPaywallItem$ViewModel;", "showPerksCarousel", "perkViewModels", "Lcom/tinder/paywall/viewmodels/PaywallPerkViewModel;", "showFastMatchPreview", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface TinderGoldPaywallTarget {
    void dismiss();

    void prepGoldUpgradeState();

    void showErrorAndDismiss();

    void showGoldPaywallForNonSubscribers(@NotNull List<? extends C14510e> list, @NotNull PaywallItemViewModelColor paywallItemViewModelColor);

    void showGoldUpgrade(@NotNull C9415a c9415a);

    void showPerksCarousel(@NotNull List<? extends C10093o> list, boolean z);
}
