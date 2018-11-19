package com.tinder.toppicks.view;

import com.tinder.paywall.legacy.TopPicksPaywallSource;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0003H&¨\u0006\r"}, d2 = {"Lcom/tinder/toppicks/view/TopPicksGoldTarget;", "", "dismissBottomBar", "", "showBottomBar", "showPage", "page", "Lcom/tinder/toppicks/view/TopPicksGoldView$Page;", "showPaginatedError", "showPaywall", "source", "Lcom/tinder/paywall/legacy/TopPicksPaywallSource;", "showTutorial", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface TopPicksGoldTarget {
    void dismissBottomBar();

    void showBottomBar();

    void showPage(@NotNull TopPicksGoldView$Page topPicksGoldView$Page);

    void showPaginatedError();

    void showPaywall(@NotNull TopPicksPaywallSource topPicksPaywallSource);

    void showTutorial();
}
