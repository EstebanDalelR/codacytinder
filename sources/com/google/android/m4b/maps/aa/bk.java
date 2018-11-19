package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.aa.bu.C4575a;
import com.google.android.m4b.maps.aa.bu.C4576b;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.Comparator;
import java.util.Iterator;

final class bk<E> extends aq<E> {
    /* renamed from: b */
    private final transient ae<E> f29331b;

    public final boolean isEmpty() {
        return false;
    }

    bk(ae<E> aeVar, Comparator<? super E> comparator) {
        super(comparator);
        this.f29331b = aeVar;
        C5571j.m24297a(aeVar.isEmpty() ^ 1);
    }

    /* renamed from: a */
    public final bw<E> mo4785a() {
        return this.f29331b.mo4785a();
    }

    /* renamed from: e */
    public final bw<E> mo7631e() {
        return this.f29331b.mo6982f().mo4785a();
    }

    public final int size() {
        return this.f29331b.size();
    }

    public final boolean containsAll(java.util.Collection<?> r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = r6 instanceof com.google.android.m4b.maps.aa.az;
        if (r0 == 0) goto L_0x000a;
    L_0x0004:
        r6 = (com.google.android.m4b.maps.aa.az) r6;
        r6 = r6.m20636a();
    L_0x000a:
        r0 = r5.comparator();
        r0 = com.google.android.m4b.maps.aa.bt.m20659a(r0, r6);
        if (r0 == 0) goto L_0x0057;
    L_0x0014:
        r0 = r6.size();
        r1 = 1;
        if (r0 > r1) goto L_0x001c;
    L_0x001b:
        goto L_0x0057;
    L_0x001c:
        r0 = r5.f29331b;
        r0 = r0.mo4785a();
        r0 = com.google.android.m4b.maps.aa.at.m20519e(r0);
        r6 = r6.iterator();
        r2 = r6.next();
    L_0x002e:
        r3 = 0;
        r4 = r0.hasNext();	 Catch:{ NullPointerException -> 0x0056, ClassCastException -> 0x0055 }
        if (r4 == 0) goto L_0x0054;	 Catch:{ NullPointerException -> 0x0056, ClassCastException -> 0x0055 }
    L_0x0035:
        r4 = r0.mo4798a();	 Catch:{ NullPointerException -> 0x0056, ClassCastException -> 0x0055 }
        r4 = r5.m34146a(r4, r2);	 Catch:{ NullPointerException -> 0x0056, ClassCastException -> 0x0055 }
        if (r4 >= 0) goto L_0x0043;	 Catch:{ NullPointerException -> 0x0056, ClassCastException -> 0x0055 }
    L_0x003f:
        r0.next();	 Catch:{ NullPointerException -> 0x0056, ClassCastException -> 0x0055 }
        goto L_0x002e;	 Catch:{ NullPointerException -> 0x0056, ClassCastException -> 0x0055 }
    L_0x0043:
        if (r4 != 0) goto L_0x0051;	 Catch:{ NullPointerException -> 0x0056, ClassCastException -> 0x0055 }
    L_0x0045:
        r2 = r6.hasNext();	 Catch:{ NullPointerException -> 0x0056, ClassCastException -> 0x0055 }
        if (r2 != 0) goto L_0x004c;	 Catch:{ NullPointerException -> 0x0056, ClassCastException -> 0x0055 }
    L_0x004b:
        return r1;	 Catch:{ NullPointerException -> 0x0056, ClassCastException -> 0x0055 }
    L_0x004c:
        r2 = r6.next();	 Catch:{ NullPointerException -> 0x0056, ClassCastException -> 0x0055 }
        goto L_0x002e;
    L_0x0051:
        if (r4 <= 0) goto L_0x002e;
    L_0x0053:
        return r3;
    L_0x0054:
        return r3;
    L_0x0055:
        return r3;
    L_0x0056:
        return r3;
    L_0x0057:
        r6 = super.containsAll(r6);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.aa.bk.containsAll(java.util.Collection):boolean");
    }

    /* renamed from: d */
    final boolean mo4791d() {
        return this.f29331b.mo4791d();
    }

    /* renamed from: a */
    final int mo4784a(Object[] objArr, int i) {
        return this.f29331b.mo4784a(objArr, i);
    }

    public final boolean equals(java.lang.Object r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = 1;
        if (r6 != r5) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r6 instanceof java.util.Set;
        r2 = 0;
        if (r1 != 0) goto L_0x000a;
    L_0x0009:
        return r2;
    L_0x000a:
        r6 = (java.util.Set) r6;
        r1 = r5.size();
        r3 = r6.size();
        if (r1 == r3) goto L_0x0017;
    L_0x0016:
        return r2;
    L_0x0017:
        r1 = r5.a;
        r1 = com.google.android.m4b.maps.aa.bt.m20659a(r1, r6);
        if (r1 == 0) goto L_0x0043;
    L_0x001f:
        r6 = r6.iterator();
        r1 = r5.f29331b;	 Catch:{ ClassCastException -> 0x0042, NoSuchElementException -> 0x0041 }
        r1 = r1.mo4785a();	 Catch:{ ClassCastException -> 0x0042, NoSuchElementException -> 0x0041 }
    L_0x0029:
        r3 = r1.hasNext();	 Catch:{ ClassCastException -> 0x0042, NoSuchElementException -> 0x0041 }
        if (r3 == 0) goto L_0x0040;	 Catch:{ ClassCastException -> 0x0042, NoSuchElementException -> 0x0041 }
    L_0x002f:
        r3 = r1.next();	 Catch:{ ClassCastException -> 0x0042, NoSuchElementException -> 0x0041 }
        r4 = r6.next();	 Catch:{ ClassCastException -> 0x0042, NoSuchElementException -> 0x0041 }
        if (r4 == 0) goto L_0x003f;	 Catch:{ ClassCastException -> 0x0042, NoSuchElementException -> 0x0041 }
    L_0x0039:
        r3 = r5.m34146a(r3, r4);	 Catch:{ ClassCastException -> 0x0042, NoSuchElementException -> 0x0041 }
        if (r3 == 0) goto L_0x0029;
    L_0x003f:
        return r2;
    L_0x0040:
        return r0;
    L_0x0041:
        return r2;
    L_0x0042:
        return r2;
    L_0x0043:
        r6 = r5.containsAll(r6);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.aa.bk.equals(java.lang.Object):boolean");
    }

    public final E first() {
        return this.f29331b.get(0);
    }

    public final E last() {
        return this.f29331b.get(size() - 1);
    }

    /* renamed from: a */
    final aq<E> mo7627a(E e, boolean z) {
        return m34942a((int) false, m34948c(e, z));
    }

    /* renamed from: c */
    final int m34948c(E e, boolean z) {
        return bu.m20662a(this.f29331b, C5571j.m24292a((Object) e), comparator(), z ? C4576b.FIRST_AFTER : C4576b.FIRST_PRESENT, C4575a.NEXT_HIGHER);
    }

    /* renamed from: a */
    final aq<E> mo7628a(E e, boolean z, E e2, boolean z2) {
        return mo7630b(e, z).mo7627a((Object) e2, z2);
    }

    /* renamed from: b */
    final aq<E> mo7630b(E e, boolean z) {
        return m34942a(m34950d(e, z), size());
    }

    /* renamed from: d */
    final int m34950d(E e, boolean z) {
        return bu.m20662a(this.f29331b, C5571j.m24292a((Object) e), comparator(), z ? C4576b.FIRST_PRESENT : C4576b.FIRST_AFTER, C4575a.NEXT_HIGHER);
    }

    /* renamed from: a */
    final aq<E> m34942a(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i < i2) {
            return new bk(this.f29331b.mo6981a(i, i2), this.a);
        }
        return aq.m34143a(this.a);
    }

    /* renamed from: b */
    final int mo7629b(java.lang.Object r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = -1;
        if (r6 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5.f29331b;	 Catch:{ ClassCastException -> 0x0014 }
        r2 = r5.a;	 Catch:{ ClassCastException -> 0x0014 }
        r3 = com.google.android.m4b.maps.aa.bu.C4576b.ANY_PRESENT;	 Catch:{ ClassCastException -> 0x0014 }
        r4 = com.google.android.m4b.maps.aa.bu.C4575a.INVERTED_INSERTION_INDEX;	 Catch:{ ClassCastException -> 0x0014 }
        r6 = com.google.android.m4b.maps.aa.bu.m20662a(r1, r6, r2, r3, r4);	 Catch:{ ClassCastException -> 0x0014 }
        if (r6 < 0) goto L_0x0013;
    L_0x0012:
        return r6;
    L_0x0013:
        return r0;
    L_0x0014:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.aa.bk.b(java.lang.Object):int");
    }

    /* renamed from: c */
    final ae<E> mo4790c() {
        return new an(this, this.f29331b);
    }

    public final boolean contains(java.lang.Object r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = 0;
        if (r4 == 0) goto L_0x0010;
    L_0x0003:
        r1 = r3.f29331b;	 Catch:{ ClassCastException -> 0x000f }
        r2 = r3.a;	 Catch:{ ClassCastException -> 0x000f }
        r4 = java.util.Collections.binarySearch(r1, r4, r2);	 Catch:{ ClassCastException -> 0x000f }
        if (r4 < 0) goto L_0x0010;
    L_0x000d:
        r4 = 1;
        return r4;
    L_0x000f:
        return r0;
    L_0x0010:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.aa.bk.contains(java.lang.Object):boolean");
    }

    public final /* synthetic */ Iterator iterator() {
        return this.f29331b.mo4785a();
    }
}
