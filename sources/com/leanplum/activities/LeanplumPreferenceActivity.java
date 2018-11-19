package com.leanplum.activities;

import android.content.res.Resources;
import android.preference.PreferenceActivity;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;

@Deprecated
public class LeanplumPreferenceActivity extends PreferenceActivity {
    /* renamed from: a */
    private LeanplumActivityHelper f21323a;

    /* renamed from: a */
    private LeanplumActivityHelper m25185a() {
        if (this.f21323a == null) {
            this.f21323a = new LeanplumActivityHelper(this);
        }
        return this.f21323a;
    }

    protected void onPause() {
        super.onPause();
        m25185a().onPause();
    }

    protected void onStop() {
        super.onStop();
        m25185a().onStop();
    }

    protected void onResume() {
        super.onResume();
        m25185a().onResume();
    }

    public Resources getResources() {
        if (!Leanplum.isTestModeEnabled()) {
            if (Leanplum.isResourceSyncingEnabled()) {
                return m25185a().getLeanplumResources(super.getResources());
            }
        }
        return super.getResources();
    }

    public void setContentView(int i) {
        if (!Leanplum.isTestModeEnabled()) {
            if (Leanplum.isResourceSyncingEnabled()) {
                m25185a().setContentView(i);
                return;
            }
        }
        super.setContentView(i);
    }
}
