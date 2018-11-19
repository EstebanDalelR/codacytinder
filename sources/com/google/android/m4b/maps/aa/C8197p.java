package com.google.android.m4b.maps.aa;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: com.google.android.m4b.maps.aa.p */
final class C8197p<E> extends aq<E> {
    /* renamed from: a */
    final int mo4784a(Object[] objArr, int i) {
        return i;
    }

    /* renamed from: a */
    final aq<E> mo7627a(E e, boolean z) {
        return this;
    }

    /* renamed from: a */
    final aq<E> mo7628a(E e, boolean z, E e2, boolean z2) {
        return this;
    }

    /* renamed from: b */
    final int mo7629b(Object obj) {
        return -1;
    }

    /* renamed from: b */
    final aq<E> mo7630b(E e, boolean z) {
        return this;
    }

    public final boolean contains(Object obj) {
        return false;
    }

    /* renamed from: d */
    final boolean mo4791d() {
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final int size() {
        return 0;
    }

    public final String toString() {
        return "[]";
    }

    C8197p(Comparator<? super E> comparator) {
        super(comparator);
    }

    public final boolean containsAll(Collection<?> collection) {
        return collection.isEmpty();
    }

    /* renamed from: a */
    public final bw<E> mo4785a() {
        return at.m20505a();
    }

    /* renamed from: e */
    public final bw<E> mo7631e() {
        return at.m20505a();
    }

    /* renamed from: b */
    public final ae<E> mo4786b() {
        return ae.m27685e();
    }

    public final boolean equals(Object obj) {
        return obj instanceof Set ? ((Set) obj).isEmpty() : null;
    }

    public final E first() {
        throw new NoSuchElementException();
    }

    public final E last() {
        throw new NoSuchElementException();
    }

    public final /* synthetic */ Iterator iterator() {
        return at.m20505a();
    }
}
