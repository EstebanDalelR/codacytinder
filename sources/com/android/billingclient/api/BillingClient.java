package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import com.android.billingclient.api.C0889d.C0888a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class BillingClient {

    @Retention(RetentionPolicy.SOURCE)
    public @interface BillingResponse {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FeatureType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SkuType {
    }

    /* renamed from: com.android.billingclient.api.BillingClient$a */
    public static final class C0867a {
        /* renamed from: a */
        private final Context f2257a;
        /* renamed from: b */
        private PurchasesUpdatedListener f2258b;

        private C0867a(Context context) {
            this.f2257a = context;
        }

        @UiThread
        /* renamed from: a */
        public C0867a m2964a(PurchasesUpdatedListener purchasesUpdatedListener) {
            this.f2258b = purchasesUpdatedListener;
            return this;
        }

        @UiThread
        /* renamed from: a */
        public BillingClient m2965a() {
            if (this.f2257a == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            } else if (this.f2258b != null) {
                return new BillingClientImpl(this.f2257a, this.f2258b);
            } else {
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
        }
    }

    @UiThread
    /* renamed from: a */
    public abstract int mo1172a(Activity activity, C0883b c0883b);

    @UiThread
    /* renamed from: a */
    public abstract C0888a mo1173a(String str);

    @UiThread
    /* renamed from: a */
    public abstract void mo1174a(@NonNull BillingClientStateListener billingClientStateListener);

    @UiThread
    /* renamed from: a */
    public abstract void mo1175a(C0894f c0894f, SkuDetailsResponseListener skuDetailsResponseListener);

    @UiThread
    /* renamed from: a */
    public abstract void mo1176a(String str, ConsumeResponseListener consumeResponseListener);

    @UiThread
    /* renamed from: a */
    public abstract void mo1177a(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener);

    @UiThread
    /* renamed from: a */
    public abstract boolean mo1178a();

    @UiThread
    /* renamed from: b */
    public abstract void mo1179b();

    @UiThread
    /* renamed from: a */
    public static C0867a m2966a(@NonNull Context context) {
        return new C0867a(context);
    }
}
