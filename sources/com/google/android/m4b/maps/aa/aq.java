package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.aa.aa.C4536b;
import com.google.android.m4b.maps.aa.aa.C6307a;
import com.google.android.m4b.maps.aa.al.C7400a;
import com.google.android.m4b.maps.p125y.C5571j;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

public abstract class aq<E> extends ar<E> implements bs<E>, SortedSet<E> {
    /* renamed from: b */
    private static final Comparator<Comparable> f28839b = bc.m20643b();
    /* renamed from: c */
    private static final aq<Comparable> f28840c = new C8197p(f28839b);
    /* renamed from: a */
    final transient Comparator<? super E> f28841a;

    /* renamed from: com.google.android.m4b.maps.aa.aq$b */
    static class C4548b<E> implements Serializable {
        private static final long serialVersionUID = 0;
        /* renamed from: a */
        private Comparator<? super E> f16871a;
        /* renamed from: b */
        private Object[] f16872b;

        public C4548b(Comparator<? super E> comparator, Object[] objArr) {
            this.f16871a = comparator;
            this.f16872b = objArr;
        }

        final Object readResolve() {
            return new C8046a(this.f16871a).m34142c(this.f16872b).m34140b();
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.aq$a */
    public static final class C8046a<E> extends C7400a<E> {
        /* renamed from: c */
        private final Comparator<? super E> f28838c;

        /* renamed from: a */
        public final /* synthetic */ al mo7525a() {
            return m34140b();
        }

        public C8046a(Comparator<? super E> comparator) {
            this.f28838c = (Comparator) C5571j.m24292a((Object) comparator);
        }

        /* renamed from: c */
        public final C8046a<E> m34142c(E... eArr) {
            super.mo7528b((Object[]) eArr);
            return this;
        }

        /* renamed from: b */
        public final aq<E> m34140b() {
            aq<E> a = aq.m34144a(this.f28838c, this.b, this.a);
            this.b = a.size();
            return a;
        }

        /* renamed from: b */
        public final /* synthetic */ C7400a mo7527b(Iterator it) {
            super.mo7527b(it);
            return this;
        }

        /* renamed from: b */
        public final /* synthetic */ C7400a mo7526b(Iterable iterable) {
            super.mo7526b(iterable);
            return this;
        }

        /* renamed from: b */
        public final /* synthetic */ C7400a mo7528b(Object[] objArr) {
            super.mo7528b(objArr);
            return this;
        }

        /* renamed from: c */
        public final /* synthetic */ C7400a mo7529c(Object obj) {
            super.mo7529c(obj);
            return this;
        }

        /* renamed from: a */
        public final /* synthetic */ C4536b mo4772a(Iterable iterable) {
            super.mo7526b(iterable);
            return this;
        }

        /* renamed from: a */
        public final /* synthetic */ C4536b mo4773a(Object[] objArr) {
            super.mo7528b(objArr);
            return this;
        }

        /* renamed from: a */
        public final /* synthetic */ C6307a mo6979a(Object obj) {
            super.mo7529c(obj);
            return this;
        }

        /* renamed from: a */
        public final /* synthetic */ C4536b mo6980a(Iterator it) {
            super.mo7527b(it);
            return this;
        }

        /* renamed from: b */
        public final /* synthetic */ C4536b mo4774b(Object obj) {
            super.mo7529c(obj);
            return this;
        }
    }

    /* renamed from: a */
    abstract aq<E> mo7627a(E e, boolean z);

    /* renamed from: a */
    abstract aq<E> mo7628a(E e, boolean z, E e2, boolean z2);

    /* renamed from: a */
    public abstract bw<E> mo4785a();

    /* renamed from: b */
    abstract int mo7629b(Object obj);

    /* renamed from: b */
    abstract aq<E> mo7630b(E e, boolean z);

    /* renamed from: e */
    public abstract bw<E> mo7631e();

    public /* synthetic */ Iterator iterator() {
        return mo4785a();
    }

    /* renamed from: a */
    static <E> aq<E> m34143a(Comparator<? super E> comparator) {
        if (f28839b.equals(comparator)) {
            return f28840c;
        }
        return new C8197p(comparator);
    }

    /* renamed from: a */
    static <E> aq<E> m34144a(Comparator<? super E> comparator, int i, E... eArr) {
        if (i == 0) {
            return m34143a(comparator);
        }
        bb.m20641c(eArr, i);
        Arrays.sort(eArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            Object obj = eArr[i3];
            if (comparator.compare(obj, eArr[i2 - 1]) != 0) {
                int i4 = i2 + 1;
                eArr[i2] = obj;
                i2 = i4;
            }
        }
        Arrays.fill(eArr, i2, i, null);
        return new bk(ae.m27684b((Object[]) eArr, i2), comparator);
    }

    /* renamed from: a */
    final int m34146a(Object obj, Object obj2) {
        return this.f28841a.compare(obj, obj2);
    }

    aq(Comparator<? super E> comparator) {
        this.f28841a = comparator;
    }

    public Comparator<? super E> comparator() {
        return this.f28841a;
    }

    public E first() {
        return mo4785a().next();
    }

    public E last() {
        return mo7631e().next();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    Object writeReplace() {
        return new C4548b(this.f28841a, toArray());
    }

    /* renamed from: a */
    public static <E> aq<E> m34145a(Comparator<? super E> comparator, Collection<? extends E> collection) {
        C5571j.m24292a((Object) comparator);
        if (bt.m20659a(comparator, collection) && (collection instanceof aq)) {
            aq<E> aqVar = (aq) collection;
            if (!aqVar.mo4791d()) {
                return aqVar;
            }
        }
        Object[] b = as.m20504b(collection);
        return m34144a(comparator, b.length, b);
    }

    public /* synthetic */ SortedSet tailSet(Object obj) {
        return mo7630b(C5571j.m24292a(obj), true);
    }

    public /* synthetic */ SortedSet headSet(Object obj) {
        return mo7627a(C5571j.m24292a(obj), false);
    }

    public /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        C5571j.m24292a(obj);
        C5571j.m24292a(obj2);
        C5571j.m24297a(this.f28841a.compare(obj, obj2) <= 0);
        return mo7628a(obj, true, obj2, false);
    }
}
