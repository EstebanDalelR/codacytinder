package com.tinder.fastmatch.newcount;

import com.tinder.domain.fastmatch.newCount.NewCountFetcher.State;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.fastmatch.newcount.f */
public final /* synthetic */ class C9384f {
    /* renamed from: a */
    public static final /* synthetic */ int[] f31482a = new int[State.values().length];

    static {
        f31482a[State.INITIALIZED.ordinal()] = 1;
        f31482a[State.RESCHEDULED.ordinal()] = 2;
        f31482a[State.UNINITIALIZED.ordinal()] = 3;
    }
}
