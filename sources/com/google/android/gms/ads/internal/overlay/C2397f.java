package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.gd;
import com.google.android.gms.internal.zzzv;

@zzzv
/* renamed from: com.google.android.gms.ads.internal.overlay.f */
final class C2397f extends RelativeLayout {
    /* renamed from: a */
    boolean f7303a;
    /* renamed from: b */
    private gd f7304b;

    public C2397f(Context context, String str, String str2) {
        super(context);
        this.f7304b = new gd(context, str);
        this.f7304b.b(str2);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f7303a) {
            this.f7304b.a(motionEvent);
        }
        return false;
    }
}
