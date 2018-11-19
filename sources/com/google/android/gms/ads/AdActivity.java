package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.internal.aja;
import com.google.android.gms.internal.hx;
import com.google.android.gms.internal.zzxe;

@KeepForSdkWithMembers
public class AdActivity extends Activity {
    /* renamed from: a */
    private zzxe f7023a;

    /* renamed from: a */
    private final void m8540a() {
        if (this.f7023a != null) {
            try {
                this.f7023a.zzbf();
            } catch (Throwable e) {
                hx.c("Could not forward setContentViewSet to ad overlay:", e);
            }
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        try {
            this.f7023a.onActivityResult(i, i2, intent);
        } catch (Throwable e) {
            hx.c("Could not forward onActivityResult to ad overlay:", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        boolean z = true;
        try {
            if (this.f7023a != null) {
                z = this.f7023a.zzmu();
            }
        } catch (Throwable e) {
            hx.c("Could not forward onBackPressed to ad overlay:", e);
        }
        if (z) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.f7023a.zzk(C4296b.m17261a((Object) configuration));
        } catch (Throwable e) {
            hx.c("Failed to wrap configuration.", e);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f7023a = aja.b().a(this);
        if (this.f7023a == null) {
            hx.e("Could not create ad overlay.");
        } else {
            try {
                this.f7023a.onCreate(bundle);
                return;
            } catch (Throwable e) {
                hx.c("Could not forward onCreate to ad overlay:", e);
            }
        }
        finish();
    }

    protected void onDestroy() {
        try {
            if (this.f7023a != null) {
                this.f7023a.onDestroy();
            }
        } catch (Throwable e) {
            hx.c("Could not forward onDestroy to ad overlay:", e);
        }
        super.onDestroy();
    }

    protected void onPause() {
        try {
            if (this.f7023a != null) {
                this.f7023a.onPause();
            }
        } catch (Throwable e) {
            hx.c("Could not forward onPause to ad overlay:", e);
            finish();
        }
        super.onPause();
    }

    protected void onRestart() {
        super.onRestart();
        try {
            if (this.f7023a != null) {
                this.f7023a.onRestart();
            }
        } catch (Throwable e) {
            hx.c("Could not forward onRestart to ad overlay:", e);
            finish();
        }
    }

    protected void onResume() {
        super.onResume();
        try {
            if (this.f7023a != null) {
                this.f7023a.onResume();
            }
        } catch (Throwable e) {
            hx.c("Could not forward onResume to ad overlay:", e);
            finish();
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.f7023a != null) {
                this.f7023a.onSaveInstanceState(bundle);
            }
        } catch (Throwable e) {
            hx.c("Could not forward onSaveInstanceState to ad overlay:", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    protected void onStart() {
        super.onStart();
        try {
            if (this.f7023a != null) {
                this.f7023a.onStart();
            }
        } catch (Throwable e) {
            hx.c("Could not forward onStart to ad overlay:", e);
            finish();
        }
    }

    protected void onStop() {
        try {
            if (this.f7023a != null) {
                this.f7023a.onStop();
            }
        } catch (Throwable e) {
            hx.c("Could not forward onStop to ad overlay:", e);
            finish();
        }
        super.onStop();
    }

    public void setContentView(int i) {
        super.setContentView(i);
        m8540a();
    }

    public void setContentView(View view) {
        super.setContentView(view);
        m8540a();
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        m8540a();
    }
}
