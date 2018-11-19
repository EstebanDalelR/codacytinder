package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.C0436c;
import com.facebook.internal.C1702c;
import com.tinder.api.ManagerWebServices;

public class CustomTabMainActivity extends Activity {
    /* renamed from: a */
    public static final String f3076a;
    /* renamed from: b */
    public static final String f3077b;
    /* renamed from: c */
    public static final String f3078c;
    /* renamed from: d */
    public static final String f3079d;
    /* renamed from: e */
    private boolean f3080e = true;
    /* renamed from: f */
    private BroadcastReceiver f3081f;

    /* renamed from: com.facebook.CustomTabMainActivity$1 */
    class C11671 extends BroadcastReceiver {
        /* renamed from: a */
        final /* synthetic */ CustomTabMainActivity f3075a;

        C11671(CustomTabMainActivity customTabMainActivity) {
            this.f3075a = customTabMainActivity;
        }

        public void onReceive(Context context, Intent intent) {
            context = new Intent(this.f3075a, CustomTabMainActivity.class);
            context.setAction(CustomTabMainActivity.f3079d);
            context.putExtra(CustomTabMainActivity.f3078c, intent.getStringExtra(CustomTabMainActivity.f3078c));
            context.addFlags(603979776);
            this.f3075a.startActivity(context);
        }
    }

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(CustomTabMainActivity.class.getSimpleName());
        stringBuilder.append(".extra_params");
        f3076a = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(CustomTabMainActivity.class.getSimpleName());
        stringBuilder.append(".extra_chromePackage");
        f3077b = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(CustomTabMainActivity.class.getSimpleName());
        stringBuilder.append(".extra_url");
        f3078c = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(CustomTabMainActivity.class.getSimpleName());
        stringBuilder.append(".action_refresh");
        f3079d = stringBuilder.toString();
    }

    /* renamed from: a */
    public static final String m3969a() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ManagerWebServices.PARAM_PHOTOS_SOURCE);
        stringBuilder.append(FacebookSdk.m3998i());
        stringBuilder.append("://authorize");
        return stringBuilder.toString();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (CustomTabActivity.f3072a.equals(getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (bundle == null) {
            bundle = getIntent().getBundleExtra(f3076a);
            new C1702c("oauth", bundle).m5877a(this, getIntent().getStringExtra(f3077b));
            this.f3080e = false;
            this.f3081f = new C11671(this);
            C0436c.m1648a((Context) this).m1652a(this.f3081f, new IntentFilter(CustomTabActivity.f3072a));
        }
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (f3079d.equals(intent.getAction())) {
            C0436c.m1648a((Context) this).m1653a(new Intent(CustomTabActivity.f3073b));
            m3970a(-1, intent);
        } else if (CustomTabActivity.f3072a.equals(intent.getAction())) {
            m3970a(-1, intent);
        }
    }

    protected void onResume() {
        super.onResume();
        if (this.f3080e) {
            m3970a(0, null);
        }
        this.f3080e = true;
    }

    /* renamed from: a */
    private void m3970a(int i, Intent intent) {
        C0436c.m1648a((Context) this).m1651a(this.f3081f);
        if (intent != null) {
            setResult(i, intent);
        } else {
            setResult(i);
        }
        finish();
    }
}
