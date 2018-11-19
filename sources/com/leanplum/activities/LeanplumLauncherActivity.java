package com.leanplum.activities;

import android.app.LauncherActivity;
import android.content.res.Resources;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;

@Deprecated
public class LeanplumLauncherActivity extends LauncherActivity {
    /* renamed from: a */
    private LeanplumActivityHelper f21320a;

    /* renamed from: a */
    private LeanplumActivityHelper m25182a() {
        if (this.f21320a == null) {
            this.f21320a = new LeanplumActivityHelper(this);
        }
        return this.f21320a;
    }

    protected void onPause() {
        super.onPause();
        m25182a().onPause();
    }

    protected void onStop() {
        super.onStop();
        m25182a().onStop();
    }

    protected void onResume() {
        super.onResume();
        m25182a().onResume();
    }

    public Resources getResources() {
        if (!Leanplum.isTestModeEnabled()) {
            if (Leanplum.isResourceSyncingEnabled()) {
                return m25182a().getLeanplumResources(super.getResources());
            }
        }
        return super.getResources();
    }

    public void setContentView(int i) {
        if (!Leanplum.isTestModeEnabled()) {
            if (Leanplum.isResourceSyncingEnabled()) {
                m25182a().setContentView(i);
                return;
            }
        }
        super.setContentView(i);
    }
}
