package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.aa.aa.C4536b;
import com.google.android.m4b.maps.aa.aa.C6307a;
import com.google.android.m4b.maps.p125y.C5571j;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public abstract class al<E> extends aa<E> implements Set<E> {

    /* renamed from: com.google.android.m4b.maps.aa.al$b */
    static class C4547b implements Serializable {
        private static final long serialVersionUID = 0;
        /* renamed from: a */
        private Object[] f16870a;

        C4547b(Object[] objArr) {
            this.f16870a = objArr;
        }

        final Object readResolve() {
            return al.m27702a(this.f16870a);
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.al$a */
    public static class C7400a<E> extends C6307a<E> {
        /* renamed from: a */
        public /* synthetic */ C6307a mo6979a(Object obj) {
            return mo7529c(obj);
        }

        /* renamed from: a */
        public /* synthetic */ C4536b mo4772a(Iterable iterable) {
            return mo7526b(iterable);
        }

        /* renamed from: a */
        public /* synthetic */ C4536b mo6980a(Iterator it) {
            return mo7527b(it);
        }

        /* renamed from: a */
        public /* synthetic */ C4536b mo4773a(Object[] objArr) {
            return mo7528b(objArr);
        }

        /* renamed from: b */
        public /* synthetic */ C4536b mo4774b(Object obj) {
            return mo7529c(obj);
        }

        public C7400a() {
            this(4);
        }

        private C7400a(int i) {
            super(4);
        }

        /* renamed from: c */
        public C7400a<E> mo7529c(E e) {
            super.mo6979a((Object) e);
            return this;
        }

        /* renamed from: b */
        public C7400a<E> mo7528b(E... eArr) {
            super.mo4773a((Object[]) eArr);
            return this;
        }

        /* renamed from: b */
        public C7400a<E> mo7526b(Iterable<? extends E> iterable) {
            super.mo4772a((Iterable) iterable);
            return this;
        }

        /* renamed from: b */
        public C7400a<E> mo7527b(Iterator<? extends E> it) {
            super.mo6980a((Iterator) it);
            return this;
        }

        /* renamed from: a */
        public al<E> mo7525a() {
            al<E> a = al.m27703b(this.b, this.a);
            this.b = a.size();
            return a;
        }
    }

    /* renamed from: a */
    public abstract bw<E> mo4785a();

    /* renamed from: g */
    boolean mo7005g() {
        return false;
    }

    public /* synthetic */ Iterator iterator() {
        return mo4785a();
    }

    /* renamed from: f */
    public static <E> al<E> m27704f() {
        return C7420m.f27214a;
    }

    /* renamed from: a */
    public static <E> al<E> m27700a(E e) {
        return new br(e);
    }

    /* renamed from: b */
    private static <E> al<E> m27703b(int i, Object... objArr) {
        while (true) {
            switch (i) {
                case 0:
                    return C7420m.f27214a;
                case 1:
                    return m27700a(objArr[0]);
                default:
                    int a = m27697a(i);
                    Object[] objArr2 = new Object[a];
                    int i2 = a - 1;
                    int i3 = 0;
                    int i4 = 0;
                    for (int i5 = 0; i5 < i; i5++) {
                        Object a2 = bb.m20637a(objArr[i5], i5);
                        int hashCode = a2.hashCode();
                        int a3 = C4588x.m20678a(hashCode);
                        while (true) {
                            int i6 = a3 & i2;
                            Object obj = objArr2[i6];
                            if (obj == null) {
                                a3 = i3 + 1;
                                objArr[i3] = a2;
                                objArr2[i6] = a2;
                                i4 += hashCode;
                                i3 = a3;
                            } else if (!obj.equals(a2)) {
                                a3++;
                            }
                        }
                    }
                    Arrays.fill(objArr, i3, i, null);
                    if (i3 == 1) {
                        return new br(objArr[0], i4);
                    }
                    if (a != m27697a(i3)) {
                        i = i3;
                    } else {
                        if (i3 < objArr.length) {
                            objArr = bb.m20640b(objArr, i3);
                        }
                        return new bi(objArr, i4, objArr2, i2);
                    }
            }
        }
    }

    /* renamed from: a */
    private static int m27697a(int i) {
        boolean z = true;
        if (i < 751619276) {
            int highestOneBit = Integer.highestOneBit(i - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) i)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (i >= 1073741824) {
            z = false;
        }
        C5571j.m24298a(z, (Object) "collection too large");
        return 1073741824;
    }

    /* renamed from: a */
    public static <E> al<E> m27702a(E[] eArr) {
        switch (eArr.length) {
            case 0:
                return C7420m.f27214a;
            case 1:
                return m27700a(eArr[0]);
            default:
                return m27703b(eArr.length, (Object[]) eArr.clone());
        }
    }

    /* renamed from: a */
    public static <E> al<E> m27699a(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return m27701a(C4584j.m20671a((Iterable) iterable));
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return C7420m.f27214a;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return new C7400a().mo7529c(next).mo7527b(it).mo7525a();
        }
        return m27700a(next);
    }

    /* renamed from: a */
    public static <E> al<E> m27701a(Collection<? extends E> collection) {
        if ((collection instanceof al) && !(collection instanceof aq)) {
            al<E> alVar = (al) collection;
            if (!alVar.mo4791d()) {
                return alVar;
            }
        } else if (collection instanceof EnumSet) {
            return ad.m31821a(EnumSet.copyOf((EnumSet) collection));
        }
        collection = collection.toArray();
        return m27703b(collection.length, collection);
    }

    al() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof al) && mo7005g() && ((al) obj).mo7005g() && hashCode() != obj.hashCode()) {
            return null;
        }
        return bo.m20655a((Set) this, obj);
    }

    Object writeReplace() {
        return new C4547b(toArray());
    }

    /* renamed from: h */
    public static <E> C7400a<E> m27705h() {
        return new C7400a();
    }

    public int hashCode() {
        int i = 0;
        for (Object next : this) {
            i = ((i + (next != null ? next.hashCode() : 0)) ^ -1) ^ -1;
        }
        return i;
    }
}
