package com.google.android.m4b.maps.bt;

import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.m4b.maps.aa.au;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ay.C4712d;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.ba.C4743b;
import com.google.android.m4b.maps.bj.C4787f;
import com.google.android.m4b.maps.bo.C6523o;
import com.google.android.m4b.maps.bo.ad;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.az;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bf;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bo.bo;
import com.google.android.m4b.maps.bq.C4870j;
import com.google.android.m4b.maps.bq.C4870j.C4869a;
import com.google.android.m4b.maps.bq.C4872l;
import com.google.android.m4b.maps.bq.C8205n;
import com.google.android.m4b.maps.bq.C8226m;
import com.google.android.m4b.maps.br.C4875d;
import com.google.android.m4b.maps.bw.C4967a;
import com.google.android.m4b.maps.bw.C4976e;
import com.google.android.m4b.maps.bw.C4981g;
import com.google.android.m4b.maps.by.C5043a;
import com.google.android.m4b.maps.by.C5043a.C5042d;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.cc.C6587q;
import com.google.android.m4b.maps.cc.C7497f;
import com.google.android.m4b.maps.cc.C7504t;
import com.google.android.m4b.maps.cc.C7505u;
import com.google.android.m4b.maps.ch.C5203e;
import com.google.android.m4b.maps.p125y.C5571j;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.m4b.maps.bt.c */
public class C4909c {
    /* renamed from: a */
    private static final C6587q f18034a = new C7505u();
    /* renamed from: b */
    private C5043a f18035b;
    /* renamed from: c */
    private final C4870j f18036c;
    /* renamed from: d */
    private volatile C5042d f18037d;
    /* renamed from: e */
    private final C4967a f18038e;
    /* renamed from: f */
    private final List<C8226m> f18039f;
    /* renamed from: g */
    private bf f18040g;
    /* renamed from: h */
    private final C4976e<ba, ba> f18041h;
    /* renamed from: i */
    private final C4869a f18042i;
    /* renamed from: j */
    private AtomicInteger f18043j;
    /* renamed from: k */
    private final Set<C5042d> f18044k;
    /* renamed from: l */
    private final LinkedList<C4908d> f18045l;
    /* renamed from: m */
    private Map<ba, Long> f18046m;
    /* renamed from: n */
    private Map<ba, Pair<C4907b, Long>> f18047n;
    /* renamed from: o */
    private volatile int f18048o;
    /* renamed from: p */
    private final C4906a f18049p;
    /* renamed from: q */
    private C4907b f18050q;
    /* renamed from: r */
    private final C4875d f18051r;
    /* renamed from: s */
    private final C4875d f18052s;
    /* renamed from: t */
    private final C6545c f18053t;
    /* renamed from: u */
    private volatile long f18054u;
    /* renamed from: v */
    private volatile C5052d f18055v;
    /* renamed from: w */
    private final C5203e f18056w;
    /* renamed from: x */
    private final C4981g f18057x;

    /* renamed from: com.google.android.m4b.maps.bt.c$d */
    public interface C4908d {
        /* renamed from: a */
        void mo5215a(ba baVar, C6587q c6587q, boolean z);
    }

    /* renamed from: com.google.android.m4b.maps.bt.c$1 */
    class C65421 implements C4869a {
        /* renamed from: a */
        private /* synthetic */ C4909c f24270a;

        C65421(C4909c c4909c) {
            this.f24270a = c4909c;
        }

        /* renamed from: a */
        public final void mo5092a() {
            synchronized (this.f24270a.f18044k) {
                this.f24270a.f18044k.add(this.f24270a.f18037d);
            }
        }

        /* renamed from: a */
        public final void mo5093a(az azVar) {
            if (azVar != null) {
                C4909c.m21982a(this.f24270a, azVar.mo5099d(), this.f24270a.m21978a(azVar.mo5099d(), 0, azVar), 0);
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.bt.c$a */
    class C6543a implements C4875d {
        /* renamed from: a */
        private /* synthetic */ C4909c f24271a;

        private C6543a(C4909c c4909c) {
            this.f24271a = c4909c;
        }

        /* renamed from: a */
        public final void mo5079a(ba baVar, int i, az azVar) {
            if (i != 3) {
                C6587q a = this.f24271a.m21978a(baVar, i, azVar);
                if (a != 0) {
                    Long l = (Long) this.f24271a.f18046m.remove(baVar);
                    if (l == null) {
                        if (C4728u.m21050a("TileFetcher", 6) != 0) {
                            baVar = String.valueOf(baVar);
                            azVar = new StringBuilder(String.valueOf(baVar).length() + 25);
                            azVar.append("Received an unknown tile ");
                            azVar.append(baVar);
                            Log.e("TileFetcher", azVar.toString());
                        }
                        return;
                    }
                    C4909c.m21982a(this.f24271a, baVar, a, SystemClock.elapsedRealtime() - l.longValue());
                }
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.bt.c$b */
    class C6544b implements C4875d {
        /* renamed from: a */
        private /* synthetic */ C4909c f24272a;

        private C6544b(C4909c c4909c) {
            this.f24272a = c4909c;
        }

        /* renamed from: a */
        private C6587q m28855a(C4907b c4907b) {
            C6587q b = this.f24272a.mo5165b(c4907b.f18031a);
            if (b != null && b.mo7134a(C4712d.m20955a())) {
                this.f24272a.m21984a(c4907b.f18031a, b);
                return b;
            } else if (b != null) {
                return b;
            } else {
                Pair pair = (Pair) this.f24272a.f18047n.get(c4907b.f18031a);
                if (pair != null) {
                    if (c4907b.f18032b) {
                        this.f24272a.f18047n.remove(c4907b.f18031a);
                        this.f24272a.f18048o = this.f24272a.f18048o - 1;
                    } else {
                        this.f24272a.f18047n.put(c4907b.f18031a, Pair.create(c4907b, pair.second));
                    }
                    return C4909c.f18034a;
                }
                synchronized (this.f24272a.f18049p) {
                    if (this.f24272a.f18049p.m21973a(c4907b)) {
                        this.f24272a.f18047n.put(c4907b.f18031a, Pair.create(c4907b, Long.valueOf(SystemClock.elapsedRealtime())));
                        this.f24272a.f18048o = this.f24272a.f18048o + 1;
                        this.f24272a.m21981a(c4907b.f18031a, c4907b.f18032b, this.f24272a.f18052s);
                    }
                }
                return b;
            }
        }

        /* renamed from: a */
        private void m28856a(C4907b c4907b, boolean z) {
            while (true) {
                c4907b = this.f24272a.f18049p.m21970a(c4907b, z);
                if (c4907b != null) {
                    z = m28855a(c4907b);
                    if (z) {
                        z = z != C4909c.f18034a;
                    } else {
                        return;
                    }
                }
                return;
            }
        }

        /* renamed from: a */
        public final void mo5079a(ba baVar, int i, az azVar) {
            C6587q c6587q = null;
            boolean z = true;
            if (baVar == C4870j.f17879d) {
                synchronized (this.f24272a.f18049p) {
                    baVar = this.f24272a.f18050q;
                    this.f24272a.f18050q = null;
                }
                m28856a(baVar, true);
                return;
            }
            Pair pair = (Pair) this.f24272a.f18047n.get(baVar);
            if (pair == null) {
                if (C4728u.m21050a("TileFetcher", 6) != 0) {
                    baVar = String.valueOf(baVar);
                    azVar = new StringBuilder(String.valueOf(baVar).length() + 25);
                    azVar.append("Received an unknown tile ");
                    azVar.append(baVar);
                    Log.e("TileFetcher", azVar.toString());
                }
                return;
            }
            if (this.f24272a.f18049p.m21973a((C4907b) pair.first)) {
                if (i == 3) {
                    z = ((C4907b) pair.first).f18032b;
                } else {
                    c6587q = this.f24272a.m21978a(baVar, i, azVar);
                    if (!(c6587q == null || c6587q == C4909c.f18034a)) {
                        i = 1;
                        azVar = true;
                        if (i != 0) {
                            this.f24272a.f18047n.remove(baVar);
                            this.f24272a.f18048o = this.f24272a.f18048o - 1;
                        }
                        if (azVar != null) {
                            m28856a((C4907b) pair.first, z);
                        }
                        if (c6587q != null) {
                            C4909c.m21982a(this.f24272a, baVar, c6587q, SystemClock.elapsedRealtime() - ((Long) pair.second).longValue());
                        }
                    }
                }
                i = 1;
            } else {
                i = 0;
            }
            azVar = i;
            i = z;
            z = false;
            if (i != 0) {
                this.f24272a.f18047n.remove(baVar);
                this.f24272a.f18048o = this.f24272a.f18048o - 1;
            }
            if (azVar != null) {
                m28856a((C4907b) pair.first, z);
            }
            if (c6587q != null) {
                C4909c.m21982a(this.f24272a, baVar, c6587q, SystemClock.elapsedRealtime() - ((Long) pair.second).longValue());
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.bt.c$c */
    class C6545c implements C4875d {
        /* renamed from: a */
        private /* synthetic */ C4909c f24273a;

        private C6545c(C4909c c4909c) {
            this.f24273a = c4909c;
        }

        /* renamed from: a */
        public final void mo5079a(ba baVar, int i, az azVar) {
            if (i != 3) {
                C6587q b = this.f24273a.m21987b(baVar, i, azVar);
                if (b != null) {
                    C4909c.m21982a(this.f24273a, azVar.mo5099d(), b, 0);
                }
            }
        }
    }

    public C4909c(bg bgVar, C4906a c4906a, C5203e c5203e, C4981g c4981g) {
        this(bgVar, new C5042d(bgVar, null), c4906a, C4967a.f18341a, c5203e, c4981g);
    }

    public C4909c(bg bgVar, C5042d c5042d, C4906a c4906a, C4967a c4967a, C5203e c5203e, C4981g c4981g) {
        this.f18041h = new C4976e(MapboxConstants.ANIMATION_DURATION);
        this.f18043j = new AtomicInteger(0);
        this.f18044k = new TreeSet();
        this.f18046m = Collections.synchronizedMap(ax.m20623b());
        this.f18047n = ax.m20623b();
        this.f18048o = 0;
        this.f18051r = new C6543a();
        this.f18052s = new C6544b();
        this.f18053t = new C6545c();
        this.f18037d = c5042d;
        this.f18035b = null;
        this.f18038e = c4967a;
        this.f18039f = new ArrayList();
        this.f18045l = new LinkedList();
        if (C4872l.m21829a(bgVar) != null) {
            this.f18036c = C4872l.m21830b(bgVar);
            this.f18042i = new C65421(this);
            this.f18036c.mo7080a(this.f18042i);
        } else {
            this.f18036c = null;
            this.f18042i = null;
        }
        this.f18049p = c4906a;
        this.f18056w = c5203e;
        this.f18057x = c4981g;
    }

    /* renamed from: a */
    public C6587q mo5164a(ba baVar) {
        C6587q a = this.f18035b.m22555a(this.f18055v, this.f18037d, baVar, false);
        if (a == f18034a) {
            return null;
        }
        if (a != null) {
            if (!a.mo7138b(C4712d.m20955a())) {
                return a;
            }
        }
        baVar = this.f18035b.m22555a(this.f18055v, this.f18037d, baVar.m21611a(), false);
        if (baVar == f18034a) {
            return null;
        }
        if (baVar != null) {
            if (!baVar.mo7138b(C4712d.m20955a())) {
                return baVar;
            }
        }
        this.f18043j.incrementAndGet();
        return null;
    }

    /* renamed from: b */
    protected C6587q mo5165b(ba baVar) {
        baVar = this.f18035b.m22555a(this.f18055v, this.f18037d, baVar, true);
        return (baVar == f18034a || baVar == null || !baVar.mo7138b(C4712d.m20955a())) ? baVar : null;
    }

    /* renamed from: a */
    private boolean m21984a(ba baVar, C6587q c6587q) {
        if (c6587q != null) {
            if (c6587q.mo7134a(C4712d.m20955a()) == null) {
                return false;
            }
        }
        if (this.f18046m.put(baVar, Long.valueOf(SystemClock.elapsedRealtime())) == null) {
            m21981a(baVar, false, this.f18051r);
        }
        return true;
    }

    /* renamed from: a */
    private void m21981a(ba baVar, boolean z, C4875d c4875d) {
        synchronized (this.f18041h) {
            this.f18041h.m22254c(baVar);
        }
        if (this.f18036c != null) {
            if (z) {
                this.f18036c.mo7082b(baVar, c4875d);
            } else {
                this.f18036c.mo7079a(baVar, c4875d);
            }
        }
        if (baVar != C8205n.d) {
            synchronized (this.f18039f) {
                c4875d = null;
                if (!(this.f18036c == null || this.f18039f.isEmpty())) {
                    c4875d = (bo) this.f18036c.mo7076a(baVar, true);
                }
                for (C8226m a : this.f18039f) {
                    a.m35050a(baVar, c4875d, this.f18053t);
                }
            }
        }
    }

    /* renamed from: a */
    public final bg m21997a() {
        return this.f18036c.mo7084e();
    }

    /* renamed from: b */
    public final int m22007b() {
        return this.f18043j.get();
    }

    /* renamed from: c */
    public final void m22010c() {
        this.f18035b.m22567d(this.f18055v, this.f18037d);
    }

    /* renamed from: d */
    public final void m22011d() {
        if (C4743b.f17387a) {
            this.f18035b.m22566c(this.f18055v, this.f18037d);
        }
    }

    /* renamed from: a */
    public final void m22000a(C4787f c4787f, af afVar, List<ba> list, Set<ba> set, Set<ba> set2, boolean z) {
        this.f18035b.m22567d(this.f18055v, this.f18037d);
        synchronized (this.f18049p) {
            this.f18049p.m21972a(c4787f, afVar, list, set, null, z);
            c4787f = this.f18049p.m21974b();
            if (this.f18050q == null) {
                m21981a(c4787f.f18031a, c4787f.f18032b, this.f18052s);
            }
            this.f18050q = c4787f;
        }
    }

    /* renamed from: e */
    public final void m22012e() {
        this.f18049p.m21971a();
    }

    /* renamed from: a */
    public final void m22005a(List<C6587q> list) {
        List b = au.m20529b(list.size());
        for (C6587q c6587q : list) {
            if (c6587q != f18034a) {
                b.add(c6587q.mo7136b());
            }
        }
        this.f18035b.m22559a(this.f18055v, this.f18037d, b);
    }

    /* renamed from: b */
    public final void m22009b(List<C6587q> list) {
        List b = au.m20529b(list.size());
        for (C6587q c6587q : list) {
            if (c6587q != f18034a) {
                b.add(c6587q.mo7136b());
            }
        }
        this.f18035b.m22564b(this.f18055v, this.f18037d, b);
    }

    /* renamed from: a */
    public final void m22004a(C5052d c5052d) {
        C5571j.m24293a((Object) c5052d, (Object) "GLState should not be null");
        this.f18055v = c5052d;
        C5043a.m22550a(new C4712d());
        this.f18035b = C5043a.m22547a();
    }

    /* renamed from: a */
    public final void m22006a(boolean z) {
        if (this.f18035b != null) {
            this.f18035b.m22560a(z);
        }
    }

    /* renamed from: f */
    public final void m22013f() {
        if (this.f18035b != null) {
            this.f18035b.m22561b();
        }
    }

    /* renamed from: g */
    public final boolean m22014g() {
        if (this.f18044k.isEmpty()) {
            return false;
        }
        synchronized (this.f18044k) {
            for (C5042d c5042d : this.f18044k) {
                if (this.f18035b != null) {
                    this.f18035b.m22557a(this.f18055v, c5042d);
                }
            }
            this.f18044k.clear();
        }
        return true;
    }

    /* renamed from: h */
    public final void m22015h() {
        if (this.f18035b != null) {
            this.f18035b.m22563b(this.f18055v, this.f18037d);
            m22014g();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void m22002a(com.google.android.m4b.maps.bo.bg r4) {
        /*
        r3 = this;
        r0 = r3.f18036c;
        r0 = r0 instanceof com.google.android.m4b.maps.bq.C8205n;
        if (r0 != 0) goto L_0x0036;
    L_0x0006:
        r4 = new java.lang.UnsupportedOperationException;
        r0 = r3.f18036c;
        r0 = r0.mo7084e();
        r0 = java.lang.String.valueOf(r0);
        r1 = new java.lang.StringBuilder;
        r2 = java.lang.String.valueOf(r0);
        r2 = r2.length();
        r2 = r2 + 35;
        r1.<init>(r2);
        r2 = "Modifiers not supported on store '";
        r1.append(r2);
        r1.append(r0);
        r0 = "'";
        r1.append(r0);
        r0 = r1.toString();
        r4.<init>(r0);
        throw r4;
    L_0x0036:
        r0 = r4.f17773C;
        if (r0 != 0) goto L_0x005f;
    L_0x003a:
        r0 = new java.lang.IllegalArgumentException;
        r4 = java.lang.String.valueOf(r4);
        r1 = new java.lang.StringBuilder;
        r2 = java.lang.String.valueOf(r4);
        r2 = r2.length();
        r2 = r2 + 33;
        r1.<init>(r2);
        r2 = "Only modifiers may be added, not ";
        r1.append(r2);
        r1.append(r4);
        r4 = r1.toString();
        r0.<init>(r4);
        throw r0;
    L_0x005f:
        r0 = com.google.android.m4b.maps.bq.C4872l.m21829a(r4);
        if (r0 == 0) goto L_0x00fc;
    L_0x0065:
        r4 = com.google.android.m4b.maps.bq.C4872l.m21830b(r4);
        r0 = r4 instanceof com.google.android.m4b.maps.bq.C8226m;
        if (r0 != 0) goto L_0x009b;
    L_0x006d:
        r0 = new java.lang.UnsupportedOperationException;
        r4 = r4.mo7084e();
        r4 = java.lang.String.valueOf(r4);
        r1 = new java.lang.StringBuilder;
        r2 = java.lang.String.valueOf(r4);
        r2 = r2.length();
        r2 = r2 + 49;
        r1.<init>(r2);
        r2 = "Modifier store '";
        r1.append(r2);
        r1.append(r4);
        r4 = "' must be a vector modifier store";
        r1.append(r4);
        r4 = r1.toString();
        r0.<init>(r4);
        throw r0;
    L_0x009b:
        r0 = r3.f18039f;
        monitor-enter(r0);
        r1 = r3.f18039f;	 Catch:{ all -> 0x00f9 }
        r1 = r1.contains(r4);	 Catch:{ all -> 0x00f9 }
        if (r1 == 0) goto L_0x00a8;
    L_0x00a6:
        monitor-exit(r0);	 Catch:{ all -> 0x00f9 }
        return;
    L_0x00a8:
        r1 = r3.f18042i;	 Catch:{ all -> 0x00f9 }
        r4.mo7080a(r1);	 Catch:{ all -> 0x00f9 }
        r1 = r3.f18039f;	 Catch:{ all -> 0x00f9 }
        r4 = (com.google.android.m4b.maps.bq.C8226m) r4;	 Catch:{ all -> 0x00f9 }
        r1.add(r4);	 Catch:{ all -> 0x00f9 }
        monitor-exit(r0);	 Catch:{ all -> 0x00f9 }
        r4 = new java.util.TreeSet;
        r4.<init>();
        r1 = r3.f18039f;
        monitor-enter(r1);
        r0 = r3.f18039f;	 Catch:{ all -> 0x00f6 }
        r0 = r0.iterator();	 Catch:{ all -> 0x00f6 }
    L_0x00c3:
        r2 = r0.hasNext();	 Catch:{ all -> 0x00f6 }
        if (r2 == 0) goto L_0x00d7;
    L_0x00c9:
        r2 = r0.next();	 Catch:{ all -> 0x00f6 }
        r2 = (com.google.android.m4b.maps.bq.C8226m) r2;	 Catch:{ all -> 0x00f6 }
        r2 = r2.mo7084e();	 Catch:{ all -> 0x00f6 }
        r4.add(r2);	 Catch:{ all -> 0x00f6 }
        goto L_0x00c3;
    L_0x00d7:
        monitor-exit(r1);	 Catch:{ all -> 0x00f6 }
        r0 = r3.f18044k;
        monitor-enter(r0);
        r1 = r3.f18044k;	 Catch:{ all -> 0x00f3 }
        r2 = r3.f18037d;	 Catch:{ all -> 0x00f3 }
        r1.add(r2);	 Catch:{ all -> 0x00f3 }
        monitor-exit(r0);	 Catch:{ all -> 0x00f3 }
        r0 = new com.google.android.m4b.maps.by.a$d;
        r1 = r3.f18036c;
        r1 = r1.mo7084e();
        r2 = r3.f18038e;
        r0.<init>(r1, r4, r2);
        r3.f18037d = r0;
        return;
    L_0x00f3:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00f3 }
        throw r4;
    L_0x00f6:
        r4 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00f6 }
        throw r4;
    L_0x00f9:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00f9 }
        throw r4;
    L_0x00fc:
        r0 = new java.lang.IllegalArgumentException;
        r4 = java.lang.String.valueOf(r4);
        r1 = new java.lang.StringBuilder;
        r2 = java.lang.String.valueOf(r4);
        r2 = r2.length();
        r2 = r2 + 19;
        r1.<init>(r2);
        r2 = "Unknown tile store ";
        r1.append(r2);
        r1.append(r4);
        r4 = r1.toString();
        r0.<init>(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bt.c.a(com.google.android.m4b.maps.bo.bg):void");
    }

    /* renamed from: a */
    private C6587q m21978a(ba baVar, int i, az azVar) {
        synchronized (this.f18041h) {
            this.f18041h.m22255c(baVar, baVar);
        }
        C6587q c6587q = null;
        if (!this.f18040g.m21650a(baVar.m21627j())) {
            return null;
        }
        if (!(this.f18039f.isEmpty() || baVar.m21627j() == null || !(azVar instanceof bo))) {
            bo boVar;
            synchronized (this.f18039f) {
                boVar = azVar;
                for (C8226m a : this.f18039f) {
                    az a2 = a.mo7076a(baVar, true);
                    if (a2 != null) {
                        boVar = ad.m34214a(boVar, (bo) a2, this.f18056w);
                    } else {
                        bo boVar2 = (bo) azVar;
                    }
                }
            }
            azVar = boVar;
        }
        C5052d c5052d = this.f18055v;
        if (c5052d != null && i == 0) {
            if (azVar instanceof bo) {
                azVar = C7504t.m32731a(azVar, this.f18038e, c5052d, this.f18057x);
            } else if (azVar instanceof C6523o) {
                azVar = C7497f.m32621a(azVar, c5052d);
            }
            if (azVar != null) {
                if (i == 2) {
                    c6587q = f18034a;
                }
                return c6587q;
            }
            c6587q = azVar;
            if (this.f18035b != 0) {
                this.f18035b.m22558a(c5052d, this.f18037d, baVar, c6587q);
            }
            return c6587q;
        }
        azVar = null;
        if (azVar != null) {
            c6587q = azVar;
        } else {
            if (i == 2) {
                c6587q = f18034a;
            }
            return c6587q;
        }
        if (this.f18035b != 0) {
            this.f18035b.m22558a(c5052d, this.f18037d, baVar, c6587q);
        }
        return c6587q;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private com.google.android.m4b.maps.cc.C6587q m21987b(com.google.android.m4b.maps.bo.ba r7, int r8, com.google.android.m4b.maps.bo.az r9) {
        /*
        r6 = this;
        r0 = 0;
        if (r9 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r9 = (com.google.android.m4b.maps.bo.bo) r9;
        r1 = r9.m32255p();
        if (r1 != 0) goto L_0x0032;
    L_0x000c:
        r1 = r9.mo7073a();
        r3 = 0;
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 >= 0) goto L_0x0017;
    L_0x0016:
        return r0;
    L_0x0017:
        r1 = r6.f18035b;
        r2 = r6.f18055v;
        r3 = r6.f18037d;
        r4 = 0;
        r1 = r1.m22555a(r2, r3, r7, r4);
        if (r1 == 0) goto L_0x0032;
    L_0x0024:
        r2 = f18034a;
        if (r1 == r2) goto L_0x0032;
    L_0x0028:
        r1 = (com.google.android.m4b.maps.cc.C7504t) r1;
        r7 = r9.mo7073a();
        r1.m32745b(r7);
        return r0;
    L_0x0032:
        r9 = r6.f18041h;
        monitor-enter(r9);
        r1 = r6.f18041h;	 Catch:{ all -> 0x004f }
        r1 = r1.m22246a(r7);	 Catch:{ all -> 0x004f }
        if (r1 != 0) goto L_0x003f;
    L_0x003d:
        monitor-exit(r9);	 Catch:{ all -> 0x004f }
        return r0;
    L_0x003f:
        monitor-exit(r9);	 Catch:{ all -> 0x004f }
        r9 = r6.f18036c;
        r1 = 1;
        r9 = r9.mo7076a(r7, r1);
        if (r9 == 0) goto L_0x004e;
    L_0x0049:
        r7 = r6.m21978a(r7, r8, r9);
        return r7;
    L_0x004e:
        return r0;
    L_0x004f:
        r7 = move-exception;
        monitor-exit(r9);	 Catch:{ all -> 0x004f }
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bt.c.b(com.google.android.m4b.maps.bo.ba, int, com.google.android.m4b.maps.bo.az):com.google.android.m4b.maps.cc.q");
    }

    /* renamed from: a */
    public final void m22003a(C4908d c4908d) {
        synchronized (this.f18045l) {
            this.f18045l.remove(c4908d);
            this.f18045l.add(c4908d);
        }
    }

    /* renamed from: a */
    public final void m21999a(long j) {
        this.f18054u = j;
        if (this.f18035b != null) {
            j = this.f18035b;
        }
    }

    /* renamed from: a */
    public final void m22001a(bf bfVar) {
        this.f18040g = bfVar;
    }

    /* renamed from: a */
    static /* synthetic */ void m21982a(C4909c c4909c, ba baVar, C6587q c6587q, long j) {
        if (c6587q != null) {
            ArrayList arrayList;
            if (c6587q == f18034a) {
                c6587q = null;
            }
            int i = 0;
            if (c4909c.f18046m.size() == null && c4909c.f18048o == null) {
                if (c4909c.f18049p == null || c4909c.f18049p.m21975c() != null) {
                    j = null;
                    synchronized (c4909c.f18045l) {
                        if (c4909c.f18045l.size() != 1) {
                            ((C4908d) c4909c.f18045l.get(0)).mo5215a(baVar, c6587q, j);
                        } else {
                            arrayList = new ArrayList(c4909c.f18045l.size());
                            arrayList.addAll(c4909c.f18045l);
                            while (i < arrayList.size()) {
                                ((C4908d) arrayList.get(i)).mo5215a(baVar, c6587q, j);
                                i++;
                            }
                        }
                    }
                }
            }
            j = 1;
            synchronized (c4909c.f18045l) {
                if (c4909c.f18045l.size() != 1) {
                    arrayList = new ArrayList(c4909c.f18045l.size());
                    arrayList.addAll(c4909c.f18045l);
                    while (i < arrayList.size()) {
                        ((C4908d) arrayList.get(i)).mo5215a(baVar, c6587q, j);
                        i++;
                    }
                } else {
                    ((C4908d) c4909c.f18045l.get(0)).mo5215a(baVar, c6587q, j);
                }
            }
        }
    }
}
