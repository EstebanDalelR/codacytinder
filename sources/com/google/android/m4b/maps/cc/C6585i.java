package com.google.android.m4b.maps.cc;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import com.google.android.m4b.maps.ba.C4743b;
import com.google.android.m4b.maps.bo.C4848k;
import com.google.android.m4b.maps.bo.C4854s;
import com.google.android.m4b.maps.bo.C4854s.C4853a;
import com.google.android.m4b.maps.bo.C6527u;
import com.google.android.m4b.maps.bo.ao;
import com.google.android.m4b.maps.bo.as;
import com.google.android.m4b.maps.bu.C4910a;
import com.google.android.m4b.maps.bu.C7472c;
import com.google.android.m4b.maps.bx.C5008i;
import com.google.android.m4b.maps.bx.ak;
import com.google.android.m4b.maps.bx.ak.C4991a;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.ca.C6573f;
import com.google.android.m4b.maps.ca.C7490k;
import com.google.android.m4b.maps.ca.C7490k.C6574a;
import com.google.android.m4b.maps.cb.C5064f;
import com.google.android.m4b.maps.cb.C5065h;
import com.google.android.m4b.maps.cb.C5067l;
import com.google.android.m4b.maps.ce.C5095c;
import com.google.android.m4b.maps.cf.C6593l;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.m4b.maps.cc.i */
public final class C6585i implements C5073c {
    /* renamed from: a */
    private C5076c f24660a;
    /* renamed from: b */
    private final C5078f f24661b;
    /* renamed from: c */
    private final ArrayList<ArrayList<C5077e>> f24662c;
    /* renamed from: d */
    private final ArrayList<C7490k> f24663d;
    /* renamed from: e */
    private final ArrayList<C6593l> f24664e;
    /* renamed from: f */
    private final C5067l f24665f = this.f24667h;
    /* renamed from: g */
    private final C5065h f24666g = this.f24667h;
    /* renamed from: h */
    private final C6573f f24667h;
    /* renamed from: i */
    private final C5064f f24668i = new C5064f(this.f24667h.m29293d());
    /* renamed from: j */
    private float f24669j;
    /* renamed from: k */
    private float f24670k;
    /* renamed from: l */
    private float f24671l;
    /* renamed from: m */
    private float f24672m;
    /* renamed from: n */
    private boolean f24673n;
    /* renamed from: o */
    private boolean f24674o;

    /* renamed from: com.google.android.m4b.maps.cc.i$c */
    public enum C5076c {
        CENTER,
        LEFT,
        RIGHT;

        /* renamed from: a */
        public static C5076c m22718a(int i) {
            switch (i) {
                case 1:
                    return CENTER;
                case 2:
                    return LEFT;
                case 3:
                    return RIGHT;
                default:
                    throw new IllegalArgumentException("Unknown justification");
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.cc.i$e */
    interface C5077e {
        /* renamed from: a */
        float mo5273a();

        /* renamed from: a */
        C7490k mo5274a(C5008i c5008i);

        /* renamed from: a */
        C7490k mo5275a(C5052d c5052d, C5008i c5008i);

        /* renamed from: b */
        float mo5276b();

        /* renamed from: c */
        float mo5277c();

        /* renamed from: d */
        float mo5278d();

        /* renamed from: e */
        float mo5279e();
    }

    /* renamed from: com.google.android.m4b.maps.cc.i$f */
    public enum C5078f {
        CENTER,
        TOP,
        BOTTOM;

        /* renamed from: a */
        public static C5078f m22726a(int i) {
            switch (i) {
                case 1:
                    return CENTER;
                case 2:
                    return TOP;
                case 3:
                    return BOTTOM;
                default:
                    throw new IllegalArgumentException("Unknown alignment");
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.cc.i$a */
    public static class C6582a implements C5077e {
        /* renamed from: a */
        private final Bitmap f24645a;
        /* renamed from: b */
        private final C6574a<Bitmap> f24646b;
        /* renamed from: c */
        private final int f24647c;
        /* renamed from: d */
        private final int f24648d;

        /* renamed from: c */
        public final float mo5277c() {
            return 0.0f;
        }

        /* renamed from: d */
        public final float mo5278d() {
            return 0.0f;
        }

        C6582a(Bitmap bitmap, float f, C6574a<Bitmap> c6574a) {
            this.f24645a = bitmap;
            this.f24646b = c6574a;
            this.f24647c = (int) (((float) this.f24645a.getWidth()) * f);
            this.f24648d = (int) (f * ((float) this.f24645a.getHeight()));
        }

        /* renamed from: a */
        public final float mo5273a() {
            return (float) this.f24647c;
        }

        /* renamed from: b */
        public final float mo5276b() {
            return (float) this.f24648d;
        }

        /* renamed from: e */
        public final float mo5279e() {
            return (float) this.f24648d;
        }

        /* renamed from: a */
        public final C7490k mo5275a(C5052d c5052d, C5008i c5008i) {
            c5008i = (C7490k) this.f24646b.m22251b((Object) this.f24645a);
            if (c5008i == null) {
                c5008i = new C7490k(c5052d, false);
                c5052d = true;
                c5008i.m32552c(true);
                c5008i.m32555d(false);
                if (VERSION.SDK_INT < 9) {
                    c5052d = null;
                }
                if (c5052d == null || C4743b.f17389c != null) {
                    c5008i.m32548b(this.f24645a);
                } else {
                    c5008i.m32542a(this.f24645a);
                }
                this.f24646b.m22255c(this.f24645a, c5008i);
            }
            c5008i.m32556e();
            return c5008i;
        }

        /* renamed from: a */
        public final C7490k mo5274a(C5008i c5008i) {
            C7490k c7490k = (C7490k) this.f24646b.m22251b((Object) this.f24645a);
            if (c7490k != null) {
                c7490k.m32556e();
            }
            return c7490k;
        }
    }

    /* renamed from: com.google.android.m4b.maps.cc.i$b */
    static class C6583b implements C5077e {
        /* renamed from: a */
        private float f24649a;

        /* renamed from: a */
        public final C7490k mo5274a(C5008i c5008i) {
            return null;
        }

        /* renamed from: a */
        public final C7490k mo5275a(C5052d c5052d, C5008i c5008i) {
            return null;
        }

        /* renamed from: b */
        public final float mo5276b() {
            return 0.0f;
        }

        /* renamed from: c */
        public final float mo5277c() {
            return 0.0f;
        }

        /* renamed from: d */
        public final float mo5278d() {
            return 0.0f;
        }

        /* renamed from: e */
        public final float mo5279e() {
            return 0.0f;
        }

        C6583b(float f) {
            this.f24649a = f;
        }

        /* renamed from: a */
        public final float mo5273a() {
            return this.f24649a;
        }
    }

    /* renamed from: com.google.android.m4b.maps.cc.i$d */
    public static class C6584d implements C5077e {
        /* renamed from: a */
        private final ak f24650a;
        /* renamed from: b */
        private final String f24651b;
        /* renamed from: c */
        private final int f24652c;
        /* renamed from: d */
        private final as f24653d;
        /* renamed from: e */
        private final C4991a f24654e;
        /* renamed from: f */
        private final float f24655f;
        /* renamed from: g */
        private final float f24656g;
        /* renamed from: h */
        private final float f24657h;
        /* renamed from: i */
        private final float f24658i;
        /* renamed from: j */
        private final int f24659j;

        C6584d(ak akVar, String str, int i, as asVar, C4991a c4991a) {
            this.f24650a = akVar;
            this.f24651b = str;
            this.f24652c = i;
            this.f24653d = asVar;
            this.f24659j = asVar.m21562f() ? asVar.m21566j().m21582b() : 0;
            float g = asVar.m21561e() ? asVar.m21565i().m21590g() : 1.0f;
            this.f24654e = c4991a;
            akVar = akVar.m22320a(str, c4991a, this.f24653d != null ? this.f24653d.m21565i() : null, (float) i, true, g);
            if (c4991a == ak.f18431b) {
                this.f24655f = akVar[0] * 1061997773;
            } else {
                this.f24655f = akVar[0];
            }
            this.f24656g = akVar[1];
            this.f24657h = akVar[2];
            this.f24658i = akVar[3];
        }

        /* renamed from: a */
        public final float mo5273a() {
            return this.f24655f;
        }

        /* renamed from: b */
        public final float mo5276b() {
            return this.f24656g;
        }

        /* renamed from: c */
        public final float mo5277c() {
            return this.f24657h;
        }

        /* renamed from: d */
        public final float mo5278d() {
            return this.f24658i;
        }

        /* renamed from: e */
        public final float mo5279e() {
            return (this.f24656g - this.f24657h) - this.f24658i;
        }

        /* renamed from: a */
        public final C7490k mo5275a(C5052d c5052d, C5008i c5008i) {
            int i;
            int i2;
            int b = C7498h.m32648b(this.f24653d, c5008i);
            int a = C7498h.m32646a(this.f24653d, c5008i);
            if (this.f24659j != 0) {
                if (c5008i != C5008i.HYBRID) {
                    if (c5008i == C5008i.NIGHT) {
                    }
                    i = a;
                    i2 = 0;
                }
                a = C7498h.m32647b(this.f24659j);
                i = a;
                i2 = 0;
            } else {
                i2 = b;
                i = a;
            }
            return this.f24650a.m22315a(c5052d, this.f24651b, this.f24654e, this.f24653d != null ? this.f24653d.m21565i() : null, (float) this.f24652c, i, i2, this.f24659j);
        }

        /* renamed from: a */
        public final C7490k mo5274a(C5008i c5008i) {
            return this.f24650a.m22316a(this.f24651b, this.f24654e, this.f24653d != null ? this.f24653d.m21565i() : null, (float) this.f24652c, C7498h.m32646a(this.f24653d, c5008i), C7498h.m32648b(this.f24653d, c5008i), this.f24659j);
        }
    }

    C6585i(ArrayList<ArrayList<C5077e>> arrayList, C5076c c5076c, C5078f c5078f) {
        this.f24662c = arrayList;
        this.f24663d = new ArrayList(arrayList.size());
        this.f24664e = new ArrayList(arrayList.size());
        this.f24667h = new C6573f(arrayList.size() * 4, 9, false);
        this.f24660a = c5076c;
        this.f24661b = c5078f;
        m29384d();
        this.f24673n = false;
        this.f24674o = true;
    }

    /* renamed from: a */
    public static C6585i m29382a(C4854s c4854s, C4848k c4848k, C6570b c6570b, C6574a<Bitmap> c6574a, ak akVar, C5095c c5095c) {
        C4848k c4848k2 = c4848k;
        C5095c c5095c2 = c5095c;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(arrayList2);
        ArrayList arrayList3 = arrayList2;
        for (int i = 0; i < c4854s.m21780b(); i++) {
            C4853a a = c4854s.m21778a(i);
            C6574a<Bitmap> c6574a2;
            if (a.m21764a()) {
                Object obj;
                C4991a c4991a;
                as j = a.m21773j();
                String i2 = a.m21772i();
                if (!(i2 == null || i2.length() == 0 || akVar == null || j == null)) {
                    if (j.m21561e()) {
                        int d = j.m21565i().m21587d();
                        if (j.m21565i().m21589f() > 0 && (d & -16777216) != 0) {
                            obj = 1;
                            if (obj != null) {
                                c4991a = c5095c2.f18885d;
                                if (c4848k2 instanceof ao) {
                                    c4991a = c5095c2.f18882a;
                                } else if (c4848k2 instanceof C6527u) {
                                    c4991a = c5095c2.f18889h;
                                }
                                arrayList3.add(new C6584d(akVar, a.m21772i(), C8082n.m34371a(j, c5095c2, c6570b.m29251g()), j, c4991a));
                            }
                            c6574a2 = c6574a;
                        }
                    }
                }
                obj = null;
                if (obj != null) {
                    c4991a = c5095c2.f18885d;
                    if (c4848k2 instanceof ao) {
                        c4991a = c5095c2.f18882a;
                    } else if (c4848k2 instanceof C6527u) {
                        c4991a = c5095c2.f18889h;
                    }
                    arrayList3.add(new C6584d(akVar, a.m21772i(), C8082n.m34371a(j, c5095c2, c6570b.m29251g()), j, c4991a));
                }
                c6574a2 = c6574a;
            } else if (a.m21765b()) {
                C4910a a2 = C7472c.m32365a().m32368a(a.m21770g(), null, false);
                if (!a2.m22021b()) {
                    return null;
                }
                Bitmap c = a2.m22022c();
                float h = a.m21771h();
                if (a.m21770g().contains("/road_shields/")) {
                    h *= c5095c2.f18894m;
                } else {
                    h *= c5095c2.f18895n;
                }
                arrayList3.add(new C6582a(c, h * c6570b.m29251g(), c6574a));
            } else {
                c6574a2 = c6574a;
                if (a.m21768e()) {
                    arrayList3.add(new C6583b(a.m21774k()));
                } else if (a.m21769f()) {
                    arrayList3 = new ArrayList();
                    arrayList.add(arrayList3);
                }
            }
        }
        C4854s c4854s2 = c4854s;
        return new C6585i(arrayList, C5076c.m22718a(c4854s.m21781c().m21601a()), C5078f.m22726a(c4854s.m21781c().m21602b()));
    }

    /* renamed from: d */
    private void m29384d() {
        float f = 0.0f;
        this.f24669j = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < this.f24662c.size(); i++) {
            Iterator it = ((ArrayList) this.f24662c.get(i)).iterator();
            float f3 = 0.0f;
            float f4 = 0.0f;
            while (it.hasNext()) {
                C5077e c5077e = (C5077e) it.next();
                f3 += c5077e.mo5273a();
                f4 = Math.max(f4, c5077e.mo5279e());
            }
            this.f24669j = Math.max(this.f24669j, f3);
            f2 += f4;
        }
        ArrayList arrayList = (ArrayList) this.f24662c.get(0);
        ArrayList arrayList2 = (ArrayList) this.f24662c.get(this.f24662c.size() - 1);
        this.f24671l = 0.0f;
        this.f24672m = 0.0f;
        Iterator it2;
        float f5;
        C5077e c5077e2;
        float f6;
        switch (this.f24661b) {
            case TOP:
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    this.f24671l = Math.max(this.f24671l, ((C5077e) it2.next()).mo5277c());
                }
                it2 = arrayList2.iterator();
                f5 = 0.0f;
                while (it2.hasNext()) {
                    c5077e2 = (C5077e) it2.next();
                    f3 = c5077e2.mo5279e();
                    f = Math.max(f, f3);
                    f5 = Math.max(f5, f3 + c5077e2.mo5278d());
                }
                if (f5 > f) {
                    this.f24672m = f5 - f;
                    break;
                }
                break;
            case BOTTOM:
                it2 = arrayList.iterator();
                f6 = 0.0f;
                while (it2.hasNext()) {
                    C5077e c5077e3 = (C5077e) it2.next();
                    f4 = c5077e3.mo5279e();
                    f = Math.max(f, f4);
                    f6 = Math.max(f6, f4 + c5077e3.mo5277c());
                }
                if (f6 > f) {
                    this.f24671l = f6 - f;
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    this.f24672m = Math.max(this.f24672m, ((C5077e) it3.next()).mo5278d());
                }
                break;
            case CENTER:
                it2 = arrayList.iterator();
                f6 = 0.0f;
                f3 = 0.0f;
                while (it2.hasNext()) {
                    C5077e c5077e4 = (C5077e) it2.next();
                    float e = c5077e4.mo5279e() / 2.0f;
                    f6 = Math.max(f6, e);
                    f3 = Math.max(f3, e + c5077e4.mo5277c());
                }
                if (f3 > f6) {
                    this.f24671l = f3 - f6;
                }
                it2 = arrayList2.iterator();
                f5 = 0.0f;
                while (it2.hasNext()) {
                    c5077e2 = (C5077e) it2.next();
                    f3 = c5077e2.mo5279e() / 2.0f;
                    f = Math.max(f, f3);
                    f5 = Math.max(f5, f3 + c5077e2.mo5278d());
                }
                if (f5 > f) {
                    this.f24672m = f5 - f;
                    break;
                }
                break;
            default:
                break;
        }
        this.f24670k = (f2 + this.f24671l) + this.f24672m;
    }

    /* renamed from: b */
    public final void mo5223b(C5052d c5052d) {
        Iterator it = this.f24663d.iterator();
        while (it.hasNext()) {
            ((C7490k) it.next()).m32557f();
        }
        this.f24663d.clear();
        it = this.f24662c.iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            arrayList.clear();
        }
        this.f24662c.clear();
        this.f24668i.m22686d(c5052d);
    }

    /* renamed from: c */
    public final void mo5224c(C5052d c5052d) {
        mo5223b(c5052d);
        this.f24668i.m22685c(c5052d);
    }

    /* renamed from: a */
    public final float m29385a() {
        return this.f24669j;
    }

    /* renamed from: b */
    public final float m29388b() {
        return this.f24670k;
    }

    /* renamed from: c */
    public final boolean m29391c() {
        if (!(this.f24662c.isEmpty() || this.f24669j == 0.0f)) {
            if (this.f24670k != 0.0f) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void m29387a(C5076c c5076c) {
        if (this.f24660a != c5076c) {
            this.f24674o = true;
        }
        this.f24660a = c5076c;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo5222a(com.google.android.m4b.maps.ca.C5052d r6, com.google.android.m4b.maps.bz.C6570b r7, com.google.android.m4b.maps.bx.C5009j r8) {
        /*
        r5 = this;
        r7 = r5.f24673n;
        r0 = 0;
        if (r7 != 0) goto L_0x00be;
    L_0x0005:
        r7 = r8.m22385a();
        r8 = r5.f24663d;
        r8 = r8.isEmpty();
        if (r8 != 0) goto L_0x0019;
    L_0x0011:
        r6 = new java.lang.IllegalStateException;
        r7 = "this.textureArray should be empty.";
        r6.<init>(r7);
        throw r6;
    L_0x0019:
        r8 = r5.f24662c;
        r8 = r8.iterator();
    L_0x001f:
        r1 = r8.hasNext();
        r2 = 1;
        if (r1 == 0) goto L_0x0069;
    L_0x0026:
        r1 = r8.next();
        r1 = (java.util.ArrayList) r1;
        r1 = r1.iterator();
    L_0x0030:
        r3 = r1.hasNext();
        if (r3 == 0) goto L_0x001f;
    L_0x0036:
        r3 = r1.next();
        r3 = (com.google.android.m4b.maps.cc.C6585i.C5077e) r3;
        r4 = r3 instanceof com.google.android.m4b.maps.cc.C6585i.C6583b;
        if (r4 != 0) goto L_0x0030;
    L_0x0040:
        r3 = r3.mo5274a(r7);
        if (r3 != 0) goto L_0x0063;
    L_0x0046:
        r8 = r5.f24663d;
        r8 = r8.iterator();
    L_0x004c:
        r1 = r8.hasNext();
        if (r1 == 0) goto L_0x005c;
    L_0x0052:
        r1 = r8.next();
        r1 = (com.google.android.m4b.maps.ca.C7490k) r1;
        r1.m32557f();
        goto L_0x004c;
    L_0x005c:
        r8 = r5.f24663d;
        r8.clear();
        r8 = 0;
        goto L_0x006a;
    L_0x0063:
        r4 = r5.f24663d;
        r4.add(r3);
        goto L_0x0030;
    L_0x0069:
        r8 = 1;
    L_0x006a:
        if (r8 != 0) goto L_0x00b6;
    L_0x006c:
        r8 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r8 = r6.m22610a(r8);
        if (r8 != 0) goto L_0x0076;
    L_0x0074:
        r2 = 0;
        goto L_0x00bb;
    L_0x0076:
        r8 = r5.f24663d;
        r8 = r8.isEmpty();
        if (r8 != 0) goto L_0x0086;
    L_0x007e:
        r6 = new java.lang.IllegalStateException;
        r7 = "this.textureArray should be empty on initialize.";
        r6.<init>(r7);
        throw r6;
    L_0x0086:
        r8 = r5.f24662c;
        r8 = r8.iterator();
    L_0x008c:
        r1 = r8.hasNext();
        if (r1 == 0) goto L_0x00b6;
    L_0x0092:
        r1 = r8.next();
        r1 = (java.util.ArrayList) r1;
        r1 = r1.iterator();
    L_0x009c:
        r3 = r1.hasNext();
        if (r3 == 0) goto L_0x008c;
    L_0x00a2:
        r3 = r1.next();
        r3 = (com.google.android.m4b.maps.cc.C6585i.C5077e) r3;
        r4 = r3 instanceof com.google.android.m4b.maps.cc.C6585i.C6583b;
        if (r4 != 0) goto L_0x009c;
    L_0x00ac:
        r4 = r5.f24663d;
        r3 = r3.mo5275a(r6, r7);
        r4.add(r3);
        goto L_0x009c;
    L_0x00b6:
        r5.m29383a(r6);
        r5.f24673n = r2;
    L_0x00bb:
        if (r2 != 0) goto L_0x00be;
    L_0x00bd:
        return;
    L_0x00be:
        r7 = r5.f24674o;
        if (r7 == 0) goto L_0x00c5;
    L_0x00c2:
        r5.m29383a(r6);
    L_0x00c5:
        r7 = r6.m22635x();
        r8 = r5.f24668i;
        r8 = r8.m22681a();
        if (r8 != 0) goto L_0x00d2;
    L_0x00d1:
        return;
    L_0x00d2:
        r8 = r5.f24668i;
        r8.m22682a(r6);
    L_0x00d7:
        r6 = r5.f24663d;
        r6 = r6.size();
        if (r0 >= r6) goto L_0x00f4;
    L_0x00df:
        r6 = r5.f24663d;
        r6 = r6.get(r0);
        r6 = (com.google.android.m4b.maps.ca.C7490k) r6;
        r6.m32544a(r7);
        r6 = 6;
        r8 = r0 * 4;
        r1 = 4;
        r7.glDrawArrays(r6, r8, r1);
        r0 = r0 + 1;
        goto L_0x00d7;
    L_0x00f4:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cc.i.a(com.google.android.m4b.maps.ca.d, com.google.android.m4b.maps.bz.b, com.google.android.m4b.maps.bx.j):void");
    }

    /* renamed from: a */
    private void m29383a(C5052d c5052d) {
        this.f24667h.m29296f();
        this.f24668i.mo5272b(c5052d);
        this.f24667h.mo5253a(this.f24663d.size() * 4);
        float f = this.f24670k - this.f24671l;
        int i = 0;
        for (int i2 = 0; i2 < r0.f24662c.size(); i2++) {
            ArrayList arrayList = (ArrayList) r0.f24662c.get(i2);
            Iterator it = arrayList.iterator();
            float f2 = 0.0f;
            float f3 = 0.0f;
            while (it.hasNext()) {
                C5077e c5077e = (C5077e) it.next();
                f2 = Math.max(f2, c5077e.mo5279e());
                f3 += c5077e.mo5273a();
            }
            float f4 = 2.0f;
            float f5 = r0.f24660a == C5076c.CENTER ? (r0.f24669j - f3) / 2.0f : r0.f24660a == C5076c.RIGHT ? r0.f24669j - f3 : 0.0f;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C5077e c5077e2 = (C5077e) it2.next();
                if (c5077e2 instanceof C6583b) {
                    f5 += c5077e2.mo5273a();
                } else {
                    float a = c5077e2.mo5273a();
                    float b = c5077e2.mo5276b();
                    float e = r0.f24661b == C5078f.CENTER ? f - ((f2 - c5077e2.mo5279e()) / f4) : r0.f24661b == C5078f.BOTTOM ? f - (f2 - c5077e2.mo5279e()) : f;
                    e += c5077e2.mo5277c();
                    int i3 = i + 1;
                    C7490k c7490k = (C7490k) r0.f24663d.get(i);
                    float b2 = c7490k.m32546b();
                    float c = c7490k.m32550c();
                    b = e - b;
                    r0.f24665f.mo5252a(f5, 0.0f, b);
                    a += f5;
                    r0.f24665f.mo5252a(a, 0.0f, b);
                    r0.f24665f.mo5252a(a, 0.0f, e);
                    r0.f24665f.mo5252a(f5, 0.0f, e);
                    r0.f24666g.mo5251a(0.0f, c);
                    r0.f24666g.mo5251a(b2, c);
                    r0.f24666g.mo5251a(b2, 0.0f);
                    r0.f24666g.mo5251a(0.0f, 0.0f);
                    f5 += c5077e2.mo5273a();
                    i = i3;
                    f4 = 2.0f;
                }
            }
            f -= f2;
        }
        r0.f24674o = false;
        r0.f24667h.m29291c();
        r0.f24668i.mo5271a(r0.f24667h.m29295e());
    }
}
