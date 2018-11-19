package com.google.android.m4b.maps.aa;

import com.google.android.exoplayer2.Format;
import com.google.android.m4b.maps.aa.C4587w.C6369a;
import com.google.android.m4b.maps.aa.av.C4553b;
import com.google.android.m4b.maps.aa.av.C4554c;
import com.google.android.m4b.maps.aa.av.C7403d;
import com.google.android.m4b.maps.ag.C4609a;
import com.google.android.m4b.maps.p125y.C5563e;
import com.google.android.m4b.maps.p125y.C5569h;
import com.google.android.m4b.maps.p125y.C5571j;
import com.google.android.m4b.maps.p125y.C5582s;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

class aw<K, V> extends AbstractMap<K, V> implements Serializable, ConcurrentMap<K, V> {
    /* renamed from: j */
    static final Queue<? extends Object> f16926j = new C45552();
    /* renamed from: k */
    private static final Logger f16927k = Logger.getLogger(aw.class.getName());
    /* renamed from: r */
    private static C4565w<Object, Object> f16928r = new C63241();
    private static final long serialVersionUID = 5;
    /* renamed from: a */
    final transient C4563m<K, V>[] f16929a;
    /* renamed from: b */
    final C5563e<Object> f16930b;
    /* renamed from: c */
    final C5563e<Object> f16931c = this.f16932d.mo4824a();
    /* renamed from: d */
    final C4564p f16932d;
    /* renamed from: e */
    final long f16933e;
    /* renamed from: f */
    final long f16934f;
    /* renamed from: g */
    final Queue<C7403d<K, V>> f16935g;
    /* renamed from: h */
    final transient C4556c f16936h;
    /* renamed from: i */
    final C5582s f16937i;
    /* renamed from: l */
    private transient int f16938l;
    /* renamed from: m */
    private transient int f16939m;
    /* renamed from: n */
    private int f16940n;
    /* renamed from: o */
    private C4564p f16941o;
    /* renamed from: p */
    private int f16942p;
    /* renamed from: q */
    private C4554c<K, V> f16943q;
    /* renamed from: s */
    private transient Set<K> f16944s;
    /* renamed from: t */
    private transient Collection<V> f16945t;
    /* renamed from: u */
    private transient Set<Entry<K, V>> f16946u;

    /* renamed from: com.google.android.m4b.maps.aa.aw$2 */
    static class C45552 extends AbstractQueue<Object> {
        public final boolean offer(Object obj) {
            return true;
        }

        public final Object peek() {
            return null;
        }

        public final Object poll() {
            return null;
        }

        public final int size() {
            return 0;
        }

        C45552() {
        }

        public final Iterator<Object> iterator() {
            return at.m20505a();
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.aw$c */
    enum C4556c {
        STRONG {
            /* renamed from: a */
            final <K, V> C4562l<K, V> mo4821a(C4563m<K, V> c4563m, K k, int i, C4562l<K, V> c4562l) {
                return new C6341q(k, i, c4562l);
            }
        },
        STRONG_EXPIRABLE {
            /* renamed from: a */
            final <K, V> C4562l<K, V> mo4821a(C4563m<K, V> c4563m, K k, int i, C4562l<K, V> c4562l) {
                return new C7409s(k, i, c4562l);
            }

            /* renamed from: a */
            final <K, V> C4562l<K, V> mo4822a(C4563m<K, V> c4563m, C4562l<K, V> c4562l, C4562l<K, V> c4562l2) {
                c4563m = super.mo4822a((C4563m) c4563m, (C4562l) c4562l, (C4562l) c4562l2);
                C4556c.m20533a(c4562l, c4563m);
                return c4563m;
            }
        },
        STRONG_EVICTABLE {
            /* renamed from: a */
            final <K, V> C4562l<K, V> mo4821a(C4563m<K, V> c4563m, K k, int i, C4562l<K, V> c4562l) {
                return new C7408r(k, i, c4562l);
            }

            /* renamed from: a */
            final <K, V> C4562l<K, V> mo4822a(C4563m<K, V> c4563m, C4562l<K, V> c4562l, C4562l<K, V> c4562l2) {
                c4563m = super.mo4822a((C4563m) c4563m, (C4562l) c4562l, (C4562l) c4562l2);
                C4556c.m20534b(c4562l, c4563m);
                return c4563m;
            }
        },
        STRONG_EXPIRABLE_EVICTABLE {
            /* renamed from: a */
            final <K, V> C4562l<K, V> mo4821a(C4563m<K, V> c4563m, K k, int i, C4562l<K, V> c4562l) {
                return new C7410t(k, i, c4562l);
            }

            /* renamed from: a */
            final <K, V> C4562l<K, V> mo4822a(C4563m<K, V> c4563m, C4562l<K, V> c4562l, C4562l<K, V> c4562l2) {
                c4563m = super.mo4822a((C4563m) c4563m, (C4562l) c4562l, (C4562l) c4562l2);
                C4556c.m20533a(c4562l, c4563m);
                C4556c.m20534b(c4562l, c4563m);
                return c4563m;
            }
        },
        WEAK {
            /* renamed from: a */
            final <K, V> C4562l<K, V> mo4821a(C4563m<K, V> c4563m, K k, int i, C4562l<K, V> c4562l) {
                return new C6344y(c4563m.f16913e, k, i, c4562l);
            }
        },
        WEAK_EXPIRABLE {
            /* renamed from: a */
            final <K, V> C4562l<K, V> mo4821a(C4563m<K, V> c4563m, K k, int i, C4562l<K, V> c4562l) {
                return new aa(c4563m.f16913e, k, i, c4562l);
            }

            /* renamed from: a */
            final <K, V> C4562l<K, V> mo4822a(C4563m<K, V> c4563m, C4562l<K, V> c4562l, C4562l<K, V> c4562l2) {
                c4563m = super.mo4822a((C4563m) c4563m, (C4562l) c4562l, (C4562l) c4562l2);
                C4556c.m20533a(c4562l, c4563m);
                return c4563m;
            }
        },
        WEAK_EVICTABLE {
            /* renamed from: a */
            final <K, V> C4562l<K, V> mo4821a(C4563m<K, V> c4563m, K k, int i, C4562l<K, V> c4562l) {
                return new C7411z(c4563m.f16913e, k, i, c4562l);
            }

            /* renamed from: a */
            final <K, V> C4562l<K, V> mo4822a(C4563m<K, V> c4563m, C4562l<K, V> c4562l, C4562l<K, V> c4562l2) {
                c4563m = super.mo4822a((C4563m) c4563m, (C4562l) c4562l, (C4562l) c4562l2);
                C4556c.m20534b(c4562l, c4563m);
                return c4563m;
            }
        },
        WEAK_EXPIRABLE_EVICTABLE {
            /* renamed from: a */
            final <K, V> C4562l<K, V> mo4821a(C4563m<K, V> c4563m, K k, int i, C4562l<K, V> c4562l) {
                return new ab(c4563m.f16913e, k, i, c4562l);
            }

            /* renamed from: a */
            final <K, V> C4562l<K, V> mo4822a(C4563m<K, V> c4563m, C4562l<K, V> c4562l, C4562l<K, V> c4562l2) {
                c4563m = super.mo4822a((C4563m) c4563m, (C4562l) c4562l, (C4562l) c4562l2);
                C4556c.m20533a(c4562l, c4563m);
                C4556c.m20534b(c4562l, c4563m);
                return c4563m;
            }
        };
        
        /* renamed from: i */
        private static C4556c[][] f16895i;

        /* renamed from: a */
        abstract <K, V> C4562l<K, V> mo4821a(C4563m<K, V> c4563m, K k, int i, C4562l<K, V> c4562l);

        static {
            r0 = new C4556c[3][];
            r0[0] = new C4556c[]{STRONG, STRONG_EXPIRABLE, STRONG_EVICTABLE, STRONG_EXPIRABLE_EVICTABLE};
            r0[1] = new C4556c[0];
            r0[2] = new C4556c[]{WEAK, WEAK_EXPIRABLE, WEAK_EVICTABLE, WEAK_EXPIRABLE_EVICTABLE};
            f16895i = r0;
        }

        /* renamed from: a */
        static C4556c m20532a(C4564p c4564p, boolean z, boolean z2) {
            return f16895i[c4564p.ordinal()][z | (z2 ? true : false)];
        }

        /* renamed from: a */
        <K, V> C4562l<K, V> mo4822a(C4563m<K, V> c4563m, C4562l<K, V> c4562l, C4562l<K, V> c4562l2) {
            return mo4821a(c4563m, c4562l.mo4812d(), c4562l.mo4810c(), c4562l2);
        }

        /* renamed from: a */
        static <K, V> void m20533a(C4562l<K, V> c4562l, C4562l<K, V> c4562l2) {
            c4562l2.mo4805a(c4562l.mo4814e());
            aw.m20596a(c4562l.mo4816g(), (C4562l) c4562l2);
            aw.m20596a((C4562l) c4562l2, c4562l.mo4815f());
            aw.m20598b(c4562l);
        }

        /* renamed from: b */
        static <K, V> void m20534b(C4562l<K, V> c4562l, C4562l<K, V> c4562l2) {
            aw.m20599b(c4562l.mo4818i(), c4562l2);
            aw.m20599b(c4562l2, c4562l.mo4817h());
            aw.m20600c(c4562l);
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.aw$e */
    final class C4557e extends AbstractSet<Entry<K, V>> {
        /* renamed from: a */
        private /* synthetic */ aw f16897a;

        C4557e(aw awVar) {
            this.f16897a = awVar;
        }

        public final Iterator<Entry<K, V>> iterator() {
            return new C6334d(this.f16897a);
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            if (key == null) {
                return false;
            }
            key = this.f16897a.get(key);
            if (key == null || this.f16897a.f16931c.m24261a(entry.getValue(), key) == null) {
                return false;
            }
            return true;
        }

        public final boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            if (key == null || this.f16897a.remove(key, entry.getValue()) == null) {
                return false;
            }
            return true;
        }

        public final int size() {
            return this.f16897a.size();
        }

        public final boolean isEmpty() {
            return this.f16897a.isEmpty();
        }

        public final void clear() {
            this.f16897a.clear();
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.aw$f */
    static final class C4558f<K, V> extends AbstractQueue<C4562l<K, V>> {
        /* renamed from: a */
        final C4562l<K, V> f16898a = new C74041(this);

        /* renamed from: com.google.android.m4b.maps.aa.aw$f$1 */
        class C74041 extends C6325a<K, V> {
            /* renamed from: a */
            private C4562l<K, V> f27163a = this;
            /* renamed from: b */
            private C4562l<K, V> f27164b = this;
            /* renamed from: c */
            private /* synthetic */ C4558f f27165c;

            C74041(C4558f c4558f) {
                this.f27165c = c4558f;
            }

            /* renamed from: h */
            public final C4562l<K, V> mo4817h() {
                return this.f27163a;
            }

            /* renamed from: c */
            public final void mo4811c(C4562l<K, V> c4562l) {
                this.f27163a = c4562l;
            }

            /* renamed from: i */
            public final C4562l<K, V> mo4818i() {
                return this.f27164b;
            }

            /* renamed from: d */
            public final void mo4813d(C4562l<K, V> c4562l) {
                this.f27164b = c4562l;
            }
        }

        C4558f() {
        }

        public final /* synthetic */ boolean offer(Object obj) {
            C4562l c4562l = (C4562l) obj;
            aw.m20599b(c4562l.mo4818i(), c4562l.mo4817h());
            aw.m20599b(this.f16898a.mo4818i(), c4562l);
            aw.m20599b(c4562l, this.f16898a);
            return true;
        }

        public final /* synthetic */ Object peek() {
            return m20537a();
        }

        /* renamed from: a */
        private C4562l<K, V> m20537a() {
            C4562l<K, V> h = this.f16898a.mo4817h();
            return h == this.f16898a ? null : h;
        }

        public final boolean remove(Object obj) {
            C4562l c4562l = (C4562l) obj;
            C4562l i = c4562l.mo4818i();
            C4562l h = c4562l.mo4817h();
            aw.m20599b(i, h);
            aw.m20600c(c4562l);
            return h != C6336k.INSTANCE ? true : null;
        }

        public final boolean contains(Object obj) {
            return ((C4562l) obj).mo4817h() != C6336k.INSTANCE ? true : null;
        }

        public final boolean isEmpty() {
            return this.f16898a.mo4817h() == this.f16898a;
        }

        public final int size() {
            int i = 0;
            for (C4562l h = this.f16898a.mo4817h(); h != this.f16898a; h = h.mo4817h()) {
                i++;
            }
            return i;
        }

        public final void clear() {
            C4562l h = this.f16898a.mo4817h();
            while (h != this.f16898a) {
                C4562l h2 = h.mo4817h();
                aw.m20600c(h);
                h = h2;
            }
            this.f16898a.mo4811c(this.f16898a);
            this.f16898a.mo4813d(this.f16898a);
        }

        public final Iterator<C4562l<K, V>> iterator() {
            return new C6363f<C4562l<K, V>>(this, m20537a()) {
                /* renamed from: a */
                private /* synthetic */ C4558f f27166a;

                /* renamed from: a */
                protected final /* synthetic */ Object mo7001a(Object obj) {
                    C4562l h = ((C4562l) obj).mo4817h();
                    return h == this.f27166a.f16898a ? null : h;
                }
            };
        }

        public final /* synthetic */ Object poll() {
            C4562l h = this.f16898a.mo4817h();
            if (h == this.f16898a) {
                return null;
            }
            remove(h);
            return h;
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.aw$g */
    static final class C4559g<K, V> extends AbstractQueue<C4562l<K, V>> {
        /* renamed from: a */
        final C4562l<K, V> f16899a = new C74061(this);

        /* renamed from: com.google.android.m4b.maps.aa.aw$g$1 */
        class C74061 extends C6325a<K, V> {
            /* renamed from: a */
            private C4562l<K, V> f27167a = this;
            /* renamed from: b */
            private C4562l<K, V> f27168b = this;
            /* renamed from: c */
            private /* synthetic */ C4559g f27169c;

            /* renamed from: a */
            public final void mo4805a(long j) {
            }

            /* renamed from: e */
            public final long mo4814e() {
                return Format.OFFSET_SAMPLE_RELATIVE;
            }

            C74061(C4559g c4559g) {
                this.f27169c = c4559g;
            }

            /* renamed from: f */
            public final C4562l<K, V> mo4815f() {
                return this.f27167a;
            }

            /* renamed from: a */
            public final void mo4806a(C4562l<K, V> c4562l) {
                this.f27167a = c4562l;
            }

            /* renamed from: g */
            public final C4562l<K, V> mo4816g() {
                return this.f27168b;
            }

            /* renamed from: b */
            public final void mo4809b(C4562l<K, V> c4562l) {
                this.f27168b = c4562l;
            }
        }

        C4559g() {
        }

        public final /* synthetic */ boolean offer(Object obj) {
            C4562l c4562l = (C4562l) obj;
            aw.m20596a(c4562l.mo4816g(), c4562l.mo4815f());
            aw.m20596a(this.f16899a.mo4816g(), c4562l);
            aw.m20596a(c4562l, this.f16899a);
            return true;
        }

        public final /* synthetic */ Object peek() {
            return m20538a();
        }

        /* renamed from: a */
        private C4562l<K, V> m20538a() {
            C4562l<K, V> f = this.f16899a.mo4815f();
            return f == this.f16899a ? null : f;
        }

        public final boolean remove(Object obj) {
            C4562l c4562l = (C4562l) obj;
            C4562l g = c4562l.mo4816g();
            C4562l f = c4562l.mo4815f();
            aw.m20596a(g, f);
            aw.m20598b(c4562l);
            return f != C6336k.INSTANCE ? true : null;
        }

        public final boolean contains(Object obj) {
            return ((C4562l) obj).mo4815f() != C6336k.INSTANCE ? true : null;
        }

        public final boolean isEmpty() {
            return this.f16899a.mo4815f() == this.f16899a;
        }

        public final int size() {
            int i = 0;
            for (C4562l f = this.f16899a.mo4815f(); f != this.f16899a; f = f.mo4815f()) {
                i++;
            }
            return i;
        }

        public final void clear() {
            C4562l f = this.f16899a.mo4815f();
            while (f != this.f16899a) {
                C4562l f2 = f.mo4815f();
                aw.m20598b(f);
                f = f2;
            }
            this.f16899a.mo4806a(this.f16899a);
            this.f16899a.mo4809b(this.f16899a);
        }

        public final Iterator<C4562l<K, V>> iterator() {
            return new C6363f<C4562l<K, V>>(this, m20538a()) {
                /* renamed from: a */
                private /* synthetic */ C4559g f27170a;

                /* renamed from: a */
                protected final /* synthetic */ Object mo7001a(Object obj) {
                    C4562l f = ((C4562l) obj).mo4815f();
                    return f == this.f27170a.f16899a ? null : f;
                }
            };
        }

        public final /* synthetic */ Object poll() {
            C4562l f = this.f16899a.mo4815f();
            if (f == this.f16899a) {
                return null;
            }
            remove(f);
            return f;
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.aw$h */
    abstract class C4560h<E> implements Iterator<E> {
        /* renamed from: a */
        private int f16900a;
        /* renamed from: b */
        private int f16901b = -1;
        /* renamed from: c */
        private C4563m<K, V> f16902c;
        /* renamed from: d */
        private AtomicReferenceArray<C4562l<K, V>> f16903d;
        /* renamed from: e */
        private C4562l<K, V> f16904e;
        /* renamed from: f */
        private ad f16905f;
        /* renamed from: g */
        private ad f16906g;
        /* renamed from: h */
        private /* synthetic */ aw f16907h;

        C4560h(aw awVar) {
            this.f16907h = awVar;
            this.f16900a = awVar.f16929a.length - 1;
            m20540b();
        }

        /* renamed from: b */
        private void m20540b() {
            this.f16905f = null;
            if (!m20541c() && !m20542d()) {
                while (this.f16900a >= 0) {
                    C4563m[] c4563mArr = this.f16907h.f16929a;
                    int i = this.f16900a;
                    this.f16900a = i - 1;
                    this.f16902c = c4563mArr[i];
                    if (this.f16902c.f16910b != 0) {
                        this.f16903d = this.f16902c.f16912d;
                        this.f16901b = this.f16903d.length() - 1;
                        if (m20542d()) {
                            return;
                        }
                    }
                }
            }
        }

        /* renamed from: c */
        private boolean m20541c() {
            if (this.f16904e != null) {
                do {
                    this.f16904e = this.f16904e.mo4808b();
                    if (this.f16904e != null) {
                    }
                } while (!m20539a(this.f16904e));
                return true;
            }
            return false;
        }

        /* renamed from: d */
        private boolean m20542d() {
            while (this.f16901b >= 0) {
                AtomicReferenceArray atomicReferenceArray = this.f16903d;
                int i = this.f16901b;
                this.f16901b = i - 1;
                C4562l c4562l = (C4562l) atomicReferenceArray.get(i);
                this.f16904e = c4562l;
                if (c4562l != null && (m20539a(this.f16904e) || m20541c())) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        private boolean m20539a(C4562l<K, V> c4562l) {
            try {
                Object d = c4562l.mo4812d();
                aw awVar = this.f16907h;
                Object obj = null;
                if (c4562l.mo4812d() != null) {
                    Object obj2 = c4562l.mo4804a().get();
                    if (obj2 != null) {
                        if (!awVar.m20607b() || awVar.m20606a((C4562l) c4562l) == null) {
                            obj = obj2;
                        }
                    }
                }
                if (obj != null) {
                    this.f16905f = new ad(this.f16907h, d, obj);
                    return true;
                }
                this.f16902c.m20587c();
                return null;
            } finally {
                this.f16902c.m20587c();
            }
        }

        public boolean hasNext() {
            return this.f16905f != null;
        }

        /* renamed from: a */
        final ad m20543a() {
            if (this.f16905f == null) {
                throw new NoSuchElementException();
            }
            this.f16906g = this.f16905f;
            m20540b();
            return this.f16906g;
        }

        public void remove() {
            C5571j.m24302b(this.f16906g != null, (Object) "no calls to next() since the last call to remove()");
            this.f16907h.remove(this.f16906g.getKey());
            this.f16906g = null;
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.aw$j */
    final class C4561j extends AbstractSet<K> {
        /* renamed from: a */
        private /* synthetic */ aw f16908a;

        C4561j(aw awVar) {
            this.f16908a = awVar;
        }

        public final Iterator<K> iterator() {
            return new C6335i(this.f16908a);
        }

        public final int size() {
            return this.f16908a.size();
        }

        public final boolean isEmpty() {
            return this.f16908a.isEmpty();
        }

        public final boolean contains(Object obj) {
            return this.f16908a.containsKey(obj);
        }

        public final boolean remove(Object obj) {
            return this.f16908a.remove(obj) != null ? true : null;
        }

        public final void clear() {
            this.f16908a.clear();
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.aw$l */
    interface C4562l<K, V> {
        /* renamed from: a */
        C4565w<K, V> mo4804a();

        /* renamed from: a */
        void mo4805a(long j);

        /* renamed from: a */
        void mo4806a(C4562l<K, V> c4562l);

        /* renamed from: a */
        void mo4807a(C4565w<K, V> c4565w);

        /* renamed from: b */
        C4562l<K, V> mo4808b();

        /* renamed from: b */
        void mo4809b(C4562l<K, V> c4562l);

        /* renamed from: c */
        int mo4810c();

        /* renamed from: c */
        void mo4811c(C4562l<K, V> c4562l);

        /* renamed from: d */
        K mo4812d();

        /* renamed from: d */
        void mo4813d(C4562l<K, V> c4562l);

        /* renamed from: e */
        long mo4814e();

        /* renamed from: f */
        C4562l<K, V> mo4815f();

        /* renamed from: g */
        C4562l<K, V> mo4816g();

        /* renamed from: h */
        C4562l<K, V> mo4817h();

        /* renamed from: i */
        C4562l<K, V> mo4818i();
    }

    /* renamed from: com.google.android.m4b.maps.aa.aw$m */
    static class C4563m<K, V> extends ReentrantLock {
        /* renamed from: a */
        final aw<K, V> f16909a;
        /* renamed from: b */
        volatile int f16910b;
        /* renamed from: c */
        int f16911c;
        /* renamed from: d */
        volatile AtomicReferenceArray<C4562l<K, V>> f16912d;
        /* renamed from: e */
        final ReferenceQueue<K> f16913e;
        /* renamed from: f */
        final ReferenceQueue<V> f16914f;
        /* renamed from: g */
        final AtomicInteger f16915g = new AtomicInteger();
        /* renamed from: h */
        final Queue<C4562l<K, V>> f16916h;
        /* renamed from: i */
        final Queue<C4562l<K, V>> f16917i;
        /* renamed from: j */
        private int f16918j;
        /* renamed from: k */
        private int f16919k;
        /* renamed from: l */
        private Queue<C4562l<K, V>> f16920l;

        C4563m(aw<K, V> awVar, int i, int i2) {
            this.f16909a = awVar;
            this.f16919k = i2;
            i = C4563m.m20560a(i);
            this.f16918j = (i.length() * 3) / 4;
            if (this.f16918j == this.f16919k) {
                this.f16918j++;
            }
            this.f16912d = i;
            i2 = 0;
            this.f16913e = awVar.m20609d() != 0 ? new ReferenceQueue() : 0;
            if (awVar.m20610e() != 0) {
                i2 = new ReferenceQueue();
            }
            this.f16914f = i2;
            if (awVar.m20605a() == 0) {
                if (awVar.m20608c() == 0) {
                    i = aw.m20603h();
                    this.f16920l = i;
                    this.f16916h = awVar.m20605a() == 0 ? new C4558f() : aw.m20603h();
                    this.f16917i = awVar.m20607b() == null ? new C4559g() : aw.m20603h();
                }
            }
            i = new ConcurrentLinkedQueue();
            this.f16920l = i;
            if (awVar.m20605a() == 0) {
            }
            this.f16916h = awVar.m20605a() == 0 ? new C4558f() : aw.m20603h();
            if (awVar.m20607b() == null) {
            }
            this.f16917i = awVar.m20607b() == null ? new C4559g() : aw.m20603h();
        }

        /* renamed from: a */
        private static AtomicReferenceArray<C4562l<K, V>> m20560a(int i) {
            return new AtomicReferenceArray(i);
        }

        /* renamed from: a */
        private C4562l<K, V> m20559a(C4562l<K, V> c4562l, C4562l<K, V> c4562l2) {
            if (c4562l.mo4812d() == null) {
                return null;
            }
            C4565w a = c4562l.mo4804a();
            Object obj = a.get();
            if (obj == null) {
                return null;
            }
            c4562l = this.f16909a.f16936h.mo4822a(this, (C4562l) c4562l, (C4562l) c4562l2);
            c4562l.mo4807a(a.mo4801a(this.f16914f, obj, c4562l));
            return c4562l;
        }

        /* renamed from: a */
        private void m20563a(C4562l<K, V> c4562l, V v) {
            c4562l.mo4807a(this.f16909a.f16932d.mo4823a(this, c4562l, v));
            m20572f();
            this.f16916h.add(c4562l);
            if (this.f16909a.m20607b() != null) {
                m20562a((C4562l) c4562l, this.f16909a.m20608c() != null ? this.f16909a.f16933e : this.f16909a.f16934f);
                this.f16917i.add(c4562l);
            }
        }

        /* renamed from: a */
        final void m20578a() {
            if (tryLock()) {
                try {
                    m20571e();
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: e */
        private void m20571e() {
            int i = 0;
            if (this.f16909a.m20609d()) {
                int i2 = 0;
                while (true) {
                    Reference poll = this.f16913e.poll();
                    if (poll == null) {
                        break;
                    }
                    C4562l c4562l = (C4562l) poll;
                    aw awVar = this.f16909a;
                    int c = c4562l.mo4810c();
                    awVar.m20604a(c).m20580a(c4562l, c);
                    i2++;
                    if (i2 == 16) {
                        break;
                    }
                }
            }
            if (this.f16909a.m20610e()) {
                while (true) {
                    Reference poll2 = this.f16914f.poll();
                    if (poll2 != null) {
                        C4565w c4565w = (C4565w) poll2;
                        aw awVar2 = this.f16909a;
                        C4562l a = c4565w.mo4800a();
                        c = a.mo4810c();
                        awVar2.m20604a(c).m20581a(a.mo4812d(), c, c4565w);
                        i++;
                        if (i == 16) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: a */
        private void m20561a(C4562l<K, V> c4562l) {
            this.f16916h.add(c4562l);
            if (this.f16909a.m20608c()) {
                m20562a((C4562l) c4562l, this.f16909a.f16933e);
                this.f16917i.add(c4562l);
            }
        }

        /* renamed from: f */
        private void m20572f() {
            while (true) {
                C4562l c4562l = (C4562l) this.f16920l.poll();
                if (c4562l != null) {
                    if (this.f16916h.contains(c4562l)) {
                        this.f16916h.add(c4562l);
                    }
                    if (this.f16909a.m20608c() && this.f16917i.contains(c4562l)) {
                        this.f16917i.add(c4562l);
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        private void m20562a(C4562l<K, V> c4562l, long j) {
            c4562l.mo4805a(this.f16909a.f16937i.mo5824a() + j);
        }

        /* renamed from: b */
        final void m20583b() {
            if (tryLock()) {
                try {
                    m20573g();
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: g */
        private void m20573g() {
            m20572f();
            if (!this.f16917i.isEmpty()) {
                long a = this.f16909a.f16937i.mo5824a();
                C4562l c4562l;
                do {
                    c4562l = (C4562l) this.f16917i.peek();
                    if (c4562l == null || !aw.m20597a(c4562l, a)) {
                        return;
                    }
                } while (m20565a(c4562l, c4562l.mo4810c(), C4553b.EXPIRED));
                throw new AssertionError();
            }
        }

        /* renamed from: a */
        final void m20579a(C4562l<K, V> c4562l, C4553b c4553b) {
            Object d = c4562l.mo4812d();
            c4562l.mo4810c();
            m20564a(d, c4562l.mo4804a().get(), c4553b);
        }

        /* renamed from: a */
        private void m20564a(Object obj, Object obj2, C4553b c4553b) {
            if (this.f16909a.f16935g != aw.f16926j) {
                this.f16909a.f16935g.offer(new C7403d(obj, obj2, c4553b));
            }
        }

        /* renamed from: d */
        private C4562l<K, V> m20569d(Object obj, int i) {
            if (this.f16910b != 0) {
                AtomicReferenceArray atomicReferenceArray = this.f16912d;
                for (C4562l<K, V> c4562l = (C4562l) atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i); c4562l != null; c4562l = c4562l.mo4808b()) {
                    if (c4562l.mo4810c() == i) {
                        Object d = c4562l.mo4812d();
                        if (d == null) {
                            m20578a();
                        } else if (this.f16909a.f16930b.m24261a(obj, d)) {
                            return c4562l;
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: e */
        private C4562l<K, V> m20570e(Object obj, int i) {
            C4562l d = m20569d(obj, i);
            if (d == null) {
                return null;
            }
            if (!this.f16909a.m20607b() || !this.f16909a.m20606a(d)) {
                return d;
            }
            m20583b();
            return null;
        }

        /* renamed from: a */
        final V m20575a(Object obj, int i) {
            try {
                C4562l e = m20570e(obj, i);
                if (e == null) {
                    return null;
                }
                i = e.mo4804a().get();
                if (i != 0) {
                    if (this.f16909a.m20608c()) {
                        m20562a(e, this.f16909a.f16933e);
                    }
                    this.f16920l.add(e);
                } else {
                    m20578a();
                }
                m20587c();
                return i;
            } finally {
                m20587c();
            }
        }

        /* renamed from: b */
        final boolean m20584b(Object obj, int i) {
            try {
                boolean z = false;
                if (this.f16910b != 0) {
                    obj = m20570e(obj, i);
                    if (obj == null) {
                        return z;
                    }
                    if (obj.mo4804a().get() != null) {
                        z = true;
                    }
                    m20587c();
                    return z;
                }
                m20587c();
                return z;
            } finally {
                m20587c();
            }
        }

        /* renamed from: a */
        final V m20577a(K k, int i, V v, boolean z) {
            C4563m c4563m = this;
            Object obj = k;
            int i2 = i;
            Object obj2 = v;
            lock();
            try {
                int length;
                C4562l c4562l;
                Object obj3;
                m20574h();
                int i3 = c4563m.f16910b + 1;
                if (i3 > c4563m.f16918j) {
                    AtomicReferenceArray atomicReferenceArray = c4563m.f16912d;
                    length = atomicReferenceArray.length();
                    if (length < 1073741824) {
                        int i4 = c4563m.f16910b;
                        AtomicReferenceArray a = C4563m.m20560a(length << 1);
                        c4563m.f16918j = (a.length() * 3) / 4;
                        int length2 = a.length() - 1;
                        int i5 = i4;
                        for (i4 = 0; i4 < length; i4++) {
                            C4562l c4562l2 = (C4562l) atomicReferenceArray.get(i4);
                            if (c4562l2 != null) {
                                C4562l b = c4562l2.mo4808b();
                                int c = c4562l2.mo4810c() & length2;
                                if (b == null) {
                                    a.set(c, c4562l2);
                                } else {
                                    int c2;
                                    c4562l = c4562l2;
                                    while (b != null) {
                                        c2 = b.mo4810c() & length2;
                                        if (c2 != c) {
                                            c = c2;
                                            c4562l = b;
                                        }
                                        b = b.mo4808b();
                                    }
                                    a.set(c, c4562l);
                                    while (c4562l2 != c4562l) {
                                        c2 = c4562l2.mo4810c() & length2;
                                        b = m20559a(c4562l2, (C4562l) a.get(c2));
                                        if (b != null) {
                                            a.set(c2, b);
                                        } else {
                                            m20568b(c4562l2);
                                            i5--;
                                        }
                                        c4562l2 = c4562l2.mo4808b();
                                    }
                                }
                            }
                        }
                        c4563m.f16912d = a;
                        c4563m.f16910b = i5;
                    }
                    i3 = c4563m.f16910b + 1;
                }
                AtomicReferenceArray atomicReferenceArray2 = c4563m.f16912d;
                length = (atomicReferenceArray2.length() - 1) & i2;
                c4562l = (C4562l) atomicReferenceArray2.get(length);
                for (C4562l c4562l3 = c4562l; c4562l3 != null; c4562l3 = c4562l3.mo4808b()) {
                    Object d = c4562l3.mo4812d();
                    if (c4562l3.mo4810c() == i2 && d != null && c4563m.f16909a.f16930b.m24261a(obj, d)) {
                        Object obj4 = c4562l3.mo4804a().get();
                        if (obj4 == null) {
                            c4563m.f16911c++;
                            m20563a(c4562l3, obj2);
                            m20564a(obj, obj4, C4553b.COLLECTED);
                            c4563m.f16910b = c4563m.f16910b;
                            unlock();
                            m20588d();
                            return null;
                        } else if (z) {
                            m20561a(c4562l3);
                            unlock();
                            m20588d();
                            return obj4;
                        } else {
                            c4563m.f16911c++;
                            m20564a(obj, obj4, C4553b.REPLACED);
                            m20563a(c4562l3, obj2);
                            unlock();
                            m20588d();
                            return obj4;
                        }
                    }
                }
                c4563m.f16911c++;
                C4562l a2 = c4563m.f16909a.f16936h.mo4821a(c4563m, obj, i2, c4562l);
                m20563a(a2, obj2);
                atomicReferenceArray2.set(length, a2);
                if (!c4563m.f16909a.m20605a() || c4563m.f16910b < c4563m.f16919k) {
                    obj3 = null;
                } else {
                    m20572f();
                    a2 = (C4562l) c4563m.f16916h.remove();
                    if (m20565a(a2, a2.mo4810c(), C4553b.SIZE)) {
                        obj3 = 1;
                    } else {
                        throw new AssertionError();
                    }
                }
                if (obj3 != null) {
                    i3 = c4563m.f16910b + 1;
                }
                c4563m.f16910b = i3;
                unlock();
                m20588d();
                return null;
            } catch (Throwable th) {
                Throwable th2 = th;
                unlock();
                m20588d();
            }
        }

        /* renamed from: a */
        final boolean m20582a(K k, int i, V v, V v2) {
            lock();
            try {
                m20574h();
                AtomicReferenceArray atomicReferenceArray = this.f16912d;
                int length = (atomicReferenceArray.length() - 1) & i;
                C4562l c4562l = (C4562l) atomicReferenceArray.get(length);
                for (C4562l c4562l2 = c4562l; c4562l2 != null; c4562l2 = c4562l2.mo4808b()) {
                    Object d = c4562l2.mo4812d();
                    if (c4562l2.mo4810c() == i && d != null && this.f16909a.f16930b.m24261a(k, d)) {
                        C4565w a = c4562l2.mo4804a();
                        Object obj = a.get();
                        if (obj == null) {
                            if (C4563m.m20566a(a) != null) {
                                k = this.f16910b;
                                this.f16911c += 1;
                                m20564a(d, obj, C4553b.COLLECTED);
                                i = this.f16910b - 1;
                                atomicReferenceArray.set(length, m20567b(c4562l, c4562l2));
                                this.f16910b = i;
                            }
                            unlock();
                            m20588d();
                            return false;
                        } else if (this.f16909a.f16931c.m24261a(v, obj) != 0) {
                            this.f16911c++;
                            m20564a((Object) k, obj, C4553b.REPLACED);
                            m20563a(c4562l2, (Object) v2);
                            unlock();
                            m20588d();
                            return true;
                        } else {
                            m20561a(c4562l2);
                            unlock();
                            m20588d();
                            return false;
                        }
                    }
                }
                unlock();
                m20588d();
                return false;
            } catch (Throwable th) {
                unlock();
                m20588d();
            }
        }

        /* renamed from: a */
        final V m20576a(K k, int i, V v) {
            lock();
            try {
                m20574h();
                AtomicReferenceArray atomicReferenceArray = this.f16912d;
                int length = (atomicReferenceArray.length() - 1) & i;
                C4562l c4562l = (C4562l) atomicReferenceArray.get(length);
                for (C4562l c4562l2 = c4562l; c4562l2 != null; c4562l2 = c4562l2.mo4808b()) {
                    Object d = c4562l2.mo4812d();
                    if (c4562l2.mo4810c() == i && d != null && this.f16909a.f16930b.m24261a(k, d)) {
                        C4565w a = c4562l2.mo4804a();
                        Object obj = a.get();
                        if (obj == null) {
                            if (C4563m.m20566a(a) != null) {
                                k = this.f16910b;
                                this.f16911c++;
                                m20564a(d, obj, C4553b.COLLECTED);
                                i = this.f16910b - 1;
                                atomicReferenceArray.set(length, m20567b(c4562l, c4562l2));
                                this.f16910b = i;
                            }
                            unlock();
                            m20588d();
                            return null;
                        }
                        this.f16911c++;
                        m20564a((Object) k, obj, C4553b.REPLACED);
                        m20563a(c4562l2, (Object) v);
                        unlock();
                        m20588d();
                        return obj;
                    }
                }
                unlock();
                m20588d();
                return null;
            } catch (Throwable th) {
                unlock();
                m20588d();
            }
        }

        /* renamed from: c */
        final V m20586c(Object obj, int i) {
            lock();
            try {
                m20574h();
                int i2 = this.f16910b;
                AtomicReferenceArray atomicReferenceArray = this.f16912d;
                int length = (atomicReferenceArray.length() - 1) & i;
                C4562l c4562l = (C4562l) atomicReferenceArray.get(length);
                for (C4562l c4562l2 = c4562l; c4562l2 != null; c4562l2 = c4562l2.mo4808b()) {
                    Object d = c4562l2.mo4812d();
                    if (c4562l2.mo4810c() == i && d != null && this.f16909a.f16930b.m24261a(obj, d)) {
                        C4553b c4553b;
                        C4565w a = c4562l2.mo4804a();
                        i = a.get();
                        if (i != 0) {
                            c4553b = C4553b.EXPLICIT;
                        } else if (C4563m.m20566a(a) != null) {
                            c4553b = C4553b.COLLECTED;
                        } else {
                            unlock();
                            m20588d();
                            return null;
                        }
                        this.f16911c++;
                        m20564a(d, (Object) i, c4553b);
                        obj = m20567b(c4562l, c4562l2);
                        int i3 = this.f16910b - 1;
                        atomicReferenceArray.set(length, obj);
                        this.f16910b = i3;
                        return i;
                    }
                }
                unlock();
                m20588d();
                return null;
            } finally {
                unlock();
                m20588d();
            }
        }

        /* renamed from: b */
        final boolean m20585b(Object obj, int i, Object obj2) {
            lock();
            try {
                m20574h();
                int i2 = this.f16910b;
                AtomicReferenceArray atomicReferenceArray = this.f16912d;
                boolean z = true;
                int length = (atomicReferenceArray.length() - 1) & i;
                C4562l c4562l = (C4562l) atomicReferenceArray.get(length);
                for (C4562l c4562l2 = c4562l; c4562l2 != null; c4562l2 = c4562l2.mo4808b()) {
                    Object d = c4562l2.mo4812d();
                    if (c4562l2.mo4810c() == i && d != null && this.f16909a.f16930b.m24261a(obj, d)) {
                        C4553b c4553b;
                        C4565w a = c4562l2.mo4804a();
                        Object obj3 = a.get();
                        if (this.f16909a.f16931c.m24261a(obj2, obj3) != null) {
                            c4553b = C4553b.EXPLICIT;
                        } else if (C4563m.m20566a(a) != null) {
                            c4553b = C4553b.COLLECTED;
                        } else {
                            unlock();
                            m20588d();
                            return false;
                        }
                        this.f16911c += 1;
                        m20564a(d, obj3, c4553b);
                        obj2 = this.f16910b - 1;
                        atomicReferenceArray.set(length, m20567b(c4562l, c4562l2));
                        this.f16910b = obj2;
                        if (c4553b != C4553b.EXPLICIT) {
                            z = false;
                        }
                        unlock();
                        m20588d();
                        return z;
                    }
                }
                unlock();
                m20588d();
                return false;
            } catch (Throwable th) {
                unlock();
                m20588d();
            }
        }

        /* renamed from: b */
        private C4562l<K, V> m20567b(C4562l<K, V> c4562l, C4562l<K, V> c4562l2) {
            this.f16916h.remove(c4562l2);
            this.f16917i.remove(c4562l2);
            int i = this.f16910b;
            C4562l<K, V> b = c4562l2.mo4808b();
            C4562l b2;
            while (b2 != c4562l2) {
                C4562l<K, V> a = m20559a(b2, (C4562l) b);
                if (a != null) {
                    b = a;
                } else {
                    m20568b(b2);
                    i--;
                }
                b2 = b2.mo4808b();
            }
            this.f16910b = i;
            return b;
        }

        /* renamed from: b */
        private void m20568b(C4562l<K, V> c4562l) {
            m20579a((C4562l) c4562l, C4553b.COLLECTED);
            this.f16916h.remove(c4562l);
            this.f16917i.remove(c4562l);
        }

        /* renamed from: a */
        final boolean m20580a(C4562l<K, V> c4562l, int i) {
            lock();
            try {
                int i2 = this.f16910b;
                AtomicReferenceArray atomicReferenceArray = this.f16912d;
                boolean z = true;
                i &= atomicReferenceArray.length() - z;
                C4562l c4562l2 = (C4562l) atomicReferenceArray.get(i);
                for (C4562l c4562l3 = c4562l2; c4562l3 != null; c4562l3 = c4562l3.mo4808b()) {
                    if (c4562l3 == c4562l) {
                        this.f16911c += z;
                        m20564a(c4562l3.mo4812d(), c4562l3.mo4804a().get(), C4553b.COLLECTED);
                        c4562l = m20567b(c4562l2, c4562l3);
                        int i3 = this.f16910b - z;
                        atomicReferenceArray.set(i, c4562l);
                        this.f16910b = i3;
                        return z;
                    }
                }
                unlock();
                m20588d();
                return null;
            } finally {
                unlock();
                m20588d();
            }
        }

        /* renamed from: a */
        final boolean m20581a(K k, int i, C4565w<K, V> c4565w) {
            lock();
            try {
                int i2 = this.f16910b;
                AtomicReferenceArray atomicReferenceArray = this.f16912d;
                boolean z = true;
                int length = (atomicReferenceArray.length() - z) & i;
                C4562l c4562l = (C4562l) atomicReferenceArray.get(length);
                C4562l c4562l2 = c4562l;
                while (c4562l2 != null) {
                    Object d = c4562l2.mo4812d();
                    if (c4562l2.mo4810c() != i || d == null || !this.f16909a.f16930b.m24261a(k, d)) {
                        c4562l2 = c4562l2.mo4808b();
                    } else if (c4562l2.mo4804a() == c4565w) {
                        this.f16911c += z;
                        m20564a((Object) k, c4565w.get(), C4553b.COLLECTED);
                        i = this.f16910b - z;
                        atomicReferenceArray.set(length, m20567b(c4562l, c4562l2));
                        this.f16910b = i;
                        return z;
                    } else {
                        unlock();
                        if (isHeldByCurrentThread() == null) {
                            m20588d();
                        }
                        return false;
                    }
                }
                unlock();
                if (isHeldByCurrentThread() == null) {
                    m20588d();
                }
                return false;
            } finally {
                unlock();
                if (isHeldByCurrentThread() == 0) {
                    m20588d();
                }
            }
        }

        /* renamed from: a */
        private boolean m20565a(C4562l<K, V> c4562l, int i, C4553b c4553b) {
            int i2 = this.f16910b;
            AtomicReferenceArray atomicReferenceArray = this.f16912d;
            i &= atomicReferenceArray.length() - 1;
            C4562l c4562l2 = (C4562l) atomicReferenceArray.get(i);
            for (C4562l c4562l3 = c4562l2; c4562l3 != null; c4562l3 = c4562l3.mo4808b()) {
                if (c4562l3 == c4562l) {
                    this.f16911c += 1;
                    m20564a(c4562l3.mo4812d(), c4562l3.mo4804a().get(), c4553b);
                    c4553b = this.f16910b - 1;
                    atomicReferenceArray.set(i, m20567b(c4562l2, c4562l3));
                    this.f16910b = c4553b;
                    return true;
                }
            }
            return null;
        }

        /* renamed from: a */
        private static boolean m20566a(C4565w<K, V> c4565w) {
            return c4565w.get() == null ? true : null;
        }

        /* renamed from: c */
        final void m20587c() {
            if ((this.f16915g.incrementAndGet() & 63) == 0) {
                m20574h();
                m20588d();
            }
        }

        /* renamed from: h */
        private void m20574h() {
            if (tryLock()) {
                try {
                    m20571e();
                    m20573g();
                    this.f16915g.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: d */
        final void m20588d() {
            if (!isHeldByCurrentThread()) {
                this.f16909a.m20611i();
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.aw$p */
    enum C4564p {
        STRONG {
            /* renamed from: a */
            final <K, V> C4565w<K, V> mo4823a(C4563m<K, V> c4563m, C4562l<K, V> c4562l, V v) {
                return new C6342u(v);
            }

            /* renamed from: a */
            final C5563e<Object> mo4824a() {
                return C5563e.m24258a();
            }
        },
        SOFT {
            /* renamed from: a */
            final <K, V> C4565w<K, V> mo4823a(C4563m<K, V> c4563m, C4562l<K, V> c4562l, V v) {
                return new C6337o(c4563m.f16914f, v, c4562l);
            }

            /* renamed from: a */
            final C5563e<Object> mo4824a() {
                return C5563e.m24259b();
            }
        },
        WEAK {
            /* renamed from: a */
            final <K, V> C4565w<K, V> mo4823a(C4563m<K, V> c4563m, C4562l<K, V> c4562l, V v) {
                return new ac(c4563m.f16914f, v, c4562l);
            }

            /* renamed from: a */
            final C5563e<Object> mo4824a() {
                return C5563e.m24259b();
            }
        };

        /* renamed from: a */
        abstract <K, V> C4565w<K, V> mo4823a(C4563m<K, V> c4563m, C4562l<K, V> c4562l, V v);

        /* renamed from: a */
        abstract C5563e<Object> mo4824a();
    }

    /* renamed from: com.google.android.m4b.maps.aa.aw$w */
    interface C4565w<K, V> {
        /* renamed from: a */
        C4562l<K, V> mo4800a();

        /* renamed from: a */
        C4565w<K, V> mo4801a(ReferenceQueue<V> referenceQueue, V v, C4562l<K, V> c4562l);

        /* renamed from: b */
        void mo4802b();

        V get();
    }

    /* renamed from: com.google.android.m4b.maps.aa.aw$x */
    final class C4566x extends AbstractCollection<V> {
        /* renamed from: a */
        private /* synthetic */ aw f16925a;

        C4566x(aw awVar) {
            this.f16925a = awVar;
        }

        public final Iterator<V> iterator() {
            return new C6343v(this.f16925a);
        }

        public final int size() {
            return this.f16925a.size();
        }

        public final boolean isEmpty() {
            return this.f16925a.isEmpty();
        }

        public final boolean contains(Object obj) {
            return this.f16925a.containsValue(obj);
        }

        public final void clear() {
            this.f16925a.clear();
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.aw$1 */
    static class C63241 implements C4565w<Object, Object> {
        /* renamed from: a */
        public final C4562l<Object, Object> mo4800a() {
            return null;
        }

        /* renamed from: a */
        public final C4565w<Object, Object> mo4801a(ReferenceQueue<Object> referenceQueue, Object obj, C4562l<Object, Object> c4562l) {
            return this;
        }

        /* renamed from: b */
        public final void mo4802b() {
        }

        public final Object get() {
            return null;
        }

        C63241() {
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.aw$a */
    static abstract class C6325a<K, V> implements C4562l<K, V> {
        C6325a() {
        }

        /* renamed from: a */
        public final C4565w<K, V> mo4804a() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public final void mo4807a(C4565w<K, V> c4565w) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public final C4562l<K, V> mo4808b() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public final int mo4810c() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public final K mo4812d() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public long mo4814e() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo4805a(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public C4562l<K, V> mo4815f() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo4806a(C4562l<K, V> c4562l) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: g */
        public C4562l<K, V> mo4816g() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public void mo4809b(C4562l<K, V> c4562l) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: h */
        public C4562l<K, V> mo4817h() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public void mo4811c(C4562l<K, V> c4562l) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: i */
        public C4562l<K, V> mo4818i() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public void mo4813d(C4562l<K, V> c4562l) {
            throw new UnsupportedOperationException();
        }
    }

    static final class ac<K, V> extends WeakReference<V> implements C4565w<K, V> {
        /* renamed from: a */
        private C4562l<K, V> f23655a;

        ac(ReferenceQueue<V> referenceQueue, V v, C4562l<K, V> c4562l) {
            super(v, referenceQueue);
            this.f23655a = c4562l;
        }

        /* renamed from: a */
        public final C4562l<K, V> mo4800a() {
            return this.f23655a;
        }

        /* renamed from: b */
        public final void mo4802b() {
            clear();
        }

        /* renamed from: a */
        public final C4565w<K, V> mo4801a(ReferenceQueue<V> referenceQueue, V v, C4562l<K, V> c4562l) {
            return new ac(referenceQueue, v, c4562l);
        }
    }

    final class ad extends C4581d<K, V> {
        /* renamed from: a */
        private K f23656a;
        /* renamed from: b */
        private V f23657b;
        /* renamed from: c */
        private /* synthetic */ aw f23658c;

        ad(aw awVar, K k, V v) {
            this.f23658c = awVar;
            this.f23656a = k;
            this.f23657b = v;
        }

        public final K getKey() {
            return this.f23656a;
        }

        public final V getValue() {
            return this.f23657b;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (!this.f23656a.equals(entry.getKey()) || this.f23657b.equals(entry.getValue()) == null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f23656a.hashCode() ^ this.f23657b.hashCode();
        }

        public final V setValue(V v) {
            V put = this.f23658c.put(this.f23656a, v);
            this.f23657b = v;
            return put;
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.aw$d */
    final class C6334d extends C4560h<Entry<K, V>> {
        /* renamed from: a */
        private /* synthetic */ aw f23659a;

        C6334d(aw awVar) {
            this.f23659a = awVar;
            super(awVar);
        }

        public final /* synthetic */ Object next() {
            return m20543a();
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.aw$i */
    final class C6335i extends C4560h<K> {
        /* renamed from: a */
        private /* synthetic */ aw f23660a;

        C6335i(aw awVar) {
            this.f23660a = awVar;
            super(awVar);
        }

        public final K next() {
            return m20543a().getKey();
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.aw$k */
    enum C6336k implements C4562l<Object, Object> {
        INSTANCE;

        /* renamed from: a */
        public final C4565w<Object, Object> mo4804a() {
            return null;
        }

        /* renamed from: a */
        public final void mo4805a(long j) {
        }

        /* renamed from: a */
        public final void mo4806a(C4562l<Object, Object> c4562l) {
        }

        /* renamed from: a */
        public final void mo4807a(C4565w<Object, Object> c4565w) {
        }

        /* renamed from: b */
        public final C4562l<Object, Object> mo4808b() {
            return null;
        }

        /* renamed from: b */
        public final void mo4809b(C4562l<Object, Object> c4562l) {
        }

        /* renamed from: c */
        public final int mo4810c() {
            return 0;
        }

        /* renamed from: c */
        public final void mo4811c(C4562l<Object, Object> c4562l) {
        }

        /* renamed from: d */
        public final Object mo4812d() {
            return null;
        }

        /* renamed from: d */
        public final void mo4813d(C4562l<Object, Object> c4562l) {
        }

        /* renamed from: e */
        public final long mo4814e() {
            return 0;
        }

        /* renamed from: f */
        public final C4562l<Object, Object> mo4815f() {
            return this;
        }

        /* renamed from: g */
        public final C4562l<Object, Object> mo4816g() {
            return this;
        }

        /* renamed from: h */
        public final C4562l<Object, Object> mo4817h() {
            return this;
        }

        /* renamed from: i */
        public final C4562l<Object, Object> mo4818i() {
            return this;
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.aw$o */
    static final class C6337o<K, V> extends SoftReference<V> implements C4565w<K, V> {
        /* renamed from: a */
        private C4562l<K, V> f23663a;

        C6337o(ReferenceQueue<V> referenceQueue, V v, C4562l<K, V> c4562l) {
            super(v, referenceQueue);
            this.f23663a = c4562l;
        }

        /* renamed from: a */
        public final C4562l<K, V> mo4800a() {
            return this.f23663a;
        }

        /* renamed from: b */
        public final void mo4802b() {
            clear();
        }

        /* renamed from: a */
        public final C4565w<K, V> mo4801a(ReferenceQueue<V> referenceQueue, V v, C4562l<K, V> c4562l) {
            return new C6337o(referenceQueue, v, c4562l);
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.aw$q */
    static class C6341q<K, V> implements C4562l<K, V> {
        /* renamed from: a */
        private K f23664a;
        /* renamed from: b */
        private int f23665b;
        /* renamed from: c */
        private C4562l<K, V> f23666c;
        /* renamed from: d */
        private volatile C4565w<K, V> f23667d = aw.m20601f();

        C6341q(K k, int i, C4562l<K, V> c4562l) {
            this.f23664a = k;
            this.f23665b = i;
            this.f23666c = c4562l;
        }

        /* renamed from: d */
        public final K mo4812d() {
            return this.f23664a;
        }

        /* renamed from: e */
        public long mo4814e() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo4805a(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public C4562l<K, V> mo4815f() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo4806a(C4562l<K, V> c4562l) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: g */
        public C4562l<K, V> mo4816g() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public void mo4809b(C4562l<K, V> c4562l) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: h */
        public C4562l<K, V> mo4817h() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public void mo4811c(C4562l<K, V> c4562l) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: i */
        public C4562l<K, V> mo4818i() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public void mo4813d(C4562l<K, V> c4562l) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public final C4565w<K, V> mo4804a() {
            return this.f23667d;
        }

        /* renamed from: a */
        public final void mo4807a(C4565w<K, V> c4565w) {
            C4565w c4565w2 = this.f23667d;
            this.f23667d = c4565w;
            c4565w2.mo4802b();
        }

        /* renamed from: c */
        public final int mo4810c() {
            return this.f23665b;
        }

        /* renamed from: b */
        public final C4562l<K, V> mo4808b() {
            return this.f23666c;
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.aw$u */
    static final class C6342u<K, V> implements C4565w<K, V> {
        /* renamed from: a */
        private V f23668a;

        /* renamed from: a */
        public final C4562l<K, V> mo4800a() {
            return null;
        }

        /* renamed from: a */
        public final C4565w<K, V> mo4801a(ReferenceQueue<V> referenceQueue, V v, C4562l<K, V> c4562l) {
            return this;
        }

        /* renamed from: b */
        public final void mo4802b() {
        }

        C6342u(V v) {
            this.f23668a = v;
        }

        public final V get() {
            return this.f23668a;
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.aw$v */
    final class C6343v extends C4560h<V> {
        /* renamed from: a */
        private /* synthetic */ aw f23669a;

        C6343v(aw awVar) {
            this.f23669a = awVar;
            super(awVar);
        }

        public final V next() {
            return m20543a().getValue();
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.aw$y */
    static class C6344y<K, V> extends WeakReference<K> implements C4562l<K, V> {
        /* renamed from: a */
        private int f23670a;
        /* renamed from: b */
        private C4562l<K, V> f23671b;
        /* renamed from: c */
        private volatile C4565w<K, V> f23672c = aw.m20601f();

        C6344y(ReferenceQueue<K> referenceQueue, K k, int i, C4562l<K, V> c4562l) {
            super(k, referenceQueue);
            this.f23670a = i;
            this.f23671b = c4562l;
        }

        /* renamed from: d */
        public final K mo4812d() {
            return get();
        }

        /* renamed from: e */
        public long mo4814e() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo4805a(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public C4562l<K, V> mo4815f() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo4806a(C4562l<K, V> c4562l) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: g */
        public C4562l<K, V> mo4816g() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public void mo4809b(C4562l<K, V> c4562l) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: h */
        public C4562l<K, V> mo4817h() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public void mo4811c(C4562l<K, V> c4562l) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: i */
        public C4562l<K, V> mo4818i() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public void mo4813d(C4562l<K, V> c4562l) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public final C4565w<K, V> mo4804a() {
            return this.f23672c;
        }

        /* renamed from: a */
        public final void mo4807a(C4565w<K, V> c4565w) {
            C4565w c4565w2 = this.f23672c;
            this.f23672c = c4565w;
            c4565w2.mo4802b();
        }

        /* renamed from: c */
        public final int mo4810c() {
            return this.f23670a;
        }

        /* renamed from: b */
        public final C4562l<K, V> mo4808b() {
            return this.f23671b;
        }
    }

    static final class aa<K, V> extends C6344y<K, V> implements C4562l<K, V> {
        /* renamed from: a */
        private volatile long f27155a = -1;
        /* renamed from: b */
        private C4562l<K, V> f27156b = aw.m20602g();
        /* renamed from: c */
        private C4562l<K, V> f27157c = aw.m20602g();

        aa(ReferenceQueue<K> referenceQueue, K k, int i, C4562l<K, V> c4562l) {
            super(referenceQueue, k, i, c4562l);
        }

        /* renamed from: e */
        public final long mo4814e() {
            return this.f27155a;
        }

        /* renamed from: a */
        public final void mo4805a(long j) {
            this.f27155a = j;
        }

        /* renamed from: f */
        public final C4562l<K, V> mo4815f() {
            return this.f27156b;
        }

        /* renamed from: a */
        public final void mo4806a(C4562l<K, V> c4562l) {
            this.f27156b = c4562l;
        }

        /* renamed from: g */
        public final C4562l<K, V> mo4816g() {
            return this.f27157c;
        }

        /* renamed from: b */
        public final void mo4809b(C4562l<K, V> c4562l) {
            this.f27157c = c4562l;
        }
    }

    static final class ab<K, V> extends C6344y<K, V> implements C4562l<K, V> {
        /* renamed from: a */
        private volatile long f27158a = -1;
        /* renamed from: b */
        private C4562l<K, V> f27159b = aw.m20602g();
        /* renamed from: c */
        private C4562l<K, V> f27160c = aw.m20602g();
        /* renamed from: d */
        private C4562l<K, V> f27161d = aw.m20602g();
        /* renamed from: e */
        private C4562l<K, V> f27162e = aw.m20602g();

        ab(ReferenceQueue<K> referenceQueue, K k, int i, C4562l<K, V> c4562l) {
            super(referenceQueue, k, i, c4562l);
        }

        /* renamed from: e */
        public final long mo4814e() {
            return this.f27158a;
        }

        /* renamed from: a */
        public final void mo4805a(long j) {
            this.f27158a = j;
        }

        /* renamed from: f */
        public final C4562l<K, V> mo4815f() {
            return this.f27159b;
        }

        /* renamed from: a */
        public final void mo4806a(C4562l<K, V> c4562l) {
            this.f27159b = c4562l;
        }

        /* renamed from: g */
        public final C4562l<K, V> mo4816g() {
            return this.f27160c;
        }

        /* renamed from: b */
        public final void mo4809b(C4562l<K, V> c4562l) {
            this.f27160c = c4562l;
        }

        /* renamed from: h */
        public final C4562l<K, V> mo4817h() {
            return this.f27161d;
        }

        /* renamed from: c */
        public final void mo4811c(C4562l<K, V> c4562l) {
            this.f27161d = c4562l;
        }

        /* renamed from: i */
        public final C4562l<K, V> mo4818i() {
            return this.f27162e;
        }

        /* renamed from: d */
        public final void mo4813d(C4562l<K, V> c4562l) {
            this.f27162e = c4562l;
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.aw$r */
    static final class C7408r<K, V> extends C6341q<K, V> implements C4562l<K, V> {
        /* renamed from: a */
        private C4562l<K, V> f27171a = aw.m20602g();
        /* renamed from: b */
        private C4562l<K, V> f27172b = aw.m20602g();

        C7408r(K k, int i, C4562l<K, V> c4562l) {
            super(k, i, c4562l);
        }

        /* renamed from: h */
        public final C4562l<K, V> mo4817h() {
            return this.f27171a;
        }

        /* renamed from: c */
        public final void mo4811c(C4562l<K, V> c4562l) {
            this.f27171a = c4562l;
        }

        /* renamed from: i */
        public final C4562l<K, V> mo4818i() {
            return this.f27172b;
        }

        /* renamed from: d */
        public final void mo4813d(C4562l<K, V> c4562l) {
            this.f27172b = c4562l;
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.aw$s */
    static final class C7409s<K, V> extends C6341q<K, V> implements C4562l<K, V> {
        /* renamed from: a */
        private volatile long f27173a = -1;
        /* renamed from: b */
        private C4562l<K, V> f27174b = aw.m20602g();
        /* renamed from: c */
        private C4562l<K, V> f27175c = aw.m20602g();

        C7409s(K k, int i, C4562l<K, V> c4562l) {
            super(k, i, c4562l);
        }

        /* renamed from: e */
        public final long mo4814e() {
            return this.f27173a;
        }

        /* renamed from: a */
        public final void mo4805a(long j) {
            this.f27173a = j;
        }

        /* renamed from: f */
        public final C4562l<K, V> mo4815f() {
            return this.f27174b;
        }

        /* renamed from: a */
        public final void mo4806a(C4562l<K, V> c4562l) {
            this.f27174b = c4562l;
        }

        /* renamed from: g */
        public final C4562l<K, V> mo4816g() {
            return this.f27175c;
        }

        /* renamed from: b */
        public final void mo4809b(C4562l<K, V> c4562l) {
            this.f27175c = c4562l;
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.aw$t */
    static final class C7410t<K, V> extends C6341q<K, V> implements C4562l<K, V> {
        /* renamed from: a */
        private volatile long f27176a = -1;
        /* renamed from: b */
        private C4562l<K, V> f27177b = aw.m20602g();
        /* renamed from: c */
        private C4562l<K, V> f27178c = aw.m20602g();
        /* renamed from: d */
        private C4562l<K, V> f27179d = aw.m20602g();
        /* renamed from: e */
        private C4562l<K, V> f27180e = aw.m20602g();

        C7410t(K k, int i, C4562l<K, V> c4562l) {
            super(k, i, c4562l);
        }

        /* renamed from: e */
        public final long mo4814e() {
            return this.f27176a;
        }

        /* renamed from: a */
        public final void mo4805a(long j) {
            this.f27176a = j;
        }

        /* renamed from: f */
        public final C4562l<K, V> mo4815f() {
            return this.f27177b;
        }

        /* renamed from: a */
        public final void mo4806a(C4562l<K, V> c4562l) {
            this.f27177b = c4562l;
        }

        /* renamed from: g */
        public final C4562l<K, V> mo4816g() {
            return this.f27178c;
        }

        /* renamed from: b */
        public final void mo4809b(C4562l<K, V> c4562l) {
            this.f27178c = c4562l;
        }

        /* renamed from: h */
        public final C4562l<K, V> mo4817h() {
            return this.f27179d;
        }

        /* renamed from: c */
        public final void mo4811c(C4562l<K, V> c4562l) {
            this.f27179d = c4562l;
        }

        /* renamed from: i */
        public final C4562l<K, V> mo4818i() {
            return this.f27180e;
        }

        /* renamed from: d */
        public final void mo4813d(C4562l<K, V> c4562l) {
            this.f27180e = c4562l;
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.aw$z */
    static final class C7411z<K, V> extends C6344y<K, V> implements C4562l<K, V> {
        /* renamed from: a */
        private C4562l<K, V> f27181a = aw.m20602g();
        /* renamed from: b */
        private C4562l<K, V> f27182b = aw.m20602g();

        C7411z(ReferenceQueue<K> referenceQueue, K k, int i, C4562l<K, V> c4562l) {
            super(referenceQueue, k, i, c4562l);
        }

        /* renamed from: h */
        public final C4562l<K, V> mo4817h() {
            return this.f27181a;
        }

        /* renamed from: c */
        public final void mo4811c(C4562l<K, V> c4562l) {
            this.f27181a = c4562l;
        }

        /* renamed from: i */
        public final C4562l<K, V> mo4818i() {
            return this.f27182b;
        }

        /* renamed from: d */
        public final void mo4813d(C4562l<K, V> c4562l) {
            this.f27182b = c4562l;
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.aw$b */
    static abstract class C8048b<K, V> extends C7421s<K, V> implements Serializable {
        private static final long serialVersionUID = 3;
        /* renamed from: a */
        final C4564p f28844a;
        /* renamed from: b */
        final C4564p f28845b;
        /* renamed from: c */
        final C5563e<Object> f28846c;
        /* renamed from: d */
        final long f28847d;
        /* renamed from: e */
        final long f28848e;
        /* renamed from: f */
        final int f28849f;
        /* renamed from: g */
        final int f28850g;
        /* renamed from: h */
        final C4554c<? super K, ? super V> f28851h;
        /* renamed from: i */
        transient ConcurrentMap<K, V> f28852i;
        /* renamed from: j */
        private C5563e<Object> f28853j;

        C8048b(C4564p c4564p, C4564p c4564p2, C5563e<Object> c5563e, C5563e<Object> c5563e2, long j, long j2, int i, int i2, C4554c<? super K, ? super V> c4554c, ConcurrentMap<K, V> concurrentMap) {
            this.f28844a = c4564p;
            this.f28845b = c4564p2;
            this.f28846c = c5563e;
            this.f28853j = c5563e2;
            this.f28847d = j;
            this.f28848e = j2;
            this.f28849f = i;
            this.f28850g = i2;
            this.f28851h = c4554c;
            this.f28852i = concurrentMap;
        }

        /* renamed from: a */
        protected final ConcurrentMap<K, V> mo7531a() {
            return this.f28852i;
        }

        /* renamed from: b */
        protected final /* synthetic */ Map mo7017b() {
            return this.f28852i;
        }

        /* renamed from: c */
        protected final /* synthetic */ Object mo4837c() {
            return this.f28852i;
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.aw$n */
    static final class C8195n<K, V> extends C8048b<K, V> {
        private static final long serialVersionUID = 3;

        C8195n(C4564p c4564p, C4564p c4564p2, C5563e<Object> c5563e, C5563e<Object> c5563e2, long j, long j2, int i, int i2, C4554c<? super K, ? super V> c4554c, ConcurrentMap<K, V> concurrentMap) {
            super(c4564p, c4564p2, c5563e, c5563e2, j, j2, i, i2, c4554c, concurrentMap);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeInt(this.f28852i.size());
            for (Entry entry : this.f28852i.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            int readInt = objectInputStream.readInt();
            C4587w avVar = new av();
            boolean z = false;
            C5571j.m24303b(avVar.f23646b == -1, "initial capacity was already set to %s", Integer.valueOf(avVar.f23646b));
            C5571j.m24297a(readInt >= 0);
            avVar.f23646b = readInt;
            C4564p c4564p = this.f28844a;
            C5571j.m24303b(avVar.f23649e == null, "Key strength was already set to %s", avVar.f23649e);
            avVar.f23649e = (C4564p) C5571j.m24292a((Object) c4564p);
            C5571j.m24298a(avVar.f23649e != C4564p.SOFT, (Object) "Soft keys are not supported");
            if (c4564p != C4564p.STRONG) {
                avVar.f23645a = true;
            }
            c4564p = this.f28845b;
            C5571j.m24303b(avVar.f23650f == null, "Value strength was already set to %s", avVar.f23650f);
            avVar.f23650f = (C4564p) C5571j.m24292a((Object) c4564p);
            if (c4564p != C4564p.STRONG) {
                avVar.f23645a = true;
            }
            Object obj = this.f28846c;
            C5571j.m24303b(avVar.f23654j == null, "key equivalence was already set to %s", avVar.f23654j);
            avVar.f23654j = (C5563e) C5571j.m24292a(obj);
            avVar.f23645a = true;
            readInt = this.f28850g;
            C5571j.m24303b(avVar.f23647c == -1, "concurrency level was already set to %s", Integer.valueOf(avVar.f23647c));
            C5571j.m24297a(readInt > 0);
            avVar.f23647c = readInt;
            obj = this.f28851h;
            C5571j.m24301b(avVar.k == null);
            avVar.f16990k = (C4554c) C5571j.m24292a(obj);
            avVar.f23645a = true;
            if (this.f28847d > 0) {
                avVar.m27718a(this.f28847d, TimeUnit.NANOSECONDS);
            }
            if (this.f28848e > 0) {
                avVar.m27720b(this.f28848e, TimeUnit.NANOSECONDS);
            }
            if (this.f28849f != -1) {
                readInt = this.f28849f;
                C5571j.m24303b(avVar.f23648d == -1, "maximum size was already set to %s", Integer.valueOf(avVar.f23648d));
                if (readInt >= 0) {
                    z = true;
                }
                C5571j.m24298a(z, (Object) "maximum size must not be negative");
                avVar.f23648d = readInt;
                avVar.f23645a = true;
                if (avVar.f23648d == 0) {
                    avVar.f23653i = C4553b.SIZE;
                }
            }
            this.i = avVar.m27722d();
            while (true) {
                obj = objectInputStream.readObject();
                if (obj != null) {
                    this.f28852i.put(obj, objectInputStream.readObject());
                } else {
                    return;
                }
            }
        }

        private Object readResolve() {
            return this.i;
        }
    }

    aw(av avVar) {
        Queue queue;
        this.f16940n = Math.min(avVar.m27719b(), 65536);
        this.f16941o = avVar.m27721c();
        this.f16932d = (C4564p) C5569h.m24285b(avVar.f23650f, C4564p.STRONG);
        this.f16930b = (C5563e) C5569h.m24285b(avVar.f23654j, avVar.m27721c().mo4824a());
        this.f16942p = avVar.f23648d;
        long j = 0;
        this.f16933e = avVar.f23652h == -1 ? 0 : avVar.f23652h;
        if (avVar.f23651g != -1) {
            j = avVar.f23651g;
        }
        this.f16934f = j;
        this.f16936h = C4556c.m20532a(this.f16941o, m20607b(), m20605a());
        this.f16937i = (C5582s) C5569h.m24285b(null, C5582s.m24322b());
        this.f16943q = avVar.m20677e();
        if (this.f16943q == C6369a.INSTANCE) {
            queue = f16926j;
        } else {
            queue = new ConcurrentLinkedQueue();
        }
        this.f16935g = queue;
        avVar = Math.min(avVar.m27717a(), 1073741824);
        if (m20605a()) {
            avVar = Math.min(avVar, this.f16942p);
        }
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i2 < this.f16940n && (!m20605a() || i2 * 2 <= this.f16942p)) {
            i3++;
            i2 <<= 1;
        }
        this.f16939m = 32 - i3;
        this.f16938l = i2 - 1;
        this.f16929a = new C4563m[i2];
        i3 = avVar / i2;
        if (i3 * i2 < avVar) {
            i3++;
        }
        int i4 = true;
        while (i4 < i3) {
            i4 <<= 1;
        }
        if (m20605a()) {
            i3 = (this.f16942p / i2) + 1;
            int i5 = this.f16942p % i2;
            while (i < this.f16929a.length) {
                if (i == i5) {
                    i3--;
                }
                this.f16929a[i] = m20595a(i4, i3);
                i++;
            }
            return;
        }
        while (i < this.f16929a.length) {
            this.f16929a[i] = m20595a(i4, -1);
            i++;
        }
    }

    /* renamed from: a */
    final boolean m20605a() {
        return this.f16942p != -1;
    }

    /* renamed from: c */
    final boolean m20608c() {
        return this.f16933e > 0;
    }

    /* renamed from: d */
    final boolean m20609d() {
        return this.f16941o != C4564p.STRONG;
    }

    /* renamed from: e */
    final boolean m20610e() {
        return this.f16932d != C4564p.STRONG;
    }

    /* renamed from: f */
    static <K, V> C4565w<K, V> m20601f() {
        return f16928r;
    }

    /* renamed from: g */
    static <K, V> C4562l<K, V> m20602g() {
        return C6336k.INSTANCE;
    }

    /* renamed from: h */
    static <E> Queue<E> m20603h() {
        return f16926j;
    }

    /* renamed from: a */
    private int m20594a(Object obj) {
        obj = this.f16930b.m24260a(obj);
        obj += (obj << 15) ^ -12931;
        obj ^= obj >>> 10;
        obj += obj << 3;
        obj ^= obj >>> 6;
        obj += (obj << 2) + (obj << 14);
        return obj ^ (obj >>> 16);
    }

    /* renamed from: a */
    final C4563m<K, V> m20604a(int i) {
        return this.f16929a[(i >>> this.f16939m) & this.f16938l];
    }

    /* renamed from: a */
    private C4563m<K, V> m20595a(int i, int i2) {
        return new C4563m(this, i, i2);
    }

    /* renamed from: a */
    final boolean m20606a(C4562l<K, V> c4562l) {
        return m20597a((C4562l) c4562l, this.f16937i.mo5824a());
    }

    /* renamed from: a */
    static boolean m20597a(C4562l<K, V> c4562l, long j) {
        return j - c4562l.mo4814e() > null ? true : null;
    }

    /* renamed from: a */
    static <K, V> void m20596a(C4562l<K, V> c4562l, C4562l<K, V> c4562l2) {
        c4562l.mo4806a((C4562l) c4562l2);
        c4562l2.mo4809b(c4562l);
    }

    /* renamed from: i */
    final void m20611i() {
        while (((C7403d) this.f16935g.poll()) != null) {
        }
    }

    /* renamed from: b */
    static <K, V> void m20599b(C4562l<K, V> c4562l, C4562l<K, V> c4562l2) {
        c4562l.mo4811c(c4562l2);
        c4562l2.mo4813d(c4562l);
    }

    public boolean isEmpty() {
        C4563m[] c4563mArr = this.f16929a;
        long j = 0;
        int i = 0;
        while (i < c4563mArr.length) {
            if (c4563mArr[i].f16910b != 0) {
                return false;
            }
            i++;
            j += (long) c4563mArr[i].f16911c;
        }
        if (j != 0) {
            i = 0;
            while (i < c4563mArr.length) {
                if (c4563mArr[i].f16910b != 0) {
                    return false;
                }
                i++;
                j -= (long) c4563mArr[i].f16911c;
            }
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    public int size() {
        C4563m[] c4563mArr = this.f16929a;
        long j = 0;
        int i = 0;
        while (i < c4563mArr.length) {
            i++;
            j += (long) c4563mArr[i].f16910b;
        }
        return C4609a.m20698a(j);
    }

    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int a = m20594a(obj);
        return m20604a(a).m20575a(obj, a);
    }

    public boolean containsKey(Object obj) {
        if (obj == null) {
            return null;
        }
        int a = m20594a(obj);
        return m20604a(a).m20584b(obj, a);
    }

    public boolean containsValue(Object obj) {
        aw awVar = this;
        Object obj2 = obj;
        if (obj2 == null) {
            return false;
        }
        C4563m[] c4563mArr = awVar.f16929a;
        long j = -1;
        int i = 0;
        while (i < 3) {
            int length = c4563mArr.length;
            long j2 = 0;
            int i2 = 0;
            while (i2 < length) {
                C4563m c4563m = c4563mArr[i2];
                int i3 = c4563m.f16910b;
                AtomicReferenceArray atomicReferenceArray = c4563m.f16912d;
                for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                    C4562l c4562l = (C4562l) atomicReferenceArray.get(i4);
                    while (c4562l != null) {
                        Object obj3;
                        if (c4562l.mo4812d() == null) {
                            c4563m.m20578a();
                        } else {
                            obj3 = c4562l.mo4804a().get();
                            if (obj3 == null) {
                                c4563m.m20578a();
                            } else {
                                if (c4563m.f16909a.m20607b() && c4563m.f16909a.m20606a(c4562l)) {
                                    c4563m.m20583b();
                                }
                                if (obj3 == null && awVar.f16931c.m24261a(obj2, obj3)) {
                                    return true;
                                }
                                c4562l = c4562l.mo4808b();
                            }
                        }
                        obj3 = null;
                        if (obj3 == null) {
                        }
                        c4562l = c4562l.mo4808b();
                    }
                }
                i2++;
                j2 += (long) c4563m.f16911c;
            }
            if (j2 == j) {
                break;
            }
            i++;
            j = j2;
        }
        return false;
    }

    public V put(K k, V v) {
        C5571j.m24292a((Object) k);
        C5571j.m24292a((Object) v);
        int a = m20594a((Object) k);
        return m20604a(a).m20577a((Object) k, a, (Object) v, false);
    }

    public V putIfAbsent(K k, V v) {
        C5571j.m24292a((Object) k);
        C5571j.m24292a((Object) v);
        int a = m20594a((Object) k);
        return m20604a(a).m20577a((Object) k, a, (Object) v, true);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            put(entry.getKey(), entry.getValue());
        }
    }

    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int a = m20594a(obj);
        return m20604a(a).m20586c(obj, a);
    }

    public boolean remove(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                int a = m20594a(obj);
                return m20604a(a).m20585b(obj, a, obj2);
            }
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        C5571j.m24292a((Object) k);
        C5571j.m24292a((Object) v2);
        if (v == null) {
            return null;
        }
        int a = m20594a((Object) k);
        return m20604a(a).m20582a((Object) k, a, (Object) v, (Object) v2);
    }

    public V replace(K k, V v) {
        C5571j.m24292a((Object) k);
        C5571j.m24292a((Object) v);
        int a = m20594a((Object) k);
        return m20604a(a).m20576a((Object) k, a, (Object) v);
    }

    public void clear() {
        C4563m[] c4563mArr = this.f16929a;
        int length = c4563mArr.length;
        for (int i = 0; i < length; i++) {
            C4563m c4563m = c4563mArr[i];
            if (c4563m.f16910b != 0) {
                c4563m.lock();
                try {
                    int i2;
                    AtomicReferenceArray atomicReferenceArray = c4563m.f16912d;
                    if (c4563m.f16909a.f16935g != f16926j) {
                        for (i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                            for (C4562l c4562l = (C4562l) atomicReferenceArray.get(i2); c4562l != null; c4562l = c4562l.mo4808b()) {
                                c4562l.mo4804a();
                                c4563m.m20579a(c4562l, C4553b.EXPLICIT);
                            }
                        }
                    }
                    for (i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, null);
                    }
                    if (c4563m.f16909a.m20609d()) {
                        do {
                        } while (c4563m.f16913e.poll() != null);
                    }
                    if (c4563m.f16909a.m20610e()) {
                        do {
                        } while (c4563m.f16914f.poll() != null);
                    }
                    c4563m.f16916h.clear();
                    c4563m.f16917i.clear();
                    c4563m.f16915g.set(0);
                    c4563m.f16911c++;
                    c4563m.f16910b = 0;
                } finally {
                    c4563m.unlock();
                    c4563m.m20588d();
                }
            }
        }
    }

    public Set<K> keySet() {
        Set<K> set = this.f16944s;
        if (set != null) {
            return set;
        }
        set = new C4561j(this);
        this.f16944s = set;
        return set;
    }

    public Collection<V> values() {
        Collection<V> collection = this.f16945t;
        if (collection != null) {
            return collection;
        }
        collection = new C4566x(this);
        this.f16945t = collection;
        return collection;
    }

    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.f16946u;
        if (set != null) {
            return set;
        }
        set = new C4557e(this);
        this.f16946u = set;
        return set;
    }

    Object writeReplace() {
        return new C8195n(this.f16941o, this.f16932d, this.f16930b, this.f16931c, this.f16934f, this.f16933e, this.f16942p, this.f16940n, this.f16943q, this);
    }

    /* renamed from: b */
    final boolean m20607b() {
        if ((this.f16934f > 0 ? 1 : null) == null) {
            if (!m20608c()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    static <K, V> void m20598b(C4562l<K, V> c4562l) {
        C4562l c4562l2 = C6336k.INSTANCE;
        c4562l.mo4806a(c4562l2);
        c4562l.mo4809b(c4562l2);
    }

    /* renamed from: c */
    static <K, V> void m20600c(C4562l<K, V> c4562l) {
        C4562l c4562l2 = C6336k.INSTANCE;
        c4562l.mo4811c(c4562l2);
        c4562l.mo4813d(c4562l2);
    }
}
