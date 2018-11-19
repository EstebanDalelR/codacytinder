package com.facebook;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import com.facebook.common.C1672a.C1668c;
import com.facebook.common.C1672a.C1669d;
import com.facebook.internal.C1745t;
import com.facebook.internal.C4354e;
import com.facebook.login.C4207b;
import com.facebook.share.internal.DeviceShareDialogFragment;
import com.facebook.share.model.ShareContent;

public class FacebookActivity extends FragmentActivity {
    /* renamed from: a */
    public static String f14824a = "PassThrough";
    /* renamed from: b */
    private static String f14825b = "SingleFragment";
    /* renamed from: c */
    private static final String f14826c = "com.facebook.FacebookActivity";
    /* renamed from: d */
    private Fragment f14827d;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bundle = getIntent();
        if (!FacebookSdk.isInitialized()) {
            Log.d(f14826c, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            FacebookSdk.m3980a(getApplicationContext());
        }
        setContentView(C1669d.com_facebook_activity_layout);
        if (f14824a.equals(bundle.getAction()) != null) {
            m18640c();
        } else {
            this.f14827d = m18641a();
        }
    }

    /* renamed from: a */
    protected Fragment m18641a() {
        Intent intent = getIntent();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment a = supportFragmentManager.mo428a(f14825b);
        if (a != null) {
            return a;
        }
        if ("FacebookDialogFragment".equals(intent.getAction())) {
            a = new C4354e();
            a.setRetainInstance(true);
            a.show(supportFragmentManager, f14825b);
            return a;
        } else if ("DeviceShareDialogFragment".equals(intent.getAction())) {
            a = new DeviceShareDialogFragment();
            a.setRetainInstance(true);
            a.m17795a((ShareContent) intent.getParcelableExtra("content"));
            a.show(supportFragmentManager, f14825b);
            return a;
        } else {
            a = new C4207b();
            a.setRetainInstance(true);
            supportFragmentManager.mo429a().mo403a(C1668c.com_facebook_fragment_container, a, f14825b).mo410c();
            return a;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f14827d != null) {
            this.f14827d.onConfigurationChanged(configuration);
        }
    }

    /* renamed from: b */
    public Fragment m18642b() {
        return this.f14827d;
    }

    /* renamed from: c */
    private void m18640c() {
        setResult(0, C1745t.m6025a(getIntent(), null, C1745t.m6028a(C1745t.m6043d(getIntent()))));
        finish();
    }
}
