package com.leanplum.activities;

import android.app.TabActivity;
import android.content.res.Resources;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;

@Deprecated
public class LeanplumTabActivity extends TabActivity {
    /* renamed from: a */
    private LeanplumActivityHelper f21324a;

    /* renamed from: a */
    private LeanplumActivityHelper m25186a() {
        if (this.f21324a == null) {
            this.f21324a = new LeanplumActivityHelper(this);
        }
        return this.f21324a;
    }

    protected void onPause() {
        super.onPause();
        m25186a().onPause();
    }

    protected void onStop() {
        super.onStop();
        m25186a().onStop();
    }

    protected void onResume() {
        super.onResume();
        m25186a().onResume();
    }

    public Resources getResources() {
        if (!Leanplum.isTestModeEnabled()) {
            if (Leanplum.isResourceSyncingEnabled()) {
                return m25186a().getLeanplumResources(super.getResources());
            }
        }
        return super.getResources();
    }

    public void setContentView(int i) {
        if (!Leanplum.isTestModeEnabled()) {
            if (Leanplum.isResourceSyncingEnabled()) {
                m25186a().setContentView(i);
                return;
            }
        }
        super.setContentView(i);
    }
}
