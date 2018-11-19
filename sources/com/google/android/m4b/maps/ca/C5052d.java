package com.google.android.m4b.maps.ca;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import android.util.Log;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bx.C6560n;
import com.google.android.m4b.maps.cb.C5064f;
import com.google.android.m4b.maps.cb.C5064f.C6578a;
import com.google.android.m4b.maps.cb.C5066j;
import com.google.android.m4b.maps.cb.C6579g;
import com.google.android.m4b.maps.cb.C6580k;
import com.google.android.m4b.maps.cb.C7492i.C8079a;
import com.google.android.m4b.maps.cb.C7493m.C8080a;
import com.google.android.m4b.maps.cf.C5111g;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;

/* renamed from: com.google.android.m4b.maps.ca.d */
public final class C5052d {
    /* renamed from: I */
    private static final AtomicLong f18671I = new AtomicLong(0);
    /* renamed from: K */
    private static final Map<Long, WeakReference<C5052d>> f18672K = ax.m20623b();
    /* renamed from: A */
    private boolean f18673A = true;
    /* renamed from: B */
    private final int f18674B;
    /* renamed from: C */
    private boolean f18675C = false;
    /* renamed from: D */
    private final int f18676D;
    /* renamed from: E */
    private final C5111g f18677E;
    /* renamed from: F */
    private final C5061n f18678F;
    /* renamed from: G */
    private final C5049a f18679G = new C5049a();
    /* renamed from: H */
    private final C5066j f18680H = new C5066j();
    /* renamed from: J */
    private final long f18681J = f18671I.getAndIncrement();
    /* renamed from: L */
    private C5058l f18682L;
    /* renamed from: a */
    final GL10 f18683a;
    /* renamed from: b */
    final boolean f18684b;
    /* renamed from: c */
    public final C6579g f18685c = new C8079a(new int[]{0, 0, 0, 65536, 65536, 0, 65536, 65536});
    /* renamed from: d */
    public final C5064f f18686d = new C6578a(new float[]{-1.0f, 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f}, 9);
    /* renamed from: e */
    public final C6580k f18687e = new C8080a(new int[]{0, 65536, 0, 0, 0, 0, 65536, 65536, 0, 65536, 0, 0});
    /* renamed from: f */
    public final C6580k f18688f = new C8080a(new int[]{0, 0, 65536, 0, 0, 0, 65536, 0, 65536, 65536, 0, 0});
    /* renamed from: g */
    public final C6580k f18689g = new C8080a(new int[]{-65536, 65536, 0, -65536, -65536, 0, 65536, 65536, 0, 65536, -65536, 0});
    /* renamed from: h */
    public final C6580k f18690h = new C8080a(new int[]{-65536, 0, 65536, -65536, 0, -65536, 65536, 0, 65536, 65536, 0, -65536});
    /* renamed from: i */
    public final C6580k f18691i = new C8080a(new int[]{0, 65536, 0, 0, 0, 0, 65536, 0, 0, 65536, 65536, 0});
    /* renamed from: j */
    public final float[] f18692j = new float[8];
    /* renamed from: k */
    public final float[] f18693k = new float[4];
    /* renamed from: l */
    public final af f18694l = new af();
    /* renamed from: m */
    public final af f18695m = new af();
    /* renamed from: n */
    private C6560n f18696n;
    /* renamed from: o */
    private final C5055g f18697o;
    /* renamed from: p */
    private final int[] f18698p;
    /* renamed from: q */
    private int f18699q;
    /* renamed from: r */
    private int f18700r;
    /* renamed from: s */
    private int[] f18701s;
    /* renamed from: t */
    private int f18702t;
    /* renamed from: u */
    private Integer f18703u;
    /* renamed from: v */
    private Integer f18704v;
    /* renamed from: w */
    private boolean f18705w;
    /* renamed from: x */
    private long f18706x;
    /* renamed from: y */
    private long f18707y;
    /* renamed from: z */
    private boolean f18708z = true;

    public C5052d(GL10 gl10, C5055g c5055g, C6560n c6560n, C5111g c5111g, Resources resources) {
        this.f18683a = gl10;
        this.f18696n = c6560n;
        this.f18697o = c5055g;
        this.f18677E = c5111g;
        this.f18678F = null;
        this.f18683a.glDisable(3024);
        this.f18683a.glEnable(2884);
        this.f18683a.glDisable(2929);
        this.f18683a.glDisable(2960);
        this.f18683a.glCullFace(1029);
        this.f18683a.glFrontFace(2305);
        this.f18683a.glShadeModel(7425);
        this.f18683a.glHint(3152, 4354);
        this.f18700r = 0;
        this.f18698p = new int[256];
        this.f18699q = 0;
        this.f18701s = new int[32];
        this.f18702t = 0;
        c5055g = ((gl10 instanceof GL11) == null || gl10.glGetString(7938).contains("1.1") == null) ? null : true;
        this.f18684b = c5055g;
        c5055g = new int[1];
        gl10.glGetIntegerv(3415, c5055g, 0);
        this.f18674B = c5055g[0];
        gl10.glGetIntegerv(3410, c5055g, 0);
        gl10.glGetIntegerv(3411, c5055g, 0);
        gl10.glGetIntegerv(3412, c5055g, 0);
        gl10.glGetIntegerv(3413, c5055g, 0);
        gl10.glGetIntegerv(3414, c5055g, 0);
        gl10.glGetIntegerv(3379, c5055g, 0);
        this.f18676D = c5055g[0];
        synchronized (f18672K) {
            f18672K.put(Long.valueOf(this.f18681J), new WeakReference(this));
        }
        if (resources != null) {
            this.f18682L = new C5058l(resources, this);
        }
    }

    /* renamed from: a */
    public final C5058l m22607a() {
        return this.f18682L;
    }

    /* renamed from: b */
    public final void m22611b() {
        this.f18705w = true;
    }

    /* renamed from: a */
    public final void m22608a(long j) {
        if (this.f18706x == 0) {
            this.f18706x = j;
        } else {
            this.f18706x = Math.min(this.f18706x, j);
        }
        this.f18696n.m29083a(this.f18706x);
    }

    /* renamed from: c */
    public final long m22613c() {
        if (this.f18706x == 0) {
            return -1;
        }
        return Math.max(0, this.f18706x - SystemClock.uptimeMillis());
    }

    /* renamed from: d */
    public final boolean m22615d() {
        return this.f18705w;
    }

    /* renamed from: e */
    public final long m22616e() {
        return this.f18707y;
    }

    /* renamed from: f */
    public final void m22617f() {
        this.f18696n.m29082a();
        this.f18707y = SystemClock.uptimeMillis();
        this.f18705w = false;
        if (this.f18706x != 0 && this.f18707y >= this.f18706x) {
            this.f18706x = 0;
        }
    }

    /* renamed from: g */
    public final void m22618g() {
        this.f18696n.m29087b();
    }

    /* renamed from: a */
    public final boolean m22610a(int i) {
        if (this.f18696n.m29086a(i) != 0) {
            return true;
        }
        this.f18705w = true;
        return false;
    }

    /* renamed from: b */
    public final void m22612b(int i) {
        this.f18696n.m29088b((int) ManagerWebServices.TIMEOUT_DEFAULT_MS);
    }

    /* renamed from: h */
    public final boolean m22619h() {
        return this.f18708z;
    }

    /* renamed from: i */
    public final void m22620i() {
        this.f18708z = false;
    }

    /* renamed from: j */
    public final boolean m22621j() {
        return this.f18673A;
    }

    /* renamed from: k */
    public final void m22622k() {
        this.f18673A = false;
    }

    /* renamed from: l */
    public final C5055g m22623l() {
        return this.f18697o;
    }

    /* renamed from: m */
    public final void m22624m() {
        if ((this.f18700r & 1) == 0) {
            this.f18683a.glEnableClientState(32884);
            m22595a(1, true);
        }
    }

    /* renamed from: n */
    public final void m22625n() {
        if ((this.f18700r & 8) == 0) {
            this.f18683a.glEnableClientState(32886);
            m22595a(8, true);
        }
    }

    /* renamed from: o */
    public final void m22626o() {
        if ((this.f18700r & 8) != 0) {
            this.f18683a.glDisableClientState(32886);
            m22595a(8, false);
        }
    }

    /* renamed from: p */
    public final void m22627p() {
        if ((this.f18700r & 2) == 0) {
            this.f18683a.glEnable(3553);
            this.f18683a.glEnableClientState(32888);
            m22595a(2, true);
        }
    }

    /* renamed from: q */
    public final void m22628q() {
        if ((this.f18700r & 2) != 0) {
            this.f18683a.glDisable(3553);
            this.f18683a.glDisableClientState(32888);
            m22595a(2, false);
        }
    }

    /* renamed from: r */
    public final void m22629r() {
        if ((this.f18700r & 4) == 0) {
            this.f18683a.glEnable(3042);
            m22595a(4, true);
        }
    }

    /* renamed from: s */
    public final void m22630s() {
        if ((this.f18700r & 16) == 0) {
            this.f18683a.glEnable(3024);
            m22595a(16, true);
        }
    }

    /* renamed from: t */
    public final void m22631t() {
        if ((this.f18700r & 32) == 0) {
            this.f18708z = true;
            this.f18683a.glEnable(2929);
            m22595a(32, true);
        }
    }

    /* renamed from: u */
    public final void m22632u() {
        if ((this.f18700r & 64) == 0) {
            this.f18683a.glEnable(32823);
            m22595a(64, true);
        }
    }

    /* renamed from: v */
    public final void m22633v() {
        if ((this.f18700r & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            this.f18673A = true;
            this.f18683a.glEnable(2960);
            m22595a(ProfileEditingConfig.DEFAULT_MAX_LENGTH, true);
        }
    }

    /* renamed from: w */
    public final void m22634w() {
        if ((this.f18700r & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
            this.f18683a.glDisable(2960);
            m22595a(ProfileEditingConfig.DEFAULT_MAX_LENGTH, false);
        }
    }

    /* renamed from: x */
    public final GL10 m22635x() {
        return this.f18683a;
    }

    /* renamed from: y */
    public final C6560n m22636y() {
        return this.f18696n;
    }

    /* renamed from: z */
    public final void m22637z() {
        int[] iArr = this.f18698p;
        int i = this.f18699q;
        this.f18699q = i + 1;
        iArr[i] = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    /* renamed from: A */
    public final void m22597A() {
        while (true) {
            int i = 1;
            int i2 = this.f18699q - 1;
            this.f18699q = i2;
            if (i2 >= 0 && this.f18698p[this.f18699q] != Integer.MAX_VALUE) {
                if ((this.f18698p[this.f18699q] & 1073741824) == 0) {
                    i = 0;
                }
                i2 = this.f18698p[this.f18699q] & 1073741823;
                if (i2 != 4) {
                    if (i2 != 8) {
                        if (i2 != 16) {
                            if (i2 != 32) {
                                if (i2 != 64) {
                                    if (i2 != ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                                        switch (i2) {
                                            case 1:
                                                if (i == 0) {
                                                    this.f18683a.glDisableClientState(32884);
                                                    break;
                                                } else {
                                                    this.f18683a.glEnableClientState(32884);
                                                    break;
                                                }
                                            case 2:
                                                if (i == 0) {
                                                    this.f18683a.glDisable(3553);
                                                    this.f18683a.glDisableClientState(32888);
                                                    break;
                                                }
                                                this.f18683a.glEnable(3553);
                                                this.f18683a.glEnableClientState(32888);
                                                break;
                                            default:
                                                if (C4728u.m21050a("GLState", 6)) {
                                                    StringBuilder stringBuilder = new StringBuilder(38);
                                                    stringBuilder.append("Unknown graphics state op: ");
                                                    stringBuilder.append(i2);
                                                    Log.e("GLState", stringBuilder.toString());
                                                    break;
                                                }
                                                break;
                                        }
                                    } else if (i != 0) {
                                        this.f18683a.glEnable(2960);
                                    } else {
                                        this.f18683a.glDisable(2960);
                                    }
                                } else if (i != 0) {
                                    this.f18683a.glEnable(32823);
                                } else {
                                    this.f18683a.glDisable(32823);
                                }
                            } else if (i != 0) {
                                this.f18683a.glEnable(2929);
                            } else {
                                this.f18683a.glDisable(2929);
                            }
                        } else if (i != 0) {
                            this.f18683a.glEnable(3024);
                        } else {
                            this.f18683a.glDisable(3024);
                        }
                    } else if (i != 0) {
                        this.f18683a.glEnableClientState(32886);
                    } else {
                        this.f18683a.glDisableClientState(32886);
                    }
                } else if (i != 0) {
                    this.f18683a.glEnable(3042);
                } else {
                    this.f18683a.glDisable(3042);
                }
                if (i != 0) {
                    this.f18700r = i2 | this.f18700r;
                } else {
                    this.f18700r = (i2 ^ -1) & this.f18700r;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m22595a(int i, boolean z) {
        if (z) {
            this.f18700r |= i;
            z = this.f18698p;
            int i2 = this.f18699q;
            this.f18699q = i2 + 1;
            z[i2] = i;
            return;
        }
        this.f18700r &= i ^ -1;
        z = this.f18698p;
        i2 = this.f18699q;
        this.f18699q = i2 + 1;
        z[i2] = i | 1073741824;
    }

    /* renamed from: c */
    public final synchronized void m22614c(int i) {
        if (this.f18702t == this.f18701s.length) {
            Object obj = new int[(this.f18701s.length * 2)];
            System.arraycopy(this.f18701s, 0, obj, 0, this.f18701s.length);
            this.f18701s = obj;
        }
        int[] iArr = this.f18701s;
        int i2 = this.f18702t;
        this.f18702t = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: B */
    public final synchronized void m22598B() {
        if (this.f18702t > 0) {
            this.f18683a.glDeleteTextures(this.f18702t, this.f18701s, 0);
            this.f18702t = 0;
        }
    }

    /* renamed from: C */
    public final int m22599C() {
        if (this.f18703u == null) {
            int[] iArr = new int[1];
            this.f18683a.glGetIntegerv(3379, iArr, 0);
            this.f18703u = Integer.valueOf(iArr[0]);
        }
        return this.f18703u.intValue();
    }

    /* renamed from: D */
    public final int m22600D() {
        if (this.f18704v == null) {
            int[] iArr = new int[2];
            this.f18683a.glGetIntegerv(33902, iArr, 0);
            this.f18704v = Integer.valueOf(iArr[1]);
        }
        return this.f18704v.intValue();
    }

    /* renamed from: E */
    public final C5049a m22601E() {
        return this.f18679G;
    }

    /* renamed from: F */
    public final boolean m22602F() {
        return this.f18684b;
    }

    /* renamed from: G */
    public final int m22603G() {
        return this.f18674B;
    }

    /* renamed from: a */
    public final void m22609a(boolean z) {
        this.f18675C = z;
    }

    /* renamed from: H */
    public final boolean m22604H() {
        return this.f18675C;
    }

    /* renamed from: I */
    public final int m22605I() {
        return this.f18676D;
    }

    /* renamed from: J */
    public final C5066j m22606J() {
        return this.f18680H;
    }

    /* renamed from: a */
    public static long m22594a(C5052d c5052d) {
        return c5052d == null ? -1 : c5052d.f18681J;
    }

    /* renamed from: b */
    public static C5052d m22596b(long j) {
        C5052d c5052d;
        synchronized (f18672K) {
            WeakReference weakReference = (WeakReference) f18672K.get(Long.valueOf(j));
            c5052d = null;
            if (weakReference != null) {
                c5052d = (C5052d) weakReference.get();
                if (c5052d == null) {
                    f18672K.remove(Long.valueOf(j));
                }
            }
        }
        return c5052d;
    }
}
