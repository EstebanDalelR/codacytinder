package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

@TargetApi(19)
public class ga extends fy {
    /* renamed from: a */
    public final boolean mo8354a(View view) {
        return view.isAttachedToWindow();
    }

    /* renamed from: d */
    public final LayoutParams mo8491d() {
        return new LayoutParams(-1, -1);
    }
}
