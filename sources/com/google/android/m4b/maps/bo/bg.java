package com.google.android.m4b.maps.bo;

import android.content.res.Resources;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.google.android.m4b.maps.as.C4666a;
import com.google.android.m4b.maps.ay.C4723n;
import com.google.android.m4b.maps.bp.C7465b;
import com.google.android.m4b.maps.bq.C4870j;
import com.google.android.m4b.maps.bq.C8068e;
import com.google.android.m4b.maps.bq.C8201c;
import com.google.android.m4b.maps.bq.C8203h;
import com.google.android.m4b.maps.bq.C8205n;
import com.google.android.m4b.maps.bq.C8226m;
import com.google.android.m4b.maps.bs.C4881d;
import com.google.android.m4b.maps.bs.C4904l;
import com.google.android.m4b.maps.bs.C6538c;
import com.google.android.m4b.maps.bs.C6541k;
import com.google.android.m4b.maps.bs.C7470j;
import com.google.android.m4b.maps.bs.C7470j.C4902c;
import com.google.android.m4b.maps.bx.C5008i;
import com.google.android.m4b.maps.bx.al;
import com.google.android.m4b.maps.bx.ao;
import com.google.android.m4b.maps.ch.C5203e;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.DataInput;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.microedition.khronos.opengles.GL10;

public abstract class bg implements Comparable<bg> {
    /* renamed from: E */
    private static final Map<Integer, bg> f17735E = new HashMap();
    /* renamed from: F */
    private static final List<bg> f17736F = new ArrayList();
    /* renamed from: M */
    private static final ar f17737M = new ar(0, 0.0f, new int[0], 0);
    /* renamed from: N */
    private static final ax f17738N = new ax(-16777216, f17737M);
    /* renamed from: O */
    private static final ax f17739O = new ax(-16776961, f17737M);
    /* renamed from: P */
    private static final ax f17740P = new ax(-65536, f17737M);
    /* renamed from: Q */
    private static final ay f17741Q = new ay(-1, 0, 10, 1.2f, 1.0f, 0);
    /* renamed from: R */
    private static final as f17742R = new as(-1, 12, null, null, f17741Q, f17738N, null, null);
    /* renamed from: S */
    private static final as f17743S = new as(-1, 12, null, null, f17741Q, f17740P, null, null);
    /* renamed from: T */
    private static final as f17744T = new as(-1, 12, null, null, f17741Q, f17739O, null, null);
    /* renamed from: a */
    public static final bg f17745a = new C7458a(10).m21667d(true).m21668e(true).mo5119a();
    /* renamed from: b */
    public static final bg f17746b = new C7458a(22).m21667d(true).m21668e(true).mo5119a();
    /* renamed from: c */
    public static final bg f17747c = new C7458a(20).m21662a("_tran_base").m21667d(true).m21668e(true).mo5119a();
    /* renamed from: d */
    public static final bg f17748d = new C6500a(3).m21666c(false).m21668e(true).mo5119a();
    /* renamed from: e */
    public static final bg f17749e = new C6500a(12).m21662a("_ter").m21666c(false).m21668e(true).mo5119a();
    /* renamed from: f */
    public static final bg f17750f = new C6508a(4).m21662a("_traf").mo5119a();
    /* renamed from: g */
    public static final bg f17751g = new C6508a(23).m21662a("_traf").mo5119a();
    /* renamed from: h */
    public static final bg f17752h = new C6503a().mo5119a();
    /* renamed from: i */
    public static final bg f17753i = new C6505a().m21668e(true).mo5119a();
    /* renamed from: j */
    public static final bg f17754j = new C7458a(18).m32219a(true).m21662a("_vec_bic").m21668e(true).mo5119a();
    /* renamed from: k */
    public static final bg f17755k = new C6500a(7).m21661a((int) ProfileEditingConfig.DEFAULT_MAX_LENGTH).m21662a("_ter_bic").mo5119a();
    /* renamed from: l */
    public static final bg f17756l = new C6500a(6).m21661a((int) ProfileEditingConfig.DEFAULT_MAX_LENGTH).m21662a("_hy_bic").mo5119a();
    /* renamed from: m */
    public static final bg f17757m = new C6508a(13).m21662a("_tran").m21668e(true).mo5119a();
    /* renamed from: n */
    public static final bg f17758n = new C6508a(14).m21668e(true).m21662a("_inaka").mo5119a();
    /* renamed from: o */
    public static final bg f17759o = new C7460a(15).m21662a("_labl").m21667d(true).m21668e(true).mo5119a();
    /* renamed from: p */
    public static final bg f17760p = new C7460a(21).m21662a("_tran_labl").m21667d(true).m21668e(true).mo5119a();
    /* renamed from: q */
    public static final bg f17761q = new C6508a(16).m21662a("_psm").m21665b(true).mo5119a();
    /* renamed from: r */
    public static final bg f17762r = new C6508a(17).m21662a("_related").m21665b(true).mo5119a();
    /* renamed from: s */
    public static final bg f17763s = new C6508a(24).m21662a("_high").m21665b(true).m21668e(true).mo5119a();
    /* renamed from: t */
    public static final bg f17764t = new C6508a(25).m21662a("_api").mo5119a();
    /* renamed from: u */
    public static final bg f17765u = new C6508a(0).m21662a("_star").m21665b(true).m21668e(false).mo5119a();
    /* renamed from: v */
    public static final bg f17766v = new C6508a(26).m21662a("_spotlight").mo5119a();
    /* renamed from: w */
    public static final bg f17767w = new C6508a(27).m21662a("_maps_engine_vector").m21668e(true).mo5119a();
    /* renamed from: x */
    public static final bg f17768x = new C6500a(28).m21662a("_maps_engine_image").m21668e(true).mo5119a();
    /* renamed from: y */
    public static final bg f17769y = new C6508a(10).m21664b("RoadmapAmbiactive").m21662a("_amb_col").m21668e(true).mo5119a();
    /* renamed from: z */
    public static final bg f17770z = new C6508a(10).m21664b("RoadmapAmbiactiveLowBit").m21662a("_amb_low_bit").m21668e(true).mo5119a();
    /* renamed from: A */
    public final int f17771A;
    /* renamed from: B */
    public final int f17772B;
    /* renamed from: C */
    public final boolean f17773C;
    /* renamed from: D */
    public final String f17774D;
    /* renamed from: G */
    private int f17775G;
    /* renamed from: H */
    private final int f17776H;
    /* renamed from: I */
    private final boolean f17777I;
    /* renamed from: J */
    private final boolean f17778J;
    /* renamed from: K */
    private final boolean f17779K;
    /* renamed from: L */
    private final String f17780L;

    /* renamed from: com.google.android.m4b.maps.bo.bg$b */
    static abstract class C4840b {
        /* renamed from: a */
        private final int f17727a;
        /* renamed from: b */
        private int f17728b;
        /* renamed from: c */
        private String f17729c;
        /* renamed from: d */
        private boolean f17730d;
        /* renamed from: e */
        private boolean f17731e;
        /* renamed from: f */
        private boolean f17732f;
        /* renamed from: g */
        private boolean f17733g;
        /* renamed from: h */
        private String f17734h;

        /* renamed from: a */
        abstract bg mo5119a();

        private C4840b(int i) {
            this.f17728b = 0;
            this.f17729c = "";
            this.f17730d = false;
            this.f17731e = true;
            this.f17732f = false;
            this.f17733g = false;
            this.f17734h = null;
            this.f17727a = i;
        }

        /* renamed from: a */
        final C4840b m21661a(int i) {
            this.f17728b = ProfileEditingConfig.DEFAULT_MAX_LENGTH;
            return this;
        }

        /* renamed from: a */
        final C4840b m21662a(String str) {
            this.f17729c = str;
            return this;
        }

        /* renamed from: b */
        final C4840b m21665b(boolean z) {
            this.f17730d = true;
            return this;
        }

        /* renamed from: c */
        final C4840b m21666c(boolean z) {
            this.f17731e = false;
            return this;
        }

        /* renamed from: d */
        final C4840b m21667d(boolean z) {
            this.f17732f = true;
            return this;
        }

        /* renamed from: e */
        final C4840b m21668e(boolean z) {
            this.f17733g = z;
            return this;
        }

        /* renamed from: b */
        final C4840b m21664b(String str) {
            this.f17734h = str;
            return this;
        }
    }

    /* renamed from: com.google.android.m4b.maps.bo.bg$c */
    static class C6501c extends bg {

        /* renamed from: com.google.android.m4b.maps.bo.bg$c$a */
        static class C6500a extends C4840b {
            private C6500a(int i) {
                super(i);
            }

            /* renamed from: a */
            final bg mo5119a() {
                return new C6501c();
            }
        }

        /* renamed from: a */
        final int mo5120a() {
            return ItemAnimator.FLAG_MOVED;
        }

        /* renamed from: g */
        public final boolean mo5125g() {
            return true;
        }

        public final /* synthetic */ int compareTo(Object obj) {
            return super.m21675a((bg) obj);
        }

        /* renamed from: a */
        public final C4870j mo5121a(C4723n c4723n, Resources resources, Locale locale, File file, boolean z, C5203e c5203e) {
            int b;
            bg bgVar = this;
            Resources resources2 = resources;
            int b2 = bg.m21670b(resources2.getDisplayMetrics().densityDpi);
            if (bgVar == bg.f17748d) {
                b = al.m32433b(resources2, 256);
            } else {
                b = al.m32425a(resources2, 256);
            }
            int i = b;
            float f = bgVar.f17777I ? resources2.getDisplayMetrics().density : 1.0f;
            float f2 = 2.0f;
            if (bgVar != x) {
                f2 = f;
            } else if (f == 4.0f) {
                f2 = 3.0f;
            } else if (f != 3.0f) {
                f2 = f == 2.0f ? 1.5f : 1.0f;
            }
            return new C8201c(c4723n, bgVar, b2, i, f2, locale, file, null, c5203e);
        }

        /* renamed from: a */
        public final C4902c mo5122a(C5203e c5203e) {
            return new C6502d(this, c5203e);
        }

        /* renamed from: a */
        public final void mo5123a(GL10 gl10) {
            gl10.glColor4f(0.0f, 0.0f, 1.0f, 0.3f);
        }

        private C6501c(C6500a c6500a) {
            super(c6500a);
        }
    }

    /* renamed from: com.google.android.m4b.maps.bo.bg$d */
    static class C6502d implements C4902c {
        /* renamed from: a */
        private final bg f24119a;
        /* renamed from: b */
        private final C5203e f24120b;

        public C6502d(bg bgVar, C5203e c5203e) {
            this.f24119a = bgVar;
            this.f24120b = c5203e;
        }

        /* renamed from: a */
        public final az mo5126a(ba baVar, byte[] bArr, int i, long j, long j2) {
            DataInput c4666a = new C4666a(bArr);
            c4666a.skipBytes(i);
            bg bgVar = this.f24119a;
            C5203e c5203e = this.f24120b;
            bArr = c4666a.readInt();
            if (bArr != 1146241364) {
                i = new StringBuilder(32);
                i.append("TILE_MAGIC expected: ");
                i.append(bArr);
                throw new IOException(i.toString());
            }
            bArr = bl.m21698a(c4666a);
            if (bArr == 7 || bArr == 8) {
                bArr = ba.m21605a(c4666a);
                if (bArr.m21620c() == baVar.m21620c() && bArr.m21621d() == baVar.m21621d()) {
                    if (bArr.m21619b() == baVar.m21619b()) {
                        int a = bl.m21698a(c4666a);
                        int a2 = bl.m21698a(c4666a);
                        int a3 = bl.m21698a(c4666a);
                        byte[] bArr2 = new byte[bl.m21698a(c4666a)];
                        c4666a.readFully(bArr2);
                        return new C6523o(baVar, a, a2, a3, bArr2, bgVar, c5203e);
                    }
                }
                baVar = String.valueOf(baVar);
                bArr = String.valueOf(bArr);
                j = new StringBuilder((String.valueOf(baVar).length() + 36) + String.valueOf(bArr).length());
                j.append("Expected tile coords: ");
                j.append(baVar);
                j.append(" but received ");
                j.append(bArr);
                throw new IOException(j.toString());
            }
            i = String.valueOf("Version mismatch: 7 or 8 expected, ");
            j = new StringBuilder(String.valueOf(i).length() + 17);
            j.append(i);
            j.append(bArr);
            j.append(" found");
            throw new IOException(j.toString());
        }
    }

    /* renamed from: com.google.android.m4b.maps.bo.bg$f */
    static class C6504f extends bg {

        /* renamed from: com.google.android.m4b.maps.bo.bg$f$a */
        static class C6503a extends C4840b {
            private C6503a(int i) {
                super(i);
            }

            /* renamed from: a */
            final bg mo5119a() {
                return new C6504f();
            }
        }

        /* renamed from: a */
        final int mo5120a() {
            return 0;
        }

        /* renamed from: a */
        public final C4902c mo5122a(C5203e c5203e) {
            return null;
        }

        public final /* synthetic */ int compareTo(Object obj) {
            return super.m21675a((bg) obj);
        }

        /* renamed from: a */
        public final C4870j mo5121a(C4723n c4723n, Resources resources, Locale locale, File file, boolean z, C5203e c5203e) {
            return new C8068e(c4723n, al.m32425a(resources, (int) true), locale, file, c5203e);
        }

        private C6504f(C6503a c6503a) {
            super(c6503a);
        }
    }

    /* renamed from: com.google.android.m4b.maps.bo.bg$g */
    static class C6506g extends bg {

        /* renamed from: com.google.android.m4b.maps.bo.bg$g$a */
        static class C6505a extends C4840b {
            private C6505a(int i) {
                super(i);
            }

            /* renamed from: a */
            final bg mo5119a() {
                return new C6506g();
            }
        }

        /* renamed from: a */
        final int mo5120a() {
            return ItemAnimator.FLAG_MOVED;
        }

        public final /* synthetic */ int compareTo(Object obj) {
            return super.m21675a((bg) obj);
        }

        /* renamed from: a */
        public final C4870j mo5121a(C4723n c4723n, Resources resources, Locale locale, File file, boolean z, C5203e c5203e) {
            return new C8203h(c4723n, this, locale, file, null, c5203e);
        }

        /* renamed from: a */
        public final C4902c mo5122a(C5203e c5203e) {
            return new C6507h();
        }

        /* renamed from: b */
        public final C4904l mo5127b() {
            return new C6541k(Math.max(Math.min(ProfileEditingConfig.DEFAULT_MAX_LENGTH, (ao.m22338e() >> 3) * 18), 36));
        }

        private C6506g(C6505a c6505a) {
            super(c6505a);
        }
    }

    /* renamed from: com.google.android.m4b.maps.bo.bg$h */
    static class C6507h implements C4902c {
        private C6507h() {
        }

        /* renamed from: a */
        public final az mo5126a(ba baVar, byte[] bArr, int i, long j, long j2) {
            return C7465b.m32269a(baVar, bArr, i, j);
        }
    }

    /* renamed from: com.google.android.m4b.maps.bo.bg$i */
    static class C6509i extends bg {

        /* renamed from: com.google.android.m4b.maps.bo.bg$i$a */
        static class C6508a extends C4840b {
            private C6508a(int i) {
                super(i);
            }

            /* renamed from: a */
            bg mo5119a() {
                return new C6509i();
            }
        }

        /* renamed from: a */
        final int mo5120a() {
            return 4096;
        }

        public /* synthetic */ int compareTo(Object obj) {
            return super.m21675a((bg) obj);
        }

        /* renamed from: a */
        public final C4870j mo5121a(C4723n c4723n, Resources resources, Locale locale, File file, boolean z, C5203e c5203e) {
            float f = this.f17777I ? resources.getDisplayMetrics().density : 1.0f;
            int a = al.m32425a(resources, 256);
            if (r11 == bg.f17765u) {
                return null;
            }
            if (r11.f17773C) {
                return new C8226m(c4723n, r11, a, f, locale, false, file, C8226m.f29395e, null, c5203e);
            }
            C4870j c8205n = new C8205n(c4723n, r11, a, f, locale, false, file, null, c5203e);
            if (r11 == bg.f17750f || r11 == bg.f17751g) {
                c8205n.m34987a(120000);
            }
            return c8205n;
        }

        /* renamed from: a */
        public final C4902c mo5122a(C5203e c5203e) {
            return new C6510j(this, c5203e);
        }

        private C6509i(C6508a c6508a) {
            super(c6508a);
        }
    }

    /* renamed from: com.google.android.m4b.maps.bo.bg$j */
    static class C6510j implements C4902c {
        /* renamed from: a */
        private bg f24121a;
        /* renamed from: b */
        private C5203e f24122b;

        public C6510j(bg bgVar, C5203e c5203e) {
            this.f24121a = bgVar;
            this.f24122b = c5203e;
        }

        /* renamed from: a */
        public final az mo5126a(ba baVar, byte[] bArr, int i, long j, long j2) {
            return bo.m32230a(baVar, bArr, i, this.f24121a, j, j2, this.f24122b);
        }
    }

    /* renamed from: com.google.android.m4b.maps.bo.bg$a */
    static class C7459a extends C6509i {
        /* renamed from: E */
        private final boolean f27362E;

        /* renamed from: com.google.android.m4b.maps.bo.bg$a$a */
        static class C7458a extends C6508a {
            /* renamed from: a */
            private boolean f27361a;

            private C7458a(int i) {
                super(i);
                this.f27361a = false;
            }

            /* renamed from: a */
            final C7458a m32219a(boolean z) {
                this.f27361a = true;
                return this;
            }

            /* renamed from: a */
            final bg mo5119a() {
                return new C7459a();
            }
        }

        /* renamed from: f */
        public final boolean mo7072f() {
            return true;
        }

        /* renamed from: g */
        public final boolean mo5125g() {
            return true;
        }

        private C7459a(C7458a c7458a) {
            super(c7458a);
            this.f27362E = c7458a.f27361a;
        }

        /* renamed from: a */
        public final int mo7071a(int i, C5008i c5008i) {
            if (this.f27362E && c5008i != C5008i.HYBRID) {
                return i;
            }
            if (c5008i != C5008i.RASTER_ONLY) {
                if (c5008i != C5008i.TERRAIN) {
                    return (c5008i == C5008i.NORMAL || c5008i == C5008i.NIGHT) ? i : i & -6663;
                }
            }
            return 0;
        }

        /* renamed from: a */
        public final void mo5123a(GL10 gl10) {
            gl10.glColor4f(0.0f, 0.0f, 0.0f, 0.3f);
        }
    }

    /* renamed from: com.google.android.m4b.maps.bo.bg$e */
    static class C7461e extends C6509i {

        /* renamed from: com.google.android.m4b.maps.bo.bg$e$a */
        static class C7460a extends C6508a {
            private C7460a(int i) {
                super(i);
            }

            /* renamed from: a */
            final bg mo5119a() {
                return new C7461e();
            }
        }

        /* renamed from: g */
        public final boolean mo5125g() {
            return true;
        }

        private C7461e(C7460a c7460a) {
            super(c7460a);
        }

        /* renamed from: a */
        public final void mo5123a(GL10 gl10) {
            gl10.glColor4f(1.0f, 0.0f, 0.0f, 0.3f);
        }
    }

    /* renamed from: b */
    static /* synthetic */ int m21670b(int i) {
        return i > 160 ? 3 : 1;
    }

    /* renamed from: a */
    abstract int mo5120a();

    /* renamed from: a */
    public int mo7071a(int i, C5008i c5008i) {
        return i;
    }

    /* renamed from: a */
    public abstract C4870j mo5121a(C4723n c4723n, Resources resources, Locale locale, File file, boolean z, C5203e c5203e);

    /* renamed from: a */
    abstract C4902c mo5122a(C5203e c5203e);

    /* renamed from: a */
    public void mo5123a(GL10 gl10) {
    }

    /* renamed from: f */
    public boolean mo7072f() {
        return false;
    }

    /* renamed from: g */
    public boolean mo5125g() {
        return false;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return m21675a((bg) obj);
    }

    private bg(C4840b c4840b) {
        this.f17771A = c4840b.f17727a;
        this.f17772B = c4840b.f17728b;
        this.f17774D = c4840b.f17729c;
        this.f17773C = c4840b.f17730d;
        this.f17777I = c4840b.f17731e;
        this.f17778J = c4840b.f17732f;
        this.f17779K = c4840b.f17733g;
        this.f17780L = c4840b.f17734h;
        this.f17775G = this.f17771A + (this.f17772B << 8);
        this.f17776H = f17736F.size();
        f17736F.add(this);
        c4840b = m21681d();
        bg bgVar = (bg) f17735E.get(Integer.valueOf(c4840b));
        if (this.f17780L == null) {
            if (bgVar != null) {
                if (bgVar.f17780L == null) {
                    return;
                }
            }
            f17735E.put(Integer.valueOf(c4840b), this);
            return;
        }
        if (bgVar == null) {
            f17735E.put(Integer.valueOf(c4840b), this);
        }
    }

    /* renamed from: a */
    public final int m21675a(bg bgVar) {
        return this.f17776H - bgVar.f17776H;
    }

    /* renamed from: a */
    public final C6538c m21677a(String str, boolean z, C4881d c4881d, C5203e c5203e) {
        if (!this.f17779K) {
            return null;
        }
        int i;
        C4902c a = mo5122a(c5203e);
        if (z) {
            i = -1;
        } else {
            i = mo5120a();
        }
        return new C7470j(str, i, a, this, c4881d, c5203e);
    }

    /* renamed from: b */
    public C4904l mo5127b() {
        return new C6541k(Math.max(Math.min(256, (ao.m22338e() >> 3) * 32), 64));
    }

    /* renamed from: a */
    public static bg m21669a(int i) {
        return (bg) f17735E.get(Integer.valueOf(i));
    }

    /* renamed from: c */
    public static Iterable<bg> m21672c() {
        return f17736F;
    }

    /* renamed from: d */
    public final int m21681d() {
        return this.f17771A + this.f17772B;
    }

    /* renamed from: e */
    public final int m21682e() {
        return this.f17776H;
    }

    public String toString() {
        if (this.f17780L == null) {
            StringBuilder stringBuilder = new StringBuilder("TileType[");
            stringBuilder.append(this.f17771A);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
        stringBuilder = new StringBuilder("TileType[");
        stringBuilder.append(this.f17771A);
        stringBuilder.append(",");
        stringBuilder.append(this.f17780L);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /* renamed from: h */
    public final String m21685h() {
        return this.f17780L;
    }
}
