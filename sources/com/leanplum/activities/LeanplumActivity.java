package com.leanplum.activities;

import android.app.Activity;
import android.content.res.Resources;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;

@Deprecated
public abstract class LeanplumActivity extends Activity {
    /* renamed from: a */
    private LeanplumActivityHelper f21316a;

    /* renamed from: a */
    private LeanplumActivityHelper m25178a() {
        if (this.f21316a == null) {
            this.f21316a = new LeanplumActivityHelper(this);
        }
        return this.f21316a;
    }

    protected void onPause() {
        super.onPause();
        m25178a().onPause();
    }

    protected void onStop() {
        super.onStop();
        m25178a().onStop();
    }

    protected void onResume() {
        super.onResume();
        m25178a().onResume();
    }

    public Resources getResources() {
        if (!Leanplum.isTestModeEnabled()) {
            if (Leanplum.isResourceSyncingEnabled()) {
                return m25178a().getLeanplumResources(super.getResources());
            }
        }
        return super.getResources();
    }

    public void setContentView(int i) {
        if (!Leanplum.isTestModeEnabled()) {
            if (Leanplum.isResourceSyncingEnabled()) {
                m25178a().setContentView(i);
                return;
            }
        }
        super.setContentView(i);
    }
}
