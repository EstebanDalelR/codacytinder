package com.tinder.paywall.paywallflow;

import android.support.annotation.NonNull;

public interface LegacyPaywall {

    public interface DismissListener {
        void handleDismiss();
    }

    public interface PurchaseListener {
        void handlePurchase(@NonNull String str);
    }

    void dismiss();

    boolean isShowing();

    void setDismissListener(@NonNull DismissListener dismissListener);

    void setPurchaseListener(@NonNull PurchaseListener purchaseListener);

    void show();
}
