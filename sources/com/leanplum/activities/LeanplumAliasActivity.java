package com.leanplum.activities;

import android.app.AliasActivity;
import android.content.res.Resources;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;

@Deprecated
public class LeanplumAliasActivity extends AliasActivity {
    /* renamed from: a */
    private LeanplumActivityHelper f21318a;

    /* renamed from: a */
    private LeanplumActivityHelper m25180a() {
        if (this.f21318a == null) {
            this.f21318a = new LeanplumActivityHelper(this);
        }
        return this.f21318a;
    }

    protected void onPause() {
        super.onPause();
        m25180a().onPause();
    }

    protected void onStop() {
        super.onStop();
        m25180a().onStop();
    }

    protected void onResume() {
        super.onResume();
        m25180a().onResume();
    }

    public Resources getResources() {
        if (!Leanplum.isTestModeEnabled()) {
            if (Leanplum.isResourceSyncingEnabled()) {
                return m25180a().getLeanplumResources(super.getResources());
            }
        }
        return super.getResources();
    }

    public void setContentView(int i) {
        if (!Leanplum.isTestModeEnabled()) {
            if (Leanplum.isResourceSyncingEnabled()) {
                m25180a().setContentView(i);
                return;
            }
        }
        super.setContentView(i);
    }
}
