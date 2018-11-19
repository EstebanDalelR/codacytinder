package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.p125y.C5571j;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public final class bo {

    /* renamed from: com.google.android.m4b.maps.aa.bo$a */
    static abstract class C4573a<E> extends AbstractSet<E> {
        C4573a() {
        }

        public boolean removeAll(Collection<?> collection) {
            return bo.m20656a((Set) this, (Collection) collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) C5571j.m24292a((Object) collection));
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.bo$b */
    static class C4574b<E> extends AbstractSet<E> implements Serializable, Set<E> {
        private static final long serialVersionUID = 0;
        /* renamed from: a */
        private final Map<E, Boolean> f16961a;
        /* renamed from: b */
        private transient Set<E> f16962b;

        C4574b(Map<E, Boolean> map) {
            C5571j.m24298a(map.isEmpty(), (Object) "Map is non-empty");
            this.f16961a = map;
            this.f16962b = map.keySet();
        }

        public final void clear() {
            this.f16961a.clear();
        }

        public final int size() {
            return this.f16961a.size();
        }

        public final boolean isEmpty() {
            return this.f16961a.isEmpty();
        }

        public final boolean contains(Object obj) {
            return this.f16961a.containsKey(obj);
        }

        public final boolean remove(Object obj) {
            return this.f16961a.remove(obj) != null ? true : null;
        }

        public final boolean add(E e) {
            return this.f16961a.put(e, Boolean.TRUE) == null ? true : null;
        }

        public final Iterator<E> iterator() {
            return this.f16962b.iterator();
        }

        public final Object[] toArray() {
            return this.f16962b.toArray();
        }

        public final <T> T[] toArray(T[] tArr) {
            return this.f16962b.toArray(tArr);
        }

        public final String toString() {
            return this.f16962b.toString();
        }

        public final int hashCode() {
            return this.f16962b.hashCode();
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (this.f16962b.equals(obj) == null) {
                    return null;
                }
            }
            return true;
        }

        public final boolean containsAll(Collection<?> collection) {
            return this.f16962b.containsAll(collection);
        }

        public final boolean removeAll(Collection<?> collection) {
            return this.f16962b.removeAll(collection);
        }

        public final boolean retainAll(Collection<?> collection) {
            return this.f16962b.retainAll(collection);
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            this.f16962b = this.f16961a.keySet();
        }
    }

    /* renamed from: a */
    public static <E> HashSet<E> m20653a(E... eArr) {
        Object a = m20651a(1);
        Collections.addAll(a, eArr);
        return a;
    }

    /* renamed from: a */
    public static <E> HashSet<E> m20651a(int i) {
        return new HashSet(ax.m20621b(i));
    }

    /* renamed from: a */
    public static <E> HashSet<E> m20652a(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new HashSet(C4584j.m20671a((Iterable) iterable));
        }
        Iterator it = iterable.iterator();
        Collection hashSet = new HashSet();
        at.m20512a(hashSet, it);
        return hashSet;
    }

    /* renamed from: b */
    public static <E> LinkedHashSet<E> m20658b(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet(C4584j.m20671a((Iterable) iterable));
        }
        Collection linkedHashSet = new LinkedHashSet();
        as.m20503a(linkedHashSet, (Iterable) iterable);
        return linkedHashSet;
    }

    /* renamed from: a */
    public static <E> Set<E> m20654a() {
        return new C4574b(ax.m20630e());
    }

    /* renamed from: a */
    static boolean m20655a(java.util.Set<?> r4, java.lang.Object r5) {
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
        r0 = 1;
        if (r4 != r5) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof java.util.Set;
        r2 = 0;
        if (r1 == 0) goto L_0x001f;
    L_0x0009:
        r5 = (java.util.Set) r5;
        r1 = r4.size();	 Catch:{ NullPointerException -> 0x001e, ClassCastException -> 0x001d }
        r3 = r5.size();	 Catch:{ NullPointerException -> 0x001e, ClassCastException -> 0x001d }
        if (r1 != r3) goto L_0x001c;	 Catch:{ NullPointerException -> 0x001e, ClassCastException -> 0x001d }
    L_0x0015:
        r4 = r4.containsAll(r5);	 Catch:{ NullPointerException -> 0x001e, ClassCastException -> 0x001d }
        if (r4 == 0) goto L_0x001c;
    L_0x001b:
        return r0;
    L_0x001c:
        return r2;
    L_0x001d:
        return r2;
    L_0x001e:
        return r2;
    L_0x001f:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.aa.bo.a(java.util.Set, java.lang.Object):boolean");
    }

    /* renamed from: a */
    static boolean m20657a(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    /* renamed from: a */
    static boolean m20656a(Set<?> set, Collection<?> collection) {
        C5571j.m24292a((Object) collection);
        if (collection instanceof az) {
            Collection a = ((az) collection).m20636a();
        }
        if (!(a instanceof Set) || a.size() <= set.size()) {
            return m20657a((Set) set, a.iterator());
        }
        return at.m20514a(set.iterator(), a);
    }
}
