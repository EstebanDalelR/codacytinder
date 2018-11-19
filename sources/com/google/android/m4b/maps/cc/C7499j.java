package com.google.android.m4b.maps.cc;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ax.C4699a;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.bo.C4848k;
import com.google.android.m4b.maps.bo.C6527u;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.aj;
import com.google.android.m4b.maps.bo.al;
import com.google.android.m4b.maps.bo.as;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bo.C4843b;
import com.google.android.m4b.maps.bx.C5009j;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.ca.C5054e;
import com.google.android.m4b.maps.ca.C7490k;
import com.google.android.m4b.maps.cb.C5063d;
import com.google.android.m4b.maps.cb.C5067l;
import com.google.android.m4b.maps.cb.C6577c;
import com.google.android.m4b.maps.cb.C6579g;
import com.google.android.m4b.maps.cb.C6580k;
import com.google.android.m4b.maps.cb.C7491e;
import com.google.android.m4b.maps.cb.C7492i;
import com.google.android.m4b.maps.cb.C7493m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.google.android.m4b.maps.cc.j */
public final class C7499j extends C6581d {
    /* renamed from: b */
    private static float f27716b = 1.0f;
    /* renamed from: p */
    private static final Map<C5052d, Map<C5083e, C7490k>> f27717p = new WeakHashMap();
    /* renamed from: c */
    private final ba f27718c;
    /* renamed from: d */
    private final List<C5081c> f27719d;
    /* renamed from: e */
    private final C6580k f27720e;
    /* renamed from: f */
    private final C6577c f27721f;
    /* renamed from: g */
    private final C6579g f27722g;
    /* renamed from: h */
    private C7490k f27723h;
    /* renamed from: i */
    private final int f27724i;
    /* renamed from: j */
    private final int f27725j;
    /* renamed from: k */
    private final boolean f27726k;
    /* renamed from: l */
    private final float f27727l;
    /* renamed from: m */
    private int f27728m;
    /* renamed from: n */
    private C4699a f27729n;
    /* renamed from: o */
    private final C5083e f27730o;

    /* renamed from: com.google.android.m4b.maps.cc.j$a */
    public static class C5079a {
        /* renamed from: a */
        private ArrayList<C5081c> f18812a = new ArrayList();
        /* renamed from: b */
        private final ba f18813b;
        /* renamed from: c */
        private final String[] f18814c;

        public C5079a(ba baVar, String[] strArr) {
            this.f18813b = baVar;
            this.f18814c = strArr;
        }

        /* renamed from: a */
        public final void m22727a(C4843b c4843b) {
            C5081c c5081c = null;
            while (c4843b.hasNext()) {
                C4848k a = c4843b.mo5104a();
                if (a instanceof C6527u) {
                    C6527u c6527u = (C6527u) a;
                    if (c5081c == null || !c5081c.f18817a.equals(c6527u.m28772b())) {
                        c5081c = new C5081c(c6527u, this.f18814c);
                        this.f18812a.add(c5081c);
                    } else {
                        c5081c.m22733a(c6527u);
                    }
                    c4843b.next();
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        public final void m22728a(C4848k c4848k) {
            this.f18812a.add(new C5081c((C6527u) c4848k, this.f18814c));
        }

        /* renamed from: a */
        public final C7499j[] m22729a(int i) {
            C5080b c5080b;
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f18812a.iterator();
            ArrayList arrayList2 = new ArrayList();
            C5080b c5080b2 = new C5080b();
            HashSet hashSet = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            C5080b c5080b3 = new C5080b();
            List list = arrayList2;
            Set set = hashSet;
            List list2 = arrayList3;
            Set hashSet2 = new HashSet();
            Object obj = null;
            while (it.hasNext()) {
                C5081c c5081c = (C5081c) it.next();
                if (c5081c.m22735c() != null) {
                    C5080b c5080b4 = new C5080b();
                    C7499j.m32672a(c5081c.m22732a(), c5080b4);
                    arrayList.add(new C7499j(r0.f18813b, c5080b4, ae.m27680a((Object) c5081c), c5081c.m22734b()));
                } else {
                    Object obj2 = 1;
                    if (c5081c.m22737e() > 1) {
                        C5083e c5083e = new C5083e(c5081c);
                        if (obj == null || c5083e.equals(obj)) {
                            obj2 = null;
                        }
                        if (!(C7499j.m32672a(c5081c.m22732a(), c5080b3) && r5 == null)) {
                            arrayList.add(new C7499j(r0.f18813b, c5080b3, list2, hashSet2));
                            arrayList2 = new ArrayList();
                            c5080b3.m22730a();
                            C7499j.m32672a(c5081c.m22732a(), c5080b3);
                            hashSet2 = new HashSet();
                            list2 = arrayList2;
                        }
                        list2.add(c5081c);
                        hashSet2.addAll(c5081c.m22734b());
                        obj = c5083e;
                    } else {
                        C5081c c5081c2;
                        if (C7499j.m32672a(c5081c.m22732a(), c5080b2)) {
                            c5081c2 = c5081c;
                            c5080b = c5080b3;
                        } else {
                            c5081c2 = c5081c;
                            c5080b = c5080b3;
                            arrayList.add(new C7499j(r0.f18813b, c5080b2, list, set));
                            ArrayList arrayList4 = new ArrayList();
                            c5080b2.m22730a();
                            C7499j.m32672a(c5081c2.m22732a(), c5080b2);
                            set = new HashSet();
                            list = arrayList4;
                        }
                        list.add(c5081c2);
                        set.addAll(c5081c2.m22734b());
                        c5080b3 = c5080b;
                    }
                }
            }
            c5080b = c5080b3;
            if (!list.isEmpty()) {
                arrayList.add(new C7499j(r0.f18813b, c5080b2, list, set));
            }
            if (!list2.isEmpty()) {
                arrayList.add(new C7499j(r0.f18813b, c5080b, list2, hashSet2));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return (C7499j[]) arrayList.toArray(new C7499j[arrayList.size()]);
        }
    }

    /* renamed from: com.google.android.m4b.maps.cc.j$b */
    static class C5080b {
        /* renamed from: a */
        int f18815a;
        /* renamed from: b */
        int f18816b;

        C5080b() {
        }

        /* renamed from: a */
        public final void m22730a() {
            this.f18816b = 0;
            this.f18815a = 0;
        }
    }

    /* renamed from: com.google.android.m4b.maps.cc.j$c */
    public static class C5081c {
        /* renamed from: a */
        private final aj f18817a;
        /* renamed from: b */
        private final ArrayList<C5082d> f18818b;
        /* renamed from: c */
        private final ArrayList<C5082d> f18819c;
        /* renamed from: d */
        private final HashSet<String> f18820d;
        /* renamed from: e */
        private final String[] f18821e;
        /* renamed from: f */
        private C4699a f18822f;

        public C5081c(C6527u c6527u, String[] strArr) {
            this.f18818b = new ArrayList(2);
            this.f18819c = new ArrayList(2);
            this.f18820d = new HashSet();
            this.f18817a = c6527u.m28772b();
            this.f18821e = strArr;
            m22733a(c6527u);
        }

        private C5081c() {
            this.f18818b = new ArrayList(2);
            this.f18819c = new ArrayList(2);
            this.f18820d = new HashSet();
            this.f18817a = null;
            this.f18821e = null;
        }

        /* renamed from: a */
        public final void m22733a(C6527u c6527u) {
            for (int i : c6527u.mo5111l()) {
                if (i >= 0 && i < this.f18821e.length) {
                    this.f18820d.add(this.f18821e[i]);
                }
            }
            as e = c6527u.mo5108e();
            float d = c6527u.m28774d();
            if (e.m21557b() == 1) {
                this.f18819c.add(new C5082d(d, e, 0));
            } else if (e.m21557b() > 1) {
                this.f18818b.add(new C5082d(d, e, 0));
                this.f18819c.add(new C5082d(d, e, 1));
            }
            if (c6527u.m28776f()) {
                this.f18822f = c6527u.mo5107a();
            }
        }

        /* renamed from: a */
        public final aj m22732a() {
            return this.f18817a;
        }

        /* renamed from: b */
        public final Set<String> m22734b() {
            return this.f18820d;
        }

        /* renamed from: c */
        public final C4699a m22735c() {
            return this.f18822f;
        }

        /* renamed from: d */
        public final float m22736d() {
            Iterator it = this.f18818b.iterator();
            float f = 0.0f;
            while (it.hasNext()) {
                C5082d c5082d = (C5082d) it.next();
                float abs = Math.abs(c5082d.f18823a) + (c5082d.f18824b / 2.0f);
                if (abs > f) {
                    f = abs;
                }
            }
            it = this.f18819c.iterator();
            while (it.hasNext()) {
                c5082d = (C5082d) it.next();
                abs = Math.abs(c5082d.f18823a) + (c5082d.f18824b / 2.0f);
                if (abs > f) {
                    f = abs;
                }
            }
            return f * 2.0f;
        }

        /* renamed from: e */
        public final int m22737e() {
            int size = this.f18818b.size() + this.f18819c.size();
            int i = 1;
            if (size == 0) {
                return 1;
            }
            int i2;
            int[] iArr = new int[size];
            for (i2 = 0; i2 < size; i2++) {
                C5082d c5082d;
                int i3;
                if (i2 < this.f18818b.size()) {
                    c5082d = (C5082d) this.f18818b.get(i2);
                } else {
                    c5082d = (C5082d) this.f18819c.get(i2 - this.f18818b.size());
                }
                if (c5082d.f18826d == null) {
                    i3 = 1;
                } else {
                    int i4 = 0;
                    for (int i5 : c5082d.f18826d) {
                        i4 += i5;
                    }
                    i3 = c5082d.f18826d.length % 2 == 1 ? i4 * 2 : i4;
                }
                iArr[i2] = i3;
            }
            int i6 = iArr[0];
            while (i < size) {
                i2 = iArr[i];
                i3 = i6 * i2;
                if (i6 > 0) {
                    if (i2 > 0) {
                        while (true) {
                            int i7 = i2;
                            i2 = i6;
                            i6 = i7;
                            if (i6 == 0) {
                                break;
                            }
                            i2 %= i6;
                        }
                        i6 = i3 / i2;
                        i++;
                    }
                }
                throw new IllegalArgumentException("Greatest common divisor should be computed on numbers greater than zero.");
            }
            return i6;
        }

        /* renamed from: f */
        public final ArrayList<C5082d> m22738f() {
            return this.f18818b;
        }

        /* renamed from: g */
        public final ArrayList<C5082d> m22739g() {
            return this.f18819c;
        }

        /* renamed from: h */
        public final int m22740h() {
            int i = 208;
            if (this.f18817a != null) {
                i = 208 + this.f18817a.m21540i();
            }
            return i + ((this.f18818b.size() + this.f18819c.size()) * 24);
        }
    }

    /* renamed from: com.google.android.m4b.maps.cc.j$d */
    static class C5082d {
        /* renamed from: a */
        final float f18823a;
        /* renamed from: b */
        final float f18824b;
        /* renamed from: c */
        final int f18825c;
        /* renamed from: d */
        final int[] f18826d;
        /* renamed from: e */
        private final int f18827e;

        public C5082d(float f, as asVar, int i) {
            this.f18823a = f;
            this.f18824b = asVar.m21558b(i).m21547c();
            this.f18825c = asVar.m21558b(i).m21546b();
            if (asVar.m21560d() == null) {
                this.f18826d = null;
            } else if (asVar.m21557b() > i) {
                f = asVar.m21558b(i).m21548d();
                if (f.length == null) {
                    f = 0.0f;
                }
                this.f18826d = f;
            } else {
                if (C4728u.m21050a("GLLineGroup", 6) != null) {
                    asVar = asVar.m21557b();
                    StringBuilder stringBuilder = new StringBuilder(67);
                    stringBuilder.append("Invalid stroke index : ");
                    stringBuilder.append(i);
                    stringBuilder.append("  available strokes : ");
                    stringBuilder.append(asVar);
                    Log.e("GLLineGroup", stringBuilder.toString());
                }
                this.f18826d = null;
            }
            this.f18827e = (((((Float.floatToIntBits(this.f18823a) * 31) + Float.floatToIntBits(this.f18824b)) * 31) + this.f18825c) * 31) + (this.f18826d != null ? Arrays.hashCode(this.f18826d) : null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    C5082d c5082d = (C5082d) obj;
                    return this.f18825c == c5082d.f18825c && Float.compare(c5082d.f18823a, this.f18823a) == 0 && Float.compare(c5082d.f18824b, this.f18824b) == 0 && Arrays.equals(this.f18826d, c5082d.f18826d) != null;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f18827e;
        }

        public final String toString() {
            int i = this.f18825c;
            float f = this.f18824b;
            float f2 = this.f18823a;
            String valueOf = String.valueOf(Arrays.toString(this.f18826d));
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 52);
            stringBuilder.append("c:");
            stringBuilder.append(i);
            stringBuilder.append(" w:");
            stringBuilder.append(f);
            stringBuilder.append(" s:");
            stringBuilder.append(f2);
            stringBuilder.append(" d:");
            stringBuilder.append(valueOf);
            return stringBuilder.toString();
        }
    }

    /* renamed from: com.google.android.m4b.maps.cc.j$e */
    static class C5083e {
        /* renamed from: a */
        private final List<C5082d> f18828a;
        /* renamed from: b */
        private final List<C5082d> f18829b;
        /* renamed from: c */
        private final int f18830c;
        /* renamed from: d */
        private final float f18831d;
        /* renamed from: e */
        private final int f18832e;

        public C5083e(List<C5081c> list, float f, int i, boolean z) {
            this.f18828a = new ArrayList();
            this.f18829b = new ArrayList();
            this.f18831d = f;
            this.f18830c = i;
            if (z) {
                C5081c c5081c = (C5081c) list.get(0.0f);
                this.f18829b.addAll(c5081c.m22738f());
                this.f18828a.addAll(c5081c.m22739g());
            } else {
                for (C5081c c5081c2 : list) {
                    this.f18829b.addAll(c5081c2.m22738f());
                    this.f18828a.addAll(c5081c2.m22739g());
                }
            }
            this.f18832e = m22741a();
        }

        public C5083e(C5081c c5081c) {
            this.f18828a = new ArrayList();
            this.f18829b = new ArrayList();
            this.f18831d = 0.0f;
            this.f18830c = 0;
            this.f18829b.addAll(c5081c.m22738f());
            this.f18828a.addAll(c5081c.m22739g());
            this.f18832e = m22741a();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    C5083e c5083e = (C5083e) obj;
                    return Float.compare(c5083e.f18831d, this.f18831d) == 0 && this.f18830c == c5083e.f18830c && this.f18828a.equals(c5083e.f18828a) && this.f18829b.equals(c5083e.f18829b) != null;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f18832e;
        }

        /* renamed from: a */
        private int m22741a() {
            return (((((this.f18828a.hashCode() * 31) + this.f18829b.hashCode()) * 31) + this.f18830c) * 31) + Float.floatToIntBits(this.f18831d);
        }
    }

    /* renamed from: a */
    private static synchronized C7490k m32667a(C5052d c5052d, C5083e c5083e) {
        synchronized (C7499j.class) {
            Map map = (Map) f27717p.get(c5052d);
            if (map == null) {
                return null;
            }
            C7490k c7490k = (C7490k) map.get(c5083e);
            return c7490k;
        }
    }

    /* renamed from: a */
    private static synchronized void m32670a(C5052d c5052d, C5083e c5083e, C7490k c7490k) {
        synchronized (C7499j.class) {
            Map map = (Map) f27717p.get(c5052d);
            if (map == null) {
                map = ax.m20623b();
                f27717p.put(c5052d, map);
            }
            map.put(c5083e, c7490k);
        }
    }

    /* renamed from: b */
    private static synchronized void m32673b(C5052d c5052d, C5083e c5083e) {
        synchronized (C7499j.class) {
            Map map = (Map) f27717p.get(c5052d);
            if (map != null) {
                map.remove(c5083e);
            }
        }
    }

    private C7499j(ba baVar, C5080b c5080b, List list, Set set) {
        int i;
        C5080b c5080b2 = c5080b;
        List list2 = list;
        super(set);
        this.f27718c = baVar;
        this.f27720e = new C7493m(c5080b2.f18815a, true);
        this.f27721f = new C7491e(c5080b2.f18816b, true);
        this.f27722g = new C7492i(c5080b2.f18815a, true);
        this.f27719d = list2;
        int e = ((C5081c) this.f27719d.get(0)).m22737e();
        r0.f27726k = e > 1;
        int i2 = 2;
        float f = 1.0f;
        if (r0.f27726k) {
            e = ((int) Math.ceil((double) (e / 16))) * 2;
            f = Math.max(1.0f, ((C5081c) r0.f27719d.get(0)).m22736d());
            i = e + 0;
        } else {
            i = 0;
            for (C5081c c5081c : r0.f27719d) {
                C5081c c5081c2;
                int e2 = c5081c2.m22737e();
                f = Math.max(f, c5081c2.m22736d());
                i += e2;
            }
        }
        e = 0;
        while ((1 << e) < i) {
            e++;
        }
        r0.f27724i = e;
        float ceil = ((float) Math.ceil((double) (f * f27716b))) + 2.0f;
        r0.f27725j = C7490k.m32534a((int) ceil, 8);
        r0.f27727l = ((float) r0.f27725j) / ceil;
        r0.f27730o = new C5083e(r0.f27719d, r0.f27727l, r0.f27724i, r0.f27726k);
        ceil = ((ceil * ((float) baVar.m21626i().m32215f())) / 256.0f) * 0.5f;
        C5054e a = C5054e.m22640a();
        int i3 = 0;
        while (i3 < list.size()) {
            int i4;
            al i5 = baVar.m21626i();
            c5081c2 = (C5081c) list2.get(i3);
            aj a2 = c5081c2.m22732a();
            int b = a2.m21528b();
            if (b >= i2) {
                r0.f27729n = c5081c2.m22735c();
                af c = i5.m32212c();
                int f2 = i5.m32215f();
                if (r0.f27726k) {
                    i4 = i3;
                    a.m22647a(a2, ceil, true, c, f2, 2048.0f / ((float) c5081c2.m22737e()), r0.f27720e, (C5063d) r0.f27721f, r0.f27722g);
                } else {
                    i2 = b;
                    i4 = i3;
                    a.m22647a(a2, ceil, true, c, f2, 1.0f, (C5067l) r0.f27720e, (C5063d) r0.f27721f, null);
                    C5054e.m22641a(i2, true, r0.f27724i, new int[]{i4}, r0.f27722g);
                }
            } else {
                i4 = i3;
            }
            i3 = i4 + 1;
            i2 = 2;
        }
    }

    /* renamed from: a */
    public static void m32669a(C5052d c5052d) {
        GL10 x = c5052d.m22635x();
        c5052d.m22627p();
        x.glBlendFunc(1, 771);
        x.glTexEnvx(8960, 8704, 8448);
        c5052d.m22635x().glColor4x(65536, 65536, 65536, 65536);
    }

    /* renamed from: a */
    public final void mo5222a(C5052d c5052d, C6570b c6570b, C5009j c5009j) {
        C7499j c7499j = this;
        C5052d c5052d2 = c5052d;
        if (!c5009j.m22389c().m22302c()) {
            return;
        }
        if (c7499j.f27729n == null || c5009j.m22389c().m22300b(c7499j.f27729n) != null) {
            int i = 0;
            int max = Math.max(0, Math.round((c6570b.m29256l() - ((float) c7499j.f27718c.m21619b())) / 0.5f));
            if (c7499j.f27723h == null) {
                c7499j.f27723h = C7499j.m32667a(c5052d2, c7499j.f27730o);
                if (c7499j.f27723h == null) {
                    int i2;
                    Bitmap createBitmap = Bitmap.createBitmap(c7499j.f27725j, 1 << c7499j.f27724i, Config.ARGB_4444);
                    createBitmap.eraseColor(0);
                    List list = c7499j.f27719d;
                    float f = c7499j.f27727l;
                    boolean z = c7499j.f27726k;
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint();
                    paint.setStrokeWidth(1.0f);
                    paint.setAntiAlias(true);
                    float width = ((float) createBitmap.getWidth()) * 0.5f;
                    if (z) {
                        i2 = 1;
                    } else {
                        i2 = list.size();
                    }
                    while (i < i2) {
                        C5081c c5081c = (C5081c) list.get(i);
                        int e = c5081c.m22737e();
                        float f2 = (float) i;
                        ArrayList f3 = c5081c.m22738f();
                        float f4 = f2;
                        Canvas canvas2 = canvas;
                        C5081c c5081c2 = c5081c;
                        Paint paint2 = paint;
                        int i3 = i2;
                        float f5 = width;
                        Paint paint3 = paint;
                        float f6 = f4;
                        Canvas canvas3 = canvas;
                        float f7 = f;
                        float f8 = f;
                        int i4 = e;
                        C7499j.m32671a(f3, canvas2, paint2, f5, f6, f7, i4);
                        C7499j.m32671a(c5081c2.m22739g(), canvas3, paint3, f5, f6, f8, i4);
                        i++;
                        i2 = i3;
                        paint = paint3;
                        canvas = canvas3;
                        f = f8;
                    }
                    c7499j.f27723h = new C7490k(c5052d2);
                    C7499j.m32670a(c5052d2, c7499j.f27730o, c7499j.f27723h);
                    c7499j.f27723h.m32552c(true);
                    c7499j.f27723h.m32549b(true);
                    c7499j.f27723h.m32548b(createBitmap);
                    createBitmap.recycle();
                } else {
                    c7499j.f27723h.m32556e();
                }
            }
            c7499j.f27728m = max;
            if (max != 0) {
                c5052d.m22635x().glMatrixMode(5890);
                c5052d.m22635x().glLoadIdentity();
                c5052d.m22635x().glTranslatef(0.5f, 0.5f, 0.0f);
                GL10 x = c5052d.m22635x();
                float f9 = 1.0f;
                float f10 = ((float) max) + 1.0f;
                if (c7499j.f27726k) {
                    f9 = f10;
                }
                x.glScalef(f10, f9, 0.0f);
                c5052d.m22635x().glTranslatef(-0.5f, -0.5f, 0.0f);
                c5052d.m22635x().glMatrixMode(5888);
            }
            c7499j.f27723h.m32544a(c5052d.m22635x());
            c7499j.f27720e.mo7123d(c5052d2);
            c7499j.f27722g.mo7118d(c5052d2);
            c7499j.f27721f.mo7110a(c5052d2, 4);
            if (max != 0) {
                c5052d.m22635x().glMatrixMode(5890);
                c5052d.m22635x().glLoadIdentity();
                c5052d.m22635x().glMatrixMode(5888);
            }
        }
    }

    /* renamed from: d */
    private void m32674d(C5052d c5052d) {
        if (this.f27723h != null) {
            this.f27723h.m32557f();
            if (this.f27723h.m32558g() == 0) {
                C7499j.m32673b(c5052d, this.f27730o);
            }
            this.f27723h = null;
        }
    }

    /* renamed from: b */
    public final void mo5223b(C5052d c5052d) {
        m32674d(c5052d);
        this.f27720e.mo7121b(c5052d);
        this.f27721f.mo7111b(c5052d);
        this.f27722g.mo7116b(c5052d);
    }

    /* renamed from: c */
    public final void mo5224c(C5052d c5052d) {
        m32674d(c5052d);
        this.f27720e.m29354c(c5052d);
        this.f27721f.m29319c(c5052d);
        this.f27722g.m29340c(c5052d);
    }

    /* renamed from: a */
    private static void m32671a(ArrayList<C5082d> arrayList, Canvas canvas, Paint paint, float f, float f2, float f3, int i) {
        int i2 = i;
        float height = (((float) canvas.getHeight()) / ((float) i2)) * 16.0f;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C5082d c5082d = (C5082d) arrayList.get(i3);
            float f4 = f + (c5082d.f18823a * f3);
            float f5 = (c5082d.f18824b * f3) * 0.5f;
            paint.setColor(c5082d.f18825c);
            int[] iArr = c5082d.f18826d;
            if (iArr != null) {
                float f6 = f2;
                int i4 = 0;
                int i5 = 1;
                while (i4 < i2) {
                    int i6 = i5;
                    float f7 = f6;
                    int i7 = i4;
                    i4 = 0;
                    while (i4 <= iArr.length % 2) {
                        int length = iArr.length;
                        int i8 = i7;
                        float f8 = f7;
                        int i9 = i6;
                        i7 = 0;
                        while (i7 < length) {
                            int i10;
                            int i11;
                            i6 = iArr[i7];
                            float f9 = f8 + ((((float) i6) / 16.0f) * height);
                            if (i9 != 0) {
                                i10 = i6;
                                i11 = length;
                                canvas.drawRect(f4 - f5, f8, f4 + f5, f9, paint);
                            } else {
                                i10 = i6;
                                i11 = length;
                            }
                            i9 ^= 1;
                            i8 += i10;
                            i7++;
                            f8 = f9;
                            length = i11;
                        }
                        i4++;
                        f7 = f8;
                        i6 = i9;
                        i7 = i8;
                    }
                    i4 = i7;
                    f6 = f7;
                    i5 = i6;
                }
            } else if (i2 == 1) {
                float f10 = f2 + 0.5f;
                canvas.drawLine(f4 - f5, f10, f4 + f5, f10, paint);
            } else {
                canvas.drawRect(f4 - f5, 0.0f, f4 + f5, (float) canvas.getHeight(), paint);
            }
        }
    }

    /* renamed from: a */
    static boolean m32672a(aj ajVar, C5080b c5080b) {
        int b = ajVar.m21528b() - 1;
        if (b <= 0) {
            return true;
        }
        int i = b * 5;
        if (c5080b.f18815a > 0 && c5080b.f18815a + i > 16384) {
            return false;
        }
        c5080b.f18815a += i;
        i = c5080b.f18816b;
        int i2 = 3;
        b = ((b * 3) - 1) * 3;
        if (ajVar.m21536e() == null) {
            i2 = 0;
        }
        c5080b.f18816b = i + (b + i2);
        return true;
    }

    /* renamed from: a */
    public static void m32668a(float f) {
        f27716b = f;
    }

    /* renamed from: a */
    public final int mo7125a() {
        int c = (this.f27720e.m29353c() + this.f27721f.m29318c()) + this.f27722g.m29336b();
        return this.f27723h != null ? c + this.f27723h.m32559h() : c;
    }

    /* renamed from: b */
    public final int mo7126b() {
        int i = 608;
        for (C5081c h : this.f27719d) {
            i += h.m22740h();
        }
        return i + ((this.f27720e.mo7122d() + this.f27721f.mo7112d()) + this.f27722g.mo7117c());
    }
}
