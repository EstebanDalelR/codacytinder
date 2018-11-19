package com.tinder.activities;

import android.support.annotation.NonNull;
import com.tinder.main.trigger.Trigger;
import com.tinder.verification.VerificationView.Listener;

class MainActivity$4 implements Listener {
    /* renamed from: a */
    final /* synthetic */ Trigger f26200a;
    /* renamed from: b */
    final /* synthetic */ MainActivity f26201b;

    MainActivity$4(MainActivity mainActivity, Trigger trigger) {
        this.f26201b = mainActivity;
        this.f26200a = trigger;
    }

    public void onConfirmClicked() {
        this.f26201b.f14939i.w();
        this.f26200a.g();
    }

    public void onCancelClicked() {
        this.f26201b.f14939i.u();
        this.f26200a.g();
    }

    public void onFaqClicked(@NonNull String str) {
        this.f26201b.f14939i.a(str);
    }
}
