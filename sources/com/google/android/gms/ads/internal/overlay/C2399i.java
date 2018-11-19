package com.google.android.gms.ads.internal.overlay;

import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.gms.ads.internal.overlay.i */
final class C2399i implements Runnable {
    /* renamed from: a */
    private /* synthetic */ Drawable f7309a;
    /* renamed from: b */
    private /* synthetic */ C4276h f7310b;

    C2399i(C4276h c4276h, Drawable drawable) {
        this.f7310b = c4276h;
        this.f7309a = drawable;
    }

    public final void run() {
        this.f7310b.f13921a.f13902c.getWindow().setBackgroundDrawable(this.f7309a);
    }
}
