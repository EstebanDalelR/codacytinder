package com.google.android.m4b.maps.bv;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.opengl.GLUtils;
import com.google.android.gms.gcm.Task;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.ArrayList;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.google.android.m4b.maps.bv.k */
public final class C4935k {
    /* renamed from: a */
    private int f18202a;
    /* renamed from: b */
    private int f18203b;
    /* renamed from: c */
    private final boolean f18204c;
    /* renamed from: d */
    private Bitmap f18205d;
    /* renamed from: e */
    private Canvas f18206e;
    /* renamed from: f */
    private int f18207f;
    /* renamed from: g */
    private float f18208g;
    /* renamed from: h */
    private float f18209h;
    /* renamed from: i */
    private int f18210i;
    /* renamed from: j */
    private int f18211j;
    /* renamed from: k */
    private int f18212k;
    /* renamed from: l */
    private final ArrayList<C4934a> f18213l;
    /* renamed from: m */
    private int f18214m;
    /* renamed from: n */
    private final boolean f18215n;

    /* renamed from: com.google.android.m4b.maps.bv.k$a */
    static class C4934a {
        /* renamed from: a */
        public final C4926f f18197a;
        /* renamed from: b */
        private float f18198b;
        /* renamed from: c */
        private float f18199c;
        /* renamed from: d */
        private float f18200d;
        /* renamed from: e */
        private int[] f18201e;

        public C4934a(C4926f c4926f, float f, float f2, float f3, int i, int i2, int i3, int i4) {
            this.f18197a = c4926f;
            this.f18198b = f;
            this.f18199c = f2;
            this.f18200d = f3;
            this.f18201e = new int[]{i, i2, i3, i4};
        }
    }

    public C4935k(boolean z, int i, int i2, boolean z2) {
        this.f18213l = new ArrayList();
        this.f18202a = i;
        this.f18203b = i2;
        this.f18208g = 1065353216 / ((float) this.f18202a);
        this.f18209h = 1065353216 / ((float) this.f18203b);
        this.f18204c = z;
        this.f18215n = z2;
        this.f18214m = false;
    }

    public C4935k(boolean z, int i, int i2) {
        this(true, 512, ProfileEditingConfig.DEFAULT_MAX_LENGTH, true);
    }

    /* renamed from: a */
    public final void m22113a(GL10 gl10) {
        this.f18214m = 1;
        int[] iArr = new int[1];
        gl10.glGenTextures(1, iArr, 0);
        this.f18207f = iArr[0];
        gl10.glBindTexture(3553, this.f18207f);
        gl10.glTexParameterf(3553, 10241, 9728.0f);
        gl10.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, 9728.0f);
        gl10.glTexParameterf(3553, 10242, 33071.0f);
        gl10.glTexParameterf(3553, 10243, 33071.0f);
        gl10.glTexEnvf(8960, 8704, 7681.0f);
    }

    /* renamed from: b */
    public final void m22116b(GL10 gl10) {
        if (gl10 != null && this.f18214m > 0) {
            gl10.glDeleteTextures(1, new int[]{this.f18207f}, 0);
        }
    }

    /* renamed from: a */
    public final void m22112a() {
        m22110a(1, 2);
        this.f18213l.clear();
        this.f18210i = 0;
        this.f18211j = 0;
        this.f18212k = 0;
        this.f18205d = Bitmap.createBitmap(this.f18202a, this.f18203b, this.f18204c ? Config.ARGB_8888 : Config.ALPHA_8);
        this.f18206e = new Canvas(this.f18205d);
        this.f18205d.eraseColor(0);
    }

    /* renamed from: c */
    public final void m22117c(GL10 gl10) {
        m22110a(2, 1);
        gl10.glBindTexture(3553, this.f18207f);
        GLUtils.texImage2D(3553, 0, this.f18205d, 0);
        this.f18205d.recycle();
        this.f18205d = null;
        this.f18206e = null;
    }

    /* renamed from: a */
    public final void m22114a(GL10 gl10, float f, float f2) {
        m22110a(1, 3);
        gl10.glBindTexture(3553, this.f18207f);
        gl10.glShadeModel(7424);
        gl10.glEnable(3042);
        gl10.glBlendFunc(1, 771);
        gl10.glColor4x(65536, 65536, 65536, 65536);
        if (this.f18215n) {
            gl10.glMatrixMode(5889);
            gl10.glPushMatrix();
            gl10.glLoadIdentity();
            gl10.glOrthof(0.0f, f, 0.0f, f2, 0.0f, 1.0f);
            gl10.glMatrixMode(8.251E-42f);
            gl10.glPushMatrix();
            gl10.glLoadIdentity();
        }
    }

    /* renamed from: d */
    public final void m22118d(GL10 gl10) {
        m22110a(3, 1);
        gl10.glDisable(3042);
        if (this.f18215n) {
            gl10.glMatrixMode(5889);
            gl10.glPopMatrix();
            gl10.glMatrixMode(5888);
            gl10.glPopMatrix();
        }
    }

    /* renamed from: a */
    private void m22110a(int i, int i2) {
        if (this.f18214m != i) {
            throw new IllegalArgumentException("Can't call this method now.");
        }
        this.f18214m = i2;
    }

    /* renamed from: a */
    public final int m22111a(GL10 gl10, String str, Paint paint, Paint paint2) {
        int strokeWidth;
        int ceil;
        int i;
        int ceil2;
        int i2;
        String str2 = str;
        Paint paint3 = paint;
        Paint paint4 = paint2;
        m22110a(2, 2);
        Object obj = (str2 == null || paint3 == null) ? null : 1;
        Rect rect = new Rect();
        if (paint4 != null) {
            strokeWidth = (((int) paint2.getStrokeWidth()) + 1) / 2;
            rect.top += strokeWidth;
            rect.bottom += strokeWidth;
            rect.left += strokeWidth;
            rect.right += strokeWidth;
        }
        if (obj != null) {
            strokeWidth = Math.min(str.length(), 20);
            ceil = (int) Math.ceil((double) paint.descent());
            i = strokeWidth;
            strokeWidth = (int) Math.ceil((double) paint3.measureText(str2, 0, strokeWidth));
            ceil2 = (int) Math.ceil((double) (-paint.ascent()));
        } else {
            strokeWidth = 0;
            i = 0;
            ceil = 0;
            ceil2 = 0;
        }
        ceil += ceil2;
        strokeWidth = Math.min(r0.f18202a, strokeWidth);
        int i3 = rect.top + rect.bottom;
        int i4 = rect.left + rect.right;
        int max = Math.max(0, ceil + i3);
        int max2 = Math.max(0, strokeWidth + i4);
        i3 = ((max - i3) - ceil) / 2;
        i4 = ((max2 - i4) - strokeWidth) / 2;
        strokeWidth = r0.f18210i;
        ceil = r0.f18211j;
        int i5 = r0.f18212k;
        if (max2 > r0.f18202a) {
            max2 = r0.f18202a;
        }
        int i6 = strokeWidth;
        if (strokeWidth + max2 > r0.f18202a) {
            i2 = ceil + i5;
            i5 = 0;
            ceil = 0;
        } else {
            i2 = ceil;
            ceil = i6;
        }
        strokeWidth = Math.max(i5, max);
        int i7 = strokeWidth;
        if (i2 + strokeWidth > r0.f18203b) {
            throw new IllegalArgumentException("Out of texture space.");
        }
        int i8;
        float f;
        float f2;
        strokeWidth = ceil + max2;
        i5 = i2 + ceil2;
        int i9 = ceil2;
        ceil2 = i2 + max;
        if (obj != null) {
            Path path;
            float f3 = (float) ((rect.left + ceil) + i4);
            float f4 = (float) ((i5 + rect.top) + i3);
            Path path2 = new Path();
            int i10 = i;
            i8 = strokeWidth;
            f = f3;
            i4 = i7;
            f2 = f4;
            i3 = ceil;
            paint3.getTextPath(str2, 0, i10, f, f2, path2);
            if (paint4 != null) {
                path = path2;
                r0.f18206e.drawPath(path, paint4);
            } else {
                path = path2;
            }
            r0.f18206e.drawPath(path, paint3);
        } else {
            i8 = strokeWidth;
            i3 = ceil;
            i4 = i7;
        }
        C4926f c4926f = new C4926f(2, 2);
        float f5 = ((float) i3) * r0.f18208g;
        ceil = i8;
        float f6 = ((float) ceil) * r0.f18208g;
        float f7 = ((float) i2) * r0.f18209h;
        C4926f c4926f2 = c4926f;
        float f8 = ((float) ceil2) * r0.f18209h;
        c4926f2.m22080a(0, 0, 0.0f, 0.0f, 0.0f, f5, f8);
        f2 = (float) max2;
        c4926f2.m22080a(1, 0, f2, 0.0f, 0.0f, f6, f8);
        f = (float) max;
        float f9 = f;
        f8 = f7;
        c4926f2.m22080a(0, 1, 0.0f, f9, 0.0f, f5, f8);
        c4926f2.m22080a(1, 1, f2, f9, 0.0f, f6, f8);
        r0.f18210i = ceil;
        r0.f18211j = i2;
        r0.f18212k = i4;
        r0.f18213l.add(new C4934a(c4926f, f2, f, (float) i9, i3, ceil2, max2, -max));
        return r0.f18213l.size() - 1;
    }

    /* renamed from: a */
    public final void m22115a(GL10 gl10, int i) {
        m22110a(3, 3);
        float floor = (float) Math.floor(0.0d);
        float floor2 = (float) Math.floor(0.0d);
        if (this.f18215n) {
            gl10.glMatrixMode(5888);
            gl10.glPushMatrix();
            gl10.glTranslatef(floor, floor2, 0.0f);
        }
        C4934a c4934a = (C4934a) this.f18213l.get(i);
        gl10.glEnable(3553);
        c4934a.f18197a.m22081a(gl10, true);
        if (this.f18215n != 0) {
            gl10.glMatrixMode(5888);
            gl10.glPopMatrix();
        }
    }
}
