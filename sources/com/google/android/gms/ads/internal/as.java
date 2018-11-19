package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.support.v4.util.C0562m;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.internal.aja;
import com.google.android.gms.internal.alo;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.dn;
import com.google.android.gms.internal.dv;
import com.google.android.gms.internal.dy;
import com.google.android.gms.internal.he;
import com.google.android.gms.internal.hn;
import com.google.android.gms.internal.tb;
import com.google.android.gms.internal.zzadp;
import com.google.android.gms.internal.zzaif;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzcr;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzke;
import com.google.android.gms.internal.zzkh;
import com.google.android.gms.internal.zzkx;
import com.google.android.gms.internal.zzld;
import com.google.android.gms.internal.zzlr;
import com.google.android.gms.internal.zzmr;
import com.google.android.gms.internal.zzoa;
import com.google.android.gms.internal.zzpe;
import com.google.android.gms.internal.zzqq;
import com.google.android.gms.internal.zzqt;
import com.google.android.gms.internal.zzqw;
import com.google.android.gms.internal.zzqz;
import com.google.android.gms.internal.zzrf;
import com.google.android.gms.internal.zzzv;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

@zzzv
public final class as implements OnGlobalLayoutListener, OnScrollChangedListener {
    @Nullable
    /* renamed from: A */
    zzadp f7147A;
    @Nullable
    /* renamed from: B */
    public String f7148B;
    @Nullable
    /* renamed from: C */
    List<String> f7149C;
    @Nullable
    /* renamed from: D */
    public dv f7150D;
    @Nullable
    /* renamed from: E */
    View f7151E;
    /* renamed from: F */
    public int f7152F;
    /* renamed from: G */
    boolean f7153G;
    /* renamed from: H */
    private HashSet<dn> f7154H;
    /* renamed from: I */
    private int f7155I;
    /* renamed from: J */
    private int f7156J;
    /* renamed from: K */
    private he f7157K;
    /* renamed from: L */
    private boolean f7158L;
    /* renamed from: M */
    private boolean f7159M;
    /* renamed from: N */
    private boolean f7160N;
    /* renamed from: a */
    final String f7161a;
    /* renamed from: b */
    public String f7162b;
    /* renamed from: c */
    public final Context f7163c;
    /* renamed from: d */
    final tb f7164d;
    /* renamed from: e */
    public final zzakd f7165e;
    @Nullable
    /* renamed from: f */
    at f7166f;
    @Nullable
    /* renamed from: g */
    public dy f7167g;
    @Nullable
    /* renamed from: h */
    public zzaif f7168h;
    /* renamed from: i */
    public zzjn f7169i;
    @Nullable
    /* renamed from: j */
    public dl f7170j;
    /* renamed from: k */
    public dm f7171k;
    @Nullable
    /* renamed from: l */
    public dn f7172l;
    @Nullable
    /* renamed from: m */
    zzke f7173m;
    @Nullable
    /* renamed from: n */
    zzkh f7174n;
    @Nullable
    /* renamed from: o */
    zzkx f7175o;
    @Nullable
    /* renamed from: p */
    zzld f7176p;
    @Nullable
    /* renamed from: q */
    zzqq f7177q;
    @Nullable
    /* renamed from: r */
    zzqt f7178r;
    /* renamed from: s */
    C0562m<String, zzqw> f7179s;
    /* renamed from: t */
    C0562m<String, zzqz> f7180t;
    /* renamed from: u */
    zzpe f7181u;
    @Nullable
    /* renamed from: v */
    zzmr f7182v;
    @Nullable
    /* renamed from: w */
    zzlr f7183w;
    @Nullable
    /* renamed from: x */
    zzrf f7184x;
    @Nullable
    /* renamed from: y */
    List<Integer> f7185y;
    @Nullable
    /* renamed from: z */
    zzoa f7186z;

    public as(Context context, zzjn zzjn, String str, zzakd zzakd) {
        this(context, zzjn, str, zzakd, null);
    }

    private as(Context context, zzjn zzjn, String str, zzakd zzakd, tb tbVar) {
        this.f7150D = null;
        this.f7151E = null;
        this.f7152F = 0;
        this.f7153G = false;
        this.f7154H = null;
        this.f7155I = -1;
        this.f7156J = -1;
        this.f7158L = true;
        this.f7159M = true;
        this.f7160N = false;
        alo.a(context);
        if (ar.m8652i().e() != null) {
            List b = alo.b();
            if (zzakd.zzdej != 0) {
                b.add(Integer.toString(zzakd.zzdej));
            }
            ar.m8652i().e().a(b);
        }
        this.f7161a = UUID.randomUUID().toString();
        if (!zzjn.zzbel) {
            if (!zzjn.zzben) {
                this.f7166f = new at(context, str, zzakd.zzcv, this, this);
                this.f7166f.setMinimumWidth(zzjn.widthPixels);
                this.f7166f.setMinimumHeight(zzjn.heightPixels);
                this.f7166f.setVisibility(4);
                this.f7169i = zzjn;
                this.f7162b = str;
                this.f7163c = context;
                this.f7165e = zzakd;
                this.f7164d = new tb(new C3736f(this));
                this.f7157K = new he(200);
                this.f7180t = new C0562m();
            }
        }
        this.f7166f = null;
        this.f7169i = zzjn;
        this.f7162b = str;
        this.f7163c = context;
        this.f7165e = zzakd;
        this.f7164d = new tb(new C3736f(this));
        this.f7157K = new he(200);
        this.f7180t = new C0562m();
    }

    /* renamed from: b */
    private final void m8670b(boolean z) {
        if (this.f7166f != null && this.f7170j != null && this.f7170j.f15970b != null && this.f7170j.f15970b.zzsz() != null) {
            if (!z || this.f7157K.a()) {
                if (this.f7170j.f15970b.zzsz().b()) {
                    int[] iArr = new int[2];
                    this.f7166f.getLocationOnScreen(iArr);
                    aja.a();
                    int b = hn.b(this.f7163c, iArr[0]);
                    aja.a();
                    int b2 = hn.b(this.f7163c, iArr[1]);
                    if (!(b == this.f7155I && b2 == this.f7156J)) {
                        this.f7155I = b;
                        this.f7156J = b2;
                        this.f7170j.f15970b.zzsz().a(this.f7155I, this.f7156J, z ^ true);
                    }
                }
                if (this.f7166f != null) {
                    View findViewById = this.f7166f.getRootView().findViewById(16908290);
                    if (findViewById != null) {
                        Rect rect = new Rect();
                        Rect rect2 = new Rect();
                        this.f7166f.getGlobalVisibleRect(rect);
                        findViewById.getGlobalVisibleRect(rect2);
                        if (rect.top != rect2.top) {
                            this.f7158L = false;
                        }
                        if (rect.bottom != rect2.bottom) {
                            this.f7159M = false;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final HashSet<dn> m8671a() {
        return this.f7154H;
    }

    /* renamed from: a */
    final void m8672a(View view) {
        if (((Boolean) aja.f().a(alo.bt)).booleanValue()) {
            zzcr a = this.f7164d.a();
            if (a != null) {
                a.zzb(view);
            }
        }
    }

    /* renamed from: a */
    public final void m8673a(HashSet<dn> hashSet) {
        this.f7154H = hashSet;
    }

    /* renamed from: a */
    public final void m8674a(boolean z) {
        if (!(this.f7152F != 0 || this.f7170j == null || this.f7170j.f15970b == null)) {
            this.f7170j.f15970b.stopLoading();
        }
        if (this.f7167g != null) {
            this.f7167g.cancel();
        }
        if (this.f7168h != null) {
            this.f7168h.cancel();
        }
        if (z) {
            this.f7170j = null;
        }
    }

    /* renamed from: b */
    public final void m8675b() {
        if (this.f7170j != null && this.f7170j.f15970b != null) {
            this.f7170j.f15970b.destroy();
        }
    }

    /* renamed from: c */
    public final void m8676c() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r1 = this;
        r0 = r1.f7170j;
        if (r0 == 0) goto L_0x0017;
    L_0x0004:
        r0 = r1.f7170j;
        r0 = r0.f15983o;
        if (r0 == 0) goto L_0x0017;
    L_0x000a:
        r0 = r1.f7170j;	 Catch:{ RemoteException -> 0x0012 }
        r0 = r0.f15983o;	 Catch:{ RemoteException -> 0x0012 }
        r0.destroy();	 Catch:{ RemoteException -> 0x0012 }
        return;
    L_0x0012:
        r0 = "Could not destroy mediation adapter.";
        com.google.android.gms.internal.ec.e(r0);
    L_0x0017:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.as.c():void");
    }

    /* renamed from: d */
    public final boolean m8677d() {
        return this.f7152F == 0;
    }

    /* renamed from: e */
    public final boolean m8678e() {
        return this.f7152F == 1;
    }

    /* renamed from: f */
    public final String m8679f() {
        return (this.f7158L && this.f7159M) ? "" : this.f7158L ? this.f7160N ? "top-scrollable" : "top-locked" : this.f7159M ? this.f7160N ? "bottom-scrollable" : "bottom-locked" : "";
    }

    public final void onGlobalLayout() {
        m8670b(false);
    }

    public final void onScrollChanged() {
        m8670b(true);
        this.f7160N = true;
    }
}
