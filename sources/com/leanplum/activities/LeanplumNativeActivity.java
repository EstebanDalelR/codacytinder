package com.leanplum.activities;

import android.app.NativeActivity;
import android.content.res.Resources;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;

@Deprecated
public class LeanplumNativeActivity extends NativeActivity {
    /* renamed from: a */
    private LeanplumActivityHelper f21322a;

    /* renamed from: a */
    private LeanplumActivityHelper m25184a() {
        if (this.f21322a == null) {
            this.f21322a = new LeanplumActivityHelper(this);
        }
        return this.f21322a;
    }

    protected void onPause() {
        super.onPause();
        m25184a().onPause();
    }

    protected void onStop() {
        super.onStop();
        m25184a().onStop();
    }

    protected void onResume() {
        super.onResume();
        m25184a().onResume();
    }

    public Resources getResources() {
        if (!Leanplum.isTestModeEnabled()) {
            if (Leanplum.isResourceSyncingEnabled()) {
                return m25184a().getLeanplumResources(super.getResources());
            }
        }
        return super.getResources();
    }

    public void setContentView(int i) {
        if (!Leanplum.isTestModeEnabled()) {
            if (Leanplum.isResourceSyncingEnabled()) {
                m25184a().setContentView(i);
                return;
            }
        }
        super.setContentView(i);
    }
}
