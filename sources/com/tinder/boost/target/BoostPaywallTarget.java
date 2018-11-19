package com.tinder.boost.target;

import android.support.annotation.NonNull;
import com.tinder.purchase.domain.model.C14510e;
import java.util.List;

public interface BoostPaywallTarget {
    void dismiss();

    void displayFirstTimeSubscriberPaywall(@NonNull String str, @NonNull String str2, int i);

    void displayNonSubscriberPaywall(@NonNull List<C14510e> list, int i, boolean z, boolean z2);

    void displaySubscriberPaywall(@NonNull List<C14510e> list, long j, boolean z, int i);

    void hideTinderPlusUpsellSection();

    void purchaseBoost();

    void showTinderPlusUpsellSection(@NonNull String str);
}
