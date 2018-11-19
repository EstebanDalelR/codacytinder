package com.leanplum.activities;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;

@Deprecated
public class LeanplumAppCompatActivity extends AppCompatActivity {
    /* renamed from: a */
    private LeanplumActivityHelper f29413a;

    /* renamed from: a */
    private LeanplumActivityHelper m35073a() {
        if (this.f29413a == null) {
            this.f29413a = new LeanplumActivityHelper(this);
        }
        return this.f29413a;
    }

    protected void onPause() {
        super.onPause();
        m35073a().onPause();
    }

    protected void onStop() {
        super.onStop();
        m35073a().onStop();
    }

    protected void onResume() {
        super.onResume();
        m35073a().onResume();
    }

    public Resources getResources() {
        if (!Leanplum.isTestModeEnabled()) {
            if (Leanplum.isResourceSyncingEnabled()) {
                return m35073a().getLeanplumResources(super.getResources());
            }
        }
        return super.getResources();
    }

    public void setContentView(int i) {
        if (!Leanplum.isTestModeEnabled()) {
            if (Leanplum.isResourceSyncingEnabled()) {
                m35073a().setContentView(i);
                return;
            }
        }
        super.setContentView(i);
    }
}
