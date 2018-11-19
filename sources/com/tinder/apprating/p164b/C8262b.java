package com.tinder.apprating.p164b;

import com.tinder.apprating.enums.AppRatingMode;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.apprating.b.b */
public final /* synthetic */ class C8262b {
    /* renamed from: a */
    public static final /* synthetic */ int[] f29510a = new int[AppRatingMode.values().length];

    static {
        f29510a[AppRatingMode.RATE.ordinal()] = 1;
        f29510a[AppRatingMode.FEEDBACK.ordinal()] = 2;
        f29510a[AppRatingMode.THANK_YOU.ordinal()] = 3;
    }
}
