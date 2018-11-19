package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.view.View;

@TargetApi(18)
public class fy extends fw {
    /* renamed from: a */
    public boolean mo8354a(View view) {
        if (!super.mo8354a(view)) {
            if (view.getWindowId() == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public final int mo8355c() {
        return 14;
    }
}
