package com.theartofdev.edmodo.cropper;

import android.graphics.RectF;
import com.theartofdev.edmodo.cropper.CropImageView.CropShape;
import com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type;

/* renamed from: com.theartofdev.edmodo.cropper.e */
final class C6141e {
    /* renamed from: a */
    private final RectF f22641a = new RectF();
    /* renamed from: b */
    private final RectF f22642b = new RectF();
    /* renamed from: c */
    private float f22643c;
    /* renamed from: d */
    private float f22644d;
    /* renamed from: e */
    private float f22645e;
    /* renamed from: f */
    private float f22646f;
    /* renamed from: g */
    private float f22647g;
    /* renamed from: h */
    private float f22648h;
    /* renamed from: i */
    private float f22649i;
    /* renamed from: j */
    private float f22650j;
    /* renamed from: k */
    private float f22651k = 1.0f;
    /* renamed from: l */
    private float f22652l = 1.0f;

    /* renamed from: c */
    private static boolean m26726c(float f, float f2, float f3, float f4, float f5, float f6) {
        return f > f3 && f < f5 && f2 > f4 && f2 < f6;
    }

    C6141e() {
    }

    /* renamed from: a */
    public RectF m26728a() {
        this.f22642b.set(this.f22641a);
        return this.f22642b;
    }

    /* renamed from: b */
    public float m26733b() {
        return Math.max(this.f22643c, this.f22647g / this.f22651k);
    }

    /* renamed from: c */
    public float m26734c() {
        return Math.max(this.f22644d, this.f22648h / this.f22652l);
    }

    /* renamed from: d */
    public float m26735d() {
        return Math.min(this.f22645e, this.f22649i / this.f22651k);
    }

    /* renamed from: e */
    public float m26736e() {
        return Math.min(this.f22646f, this.f22650j / this.f22652l);
    }

    /* renamed from: f */
    public float m26737f() {
        return this.f22651k;
    }

    /* renamed from: g */
    public float m26738g() {
        return this.f22652l;
    }

    /* renamed from: a */
    public void m26730a(float f, float f2, float f3, float f4) {
        this.f22645e = f;
        this.f22646f = f2;
        this.f22651k = f3;
        this.f22652l = f4;
    }

    /* renamed from: a */
    public void m26732a(CropImageOptions cropImageOptions) {
        this.f22643c = (float) cropImageOptions.minCropWindowWidth;
        this.f22644d = (float) cropImageOptions.minCropWindowHeight;
        this.f22647g = (float) cropImageOptions.minCropResultWidth;
        this.f22648h = (float) cropImageOptions.minCropResultHeight;
        this.f22649i = (float) cropImageOptions.maxCropResultWidth;
        this.f22650j = (float) cropImageOptions.maxCropResultHeight;
    }

    /* renamed from: a */
    public void m26731a(RectF rectF) {
        this.f22641a.set(rectF);
    }

    /* renamed from: h */
    public boolean m26739h() {
        return this.f22641a.width() >= 100.0f && this.f22641a.height() >= 100.0f;
    }

    /* renamed from: a */
    public CropWindowMoveHandler m26729a(float f, float f2, float f3, CropShape cropShape) {
        if (cropShape == CropShape.OVAL) {
            f3 = m26721a(f, f2);
        } else {
            f3 = m26722a(f, f2, f3);
        }
        return f3 != null ? new CropWindowMoveHandler(f3, this, f, f2) : null;
    }

    /* renamed from: a */
    private Type m26722a(float f, float f2, float f3) {
        if (C6141e.m26723a(f, f2, this.f22641a.left, this.f22641a.top, f3)) {
            return Type.TOP_LEFT;
        }
        if (C6141e.m26723a(f, f2, this.f22641a.right, this.f22641a.top, f3)) {
            return Type.TOP_RIGHT;
        }
        if (C6141e.m26723a(f, f2, this.f22641a.left, this.f22641a.bottom, f3)) {
            return Type.BOTTOM_LEFT;
        }
        if (C6141e.m26723a(f, f2, this.f22641a.right, this.f22641a.bottom, f3)) {
            return Type.BOTTOM_RIGHT;
        }
        if (C6141e.m26726c(f, f2, this.f22641a.left, this.f22641a.top, this.f22641a.right, this.f22641a.bottom) && m26727i()) {
            return Type.CENTER;
        }
        if (C6141e.m26724a(f, f2, this.f22641a.left, this.f22641a.right, this.f22641a.top, f3)) {
            return Type.TOP;
        }
        if (C6141e.m26724a(f, f2, this.f22641a.left, this.f22641a.right, this.f22641a.bottom, f3)) {
            return Type.BOTTOM;
        }
        if (C6141e.m26725b(f, f2, this.f22641a.left, this.f22641a.top, this.f22641a.bottom, f3)) {
            return Type.LEFT;
        }
        if (C6141e.m26725b(f, f2, this.f22641a.right, this.f22641a.top, this.f22641a.bottom, f3) != null) {
            return Type.RIGHT;
        }
        return (C6141e.m26726c(f, f2, this.f22641a.left, this.f22641a.top, this.f22641a.right, this.f22641a.bottom) == null || m26727i() != null) ? 0.0f : Type.CENTER;
    }

    /* renamed from: a */
    private Type m26721a(float f, float f2) {
        float width = this.f22641a.width() / 6.0f;
        float f3 = this.f22641a.left + width;
        float f4 = this.f22641a.left + (width * 5.0f);
        width = this.f22641a.height() / 6.0f;
        float f5 = this.f22641a.top + width;
        float f6 = this.f22641a.top + (width * 5.0f);
        if (f < f3) {
            if (f2 < f5) {
                return Type.TOP_LEFT;
            }
            if (f2 < f6) {
                return Type.LEFT;
            }
            return Type.BOTTOM_LEFT;
        } else if (f < f4) {
            if (f2 < f5) {
                return Type.TOP;
            }
            if (f2 < f6) {
                return Type.CENTER;
            }
            return Type.BOTTOM;
        } else if (f2 < f5) {
            return Type.TOP_RIGHT;
        } else {
            if (f2 < f6) {
                return Type.RIGHT;
            }
            return Type.BOTTOM_RIGHT;
        }
    }

    /* renamed from: a */
    private static boolean m26723a(float f, float f2, float f3, float f4, float f5) {
        return Math.abs(f - f3) <= f5 && Math.abs(f2 - f4) <= f5;
    }

    /* renamed from: a */
    private static boolean m26724a(float f, float f2, float f3, float f4, float f5, float f6) {
        return f > f3 && f < f4 && Math.abs(f2 - f5) <= f6;
    }

    /* renamed from: b */
    private static boolean m26725b(float f, float f2, float f3, float f4, float f5, float f6) {
        return Math.abs(f - f3) <= f6 && f2 > f4 && f2 < f5;
    }

    /* renamed from: i */
    private boolean m26727i() {
        return m26739h() ^ 1;
    }
}
