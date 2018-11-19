package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.annotation.NonNull;
import com.android.billingclient.p020a.C0865a;

/* renamed from: com.android.billingclient.api.a */
class C0880a {
    /* renamed from: a */
    private final Context f2290a;
    /* renamed from: b */
    private final C0879a f2291b;

    /* renamed from: com.android.billingclient.api.a$a */
    private class C0879a extends BroadcastReceiver {
        /* renamed from: a */
        final /* synthetic */ C0880a f2288a;
        /* renamed from: b */
        private final PurchasesUpdatedListener f2289b;

        private C0879a(C0880a c0880a, @NonNull PurchasesUpdatedListener purchasesUpdatedListener) {
            this.f2288a = c0880a;
            this.f2289b = purchasesUpdatedListener;
        }

        public void onReceive(Context context, Intent intent) {
            this.f2289b.onPurchasesUpdated(C0865a.m2958a(intent, "BillingBroadcastManager"), C0865a.m2960a(intent.getExtras()));
        }
    }

    C0880a(Context context, @NonNull PurchasesUpdatedListener purchasesUpdatedListener) {
        this.f2290a = context;
        this.f2291b = new C0879a(purchasesUpdatedListener);
    }

    /* renamed from: a */
    void m2977a() {
        this.f2290a.registerReceiver(this.f2291b, new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED"));
    }

    /* renamed from: b */
    PurchasesUpdatedListener m2978b() {
        return this.f2291b.f2289b;
    }

    /* renamed from: c */
    void m2979c() {
        try {
            this.f2290a.unregisterReceiver(this.f2291b);
        } catch (IllegalArgumentException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Receiver was already unregistered: ");
            stringBuilder.append(e);
            C0865a.m2962b("BillingBroadcastManager", stringBuilder.toString());
        }
    }
}
