package com.google.android.m4b.maps.cf;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.google.android.m4b.maps.cf.C5108f.C5107a;

/* renamed from: com.google.android.m4b.maps.cf.k */
public final class C5115k {
    /* renamed from: a */
    private Bitmap f19006a = null;
    /* renamed from: b */
    private int f19007b = 0;
    /* renamed from: c */
    private int f19008c = 0;

    public C5115k(Bitmap bitmap) {
        this.f19006a = bitmap;
        this.f19007b = bitmap.getWidth();
        this.f19008c = bitmap.getHeight();
    }

    /* renamed from: a */
    final boolean m22804a(C5107a c5107a) {
        if (c5107a.f18965d != null) {
            if (this.f19006a != null) {
                GLUtils.texImage2D(3553, 0, this.f19006a, 0);
            } else {
                GLES20.glTexImage2D(3553, 0, 6407, this.f19007b, this.f19008c, 0, 6407, 33635, null);
                C5111g.m22796a("ImageData", "glTexImage2D failed");
            }
        }
        return true;
    }
}
