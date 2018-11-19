package com.leanplum.activities;

import android.app.ListActivity;
import android.content.res.Resources;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;

@Deprecated
public class LeanplumListActivity extends ListActivity {
    /* renamed from: a */
    private LeanplumActivityHelper f21321a;

    /* renamed from: a */
    private LeanplumActivityHelper m25183a() {
        if (this.f21321a == null) {
            this.f21321a = new LeanplumActivityHelper(this);
        }
        return this.f21321a;
    }

    protected void onPause() {
        super.onPause();
        m25183a().onPause();
    }

    protected void onStop() {
        super.onStop();
        m25183a().onStop();
    }

    protected void onResume() {
        super.onResume();
        m25183a().onResume();
    }

    public Resources getResources() {
        if (!Leanplum.isTestModeEnabled()) {
            if (Leanplum.isResourceSyncingEnabled()) {
                return m25183a().getLeanplumResources(super.getResources());
            }
        }
        return super.getResources();
    }

    public void setContentView(int i) {
        if (!Leanplum.isTestModeEnabled()) {
            if (Leanplum.isResourceSyncingEnabled()) {
                m25183a().setContentView(i);
                return;
            }
        }
        super.setContentView(i);
    }
}
