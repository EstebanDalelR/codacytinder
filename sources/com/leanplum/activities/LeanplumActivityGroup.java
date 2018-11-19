package com.leanplum.activities;

import android.app.ActivityGroup;
import android.content.res.Resources;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;

@Deprecated
public class LeanplumActivityGroup extends ActivityGroup {
    /* renamed from: a */
    private LeanplumActivityHelper f21317a;

    /* renamed from: a */
    private LeanplumActivityHelper m25179a() {
        if (this.f21317a == null) {
            this.f21317a = new LeanplumActivityHelper(this);
        }
        return this.f21317a;
    }

    protected void onPause() {
        super.onPause();
        m25179a().onPause();
    }

    protected void onStop() {
        super.onStop();
        m25179a().onStop();
    }

    protected void onResume() {
        super.onResume();
        m25179a().onResume();
    }

    public Resources getResources() {
        if (!Leanplum.isTestModeEnabled()) {
            if (Leanplum.isResourceSyncingEnabled()) {
                return m25179a().getLeanplumResources(super.getResources());
            }
        }
        return super.getResources();
    }

    public void setContentView(int i) {
        if (!Leanplum.isTestModeEnabled()) {
            if (Leanplum.isResourceSyncingEnabled()) {
                m25179a().setContentView(i);
                return;
            }
        }
        super.setContentView(i);
    }
}
