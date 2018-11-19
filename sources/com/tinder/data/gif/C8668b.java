package com.tinder.data.gif;

import com.tinder.domain.message.GifProvider;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.gif.b */
public final /* synthetic */ class C8668b {
    /* renamed from: a */
    public static final /* synthetic */ int[] f30522a = new int[GifProvider.values().length];

    static {
        f30522a[GifProvider.GIPHY.ordinal()] = 1;
        f30522a[GifProvider.TINDER.ordinal()] = 2;
    }
}
