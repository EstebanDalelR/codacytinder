package com.google.android.m4b.maps.p126z;

import com.google.android.exoplayer2.Format;
import com.google.android.m4b.maps.aa.C6363f;
import com.google.android.m4b.maps.aa.at;
import com.google.android.m4b.maps.ag.C4609a;
import com.google.android.m4b.maps.aj.C4631c;
import com.google.android.m4b.maps.aj.C4635e;
import com.google.android.m4b.maps.aj.C4636f;
import com.google.android.m4b.maps.aj.C4637h;
import com.google.android.m4b.maps.aj.C4639i;
import com.google.android.m4b.maps.aj.C4640k;
import com.google.android.m4b.maps.aj.C4641l;
import com.google.android.m4b.maps.aj.C7434j;
import com.google.android.m4b.maps.p125y.C5563e;
import com.google.android.m4b.maps.p125y.C5569h;
import com.google.android.m4b.maps.p125y.C5571j;
import com.google.android.m4b.maps.p125y.C5578o;
import com.google.android.m4b.maps.p125y.C5582s;
import com.google.android.m4b.maps.p125y.C6849f;
import com.google.android.m4b.maps.p126z.C5585c.C6865a;
import com.google.android.m4b.maps.p126z.C5585c.C6866b;
import com.google.android.m4b.maps.p126z.C5587d.C5586a;
import com.google.android.m4b.maps.p126z.C6861a.C5583b;
import java.io.ObjectInputStream;
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

/* renamed from: com.google.android.m4b.maps.z.g */
class C5599g<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
    /* renamed from: a */
    static final Logger f20659a = Logger.getLogger(C5599g.class.getName());
    /* renamed from: b */
    static final C4637h f20660b = C4639i.m20764a();
    /* renamed from: s */
    static final C5598z<Object, Object> f20661s = new C68681();
    /* renamed from: t */
    static final Queue<? extends Object> f20662t = new C55892();
    /* renamed from: c */
    final C5596q<K, V>[] f20663c;
    /* renamed from: d */
    final int f20664d;
    /* renamed from: e */
    final C5563e<Object> f20665e;
    /* renamed from: f */
    final C5563e<Object> f20666f;
    /* renamed from: g */
    final C5597s f20667g;
    /* renamed from: h */
    final C5597s f20668h;
    /* renamed from: i */
    final long f20669i;
    /* renamed from: j */
    final C5610o<K, V> f20670j;
    /* renamed from: k */
    final long f20671k;
    /* renamed from: l */
    final long f20672l;
    /* renamed from: m */
    final long f20673m;
    /* renamed from: n */
    final Queue<C5604m<K, V>> f20674n;
    /* renamed from: o */
    final C5603l<K, V> f20675o;
    /* renamed from: p */
    final C5582s f20676p;
    /* renamed from: q */
    final C5592d f20677q;
    /* renamed from: r */
    final C5587d<? super K, V> f20678r;
    /* renamed from: u */
    private int f20679u;
    /* renamed from: v */
    private int f20680v;
    /* renamed from: w */
    private C5583b f20681w;
    /* renamed from: x */
    private Set<K> f20682x;
    /* renamed from: y */
    private Collection<V> f20683y;
    /* renamed from: z */
    private Set<Entry<K, V>> f20684z;

    /* renamed from: com.google.android.m4b.maps.z.g$2 */
    static class C55892 extends AbstractQueue<Object> {
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

        C55892() {
        }

        public final Iterator<Object> iterator() {
            return at.m20505a();
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$a */
    abstract class C5590a<T> extends AbstractSet<T> {
        /* renamed from: a */
        final ConcurrentMap<?, ?> f20609a;
        /* renamed from: b */
        private /* synthetic */ C5599g f20610b;

        C5590a(C5599g c5599g, ConcurrentMap<?, ?> concurrentMap) {
            this.f20610b = c5599g;
            this.f20609a = concurrentMap;
        }

        public int size() {
            return this.f20609a.size();
        }

        public boolean isEmpty() {
            return this.f20609a.isEmpty();
        }

        public void clear() {
            this.f20609a.clear();
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$aa */
    final class aa extends AbstractCollection<V> {
        /* renamed from: a */
        private final ConcurrentMap<?, ?> f20611a;
        /* renamed from: b */
        private /* synthetic */ C5599g f20612b;

        aa(C5599g c5599g, ConcurrentMap<?, ?> concurrentMap) {
            this.f20612b = c5599g;
            this.f20611a = concurrentMap;
        }

        public final int size() {
            return this.f20611a.size();
        }

        public final boolean isEmpty() {
            return this.f20611a.isEmpty();
        }

        public final void clear() {
            this.f20611a.clear();
        }

        public final Iterator<V> iterator() {
            return new C6890y(this.f20612b);
        }

        public final boolean contains(Object obj) {
            return this.f20611a.containsValue(obj);
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$aj */
    static final class aj<K, V> extends AbstractQueue<C5594p<K, V>> {
        /* renamed from: a */
        final C5594p<K, V> f20613a = new C77231(this);

        /* renamed from: com.google.android.m4b.maps.z.g$aj$1 */
        class C77231 extends C6869b<K, V> {
            /* renamed from: a */
            private C5594p<K, V> f28207a = this;
            /* renamed from: b */
            private C5594p<K, V> f28208b = this;
            /* renamed from: c */
            private /* synthetic */ aj f28209c;

            /* renamed from: b */
            public final void mo5843b(long j) {
            }

            /* renamed from: h */
            public final long mo5852h() {
                return Format.OFFSET_SAMPLE_RELATIVE;
            }

            C77231(aj ajVar) {
                this.f28209c = ajVar;
            }

            /* renamed from: i */
            public final C5594p<K, V> mo5853i() {
                return this.f28207a;
            }

            /* renamed from: c */
            public final void mo5846c(C5594p<K, V> c5594p) {
                this.f28207a = c5594p;
            }

            /* renamed from: j */
            public final C5594p<K, V> mo5854j() {
                return this.f28208b;
            }

            /* renamed from: d */
            public final void mo5848d(C5594p<K, V> c5594p) {
                this.f28208b = c5594p;
            }
        }

        aj() {
        }

        public final /* synthetic */ boolean offer(Object obj) {
            C5594p c5594p = (C5594p) obj;
            C5599g.m24423b(c5594p.mo5854j(), c5594p.mo5853i());
            C5599g.m24423b(this.f20613a.mo5854j(), c5594p);
            C5599g.m24423b(c5594p, this.f20613a);
            return true;
        }

        public final /* synthetic */ Object peek() {
            return m24338a();
        }

        /* renamed from: a */
        private C5594p<K, V> m24338a() {
            C5594p<K, V> i = this.f20613a.mo5853i();
            return i == this.f20613a ? null : i;
        }

        public final boolean remove(Object obj) {
            C5594p c5594p = (C5594p) obj;
            C5594p j = c5594p.mo5854j();
            C5594p i = c5594p.mo5853i();
            C5599g.m24423b(j, i);
            C5599g.m24422b(c5594p);
            return i != C6884o.INSTANCE ? true : null;
        }

        public final boolean contains(Object obj) {
            return ((C5594p) obj).mo5853i() != C6884o.INSTANCE ? true : null;
        }

        public final boolean isEmpty() {
            return this.f20613a.mo5853i() == this.f20613a;
        }

        public final int size() {
            int i = 0;
            for (C5594p i2 = this.f20613a.mo5853i(); i2 != this.f20613a; i2 = i2.mo5853i()) {
                i++;
            }
            return i;
        }

        public final void clear() {
            C5594p i = this.f20613a.mo5853i();
            while (i != this.f20613a) {
                C5594p i2 = i.mo5853i();
                C5599g.m24422b(i);
                i = i2;
            }
            this.f20613a.mo5846c(this.f20613a);
            this.f20613a.mo5848d(this.f20613a);
        }

        public final Iterator<C5594p<K, V>> iterator() {
            return new C6363f<C5594p<K, V>>(this, m24338a()) {
                /* renamed from: a */
                private /* synthetic */ aj f28210a;

                /* renamed from: a */
                protected final /* synthetic */ Object mo7001a(Object obj) {
                    C5594p i = ((C5594p) obj).mo5853i();
                    return i == this.f28210a.f20613a ? null : i;
                }
            };
        }

        public final /* synthetic */ Object poll() {
            C5594p i = this.f20613a.mo5853i();
            if (i == this.f20613a) {
                return null;
            }
            remove(i);
            return i;
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$ak */
    final class ak implements Entry<K, V> {
        /* renamed from: a */
        private K f20614a;
        /* renamed from: b */
        private V f20615b;
        /* renamed from: c */
        private /* synthetic */ C5599g f20616c;

        ak(C5599g c5599g, K k, V v) {
            this.f20616c = c5599g;
            this.f20614a = k;
            this.f20615b = v;
        }

        public final K getKey() {
            return this.f20614a;
        }

        public final V getValue() {
            return this.f20615b;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (!this.f20614a.equals(entry.getKey()) || this.f20615b.equals(entry.getValue()) == null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f20614a.hashCode() ^ this.f20615b.hashCode();
        }

        public final V setValue(V v) {
            throw new UnsupportedOperationException();
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getKey());
            stringBuilder.append("=");
            stringBuilder.append(getValue());
            return stringBuilder.toString();
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$c */
    static final class C5591c<K, V> extends AbstractQueue<C5594p<K, V>> {
        /* renamed from: a */
        final C5594p<K, V> f20617a = new C77251(this);

        /* renamed from: com.google.android.m4b.maps.z.g$c$1 */
        class C77251 extends C6869b<K, V> {
            /* renamed from: a */
            private C5594p<K, V> f28211a = this;
            /* renamed from: b */
            private C5594p<K, V> f28212b = this;
            /* renamed from: c */
            private /* synthetic */ C5591c f28213c;

            /* renamed from: a */
            public final void mo5839a(long j) {
            }

            /* renamed from: e */
            public final long mo5849e() {
                return Format.OFFSET_SAMPLE_RELATIVE;
            }

            C77251(C5591c c5591c) {
                this.f28213c = c5591c;
            }

            /* renamed from: f */
            public final C5594p<K, V> mo5850f() {
                return this.f28211a;
            }

            /* renamed from: a */
            public final void mo5840a(C5594p<K, V> c5594p) {
                this.f28211a = c5594p;
            }

            /* renamed from: g */
            public final C5594p<K, V> mo5851g() {
                return this.f28212b;
            }

            /* renamed from: b */
            public final void mo5844b(C5594p<K, V> c5594p) {
                this.f28212b = c5594p;
            }
        }

        C5591c() {
        }

        public final /* synthetic */ boolean offer(Object obj) {
            C5594p c5594p = (C5594p) obj;
            C5599g.m24421a(c5594p.mo5851g(), c5594p.mo5850f());
            C5599g.m24421a(this.f20617a.mo5851g(), c5594p);
            C5599g.m24421a(c5594p, this.f20617a);
            return true;
        }

        public final /* synthetic */ Object peek() {
            return m24339a();
        }

        /* renamed from: a */
        private C5594p<K, V> m24339a() {
            C5594p<K, V> f = this.f20617a.mo5850f();
            return f == this.f20617a ? null : f;
        }

        public final boolean remove(Object obj) {
            C5594p c5594p = (C5594p) obj;
            C5594p g = c5594p.mo5851g();
            C5594p f = c5594p.mo5850f();
            C5599g.m24421a(g, f);
            C5599g.m24420a(c5594p);
            return f != C6884o.INSTANCE ? true : null;
        }

        public final boolean contains(Object obj) {
            return ((C5594p) obj).mo5850f() != C6884o.INSTANCE ? true : null;
        }

        public final boolean isEmpty() {
            return this.f20617a.mo5850f() == this.f20617a;
        }

        public final int size() {
            int i = 0;
            for (C5594p f = this.f20617a.mo5850f(); f != this.f20617a; f = f.mo5850f()) {
                i++;
            }
            return i;
        }

        public final void clear() {
            C5594p f = this.f20617a.mo5850f();
            while (f != this.f20617a) {
                C5594p f2 = f.mo5850f();
                C5599g.m24420a(f);
                f = f2;
            }
            this.f20617a.mo5840a(this.f20617a);
            this.f20617a.mo5844b(this.f20617a);
        }

        public final Iterator<C5594p<K, V>> iterator() {
            return new C6363f<C5594p<K, V>>(this, m24339a()) {
                /* renamed from: a */
                private /* synthetic */ C5591c f28214a;

                /* renamed from: a */
                protected final /* synthetic */ Object mo7001a(Object obj) {
                    C5594p f = ((C5594p) obj).mo5850f();
                    return f == this.f28214a.f20617a ? null : f;
                }
            };
        }

        public final /* synthetic */ Object poll() {
            C5594p f = this.f20617a.mo5850f();
            if (f == this.f20617a) {
                return null;
            }
            remove(f);
            return f;
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$d */
    enum C5592d {
        STRONG {
            /* renamed from: a */
            final <K, V> C5594p<K, V> mo5855a(C5596q<K, V> c5596q, K k, int i, C5594p<K, V> c5594p) {
                return new C7730v(k, i, c5594p);
            }
        },
        STRONG_ACCESS {
            /* renamed from: a */
            final <K, V> C5594p<K, V> mo5855a(C5596q<K, V> c5596q, K k, int i, C5594p<K, V> c5594p) {
                return new C8095t(k, i, c5594p);
            }

            /* renamed from: a */
            final <K, V> C5594p<K, V> mo5856a(C5596q<K, V> c5596q, C5594p<K, V> c5594p, C5594p<K, V> c5594p2) {
                c5596q = super.mo5856a((C5596q) c5596q, (C5594p) c5594p, (C5594p) c5594p2);
                C5592d.m24341a(c5594p, c5596q);
                return c5596q;
            }
        },
        STRONG_WRITE {
            /* renamed from: a */
            final <K, V> C5594p<K, V> mo5855a(C5596q<K, V> c5596q, K k, int i, C5594p<K, V> c5594p) {
                return new C8097x(k, i, c5594p);
            }

            /* renamed from: a */
            final <K, V> C5594p<K, V> mo5856a(C5596q<K, V> c5596q, C5594p<K, V> c5594p, C5594p<K, V> c5594p2) {
                c5596q = super.mo5856a((C5596q) c5596q, (C5594p) c5594p, (C5594p) c5594p2);
                C5592d.m24342b(c5594p, c5596q);
                return c5596q;
            }
        },
        STRONG_ACCESS_WRITE {
            /* renamed from: a */
            final <K, V> C5594p<K, V> mo5855a(C5596q<K, V> c5596q, K k, int i, C5594p<K, V> c5594p) {
                return new C8096u(k, i, c5594p);
            }

            /* renamed from: a */
            final <K, V> C5594p<K, V> mo5856a(C5596q<K, V> c5596q, C5594p<K, V> c5594p, C5594p<K, V> c5594p2) {
                c5596q = super.mo5856a((C5596q) c5596q, (C5594p) c5594p, (C5594p) c5594p2);
                C5592d.m24341a(c5594p, c5596q);
                C5592d.m24342b(c5594p, c5596q);
                return c5596q;
            }
        },
        WEAK {
            /* renamed from: a */
            final <K, V> C5594p<K, V> mo5855a(C5596q<K, V> c5596q, K k, int i, C5594p<K, V> c5594p) {
                return new ad(c5596q.f20645e, k, i, c5594p);
            }
        },
        WEAK_ACCESS {
            /* renamed from: a */
            final <K, V> C5594p<K, V> mo5855a(C5596q<K, V> c5596q, K k, int i, C5594p<K, V> c5594p) {
                return new ab(c5596q.f20645e, k, i, c5594p);
            }

            /* renamed from: a */
            final <K, V> C5594p<K, V> mo5856a(C5596q<K, V> c5596q, C5594p<K, V> c5594p, C5594p<K, V> c5594p2) {
                c5596q = super.mo5856a((C5596q) c5596q, (C5594p) c5594p, (C5594p) c5594p2);
                C5592d.m24341a(c5594p, c5596q);
                return c5596q;
            }
        },
        WEAK_WRITE {
            /* renamed from: a */
            final <K, V> C5594p<K, V> mo5855a(C5596q<K, V> c5596q, K k, int i, C5594p<K, V> c5594p) {
                return new af(c5596q.f20645e, k, i, c5594p);
            }

            /* renamed from: a */
            final <K, V> C5594p<K, V> mo5856a(C5596q<K, V> c5596q, C5594p<K, V> c5594p, C5594p<K, V> c5594p2) {
                c5596q = super.mo5856a((C5596q) c5596q, (C5594p) c5594p, (C5594p) c5594p2);
                C5592d.m24342b(c5594p, c5596q);
                return c5596q;
            }
        },
        WEAK_ACCESS_WRITE {
            /* renamed from: a */
            final <K, V> C5594p<K, V> mo5855a(C5596q<K, V> c5596q, K k, int i, C5594p<K, V> c5594p) {
                return new ac(c5596q.f20645e, k, i, c5594p);
            }

            /* renamed from: a */
            final <K, V> C5594p<K, V> mo5856a(C5596q<K, V> c5596q, C5594p<K, V> c5594p, C5594p<K, V> c5594p2) {
                c5596q = super.mo5856a((C5596q) c5596q, (C5594p) c5594p, (C5594p) c5594p2);
                C5592d.m24341a(c5594p, c5596q);
                C5592d.m24342b(c5594p, c5596q);
                return c5596q;
            }
        };
        
        /* renamed from: i */
        private static C5592d[] f20626i;

        /* renamed from: a */
        abstract <K, V> C5594p<K, V> mo5855a(C5596q<K, V> c5596q, K k, int i, C5594p<K, V> c5594p);

        static {
            f20626i = new C5592d[]{STRONG, STRONG_ACCESS, STRONG_WRITE, STRONG_ACCESS_WRITE, WEAK, WEAK_ACCESS, WEAK_WRITE, WEAK_ACCESS_WRITE};
        }

        /* renamed from: a */
        static C5592d m24340a(C5597s c5597s, boolean z, boolean z2) {
            int i = 0;
            c5597s = (c5597s == C5597s.WEAK ? 4 : null) | z;
            if (z2) {
                i = 2;
            }
            return f20626i[c5597s | i];
        }

        /* renamed from: a */
        <K, V> C5594p<K, V> mo5856a(C5596q<K, V> c5596q, C5594p<K, V> c5594p, C5594p<K, V> c5594p2) {
            return mo5855a(c5596q, c5594p.mo5847d(), c5594p.mo5845c(), c5594p2);
        }

        /* renamed from: a */
        static <K, V> void m24341a(C5594p<K, V> c5594p, C5594p<K, V> c5594p2) {
            c5594p2.mo5839a(c5594p.mo5849e());
            C5599g.m24421a(c5594p.mo5851g(), (C5594p) c5594p2);
            C5599g.m24421a((C5594p) c5594p2, c5594p.mo5850f());
            C5599g.m24420a((C5594p) c5594p);
        }

        /* renamed from: b */
        static <K, V> void m24342b(C5594p<K, V> c5594p, C5594p<K, V> c5594p2) {
            c5594p2.mo5843b(c5594p.mo5852h());
            C5599g.m24423b(c5594p.mo5854j(), c5594p2);
            C5599g.m24423b(c5594p2, c5594p.mo5853i());
            C5599g.m24422b(c5594p);
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$g */
    abstract class C5593g<T> implements Iterator<T> {
        /* renamed from: a */
        private int f20628a;
        /* renamed from: b */
        private int f20629b = -1;
        /* renamed from: c */
        private C5596q<K, V> f20630c;
        /* renamed from: d */
        private AtomicReferenceArray<C5594p<K, V>> f20631d;
        /* renamed from: e */
        private C5594p<K, V> f20632e;
        /* renamed from: f */
        private ak f20633f;
        /* renamed from: g */
        private ak f20634g;
        /* renamed from: h */
        private /* synthetic */ C5599g f20635h;

        C5593g(C5599g c5599g) {
            this.f20635h = c5599g;
            this.f20628a = c5599g.f20663c.length - 1;
            m24346b();
        }

        /* renamed from: b */
        private void m24346b() {
            this.f20633f = null;
            if (!m24347c() && !m24348d()) {
                while (this.f20628a >= 0) {
                    C5596q[] c5596qArr = this.f20635h.f20663c;
                    int i = this.f20628a;
                    this.f20628a = i - 1;
                    this.f20630c = c5596qArr[i];
                    if (this.f20630c.f20642b != 0) {
                        this.f20631d = this.f20630c.f20644d;
                        this.f20629b = this.f20631d.length() - 1;
                        if (m24348d()) {
                            return;
                        }
                    }
                }
            }
        }

        /* renamed from: c */
        private boolean m24347c() {
            if (this.f20632e != null) {
                do {
                    this.f20632e = this.f20632e.mo5842b();
                    if (this.f20632e != null) {
                    }
                } while (!m24345a(this.f20632e));
                return true;
            }
            return false;
        }

        /* renamed from: d */
        private boolean m24348d() {
            while (this.f20629b >= 0) {
                AtomicReferenceArray atomicReferenceArray = this.f20631d;
                int i = this.f20629b;
                this.f20629b = i - 1;
                C5594p c5594p = (C5594p) atomicReferenceArray.get(i);
                this.f20632e = c5594p;
                if (c5594p != null && (m24345a(this.f20632e) || m24347c())) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        private boolean m24345a(C5594p<K, V> c5594p) {
            try {
                long a = this.f20635h.f20676p.mo5824a();
                Object d = c5594p.mo5847d();
                C5599g c5599g = this.f20635h;
                Object obj = null;
                if (c5594p.mo5847d() != null) {
                    Object obj2 = c5594p.mo5838a().get();
                    if (obj2 != null) {
                        if (c5599g.m24430a((C5594p) c5594p, a) == null) {
                            obj = obj2;
                        }
                    }
                }
                if (obj != null) {
                    this.f20633f = new ak(this.f20635h, d, obj);
                    return true;
                }
                this.f20630c.m24401a();
                return null;
            } finally {
                this.f20630c.m24401a();
            }
        }

        public boolean hasNext() {
            return this.f20633f != null;
        }

        /* renamed from: a */
        final ak m24349a() {
            if (this.f20633f == null) {
                throw new NoSuchElementException();
            }
            this.f20634g = this.f20633f;
            m24346b();
            return this.f20634g;
        }

        public void remove() {
            C5571j.m24301b(this.f20634g != null);
            this.f20635h.remove(this.f20634g.getKey());
            this.f20634g = null;
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$p */
    interface C5594p<K, V> {
        /* renamed from: a */
        C5598z<K, V> mo5838a();

        /* renamed from: a */
        void mo5839a(long j);

        /* renamed from: a */
        void mo5840a(C5594p<K, V> c5594p);

        /* renamed from: a */
        void mo5841a(C5598z<K, V> c5598z);

        /* renamed from: b */
        C5594p<K, V> mo5842b();

        /* renamed from: b */
        void mo5843b(long j);

        /* renamed from: b */
        void mo5844b(C5594p<K, V> c5594p);

        /* renamed from: c */
        int mo5845c();

        /* renamed from: c */
        void mo5846c(C5594p<K, V> c5594p);

        /* renamed from: d */
        K mo5847d();

        /* renamed from: d */
        void mo5848d(C5594p<K, V> c5594p);

        /* renamed from: e */
        long mo5849e();

        /* renamed from: f */
        C5594p<K, V> mo5850f();

        /* renamed from: g */
        C5594p<K, V> mo5851g();

        /* renamed from: h */
        long mo5852h();

        /* renamed from: i */
        C5594p<K, V> mo5853i();

        /* renamed from: j */
        C5594p<K, V> mo5854j();
    }

    /* renamed from: com.google.android.m4b.maps.z.g$q */
    static class C5596q<K, V> extends ReentrantLock {
        /* renamed from: a */
        final C5599g<K, V> f20641a;
        /* renamed from: b */
        volatile int f20642b;
        /* renamed from: c */
        int f20643c;
        /* renamed from: d */
        volatile AtomicReferenceArray<C5594p<K, V>> f20644d;
        /* renamed from: e */
        final ReferenceQueue<K> f20645e;
        /* renamed from: f */
        final ReferenceQueue<V> f20646f;
        /* renamed from: g */
        final AtomicInteger f20647g = new AtomicInteger();
        /* renamed from: h */
        final Queue<C5594p<K, V>> f20648h;
        /* renamed from: i */
        final Queue<C5594p<K, V>> f20649i;
        /* renamed from: j */
        private int f20650j;
        /* renamed from: k */
        private int f20651k;
        /* renamed from: l */
        private long f20652l;
        /* renamed from: m */
        private Queue<C5594p<K, V>> f20653m;
        /* renamed from: n */
        private C5583b f20654n;

        C5596q(C5599g<K, V> c5599g, int i, long j, C5583b c5583b) {
            this.f20641a = c5599g;
            this.f20652l = j;
            this.f20654n = (C5583b) C5571j.m24292a((Object) c5583b);
            i = C5596q.m24375a(i);
            this.f20651k = (i.length() * 3) / 4;
            if (this.f20641a.m24431b() == null && ((long) this.f20651k) == this.f20652l) {
                this.f20651k++;
            }
            this.f20644d = i;
            j = null;
            this.f20645e = c5599g.m24437h() != 0 ? new ReferenceQueue() : 0;
            if (c5599g.m24438i() != 0) {
                j = new ReferenceQueue();
            }
            this.f20646f = j;
            this.f20653m = c5599g.m24435f() != 0 ? new ConcurrentLinkedQueue() : C5599g.m24426l();
            this.f20648h = c5599g.m24432c() != 0 ? new aj() : C5599g.m24426l();
            this.f20649i = c5599g.m24435f() != null ? new C5591c() : C5599g.m24426l();
        }

        /* renamed from: a */
        private static AtomicReferenceArray<C5594p<K, V>> m24375a(int i) {
            return new AtomicReferenceArray(i);
        }

        /* renamed from: a */
        private C5594p<K, V> m24371a(K k, int i, C5594p<K, V> c5594p) {
            return this.f20641a.f20677q.mo5855a(this, C5571j.m24292a((Object) k), i, c5594p);
        }

        /* renamed from: a */
        private C5594p<K, V> m24368a(C5594p<K, V> c5594p, C5594p<K, V> c5594p2) {
            if (c5594p.mo5847d() == null) {
                return null;
            }
            C5598z a = c5594p.mo5838a();
            Object obj = a.get();
            if (obj == null && a.mo5835d()) {
                return null;
            }
            c5594p = this.f20641a.f20677q.mo5856a(this, (C5594p) c5594p, (C5594p) c5594p2);
            c5594p.mo5841a(a.mo5831a(this.f20646f, obj, c5594p));
            return c5594p;
        }

        /* renamed from: a */
        private void m24378a(C5594p<K, V> c5594p, K k, V v, long j) {
            k = c5594p.mo5838a();
            C5610o c5610o = this.f20641a.f20670j;
            C5571j.m24302b(true, (Object) "Weights must be non-negative");
            c5594p.mo5841a(this.f20641a.f20668h.mo5858a(this, c5594p, v, 1));
            m24392e();
            this.f20650j++;
            if (this.f20641a.m24433d()) {
                c5594p.mo5839a(j);
            }
            if (this.f20641a.m24436g()) {
                c5594p.mo5843b(j);
            }
            this.f20649i.add(c5594p);
            this.f20648h.add(c5594p);
            k.mo5832a(v);
        }

        /* renamed from: a */
        final V m24397a(K k, int i, C5587d<? super K, V> c5587d) {
            C5571j.m24292a((Object) k);
            C5571j.m24292a((Object) c5587d);
            try {
                if (this.f20642b != 0) {
                    C5594p d = m24390d(k, i);
                    if (d != null) {
                        long a = this.f20641a.f20676p.mo5824a();
                        Object a2 = m24395a(d, a);
                        if (a2 != null) {
                            m24386b(d, a);
                            this.f20654n.mo5826a(1);
                            k = m24372a(d, (Object) k, i, a2, a, (C5587d) c5587d);
                            m24401a();
                            return k;
                        }
                        C5598z a3 = d.mo5838a();
                        if (a3.mo5834c()) {
                            k = m24373a(d, (Object) k, a3);
                            m24401a();
                            return k;
                        }
                    }
                }
                k = m24384b((Object) k, i, (C5587d) c5587d);
                m24401a();
                return k;
            } catch (K k2) {
                i = k2.getCause();
                if ((i instanceof Error) != null) {
                    throw new C4631c((Error) i);
                } else if ((i instanceof RuntimeException) != null) {
                    throw new C4640k(i);
                } else {
                    throw k2;
                }
            } catch (Throwable th) {
                m24401a();
            }
        }

        /* renamed from: b */
        private V m24384b(K r18, int r19, com.google.android.m4b.maps.p126z.C5587d<? super K, V> r20) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.utils.BlockUtils.getBlockByInsn(BlockUtils.java:171)
	at jadx.core.dex.visitors.ssa.EliminatePhiNodes.replaceMerge(EliminatePhiNodes.java:90)
	at jadx.core.dex.visitors.ssa.EliminatePhiNodes.replaceMergeInstructions(EliminatePhiNodes.java:68)
	at jadx.core.dex.visitors.ssa.EliminatePhiNodes.visit(EliminatePhiNodes.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r17 = this;
            r1 = r17;
            r2 = r18;
            r3 = r19;
            r17.lock();
            r4 = r1.f20641a;	 Catch:{ all -> 0x00cc }
            r4 = r4.f20676p;	 Catch:{ all -> 0x00cc }
            r4 = r4.mo5824a();	 Catch:{ all -> 0x00cc }
            r1.m24388c(r4);	 Catch:{ all -> 0x00cc }
            r6 = r1.f20642b;	 Catch:{ all -> 0x00cc }
            r7 = 1;	 Catch:{ all -> 0x00cc }
            r6 = r6 - r7;	 Catch:{ all -> 0x00cc }
            r8 = r1.f20644d;	 Catch:{ all -> 0x00cc }
            r9 = r8.length();	 Catch:{ all -> 0x00cc }
            r9 = r9 - r7;	 Catch:{ all -> 0x00cc }
            r9 = r9 & r3;	 Catch:{ all -> 0x00cc }
            r10 = r8.get(r9);	 Catch:{ all -> 0x00cc }
            r10 = (com.google.android.m4b.maps.p126z.C5599g.C5594p) r10;	 Catch:{ all -> 0x00cc }
            r11 = r10;	 Catch:{ all -> 0x00cc }
        L_0x0027:
            if (r11 == 0) goto L_0x0086;	 Catch:{ all -> 0x00cc }
        L_0x0029:
            r13 = r11.mo5847d();	 Catch:{ all -> 0x00cc }
            r14 = r11.mo5845c();	 Catch:{ all -> 0x00cc }
            if (r14 != r3) goto L_0x0081;	 Catch:{ all -> 0x00cc }
        L_0x0033:
            if (r13 == 0) goto L_0x0081;	 Catch:{ all -> 0x00cc }
        L_0x0035:
            r14 = r1.f20641a;	 Catch:{ all -> 0x00cc }
            r14 = r14.f20665e;	 Catch:{ all -> 0x00cc }
            r14 = r14.m24261a(r2, r13);	 Catch:{ all -> 0x00cc }
            if (r14 == 0) goto L_0x0081;	 Catch:{ all -> 0x00cc }
        L_0x003f:
            r14 = r11.mo5838a();	 Catch:{ all -> 0x00cc }
            r15 = r14.mo5834c();	 Catch:{ all -> 0x00cc }
            if (r15 == 0) goto L_0x004b;	 Catch:{ all -> 0x00cc }
        L_0x0049:
            r4 = 0;	 Catch:{ all -> 0x00cc }
            goto L_0x0088;	 Catch:{ all -> 0x00cc }
        L_0x004b:
            r15 = r14.get();	 Catch:{ all -> 0x00cc }
            if (r15 != 0) goto L_0x0057;	 Catch:{ all -> 0x00cc }
        L_0x0051:
            r4 = com.google.android.m4b.maps.p126z.C5602k.COLLECTED;	 Catch:{ all -> 0x00cc }
            r1.m24379a(r13, r14, r4);	 Catch:{ all -> 0x00cc }
            goto L_0x0064;	 Catch:{ all -> 0x00cc }
        L_0x0057:
            r12 = r1.f20641a;	 Catch:{ all -> 0x00cc }
            r12 = r12.m24430a(r11, r4);	 Catch:{ all -> 0x00cc }
            if (r12 == 0) goto L_0x0072;	 Catch:{ all -> 0x00cc }
        L_0x005f:
            r4 = com.google.android.m4b.maps.p126z.C5602k.EXPIRED;	 Catch:{ all -> 0x00cc }
            r1.m24379a(r13, r14, r4);	 Catch:{ all -> 0x00cc }
        L_0x0064:
            r4 = r1.f20648h;	 Catch:{ all -> 0x00cc }
            r4.remove(r11);	 Catch:{ all -> 0x00cc }
            r4 = r1.f20649i;	 Catch:{ all -> 0x00cc }
            r4.remove(r11);	 Catch:{ all -> 0x00cc }
            r1.f20642b = r6;	 Catch:{ all -> 0x00cc }
            r4 = 1;	 Catch:{ all -> 0x00cc }
            goto L_0x0088;	 Catch:{ all -> 0x00cc }
        L_0x0072:
            r1.m24389c(r11, r4);	 Catch:{ all -> 0x00cc }
            r2 = r1.f20654n;	 Catch:{ all -> 0x00cc }
            r2.mo5826a(r7);	 Catch:{ all -> 0x00cc }
            r17.unlock();
            r17.m24406b();
            return r15;
        L_0x0081:
            r11 = r11.mo5842b();	 Catch:{ all -> 0x00cc }
            goto L_0x0027;	 Catch:{ all -> 0x00cc }
        L_0x0086:
            r4 = 1;	 Catch:{ all -> 0x00cc }
            r14 = 0;	 Catch:{ all -> 0x00cc }
        L_0x0088:
            if (r4 == 0) goto L_0x00a0;	 Catch:{ all -> 0x00cc }
        L_0x008a:
            r12 = new com.google.android.m4b.maps.z.g$k;	 Catch:{ all -> 0x00cc }
            r12.<init>();	 Catch:{ all -> 0x00cc }
            if (r11 != 0) goto L_0x009c;	 Catch:{ all -> 0x00cc }
        L_0x0091:
            r11 = r1.m24371a(r2, r3, r10);	 Catch:{ all -> 0x00cc }
            r11.mo5841a(r12);	 Catch:{ all -> 0x00cc }
            r8.set(r9, r11);	 Catch:{ all -> 0x00cc }
            goto L_0x00a1;	 Catch:{ all -> 0x00cc }
        L_0x009c:
            r11.mo5841a(r12);	 Catch:{ all -> 0x00cc }
            goto L_0x00a1;
        L_0x00a0:
            r12 = 0;
        L_0x00a1:
            r17.unlock();
            r17.m24406b();
            if (r4 == 0) goto L_0x00c7;
        L_0x00a9:
            monitor-enter(r11);	 Catch:{ all -> 0x00bf }
            r4 = r20;
            r4 = r12.m30404a(r2, r4);	 Catch:{ all -> 0x00bb }
            r2 = r1.m24398a(r2, r3, r12, r4);	 Catch:{ all -> 0x00bb }
            monitor-exit(r11);	 Catch:{ all -> 0x00bb }
            r3 = r1.f20654n;
            r3.mo5828b(r7);
            return r2;
        L_0x00bb:
            r0 = move-exception;
            r2 = r0;
            monitor-exit(r11);	 Catch:{ all -> 0x00bb }
            throw r2;	 Catch:{ all -> 0x00bf }
        L_0x00bf:
            r0 = move-exception;
            r2 = r0;
            r3 = r1.f20654n;
            r3.mo5828b(r7);
            throw r2;
        L_0x00c7:
            r2 = r1.m24373a(r11, r2, r14);
            return r2;
        L_0x00cc:
            r0 = move-exception;
            r2 = r0;
            r17.unlock();
            r17.m24406b();
            throw r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.z.g.q.b(java.lang.Object, int, com.google.android.m4b.maps.z.d):V");
        }

        /* renamed from: a */
        private V m24373a(C5594p<K, V> c5594p, K k, C5598z<K, V> c5598z) {
            if (c5598z.mo5834c()) {
                C5571j.m24303b(Thread.holdsLock(c5594p) ^ true, "Recursive load of: %s", k);
                try {
                    c5598z = c5598z.mo5836e();
                    if (c5598z == null) {
                        c5598z = new StringBuilder("CacheLoader returned null for key ");
                        c5598z.append(k);
                        c5598z.append(".");
                        throw new C5586a(c5598z.toString());
                    }
                    m24386b((C5594p) c5594p, this.f20641a.f20676p.mo5824a());
                    return c5598z;
                } finally {
                    this.f20654n.mo5828b(1);
                }
            } else {
                throw new AssertionError();
            }
        }

        /* renamed from: a */
        final V m24398a(K k, int i, C6882k<K, V> c6882k, C4636f<V> c4636f) {
            Throwable th;
            try {
                c4636f = C4641l.m20766a(c4636f);
                if (c4636f == null) {
                    try {
                        StringBuilder stringBuilder = new StringBuilder("CacheLoader returned null for key ");
                        stringBuilder.append(k);
                        stringBuilder.append(".");
                        throw new C5586a(stringBuilder.toString());
                    } catch (Throwable th2) {
                        th = th2;
                        if (c4636f == null) {
                            this.f20654n.mo5829b(c6882k.m30413f());
                            m24381a((Object) k, i, (C6882k) c6882k);
                        }
                        throw th;
                    }
                }
                this.f20654n.mo5827a(c6882k.m30413f());
                m24382a((Object) k, i, (C6882k) c6882k, (Object) c4636f);
                if (c4636f == null) {
                    this.f20654n.mo5829b(c6882k.m30413f());
                    m24381a((Object) k, i, (C6882k) c6882k);
                }
                return c4636f;
            } catch (Throwable th3) {
                th = th3;
                c4636f = null;
                if (c4636f == null) {
                    this.f20654n.mo5829b(c6882k.m30413f());
                    m24381a((Object) k, i, (C6882k) c6882k);
                }
                throw th;
            }
        }

        /* renamed from: a */
        private V m24372a(C5594p<K, V> c5594p, K k, int i, V v, long j, C5587d<? super K, V> c5587d) {
            if (this.f20641a.m24434e() && j - c5594p.mo5852h() > this.f20641a.f20673m && c5594p.mo5838a().mo5834c() == null) {
                c5594p = m24374a((Object) k, i, (C5587d) c5587d, true);
                if (c5594p != null) {
                    return c5594p;
                }
            }
            return v;
        }

        /* renamed from: a */
        private V m24374a(K r8, int r9, com.google.android.m4b.maps.p126z.C5587d<? super K, V> r10, boolean r11) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r7 = this;
            r11 = 1;
            r4 = r7.m24367a(r8, r9, r11);
            r11 = 0;
            if (r4 != 0) goto L_0x0009;
        L_0x0008:
            return r11;
        L_0x0009:
            r10 = r4.m30404a(r8, r10);
            r6 = new com.google.android.m4b.maps.z.g$q$1;
            r0 = r6;
            r1 = r7;
            r2 = r8;
            r3 = r9;
            r5 = r10;
            r0.<init>(r1, r2, r3, r4, r5);
            r8 = com.google.android.m4b.maps.p126z.C5599g.f20660b;
            r10.mo4860a(r6, r8);
            r8 = r10.isDone();
            if (r8 == 0) goto L_0x0027;
        L_0x0022:
            r8 = com.google.android.m4b.maps.aj.C4641l.m20766a(r10);	 Catch:{ Throwable -> 0x0027 }
            return r8;
        L_0x0027:
            return r11;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.z.g.q.a(java.lang.Object, int, com.google.android.m4b.maps.z.d, boolean):V");
        }

        /* renamed from: a */
        private C6882k<K, V> m24367a(K k, int i, boolean z) {
            lock();
            try {
                long a = this.f20641a.f20676p.mo5824a();
                m24388c(a);
                AtomicReferenceArray atomicReferenceArray = this.f20644d;
                int length = (atomicReferenceArray.length() - 1) & i;
                C5594p c5594p = (C5594p) atomicReferenceArray.get(length);
                C5594p c5594p2 = c5594p;
                while (c5594p2 != null) {
                    Object d = c5594p2.mo5847d();
                    if (c5594p2.mo5845c() == i && d != null && this.f20641a.f20665e.m24261a(k, d)) {
                        k = c5594p2.mo5838a();
                        if (k.mo5834c() == 0) {
                            if (!z || a - c5594p2.mo5852h() >= this.f20641a.f20673m) {
                                this.f20643c++;
                                C5598z c6882k = new C6882k(k);
                                c5594p2.mo5841a(c6882k);
                                unlock();
                                m24406b();
                                return c6882k;
                            }
                        }
                        unlock();
                        m24406b();
                        return null;
                    }
                    c5594p2 = c5594p2.mo5842b();
                }
                this.f20643c++;
                C5598z c6882k2 = new C6882k();
                k = m24371a((Object) k, i, c5594p);
                k.mo5841a(c6882k2);
                atomicReferenceArray.set(length, k);
                unlock();
                m24406b();
                return c6882k2;
            } catch (Throwable th) {
                unlock();
                m24406b();
            }
        }

        /* renamed from: c */
        private void m24387c() {
            if (tryLock()) {
                try {
                    m24391d();
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: d */
        private void m24391d() {
            int i = 0;
            if (this.f20641a.m24437h()) {
                int i2 = 0;
                while (true) {
                    Reference poll = this.f20645e.poll();
                    if (poll == null) {
                        break;
                    }
                    C5594p c5594p = (C5594p) poll;
                    C5599g c5599g = this.f20641a;
                    int c = c5594p.mo5845c();
                    c5599g.m24428a(c).m24403a(c5594p, c);
                    i2++;
                    if (i2 == 16) {
                        break;
                    }
                }
            }
            if (this.f20641a.m24438i()) {
                while (true) {
                    Reference poll2 = this.f20646f.poll();
                    if (poll2 != null) {
                        C5598z c5598z = (C5598z) poll2;
                        C5599g c5599g2 = this.f20641a;
                        C5594p b = c5598z.mo5833b();
                        c = b.mo5845c();
                        c5599g2.m24428a(c).m24404a(b.mo5847d(), c, c5598z);
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

        /* renamed from: b */
        private void m24386b(C5594p<K, V> c5594p, long j) {
            if (this.f20641a.m24433d()) {
                c5594p.mo5839a(j);
            }
            this.f20653m.add(c5594p);
        }

        /* renamed from: c */
        private void m24389c(C5594p<K, V> c5594p, long j) {
            if (this.f20641a.m24433d()) {
                c5594p.mo5839a(j);
            }
            this.f20649i.add(c5594p);
        }

        /* renamed from: e */
        private void m24392e() {
            while (true) {
                C5594p c5594p = (C5594p) this.f20653m.poll();
                if (c5594p == null) {
                    return;
                }
                if (this.f20649i.contains(c5594p)) {
                    this.f20649i.add(c5594p);
                }
            }
        }

        /* renamed from: a */
        private void m24376a(long j) {
            if (tryLock()) {
                try {
                    m24385b(j);
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: b */
        private void m24385b(long j) {
            m24392e();
            C5594p c5594p;
            do {
                c5594p = (C5594p) this.f20648h.peek();
                if (c5594p == null || !this.f20641a.m24430a(c5594p, j)) {
                    do {
                        c5594p = (C5594p) this.f20649i.peek();
                        if (c5594p == null || !this.f20641a.m24430a(c5594p, j)) {
                            return;
                        }
                    } while (m24380a(c5594p, c5594p.mo5845c(), C5602k.EXPIRED));
                    throw new AssertionError();
                }
            } while (m24380a(c5594p, c5594p.mo5845c(), C5602k.EXPIRED));
            throw new AssertionError();
        }

        /* renamed from: a */
        final void m24402a(C5594p<K, V> c5594p, C5602k c5602k) {
            Object d = c5594p.mo5847d();
            c5594p.mo5845c();
            m24379a(d, c5594p.mo5838a(), c5602k);
        }

        /* renamed from: a */
        private void m24379a(Object obj, C5598z c5598z, C5602k c5602k) {
            this.f20650j -= c5598z.mo5830a();
            if (c5602k.mo5862a()) {
                this.f20654n.mo5825a();
            }
            if (this.f20641a.f20674n != C5599g.f20662t) {
                this.f20641a.f20674n.offer(new C5604m(obj, c5598z.get(), c5602k));
            }
        }

        /* renamed from: f */
        private void m24393f() {
            if (this.f20641a.m24429a()) {
                m24392e();
                while (((long) this.f20650j) > this.f20652l) {
                    for (C5594p c5594p : this.f20649i) {
                        if (c5594p.mo5838a().mo5830a() > 0) {
                            if (!m24380a(c5594p, c5594p.mo5845c(), C5602k.SIZE)) {
                                throw new AssertionError();
                            }
                        }
                    }
                    throw new AssertionError();
                }
            }
        }

        /* renamed from: a */
        private C5594p<K, V> m24370a(Object obj, int i, long j) {
            C5594p d = m24390d(obj, i);
            if (d == null) {
                return null;
            }
            if (!this.f20641a.m24430a(d, j)) {
                return d;
            }
            m24376a(j);
            return null;
        }

        /* renamed from: a */
        final V m24395a(C5594p<K, V> c5594p, long j) {
            if (c5594p.mo5847d() == null) {
                m24387c();
                return null;
            }
            V v = c5594p.mo5838a().get();
            if (v == null) {
                m24387c();
                return null;
            } else if (this.f20641a.m24430a((C5594p) c5594p, j) == null) {
                return v;
            } else {
                m24376a(j);
                return null;
            }
        }

        /* renamed from: a */
        final V m24396a(Object obj, int i) {
            try {
                V v = null;
                if (this.f20642b != 0) {
                    long a = this.f20641a.f20676p.mo5824a();
                    C5594p a2 = m24370a(obj, i, a);
                    if (a2 == null) {
                        return v;
                    }
                    Object obj2 = a2.mo5838a().get();
                    if (obj2 != null) {
                        m24386b(a2, a);
                        obj = m24372a(a2, a2.mo5847d(), i, obj2, a, this.f20641a.f20678r);
                        m24401a();
                        return obj;
                    }
                    m24387c();
                }
                m24401a();
                return v;
            } finally {
                m24401a();
            }
        }

        /* renamed from: b */
        final boolean m24407b(Object obj, int i) {
            try {
                boolean z = false;
                if (this.f20642b != 0) {
                    obj = m24370a(obj, i, this.f20641a.f20676p.mo5824a());
                    if (obj == null) {
                        return z;
                    }
                    if (obj.mo5838a().get() != null) {
                        z = true;
                    }
                    m24401a();
                    return z;
                }
                m24401a();
                return z;
            } finally {
                m24401a();
            }
        }

        /* renamed from: a */
        final V m24400a(K k, int i, V v, boolean z) {
            lock();
            try {
                V v2;
                long a = this.f20641a.f20676p.mo5824a();
                m24388c(a);
                if (this.f20642b + 1 > this.f20651k) {
                    m24394g();
                    int i2 = this.f20642b;
                }
                AtomicReferenceArray atomicReferenceArray = this.f20644d;
                int length = i & (atomicReferenceArray.length() - 1);
                C5594p c5594p = (C5594p) atomicReferenceArray.get(length);
                C5594p c5594p2 = c5594p;
                while (true) {
                    v2 = null;
                    if (c5594p2 != null) {
                        Object d = c5594p2.mo5847d();
                        if (c5594p2.mo5845c() == i && d != null && this.f20641a.f20665e.m24261a(k, d)) {
                            break;
                        }
                        c5594p2 = c5594p2.mo5842b();
                    } else {
                        this.f20643c++;
                        i = m24371a((Object) k, i, c5594p);
                        m24378a((C5594p) i, (Object) k, (Object) v, a);
                        atomicReferenceArray.set(length, i);
                        this.f20642b++;
                        m24393f();
                        unlock();
                        m24406b();
                        return v2;
                    }
                }
                C5598z a2 = c5594p2.mo5838a();
                V v3 = a2.get();
                if (v3 == null) {
                    this.f20643c++;
                    if (a2.mo5835d()) {
                        m24379a((Object) k, a2, C5602k.COLLECTED);
                        m24378a(c5594p2, (Object) k, (Object) v, a);
                        k = this.f20642b;
                    } else {
                        m24378a(c5594p2, (Object) k, (Object) v, a);
                        k = this.f20642b + 1;
                    }
                    this.f20642b = k;
                    m24393f();
                    return v2;
                } else if (z) {
                    m24389c(c5594p2, a);
                    unlock();
                    m24406b();
                    return v3;
                } else {
                    this.f20643c++;
                    m24379a((Object) k, a2, C5602k.REPLACED);
                    m24378a(c5594p2, (Object) k, (Object) v, a);
                    m24393f();
                    unlock();
                    m24406b();
                    return v3;
                }
            } finally {
                unlock();
                m24406b();
            }
        }

        /* renamed from: g */
        private void m24394g() {
            AtomicReferenceArray atomicReferenceArray = this.f20644d;
            int length = atomicReferenceArray.length();
            if (length < 1073741824) {
                int i = this.f20642b;
                AtomicReferenceArray a = C5596q.m24375a(length << 1);
                this.f20651k = (a.length() * 3) / 4;
                int length2 = a.length() - 1;
                for (int i2 = 0; i2 < length; i2++) {
                    C5594p c5594p = (C5594p) atomicReferenceArray.get(i2);
                    if (c5594p != null) {
                        C5594p b = c5594p.mo5842b();
                        int c = c5594p.mo5845c() & length2;
                        if (b == null) {
                            a.set(c, c5594p);
                        } else {
                            C5594p c5594p2 = c5594p;
                            while (b != null) {
                                int c2 = b.mo5845c() & length2;
                                if (c2 != c) {
                                    c5594p2 = b;
                                    c = c2;
                                }
                                b = b.mo5842b();
                            }
                            a.set(c, c5594p2);
                            while (c5594p != c5594p2) {
                                int c3 = c5594p.mo5845c() & length2;
                                C5594p a2 = m24368a(c5594p, (C5594p) a.get(c3));
                                if (a2 != null) {
                                    a.set(c3, a2);
                                } else {
                                    m24377a(c5594p);
                                    i--;
                                }
                                c5594p = c5594p.mo5842b();
                            }
                        }
                    }
                }
                this.f20644d = a;
                this.f20642b = i;
            }
        }

        /* renamed from: a */
        final boolean m24405a(K k, int i, V v, V v2) {
            Object obj = k;
            int i2 = i;
            lock();
            try {
                long a = r8.f20641a.f20676p.mo5824a();
                m24388c(a);
                AtomicReferenceArray atomicReferenceArray = r8.f20644d;
                int length = i2 & (atomicReferenceArray.length() - 1);
                C5594p c5594p = (C5594p) atomicReferenceArray.get(length);
                for (C5594p c5594p2 = c5594p; c5594p2 != null; c5594p2 = c5594p2.mo5842b()) {
                    Object d = c5594p2.mo5847d();
                    if (c5594p2.mo5845c() == i2 && d != null && r8.f20641a.f20665e.m24261a(obj, d)) {
                        C5598z a2 = c5594p2.mo5838a();
                        Object obj2 = a2.get();
                        if (obj2 == null) {
                            if (a2.mo5835d()) {
                                int i3 = r8.f20642b;
                                r8.f20643c++;
                                C5594p a3 = m24369a(c5594p, c5594p2, d, i2, a2, C5602k.COLLECTED);
                                int i4 = r8.f20642b - 1;
                                atomicReferenceArray.set(length, a3);
                                r8.f20642b = i4;
                            }
                            unlock();
                            m24406b();
                            return false;
                        } else if (r8.f20641a.f20666f.m24261a(v, obj2)) {
                            r8.f20643c++;
                            m24379a(obj, a2, C5602k.REPLACED);
                            m24378a(c5594p2, obj, (Object) v2, a);
                            m24393f();
                            unlock();
                            m24406b();
                            return true;
                        } else {
                            m24389c(c5594p2, a);
                            unlock();
                            m24406b();
                            return false;
                        }
                    }
                    V v3 = v;
                }
                unlock();
                m24406b();
                return false;
            } catch (Throwable th) {
                Throwable th2 = th;
                unlock();
                m24406b();
            }
        }

        /* renamed from: a */
        final V m24399a(K k, int i, V v) {
            Object obj = k;
            int i2 = i;
            lock();
            try {
                long a = r8.f20641a.f20676p.mo5824a();
                m24388c(a);
                AtomicReferenceArray atomicReferenceArray = r8.f20644d;
                int length = i2 & (atomicReferenceArray.length() - 1);
                C5594p c5594p = (C5594p) atomicReferenceArray.get(length);
                for (C5594p c5594p2 = c5594p; c5594p2 != null; c5594p2 = c5594p2.mo5842b()) {
                    Object d = c5594p2.mo5847d();
                    if (c5594p2.mo5845c() == i2 && d != null && r8.f20641a.f20665e.m24261a(obj, d)) {
                        C5598z a2 = c5594p2.mo5838a();
                        V v2 = a2.get();
                        if (v2 == null) {
                            if (a2.mo5835d()) {
                                int i3 = r8.f20642b;
                                r8.f20643c++;
                                C5594p a3 = m24369a(c5594p, c5594p2, d, i2, a2, C5602k.COLLECTED);
                                int i4 = r8.f20642b - 1;
                                atomicReferenceArray.set(length, a3);
                                r8.f20642b = i4;
                            }
                            unlock();
                            m24406b();
                            return null;
                        }
                        r8.f20643c++;
                        m24379a(obj, a2, C5602k.REPLACED);
                        m24378a(c5594p2, obj, (Object) v, a);
                        m24393f();
                        unlock();
                        m24406b();
                        return v2;
                    }
                }
                unlock();
                m24406b();
                return null;
            } catch (Throwable th) {
                Throwable th2 = th;
                unlock();
                m24406b();
            }
        }

        /* renamed from: c */
        final V m24409c(Object obj, int i) {
            lock();
            try {
                m24388c(this.f20641a.f20676p.mo5824a());
                int i2 = this.f20642b;
                AtomicReferenceArray atomicReferenceArray = this.f20644d;
                int length = (atomicReferenceArray.length() - 1) & i;
                C5594p c5594p = (C5594p) atomicReferenceArray.get(length);
                for (C5594p c5594p2 = c5594p; c5594p2 != null; c5594p2 = c5594p2.mo5842b()) {
                    Object d = c5594p2.mo5847d();
                    if (c5594p2.mo5845c() == i && d != null && this.f20641a.f20665e.m24261a(obj, d)) {
                        C5602k c5602k;
                        C5598z a = c5594p2.mo5838a();
                        obj = a.get();
                        if (obj != null) {
                            c5602k = C5602k.EXPLICIT;
                        } else if (a.mo5835d()) {
                            c5602k = C5602k.COLLECTED;
                        } else {
                            unlock();
                            m24406b();
                            return null;
                        }
                        C5602k c5602k2 = c5602k;
                        this.f20643c++;
                        int i3 = this.f20642b - 1;
                        atomicReferenceArray.set(length, m24369a(c5594p, c5594p2, d, i, a, c5602k2));
                        this.f20642b = i3;
                        return obj;
                    }
                }
                unlock();
                m24406b();
                return null;
            } finally {
                unlock();
                m24406b();
            }
        }

        /* renamed from: a */
        private boolean m24382a(K k, int i, C6882k<K, V> c6882k, V v) {
            lock();
            long a = this.f20641a.f20676p.mo5824a();
            m24388c(a);
            boolean z = true;
            int i2 = this.f20642b + z;
            if (i2 > this.f20651k) {
                m24394g();
                i2 = this.f20642b + z;
            }
            AtomicReferenceArray atomicReferenceArray = this.f20644d;
            int length = i & (atomicReferenceArray.length() - z);
            C5594p c5594p = (C5594p) atomicReferenceArray.get(length);
            C5594p c5594p2 = c5594p;
            while (c5594p2 != null) {
                Object d = c5594p2.mo5847d();
                if (c5594p2.mo5845c() == i && d != null && this.f20641a.f20665e.m24261a(k, d)) {
                    i = c5594p2.mo5838a();
                    Object obj = i.get();
                    if (c6882k != i) {
                        if (obj != null || i == C5599g.f20661s) {
                            m24379a((Object) k, new ah(v, 0), C5602k.REPLACED);
                            unlock();
                            m24406b();
                            return false;
                        }
                    }
                    this.f20643c += z;
                    if (c6882k.mo5835d() != 0) {
                        m24379a((Object) k, (C5598z) c6882k, obj == null ? C5602k.COLLECTED : C5602k.REPLACED);
                        i2--;
                    }
                    m24378a(c5594p2, (Object) k, (Object) v, a);
                    this.f20642b = i2;
                    m24393f();
                    return z;
                }
                try {
                    c5594p2 = c5594p2.mo5842b();
                } finally {
                    unlock();
                    m24406b();
                }
            }
            this.f20643c += z;
            i = m24371a((Object) k, i, c5594p);
            m24378a((C5594p) i, (Object) k, (Object) v, a);
            atomicReferenceArray.set(length, i);
            this.f20642b = i2;
            m24393f();
            unlock();
            m24406b();
            return z;
        }

        /* renamed from: b */
        final boolean m24408b(Object obj, int i, Object obj2) {
            lock();
            try {
                m24388c(this.f20641a.f20676p.mo5824a());
                int i2 = this.f20642b;
                AtomicReferenceArray atomicReferenceArray = this.f20644d;
                boolean z = true;
                int length = (atomicReferenceArray.length() - 1) & i;
                C5594p c5594p = (C5594p) atomicReferenceArray.get(length);
                for (C5594p c5594p2 = c5594p; c5594p2 != null; c5594p2 = c5594p2.mo5842b()) {
                    Object d = c5594p2.mo5847d();
                    if (c5594p2.mo5845c() == i && d != null && this.f20641a.f20665e.m24261a(obj, d)) {
                        C5602k c5602k;
                        C5598z a = c5594p2.mo5838a();
                        obj = a.get();
                        if (this.f20641a.f20666f.m24261a(obj2, obj) != null) {
                            c5602k = C5602k.EXPLICIT;
                        } else if (obj != null || a.mo5835d() == null) {
                            unlock();
                            m24406b();
                            return false;
                        } else {
                            c5602k = C5602k.COLLECTED;
                        }
                        this.f20643c += 1;
                        obj2 = this.f20642b - 1;
                        atomicReferenceArray.set(length, m24369a(c5594p, c5594p2, d, i, a, c5602k));
                        this.f20642b = obj2;
                        if (c5602k != C5602k.EXPLICIT) {
                            z = false;
                        }
                        unlock();
                        m24406b();
                        return z;
                    }
                }
                unlock();
                m24406b();
                return false;
            } catch (Throwable th) {
                unlock();
                m24406b();
            }
        }

        /* renamed from: a */
        private C5594p<K, V> m24369a(C5594p<K, V> c5594p, C5594p<K, V> c5594p2, K k, int i, C5598z<K, V> c5598z, C5602k c5602k) {
            m24379a((Object) k, (C5598z) c5598z, c5602k);
            this.f20648h.remove(c5594p2);
            this.f20649i.remove(c5594p2);
            if (c5598z.mo5834c() == null) {
                return m24383b((C5594p) c5594p, (C5594p) c5594p2);
            }
            c5598z.mo5832a(null);
            return c5594p;
        }

        /* renamed from: b */
        private C5594p<K, V> m24383b(C5594p<K, V> c5594p, C5594p<K, V> c5594p2) {
            int i = this.f20642b;
            C5594p<K, V> b = c5594p2.mo5842b();
            C5594p b2;
            while (b2 != c5594p2) {
                C5594p<K, V> a = m24368a(b2, (C5594p) b);
                if (a != null) {
                    b = a;
                } else {
                    m24377a(b2);
                    i--;
                }
                b2 = b2.mo5842b();
            }
            this.f20642b = i;
            return b;
        }

        /* renamed from: a */
        private void m24377a(C5594p<K, V> c5594p) {
            m24402a((C5594p) c5594p, C5602k.COLLECTED);
            this.f20648h.remove(c5594p);
            this.f20649i.remove(c5594p);
        }

        /* renamed from: a */
        final boolean m24403a(C5594p<K, V> c5594p, int i) {
            lock();
            try {
                int i2 = this.f20642b;
                AtomicReferenceArray atomicReferenceArray = this.f20644d;
                boolean z = true;
                int length = (atomicReferenceArray.length() - z) & i;
                C5594p c5594p2 = (C5594p) atomicReferenceArray.get(length);
                for (C5594p c5594p3 = c5594p2; c5594p3 != null; c5594p3 = c5594p3.mo5842b()) {
                    if (c5594p3 == c5594p) {
                        this.f20643c += z;
                        i = this.f20642b - z;
                        atomicReferenceArray.set(length, m24369a(c5594p2, c5594p3, c5594p3.mo5847d(), i, c5594p3.mo5838a(), C5602k.COLLECTED));
                        this.f20642b = i;
                        return z;
                    }
                }
                unlock();
                m24406b();
                return null;
            } finally {
                unlock();
                m24406b();
            }
        }

        /* renamed from: a */
        final boolean m24404a(K k, int i, C5598z<K, V> c5598z) {
            lock();
            try {
                int i2 = this.f20642b;
                AtomicReferenceArray atomicReferenceArray = this.f20644d;
                boolean z = true;
                int length = (atomicReferenceArray.length() - z) & i;
                C5594p c5594p = (C5594p) atomicReferenceArray.get(length);
                C5594p c5594p2 = c5594p;
                while (c5594p2 != null) {
                    Object d = c5594p2.mo5847d();
                    if (c5594p2.mo5845c() != i || d == null || !this.f20641a.f20665e.m24261a(k, d)) {
                        c5594p2 = c5594p2.mo5842b();
                    } else if (c5594p2.mo5838a() == c5598z) {
                        this.f20643c += z;
                        i = this.f20642b - z;
                        atomicReferenceArray.set(length, m24369a(c5594p, c5594p2, d, i, (C5598z) c5598z, C5602k.COLLECTED));
                        this.f20642b = i;
                        return z;
                    } else {
                        unlock();
                        if (isHeldByCurrentThread() == null) {
                            m24406b();
                        }
                        return false;
                    }
                }
                unlock();
                if (isHeldByCurrentThread() == null) {
                    m24406b();
                }
                return false;
            } finally {
                unlock();
                if (isHeldByCurrentThread() == 0) {
                    m24406b();
                }
            }
        }

        /* renamed from: a */
        private boolean m24381a(K k, int i, C6882k<K, V> c6882k) {
            lock();
            try {
                AtomicReferenceArray atomicReferenceArray = this.f20644d;
                int length = (atomicReferenceArray.length() - 1) & i;
                C5594p c5594p = (C5594p) atomicReferenceArray.get(length);
                C5594p c5594p2 = c5594p;
                while (c5594p2 != null) {
                    Object d = c5594p2.mo5847d();
                    if (c5594p2.mo5845c() != i || d == null || !this.f20641a.f20665e.m24261a(k, d)) {
                        c5594p2 = c5594p2.mo5842b();
                    } else if (c5594p2.mo5838a() == c6882k) {
                        if (c6882k.mo5835d() != null) {
                            c5594p2.mo5841a(c6882k.f25436a);
                        } else {
                            atomicReferenceArray.set(length, m24383b(c5594p, c5594p2));
                        }
                        unlock();
                        m24406b();
                        return true;
                    } else {
                        unlock();
                        m24406b();
                        return false;
                    }
                }
                unlock();
                m24406b();
                return false;
            } catch (Throwable th) {
                unlock();
                m24406b();
            }
        }

        /* renamed from: a */
        private boolean m24380a(C5594p<K, V> c5594p, int i, C5602k c5602k) {
            int i2 = this.f20642b;
            AtomicReferenceArray atomicReferenceArray = this.f20644d;
            int length = (atomicReferenceArray.length() - 1) & i;
            C5594p c5594p2 = (C5594p) atomicReferenceArray.get(length);
            for (C5594p c5594p3 = c5594p2; c5594p3 != null; c5594p3 = c5594p3.mo5842b()) {
                if (c5594p3 == c5594p) {
                    this.f20643c += 1;
                    i = this.f20642b - 1;
                    atomicReferenceArray.set(length, m24369a(c5594p2, c5594p3, c5594p3.mo5847d(), i, c5594p3.mo5838a(), c5602k));
                    this.f20642b = i;
                    return true;
                }
            }
            return null;
        }

        /* renamed from: a */
        final void m24401a() {
            if ((this.f20647g.incrementAndGet() & 63) == 0) {
                m24388c(this.f20641a.f20676p.mo5824a());
                m24406b();
            }
        }

        /* renamed from: c */
        private void m24388c(long j) {
            if (tryLock()) {
                try {
                    m24391d();
                    m24385b(j);
                    this.f20647g.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: b */
        final void m24406b() {
            if (!isHeldByCurrentThread()) {
                while (((C5604m) this.f20641a.f20674n.poll()) != null) {
                }
            }
        }

        /* renamed from: d */
        private C5594p<K, V> m24390d(Object obj, int i) {
            AtomicReferenceArray atomicReferenceArray = this.f20644d;
            for (C5594p<K, V> c5594p = (C5594p) atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i); c5594p != null; c5594p = c5594p.mo5842b()) {
                if (c5594p.mo5845c() == i) {
                    Object d = c5594p.mo5847d();
                    if (d == null) {
                        m24387c();
                    } else if (this.f20641a.f20665e.m24261a(obj, d)) {
                        return c5594p;
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$s */
    enum C5597s {
        STRONG {
            /* renamed from: a */
            final <K, V> C5598z<K, V> mo5858a(C5596q<K, V> c5596q, C5594p<K, V> c5594p, V v, int i) {
                return i == 1 ? new C6889w(v) : new ah(v, i);
            }

            /* renamed from: a */
            final C5563e<Object> mo5857a() {
                return C5563e.m24258a();
            }
        },
        SOFT {
            /* renamed from: a */
            final <K, V> C5598z<K, V> mo5858a(C5596q<K, V> c5596q, C5594p<K, V> c5594p, V v, int i) {
                return i == 1 ? new C6885r(c5596q.f20646f, v, c5594p) : new ag(c5596q.f20646f, v, c5594p, i);
            }

            /* renamed from: a */
            final C5563e<Object> mo5857a() {
                return C5563e.m24259b();
            }
        },
        WEAK {
            /* renamed from: a */
            final <K, V> C5598z<K, V> mo5858a(C5596q<K, V> c5596q, C5594p<K, V> c5594p, V v, int i) {
                return i == 1 ? new ae(c5596q.f20646f, v, c5594p) : new ai(c5596q.f20646f, v, c5594p, i);
            }

            /* renamed from: a */
            final C5563e<Object> mo5857a() {
                return C5563e.m24259b();
            }
        };

        /* renamed from: a */
        abstract C5563e<Object> mo5857a();

        /* renamed from: a */
        abstract <K, V> C5598z<K, V> mo5858a(C5596q<K, V> c5596q, C5594p<K, V> c5594p, V v, int i);
    }

    /* renamed from: com.google.android.m4b.maps.z.g$z */
    interface C5598z<K, V> {
        /* renamed from: a */
        int mo5830a();

        /* renamed from: a */
        C5598z<K, V> mo5831a(ReferenceQueue<V> referenceQueue, V v, C5594p<K, V> c5594p);

        /* renamed from: a */
        void mo5832a(V v);

        /* renamed from: b */
        C5594p<K, V> mo5833b();

        /* renamed from: c */
        boolean mo5834c();

        /* renamed from: d */
        boolean mo5835d();

        /* renamed from: e */
        V mo5836e();

        V get();
    }

    /* renamed from: com.google.android.m4b.maps.z.g$1 */
    static class C68681 implements C5598z<Object, Object> {
        /* renamed from: a */
        public final int mo5830a() {
            return 0;
        }

        /* renamed from: a */
        public final C5598z<Object, Object> mo5831a(ReferenceQueue<Object> referenceQueue, Object obj, C5594p<Object, Object> c5594p) {
            return this;
        }

        /* renamed from: a */
        public final void mo5832a(Object obj) {
        }

        /* renamed from: b */
        public final C5594p<Object, Object> mo5833b() {
            return null;
        }

        /* renamed from: c */
        public final boolean mo5834c() {
            return false;
        }

        /* renamed from: d */
        public final boolean mo5835d() {
            return false;
        }

        /* renamed from: e */
        public final Object mo5836e() {
            return null;
        }

        public final Object get() {
            return null;
        }

        C68681() {
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$ad */
    static class ad<K, V> extends WeakReference<K> implements C5594p<K, V> {
        /* renamed from: a */
        private int f25428a;
        /* renamed from: b */
        private C5594p<K, V> f25429b;
        /* renamed from: c */
        private volatile C5598z<K, V> f25430c = C5599g.m24424j();

        ad(ReferenceQueue<K> referenceQueue, K k, int i, C5594p<K, V> c5594p) {
            super(k, referenceQueue);
            this.f25428a = i;
            this.f25429b = c5594p;
        }

        /* renamed from: d */
        public final K mo5847d() {
            return get();
        }

        /* renamed from: e */
        public long mo5849e() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo5839a(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public C5594p<K, V> mo5850f() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo5840a(C5594p<K, V> c5594p) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: g */
        public C5594p<K, V> mo5851g() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public void mo5844b(C5594p<K, V> c5594p) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: h */
        public long mo5852h() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public void mo5843b(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: i */
        public C5594p<K, V> mo5853i() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public void mo5846c(C5594p<K, V> c5594p) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: j */
        public C5594p<K, V> mo5854j() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public void mo5848d(C5594p<K, V> c5594p) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public final C5598z<K, V> mo5838a() {
            return this.f25430c;
        }

        /* renamed from: a */
        public final void mo5841a(C5598z<K, V> c5598z) {
            this.f25430c = c5598z;
        }

        /* renamed from: c */
        public final int mo5845c() {
            return this.f25428a;
        }

        /* renamed from: b */
        public final C5594p<K, V> mo5842b() {
            return this.f25429b;
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$ae */
    static class ae<K, V> extends WeakReference<V> implements C5598z<K, V> {
        /* renamed from: a */
        private C5594p<K, V> f25431a;

        /* renamed from: a */
        public int mo5830a() {
            return 1;
        }

        /* renamed from: a */
        public final void mo5832a(V v) {
        }

        /* renamed from: c */
        public final boolean mo5834c() {
            return false;
        }

        /* renamed from: d */
        public final boolean mo5835d() {
            return true;
        }

        ae(ReferenceQueue<V> referenceQueue, V v, C5594p<K, V> c5594p) {
            super(v, referenceQueue);
            this.f25431a = c5594p;
        }

        /* renamed from: b */
        public final C5594p<K, V> mo5833b() {
            return this.f25431a;
        }

        /* renamed from: a */
        public C5598z<K, V> mo5831a(ReferenceQueue<V> referenceQueue, V v, C5594p<K, V> c5594p) {
            return new ae(referenceQueue, v, c5594p);
        }

        /* renamed from: e */
        public final V mo5836e() {
            return get();
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$b */
    static abstract class C6869b<K, V> implements C5594p<K, V> {
        C6869b() {
        }

        /* renamed from: a */
        public C5598z<K, V> mo5838a() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo5841a(C5598z<K, V> c5598z) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public C5594p<K, V> mo5842b() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public int mo5845c() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public K mo5847d() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public long mo5849e() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo5839a(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public C5594p<K, V> mo5850f() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo5840a(C5594p<K, V> c5594p) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: g */
        public C5594p<K, V> mo5851g() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public void mo5844b(C5594p<K, V> c5594p) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: h */
        public long mo5852h() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public void mo5843b(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: i */
        public C5594p<K, V> mo5853i() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public void mo5846c(C5594p<K, V> c5594p) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: j */
        public C5594p<K, V> mo5854j() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public void mo5848d(C5594p<K, V> c5594p) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$e */
    final class C6878e extends C5593g<Entry<K, V>> {
        /* renamed from: a */
        private /* synthetic */ C5599g f25432a;

        C6878e(C5599g c5599g) {
            this.f25432a = c5599g;
            super(c5599g);
        }

        public final /* synthetic */ Object next() {
            return m24349a();
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$f */
    final class C6879f extends C5590a<Entry<K, V>> {
        /* renamed from: b */
        private /* synthetic */ C5599g f25433b;

        C6879f(C5599g c5599g, ConcurrentMap<?, ?> concurrentMap) {
            this.f25433b = c5599g;
            super(c5599g, concurrentMap);
        }

        public final Iterator<Entry<K, V>> iterator() {
            return new C6878e(this.f25433b);
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
            key = this.f25433b.get(key);
            if (key == null || this.f25433b.f20666f.m24261a(entry.getValue(), key) == null) {
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
            if (key == null || this.f25433b.remove(key, entry.getValue()) == null) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$h */
    final class C6880h extends C5593g<K> {
        /* renamed from: a */
        private /* synthetic */ C5599g f25434a;

        C6880h(C5599g c5599g) {
            this.f25434a = c5599g;
            super(c5599g);
        }

        public final K next() {
            return m24349a().getKey();
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$i */
    final class C6881i extends C5590a<K> {
        /* renamed from: b */
        private /* synthetic */ C5599g f25435b;

        C6881i(C5599g c5599g, ConcurrentMap<?, ?> concurrentMap) {
            this.f25435b = c5599g;
            super(c5599g, concurrentMap);
        }

        public final Iterator<K> iterator() {
            return new C6880h(this.f25435b);
        }

        public final boolean contains(Object obj) {
            return this.a.containsKey(obj);
        }

        public final boolean remove(Object obj) {
            return this.a.remove(obj) != null ? true : null;
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$k */
    static class C6882k<K, V> implements C5598z<K, V> {
        /* renamed from: a */
        volatile C5598z<K, V> f25436a;
        /* renamed from: b */
        private C7434j<V> f25437b;
        /* renamed from: c */
        private C5578o f25438c;

        /* renamed from: com.google.android.m4b.maps.z.g$k$1 */
        class C77271 implements C6849f<V, V> {
            /* renamed from: a */
            private /* synthetic */ C6882k f28215a;

            C77271(C6882k c6882k) {
                this.f28215a = c6882k;
            }

            /* renamed from: a */
            public final V mo7022a(V v) {
                this.f28215a.m30409b(v);
                return v;
            }
        }

        /* renamed from: a */
        public final C5598z<K, V> mo5831a(ReferenceQueue<V> referenceQueue, V v, C5594p<K, V> c5594p) {
            return this;
        }

        /* renamed from: b */
        public final C5594p<K, V> mo5833b() {
            return null;
        }

        /* renamed from: c */
        public final boolean mo5834c() {
            return true;
        }

        public C6882k() {
            this(C5599g.m24424j());
        }

        public C6882k(C5598z<K, V> c5598z) {
            this.f25437b = C7434j.m32009b();
            this.f25438c = new C5578o();
            this.f25436a = c5598z;
        }

        /* renamed from: d */
        public final boolean mo5835d() {
            return this.f25436a.mo5835d();
        }

        /* renamed from: a */
        public final int mo5830a() {
            return this.f25436a.mo5830a();
        }

        /* renamed from: b */
        public final boolean m30409b(V v) {
            return this.f25437b.mo7025a((Object) v);
        }

        /* renamed from: a */
        public final boolean m30407a(Throwable th) {
            return this.f25437b.mo7026a(th);
        }

        /* renamed from: a */
        public final void mo5832a(V v) {
            if (v != null) {
                m30409b(v);
            } else {
                this.f25436a = C5599g.m24424j();
            }
        }

        /* renamed from: a */
        public final C4636f<V> m30404a(K k, C5587d<? super K, V> c5587d) {
            this.f25438c.m24317a();
            Object obj = this.f25436a.get();
            if (obj == null) {
                try {
                    Object a = c5587d.mo4840a(k);
                    return m30409b(a) != null ? this.f25437b : C4635e.m20757a(a);
                } catch (Throwable th) {
                    if ((th instanceof InterruptedException) != null) {
                        Thread.currentThread().interrupt();
                    }
                    return m30407a(th) != null ? this.f25437b : C4635e.m20758a(th);
                }
            } else {
                C5571j.m24292a((Object) k);
                C5571j.m24292a(obj);
                k = C4635e.m20757a(c5587d.mo4840a(k));
                if (k == null) {
                    return C4635e.m20757a((Object) null);
                }
                return C4635e.m20756a(k, new C77271(this));
            }
        }

        /* renamed from: f */
        public final long m30413f() {
            return this.f25438c.m24316a(TimeUnit.NANOSECONDS);
        }

        /* renamed from: e */
        public final V mo5836e() {
            return C4641l.m20766a(this.f25437b);
        }

        public final V get() {
            return this.f25436a.get();
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$m */
    static class C6883m<K, V> implements C5584b<K, V>, Serializable {
        private static final long serialVersionUID = 1;
        /* renamed from: a */
        final C5599g<K, V> f25439a;

        C6883m(C5585c<? super K, ? super V> c5585c) {
            this(new C5599g(c5585c, null));
        }

        private C6883m(C5599g<K, V> c5599g) {
            this.f25439a = c5599g;
        }

        Object writeReplace() {
            return new C7729n(this.f25439a);
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$o */
    enum C6884o implements C5594p<Object, Object> {
        INSTANCE;

        /* renamed from: a */
        public final C5598z<Object, Object> mo5838a() {
            return null;
        }

        /* renamed from: a */
        public final void mo5839a(long j) {
        }

        /* renamed from: a */
        public final void mo5840a(C5594p<Object, Object> c5594p) {
        }

        /* renamed from: a */
        public final void mo5841a(C5598z<Object, Object> c5598z) {
        }

        /* renamed from: b */
        public final C5594p<Object, Object> mo5842b() {
            return null;
        }

        /* renamed from: b */
        public final void mo5843b(long j) {
        }

        /* renamed from: b */
        public final void mo5844b(C5594p<Object, Object> c5594p) {
        }

        /* renamed from: c */
        public final int mo5845c() {
            return 0;
        }

        /* renamed from: c */
        public final void mo5846c(C5594p<Object, Object> c5594p) {
        }

        /* renamed from: d */
        public final Object mo5847d() {
            return null;
        }

        /* renamed from: d */
        public final void mo5848d(C5594p<Object, Object> c5594p) {
        }

        /* renamed from: e */
        public final long mo5849e() {
            return 0;
        }

        /* renamed from: f */
        public final C5594p<Object, Object> mo5850f() {
            return this;
        }

        /* renamed from: g */
        public final C5594p<Object, Object> mo5851g() {
            return this;
        }

        /* renamed from: h */
        public final long mo5852h() {
            return 0;
        }

        /* renamed from: i */
        public final C5594p<Object, Object> mo5853i() {
            return this;
        }

        /* renamed from: j */
        public final C5594p<Object, Object> mo5854j() {
            return this;
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$r */
    static class C6885r<K, V> extends SoftReference<V> implements C5598z<K, V> {
        /* renamed from: a */
        private C5594p<K, V> f25442a;

        /* renamed from: a */
        public int mo5830a() {
            return 1;
        }

        /* renamed from: a */
        public final void mo5832a(V v) {
        }

        /* renamed from: c */
        public final boolean mo5834c() {
            return false;
        }

        /* renamed from: d */
        public final boolean mo5835d() {
            return true;
        }

        C6885r(ReferenceQueue<V> referenceQueue, V v, C5594p<K, V> c5594p) {
            super(v, referenceQueue);
            this.f25442a = c5594p;
        }

        /* renamed from: b */
        public final C5594p<K, V> mo5833b() {
            return this.f25442a;
        }

        /* renamed from: a */
        public C5598z<K, V> mo5831a(ReferenceQueue<V> referenceQueue, V v, C5594p<K, V> c5594p) {
            return new C6885r(referenceQueue, v, c5594p);
        }

        /* renamed from: e */
        public final V mo5836e() {
            return get();
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$w */
    static class C6889w<K, V> implements C5598z<K, V> {
        /* renamed from: a */
        private V f25443a;

        /* renamed from: a */
        public int mo5830a() {
            return 1;
        }

        /* renamed from: a */
        public final C5598z<K, V> mo5831a(ReferenceQueue<V> referenceQueue, V v, C5594p<K, V> c5594p) {
            return this;
        }

        /* renamed from: a */
        public final void mo5832a(V v) {
        }

        /* renamed from: b */
        public final C5594p<K, V> mo5833b() {
            return null;
        }

        /* renamed from: c */
        public final boolean mo5834c() {
            return false;
        }

        /* renamed from: d */
        public final boolean mo5835d() {
            return true;
        }

        C6889w(V v) {
            this.f25443a = v;
        }

        public V get() {
            return this.f25443a;
        }

        /* renamed from: e */
        public final V mo5836e() {
            return get();
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$y */
    final class C6890y extends C5593g<V> {
        /* renamed from: a */
        private /* synthetic */ C5599g f25444a;

        C6890y(C5599g c5599g) {
            this.f25444a = c5599g;
            super(c5599g);
        }

        public final V next() {
            return m24349a().getValue();
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$ab */
    static final class ab<K, V> extends ad<K, V> {
        /* renamed from: a */
        private volatile long f28192a = -1;
        /* renamed from: b */
        private C5594p<K, V> f28193b = C5599g.m24425k();
        /* renamed from: c */
        private C5594p<K, V> f28194c = C5599g.m24425k();

        ab(ReferenceQueue<K> referenceQueue, K k, int i, C5594p<K, V> c5594p) {
            super(referenceQueue, k, i, c5594p);
        }

        /* renamed from: e */
        public final long mo5849e() {
            return this.f28192a;
        }

        /* renamed from: a */
        public final void mo5839a(long j) {
            this.f28192a = j;
        }

        /* renamed from: f */
        public final C5594p<K, V> mo5850f() {
            return this.f28193b;
        }

        /* renamed from: a */
        public final void mo5840a(C5594p<K, V> c5594p) {
            this.f28193b = c5594p;
        }

        /* renamed from: g */
        public final C5594p<K, V> mo5851g() {
            return this.f28194c;
        }

        /* renamed from: b */
        public final void mo5844b(C5594p<K, V> c5594p) {
            this.f28194c = c5594p;
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$ac */
    static final class ac<K, V> extends ad<K, V> {
        /* renamed from: a */
        private volatile long f28195a = Format.OFFSET_SAMPLE_RELATIVE;
        /* renamed from: b */
        private C5594p<K, V> f28196b = C5599g.m24425k();
        /* renamed from: c */
        private C5594p<K, V> f28197c = C5599g.m24425k();
        /* renamed from: d */
        private volatile long f28198d = Format.OFFSET_SAMPLE_RELATIVE;
        /* renamed from: e */
        private C5594p<K, V> f28199e = C5599g.m24425k();
        /* renamed from: f */
        private C5594p<K, V> f28200f = C5599g.m24425k();

        ac(ReferenceQueue<K> referenceQueue, K k, int i, C5594p<K, V> c5594p) {
            super(referenceQueue, k, i, c5594p);
        }

        /* renamed from: e */
        public final long mo5849e() {
            return this.f28195a;
        }

        /* renamed from: a */
        public final void mo5839a(long j) {
            this.f28195a = j;
        }

        /* renamed from: f */
        public final C5594p<K, V> mo5850f() {
            return this.f28196b;
        }

        /* renamed from: a */
        public final void mo5840a(C5594p<K, V> c5594p) {
            this.f28196b = c5594p;
        }

        /* renamed from: g */
        public final C5594p<K, V> mo5851g() {
            return this.f28197c;
        }

        /* renamed from: b */
        public final void mo5844b(C5594p<K, V> c5594p) {
            this.f28197c = c5594p;
        }

        /* renamed from: h */
        public final long mo5852h() {
            return this.f28198d;
        }

        /* renamed from: b */
        public final void mo5843b(long j) {
            this.f28198d = j;
        }

        /* renamed from: i */
        public final C5594p<K, V> mo5853i() {
            return this.f28199e;
        }

        /* renamed from: c */
        public final void mo5846c(C5594p<K, V> c5594p) {
            this.f28199e = c5594p;
        }

        /* renamed from: j */
        public final C5594p<K, V> mo5854j() {
            return this.f28200f;
        }

        /* renamed from: d */
        public final void mo5848d(C5594p<K, V> c5594p) {
            this.f28200f = c5594p;
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$af */
    static final class af<K, V> extends ad<K, V> {
        /* renamed from: a */
        private volatile long f28201a = -1;
        /* renamed from: b */
        private C5594p<K, V> f28202b = C5599g.m24425k();
        /* renamed from: c */
        private C5594p<K, V> f28203c = C5599g.m24425k();

        af(ReferenceQueue<K> referenceQueue, K k, int i, C5594p<K, V> c5594p) {
            super(referenceQueue, k, i, c5594p);
        }

        /* renamed from: h */
        public final long mo5852h() {
            return this.f28201a;
        }

        /* renamed from: b */
        public final void mo5843b(long j) {
            this.f28201a = j;
        }

        /* renamed from: i */
        public final C5594p<K, V> mo5853i() {
            return this.f28202b;
        }

        /* renamed from: c */
        public final void mo5846c(C5594p<K, V> c5594p) {
            this.f28202b = c5594p;
        }

        /* renamed from: j */
        public final C5594p<K, V> mo5854j() {
            return this.f28203c;
        }

        /* renamed from: d */
        public final void mo5848d(C5594p<K, V> c5594p) {
            this.f28203c = c5594p;
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$ag */
    static final class ag<K, V> extends C6885r<K, V> {
        /* renamed from: a */
        private int f28204a;

        ag(ReferenceQueue<V> referenceQueue, V v, C5594p<K, V> c5594p, int i) {
            super(referenceQueue, v, c5594p);
            this.f28204a = i;
        }

        /* renamed from: a */
        public final int mo5830a() {
            return this.f28204a;
        }

        /* renamed from: a */
        public final C5598z<K, V> mo5831a(ReferenceQueue<V> referenceQueue, V v, C5594p<K, V> c5594p) {
            return new ag(referenceQueue, v, c5594p, this.f28204a);
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$ah */
    static final class ah<K, V> extends C6889w<K, V> {
        /* renamed from: a */
        private int f28205a;

        ah(V v, int i) {
            super(v);
            this.f28205a = i;
        }

        /* renamed from: a */
        public final int mo5830a() {
            return this.f28205a;
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$ai */
    static final class ai<K, V> extends ae<K, V> {
        /* renamed from: a */
        private int f28206a;

        ai(ReferenceQueue<V> referenceQueue, V v, C5594p<K, V> c5594p, int i) {
            super(referenceQueue, v, c5594p);
            this.f28206a = i;
        }

        /* renamed from: a */
        public final int mo5830a() {
            return this.f28206a;
        }

        /* renamed from: a */
        public final C5598z<K, V> mo5831a(ReferenceQueue<V> referenceQueue, V v, C5594p<K, V> c5594p) {
            return new ai(referenceQueue, v, c5594p, this.f28206a);
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$l */
    static class C7728l<K, V> extends C6883m<K, V> implements C6849f {
        private static final long serialVersionUID = 1;

        C7728l(C5585c<? super K, ? super V> c5585c, C5587d<? super K, V> c5587d) {
            super();
        }

        /* renamed from: a */
        public final V mo7022a(K k) {
            return m33511b(k);
        }

        final Object writeReplace() {
            return new C8094j(this.a);
        }

        /* renamed from: b */
        private V m33511b(K k) {
            try {
                C5599g c5599g = this.a;
                C5587d c5587d = c5599g.f20678r;
                int a = c5599g.m24427a(C5571j.m24292a((Object) k));
                return c5599g.m24428a(a).m24397a((Object) k, a, c5587d);
            } catch (K k2) {
                throw new C4640k(k2.getCause());
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$n */
    static class C7729n<K, V> extends C6867f<K, V> implements Serializable {
        private static final long serialVersionUID = 1;
        /* renamed from: a */
        final C5587d<? super K, V> f28216a;
        /* renamed from: b */
        private C5597s f28217b;
        /* renamed from: c */
        private C5597s f28218c;
        /* renamed from: d */
        private C5563e<Object> f28219d;
        /* renamed from: e */
        private C5563e<Object> f28220e;
        /* renamed from: f */
        private long f28221f;
        /* renamed from: g */
        private long f28222g;
        /* renamed from: h */
        private long f28223h;
        /* renamed from: i */
        private C5610o<K, V> f28224i;
        /* renamed from: j */
        private int f28225j;
        /* renamed from: k */
        private C5603l<? super K, ? super V> f28226k;
        /* renamed from: l */
        private C5582s f28227l;
        /* renamed from: m */
        private transient C5584b<K, V> f28228m;

        C7729n(C5599g<K, V> c5599g) {
            C5599g<K, V> c5599g2 = c5599g;
            this(c5599g2.f20667g, c5599g2.f20668h, c5599g2.f20665e, c5599g2.f20666f, c5599g2.f20672l, c5599g2.f20671k, c5599g2.f20669i, c5599g2.f20670j, c5599g2.f20664d, c5599g2.f20675o, c5599g2.f20676p, c5599g2.f20678r);
        }

        private C7729n(C5597s c5597s, C5597s c5597s2, C5563e<Object> c5563e, C5563e<Object> c5563e2, long j, long j2, long j3, C5610o<K, V> c5610o, int i, C5603l<? super K, ? super V> c5603l, C5582s c5582s, C5587d<? super K, V> c5587d) {
            this.f28217b = c5597s;
            this.f28218c = c5597s2;
            this.f28219d = c5563e;
            this.f28220e = c5563e2;
            this.f28221f = j;
            this.f28222g = j2;
            this.f28223h = j3;
            this.f28224i = c5610o;
            this.f28225j = i;
            this.f28226k = c5603l;
            if (c5582s == C5582s.m24322b() || c5582s == C5585c.f20582a) {
                c5582s = null;
            }
            this.f28227l = c5582s;
            this.f28216a = c5587d;
        }

        /* renamed from: b */
        final C5585c<K, V> m33514b() {
            C5585c<K, V> a = C5585c.m24329a().m24332a(this.f28217b);
            Object obj = this.f28218c;
            boolean z = true;
            C5571j.m24303b(a.f20593h == null, "Value strength was already set to %s", a.f20593h);
            a.f20593h = (C5597s) C5571j.m24292a(obj);
            obj = r0.f28219d;
            C5571j.m24303b(a.f20597l == null, "key equivalence was already set to %s", a.f20597l);
            a.f20597l = (C5563e) C5571j.m24292a(obj);
            obj = r0.f28220e;
            C5571j.m24303b(a.f20598m == null, "value equivalence was already set to %s", a.f20598m);
            a.f20598m = (C5563e) C5571j.m24292a(obj);
            int i = r0.f28225j;
            C5571j.m24303b(a.f20589d == -1, "concurrency level was already set to %s", Integer.valueOf(a.f20589d));
            C5571j.m24297a(i > 0);
            a.f20589d = i;
            obj = r0.f28226k;
            C5571j.m24301b(a.f20599n == null);
            a.f20599n = (C5603l) C5571j.m24292a(obj);
            a.f20587b = false;
            if (r0.f28221f > 0) {
                long j = r0.f28221f;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                C5571j.m24303b(a.f20594i == -1, "expireAfterWrite was already set to %s ns", Long.valueOf(a.f20594i));
                C5571j.m24299a(j >= 0, "duration cannot be negative: %s %s", Long.valueOf(j), timeUnit);
                a.f20594i = timeUnit.toNanos(j);
            }
            if (r0.f28222g > 0) {
                long j2 = r0.f28222g;
                timeUnit = TimeUnit.NANOSECONDS;
                C5571j.m24303b(a.f20595j == -1, "expireAfterAccess was already set to %s ns", Long.valueOf(a.f20595j));
                C5571j.m24299a(j2 >= 0, "duration cannot be negative: %s %s", Long.valueOf(j2), timeUnit);
                a.f20595j = timeUnit.toNanos(j2);
            }
            long j3;
            if (r0.f28224i != C6866b.INSTANCE) {
                obj = r0.f28224i;
                C5571j.m24301b(a.f20592g == null);
                if (a.f20587b) {
                    C5571j.m24303b(a.f20590e == -1, "weigher can not be combined with maximum size", Long.valueOf(a.f20590e));
                }
                a.f20592g = (C5610o) C5571j.m24292a(obj);
                if (r0.f28223h != -1) {
                    j3 = r0.f28223h;
                    C5571j.m24303b(a.f20591f == -1, "maximum weight was already set to %s", Long.valueOf(a.f20591f));
                    C5571j.m24303b(a.f20590e == -1, "maximum size was already set to %s", Long.valueOf(a.f20590e));
                    a.f20591f = j3;
                    C5571j.m24298a(j3 >= 0, (Object) "maximum weight must not be negative");
                }
            } else if (r0.f28223h != -1) {
                j3 = r0.f28223h;
                C5571j.m24303b(a.f20590e == -1, "maximum size was already set to %s", Long.valueOf(a.f20590e));
                C5571j.m24303b(a.f20591f == -1, "maximum weight was already set to %s", Long.valueOf(a.f20591f));
                C5571j.m24302b(a.f20592g == null, (Object) "maximum size can not be combined with weigher");
                C5571j.m24298a(j3 >= 0, (Object) "maximum size must not be negative");
                a.f20590e = j3;
            }
            if (r0.f28227l != null) {
                obj = r0.f28227l;
                if (a.f20600o != null) {
                    z = false;
                }
                C5571j.m24301b(z);
                a.f20600o = (C5582s) C5571j.m24292a(obj);
            }
            return a;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            this.f28228m = m33514b().m24336e();
        }

        private Object readResolve() {
            return this.f28228m;
        }

        /* renamed from: a */
        protected final C5584b<K, V> mo7258a() {
            return this.f28228m;
        }

        /* renamed from: c */
        protected final /* synthetic */ Object mo4837c() {
            return this.f28228m;
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$v */
    static class C7730v<K, V> extends C6869b<K, V> {
        /* renamed from: a */
        private K f28229a;
        /* renamed from: b */
        private int f28230b;
        /* renamed from: c */
        private C5594p<K, V> f28231c;
        /* renamed from: d */
        private volatile C5598z<K, V> f28232d = C5599g.m24424j();

        C7730v(K k, int i, C5594p<K, V> c5594p) {
            this.f28229a = k;
            this.f28230b = i;
            this.f28231c = c5594p;
        }

        /* renamed from: d */
        public final K mo5847d() {
            return this.f28229a;
        }

        /* renamed from: a */
        public final C5598z<K, V> mo5838a() {
            return this.f28232d;
        }

        /* renamed from: a */
        public final void mo5841a(C5598z<K, V> c5598z) {
            this.f28232d = c5598z;
        }

        /* renamed from: c */
        public final int mo5845c() {
            return this.f28230b;
        }

        /* renamed from: b */
        public final C5594p<K, V> mo5842b() {
            return this.f28231c;
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$j */
    static final class C8094j<K, V> extends C7729n<K, V> implements C6849f, Serializable {
        private static final long serialVersionUID = 1;
        /* renamed from: b */
        private transient C6849f f29048b;

        C8094j(C5599g<K, V> c5599g) {
            super(c5599g);
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            this.f29048b = m33514b().m24331a(this.a);
        }

        /* renamed from: a */
        public final V mo7022a(K k) {
            return this.f29048b.mo7022a(k);
        }

        private Object readResolve() {
            return this.f29048b;
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$t */
    static final class C8095t<K, V> extends C7730v<K, V> {
        /* renamed from: a */
        private volatile long f29049a = -1;
        /* renamed from: b */
        private C5594p<K, V> f29050b = C5599g.m24425k();
        /* renamed from: c */
        private C5594p<K, V> f29051c = C5599g.m24425k();

        C8095t(K k, int i, C5594p<K, V> c5594p) {
            super(k, i, c5594p);
        }

        /* renamed from: e */
        public final long mo5849e() {
            return this.f29049a;
        }

        /* renamed from: a */
        public final void mo5839a(long j) {
            this.f29049a = j;
        }

        /* renamed from: f */
        public final C5594p<K, V> mo5850f() {
            return this.f29050b;
        }

        /* renamed from: a */
        public final void mo5840a(C5594p<K, V> c5594p) {
            this.f29050b = c5594p;
        }

        /* renamed from: g */
        public final C5594p<K, V> mo5851g() {
            return this.f29051c;
        }

        /* renamed from: b */
        public final void mo5844b(C5594p<K, V> c5594p) {
            this.f29051c = c5594p;
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$u */
    static final class C8096u<K, V> extends C7730v<K, V> {
        /* renamed from: a */
        private volatile long f29052a = Format.OFFSET_SAMPLE_RELATIVE;
        /* renamed from: b */
        private C5594p<K, V> f29053b = C5599g.m24425k();
        /* renamed from: c */
        private C5594p<K, V> f29054c = C5599g.m24425k();
        /* renamed from: d */
        private volatile long f29055d = Format.OFFSET_SAMPLE_RELATIVE;
        /* renamed from: e */
        private C5594p<K, V> f29056e = C5599g.m24425k();
        /* renamed from: f */
        private C5594p<K, V> f29057f = C5599g.m24425k();

        C8096u(K k, int i, C5594p<K, V> c5594p) {
            super(k, i, c5594p);
        }

        /* renamed from: e */
        public final long mo5849e() {
            return this.f29052a;
        }

        /* renamed from: a */
        public final void mo5839a(long j) {
            this.f29052a = j;
        }

        /* renamed from: f */
        public final C5594p<K, V> mo5850f() {
            return this.f29053b;
        }

        /* renamed from: a */
        public final void mo5840a(C5594p<K, V> c5594p) {
            this.f29053b = c5594p;
        }

        /* renamed from: g */
        public final C5594p<K, V> mo5851g() {
            return this.f29054c;
        }

        /* renamed from: b */
        public final void mo5844b(C5594p<K, V> c5594p) {
            this.f29054c = c5594p;
        }

        /* renamed from: h */
        public final long mo5852h() {
            return this.f29055d;
        }

        /* renamed from: b */
        public final void mo5843b(long j) {
            this.f29055d = j;
        }

        /* renamed from: i */
        public final C5594p<K, V> mo5853i() {
            return this.f29056e;
        }

        /* renamed from: c */
        public final void mo5846c(C5594p<K, V> c5594p) {
            this.f29056e = c5594p;
        }

        /* renamed from: j */
        public final C5594p<K, V> mo5854j() {
            return this.f29057f;
        }

        /* renamed from: d */
        public final void mo5848d(C5594p<K, V> c5594p) {
            this.f29057f = c5594p;
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.g$x */
    static final class C8097x<K, V> extends C7730v<K, V> {
        /* renamed from: a */
        private volatile long f29058a = -1;
        /* renamed from: b */
        private C5594p<K, V> f29059b = C5599g.m24425k();
        /* renamed from: c */
        private C5594p<K, V> f29060c = C5599g.m24425k();

        C8097x(K k, int i, C5594p<K, V> c5594p) {
            super(k, i, c5594p);
        }

        /* renamed from: h */
        public final long mo5852h() {
            return this.f29058a;
        }

        /* renamed from: b */
        public final void mo5843b(long j) {
            this.f29058a = j;
        }

        /* renamed from: i */
        public final C5594p<K, V> mo5853i() {
            return this.f29059b;
        }

        /* renamed from: c */
        public final void mo5846c(C5594p<K, V> c5594p) {
            this.f29059b = c5594p;
        }

        /* renamed from: j */
        public final C5594p<K, V> mo5854j() {
            return this.f29060c;
        }

        /* renamed from: d */
        public final void mo5848d(C5594p<K, V> c5594p) {
            this.f29060c = c5594p;
        }
    }

    C5599g(C5585c<? super K, ? super V> c5585c, C5587d<? super K, V> c5587d) {
        long j;
        Queue queue;
        int i;
        int i2;
        Object obj;
        C5582s c5582s;
        C5597s c5597s;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        long j2;
        long j3;
        this.f20664d = Math.min(c5585c.f20589d == -1 ? 4 : c5585c.f20589d, 65536);
        this.f20667g = c5585c.m24334c();
        this.f20668h = c5585c.m24335d();
        this.f20665e = (C5563e) C5569h.m24285b(c5585c.f20597l, c5585c.m24334c().mo5857a());
        this.f20666f = (C5563e) C5569h.m24285b(c5585c.f20598m, c5585c.m24335d().mo5857a());
        long j4 = 0;
        if (c5585c.f20594i != 0) {
            if (c5585c.f20595j != 0) {
                j = c5585c.f20592g == null ? c5585c.f20590e : c5585c.f20591f;
                this.f20669i = j;
                this.f20670j = (C5610o) C5569h.m24285b(c5585c.f20592g, C6866b.INSTANCE);
                this.f20671k = c5585c.f20595j != -1 ? 0 : c5585c.f20595j;
                this.f20672l = c5585c.f20594i != -1 ? 0 : c5585c.f20594i;
                if (c5585c.f20596k == -1) {
                    j4 = c5585c.f20596k;
                }
                this.f20673m = j4;
                this.f20675o = (C5603l) C5569h.m24285b(c5585c.f20599n, C6865a.INSTANCE);
                if (this.f20675o != C6865a.INSTANCE) {
                    queue = f20662t;
                } else {
                    queue = new ConcurrentLinkedQueue();
                }
                this.f20674n = queue;
                i = 0;
                i2 = 1;
                if (!m24436g()) {
                    if (m24433d()) {
                        obj = null;
                        if (c5585c.f20600o == null) {
                            c5582s = c5585c.f20600o;
                        } else if (obj == null) {
                            c5582s = C5582s.m24322b();
                        } else {
                            c5582s = C5585c.f20582a;
                        }
                        this.f20676p = c5582s;
                        c5597s = this.f20667g;
                        if (!m24435f()) {
                            if (!m24433d()) {
                                z = false;
                                if (!m24432c()) {
                                    if (!m24436g()) {
                                        z2 = false;
                                        this.f20677q = C5592d.m24340a(c5597s, z, z2);
                                        this.f20681w = (C5583b) c5585c.f20601p.mo5823a();
                                        this.f20678r = c5587d;
                                        c5587d = Math.min(c5585c.f20588c != -1 ? 16 : c5585c.f20588c, 1073741824);
                                        if (m24429a() && !m24431b()) {
                                            c5587d = Math.min(c5587d, (int) this.f20669i);
                                        }
                                        i3 = 1;
                                        i4 = 0;
                                        while (i3 < this.f20664d && (!m24429a() || ((long) (i3 * 20)) <= this.f20669i)) {
                                            i4++;
                                            i3 <<= 1;
                                        }
                                        this.f20680v = 32 - i4;
                                        this.f20679u = i3 - 1;
                                        this.f20663c = new C5596q[i3];
                                        i4 = c5587d / i3;
                                        if (i4 * i3 < c5587d) {
                                            i4++;
                                        }
                                        while (i2 < i4) {
                                            i2 <<= 1;
                                        }
                                        if (m24429a() == null) {
                                            j2 = (long) i3;
                                            j3 = (this.f20669i / j2) + 1;
                                            j4 = this.f20669i % j2;
                                            while (i < this.f20663c.length) {
                                                if (((long) i) != j4) {
                                                    j3--;
                                                }
                                                this.f20663c[i] = m24419a(i2, j3, (C5583b) c5585c.f20601p.mo5823a());
                                                i++;
                                            }
                                        }
                                        while (i < this.f20663c.length) {
                                            this.f20663c[i] = m24419a(i2, -1, (C5583b) c5585c.f20601p.mo5823a());
                                            i++;
                                        }
                                        return;
                                    }
                                }
                                z2 = true;
                                this.f20677q = C5592d.m24340a(c5597s, z, z2);
                                this.f20681w = (C5583b) c5585c.f20601p.mo5823a();
                                this.f20678r = c5587d;
                                if (c5585c.f20588c != -1) {
                                }
                                c5587d = Math.min(c5585c.f20588c != -1 ? 16 : c5585c.f20588c, 1073741824);
                                c5587d = Math.min(c5587d, (int) this.f20669i);
                                i3 = 1;
                                i4 = 0;
                                while (i3 < this.f20664d) {
                                    i4++;
                                    i3 <<= 1;
                                }
                                this.f20680v = 32 - i4;
                                this.f20679u = i3 - 1;
                                this.f20663c = new C5596q[i3];
                                i4 = c5587d / i3;
                                if (i4 * i3 < c5587d) {
                                    i4++;
                                }
                                while (i2 < i4) {
                                    i2 <<= 1;
                                }
                                if (m24429a() == null) {
                                    while (i < this.f20663c.length) {
                                        this.f20663c[i] = m24419a(i2, -1, (C5583b) c5585c.f20601p.mo5823a());
                                        i++;
                                    }
                                    return;
                                }
                                j2 = (long) i3;
                                j3 = (this.f20669i / j2) + 1;
                                j4 = this.f20669i % j2;
                                while (i < this.f20663c.length) {
                                    if (((long) i) != j4) {
                                        j3--;
                                    }
                                    this.f20663c[i] = m24419a(i2, j3, (C5583b) c5585c.f20601p.mo5823a());
                                    i++;
                                }
                            }
                        }
                        z = true;
                        if (m24432c()) {
                            if (!m24436g()) {
                                z2 = false;
                                this.f20677q = C5592d.m24340a(c5597s, z, z2);
                                this.f20681w = (C5583b) c5585c.f20601p.mo5823a();
                                this.f20678r = c5587d;
                                if (c5585c.f20588c != -1) {
                                }
                                c5587d = Math.min(c5585c.f20588c != -1 ? 16 : c5585c.f20588c, 1073741824);
                                c5587d = Math.min(c5587d, (int) this.f20669i);
                                i3 = 1;
                                i4 = 0;
                                while (i3 < this.f20664d) {
                                    i4++;
                                    i3 <<= 1;
                                }
                                this.f20680v = 32 - i4;
                                this.f20679u = i3 - 1;
                                this.f20663c = new C5596q[i3];
                                i4 = c5587d / i3;
                                if (i4 * i3 < c5587d) {
                                    i4++;
                                }
                                while (i2 < i4) {
                                    i2 <<= 1;
                                }
                                if (m24429a() == null) {
                                    j2 = (long) i3;
                                    j3 = (this.f20669i / j2) + 1;
                                    j4 = this.f20669i % j2;
                                    while (i < this.f20663c.length) {
                                        if (((long) i) != j4) {
                                            j3--;
                                        }
                                        this.f20663c[i] = m24419a(i2, j3, (C5583b) c5585c.f20601p.mo5823a());
                                        i++;
                                    }
                                }
                                while (i < this.f20663c.length) {
                                    this.f20663c[i] = m24419a(i2, -1, (C5583b) c5585c.f20601p.mo5823a());
                                    i++;
                                }
                                return;
                            }
                        }
                        z2 = true;
                        this.f20677q = C5592d.m24340a(c5597s, z, z2);
                        this.f20681w = (C5583b) c5585c.f20601p.mo5823a();
                        this.f20678r = c5587d;
                        if (c5585c.f20588c != -1) {
                        }
                        c5587d = Math.min(c5585c.f20588c != -1 ? 16 : c5585c.f20588c, 1073741824);
                        c5587d = Math.min(c5587d, (int) this.f20669i);
                        i3 = 1;
                        i4 = 0;
                        while (i3 < this.f20664d) {
                            i4++;
                            i3 <<= 1;
                        }
                        this.f20680v = 32 - i4;
                        this.f20679u = i3 - 1;
                        this.f20663c = new C5596q[i3];
                        i4 = c5587d / i3;
                        if (i4 * i3 < c5587d) {
                            i4++;
                        }
                        while (i2 < i4) {
                            i2 <<= 1;
                        }
                        if (m24429a() == null) {
                            while (i < this.f20663c.length) {
                                this.f20663c[i] = m24419a(i2, -1, (C5583b) c5585c.f20601p.mo5823a());
                                i++;
                            }
                            return;
                        }
                        j2 = (long) i3;
                        j3 = (this.f20669i / j2) + 1;
                        j4 = this.f20669i % j2;
                        while (i < this.f20663c.length) {
                            if (((long) i) != j4) {
                                j3--;
                            }
                            this.f20663c[i] = m24419a(i2, j3, (C5583b) c5585c.f20601p.mo5823a());
                            i++;
                        }
                    }
                }
                obj = 1;
                if (c5585c.f20600o == null) {
                    c5582s = c5585c.f20600o;
                } else if (obj == null) {
                    c5582s = C5585c.f20582a;
                } else {
                    c5582s = C5582s.m24322b();
                }
                this.f20676p = c5582s;
                c5597s = this.f20667g;
                if (m24435f()) {
                    if (!m24433d()) {
                        z = false;
                        if (m24432c()) {
                            if (!m24436g()) {
                                z2 = false;
                                this.f20677q = C5592d.m24340a(c5597s, z, z2);
                                this.f20681w = (C5583b) c5585c.f20601p.mo5823a();
                                this.f20678r = c5587d;
                                if (c5585c.f20588c != -1) {
                                }
                                c5587d = Math.min(c5585c.f20588c != -1 ? 16 : c5585c.f20588c, 1073741824);
                                c5587d = Math.min(c5587d, (int) this.f20669i);
                                i3 = 1;
                                i4 = 0;
                                while (i3 < this.f20664d) {
                                    i4++;
                                    i3 <<= 1;
                                }
                                this.f20680v = 32 - i4;
                                this.f20679u = i3 - 1;
                                this.f20663c = new C5596q[i3];
                                i4 = c5587d / i3;
                                if (i4 * i3 < c5587d) {
                                    i4++;
                                }
                                while (i2 < i4) {
                                    i2 <<= 1;
                                }
                                if (m24429a() == null) {
                                    j2 = (long) i3;
                                    j3 = (this.f20669i / j2) + 1;
                                    j4 = this.f20669i % j2;
                                    while (i < this.f20663c.length) {
                                        if (((long) i) != j4) {
                                            j3--;
                                        }
                                        this.f20663c[i] = m24419a(i2, j3, (C5583b) c5585c.f20601p.mo5823a());
                                        i++;
                                    }
                                }
                                while (i < this.f20663c.length) {
                                    this.f20663c[i] = m24419a(i2, -1, (C5583b) c5585c.f20601p.mo5823a());
                                    i++;
                                }
                                return;
                            }
                        }
                        z2 = true;
                        this.f20677q = C5592d.m24340a(c5597s, z, z2);
                        this.f20681w = (C5583b) c5585c.f20601p.mo5823a();
                        this.f20678r = c5587d;
                        if (c5585c.f20588c != -1) {
                        }
                        c5587d = Math.min(c5585c.f20588c != -1 ? 16 : c5585c.f20588c, 1073741824);
                        c5587d = Math.min(c5587d, (int) this.f20669i);
                        i3 = 1;
                        i4 = 0;
                        while (i3 < this.f20664d) {
                            i4++;
                            i3 <<= 1;
                        }
                        this.f20680v = 32 - i4;
                        this.f20679u = i3 - 1;
                        this.f20663c = new C5596q[i3];
                        i4 = c5587d / i3;
                        if (i4 * i3 < c5587d) {
                            i4++;
                        }
                        while (i2 < i4) {
                            i2 <<= 1;
                        }
                        if (m24429a() == null) {
                            while (i < this.f20663c.length) {
                                this.f20663c[i] = m24419a(i2, -1, (C5583b) c5585c.f20601p.mo5823a());
                                i++;
                            }
                            return;
                        }
                        j2 = (long) i3;
                        j3 = (this.f20669i / j2) + 1;
                        j4 = this.f20669i % j2;
                        while (i < this.f20663c.length) {
                            if (((long) i) != j4) {
                                j3--;
                            }
                            this.f20663c[i] = m24419a(i2, j3, (C5583b) c5585c.f20601p.mo5823a());
                            i++;
                        }
                    }
                }
                z = true;
                if (m24432c()) {
                    if (!m24436g()) {
                        z2 = false;
                        this.f20677q = C5592d.m24340a(c5597s, z, z2);
                        this.f20681w = (C5583b) c5585c.f20601p.mo5823a();
                        this.f20678r = c5587d;
                        if (c5585c.f20588c != -1) {
                        }
                        c5587d = Math.min(c5585c.f20588c != -1 ? 16 : c5585c.f20588c, 1073741824);
                        c5587d = Math.min(c5587d, (int) this.f20669i);
                        i3 = 1;
                        i4 = 0;
                        while (i3 < this.f20664d) {
                            i4++;
                            i3 <<= 1;
                        }
                        this.f20680v = 32 - i4;
                        this.f20679u = i3 - 1;
                        this.f20663c = new C5596q[i3];
                        i4 = c5587d / i3;
                        if (i4 * i3 < c5587d) {
                            i4++;
                        }
                        while (i2 < i4) {
                            i2 <<= 1;
                        }
                        if (m24429a() == null) {
                            j2 = (long) i3;
                            j3 = (this.f20669i / j2) + 1;
                            j4 = this.f20669i % j2;
                            while (i < this.f20663c.length) {
                                if (((long) i) != j4) {
                                    j3--;
                                }
                                this.f20663c[i] = m24419a(i2, j3, (C5583b) c5585c.f20601p.mo5823a());
                                i++;
                            }
                        }
                        while (i < this.f20663c.length) {
                            this.f20663c[i] = m24419a(i2, -1, (C5583b) c5585c.f20601p.mo5823a());
                            i++;
                        }
                        return;
                    }
                }
                z2 = true;
                this.f20677q = C5592d.m24340a(c5597s, z, z2);
                this.f20681w = (C5583b) c5585c.f20601p.mo5823a();
                this.f20678r = c5587d;
                if (c5585c.f20588c != -1) {
                }
                c5587d = Math.min(c5585c.f20588c != -1 ? 16 : c5585c.f20588c, 1073741824);
                c5587d = Math.min(c5587d, (int) this.f20669i);
                i3 = 1;
                i4 = 0;
                while (i3 < this.f20664d) {
                    i4++;
                    i3 <<= 1;
                }
                this.f20680v = 32 - i4;
                this.f20679u = i3 - 1;
                this.f20663c = new C5596q[i3];
                i4 = c5587d / i3;
                if (i4 * i3 < c5587d) {
                    i4++;
                }
                while (i2 < i4) {
                    i2 <<= 1;
                }
                if (m24429a() == null) {
                    while (i < this.f20663c.length) {
                        this.f20663c[i] = m24419a(i2, -1, (C5583b) c5585c.f20601p.mo5823a());
                        i++;
                    }
                    return;
                }
                j2 = (long) i3;
                j3 = (this.f20669i / j2) + 1;
                j4 = this.f20669i % j2;
                while (i < this.f20663c.length) {
                    if (((long) i) != j4) {
                        j3--;
                    }
                    this.f20663c[i] = m24419a(i2, j3, (C5583b) c5585c.f20601p.mo5823a());
                    i++;
                }
            }
        }
        j = 0;
        this.f20669i = j;
        this.f20670j = (C5610o) C5569h.m24285b(c5585c.f20592g, C6866b.INSTANCE);
        if (c5585c.f20595j != -1) {
        }
        this.f20671k = c5585c.f20595j != -1 ? 0 : c5585c.f20595j;
        if (c5585c.f20594i != -1) {
        }
        this.f20672l = c5585c.f20594i != -1 ? 0 : c5585c.f20594i;
        if (c5585c.f20596k == -1) {
            j4 = c5585c.f20596k;
        }
        this.f20673m = j4;
        this.f20675o = (C5603l) C5569h.m24285b(c5585c.f20599n, C6865a.INSTANCE);
        if (this.f20675o != C6865a.INSTANCE) {
            queue = new ConcurrentLinkedQueue();
        } else {
            queue = f20662t;
        }
        this.f20674n = queue;
        i = 0;
        i2 = 1;
        if (m24436g()) {
            if (m24433d()) {
                obj = null;
                if (c5585c.f20600o == null) {
                    c5582s = c5585c.f20600o;
                } else if (obj == null) {
                    c5582s = C5582s.m24322b();
                } else {
                    c5582s = C5585c.f20582a;
                }
                this.f20676p = c5582s;
                c5597s = this.f20667g;
                if (m24435f()) {
                    if (!m24433d()) {
                        z = false;
                        if (m24432c()) {
                            if (!m24436g()) {
                                z2 = false;
                                this.f20677q = C5592d.m24340a(c5597s, z, z2);
                                this.f20681w = (C5583b) c5585c.f20601p.mo5823a();
                                this.f20678r = c5587d;
                                if (c5585c.f20588c != -1) {
                                }
                                c5587d = Math.min(c5585c.f20588c != -1 ? 16 : c5585c.f20588c, 1073741824);
                                c5587d = Math.min(c5587d, (int) this.f20669i);
                                i3 = 1;
                                i4 = 0;
                                while (i3 < this.f20664d) {
                                    i4++;
                                    i3 <<= 1;
                                }
                                this.f20680v = 32 - i4;
                                this.f20679u = i3 - 1;
                                this.f20663c = new C5596q[i3];
                                i4 = c5587d / i3;
                                if (i4 * i3 < c5587d) {
                                    i4++;
                                }
                                while (i2 < i4) {
                                    i2 <<= 1;
                                }
                                if (m24429a() == null) {
                                    j2 = (long) i3;
                                    j3 = (this.f20669i / j2) + 1;
                                    j4 = this.f20669i % j2;
                                    while (i < this.f20663c.length) {
                                        if (((long) i) != j4) {
                                            j3--;
                                        }
                                        this.f20663c[i] = m24419a(i2, j3, (C5583b) c5585c.f20601p.mo5823a());
                                        i++;
                                    }
                                }
                                while (i < this.f20663c.length) {
                                    this.f20663c[i] = m24419a(i2, -1, (C5583b) c5585c.f20601p.mo5823a());
                                    i++;
                                }
                                return;
                            }
                        }
                        z2 = true;
                        this.f20677q = C5592d.m24340a(c5597s, z, z2);
                        this.f20681w = (C5583b) c5585c.f20601p.mo5823a();
                        this.f20678r = c5587d;
                        if (c5585c.f20588c != -1) {
                        }
                        c5587d = Math.min(c5585c.f20588c != -1 ? 16 : c5585c.f20588c, 1073741824);
                        c5587d = Math.min(c5587d, (int) this.f20669i);
                        i3 = 1;
                        i4 = 0;
                        while (i3 < this.f20664d) {
                            i4++;
                            i3 <<= 1;
                        }
                        this.f20680v = 32 - i4;
                        this.f20679u = i3 - 1;
                        this.f20663c = new C5596q[i3];
                        i4 = c5587d / i3;
                        if (i4 * i3 < c5587d) {
                            i4++;
                        }
                        while (i2 < i4) {
                            i2 <<= 1;
                        }
                        if (m24429a() == null) {
                            while (i < this.f20663c.length) {
                                this.f20663c[i] = m24419a(i2, -1, (C5583b) c5585c.f20601p.mo5823a());
                                i++;
                            }
                            return;
                        }
                        j2 = (long) i3;
                        j3 = (this.f20669i / j2) + 1;
                        j4 = this.f20669i % j2;
                        while (i < this.f20663c.length) {
                            if (((long) i) != j4) {
                                j3--;
                            }
                            this.f20663c[i] = m24419a(i2, j3, (C5583b) c5585c.f20601p.mo5823a());
                            i++;
                        }
                    }
                }
                z = true;
                if (m24432c()) {
                    if (!m24436g()) {
                        z2 = false;
                        this.f20677q = C5592d.m24340a(c5597s, z, z2);
                        this.f20681w = (C5583b) c5585c.f20601p.mo5823a();
                        this.f20678r = c5587d;
                        if (c5585c.f20588c != -1) {
                        }
                        c5587d = Math.min(c5585c.f20588c != -1 ? 16 : c5585c.f20588c, 1073741824);
                        c5587d = Math.min(c5587d, (int) this.f20669i);
                        i3 = 1;
                        i4 = 0;
                        while (i3 < this.f20664d) {
                            i4++;
                            i3 <<= 1;
                        }
                        this.f20680v = 32 - i4;
                        this.f20679u = i3 - 1;
                        this.f20663c = new C5596q[i3];
                        i4 = c5587d / i3;
                        if (i4 * i3 < c5587d) {
                            i4++;
                        }
                        while (i2 < i4) {
                            i2 <<= 1;
                        }
                        if (m24429a() == null) {
                            j2 = (long) i3;
                            j3 = (this.f20669i / j2) + 1;
                            j4 = this.f20669i % j2;
                            while (i < this.f20663c.length) {
                                if (((long) i) != j4) {
                                    j3--;
                                }
                                this.f20663c[i] = m24419a(i2, j3, (C5583b) c5585c.f20601p.mo5823a());
                                i++;
                            }
                        }
                        while (i < this.f20663c.length) {
                            this.f20663c[i] = m24419a(i2, -1, (C5583b) c5585c.f20601p.mo5823a());
                            i++;
                        }
                        return;
                    }
                }
                z2 = true;
                this.f20677q = C5592d.m24340a(c5597s, z, z2);
                this.f20681w = (C5583b) c5585c.f20601p.mo5823a();
                this.f20678r = c5587d;
                if (c5585c.f20588c != -1) {
                }
                c5587d = Math.min(c5585c.f20588c != -1 ? 16 : c5585c.f20588c, 1073741824);
                c5587d = Math.min(c5587d, (int) this.f20669i);
                i3 = 1;
                i4 = 0;
                while (i3 < this.f20664d) {
                    i4++;
                    i3 <<= 1;
                }
                this.f20680v = 32 - i4;
                this.f20679u = i3 - 1;
                this.f20663c = new C5596q[i3];
                i4 = c5587d / i3;
                if (i4 * i3 < c5587d) {
                    i4++;
                }
                while (i2 < i4) {
                    i2 <<= 1;
                }
                if (m24429a() == null) {
                    while (i < this.f20663c.length) {
                        this.f20663c[i] = m24419a(i2, -1, (C5583b) c5585c.f20601p.mo5823a());
                        i++;
                    }
                    return;
                }
                j2 = (long) i3;
                j3 = (this.f20669i / j2) + 1;
                j4 = this.f20669i % j2;
                while (i < this.f20663c.length) {
                    if (((long) i) != j4) {
                        j3--;
                    }
                    this.f20663c[i] = m24419a(i2, j3, (C5583b) c5585c.f20601p.mo5823a());
                    i++;
                }
            }
        }
        obj = 1;
        if (c5585c.f20600o == null) {
            c5582s = c5585c.f20600o;
        } else if (obj == null) {
            c5582s = C5585c.f20582a;
        } else {
            c5582s = C5582s.m24322b();
        }
        this.f20676p = c5582s;
        c5597s = this.f20667g;
        if (m24435f()) {
            if (!m24433d()) {
                z = false;
                if (m24432c()) {
                    if (!m24436g()) {
                        z2 = false;
                        this.f20677q = C5592d.m24340a(c5597s, z, z2);
                        this.f20681w = (C5583b) c5585c.f20601p.mo5823a();
                        this.f20678r = c5587d;
                        if (c5585c.f20588c != -1) {
                        }
                        c5587d = Math.min(c5585c.f20588c != -1 ? 16 : c5585c.f20588c, 1073741824);
                        c5587d = Math.min(c5587d, (int) this.f20669i);
                        i3 = 1;
                        i4 = 0;
                        while (i3 < this.f20664d) {
                            i4++;
                            i3 <<= 1;
                        }
                        this.f20680v = 32 - i4;
                        this.f20679u = i3 - 1;
                        this.f20663c = new C5596q[i3];
                        i4 = c5587d / i3;
                        if (i4 * i3 < c5587d) {
                            i4++;
                        }
                        while (i2 < i4) {
                            i2 <<= 1;
                        }
                        if (m24429a() == null) {
                            j2 = (long) i3;
                            j3 = (this.f20669i / j2) + 1;
                            j4 = this.f20669i % j2;
                            while (i < this.f20663c.length) {
                                if (((long) i) != j4) {
                                    j3--;
                                }
                                this.f20663c[i] = m24419a(i2, j3, (C5583b) c5585c.f20601p.mo5823a());
                                i++;
                            }
                        }
                        while (i < this.f20663c.length) {
                            this.f20663c[i] = m24419a(i2, -1, (C5583b) c5585c.f20601p.mo5823a());
                            i++;
                        }
                        return;
                    }
                }
                z2 = true;
                this.f20677q = C5592d.m24340a(c5597s, z, z2);
                this.f20681w = (C5583b) c5585c.f20601p.mo5823a();
                this.f20678r = c5587d;
                if (c5585c.f20588c != -1) {
                }
                c5587d = Math.min(c5585c.f20588c != -1 ? 16 : c5585c.f20588c, 1073741824);
                c5587d = Math.min(c5587d, (int) this.f20669i);
                i3 = 1;
                i4 = 0;
                while (i3 < this.f20664d) {
                    i4++;
                    i3 <<= 1;
                }
                this.f20680v = 32 - i4;
                this.f20679u = i3 - 1;
                this.f20663c = new C5596q[i3];
                i4 = c5587d / i3;
                if (i4 * i3 < c5587d) {
                    i4++;
                }
                while (i2 < i4) {
                    i2 <<= 1;
                }
                if (m24429a() == null) {
                    while (i < this.f20663c.length) {
                        this.f20663c[i] = m24419a(i2, -1, (C5583b) c5585c.f20601p.mo5823a());
                        i++;
                    }
                    return;
                }
                j2 = (long) i3;
                j3 = (this.f20669i / j2) + 1;
                j4 = this.f20669i % j2;
                while (i < this.f20663c.length) {
                    if (((long) i) != j4) {
                        j3--;
                    }
                    this.f20663c[i] = m24419a(i2, j3, (C5583b) c5585c.f20601p.mo5823a());
                    i++;
                }
            }
        }
        z = true;
        if (m24432c()) {
            if (!m24436g()) {
                z2 = false;
                this.f20677q = C5592d.m24340a(c5597s, z, z2);
                this.f20681w = (C5583b) c5585c.f20601p.mo5823a();
                this.f20678r = c5587d;
                if (c5585c.f20588c != -1) {
                }
                c5587d = Math.min(c5585c.f20588c != -1 ? 16 : c5585c.f20588c, 1073741824);
                c5587d = Math.min(c5587d, (int) this.f20669i);
                i3 = 1;
                i4 = 0;
                while (i3 < this.f20664d) {
                    i4++;
                    i3 <<= 1;
                }
                this.f20680v = 32 - i4;
                this.f20679u = i3 - 1;
                this.f20663c = new C5596q[i3];
                i4 = c5587d / i3;
                if (i4 * i3 < c5587d) {
                    i4++;
                }
                while (i2 < i4) {
                    i2 <<= 1;
                }
                if (m24429a() == null) {
                    j2 = (long) i3;
                    j3 = (this.f20669i / j2) + 1;
                    j4 = this.f20669i % j2;
                    while (i < this.f20663c.length) {
                        if (((long) i) != j4) {
                            j3--;
                        }
                        this.f20663c[i] = m24419a(i2, j3, (C5583b) c5585c.f20601p.mo5823a());
                        i++;
                    }
                }
                while (i < this.f20663c.length) {
                    this.f20663c[i] = m24419a(i2, -1, (C5583b) c5585c.f20601p.mo5823a());
                    i++;
                }
                return;
            }
        }
        z2 = true;
        this.f20677q = C5592d.m24340a(c5597s, z, z2);
        this.f20681w = (C5583b) c5585c.f20601p.mo5823a();
        this.f20678r = c5587d;
        if (c5585c.f20588c != -1) {
        }
        c5587d = Math.min(c5585c.f20588c != -1 ? 16 : c5585c.f20588c, 1073741824);
        c5587d = Math.min(c5587d, (int) this.f20669i);
        i3 = 1;
        i4 = 0;
        while (i3 < this.f20664d) {
            i4++;
            i3 <<= 1;
        }
        this.f20680v = 32 - i4;
        this.f20679u = i3 - 1;
        this.f20663c = new C5596q[i3];
        i4 = c5587d / i3;
        if (i4 * i3 < c5587d) {
            i4++;
        }
        while (i2 < i4) {
            i2 <<= 1;
        }
        if (m24429a() == null) {
            while (i < this.f20663c.length) {
                this.f20663c[i] = m24419a(i2, -1, (C5583b) c5585c.f20601p.mo5823a());
                i++;
            }
            return;
        }
        j2 = (long) i3;
        j3 = (this.f20669i / j2) + 1;
        j4 = this.f20669i % j2;
        while (i < this.f20663c.length) {
            if (((long) i) != j4) {
                j3--;
            }
            this.f20663c[i] = m24419a(i2, j3, (C5583b) c5585c.f20601p.mo5823a());
            i++;
        }
    }

    /* renamed from: a */
    final boolean m24429a() {
        return this.f20669i >= 0;
    }

    /* renamed from: b */
    final boolean m24431b() {
        return this.f20670j != C6866b.INSTANCE;
    }

    /* renamed from: c */
    final boolean m24432c() {
        return this.f20672l > 0;
    }

    /* renamed from: d */
    final boolean m24433d() {
        return this.f20671k > 0;
    }

    /* renamed from: e */
    final boolean m24434e() {
        return this.f20673m > 0;
    }

    /* renamed from: f */
    final boolean m24435f() {
        if (!m24433d()) {
            if (!m24429a()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    final boolean m24436g() {
        if (!m24432c()) {
            if (!m24434e()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    final boolean m24437h() {
        return this.f20667g != C5597s.STRONG;
    }

    /* renamed from: i */
    final boolean m24438i() {
        return this.f20668h != C5597s.STRONG;
    }

    /* renamed from: j */
    static <K, V> C5598z<K, V> m24424j() {
        return f20661s;
    }

    /* renamed from: k */
    static <K, V> C5594p<K, V> m24425k() {
        return C6884o.INSTANCE;
    }

    /* renamed from: l */
    static <E> Queue<E> m24426l() {
        return f20662t;
    }

    /* renamed from: a */
    final int m24427a(Object obj) {
        obj = this.f20665e.m24260a(obj);
        obj += (obj << 15) ^ -12931;
        obj ^= obj >>> 10;
        obj += obj << 3;
        obj ^= obj >>> 6;
        obj += (obj << 2) + (obj << 14);
        return obj ^ (obj >>> 16);
    }

    /* renamed from: a */
    final C5596q<K, V> m24428a(int i) {
        return this.f20663c[(i >>> this.f20680v) & this.f20679u];
    }

    /* renamed from: a */
    private C5596q<K, V> m24419a(int i, long j, C5583b c5583b) {
        return new C5596q(this, i, j, c5583b);
    }

    /* renamed from: a */
    final boolean m24430a(C5594p<K, V> c5594p, long j) {
        C5571j.m24292a((Object) c5594p);
        if (m24433d() && j - c5594p.mo5849e() >= this.f20671k) {
            return true;
        }
        if (!m24432c() || j - c5594p.mo5852h() < this.f20672l) {
            return null;
        }
        return true;
    }

    /* renamed from: a */
    static <K, V> void m24421a(C5594p<K, V> c5594p, C5594p<K, V> c5594p2) {
        c5594p.mo5840a((C5594p) c5594p2);
        c5594p2.mo5844b((C5594p) c5594p);
    }

    /* renamed from: b */
    static <K, V> void m24423b(C5594p<K, V> c5594p, C5594p<K, V> c5594p2) {
        c5594p.mo5846c(c5594p2);
        c5594p2.mo5848d(c5594p);
    }

    public boolean isEmpty() {
        C5596q[] c5596qArr = this.f20663c;
        long j = 0;
        int i = 0;
        while (i < c5596qArr.length) {
            if (c5596qArr[i].f20642b != 0) {
                return false;
            }
            i++;
            j += (long) c5596qArr[i].f20643c;
        }
        if (j != 0) {
            i = 0;
            while (i < c5596qArr.length) {
                if (c5596qArr[i].f20642b != 0) {
                    return false;
                }
                i++;
                j -= (long) c5596qArr[i].f20643c;
            }
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int a = m24427a(obj);
        return m24428a(a).m24396a(obj, a);
    }

    public boolean containsKey(Object obj) {
        if (obj == null) {
            return null;
        }
        int a = m24427a(obj);
        return m24428a(a).m24407b(obj, a);
    }

    public boolean containsValue(Object obj) {
        C5599g c5599g = this;
        Object obj2 = obj;
        if (obj2 == null) {
            return false;
        }
        long a = c5599g.f20676p.mo5824a();
        C5596q[] c5596qArr = c5599g.f20663c;
        long j = -1;
        int i = 0;
        while (i < 3) {
            C5596q[] c5596qArr2;
            long j2;
            int length = c5596qArr.length;
            long j3 = 0;
            int i2 = 0;
            while (i2 < length) {
                C5596q c5596q = c5596qArr[i2];
                int i3 = c5596q.f20642b;
                AtomicReferenceArray atomicReferenceArray = c5596q.f20644d;
                for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                    C5594p c5594p = (C5594p) atomicReferenceArray.get(i4);
                    while (c5594p != null) {
                        c5596qArr2 = c5596qArr;
                        Object a2 = c5596q.m24395a(c5594p, a);
                        if (a2 != null) {
                            j2 = a;
                            if (c5599g.f20666f.m24261a(obj2, a2)) {
                                return true;
                            }
                        } else {
                            j2 = a;
                        }
                        c5594p = c5594p.mo5842b();
                        c5596qArr = c5596qArr2;
                        a = j2;
                    }
                    j2 = a;
                    c5596qArr2 = c5596qArr;
                }
                i2++;
                j3 += (long) c5596q.f20643c;
                c5596qArr = c5596qArr;
                a = a;
            }
            j2 = a;
            c5596qArr2 = c5596qArr;
            if (j3 == j) {
                break;
            }
            i++;
            j = j3;
            c5596qArr = c5596qArr2;
            a = j2;
        }
        return false;
    }

    public V put(K k, V v) {
        C5571j.m24292a((Object) k);
        C5571j.m24292a((Object) v);
        int a = m24427a((Object) k);
        return m24428a(a).m24400a((Object) k, a, (Object) v, false);
    }

    public V putIfAbsent(K k, V v) {
        C5571j.m24292a((Object) k);
        C5571j.m24292a((Object) v);
        int a = m24427a((Object) k);
        return m24428a(a).m24400a((Object) k, a, (Object) v, true);
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
        int a = m24427a(obj);
        return m24428a(a).m24409c(obj, a);
    }

    public boolean remove(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                int a = m24427a(obj);
                return m24428a(a).m24408b(obj, a, obj2);
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
        int a = m24427a((Object) k);
        return m24428a(a).m24405a((Object) k, a, (Object) v, (Object) v2);
    }

    public V replace(K k, V v) {
        C5571j.m24292a((Object) k);
        C5571j.m24292a((Object) v);
        int a = m24427a((Object) k);
        return m24428a(a).m24399a((Object) k, a, (Object) v);
    }

    public void clear() {
        C5596q[] c5596qArr = this.f20663c;
        int length = c5596qArr.length;
        for (int i = 0; i < length; i++) {
            C5596q c5596q = c5596qArr[i];
            if (c5596q.f20642b != 0) {
                c5596q.lock();
                try {
                    int i2;
                    AtomicReferenceArray atomicReferenceArray = c5596q.f20644d;
                    for (i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        for (C5594p c5594p = (C5594p) atomicReferenceArray.get(i2); c5594p != null; c5594p = c5594p.mo5842b()) {
                            if (c5594p.mo5838a().mo5835d()) {
                                c5596q.m24402a(c5594p, C5602k.EXPLICIT);
                            }
                        }
                    }
                    for (i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, null);
                    }
                    if (c5596q.f20641a.m24437h()) {
                        do {
                        } while (c5596q.f20645e.poll() != null);
                    }
                    if (c5596q.f20641a.m24438i()) {
                        do {
                        } while (c5596q.f20646f.poll() != null);
                    }
                    c5596q.f20648h.clear();
                    c5596q.f20649i.clear();
                    c5596q.f20647g.set(0);
                    c5596q.f20643c++;
                    c5596q.f20642b = 0;
                } finally {
                    c5596q.unlock();
                    c5596q.m24406b();
                }
            }
        }
    }

    public Set<K> keySet() {
        Set<K> set = this.f20682x;
        if (set != null) {
            return set;
        }
        set = new C6881i(this, this);
        this.f20682x = set;
        return set;
    }

    public Collection<V> values() {
        Collection<V> collection = this.f20683y;
        if (collection != null) {
            return collection;
        }
        collection = new aa(this, this);
        this.f20683y = collection;
        return collection;
    }

    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.f20684z;
        if (set != null) {
            return set;
        }
        set = new C6879f(this, this);
        this.f20684z = set;
        return set;
    }

    /* renamed from: a */
    static <K, V> void m24420a(C5594p<K, V> c5594p) {
        C5594p c5594p2 = C6884o.INSTANCE;
        c5594p.mo5840a(c5594p2);
        c5594p.mo5844b(c5594p2);
    }

    /* renamed from: b */
    static <K, V> void m24422b(C5594p<K, V> c5594p) {
        C5594p c5594p2 = C6884o.INSTANCE;
        c5594p.mo5846c(c5594p2);
        c5594p.mo5848d(c5594p2);
    }

    public int size() {
        C5596q[] c5596qArr = this.f20663c;
        long j = 0;
        int i = 0;
        while (i < c5596qArr.length) {
            i++;
            j += (long) c5596qArr[i].f20642b;
        }
        return C4609a.m20698a(j);
    }
}
