package com.leanplum.activities;

import android.accounts.AccountAuthenticatorActivity;
import android.content.res.Resources;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;

@Deprecated
public class LeanplumAccountAuthenticatorActivity extends AccountAuthenticatorActivity {
    /* renamed from: a */
    private LeanplumActivityHelper f21315a;

    /* renamed from: a */
    private LeanplumActivityHelper m25177a() {
        if (this.f21315a == null) {
            this.f21315a = new LeanplumActivityHelper(this);
        }
        return this.f21315a;
    }

    protected void onPause() {
        super.onPause();
        m25177a().onPause();
    }

    protected void onStop() {
        super.onStop();
        m25177a().onStop();
    }

    protected void onResume() {
        super.onResume();
        m25177a().onResume();
    }

    public Resources getResources() {
        if (!Leanplum.isTestModeEnabled()) {
            if (Leanplum.isResourceSyncingEnabled()) {
                return m25177a().getLeanplumResources(super.getResources());
            }
        }
        return super.getResources();
    }

    public void setContentView(int i) {
        if (!Leanplum.isTestModeEnabled()) {
            if (Leanplum.isResourceSyncingEnabled()) {
                m25177a().setContentView(i);
                return;
            }
        }
        super.setContentView(i);
    }
}
