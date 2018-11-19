package com.tinder.data.meta.p226a;

import com.tinder.api.model.profile.Purchase.Platform;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.meta.a.n */
public final /* synthetic */ class C8700n {
    /* renamed from: a */
    public static final /* synthetic */ int[] f30652a = new int[Platform.values().length];
    /* renamed from: b */
    public static final /* synthetic */ int[] f30653b = new int[Platform.values().length];

    static {
        f30652a[Platform.ANDROID.ordinal()] = 1;
        f30652a[Platform.IOS.ordinal()] = 2;
        f30652a[Platform.TEST.ordinal()] = 3;
        f30652a[Platform.WEB.ordinal()] = 4;
    }
}
