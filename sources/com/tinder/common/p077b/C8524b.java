package com.tinder.common.p077b;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.tinder.common.b.b */
public class C8524b {
    @SafeVarargs
    /* renamed from: a */
    public static <E> Set<E> m36481a(E... eArr) {
        Object hashSet = new HashSet(eArr.length);
        Collections.addAll(hashSet, eArr);
        return hashSet;
    }

    @SafeVarargs
    /* renamed from: b */
    public static <E> Set<E> m36482b(E... eArr) {
        if (eArr.length == 0) {
            eArr = Collections.emptySet();
        } else if (eArr.length == 1) {
            eArr = Collections.singleton(eArr[0]);
        } else {
            eArr = C8524b.m36481a(eArr);
        }
        return Collections.unmodifiableSet(eArr);
    }

    /* renamed from: a */
    public static <E> Set<E> m36480a() {
        return Collections.emptySet();
    }
}
