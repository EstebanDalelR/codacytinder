package com.facebook.appevents.internal;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.C1709i;
import com.facebook.internal.C1712j;
import com.facebook.internal.C1749x;
import com.facebook.internal.Utility;
import com.tinder.api.ManagerWebServices;
import java.math.BigDecimal;
import java.util.Currency;
import org.json.JSONObject;

/* renamed from: com.facebook.appevents.internal.c */
public class C1652c {
    /* renamed from: a */
    private static final String f4562a = C1652c.class.getCanonicalName();
    @Nullable
    /* renamed from: b */
    private static Object f4563b;

    /* renamed from: a */
    public static void m5601a() {
        Object e = FacebookSdk.m3994e();
        String i = FacebookSdk.m3998i();
        boolean l = FacebookSdk.m4001l();
        C1749x.m6064a(e, "context");
        if (!l) {
            return;
        }
        if (e instanceof Application) {
            AppEventsLogger.m5522a((Application) e, i);
        } else {
            Log.w(f4562a, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
        }
    }

    /* renamed from: a */
    public static void m5602a(String str, long j) {
        Object e = FacebookSdk.m3994e();
        String i = FacebookSdk.m3998i();
        C1749x.m6064a(e, "context");
        C1709i a = C1712j.m5909a(i, false);
        if (a != null && a.m5901f() && j > 0) {
            AppEventsLogger newLogger = AppEventsLogger.newLogger(e);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_aa_time_spent_view_name", str);
            newLogger.m5535a("fb_aa_time_spent_on_view", (double) j, bundle);
        }
    }

    /* renamed from: a */
    public static boolean m5603a(final Context context, int i, Intent intent) {
        if (intent != null) {
            if (C1652c.m5604b()) {
                intent = intent.getStringExtra("INAPP_PURCHASE_DATA");
                if (i == -1) {
                    i = new ServiceConnection() {
                        public void onServiceDisconnected(ComponentName componentName) {
                            C1652c.f4563b = null;
                            Utility.m5793b(C1652c.f4562a, "In-app billing service disconnected");
                        }

                        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                            C1652c.f4563b = C1654e.m5608a(context, iBinder);
                            try {
                                componentName = new JSONObject(intent);
                                iBinder = componentName.getString("productId");
                                String a = C1654e.m5609a(context, iBinder, C1652c.f4563b, componentName.has("autoRenewing"));
                                if (a.equals("")) {
                                    context.unbindService(this);
                                    return;
                                }
                                JSONObject jSONObject = new JSONObject(a);
                                AppEventsLogger newLogger = AppEventsLogger.newLogger(context);
                                Bundle bundle = new Bundle(1);
                                bundle.putCharSequence("fb_iap_product_id", iBinder);
                                bundle.putCharSequence("fb_iap_purchase_time", componentName.getString("purchaseTime"));
                                bundle.putCharSequence("fb_iap_purchase_state", componentName.getString("purchaseState"));
                                bundle.putCharSequence("fb_iap_purchase_token", componentName.getString("purchaseToken"));
                                bundle.putCharSequence("fb_iap_package_name", componentName.getString("packageName"));
                                bundle.putCharSequence("fb_iap_product_type", jSONObject.getString("type"));
                                bundle.putCharSequence("fb_iap_product_title", jSONObject.getString(ManagerWebServices.PARAM_JOB_TITLE));
                                bundle.putCharSequence("fb_iap_product_description", jSONObject.getString(ManagerWebServices.PARAM_BADGE_DESC));
                                bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(componentName.optBoolean("autoRenewing", false)));
                                bundle.putCharSequence("fb_iap_subs_period", jSONObject.optString("subscriptionPeriod"));
                                bundle.putCharSequence("fb_free_trial_period", jSONObject.optString("freeTrialPeriod"));
                                bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject.optString("introductoryPriceAmountMicros"));
                                bundle.putCharSequence("fb_intro_price_cycles", jSONObject.optString("introductoryPriceCycles"));
                                newLogger.m5537a(new BigDecimal(((double) jSONObject.getLong("price_amount_micros")) / 1000000.0d), Currency.getInstance(jSONObject.getString("price_currency_code")), bundle);
                                context.unbindService(this);
                            } catch (ComponentName componentName2) {
                                Log.e(C1652c.f4562a, "Error parsing in-app purchase data.", componentName2);
                            } catch (Throwable th) {
                                context.unbindService(this);
                            }
                        }
                    };
                    intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    context.bindService(intent, i, 1);
                }
                return true;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m5604b() {
        C1709i a = C1712j.m5907a(FacebookSdk.m3998i());
        boolean z = false;
        if (a == null) {
            return false;
        }
        if (FacebookSdk.m4001l() && a.m5905j()) {
            z = true;
        }
        return z;
    }
}
