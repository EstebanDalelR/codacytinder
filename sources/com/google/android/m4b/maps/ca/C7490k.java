package com.google.android.m4b.maps.ca;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.opengl.GLUtils;
import android.util.DisplayMetrics;
import com.google.android.gms.gcm.Task;
import com.google.android.m4b.maps.bw.C4976e;
import com.google.android.m4b.maps.cf.C5115k;
import com.google.android.m4b.maps.cf.C6595s;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.google.android.m4b.maps.ca.k */
public final class C7490k extends C6595s {
    /* renamed from: e */
    private int f27642e;
    /* renamed from: f */
    private int f27643f;
    /* renamed from: g */
    private final int[] f27644g;
    /* renamed from: h */
    private boolean f27645h;
    /* renamed from: i */
    private boolean f27646i;
    /* renamed from: j */
    private boolean f27647j;
    /* renamed from: k */
    private boolean f27648k;
    /* renamed from: l */
    private float f27649l;
    /* renamed from: m */
    private float f27650m;
    /* renamed from: n */
    private final long f27651n;
    /* renamed from: o */
    private int f27652o;
    /* renamed from: p */
    private boolean f27653p;

    /* renamed from: com.google.android.m4b.maps.ca.k$a */
    public static class C6574a<K> extends C4976e<K, C7490k> {
        /* renamed from: b */
        public final /* synthetic */ void mo5247b(Object obj, Object obj2) {
            ((C7490k) obj2).m32557f();
        }

        public C6574a(int i) {
            super(i);
        }
    }

    /* renamed from: a */
    public static int m32534a(int i, int i2) {
        while (i2 < i) {
            i2 <<= 1;
        }
        return i2;
    }

    public C7490k(C5052d c5052d) {
        this.f27644g = new int[1];
        this.f27645h = false;
        this.f27646i = false;
        this.f27647j = false;
        this.f27648k = true;
        this.f27652o = 0;
        this.f27653p = false;
        this.f27651n = C5052d.m22594a(c5052d);
        this.f27644g[0] = null;
        this.c = 1;
    }

    public C7490k(C5052d c5052d, boolean z) {
        this(c5052d);
        this.f27653p = z;
    }

    /* renamed from: k */
    private C5052d m32539k() {
        C5052d b = C5052d.m22596b(this.f27651n);
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("Texture is out of date.");
    }

    /* renamed from: a */
    public final void m32544a(GL10 gl10) {
        if (gl10 != m32539k().f18683a) {
            throw new IllegalStateException("Attempted to bind texture into an OpenGL context other than the one it was created from.");
        } else if (this.f27644g[0] != 0) {
            gl10.glBindTexture(3553, this.f27644g[0]);
        }
    }

    /* renamed from: a */
    public final GL10 m32540a() {
        return m32539k().f18683a;
    }

    /* renamed from: a */
    public final void m32541a(Resources resources, int i) {
        Bitmap e = C7490k.m32538e(resources, i);
        m32543a(e, e.getWidth(), e.getHeight());
        if (this.f27653p == 0) {
            e.recycle();
        }
    }

    /* renamed from: b */
    public final void m32547b(Resources resources, int i) {
        resources = C7490k.m32538e(resources, i);
        m32536a(resources, resources.getWidth(), resources.getHeight(), false, true, false);
        if (this.f27653p == 0) {
            resources.recycle();
        }
    }

    /* renamed from: a */
    public final void m32542a(Bitmap bitmap) {
        Object obj;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (C7490k.m32537c(bitmap)) {
            obj = null;
        } else {
            bitmap = C7490k.m32535a(bitmap, Config.ARGB_8888, m32539k().m22623l());
            obj = 1;
        }
        m32536a(bitmap, width, height, false, false, true);
        if (obj != null && !this.f27653p) {
            bitmap.recycle();
        }
    }

    /* renamed from: b */
    public final void m32548b(Bitmap bitmap) {
        m32543a(bitmap, bitmap.getWidth(), bitmap.getHeight());
    }

    /* renamed from: a */
    public final void m32543a(Bitmap bitmap, int i, int i2) {
        Object obj;
        if (C7490k.m32537c(bitmap)) {
            obj = null;
        } else {
            bitmap = C7490k.m32535a(bitmap, Config.ARGB_8888, m32539k().m22623l());
            obj = 1;
        }
        m32536a(bitmap, i, i2, false, false, false);
        if (obj != null && this.f27653p == 0) {
            bitmap.recycle();
        }
    }

    /* renamed from: c */
    public final void m32551c(Resources resources, int i) {
        Object obj;
        Bitmap e = C7490k.m32538e(resources, i);
        int width = e.getWidth();
        int height = e.getHeight();
        if (C7490k.m32537c(e) == 0) {
            i = C7490k.m32535a(e, Config.ALPHA_8, m32539k().m22623l());
            obj = 1;
        } else {
            i = e;
            obj = null;
        }
        m32536a(i.extractAlpha(), width, height, true, false, false);
        if (!(obj == null || this.f27653p)) {
            i.recycle();
        }
        if (this.f27653p == 0) {
            e.recycle();
        }
    }

    /* renamed from: d */
    public final void m32554d(Resources resources, int i) {
        resources = C7490k.m32538e(resources, i);
        m32536a(resources, resources.getWidth(), resources.getHeight(), true, true, false);
        if (this.f27653p == 0) {
            resources.recycle();
        }
    }

    /* renamed from: a */
    public final void m32545a(boolean z) {
        this.f27645h = z;
    }

    /* renamed from: b */
    public final void m32549b(boolean z) {
        this.f27646i = z;
    }

    /* renamed from: c */
    public final void m32552c(boolean z) {
        this.f27647j = z;
    }

    /* renamed from: d */
    public final void m32555d(boolean z) {
        this.f27648k = z;
    }

    /* renamed from: b */
    public final float m32546b() {
        return this.f27649l;
    }

    /* renamed from: c */
    public final float m32550c() {
        return this.f27650m;
    }

    /* renamed from: d */
    public final int m32553d() {
        return this.f27643f;
    }

    /* renamed from: e */
    public final synchronized void m32556e() {
        this.c++;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: f */
    public final synchronized void m32557f() {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.c;	 Catch:{ all -> 0x0029 }
        if (r0 > 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r3);
        return;
    L_0x0007:
        r0 = r3.f27651n;	 Catch:{ all -> 0x0029 }
        r0 = com.google.android.m4b.maps.ca.C5052d.m22596b(r0);	 Catch:{ all -> 0x0029 }
        r1 = r3.c;	 Catch:{ all -> 0x0029 }
        r1 = r1 + -1;
        r3.c = r1;	 Catch:{ all -> 0x0029 }
        if (r1 != 0) goto L_0x0027;
    L_0x0015:
        r1 = r3.f27644g;	 Catch:{ all -> 0x0029 }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ all -> 0x0029 }
        if (r1 == 0) goto L_0x0027;
    L_0x001c:
        if (r0 == 0) goto L_0x0025;
    L_0x001e:
        r1 = r3.f27644g;	 Catch:{ all -> 0x0029 }
        r1 = r1[r2];	 Catch:{ all -> 0x0029 }
        r0.m22614c(r1);	 Catch:{ all -> 0x0029 }
    L_0x0025:
        r3.f27652o = r2;	 Catch:{ all -> 0x0029 }
    L_0x0027:
        monitor-exit(r3);
        return;
    L_0x0029:
        r0 = move-exception;
        monitor-exit(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.ca.k.f():void");
    }

    /* renamed from: g */
    public final int m32558g() {
        return this.c;
    }

    /* renamed from: e */
    private static Bitmap m32538e(Resources resources, int i) {
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Options options = new Options();
        options.inDensity = displayMetrics.densityDpi;
        options.inTargetDensity = displayMetrics.densityDpi;
        return BitmapFactory.decodeResource(resources, i, options);
    }

    /* renamed from: c */
    private static boolean m32537c(Bitmap bitmap) {
        int width = bitmap.getWidth();
        bitmap = bitmap.getHeight();
        return ((width & (width + -1)) == 0 && (bitmap & (bitmap - 1)) == null) ? true : null;
    }

    /* renamed from: a */
    private static Bitmap m32535a(Bitmap bitmap, Config config, C5055g c5055g) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int a = C7490k.m32534a(width, 1);
        int a2 = C7490k.m32534a(height, 1);
        config = c5055g.m22649a(a, a2, config);
        config.eraseColor(0);
        Canvas canvas = new Canvas(config);
        Paint paint = new Paint();
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        if (a > width) {
            canvas.drawBitmap(bitmap, new Rect(width - 1, 0, width, height), new Rect(width, 0, width + 1, height), paint);
        }
        if (a2 > height) {
            canvas.drawBitmap(bitmap, new Rect(0, height - 1, width, height), new Rect(0, height, width, height + 1), paint);
        }
        if (a > width && a2 > height) {
            canvas.drawBitmap(bitmap, new Rect(width - 1, height - 1, width, height), new Rect(width, height, width + 1, height + 1), paint);
        }
        return config;
    }

    /* renamed from: a */
    private synchronized void m32536a(Bitmap bitmap, int i, int i2, boolean z, boolean z2, boolean z3) {
        C7490k c7490k = this;
        Bitmap bitmap2 = bitmap;
        int i3 = i;
        int i4 = i2;
        synchronized (this) {
            if (z2 && z3) {
                try {
                    throw new IllegalArgumentException("Cannot have both isMipMap and autoGenerateMipMap be true.");
                } catch (Throwable th) {
                    Throwable th2 = th;
                }
            } else {
                int a;
                int a2;
                C5052d k = m32539k();
                GL10 gl10 = k.f18683a;
                int i5 = 0;
                Object obj = (z3 && k.f18684b) ? 1 : null;
                if (bitmap2 == null) {
                    c7490k.f27642e = i3;
                    c7490k.f27643f = i4;
                    a = C7490k.m32534a(i3, 1);
                    a2 = C7490k.m32534a(i4, 1);
                } else {
                    c7490k.f27642e = i3;
                    c7490k.f27643f = z2 ? i4 / 2 : i4;
                    a = bitmap.getWidth();
                    a2 = bitmap.getHeight();
                }
                int i6 = a;
                int i7 = a2;
                a = k.m22599C();
                if (i6 <= a) {
                    if (i7 <= a) {
                        c7490k.f27649l = ((float) i3) / ((float) i6);
                        c7490k.f27650m = ((float) i4) / ((float) i7);
                        if (c7490k.f27653p) {
                            a = 33071;
                            i3 = c7490k.f27645h ? 10497 : 33071;
                            if (c7490k.f27646i) {
                                a = 10497;
                            }
                            m29466b(i3, a);
                            if (c7490k.f27647j) {
                                if (!z2) {
                                    if (obj == null) {
                                        m29467c(9729, 9729);
                                    }
                                }
                                if (c7490k.f27648k) {
                                    m29467c(9987, 9729);
                                } else {
                                    m29467c(9985, 9729);
                                }
                            } else {
                                m29467c(9728, 9728);
                            }
                        } else {
                            if (c7490k.f27644g[0] == 0) {
                                gl10.glGenTextures(1, c7490k.f27644g, 0);
                            }
                            gl10.glBindTexture(3553, c7490k.f27644g[0]);
                            if (c7490k.f27645h) {
                                gl10.glTexParameterf(3553, 10242, 10497.0f);
                            } else {
                                gl10.glTexParameterf(3553, 10242, 33071.0f);
                            }
                            if (c7490k.f27646i) {
                                gl10.glTexParameterf(3553, 10243, 10497.0f);
                            } else {
                                gl10.glTexParameterf(3553, 10243, 33071.0f);
                            }
                            if (c7490k.f27647j) {
                                if (!z2) {
                                    if (obj == null) {
                                        gl10.glTexParameterf(3553, 10241, 9729.0f);
                                        gl10.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
                                    }
                                }
                                if (c7490k.f27648k) {
                                    gl10.glTexParameterf(3553, 10241, 9987.0f);
                                } else {
                                    gl10.glTexParameterf(3553, 10241, 9985.0f);
                                }
                                gl10.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
                            } else {
                                gl10.glTexParameterf(3553, 10241, 9728.0f);
                                gl10.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, 9728.0f);
                            }
                        }
                        if (bitmap2 != null) {
                            if (z2) {
                                int width = bitmap.getWidth();
                                int i8 = 0;
                                a2 = 0;
                                while (width > 0) {
                                    Bitmap a3;
                                    Canvas canvas = new Canvas();
                                    Rect rect = new Rect(i5, i8, width, width + i8);
                                    Rect rect2 = new Rect(i5, i5, width, width);
                                    if (z) {
                                        a3 = k.m22623l().m22649a(width, width, Config.ALPHA_8);
                                    } else {
                                        a3 = k.m22623l().m22649a(width, width, Config.ARGB_8888);
                                    }
                                    canvas.setBitmap(a3);
                                    canvas.drawBitmap(bitmap2, rect, rect2, null);
                                    if (c7490k.f27653p) {
                                        m29464a(new C5115k(a3), true);
                                        width = 0;
                                    } else {
                                        gl10.glTexParameterf(3553, 33169, 0.0f);
                                        i4 = a2 + 1;
                                        GLUtils.texImage2D(3553, a2, a3, 0);
                                        a3.recycle();
                                        a2 = i4;
                                    }
                                    i8 += width;
                                    width /= 2;
                                    i5 = 0;
                                }
                            } else if (obj != null) {
                                if (c7490k.f27653p) {
                                    m29464a(new C5115k(bitmap2), true);
                                } else {
                                    gl10.glTexParameterx(3553, 33169, 1);
                                    GLUtils.texImage2D(3553, 0, bitmap2, 0);
                                }
                            } else if (c7490k.f27653p) {
                                m29464a(new C5115k(bitmap2), false);
                            } else {
                                gl10.glTexParameterf(3553, 33169, 0.0f);
                                GLUtils.texImage2D(3553, 0, bitmap2, 0);
                            }
                            i3 = i7;
                            i4 = i6;
                        } else {
                            gl10.glFinish();
                            gl10.glTexParameterf(3553, 33169, 0.0f);
                            i3 = i7;
                            i4 = i6;
                            gl10.glCopyTexImage2D(3553, 0, 6407, 0, 0, i6, i3, 0);
                        }
                        if (bitmap2 == null) {
                            i6 = (i4 * i3) * 3;
                        } else {
                            i6 = bitmap.getRowBytes() * bitmap.getHeight();
                        }
                        c7490k.f27652o = i6;
                    }
                }
                i3 = i7;
                i4 = i6;
                StringBuilder stringBuilder = new StringBuilder(115);
                stringBuilder.append("Textures with dimensions");
                stringBuilder.append(i4);
                stringBuilder.append("x");
                stringBuilder.append(i3);
                stringBuilder.append(" are larger than  the maximum supported size ");
                stringBuilder.append(a);
                stringBuilder.append("x");
                stringBuilder.append(a);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: h */
    public final int m32559h() {
        return this.f27652o;
    }
}
