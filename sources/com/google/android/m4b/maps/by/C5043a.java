package com.google.android.m4b.maps.by;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import android.util.Pair;
import com.google.android.m4b.maps.at.C4670c;
import com.google.android.m4b.maps.ay.C4712d;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bw.C4967a;
import com.google.android.m4b.maps.bw.C4976e;
import com.google.android.m4b.maps.bw.C4976e.C4973a;
import com.google.android.m4b.maps.bw.C4976e.C4974b;
import com.google.android.m4b.maps.bx.ao;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.cc.C6587q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* renamed from: com.google.android.m4b.maps.by.a */
public final class C5043a {
    /* renamed from: a */
    protected static final ba f18646a = new ba(-1, 0, 0);
    /* renamed from: b */
    private static C5043a f18647b;
    /* renamed from: c */
    private final C4712d f18648c;
    /* renamed from: d */
    private final Map<Pair<Long, C5042d>, C6569c> f18649d = new HashMap();
    /* renamed from: e */
    private final int f18650e;
    /* renamed from: f */
    private final int f18651f;
    /* renamed from: g */
    private int f18652g = 0;
    /* renamed from: h */
    private int f18653h = 0;
    /* renamed from: i */
    private final List<Long> f18654i = new ArrayList();

    /* renamed from: com.google.android.m4b.maps.by.a$a */
    static class C5040a {
        /* renamed from: a */
        public C6587q f18636a;
        /* renamed from: b */
        public int f18637b;
        /* renamed from: c */
        public int f18638c;
        /* renamed from: d */
        public long f18639d;

        public C5040a(C6587q c6587q, int i, int i2, long j) {
            this.f18636a = null;
            this.f18637b = 0;
            this.f18638c = 0;
            this.f18639d = j;
        }

        public C5040a(C5040a c5040a) {
            this.f18636a = c5040a.f18636a;
            this.f18637b = c5040a.f18637b;
            this.f18638c = c5040a.f18638c;
            this.f18639d = c5040a.f18639d;
        }
    }

    /* renamed from: com.google.android.m4b.maps.by.a$b */
    static class C5041b implements Comparable<C5041b> {
        /* renamed from: a */
        public Pair<Long, C5042d> f18640a;
        /* renamed from: b */
        public ba f18641b;
        /* renamed from: c */
        private C5040a f18642c;

        public final /* synthetic */ int compareTo(Object obj) {
            return Long.valueOf(this.f18642c.f18639d).compareTo(Long.valueOf(((C5041b) obj).f18642c.f18639d));
        }

        public C5041b(Pair<Long, C5042d> pair, ba baVar, C5040a c5040a) {
            this.f18640a = pair;
            this.f18641b = baVar;
            this.f18642c = c5040a;
        }
    }

    /* renamed from: com.google.android.m4b.maps.by.a$d */
    public static class C5042d implements Comparable<C5042d> {
        /* renamed from: a */
        private final int f18643a;
        /* renamed from: b */
        private final C4967a f18644b;
        /* renamed from: c */
        private final String f18645c;

        public final /* synthetic */ int compareTo(Object obj) {
            C5042d c5042d = (C5042d) obj;
            if (this.f18643a != c5042d.f18643a) {
                return this.f18643a - c5042d.f18643a;
            }
            return this.f18644b.m22230a(c5042d.f18644b);
        }

        public C5042d(bg bgVar, Set<bg> set) {
            this(bgVar, null, C4967a.f18341a);
        }

        public C5042d(bg bgVar, Set<bg> set, C4967a c4967a) {
            if (bgVar.f17773C) {
                throw new IllegalArgumentException("Modifier tile types not allowed as base");
            }
            int e = 1 << bgVar.m21682e();
            StringBuilder stringBuilder = new StringBuilder(bgVar.toString());
            if (set != null && set.isEmpty() == null) {
                stringBuilder.append(" with modifiers ");
                bgVar = set.iterator();
                while (bgVar.hasNext() != null) {
                    bg bgVar2 = (bg) bgVar.next();
                    if (bgVar2.f17773C) {
                        e |= 1 << bgVar2.m21682e();
                        stringBuilder.append(bgVar2.toString());
                        if (bgVar.hasNext() != null) {
                            stringBuilder.append(", ");
                        }
                    } else {
                        throw new IllegalArgumentException("Only modifier tile types allowed");
                    }
                }
            }
            if (c4967a != C4967a.f18341a) {
                bgVar = String.valueOf(c4967a);
                set = new StringBuilder(String.valueOf(bgVar).length() + 11);
                set.append(" with mask ");
                set.append(bgVar);
                stringBuilder.append(set.toString());
            }
            this.f18643a = e;
            this.f18645c = stringBuilder.toString();
            this.f18644b = c4967a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C5042d) {
                C5042d c5042d = (C5042d) obj;
                if (c5042d.f18643a == this.f18643a && c5042d.f18644b.equals(this.f18644b) != null) {
                    return true;
                }
            }
            return null;
        }

        public final int hashCode() {
            return (this.f18643a * 33) ^ this.f18644b.hashCode();
        }

        public final String toString() {
            return this.f18645c;
        }
    }

    /* renamed from: com.google.android.m4b.maps.by.a$c */
    class C6569c extends C4976e<ba, C5040a> {
        /* renamed from: a */
        private final Long f24558a;
        /* renamed from: b */
        private final List<C5040a> f24559b = new ArrayList();
        /* renamed from: c */
        private /* synthetic */ C5043a f24560c;

        /* renamed from: b */
        protected final /* synthetic */ void mo5247b(Object obj, Object obj2) {
            C5040a c5040a = (C5040a) obj2;
            super.mo5247b((ba) obj, c5040a);
            this.f24560c.f18652g = this.f24560c.f18652g - c5040a.f18637b;
            this.f24560c.f18653h = this.f24560c.f18653h - c5040a.f18638c;
            if (c5040a.f18636a != null) {
                c5040a.f18637b = 0;
                c5040a.f18638c = 0;
                m29214a(c5040a);
            }
        }

        public C6569c(C5043a c5043a, long j) {
            this.f24560c = c5043a;
            super(ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
            this.f24558a = Long.valueOf(j);
        }

        /* renamed from: f */
        public final void m29217f() {
            List<ba> arrayList = new ArrayList(m22250b());
            C4973a e = m22257e();
            while (e.hasNext()) {
                C4974b a = e.m22243a();
                if (a.f18351a == C5043a.f18646a) {
                    break;
                }
                C5040a c5040a = (C5040a) a.f18352b;
                C6587q c6587q = c5040a.f18636a;
                if (c6587q != null) {
                    if (c6587q.mo7133a()) {
                        c6587q.mo5223b(C5052d.m22596b(this.f24558a.longValue()));
                        this.f24560c.f18652g = this.f24560c.f18652g - c5040a.f18637b;
                        c5040a.f18637b = 0;
                    }
                }
                arrayList.add(a.f18351a);
            }
            for (ba c : arrayList) {
                m22254c(c);
            }
        }

        /* renamed from: g */
        public final C4974b<ba, C5040a> m29218g() {
            C4973a e = m22257e();
            return e.hasNext() ? e.m22243a() : null;
        }

        /* renamed from: h */
        public final void m29219h() {
            this.f24560c.f18648c;
            long c = C4712d.m20957c();
            C5040a c5040a = (C5040a) m22251b((Object) C5043a.f18646a);
            if (c5040a == null) {
                m22255c(C5043a.f18646a, new C5040a(null, 0, 0, c));
            } else {
                c5040a.f18639d = c;
            }
        }

        /* renamed from: a */
        public final void m29214a(C5040a c5040a) {
            this.f24559b.add(c5040a);
        }

        /* renamed from: a */
        public final void m29215a(C5052d c5052d) {
            for (C5040a c5040a : this.f24559b) {
                c5040a.f18636a.mo5224c(c5052d);
                this.f24560c.f18652g = this.f24560c.f18652g - c5040a.f18637b;
                this.f24560c.f18653h = this.f24560c.f18653h - c5040a.f18638c;
            }
            this.f24559b.clear();
        }
    }

    /* renamed from: a */
    public static synchronized C5043a m22547a() {
        C5043a c5043a;
        synchronized (C5043a.class) {
            c5043a = f18647b;
        }
        return c5043a;
    }

    /* renamed from: a */
    public static synchronized void m22550a(C4712d c4712d) {
        synchronized (C5043a.class) {
            if (f18647b == null) {
                int e = (ao.m22338e() * 1024) * 1024;
                f18647b = new C5043a(c4712d, e / 2, (e * 3) / 16);
            }
        }
    }

    private C5043a(C4712d c4712d, int i, int i2) {
        this.f18648c = c4712d;
        this.f18650e = i;
        this.f18651f = i2;
    }

    /* renamed from: a */
    public final synchronized void m22556a(C5052d c5052d) {
        long a = C5052d.m22594a(c5052d);
        this.f18654i.add(Long.valueOf(a));
        C5052d<Pair> arrayList = new ArrayList();
        for (Entry entry : this.f18649d.entrySet()) {
            if (((Long) ((Pair) entry.getKey()).first).longValue() == a) {
                ((C6569c) entry.getValue()).m22247a();
                ((C6569c) entry.getValue()).m29215a(null);
                arrayList.add(entry.getKey());
            }
        }
        for (Pair remove : arrayList) {
            this.f18649d.remove(remove);
        }
    }

    /* renamed from: a */
    public final synchronized void m22557a(C5052d c5052d, C5042d c5042d) {
        c5042d = Pair.create(Long.valueOf(C5052d.m22594a(c5052d)), c5042d);
        C6569c c6569c = (C6569c) this.f18649d.get(c5042d);
        if (c6569c != null) {
            c6569c.m22247a();
            c6569c.m29215a(c5052d);
            this.f18649d.remove(c5042d);
        }
    }

    /* renamed from: b */
    public final synchronized void m22563b(C5052d c5052d, C5042d c5042d) {
        c5042d = Pair.create(Long.valueOf(C5052d.m22594a(c5052d)), c5042d);
        C6569c c6569c = (C6569c) this.f18649d.get(c5042d);
        if (c6569c != null) {
            c6569c.m22254c(f18646a);
            c6569c.m29217f();
            c6569c.m29215a(c5052d);
            if (c6569c.m22250b() == null) {
                this.f18649d.remove(c5042d);
            }
        }
    }

    /* renamed from: b */
    public final synchronized void m22562b(C5052d c5052d) {
        if (c5052d != null) {
            long a = C5052d.m22594a(c5052d);
            for (Entry entry : this.f18649d.entrySet()) {
                if (((Long) ((Pair) entry.getKey()).first).longValue() == a) {
                    ((C6569c) entry.getValue()).m22254c(f18646a);
                    ((C6569c) entry.getValue()).m29215a(c5052d);
                }
            }
        }
    }

    /* renamed from: c */
    public final synchronized void m22566c(C5052d c5052d, C5042d c5042d) {
        C6569c c6569c = (C6569c) this.f18649d.get(Pair.create(Long.valueOf(C5052d.m22594a(c5052d)), c5042d));
        if (c6569c != null) {
            c6569c.m29217f();
        }
    }

    /* renamed from: a */
    public final synchronized void m22558a(C5052d c5052d, C5042d c5042d, ba baVar, C6587q c6587q) {
        long a = C5052d.m22594a(c5052d);
        Pair create = Pair.create(Long.valueOf(a), c5042d);
        c5042d = (C6569c) this.f18649d.get(create);
        if (c5042d == null) {
            c5042d = m22546a(a, create);
        }
        if (c5042d != null) {
            C5040a c5040a = (C5040a) c5042d.m22246a((Object) baVar);
            if (c5040a != null) {
                if (c5040a.f18636a != null) {
                    c5042d.m29214a(new C5040a(c5040a));
                }
                c5040a.f18636a = c6587q;
                c5040a.f18637b = c6587q.mo7142f();
                c5040a.f18638c = c6587q.mo7143g();
                this.f18652g += c5040a.f18637b;
                this.f18653h += c5040a.f18638c;
                m22549a(this.f18650e, this.f18651f);
            }
        }
    }

    /* renamed from: a */
    private C6569c m22546a(long j, Pair<Long, C5042d> pair) {
        if (this.f18654i.contains(Long.valueOf(j))) {
            return 0;
        }
        C6569c c6569c = new C6569c(this, j);
        this.f18649d.put(pair, c6569c);
        return c6569c;
    }

    /* renamed from: a */
    private synchronized void m22549a(int i, int i2) {
        if (this.f18652g > i || this.f18653h > i2) {
            C4974b g;
            SortedSet treeSet = new TreeSet();
            for (Entry entry : this.f18649d.entrySet()) {
                g = ((C6569c) entry.getValue()).m29218g();
                if (!(g == null || g.f18351a == f18646a)) {
                    treeSet.add(new C5041b((Pair) entry.getKey(), (ba) g.f18351a, (C5040a) g.f18352b));
                }
            }
            List<Pair> arrayList = new ArrayList();
            while (!treeSet.isEmpty() && (this.f18652g > i || this.f18653h > i2)) {
                C5041b c5041b = (C5041b) treeSet.first();
                C6569c c6569c = (C6569c) this.f18649d.get(c5041b.f18640a);
                c6569c.m22254c(c5041b.f18641b);
                if (c6569c.m22250b() == 0 && c6569c.f24559b.isEmpty()) {
                    arrayList.add(c5041b.f18640a);
                }
                treeSet.remove(c5041b);
                g = c6569c.m29218g();
                if (!(g == null || g.f18351a == f18646a)) {
                    treeSet.add(new C5041b(c5041b.f18640a, (ba) g.f18351a, (C5040a) g.f18352b));
                }
            }
            for (Pair remove : arrayList) {
                this.f18649d.remove(remove);
            }
        }
    }

    /* renamed from: a */
    public final synchronized C6587q m22555a(C5052d c5052d, C5042d c5042d, ba baVar, boolean z) {
        c5052d = m22553b(c5052d, c5042d, baVar, z);
        if (c5052d == null) {
            return null;
        }
        return c5052d.f18636a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private synchronized com.google.android.m4b.maps.by.C5043a.C5040a m22553b(com.google.android.m4b.maps.ca.C5052d r10, com.google.android.m4b.maps.by.C5043a.C5042d r11, com.google.android.m4b.maps.bo.ba r12, boolean r13) {
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = com.google.android.m4b.maps.ca.C5052d.m22594a(r10);	 Catch:{ all -> 0x0048 }
        r10 = java.lang.Long.valueOf(r0);	 Catch:{ all -> 0x0048 }
        r10 = android.util.Pair.create(r10, r11);	 Catch:{ all -> 0x0048 }
        r11 = r9.f18649d;	 Catch:{ all -> 0x0048 }
        r11 = r11.get(r10);	 Catch:{ all -> 0x0048 }
        r11 = (com.google.android.m4b.maps.by.C5043a.C6569c) r11;	 Catch:{ all -> 0x0048 }
        r2 = 0;
        if (r11 != 0) goto L_0x0024;
    L_0x0018:
        if (r13 == 0) goto L_0x0022;
    L_0x001a:
        r11 = r9.m22546a(r0, r10);	 Catch:{ all -> 0x0048 }
        if (r11 != 0) goto L_0x0024;
    L_0x0020:
        monitor-exit(r9);
        return r2;
    L_0x0022:
        monitor-exit(r9);
        return r2;
    L_0x0024:
        r10 = r11.m22251b(r12);	 Catch:{ all -> 0x0048 }
        r10 = (com.google.android.m4b.maps.by.C5043a.C5040a) r10;	 Catch:{ all -> 0x0048 }
        if (r10 == 0) goto L_0x0034;
    L_0x002c:
        r11 = com.google.android.m4b.maps.ay.C4712d.m20957c();	 Catch:{ all -> 0x0048 }
        r10.f18639d = r11;	 Catch:{ all -> 0x0048 }
        monitor-exit(r9);
        return r10;
    L_0x0034:
        if (r13 == 0) goto L_0x0046;
    L_0x0036:
        r10 = new com.google.android.m4b.maps.by.a$a;	 Catch:{ all -> 0x0048 }
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r7 = com.google.android.m4b.maps.ay.C4712d.m20957c();	 Catch:{ all -> 0x0048 }
        r3 = r10;
        r3.<init>(r4, r5, r6, r7);	 Catch:{ all -> 0x0048 }
        r11.m22255c(r12, r10);	 Catch:{ all -> 0x0048 }
    L_0x0046:
        monitor-exit(r9);
        return r2;
    L_0x0048:
        r10 = move-exception;
        monitor-exit(r9);
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.by.a.b(com.google.android.m4b.maps.ca.d, com.google.android.m4b.maps.by.a$d, com.google.android.m4b.maps.bo.ba, boolean):com.google.android.m4b.maps.by.a$a");
    }

    /* renamed from: a */
    public final synchronized void m22559a(C5052d c5052d, C5042d c5042d, List<ba> list) {
        C6569c c6569c = (C6569c) this.f18649d.get(Pair.create(Long.valueOf(C5052d.m22594a(c5052d)), c5042d));
        if (c6569c != null) {
            c5042d = null;
            for (ba a : list) {
                C5040a c5040a = (C5040a) c6569c.m22246a((Object) a);
                if (!(c5040a == null || c5040a.f18636a == null || c5040a.f18637b != 0)) {
                    c5042d += c5040a.f18638c;
                }
            }
            m22549a(this.f18650e - c5042d, this.f18651f);
        }
    }

    /* renamed from: b */
    public final synchronized void m22564b(C5052d c5052d, C5042d c5042d, List<ba> list) {
        C6569c c6569c = (C6569c) this.f18649d.get(Pair.create(Long.valueOf(C5052d.m22594a(c5052d)), c5042d));
        if (c6569c != null) {
            for (ba a : list) {
                C5040a c5040a = (C5040a) c6569c.m22246a((Object) a);
                if (!(c5040a == null || c5040a.f18636a == null || c5040a.f18637b != 0)) {
                    c5040a.f18637b = c5040a.f18636a.mo7142f();
                    this.f18652g += c5040a.f18637b;
                    int i = c5040a.f18638c;
                    int g = c5040a.f18636a.mo7143g();
                    c5040a.f18638c = g;
                    this.f18653h = (this.f18653h - i) + g;
                }
            }
            m22549a(this.f18650e, this.f18651f);
        }
    }

    /* renamed from: d */
    public final synchronized void m22567d(C5052d c5052d, C5042d c5042d) {
        long a = C5052d.m22594a(c5052d);
        Pair create = Pair.create(Long.valueOf(a), c5042d);
        C6569c c6569c = (C6569c) this.f18649d.get(create);
        if (c6569c == null) {
            c6569c = m22546a(a, create);
        }
        if (c6569c != null) {
            c6569c.m29219h();
            c6569c.m29215a(c5052d);
        }
    }

    /* renamed from: a */
    public final synchronized void m22560a(boolean z) {
        if (z) {
            m22549a(this.f18652g, 0);
        } else {
            m22549a(this.f18652g, this.f18653h / 2);
        }
    }

    /* renamed from: b */
    public final void m22561b() {
        m22549a(0, this.f18653h);
    }

    /* renamed from: c */
    public final synchronized String m22565c() {
        StringBuilder stringBuilder;
        stringBuilder = new StringBuilder();
        for (Entry entry : this.f18649d.entrySet()) {
            int b = ((C6569c) entry.getValue()).m22250b();
            if (b != 0) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(" + ");
                }
                stringBuilder.append(b);
                stringBuilder.append(" ");
                stringBuilder.append(entry.getKey());
            }
        }
        if (stringBuilder.length() == 0) {
            stringBuilder.append("no");
        }
        stringBuilder.append(" tiles use ");
        stringBuilder.append(C5043a.m22548a(this.f18652g));
        stringBuilder.append("/");
        stringBuilder.append(C5043a.m22548a(this.f18650e));
        stringBuilder.append("M GL, ");
        stringBuilder.append(C5043a.m22548a(this.f18653h));
        stringBuilder.append("/");
        stringBuilder.append(C5043a.m22548a(this.f18651f));
        stringBuilder.append("M J+N");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private static String m22548a(int i) {
        i = C4670c.m20882a(i * 10, 1048576);
        int i2 = i / 10;
        i %= 10;
        StringBuilder stringBuilder = new StringBuilder(23);
        stringBuilder.append(i2);
        stringBuilder.append(".");
        stringBuilder.append(i);
        return stringBuilder.toString();
    }
}
