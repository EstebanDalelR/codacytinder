package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.internal.oh;

/* renamed from: com.google.android.gms.common.images.a */
public abstract class C2494a {
    /* renamed from: a */
    final C2495b f7575a;
    /* renamed from: b */
    protected int f7576b;

    /* renamed from: a */
    final void m9042a(Context context, Bitmap bitmap, boolean z) {
        ak.m9060a((Object) bitmap);
        mo2573a(new BitmapDrawable(context.getResources(), bitmap), z, false, true);
    }

    /* renamed from: a */
    final void m9043a(Context context, oh ohVar, boolean z) {
        Drawable drawable;
        if (this.f7576b != 0) {
            drawable = context.getResources().getDrawable(this.f7576b);
        } else {
            drawable = null;
        }
        mo2573a(drawable, z, false, false);
    }

    /* renamed from: a */
    protected abstract void mo2573a(Drawable drawable, boolean z, boolean z2, boolean z3);
}
