package com.theartofdev.edmodo.cropper;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;

final class CropWindowMoveHandler {
    /* renamed from: a */
    private static final Matrix f22580a = new Matrix();
    /* renamed from: b */
    private final float f22581b;
    /* renamed from: c */
    private final float f22582c;
    /* renamed from: d */
    private final float f22583d;
    /* renamed from: e */
    private final float f22584e;
    /* renamed from: f */
    private final Type f22585f;
    /* renamed from: g */
    private final PointF f22586g = new PointF();

    public enum Type {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        CENTER
    }

    /* renamed from: a */
    private static float m26668a(float f, float f2, float f3, float f4) {
        return (f3 - f) / (f4 - f2);
    }

    public CropWindowMoveHandler(Type type, C6141e c6141e, float f, float f2) {
        this.f22585f = type;
        this.f22581b = c6141e.m26733b();
        this.f22582c = c6141e.m26734c();
        this.f22583d = c6141e.m26735d();
        this.f22584e = c6141e.m26736e();
        m26670a(c6141e.m26728a(), f, f2);
    }

    /* renamed from: a */
    public void m26684a(RectF rectF, float f, float f2, RectF rectF2, int i, int i2, float f3, boolean z, float f4) {
        float f5 = f + this.f22586g.x;
        float f6 = f2 + this.f22586g.y;
        if (this.f22585f == Type.CENTER) {
            m26671a(rectF, f5, f6, rectF2, i, i2, f3);
        } else if (z) {
            m26672a(rectF, f5, f6, rectF2, i, i2, f3, f4);
        } else {
            m26677b(rectF, f5, f6, rectF2, i, i2, f3);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m26670a(android.graphics.RectF r3, float r4, float r5) {
        /*
        r2 = this;
        r0 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.C61321.f22579a;
        r1 = r2.f22585f;
        r1 = r1.ordinal();
        r0 = r0[r1];
        r1 = 0;
        switch(r0) {
            case 1: goto L_0x0045;
            case 2: goto L_0x003d;
            case 3: goto L_0x0035;
            case 4: goto L_0x002d;
            case 5: goto L_0x0028;
            case 6: goto L_0x0024;
            case 7: goto L_0x0020;
            case 8: goto L_0x001c;
            case 9: goto L_0x0010;
            default: goto L_0x000e;
        };
    L_0x000e:
        r3 = 0;
        goto L_0x004c;
    L_0x0010:
        r0 = r3.centerX();
        r1 = r0 - r4;
        r3 = r3.centerY();
        r3 = r3 - r5;
        goto L_0x004c;
    L_0x001c:
        r3 = r3.bottom;
        r3 = r3 - r5;
        goto L_0x004c;
    L_0x0020:
        r3 = r3.right;
        r3 = r3 - r4;
        goto L_0x002b;
    L_0x0024:
        r3 = r3.top;
        r3 = r3 - r5;
        goto L_0x004c;
    L_0x0028:
        r3 = r3.left;
        r3 = r3 - r4;
    L_0x002b:
        r1 = r3;
        goto L_0x000e;
    L_0x002d:
        r0 = r3.right;
        r1 = r0 - r4;
        r3 = r3.bottom;
        r3 = r3 - r5;
        goto L_0x004c;
    L_0x0035:
        r0 = r3.left;
        r1 = r0 - r4;
        r3 = r3.bottom;
        r3 = r3 - r5;
        goto L_0x004c;
    L_0x003d:
        r0 = r3.right;
        r1 = r0 - r4;
        r3 = r3.top;
        r3 = r3 - r5;
        goto L_0x004c;
    L_0x0045:
        r0 = r3.left;
        r1 = r0 - r4;
        r3 = r3.top;
        r3 = r3 - r5;
    L_0x004c:
        r4 = r2.f22586g;
        r4.x = r1;
        r4 = r2.f22586g;
        r4.y = r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.CropWindowMoveHandler.a(android.graphics.RectF, float, float):void");
    }

    /* renamed from: a */
    private void m26671a(RectF rectF, float f, float f2, RectF rectF2, int i, int i2, float f3) {
        f -= rectF.centerX();
        f2 -= rectF.centerY();
        if (rectF.left + f < 0.0f || rectF.right + f > ((float) i) || rectF.left + f < rectF2.left || rectF.right + f > rectF2.right) {
            f /= 1.05f;
            i = this.f22586g;
            i.x -= f / 2.0f;
        }
        if (rectF.top + f2 < 0 || rectF.bottom + f2 > ((float) i2) || rectF.top + f2 < rectF2.top || rectF.bottom + f2 > rectF2.bottom) {
            f2 /= 1.05f;
            i = this.f22586g;
            i.y -= f2 / 2.0f;
        }
        rectF.offset(f, f2);
        m26675a(rectF, rectF2, f3);
    }

    /* renamed from: b */
    private void m26677b(RectF rectF, float f, float f2, RectF rectF2, int i, int i2, float f3) {
        RectF rectF3;
        RectF rectF4;
        switch (this.f22585f) {
            case TOP_LEFT:
                rectF3 = rectF;
                rectF4 = rectF2;
                float f4 = f3;
                m26678b(rectF3, f2, rectF4, f4, 0.0f, false, false);
                m26673a(rectF3, f, rectF4, f4, 0.0f, false, false);
                return;
            case TOP_RIGHT:
                rectF3 = rectF;
                rectF4 = rectF2;
                m26678b(rectF3, f2, rectF4, f3, 0.0f, false, false);
                m26674a(rectF3, f, rectF4, i, f3, 0.0f, false, false);
                return;
            case BOTTOM_LEFT:
                rectF3 = rectF;
                rectF4 = rectF2;
                m26679b(rectF3, f2, rectF4, i2, f3, 0.0f, false, false);
                m26673a(rectF3, f, rectF4, f3, 0.0f, false, false);
                return;
            case BOTTOM_RIGHT:
                rectF3 = rectF;
                rectF4 = rectF2;
                float f5 = f3;
                m26679b(rectF3, f2, rectF4, i2, f5, 0.0f, false, false);
                m26674a(rectF3, f, rectF4, i, f5, 0.0f, false, false);
                return;
            case LEFT:
                m26673a(rectF, f, rectF2, f3, 0.0f, false, false);
                return;
            case TOP:
                m26678b(rectF, f2, rectF2, f3, 0.0f, false, false);
                return;
            case RIGHT:
                m26674a(rectF, f, rectF2, i, f3, 0.0f, false, false);
                return;
            case BOTTOM:
                m26679b(rectF, f2, rectF2, i2, f3, 0.0f, false, false);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private void m26672a(RectF rectF, float f, float f2, RectF rectF2, int i, int i2, float f3, float f4) {
        RectF rectF3 = rectF;
        float f5 = f;
        float f6 = f2;
        RectF rectF4 = rectF2;
        float f7 = f4;
        switch (this.f22585f) {
            case TOP_LEFT:
                if (m26668a(f5, f6, rectF3.right, rectF3.bottom) < f7) {
                    m26678b(rectF3, f6, rectF4, f3, f7, true, false);
                    m26669a(rectF3, f7);
                    return;
                }
                m26673a(rectF3, f5, rectF4, f3, f7, true, false);
                m26676b(rectF3, f7);
                return;
            case TOP_RIGHT:
                if (m26668a(rectF3.left, f6, f5, rectF3.bottom) < f7) {
                    m26678b(rectF3, f6, rectF4, f3, f7, false, true);
                    m26681c(rectF3, f7);
                    return;
                }
                m26674a(rectF3, f5, rectF4, i, f3, f7, true, false);
                m26676b(rectF3, f7);
                return;
            case BOTTOM_LEFT:
                if (m26668a(f5, rectF3.top, rectF3.right, f6) < f7) {
                    m26679b(rectF3, f6, rectF4, i2, f3, f7, true, false);
                    m26669a(rectF3, f7);
                    return;
                }
                m26673a(rectF3, f5, rectF4, f3, f7, false, true);
                m26683d(rectF3, f7);
                return;
            case BOTTOM_RIGHT:
                if (m26668a(rectF3.left, rectF3.top, f5, f6) < f7) {
                    m26679b(rectF3, f6, rectF4, i2, f3, f7, false, true);
                    m26681c(rectF3, f7);
                    return;
                }
                m26674a(rectF3, f5, rectF4, i, f3, f7, false, true);
                m26683d(rectF3, f7);
                return;
            case LEFT:
                m26673a(rectF3, f5, rectF4, f3, f7, true, true);
                m26682c(rectF3, rectF4, f7);
                return;
            case TOP:
                m26678b(rectF3, f6, rectF4, f3, f7, true, true);
                m26680b(rectF3, rectF4, f7);
                return;
            case RIGHT:
                m26674a(rectF3, f5, rectF4, i, f3, f7, true, true);
                m26682c(rectF3, rectF4, f7);
                return;
            case BOTTOM:
                m26679b(rectF3, f6, rectF4, i2, f3, f7, true, true);
                m26680b(rectF3, rectF4, f7);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private void m26675a(RectF rectF, RectF rectF2, float f) {
        if (rectF.left < rectF2.left + f) {
            rectF.offset(rectF2.left - rectF.left, 0.0f);
        }
        if (rectF.top < rectF2.top + f) {
            rectF.offset(0.0f, rectF2.top - rectF.top);
        }
        if (rectF.right > rectF2.right - f) {
            rectF.offset(rectF2.right - rectF.right, 0.0f);
        }
        if (rectF.bottom > rectF2.bottom - f) {
            rectF.offset(0.0f, rectF2.bottom - rectF.bottom);
        }
    }

    /* renamed from: a */
    private void m26673a(RectF rectF, float f, RectF rectF2, float f2, float f3, boolean z, boolean z2) {
        if (f < 0.0f) {
            f /= 1.05f;
            PointF pointF = this.f22586g;
            pointF.x -= f / 1.1f;
        }
        if (f < rectF2.left) {
            pointF = this.f22586g;
            pointF.x -= (f - rectF2.left) / 2.0f;
        }
        if (f - rectF2.left < f2) {
            f = rectF2.left;
        }
        if (rectF.right - f < this.f22581b) {
            f = rectF.right - this.f22581b;
        }
        if (rectF.right - f > this.f22583d) {
            f = rectF.right - this.f22583d;
        }
        if (f - rectF2.left < f2) {
            f = rectF2.left;
        }
        if (f3 > 0.0f) {
            f2 = (rectF.right - f) / f3;
            if (f2 < this.f22582c) {
                f = Math.max(rectF2.left, rectF.right - (this.f22582c * f3));
                f2 = (rectF.right - f) / f3;
            }
            if (f2 > this.f22584e) {
                f = Math.max(rectF2.left, rectF.right - (this.f22584e * f3));
                f2 = (rectF.right - f) / f3;
            }
            if (z && z2) {
                f = Math.max(f, Math.max(rectF2.left, rectF.right - (rectF2.height() * f3)));
            } else {
                if (z && rectF.bottom - r9 < rectF2.top) {
                    f = Math.max(rectF2.left, rectF.right - ((rectF.bottom - rectF2.top) * f3));
                    f2 = (rectF.right - f) / f3;
                }
                if (z2 && rectF.top + r9 > rectF2.bottom) {
                    f = Math.max(f, Math.max(rectF2.left, rectF.right - ((rectF2.bottom - rectF.top) * f3)));
                }
            }
        }
        rectF.left = f;
    }

    /* renamed from: a */
    private void m26674a(RectF rectF, float f, RectF rectF2, int i, float f2, float f3, boolean z, boolean z2) {
        i = (float) i;
        if (f > i) {
            f = ((f - i) / 1.05f) + i;
            PointF pointF = this.f22586g;
            pointF.x -= (f - i) / 1066192077;
        }
        if (f > rectF2.right) {
            i = this.f22586g;
            i.x -= (f - rectF2.right) / 2.0f;
        }
        if (rectF2.right - f < f2) {
            f = rectF2.right;
        }
        if (f - rectF.left < this.f22581b) {
            f = rectF.left + this.f22581b;
        }
        if (f - rectF.left > this.f22583d) {
            f = rectF.left + this.f22583d;
        }
        if (rectF2.right - f < f2) {
            f = rectF2.right;
        }
        if (f3 > 0) {
            i = (f - rectF.left) / f3;
            if (i < this.f22582c) {
                f = Math.min(rectF2.right, rectF.left + (this.f22582c * f3));
                i = (f - rectF.left) / f3;
            }
            if (i > this.f22584e) {
                f = Math.min(rectF2.right, rectF.left + (this.f22584e * f3));
                i = (f - rectF.left) / f3;
            }
            if (z && z2) {
                f = Math.min(f, Math.min(rectF2.right, rectF.left + (rectF2.height() * f3)));
            } else {
                if (z && rectF.bottom - r7 < rectF2.top) {
                    f = Math.min(rectF2.right, rectF.left + ((rectF.bottom - rectF2.top) * f3));
                    i = (f - rectF.left) / f3;
                }
                if (z2 && rectF.top + r7 > rectF2.bottom) {
                    f = Math.min(f, Math.min(rectF2.right, rectF.left + ((rectF2.bottom - rectF.top) * f3)));
                }
            }
        }
        rectF.right = f;
    }

    /* renamed from: b */
    private void m26678b(RectF rectF, float f, RectF rectF2, float f2, float f3, boolean z, boolean z2) {
        if (f < 0.0f) {
            f /= 1.05f;
            PointF pointF = this.f22586g;
            pointF.y -= f / 1.1f;
        }
        if (f < rectF2.top) {
            pointF = this.f22586g;
            pointF.y -= (f - rectF2.top) / 2.0f;
        }
        if (f - rectF2.top < f2) {
            f = rectF2.top;
        }
        if (rectF.bottom - f < this.f22582c) {
            f = rectF.bottom - this.f22582c;
        }
        if (rectF.bottom - f > this.f22584e) {
            f = rectF.bottom - this.f22584e;
        }
        if (f - rectF2.top < f2) {
            f = rectF2.top;
        }
        if (f3 > 0.0f) {
            f2 = (rectF.bottom - f) * f3;
            if (f2 < this.f22581b) {
                f = Math.max(rectF2.top, rectF.bottom - (this.f22581b / f3));
                f2 = (rectF.bottom - f) * f3;
            }
            if (f2 > this.f22583d) {
                f = Math.max(rectF2.top, rectF.bottom - (this.f22583d / f3));
                f2 = (rectF.bottom - f) * f3;
            }
            if (z && z2) {
                f = Math.max(f, Math.max(rectF2.top, rectF.bottom - (rectF2.width() / f3)));
            } else {
                if (z && rectF.right - r9 < rectF2.left) {
                    f = Math.max(rectF2.top, rectF.bottom - ((rectF.right - rectF2.left) / f3));
                    f2 = (rectF.bottom - f) * f3;
                }
                if (z2 && rectF.left + r9 > rectF2.right) {
                    f = Math.max(f, Math.max(rectF2.top, rectF.bottom - ((rectF2.right - rectF.left) / f3)));
                }
            }
        }
        rectF.top = f;
    }

    /* renamed from: b */
    private void m26679b(RectF rectF, float f, RectF rectF2, int i, float f2, float f3, boolean z, boolean z2) {
        i = (float) i;
        if (f > i) {
            f = ((f - i) / 1.05f) + i;
            PointF pointF = this.f22586g;
            pointF.y -= (f - i) / 1066192077;
        }
        if (f > rectF2.bottom) {
            i = this.f22586g;
            i.y -= (f - rectF2.bottom) / 2.0f;
        }
        if (rectF2.bottom - f < f2) {
            f = rectF2.bottom;
        }
        if (f - rectF.top < this.f22582c) {
            f = rectF.top + this.f22582c;
        }
        if (f - rectF.top > this.f22584e) {
            f = rectF.top + this.f22584e;
        }
        if (rectF2.bottom - f < f2) {
            f = rectF2.bottom;
        }
        if (f3 > 0) {
            i = (f - rectF.top) * f3;
            if (i < this.f22581b) {
                f = Math.min(rectF2.bottom, rectF.top + (this.f22581b / f3));
                i = (f - rectF.top) * f3;
            }
            if (i > this.f22583d) {
                f = Math.min(rectF2.bottom, rectF.top + (this.f22583d / f3));
                i = (f - rectF.top) * f3;
            }
            if (z && z2) {
                f = Math.min(f, Math.min(rectF2.bottom, rectF.top + (rectF2.width() / f3)));
            } else {
                if (z && rectF.right - r7 < rectF2.left) {
                    f = Math.min(rectF2.bottom, rectF.top + ((rectF.right - rectF2.left) / f3));
                    i = (f - rectF.top) * f3;
                }
                if (z2 && rectF.left + r7 > rectF2.right) {
                    f = Math.min(f, Math.min(rectF2.bottom, rectF.top + ((rectF2.right - rectF.left) / f3)));
                }
            }
        }
        rectF.bottom = f;
    }

    /* renamed from: a */
    private void m26669a(RectF rectF, float f) {
        rectF.left = rectF.right - (rectF.height() * f);
    }

    /* renamed from: b */
    private void m26676b(RectF rectF, float f) {
        rectF.top = rectF.bottom - (rectF.width() / f);
    }

    /* renamed from: c */
    private void m26681c(RectF rectF, float f) {
        rectF.right = rectF.left + (rectF.height() * f);
    }

    /* renamed from: d */
    private void m26683d(RectF rectF, float f) {
        rectF.bottom = rectF.top + (rectF.width() / f);
    }

    /* renamed from: b */
    private void m26680b(RectF rectF, RectF rectF2, float f) {
        rectF.inset((rectF.width() - (rectF.height() * f)) / 2.0f, 0.0f);
        if (rectF.left < rectF2.left) {
            rectF.offset(rectF2.left - rectF.left, 0.0f);
        }
        if (rectF.right > rectF2.right) {
            rectF.offset(rectF2.right - rectF.right, 0.0f);
        }
    }

    /* renamed from: c */
    private void m26682c(RectF rectF, RectF rectF2, float f) {
        rectF.inset(0.0f, (rectF.height() - (rectF.width() / f)) / 2.0f);
        if (rectF.top < rectF2.top) {
            rectF.offset(0.0f, rectF2.top - rectF.top);
        }
        if (rectF.bottom > rectF2.bottom) {
            rectF.offset(0.0f, rectF2.bottom - rectF.bottom);
        }
    }
}
