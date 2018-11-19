package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import com.google.android.gms.common.images.ImageManager.OnImageLoadedListener;
import com.google.android.gms.common.internal.C2507w;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.images.c */
public final class C3816c extends C2494a {
    /* renamed from: c */
    private WeakReference<OnImageLoadedListener> f12046c;

    /* renamed from: a */
    protected final void mo2573a(Drawable drawable, boolean z, boolean z2, boolean z3) {
        if (!z2) {
            OnImageLoadedListener onImageLoadedListener = (OnImageLoadedListener) this.f12046c.get();
            if (onImageLoadedListener != null) {
                onImageLoadedListener.onImageLoaded(this.a.f7577a, drawable, z3);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3816c)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C3816c c3816c = (C3816c) obj;
        OnImageLoadedListener onImageLoadedListener = (OnImageLoadedListener) this.f12046c.get();
        OnImageLoadedListener onImageLoadedListener2 = (OnImageLoadedListener) c3816c.f12046c.get();
        return onImageLoadedListener2 != null && onImageLoadedListener != null && C2507w.m9173a(onImageLoadedListener2, onImageLoadedListener) && C2507w.m9173a(c3816c.a, this.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
