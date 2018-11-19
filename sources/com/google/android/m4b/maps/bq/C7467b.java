package com.google.android.m4b.maps.bq;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import android.util.Pair;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ay.C4712d;
import com.google.android.m4b.maps.ay.C4718l;
import com.google.android.m4b.maps.ay.C4723n;
import com.google.android.m4b.maps.ay.C4724o;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.ay.C6409f;
import com.google.android.m4b.maps.az.C4733b;
import com.google.android.m4b.maps.bo.ad;
import com.google.android.m4b.maps.bo.az;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bb;
import com.google.android.m4b.maps.bo.bd.C4839a;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bo.bo;
import com.google.android.m4b.maps.bq.C4867g.C4866a;
import com.google.android.m4b.maps.bq.C4870j.C4869a;
import com.google.android.m4b.maps.bq.C8066a.C4861b;
import com.google.android.m4b.maps.br.C4875d;
import com.google.android.m4b.maps.bs.C4904l;
import com.google.android.m4b.maps.bs.C6538c;
import com.google.android.m4b.maps.bw.C4976e;
import com.google.android.m4b.maps.bx.ao;
import com.google.android.m4b.maps.ch.C5203e;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.google.android.m4b.maps.bq.b */
public abstract class C7467b extends Thread implements C4724o, C6536f, C4870j {
    /* renamed from: a */
    protected C4871k f27388a;
    /* renamed from: b */
    protected final bg f27389b;
    /* renamed from: c */
    protected final C5203e f27390c;
    /* renamed from: e */
    private volatile C4863b f27391e;
    /* renamed from: f */
    private final ReentrantLock f27392f = new ReentrantLock();
    /* renamed from: g */
    private final C4723n f27393g;
    /* renamed from: h */
    private Handler f27394h;
    /* renamed from: i */
    private Looper f27395i;
    /* renamed from: j */
    private boolean f27396j;
    /* renamed from: k */
    private C7466a f27397k;
    /* renamed from: l */
    private final List<C7466a> f27398l = new LinkedList();
    /* renamed from: m */
    private final C4976e<ba, C6533d> f27399m;
    /* renamed from: n */
    private final Map<ba, C6533d> f27400n = new HashMap();
    /* renamed from: o */
    private final int f27401o;
    /* renamed from: p */
    private volatile int f27402p;
    /* renamed from: q */
    private volatile int f27403q;
    /* renamed from: r */
    private volatile int f27404r;
    /* renamed from: s */
    private boolean f27405s = false;
    /* renamed from: t */
    private final ArrayList<WeakReference<C4869a>> f27406t = new ArrayList();
    /* renamed from: u */
    private volatile boolean f27407u = false;
    /* renamed from: v */
    private final C4875d f27408v = new C65301(this);

    /* renamed from: com.google.android.m4b.maps.bq.b$3 */
    class C48623 extends Handler {
        /* renamed from: a */
        private /* synthetic */ C7467b f17865a;

        C48623(C7467b c7467b) {
            this.f17865a = c7467b;
        }

        public final void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.f17865a.m32307b((C6533d) message.obj);
                    return;
                case 2:
                    C7467b.m32301a(this.f17865a);
                    return;
                case 3:
                    C7467b.m32304a(this.f17865a, (C7466a) message.obj);
                    return;
                case 4:
                    this.f17865a.f27405s = true;
                    return;
                case 5:
                    synchronized (message.obj) {
                        message.obj.notify();
                    }
                    C7467b.m32310c(this.f17865a);
                    return;
                case 6:
                    Pair pair = (Pair) message.obj;
                    C7467b.m32303a(this.f17865a, (bb) ((Pair) pair.first).first, (C4861b) ((Pair) pair.first).second, (C4875d) pair.second);
                    break;
                default:
                    break;
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.bq.b$b */
    class C4863b extends Thread {
        /* renamed from: a */
        private volatile boolean f17866a;
        /* renamed from: b */
        private volatile boolean f17867b;
        /* renamed from: c */
        private /* synthetic */ C7467b f17868c;

        C4863b(C7467b c7467b) {
            this.f17868c = c7467b;
            String str = "CacheCommitter:";
            String valueOf = String.valueOf(c7467b.getName());
            super(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            if (c7467b.f27401o < null) {
                this.f17867b = true;
            } else {
                start();
            }
        }

        public final void run() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r6 = this;
            r0 = 1;
            r1 = com.google.android.m4b.maps.bx.ao.m22336c();	 Catch:{ SecurityException -> 0x000a }
            r1 = r1 + r0;	 Catch:{ SecurityException -> 0x000a }
            android.os.Process.setThreadPriority(r1);	 Catch:{ SecurityException -> 0x000a }
            goto L_0x001b;
        L_0x000a:
            r1 = move-exception;
            r2 = "DashServerTileStore";
            r3 = 6;
            r2 = com.google.android.m4b.maps.ay.C4728u.m21050a(r2, r3);
            if (r2 == 0) goto L_0x001b;
        L_0x0014:
            r2 = "DashServerTileStore";
            r3 = "Could not set thread priority";
            android.util.Log.e(r2, r3, r1);
        L_0x001b:
            r1 = r6.f17868c;
            r1 = r1.f27388a;
            r1 = r1.m21824b();
            if (r1 != 0) goto L_0x0026;
        L_0x0025:
            return;
        L_0x0026:
            r2 = r6.f17866a;
            r3 = 0;
            if (r2 != 0) goto L_0x003c;
        L_0x002b:
            r2 = r6.f17868c;
            r2 = r2.f27407u;
            if (r2 == 0) goto L_0x003c;
        L_0x0033:
            r2 = r6.f17868c;
            r2.f27407u = false;
            r1.g_();
            goto L_0x0062;
        L_0x003c:
            r6.f17866a = r3;
            r2 = r6.f17868c;	 Catch:{ InterruptedException -> 0x006a }
            r2 = r2.f27401o;	 Catch:{ InterruptedException -> 0x006a }
        L_0x0044:
            if (r2 <= 0) goto L_0x0056;	 Catch:{ InterruptedException -> 0x006a }
        L_0x0046:
            r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ InterruptedException -> 0x006a }
            com.google.android.m4b.maps.bq.C7467b.C4863b.sleep(r4);	 Catch:{ InterruptedException -> 0x006a }
            r4 = r6.f17868c;	 Catch:{ InterruptedException -> 0x006a }
            r4 = r4.f27407u;	 Catch:{ InterruptedException -> 0x006a }
            if (r4 != 0) goto L_0x0056;	 Catch:{ InterruptedException -> 0x006a }
        L_0x0053:
            r2 = r2 + -1000;	 Catch:{ InterruptedException -> 0x006a }
            goto L_0x0044;	 Catch:{ InterruptedException -> 0x006a }
        L_0x0056:
            r2 = r6.f17866a;	 Catch:{ InterruptedException -> 0x006a }
            if (r2 != 0) goto L_0x003c;	 Catch:{ InterruptedException -> 0x006a }
        L_0x005a:
            r2 = r6.f17868c;	 Catch:{ InterruptedException -> 0x006a }
            r2.f27407u = false;	 Catch:{ InterruptedException -> 0x006a }
            r1.g_();	 Catch:{ InterruptedException -> 0x006a }
        L_0x0062:
            r6.f17867b = r0;
            r0 = r6.f17868c;
            r0.m32316h();
            return;
        L_0x006a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bq.b.b.run():void");
        }

        /* renamed from: a */
        final void m21797a() {
            this.f17866a = true;
        }

        /* renamed from: b */
        final boolean m21798b() {
            return this.f17867b;
        }
    }

    /* renamed from: com.google.android.m4b.maps.bq.b$1 */
    class C65301 implements C4875d {
        /* renamed from: a */
        private /* synthetic */ C7467b f24234a;

        C65301(C7467b c7467b) {
            this.f24234a = c7467b;
        }

        /* renamed from: a */
        public final void mo5079a(ba baVar, int i, az azVar) {
            if (i == 0) {
                C7467b.m32302a(this.f24234a, azVar);
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.bq.b$c */
    public static class C6532c implements C4875d {
        /* renamed from: a */
        private az f24236a;

        protected C6532c() {
        }

        /* renamed from: a */
        public final void mo5079a(ba baVar, int i, az azVar) {
            if (i == 0) {
                this.f24236a = azVar;
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.bq.b$d */
    public static class C6533d implements C4866a {
        /* renamed from: a */
        final ba f24237a;
        /* renamed from: b */
        final C4875d f24238b;
        /* renamed from: c */
        final boolean f24239c;
        /* renamed from: d */
        final C4861b f24240d;
        /* renamed from: e */
        final boolean f24241e;
        /* renamed from: f */
        final boolean f24242f;
        /* renamed from: g */
        final boolean f24243g;
        /* renamed from: h */
        final bg f24244h;
        /* renamed from: i */
        int f24245i;
        /* renamed from: j */
        volatile boolean f24246j;
        /* renamed from: k */
        private C6533d f24247k;

        protected C6533d(bg bgVar, ba baVar, C4875d c4875d, C4861b c4861b, boolean z, boolean z2, int i, boolean z3) {
            boolean z4 = false;
            this.f24246j = false;
            this.f24247k = null;
            this.f24244h = bgVar;
            this.f24237a = baVar;
            this.f24238b = c4875d;
            this.f24240d = c4861b;
            if (!(c4861b.equals(C4861b.PREFETCH_AREA) == null && c4861b.equals(C4861b.PREFETCH_ROUTE) == null)) {
                z4 = true;
            }
            this.f24239c = z4;
            this.f24241e = z;
            this.f24245i = i;
            this.f24242f = z2;
            this.f24243g = z3;
        }

        protected C6533d(bg bgVar, ba baVar, C4875d c4875d) {
            this(bgVar, baVar, c4875d, C4861b.NORMAL, false, false, -1, false);
        }

        protected C6533d(bg bgVar, ba baVar, C4875d c4875d, boolean z, boolean z2) {
            this(bgVar, baVar, c4875d, C4861b.NORMAL, false, true, -1, false);
        }

        /* renamed from: a */
        public final void mo5148a() {
            this.f24246j = true;
        }

        /* renamed from: b */
        protected final boolean m28801b() {
            return this.f24247k != null;
        }

        /* renamed from: a */
        final void m28800a(C6533d c6533d) {
            c6533d.f24247k = this.f24247k;
            this.f24247k = c6533d;
        }

        public final String toString() {
            String valueOf = String.valueOf(this.f24244h);
            String valueOf2 = String.valueOf(this.f24237a);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length());
            stringBuilder.append(valueOf);
            stringBuilder.append("/");
            stringBuilder.append(valueOf2);
            return stringBuilder.toString();
        }
    }

    /* renamed from: com.google.android.m4b.maps.bq.b$a */
    public static abstract class C7466a extends C6409f {
        /* renamed from: a */
        private final C6533d[] f27383a = new C6533d[8];
        /* renamed from: b */
        private int f27384b = 0;
        /* renamed from: c */
        private C7467b f27385c;
        /* renamed from: d */
        private final Map<Pair<Long, String>, Integer> f27386d = ax.m20623b();
        /* renamed from: e */
        private final C5203e f27387e;

        /* renamed from: a */
        protected boolean mo7548a(C6533d c6533d) {
            return true;
        }

        /* renamed from: b */
        protected abstract az mo7549b(int i);

        /* renamed from: c */
        protected byte[] mo7637c(int i) {
            return null;
        }

        /* renamed from: h */
        protected int mo7075h() {
            return -1;
        }

        protected C7466a(int i, C5203e c5203e) {
            this.f27387e = c5203e;
        }

        /* renamed from: a */
        protected final void m32289a(Pair<Long, String> pair, C6533d c6533d) {
            if (pair.second == null) {
                pair = new Pair(pair.first, "");
            }
            if (this.f27386d.get(pair) != null) {
                pair = String.valueOf(pair);
                c6533d = String.valueOf(c6533d);
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(pair).length() + 50) + String.valueOf(c6533d).length());
                stringBuilder.append("Duplicate tile key: ");
                stringBuilder.append(pair);
                stringBuilder.append(", already exists in batch for ");
                stringBuilder.append(c6533d);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            this.f27386d.put(pair, Integer.valueOf(this.f27384b));
            pair = this.f27383a;
            int i = this.f27384b;
            this.f27384b = i + 1;
            pair[i] = c6533d;
        }

        /* renamed from: i */
        public final int m32294i() {
            return this.f27384b;
        }

        /* renamed from: a */
        public final C6533d m32287a(int i) {
            return this.f27383a[i];
        }

        /* renamed from: a */
        public final Integer m32288a(Pair<Long, String> pair) {
            if (pair.second == null) {
                pair = new Pair(pair.first, "");
            }
            return (Integer) this.f27386d.get(pair);
        }

        /* renamed from: j */
        protected final boolean m32295j() {
            return this.f27384b == this.f27383a.length;
        }

        /* renamed from: a */
        static /* synthetic */ boolean m32286a(C7466a c7466a, int i) {
            return c7466a.f27384b + 2 <= c7466a.f27383a.length ? true : null;
        }
    }

    /* renamed from: b */
    public final void mo4874b(C4718l c4718l) {
    }

    /* renamed from: d */
    protected abstract C7466a mo7550d();

    protected C7467b(C4723n c4723n, bg bgVar, C4904l c4904l, C6538c c6538c, int i, boolean z, int i2, Locale locale, File file, C5203e c5203e) {
        this.f27389b = bgVar;
        this.f27388a = new C4871k(getName(), c4904l, c6538c, z, locale, file);
        this.f27401o = i;
        this.f27393g = c4723n;
        this.f27397k = mo7550d();
        this.f27397k.f27385c = this;
        this.f27399m = new C4976e<ba, C6533d>(this, i2) {
            /* renamed from: a */
            private /* synthetic */ C7467b f24235a;

            /* renamed from: a */
            public final /* synthetic */ void mo5147a(Object obj, Object obj2) {
                this.f24235a.m32323a((C6533d) obj2, 1, null);
            }
        };
        this.f27390c = c5203e;
    }

    /* renamed from: a */
    public void mo7079a(ba baVar, C4875d c4875d) {
        m32299a(new C6533d(this.f27389b, baVar, c4875d));
    }

    /* renamed from: b */
    public final void mo7082b(ba baVar, C4875d c4875d) {
        m32299a(new C6533d(this.f27389b, baVar, c4875d, true, false));
    }

    /* renamed from: a */
    public az mo7076a(ba baVar, boolean z) {
        Object c6532c = new C6532c();
        C6533d c6533d = (C6533d) m32296a(new C6533d(this.f27389b, baVar, c6532c), z, (boolean) null).second;
        if (c6533d != null) {
            this.f27394h.sendMessage(this.f27394h.obtainMessage(1, c6533d));
        }
        return c6532c.f24236a;
    }

    /* renamed from: a */
    private void m32299a(C6533d c6533d) {
        if (this.f27391e != null) {
            this.f27391e.m21797a();
        }
        this.f27394h.sendMessage(this.f27394h.obtainMessage(1, c6533d));
    }

    /* renamed from: a */
    public final void mo7078a() {
        this.f27388a.m21825c();
        m32313f();
    }

    /* renamed from: a */
    private void m32298a(int i) {
        if (this.f27388a.m21823a(i) != 0) {
            m32313f();
        }
    }

    /* renamed from: a */
    public final void mo7080a(C4869a c4869a) {
        synchronized (this.f27406t) {
            this.f27406t.add(new WeakReference(c4869a));
        }
    }

    /* renamed from: f */
    private void m32313f() {
        synchronized (this.f27406t) {
            int i = 0;
            while (i < this.f27406t.size()) {
                C4869a c4869a = (C4869a) ((WeakReference) this.f27406t.get(i)).get();
                if (c4869a != null) {
                    c4869a.mo5092a();
                } else {
                    int i2 = i - 1;
                    this.f27406t.remove(i);
                    i = i2;
                }
                i++;
            }
        }
    }

    /* renamed from: b */
    public final void mo7081b() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1.f27393g;
        r0.mo4892a(r1);
        r1.start();
        monitor-enter(r1);	 Catch:{ InterruptedException -> 0x0016 }
    L_0x0009:
        r0 = r1.f27394h;	 Catch:{ all -> 0x0013 }
        if (r0 != 0) goto L_0x0011;	 Catch:{ all -> 0x0013 }
    L_0x000d:
        r1.wait();	 Catch:{ all -> 0x0013 }
        goto L_0x0009;	 Catch:{ all -> 0x0013 }
    L_0x0011:
        monitor-exit(r1);	 Catch:{ all -> 0x0013 }
        goto L_0x001d;	 Catch:{ all -> 0x0013 }
    L_0x0013:
        r0 = move-exception;	 Catch:{ all -> 0x0013 }
        monitor-exit(r1);	 Catch:{ all -> 0x0013 }
        throw r0;	 Catch:{ InterruptedException -> 0x0016 }
    L_0x0016:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
    L_0x001d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bq.b.b():void");
    }

    /* renamed from: c */
    public final void mo7083c() {
        C4871k c4871k = this.f27388a;
        if (c4871k.f17880a != null) {
            c4871k.f17880a.mo5154a();
        }
    }

    /* renamed from: a */
    public final C4866a mo7077a(ba baVar, C4875d c4875d, C4861b c4861b, boolean z) {
        C6533d c6533d = new C6533d(this.f27389b, baVar, c4875d, c4861b, false, false, -1, false);
        this.f27394h.sendMessage(this.f27394h.obtainMessage(1, c6533d));
        return c6533d;
    }

    /* renamed from: a */
    public final void mo4873a(C4718l c4718l) {
        if ((c4718l instanceof C7466a) && ((C7466a) c4718l).f27385c == this) {
            this.f27394h.sendMessage(this.f27394h.obtainMessage(3, c4718l));
        }
    }

    /* renamed from: a */
    public final void mo4872a(int i, String str) {
        if (C4728u.m21050a("DashServerTileStore", 6)) {
            String str2 = "DashServerTileStore";
            if (str != null) {
                String str3 = " : ";
                str = String.valueOf(str);
                str = str.length() != 0 ? str3.concat(str) : new String(str3);
            } else {
                str = "";
            }
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 29);
            stringBuilder.append("Network Error! ");
            stringBuilder.append(i);
            stringBuilder.append(" : ");
            stringBuilder.append(str);
            Log.e(str2, stringBuilder.toString());
        }
        this.f27394h.sendMessage(this.f27394h.obtainMessage(4));
    }

    public void run() {
        try {
            Process.setThreadPriority(ao.m22336c());
        } catch (Throwable e) {
            if (C4728u.m21050a("DashServerTileStore", 6)) {
                Log.e("DashServerTileStore", "Could not set thread priority", e);
            }
        }
        Looper.prepare();
        this.f27395i = Looper.myLooper();
        this.f27394h = new C48623(this);
        synchronized (this) {
            notifyAll();
        }
        this.f27388a.m21822a();
        Looper.loop();
    }

    /* renamed from: g */
    private void m32315g() {
        if (this.f27397k.m32294i() > 0) {
            this.f27393g.mo4893c(this.f27397k);
            this.f27398l.add(this.f27397k);
            this.f27397k = mo7550d();
            this.f27397k.f27385c = this;
        }
    }

    /* renamed from: a */
    private void m32300a(C6533d c6533d, ba baVar) {
        if (this.f27388a.f17880a != null) {
            this.f27388a.f17880a.a_(baVar);
        }
        m32323a(c6533d, 2, null);
    }

    /* renamed from: h */
    private void m32316h() {
        try {
            this.f27392f.lock();
            if (this.f27388a.f17881b != null && this.f27388a.f17881b.mo7092b() && (this.f27391e == null || this.f27391e.m21798b())) {
                this.f27391e = new C4863b(this);
            }
            this.f27392f.unlock();
        } catch (Throwable th) {
            this.f27392f.unlock();
        }
    }

    /* renamed from: e */
    public bg mo7084e() {
        return this.f27389b;
    }

    /* renamed from: b */
    private void m32307b(C6533d c6533d) {
        C6533d c6533d2 = c6533d;
        Object a = c6533d2.f24237a.m21615a(this.f27389b);
        if (C4870j.f17879d.equals(a)) {
            m32323a(c6533d2, 3, null);
            return;
        }
        boolean booleanValue;
        C6533d c6533d3;
        C6533d c6533d4;
        ba a2;
        C6533d c6533d5;
        C6533d c6533d6 = (C6533d) r0.f27400n.get(a);
        bg c = C7467b.m32309c(c6533d);
        boolean z = c != null;
        Pair a3;
        if (c6533d2.f24242f) {
            if (c6533d2.f24241e && C4728u.m21050a(getName(), 3)) {
                Log.d(getName(), "Local tile request shouldn't be have 'mMustSkipCache = true'.");
            }
            a3 = m32296a(c6533d2, true, false);
            booleanValue = ((Boolean) a3.first).booleanValue();
            c6533d3 = (C6533d) a3.second;
        } else {
            if (!c6533d2.f24241e) {
                if (c6533d6 != null) {
                    if (!c6533d6.m28801b()) {
                        if (!c6533d6.f24243g) {
                        }
                    }
                }
                a3 = m32296a(c6533d2, true, z);
                booleanValue = ((Boolean) a3.first).booleanValue();
                if (booleanValue) {
                    c6533d3 = (C6533d) a3.second;
                }
                c6533d4 = c6533d2;
                if (!booleanValue) {
                    m32323a(c6533d2, 3, null);
                }
                if (c6533d4 == null) {
                    if (c6533d6 == null) {
                        if (!c6533d4.f24243g) {
                            c6533d6.m28800a(c6533d4);
                        }
                    } else if (r0.f27405s || r0.f27400n.isEmpty() || c6533d4.f24239c) {
                        r0.f27400n.put(a, c6533d4);
                        if (!r0.f27397k.mo7548a(c6533d4) || (z && !C7466a.m32286a(r0.f27397k, 2))) {
                            m32315g();
                        }
                        r0.f27397k.m32289a(C4733b.m21062a(mo7084e(), a), c6533d4);
                        if (z) {
                            a2 = c6533d2.f24237a.m21615a(c);
                            c6533d5 = c6533d4;
                            c6533d3 = new C6533d(c, a2, c6533d4.f24238b, c6533d4.f24240d, c6533d4.f24241e, c6533d4.f24242f, c6533d4.f24245i, c6533d4.f24243g);
                            r0.f27397k.m32289a(C4733b.m21062a(c6533d3.f24244h, a2), c6533d3);
                        } else {
                            c6533d5 = c6533d4;
                        }
                        r0.f27402p++;
                        if (!r0.f27397k.m32295j()) {
                            if (c6533d5.f24241e) {
                                if (!r0.f27396j) {
                                    r0.f27394h.sendMessageDelayed(r0.f27394h.obtainMessage(2), 50);
                                    r0.f27396j = true;
                                }
                            }
                        }
                        m32315g();
                    } else {
                        c6533d2 = (C6533d) r0.f27399m.m22251b(a);
                        if (c6533d2 != null) {
                            c6533d2.m28800a(c6533d4);
                            return;
                        } else {
                            r0.f27399m.m22255c(a, c6533d4);
                            return;
                        }
                    }
                }
            }
            booleanValue = false;
            c6533d4 = c6533d2;
            if (booleanValue) {
                m32323a(c6533d2, 3, null);
            }
            if (c6533d4 == null) {
                if (c6533d6 == null) {
                    if (r0.f27405s) {
                    }
                    r0.f27400n.put(a, c6533d4);
                    m32315g();
                    r0.f27397k.m32289a(C4733b.m21062a(mo7084e(), a), c6533d4);
                    if (z) {
                        c6533d5 = c6533d4;
                    } else {
                        a2 = c6533d2.f24237a.m21615a(c);
                        c6533d5 = c6533d4;
                        c6533d3 = new C6533d(c, a2, c6533d4.f24238b, c6533d4.f24240d, c6533d4.f24241e, c6533d4.f24242f, c6533d4.f24245i, c6533d4.f24243g);
                        r0.f27397k.m32289a(C4733b.m21062a(c6533d3.f24244h, a2), c6533d3);
                    }
                    r0.f27402p++;
                    if (r0.f27397k.m32295j()) {
                        if (c6533d5.f24241e) {
                            if (r0.f27396j) {
                                r0.f27394h.sendMessageDelayed(r0.f27394h.obtainMessage(2), 50);
                                r0.f27396j = true;
                            }
                        }
                    }
                    m32315g();
                } else if (c6533d4.f24243g) {
                    c6533d6.m28800a(c6533d4);
                }
            }
        }
        c6533d4 = c6533d3;
        if (booleanValue) {
            m32323a(c6533d2, 3, null);
        }
        if (c6533d4 == null) {
            if (c6533d6 == null) {
                if (r0.f27405s) {
                }
                r0.f27400n.put(a, c6533d4);
                m32315g();
                r0.f27397k.m32289a(C4733b.m21062a(mo7084e(), a), c6533d4);
                if (z) {
                    a2 = c6533d2.f24237a.m21615a(c);
                    c6533d5 = c6533d4;
                    c6533d3 = new C6533d(c, a2, c6533d4.f24238b, c6533d4.f24240d, c6533d4.f24241e, c6533d4.f24242f, c6533d4.f24245i, c6533d4.f24243g);
                    r0.f27397k.m32289a(C4733b.m21062a(c6533d3.f24244h, a2), c6533d3);
                } else {
                    c6533d5 = c6533d4;
                }
                r0.f27402p++;
                if (r0.f27397k.m32295j()) {
                    if (c6533d5.f24241e) {
                        if (r0.f27396j) {
                            r0.f27394h.sendMessageDelayed(r0.f27394h.obtainMessage(2), 50);
                            r0.f27396j = true;
                        }
                    }
                }
                m32315g();
            } else if (c6533d4.f24243g) {
                c6533d6.m28800a(c6533d4);
            }
        }
    }

    /* renamed from: a */
    private Pair<Boolean, C6533d> m32296a(C6533d c6533d, boolean z, boolean z2) {
        az c;
        ba a = c6533d.f24237a.m21615a(mo7084e());
        boolean z3 = true;
        Object obj = null;
        if (this.f27388a.f17880a != null) {
            c = this.f27388a.f17880a.mo5158c(a);
            if (!(c == null || c.mo5096a(C4712d.m20955a()))) {
                if (this.f27388a.f17880a.mo5155a(c)) {
                    m32323a(c6533d, 2, null);
                    z = false;
                } else {
                    z = m32297a(c, c6533d, z2);
                    if (z2) {
                        z3 = false;
                    } else {
                        if (c6533d.f24239c) {
                            c = null;
                        }
                        m32323a(c6533d, 0, c);
                    }
                }
                return Pair.create(Boolean.valueOf(z3), z);
            }
        }
        if (z) {
            z = this.f27388a.m21824b();
            if (z) {
                if (!c6533d.f24239c) {
                    c = z.mo5158c(a);
                    if (!(c == null || c.mo5096a(C4712d.m20955a()))) {
                        if (z.mo5155a(c)) {
                            m32300a(c6533d, a);
                        } else {
                            if (this.f27388a.f17880a) {
                                this.f27388a.f17880a.mo5153a(a, c);
                            }
                            obj = m32297a(c, c6533d, z2);
                            if (z2) {
                                z3 = false;
                            } else {
                                m32323a(c6533d, 0, c);
                            }
                        }
                        return Pair.create(Boolean.valueOf(z3), obj);
                    }
                } else if (z.mo5157b(a)) {
                    m32323a(c6533d, 0, null);
                    return Pair.create(Boolean.valueOf(true), null);
                }
            }
        }
        c6533d.f24245i = true;
        return Pair.create(Boolean.valueOf(false), null);
    }

    /* renamed from: a */
    private C6533d m32297a(az azVar, C6533d c6533d, boolean z) {
        int i;
        int d = this.f27388a.m21826d();
        Object obj = 1;
        if (d == -1 || d == azVar.mo5100e()) {
            if (this.f27390c.m23223a().m23201a() && !c6533d.f24239c && (azVar.mo5097b(C4712d.m20955a()) || z)) {
                i = azVar.mo5102i();
                return obj == null ? new C6533d(this.f27389b, c6533d.f24237a.m21615a(this.f27389b), this.f27408v, C4861b.NORMAL, true, false, i, true) : null;
            } else {
                obj = null;
            }
        }
        i = -1;
        if (obj == null) {
        }
    }

    /* renamed from: a */
    final void m32323a(C6533d c6533d, int i, az azVar) {
        C6533d c6533d2 = c6533d;
        Object obj = null;
        while (c6533d2 != null) {
            if (i != 0 || c6533d2.f24246j || !C4867g.m21803a(c6533d2.f24240d)) {
                c6533d2.f24238b.mo5079a(c6533d2.f24237a, i, azVar);
            } else if (azVar.mo5103j()) {
                this.f27388a.m21824b().mo7087a(c6533d.f24237a, c6533d2.f24238b, C4867g.m21801a(c6533d2.f24240d, true));
                obj = 1;
            } else {
                c6533d2.f24238b.mo5079a(c6533d2.f24237a, 4, azVar);
            }
            c6533d2 = c6533d2.f24247k;
        }
        if (obj != null) {
            this.f27407u = true;
            m32316h();
        }
    }

    /* renamed from: c */
    private static bg m32309c(C6533d c6533d) {
        for (C4839a c4839a : c6533d.f24237a.m21627j().m21644a()) {
            if (c4839a.mo5118a() != null) {
                return c4839a.mo5118a();
            }
        }
        return null;
    }

    /* renamed from: a */
    static /* synthetic */ void m32302a(C7467b c7467b, az azVar) {
        synchronized (c7467b.f27406t) {
            int i = 0;
            while (i < c7467b.f27406t.size()) {
                C4869a c4869a = (C4869a) ((WeakReference) c7467b.f27406t.get(i)).get();
                if (c4869a != null) {
                    c4869a.mo5093a(azVar);
                } else {
                    int i2 = i - 1;
                    c7467b.f27406t.remove(i);
                    i = i2;
                }
                i++;
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m32301a(C7467b c7467b) {
        c7467b.f27396j = false;
        c7467b.m32315g();
    }

    /* renamed from: a */
    static /* synthetic */ void m32304a(C7467b c7467b, C7466a c7466a) {
        Throwable th;
        Throwable e;
        String valueOf;
        String valueOf2;
        StringBuilder stringBuilder;
        C7467b c7467b2 = c7467b;
        C7466a c7466a2 = c7466a;
        if (c7467b2.f27405s) {
            c7467b2.f27405s = false;
            while (c7467b2.f27399m.m22250b() != 0) {
                c7467b2.m32307b((C6533d) c7467b2.f27399m.m22253c());
            }
        }
        int h = c7466a.mo7075h();
        if (!(h == -1 || h == c7467b2.f27388a.m21826d())) {
            if (C4728u.m21050a(c7467b.getName(), 3)) {
                String name = c7467b.getName();
                int d = c7467b2.f27388a.m21826d();
                boolean e2 = c7467b2.f27388a.m21827e();
                StringBuilder stringBuilder2 = new StringBuilder(70);
                stringBuilder2.append("Received version: ");
                stringBuilder2.append(h);
                stringBuilder2.append(" Cached version: ");
                stringBuilder2.append(d);
                stringBuilder2.append(" Clear: ");
                stringBuilder2.append(e2);
                Log.d(name, stringBuilder2.toString());
            }
            c7467b2.m32298a(h);
        }
        if (c7467b2.f27398l.remove(c7466a2)) {
            C6538c b = c7467b2.f27388a.m21824b();
            int i = 0;
            while (i < c7466a.m32294i()) {
                byte[] bArr;
                bg c;
                az b2;
                az b3;
                az c2;
                C6538c b4;
                byte[] a;
                Object obj;
                C6533d a2 = c7466a2.m32287a(i);
                ba a3 = a2.f24237a.m21615a(a2.f24244h);
                c7467b2.f27400n.remove(a3);
                c7467b2.f27402p--;
                if (a2.f24239c) {
                    try {
                        c7467b2.f27404r++;
                    } catch (Throwable e3) {
                        th = e3;
                        if (C4728u.m21050a("DashServerTileStore", 6)) {
                            valueOf = String.valueOf(c7467b.getName());
                            valueOf2 = String.valueOf(a3);
                            stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 24) + String.valueOf(valueOf2).length());
                            stringBuilder.append(valueOf);
                            stringBuilder.append(": Could not parse tile: ");
                            stringBuilder.append(valueOf2);
                            Log.e("DashServerTileStore", stringBuilder.toString(), th);
                        }
                        c7467b2.m32323a(a2, 1, null);
                        i++;
                    }
                } else {
                    c7467b2.f27403q++;
                }
                if (b != null) {
                    Object c3 = c7466a2.mo7637c(i);
                    if (c3 != null) {
                        bArr = new byte[c3.length];
                        System.arraycopy(c3, 0, bArr, 0, c3.length);
                        c = C7467b.m32309c(a2);
                        b2 = c7466a2.mo7549b(i);
                        if (b2 == null) {
                            if (!(c7467b2.f27388a.f17880a == null || a2.f24239c || (b2.mo5101h() != null && b2.mo5101h() == c))) {
                                c7467b2.f27388a.f17880a.mo5153a(a3, b2);
                            }
                            if (b != null && (b2.mo5101h() == null || b2.mo5101h() != c)) {
                                b.mo7086a(a3, b2, bArr);
                            }
                            if (b2.mo5101h() == null && b2.mo5101h() == c) {
                                az c4 = c7467b2.f27388a.f17880a.mo5158c(a3.m21615a(c7467b2.f27389b));
                                if (c4 != null) {
                                    if (!c7467b2.f27388a.f17880a.mo5155a(c4)) {
                                        b3 = ad.m34216b((bo) c4, (bo) b2, c7467b2.f27390c);
                                    }
                                }
                                if (C4728u.m21050a("DashServerTileStore", 5)) {
                                    String valueOf3 = String.valueOf(a3);
                                    String valueOf4 = String.valueOf(c4);
                                    String valueOf5 = String.valueOf(c);
                                    stringBuilder2 = new StringBuilder(((String.valueOf(valueOf3).length() + 67) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length());
                                    stringBuilder2.append(" No base tile for a diff tile: coords: ");
                                    stringBuilder2.append(valueOf3);
                                    stringBuilder2.append(" baseTile: ");
                                    stringBuilder2.append(valueOf4);
                                    stringBuilder2.append(" diff tile type: ");
                                    stringBuilder2.append(valueOf5);
                                    Log.w("DashServerTileStore", stringBuilder2.toString());
                                }
                                c7467b2.m32323a(a2, 2, b2);
                                i++;
                            } else {
                                b3 = b2;
                            }
                            if (c != null || b2.mo5101h() != c7467b2.f27389b) {
                                c7467b2.m32323a(a2, 0, b3);
                            }
                            i++;
                        } else {
                            if (c7467b2.f27390c.m23223a().m23201a()) {
                                c7467b2.m32300a(a2, a3);
                            } else {
                                if (c7467b2.f27388a.f17880a != null) {
                                    if (c7467b2.f27388a.f17880a.mo5157b(a3)) {
                                        c2 = c7467b2.f27388a.f17880a.mo5158c(a3);
                                        if (c2 != null) {
                                            if (c2.mo5102i() != -1) {
                                                try {
                                                    c2.mo5098c(C4712d.m20955a());
                                                    if (!(c7467b2.f27388a.f17880a == null || a2.f24239c)) {
                                                        c7467b2.f27388a.f17880a.mo5153a(a3, c2);
                                                    }
                                                    b4 = c7467b2.f27388a.m21824b();
                                                    if (b4 != null) {
                                                        a = b4.mo7091a(a3);
                                                        if (a != null) {
                                                            b4.mo7086a(a3, c2, a);
                                                        }
                                                    }
                                                    c7467b2.m32323a(a2, 0, c2);
                                                    obj = 1;
                                                    if (obj != null) {
                                                        c7467b2.m32300a(a2, a3);
                                                    }
                                                } catch (IOException e4) {
                                                    e3 = e4;
                                                    th = e3;
                                                    if (C4728u.m21050a("DashServerTileStore", 6)) {
                                                        valueOf = String.valueOf(c7467b.getName());
                                                        valueOf2 = String.valueOf(a3);
                                                        stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 24) + String.valueOf(valueOf2).length());
                                                        stringBuilder.append(valueOf);
                                                        stringBuilder.append(": Could not parse tile: ");
                                                        stringBuilder.append(valueOf2);
                                                        Log.e("DashServerTileStore", stringBuilder.toString(), th);
                                                    }
                                                    c7467b2.m32323a(a2, 1, null);
                                                    i++;
                                                }
                                            }
                                        }
                                        obj = null;
                                        if (obj != null) {
                                            c7467b2.m32300a(a2, a3);
                                        }
                                    }
                                }
                                try {
                                    b4 = c7467b2.f27388a.m21824b();
                                    if (b4 != null) {
                                        if (b4.mo5157b(a3)) {
                                            c2 = b4.mo5158c(a3);
                                            if (c2 != null) {
                                                if (c2.mo5102i() != -1) {
                                                    c2.mo5098c(C4712d.m20955a());
                                                    c7467b2.f27388a.f17880a.mo5153a(a3, c2);
                                                    b4 = c7467b2.f27388a.m21824b();
                                                    if (b4 != null) {
                                                        a = b4.mo7091a(a3);
                                                        if (a != null) {
                                                            b4.mo7086a(a3, c2, a);
                                                        }
                                                    }
                                                    c7467b2.m32323a(a2, 0, c2);
                                                    obj = 1;
                                                    if (obj != null) {
                                                        c7467b2.m32300a(a2, a3);
                                                    }
                                                }
                                            }
                                            obj = null;
                                            if (obj != null) {
                                                c7467b2.m32300a(a2, a3);
                                            }
                                        }
                                    }
                                    c2 = null;
                                    if (c2 != null) {
                                        if (c2.mo5102i() != -1) {
                                            c2.mo5098c(C4712d.m20955a());
                                            c7467b2.f27388a.f17880a.mo5153a(a3, c2);
                                            b4 = c7467b2.f27388a.m21824b();
                                            if (b4 != null) {
                                                a = b4.mo7091a(a3);
                                                if (a != null) {
                                                    b4.mo7086a(a3, c2, a);
                                                }
                                            }
                                            c7467b2.m32323a(a2, 0, c2);
                                            obj = 1;
                                            if (obj != null) {
                                                c7467b2.m32300a(a2, a3);
                                            }
                                        }
                                    }
                                    obj = null;
                                    if (obj != null) {
                                        c7467b2.m32300a(a2, a3);
                                    }
                                } catch (IOException e5) {
                                    e3 = e5;
                                    th = e3;
                                    if (C4728u.m21050a("DashServerTileStore", 6)) {
                                        valueOf = String.valueOf(c7467b.getName());
                                        valueOf2 = String.valueOf(a3);
                                        stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 24) + String.valueOf(valueOf2).length());
                                        stringBuilder.append(valueOf);
                                        stringBuilder.append(": Could not parse tile: ");
                                        stringBuilder.append(valueOf2);
                                        Log.e("DashServerTileStore", stringBuilder.toString(), th);
                                    }
                                    c7467b2.m32323a(a2, 1, null);
                                    i++;
                                }
                            }
                            i++;
                        }
                    }
                }
                bArr = null;
                c = C7467b.m32309c(a2);
                b2 = c7466a2.mo7549b(i);
                if (b2 == null) {
                    if (c7467b2.f27390c.m23223a().m23201a()) {
                        c7467b2.m32300a(a2, a3);
                    } else {
                        if (c7467b2.f27388a.f17880a != null) {
                            if (c7467b2.f27388a.f17880a.mo5157b(a3)) {
                                c2 = c7467b2.f27388a.f17880a.mo5158c(a3);
                                if (c2 != null) {
                                    if (c2.mo5102i() != -1) {
                                        c2.mo5098c(C4712d.m20955a());
                                        c7467b2.f27388a.f17880a.mo5153a(a3, c2);
                                        b4 = c7467b2.f27388a.m21824b();
                                        if (b4 != null) {
                                            a = b4.mo7091a(a3);
                                            if (a != null) {
                                                b4.mo7086a(a3, c2, a);
                                            }
                                        }
                                        c7467b2.m32323a(a2, 0, c2);
                                        obj = 1;
                                        if (obj != null) {
                                            c7467b2.m32300a(a2, a3);
                                        }
                                    }
                                }
                                obj = null;
                                if (obj != null) {
                                    c7467b2.m32300a(a2, a3);
                                }
                            }
                        }
                        b4 = c7467b2.f27388a.m21824b();
                        if (b4 != null) {
                            if (b4.mo5157b(a3)) {
                                c2 = b4.mo5158c(a3);
                                if (c2 != null) {
                                    if (c2.mo5102i() != -1) {
                                        c2.mo5098c(C4712d.m20955a());
                                        c7467b2.f27388a.f17880a.mo5153a(a3, c2);
                                        b4 = c7467b2.f27388a.m21824b();
                                        if (b4 != null) {
                                            a = b4.mo7091a(a3);
                                            if (a != null) {
                                                b4.mo7086a(a3, c2, a);
                                            }
                                        }
                                        c7467b2.m32323a(a2, 0, c2);
                                        obj = 1;
                                        if (obj != null) {
                                            c7467b2.m32300a(a2, a3);
                                        }
                                    }
                                }
                                obj = null;
                                if (obj != null) {
                                    c7467b2.m32300a(a2, a3);
                                }
                            }
                        }
                        c2 = null;
                        if (c2 != null) {
                            if (c2.mo5102i() != -1) {
                                c2.mo5098c(C4712d.m20955a());
                                c7467b2.f27388a.f17880a.mo5153a(a3, c2);
                                b4 = c7467b2.f27388a.m21824b();
                                if (b4 != null) {
                                    a = b4.mo7091a(a3);
                                    if (a != null) {
                                        b4.mo7086a(a3, c2, a);
                                    }
                                }
                                c7467b2.m32323a(a2, 0, c2);
                                obj = 1;
                                if (obj != null) {
                                    c7467b2.m32300a(a2, a3);
                                }
                            }
                        }
                        obj = null;
                        if (obj != null) {
                            c7467b2.m32300a(a2, a3);
                        }
                    }
                    i++;
                } else {
                    c7467b2.f27388a.f17880a.mo5153a(a3, b2);
                    b.mo7086a(a3, b2, bArr);
                    if (b2.mo5101h() == null) {
                    }
                    b3 = b2;
                    if (c != null) {
                    }
                    c7467b2.m32323a(a2, 0, b3);
                    i++;
                }
            }
            if (C4728u.m21050a(c7467b.getName(), 3)) {
                String name2 = c7467b.getName();
                h = c7467b2.f27404r;
                int i2 = c7467b2.f27403q;
                StringBuilder stringBuilder3 = new StringBuilder(73);
                stringBuilder3.append("Response received. Total tiles: prefetch: ");
                stringBuilder3.append(h);
                stringBuilder3.append(" normal: ");
                stringBuilder3.append(i2);
                Log.d(name2, stringBuilder3.toString());
            }
            c7467b.m32316h();
            return;
        }
        if (C4728u.m21050a(c7467b.getName(), 3)) {
            Log.d(c7467b.getName(), "Request not found in list of outstanding requests");
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m32310c(C7467b c7467b) {
        LinkedList linkedList = new LinkedList(c7467b.f27398l);
        c7467b.f27398l.clear();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            C7466a c7466a = (C7466a) it.next();
            for (int i = 0; i < c7466a.m32294i(); i++) {
                c7467b.f27400n.remove(c7466a.m32287a(i).f24237a);
                c7467b.f27402p--;
                c7467b.m32307b(c7466a.m32287a(i));
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m32303a(C7467b c7467b, bb bbVar, C4861b c4861b, C4875d c4875d) {
        int a = C4867g.m21801a(c4861b, false);
        C6538c b = c7467b.f27388a.m21824b();
        while (true) {
            ba a2 = bbVar.m21628a();
            if (a2 == null) {
                c7467b.f27407u = true;
                c7467b.m32316h();
                return;
            } else if (b != null) {
                b.mo7087a(a2, c4875d, a);
            } else {
                c4875d.mo5079a(a2, 1, null);
            }
        }
    }
}
