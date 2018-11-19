package com.tinder.paywall.paywallflow;

import android.app.Dialog;
import android.support.annotation.NonNull;
import com.tinder.model.DefaultObserver;
import com.tinder.paywall.paywallflow.C10072h.C10071a;
import com.tinder.paywall.paywallflow.LegacyPaywall.DismissListener;
import com.tinder.paywall.paywallflow.LegacyPaywall.PurchaseListener;
import javax.inject.Singleton;
import rx.Observable;
import rx.p500e.C19573b;

@Singleton
/* renamed from: com.tinder.paywall.paywallflow.d */
public class C10067d {
    @NonNull
    /* renamed from: a */
    public LegacyPaywall m41133a(@NonNull C10071a c10071a) {
        final Dialog a = c10071a.mo10707a();
        c10071a = c10071a.mo10708b();
        return new LegacyPaywall(this) {
            /* renamed from: a */
            final C19573b f39713a = new C19573b();
            /* renamed from: d */
            final /* synthetic */ C10067d f39716d;

            public boolean isShowing() {
                return a.isShowing();
            }

            public void show() {
                a.show();
            }

            public void dismiss() {
                this.f39713a.a();
                if (a.isShowing()) {
                    a.dismiss();
                }
            }

            public void setPurchaseListener(@NonNull PurchaseListener purchaseListener) {
                Observable observable = c10071a;
                purchaseListener.getClass();
                purchaseListener = observable.a(DefaultObserver.create(C14126e.m53841a(purchaseListener)));
                this.f39713a.a();
                this.f39713a.a(purchaseListener);
            }

            public void setDismissListener(@NonNull DismissListener dismissListener) {
                a.setOnDismissListener(new C10068f(dismissListener));
            }
        };
    }
}
