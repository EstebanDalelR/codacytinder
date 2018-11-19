package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.C0436c;

public class CustomTabActivity extends Activity {
    /* renamed from: a */
    public static final String f3072a;
    /* renamed from: b */
    public static final String f3073b;
    /* renamed from: c */
    private BroadcastReceiver f3074c;

    /* renamed from: com.facebook.CustomTabActivity$1 */
    class C11661 extends BroadcastReceiver {
        /* renamed from: a */
        final /* synthetic */ CustomTabActivity f3071a;

        C11661(CustomTabActivity customTabActivity) {
            this.f3071a = customTabActivity;
        }

        public void onReceive(Context context, Intent intent) {
            this.f3071a.finish();
        }
    }

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(CustomTabActivity.class.getSimpleName());
        stringBuilder.append(".action_customTabRedirect");
        f3072a = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(CustomTabActivity.class.getSimpleName());
        stringBuilder.append(".action_destroy");
        f3073b = stringBuilder.toString();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bundle = new Intent(this, CustomTabMainActivity.class);
        bundle.setAction(f3072a);
        bundle.putExtra(CustomTabMainActivity.f3078c, getIntent().getDataString());
        bundle.addFlags(603979776);
        startActivityForResult(bundle, 2);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            Intent intent2 = new Intent(f3072a);
            intent2.putExtra(CustomTabMainActivity.f3078c, getIntent().getDataString());
            C0436c.m1648a((Context) this).m1653a(intent2);
            this.f3074c = new C11661(this);
            C0436c.m1648a((Context) this).m1652a(this.f3074c, new IntentFilter(f3073b));
        }
    }

    protected void onDestroy() {
        C0436c.m1648a((Context) this).m1651a(this.f3074c);
        super.onDestroy();
    }
}
