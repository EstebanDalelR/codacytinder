package com.leanplum.activities;

import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;

@Deprecated
public abstract class LeanplumFragmentActivity extends FragmentActivity {
    /* renamed from: a */
    private LeanplumActivityHelper f29412a;

    /* renamed from: a */
    private LeanplumActivityHelper m35070a() {
        if (this.f29412a == null) {
            this.f29412a = new LeanplumActivityHelper(this);
        }
        return this.f29412a;
    }

    protected void onPause() {
        super.onPause();
        m35070a().onPause();
    }

    protected void onStop() {
        super.onStop();
        m35070a().onStop();
    }

    protected void onResume() {
        super.onResume();
        m35070a().onResume();
    }

    public Resources getResources() {
        if (!Leanplum.isTestModeEnabled()) {
            if (Leanplum.isResourceSyncingEnabled()) {
                return m35070a().getLeanplumResources(super.getResources());
            }
        }
        return super.getResources();
    }

    public void setContentView(int i) {
        if (!Leanplum.isTestModeEnabled()) {
            if (Leanplum.isResourceSyncingEnabled()) {
                m35070a().setContentView(i);
                return;
            }
        }
        super.setContentView(i);
    }
}
