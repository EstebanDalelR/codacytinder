package com.leanplum.activities;

import android.app.ExpandableListActivity;
import android.content.res.Resources;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;

@Deprecated
public class LeanplumExpandableListActivity extends ExpandableListActivity {
    /* renamed from: a */
    private LeanplumActivityHelper f21319a;

    /* renamed from: a */
    private LeanplumActivityHelper m25181a() {
        if (this.f21319a == null) {
            this.f21319a = new LeanplumActivityHelper(this);
        }
        return this.f21319a;
    }

    protected void onPause() {
        super.onPause();
        m25181a().onPause();
    }

    protected void onStop() {
        super.onStop();
        m25181a().onStop();
    }

    protected void onResume() {
        super.onResume();
        m25181a().onResume();
    }

    public Resources getResources() {
        if (!Leanplum.isTestModeEnabled()) {
            if (Leanplum.isResourceSyncingEnabled()) {
                return m25181a().getLeanplumResources(super.getResources());
            }
        }
        return super.getResources();
    }

    public void setContentView(int i) {
        if (!Leanplum.isTestModeEnabled()) {
            if (Leanplum.isResourceSyncingEnabled()) {
                m25181a().setContentView(i);
                return;
            }
        }
        super.setContentView(i);
    }
}
