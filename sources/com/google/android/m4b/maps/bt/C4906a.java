package com.google.android.m4b.maps.bt;

import android.util.Pair;
import com.google.android.m4b.maps.aa.au;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.bj.C4786b;
import com.google.android.m4b.maps.bj.C4787f;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bq.C4870j;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.m4b.maps.bt.a */
public final class C4906a {
    /* renamed from: a */
    private int f18014a;
    /* renamed from: b */
    private boolean f18015b;
    /* renamed from: c */
    private int f18016c;
    /* renamed from: d */
    private final LinkedHashSet<ba> f18017d = new LinkedHashSet();
    /* renamed from: e */
    private final LinkedHashSet<ba> f18018e = new LinkedHashSet();
    /* renamed from: f */
    private Iterator<ba> f18019f;
    /* renamed from: g */
    private final C4905a f18020g;
    /* renamed from: h */
    private final LinkedList<Pair<ba, Boolean>> f18021h = new LinkedList();
    /* renamed from: i */
    private C4787f f18022i;
    /* renamed from: j */
    private af f18023j;
    /* renamed from: k */
    private long f18024k = 0;
    /* renamed from: l */
    private long f18025l;
    /* renamed from: m */
    private byte f18026m = (byte) 4;
    /* renamed from: n */
    private boolean f18027n;
    /* renamed from: o */
    private Map<ba, C4907b> f18028o = ax.m20623b();
    /* renamed from: p */
    private Set<ba> f18029p = new HashSet();
    /* renamed from: q */
    private C4907b f18030q;

    /* renamed from: com.google.android.m4b.maps.bt.a$a */
    class C4905a {
        /* renamed from: a */
        private boolean f18007a;
        /* renamed from: b */
        private int f18008b = null;
        /* renamed from: c */
        private ba f18009c;
        /* renamed from: d */
        private LinkedHashSet<ba> f18010d = new LinkedHashSet();
        /* renamed from: e */
        private LinkedHashSet<ba> f18011e = new LinkedHashSet();
        /* renamed from: f */
        private Iterator<ba> f18012f;
        /* renamed from: g */
        private /* synthetic */ C4906a f18013g;

        public C4905a(C4906a c4906a, boolean z) {
            this.f18013g = c4906a;
            this.f18007a = z;
        }

        /* renamed from: a */
        public final void m21961a() {
            this.f18008b = 0;
            this.f18010d.clear();
            this.f18011e.clear();
            this.f18009c = null;
            this.f18010d.addAll(this.f18013g.f18017d);
            this.f18012f = this.f18010d.iterator();
        }

        /* renamed from: a */
        public final C4907b m21960a(boolean z) {
            boolean z2 = true;
            if (this.f18009c != null && this.f18008b < this.f18013g.f18014a) {
                if (!z) {
                    z = this.f18013g.f18022i.mo5018a(this.f18009c, this.f18013g.f18023j);
                    if (z) {
                        this.f18011e.add(z);
                    }
                }
                if (!(this.f18012f.hasNext() || this.f18011e.isEmpty())) {
                    this.f18008b += true;
                    z = this.f18010d;
                    this.f18010d = this.f18011e;
                    this.f18011e = z;
                    this.f18011e.clear();
                    this.f18012f = this.f18010d.iterator();
                }
            }
            if (!this.f18012f.hasNext()) {
                return false;
            }
            this.f18009c = (ba) this.f18012f.next();
            ba baVar = this.f18009c;
            long b = this.f18013g.m21966d();
            if (this.f18007a || this.f18008b == 0) {
                z2 = false;
            }
            return new C4907b(baVar, b, z2);
        }
    }

    public C4906a(int i, int i2, boolean z, boolean z2) {
        this.f18014a = i;
        this.f18020g = new C4905a(this, z2);
        this.f18015b = z;
        this.f18016c = i2;
    }

    /* renamed from: d */
    private long m21966d() {
        long j = this.f18024k + 1;
        this.f18024k = j;
        return j;
    }

    /* renamed from: a */
    public final synchronized void m21972a(C4787f c4787f, af afVar, List<ba> list, Set<ba> set, Set<ba> set2, boolean z) {
        this.f18026m = (byte) 0;
        this.f18025l = m21966d();
        this.f18022i = c4787f;
        this.f18023j = afVar;
        this.f18030q = new C4907b(C4870j.f17879d, m21966d(), Boolean.TRUE.booleanValue());
        this.f18017d.clear();
        this.f18017d.addAll(list);
        this.f18021h.clear();
        if (set != null) {
            for (ba create : set) {
                this.f18021h.add(Pair.create(create, Boolean.TRUE));
            }
        }
        if (set2 != null) {
            for (ba create2 : set2) {
                this.f18021h.add(Pair.create(create2, Boolean.FALSE));
            }
        }
        this.f18027n = z;
    }

    /* renamed from: a */
    public final synchronized void m21971a() {
        if (!this.f18027n) {
            this.f18026m = (byte) 4;
        }
    }

    /* renamed from: e */
    private synchronized void m21969e() {
        this.f18028o.clear();
        this.f18018e.clear();
        this.f18029p.clear();
        if (this.f18015b) {
            Collection linkedHashSet = new LinkedHashSet();
            Iterator it = this.f18017d.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(((ba) it.next()).m21611a());
            }
            C4786b.m21191a(this.f18022i, this.f18014a, linkedHashSet, this.f18023j, 8, this.f18018e);
            if (this.f18027n) {
                this.f18018e.addAll(this.f18022i.mo5019a(2, this.f18023j));
            } else {
                List<ba> a = au.m20525a(this.f18018e);
                Collections.reverse(a);
                for (ba create : a) {
                    this.f18021h.add(0, Pair.create(create, Boolean.FALSE));
                }
                it = this.f18018e.iterator();
                int i = -1;
                while (it.hasNext()) {
                    ba baVar = (ba) it.next();
                    if (i == -1) {
                        i = baVar.m21619b();
                    } else if (i != baVar.m21619b()) {
                        it.remove();
                    }
                }
            }
        }
        this.f18019f = this.f18018e.iterator();
    }

    /* renamed from: b */
    public final synchronized C4907b m21974b() {
        return this.f18030q;
    }

    /* renamed from: a */
    public final synchronized C4907b m21970a(C4907b c4907b, boolean z) {
        while (true) {
            c4907b = m21964b(c4907b, z);
            if (c4907b == null) {
                break;
            }
            z = false;
            C4907b c4907b2 = (C4907b) this.f18028o.get(c4907b.f18031a);
            if (c4907b2 == null || (c4907b2.f18032b && !c4907b.f18032b)) {
                this.f18028o.put(c4907b.f18031a, c4907b);
            }
        }
        this.f18028o.put(c4907b.f18031a, c4907b);
        if (!c4907b.f18032b) {
            this.f18029p.add(c4907b.f18031a);
        }
        return c4907b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private synchronized com.google.android.m4b.maps.bt.C4907b m21964b(com.google.android.m4b.maps.bt.C4907b r11, boolean r12) {
        /*
        r10 = this;
        monitor-enter(r10);
        r0 = r10.m21973a(r11);	 Catch:{ all -> 0x00f5 }
        r1 = 0;
        if (r0 != 0) goto L_0x000a;
    L_0x0008:
        monitor-exit(r10);
        return r1;
    L_0x000a:
        r2 = r11.f18033c;	 Catch:{ all -> 0x00f5 }
        r0 = r10.f18026m;	 Catch:{ all -> 0x00f5 }
        r4 = 0;
        r5 = 1;
        if (r0 != 0) goto L_0x0022;
    L_0x0012:
        r12 = r10.f18030q;	 Catch:{ all -> 0x00f5 }
        r6 = r12.f18033c;	 Catch:{ all -> 0x00f5 }
        r12 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r12 == 0) goto L_0x001c;
    L_0x001a:
        monitor-exit(r10);
        return r1;
    L_0x001c:
        r10.f18026m = r5;	 Catch:{ all -> 0x00f5 }
        r10.m21969e();	 Catch:{ all -> 0x00f5 }
        r12 = 0;
    L_0x0022:
        if (r12 == 0) goto L_0x0036;
    L_0x0024:
        r0 = r10.f18030q;	 Catch:{ all -> 0x00f5 }
        if (r11 == r0) goto L_0x0036;
    L_0x0028:
        r0 = r10.f18017d;	 Catch:{ all -> 0x00f5 }
        r6 = r11.f18031a;	 Catch:{ all -> 0x00f5 }
        r0.remove(r6);	 Catch:{ all -> 0x00f5 }
        r0 = r10.f18029p;	 Catch:{ all -> 0x00f5 }
        r6 = r11.f18031a;	 Catch:{ all -> 0x00f5 }
        r0.add(r6);	 Catch:{ all -> 0x00f5 }
    L_0x0036:
        r0 = r10.f18026m;	 Catch:{ all -> 0x00f5 }
        r6 = 2;
        r7 = 4;
        if (r0 != r5) goto L_0x0085;
    L_0x003c:
        r8 = r10.f18024k;	 Catch:{ all -> 0x00f5 }
        r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r0 == 0) goto L_0x0044;
    L_0x0042:
        monitor-exit(r10);
        return r1;
    L_0x0044:
        r0 = r10.f18029p;	 Catch:{ all -> 0x00f5 }
        r0 = r0.size();	 Catch:{ all -> 0x00f5 }
        r8 = r10.f18017d;	 Catch:{ all -> 0x00f5 }
        r8 = r8.size();	 Catch:{ all -> 0x00f5 }
        r0 = r0 + r8;
        r8 = r10.f18016c;	 Catch:{ all -> 0x00f5 }
        if (r0 >= r8) goto L_0x0076;
    L_0x0055:
        r0 = r10.f18019f;	 Catch:{ all -> 0x00f5 }
        r0 = r0.hasNext();	 Catch:{ all -> 0x00f5 }
        if (r0 == 0) goto L_0x0076;
    L_0x005d:
        r11 = new com.google.android.m4b.maps.bt.b;	 Catch:{ all -> 0x00f5 }
        r12 = r10.f18019f;	 Catch:{ all -> 0x00f5 }
        r12 = r12.next();	 Catch:{ all -> 0x00f5 }
        r12 = (com.google.android.m4b.maps.bo.ba) r12;	 Catch:{ all -> 0x00f5 }
        r0 = r10.m21966d();	 Catch:{ all -> 0x00f5 }
        r2 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x00f5 }
        r2 = r2.booleanValue();	 Catch:{ all -> 0x00f5 }
        r11.<init>(r12, r0, r2);	 Catch:{ all -> 0x00f5 }
        monitor-exit(r10);
        return r11;
    L_0x0076:
        r0 = r10.f18027n;	 Catch:{ all -> 0x00f5 }
        if (r0 == 0) goto L_0x007e;
    L_0x007a:
        r10.f18026m = r7;	 Catch:{ all -> 0x00f5 }
        monitor-exit(r10);
        return r1;
    L_0x007e:
        r10.f18026m = r6;	 Catch:{ all -> 0x00f5 }
        r0 = r10.f18020g;	 Catch:{ all -> 0x00f5 }
        r0.m21961a();	 Catch:{ all -> 0x00f5 }
    L_0x0085:
        r0 = r10.f18029p;	 Catch:{ all -> 0x00f5 }
        r0 = r0.size();	 Catch:{ all -> 0x00f5 }
        r8 = r10.f18016c;	 Catch:{ all -> 0x00f5 }
        if (r0 >= r8) goto L_0x0090;
    L_0x008f:
        goto L_0x0091;
    L_0x0090:
        r5 = 0;
    L_0x0091:
        if (r5 != 0) goto L_0x0097;
    L_0x0093:
        r10.f18026m = r7;	 Catch:{ all -> 0x00f5 }
        monitor-exit(r10);
        return r1;
    L_0x0097:
        r0 = r10.f18026m;	 Catch:{ all -> 0x00f5 }
        r8 = 3;
        if (r0 != r6) goto L_0x00bc;
    L_0x009c:
        r0 = r10.f18017d;	 Catch:{ all -> 0x00f5 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x00f5 }
        if (r0 != 0) goto L_0x00b8;
    L_0x00a4:
        r2 = r11.f18033c;	 Catch:{ all -> 0x00f5 }
        r6 = r10.f18024k;	 Catch:{ all -> 0x00f5 }
        r11 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r11 != 0) goto L_0x00b6;
    L_0x00ac:
        if (r5 == 0) goto L_0x00b6;
    L_0x00ae:
        r11 = r10.f18020g;	 Catch:{ all -> 0x00f5 }
        r11 = r11.m21960a(r12);	 Catch:{ all -> 0x00f5 }
        monitor-exit(r10);
        return r11;
    L_0x00b6:
        monitor-exit(r10);
        return r1;
    L_0x00b8:
        r2 = r10.f18024k;	 Catch:{ all -> 0x00f5 }
        r10.f18026m = r8;	 Catch:{ all -> 0x00f5 }
    L_0x00bc:
        r11 = r10.f18026m;	 Catch:{ all -> 0x00f5 }
        if (r11 != r8) goto L_0x00f3;
    L_0x00c0:
        r11 = r10.f18024k;	 Catch:{ all -> 0x00f5 }
        r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1));
        if (r0 == 0) goto L_0x00c8;
    L_0x00c6:
        monitor-exit(r10);
        return r1;
    L_0x00c8:
        r11 = r10.f18021h;	 Catch:{ all -> 0x00f5 }
        r11 = r11.isEmpty();	 Catch:{ all -> 0x00f5 }
        if (r11 != 0) goto L_0x00f1;
    L_0x00d0:
        if (r5 == 0) goto L_0x00f1;
    L_0x00d2:
        r11 = r10.f18021h;	 Catch:{ all -> 0x00f5 }
        r11 = r11.remove(r4);	 Catch:{ all -> 0x00f5 }
        r11 = (android.util.Pair) r11;	 Catch:{ all -> 0x00f5 }
        r12 = new com.google.android.m4b.maps.bt.b;	 Catch:{ all -> 0x00f5 }
        r0 = r11.first;	 Catch:{ all -> 0x00f5 }
        r0 = (com.google.android.m4b.maps.bo.ba) r0;	 Catch:{ all -> 0x00f5 }
        r1 = r10.m21966d();	 Catch:{ all -> 0x00f5 }
        r11 = r11.second;	 Catch:{ all -> 0x00f5 }
        r11 = (java.lang.Boolean) r11;	 Catch:{ all -> 0x00f5 }
        r11 = r11.booleanValue();	 Catch:{ all -> 0x00f5 }
        r12.<init>(r0, r1, r11);	 Catch:{ all -> 0x00f5 }
        monitor-exit(r10);
        return r12;
    L_0x00f1:
        r10.f18026m = r7;	 Catch:{ all -> 0x00f5 }
    L_0x00f3:
        monitor-exit(r10);
        return r1;
    L_0x00f5:
        r11 = move-exception;
        monitor-exit(r10);
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bt.a.b(com.google.android.m4b.maps.bt.b, boolean):com.google.android.m4b.maps.bt.b");
    }

    /* renamed from: c */
    public final synchronized boolean m21975c() {
        return this.f18026m == (byte) 4;
    }

    /* renamed from: a */
    public final synchronized boolean m21973a(C4907b c4907b) {
        if (c4907b != null) {
            if (c4907b.f18033c >= this.f18025l && m21975c() == null) {
                c4907b = true;
            }
        }
        c4907b = null;
        return c4907b;
    }
}
