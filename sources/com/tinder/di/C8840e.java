package com.tinder.di;

import com.tinder.domain.recs.RecsEngine.Config.LoaderType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 9})
/* renamed from: com.tinder.di.e */
public final /* synthetic */ class C8840e {
    /* renamed from: a */
    public static final /* synthetic */ int[] f30980a = new int[LoaderType.values().length];
    /* renamed from: b */
    public static final /* synthetic */ int[] f30981b = new int[LoaderType.values().length];

    static {
        f30980a[LoaderType.CARD_STACK.ordinal()] = 1;
        f30980a[LoaderType.CARD_GRID.ordinal()] = 2;
        f30981b[LoaderType.CARD_STACK.ordinal()] = 1;
        f30981b[LoaderType.CARD_GRID.ordinal()] = 2;
    }
}
