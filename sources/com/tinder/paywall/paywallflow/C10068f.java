package com.tinder.paywall.paywallflow;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tinder.paywall.paywallflow.LegacyPaywall.DismissListener;

/* renamed from: com.tinder.paywall.paywallflow.f */
final /* synthetic */ class C10068f implements OnDismissListener {
    /* renamed from: a */
    private final DismissListener f32958a;

    C10068f(DismissListener dismissListener) {
        this.f32958a = dismissListener;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f32958a.handleDismiss();
    }
}
