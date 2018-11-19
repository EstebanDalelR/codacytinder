package com.tinder.toppicks.teasers;

import com.tinder.cardstack.model.C8395a;
import com.tinder.paywall.legacy.GoldPaywallSource;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001a\u0010\u0004\u001a\u00020\u00032\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J \u0010\u000b\u001a\u00020\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0003H&¨\u0006\u0011"}, d2 = {"Lcom/tinder/toppicks/teasers/TopPickTeasersGridTarget;", "", "clearTeasers", "", "insertCards", "cards", "", "Lcom/tinder/cardstack/model/Card;", "showPage", "page", "Lcom/tinder/toppicks/teasers/TopPicksTeasersView$Page;", "showPaywall", "imageUrls", "", "source", "Lcom/tinder/paywall/legacy/GoldPaywallSource;", "syncTeasers", "toppicks_release"}, k = 1, mv = {1, 1, 10})
public interface TopPickTeasersGridTarget {
    void clearTeasers();

    void insertCards(@NotNull List<? extends C8395a<?>> list);

    void showPage(@NotNull TopPicksTeasersView$Page topPicksTeasersView$Page);

    void showPaywall(@NotNull List<String> list, @NotNull GoldPaywallSource goldPaywallSource);

    void syncTeasers();
}
