package io.fabric.sdk.android.services.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import io.fabric.sdk.android.C15608c;
import io.fabric.sdk.android.services.persistence.C17347b;
import io.fabric.sdk.android.services.persistence.PreferenceStore;

/* renamed from: io.fabric.sdk.android.services.common.c */
class C15618c {
    /* renamed from: a */
    private final Context f48365a;
    /* renamed from: b */
    private final PreferenceStore f48366b;

    public C15618c(Context context) {
        this.f48365a = context.getApplicationContext();
        this.f48366b = new C17347b(context, "TwitterAdvertisingInfoPreferences");
    }

    /* renamed from: a */
    public C15617b m58681a() {
        C15617b b = m58682b();
        if (m58679c(b)) {
            C15608c.m58560h().mo12791d("Fabric", "Using AdvertisingInfo from Preference Store");
            m58676a(b);
            return b;
        }
        b = m58680e();
        m58678b(b);
        return b;
    }

    /* renamed from: a */
    private void m58676a(final C15617b c15617b) {
        new Thread(new C15623g(this) {
            /* renamed from: b */
            final /* synthetic */ C15618c f53044b;

            public void onRun() {
                C15617b a = this.f53044b.m58680e();
                if (!c15617b.equals(a)) {
                    C15608c.m58560h().mo12791d("Fabric", "Asychronously getting Advertising Info and storing it to preferences");
                    this.f53044b.m58678b(a);
                }
            }
        }).start();
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: b */
    private void m58678b(C15617b c15617b) {
        if (m58679c(c15617b)) {
            this.f48366b.save(this.f48366b.edit().putString("advertising_id", c15617b.f48363a).putBoolean("limit_ad_tracking_enabled", c15617b.f48364b));
        } else {
            this.f48366b.save(this.f48366b.edit().remove("advertising_id").remove("limit_ad_tracking_enabled"));
        }
    }

    /* renamed from: b */
    protected C15617b m58682b() {
        return new C15617b(this.f48366b.get().getString("advertising_id", ""), this.f48366b.get().getBoolean("limit_ad_tracking_enabled", false));
    }

    /* renamed from: c */
    public AdvertisingInfoStrategy m58683c() {
        return new C17328d(this.f48365a);
    }

    /* renamed from: d */
    public AdvertisingInfoStrategy m58684d() {
        return new C17329e(this.f48365a);
    }

    /* renamed from: c */
    private boolean m58679c(C15617b c15617b) {
        return (c15617b == null || TextUtils.isEmpty(c15617b.f48363a) != null) ? null : true;
    }

    /* renamed from: e */
    private C15617b m58680e() {
        C15617b advertisingInfo = m58683c().getAdvertisingInfo();
        if (m58679c(advertisingInfo)) {
            C15608c.m58560h().mo12791d("Fabric", "Using AdvertisingInfo from Reflection Provider");
        } else {
            advertisingInfo = m58684d().getAdvertisingInfo();
            if (m58679c(advertisingInfo)) {
                C15608c.m58560h().mo12791d("Fabric", "Using AdvertisingInfo from Service Provider");
            } else {
                C15608c.m58560h().mo12791d("Fabric", "AdvertisingInfo not present");
            }
        }
        return advertisingInfo;
    }
}
