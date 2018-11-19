package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.p125y.C5571j;
import java.util.Comparator;
import java.util.SortedSet;

final class bt {
    /* renamed from: a */
    public static boolean m20659a(Comparator<?> comparator, Iterable<?> iterable) {
        C5571j.m24292a((Object) comparator);
        C5571j.m24292a((Object) iterable);
        if (iterable instanceof SortedSet) {
            iterable = ((SortedSet) iterable).comparator();
            if (iterable == null) {
                iterable = bc.m20643b();
            }
        } else if (!(iterable instanceof bs)) {
            return null;
        } else {
            iterable = ((bs) iterable).comparator();
        }
        return comparator.equals(iterable);
    }
}
