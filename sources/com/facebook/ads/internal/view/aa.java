package com.facebook.ads.internal.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class aa extends View {
    /* renamed from: a */
    private C1624z f4318a;

    public aa(Context context, C1624z c1624z) {
        super(context);
        this.f4318a = c1624z;
        setLayoutParams(new LayoutParams(0, 0));
    }

    public void onWindowVisibilityChanged(int i) {
        if (this.f4318a != null) {
            this.f4318a.mo1680a(i);
        }
    }
}
