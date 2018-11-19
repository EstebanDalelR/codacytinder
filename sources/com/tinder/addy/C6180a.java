package com.tinder.addy;

import com.tinder.addy.persistence.PersistenceStrategy;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.addy.a */
public final /* synthetic */ class C6180a {
    /* renamed from: a */
    public static final /* synthetic */ int[] f22724a = new int[PersistenceStrategy.values().length];

    static {
        f22724a[PersistenceStrategy.MEMORY.ordinal()] = 1;
        f22724a[PersistenceStrategy.DISK.ordinal()] = 2;
    }
}
