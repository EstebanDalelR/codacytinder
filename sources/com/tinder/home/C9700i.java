package com.tinder.home;

import com.tinder.home.ShimmerHomeTabTarget.IconType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.home.i */
public final /* synthetic */ class C9700i {
    /* renamed from: a */
    public static final /* synthetic */ int[] f32280a = new int[IconType.values().length];
    /* renamed from: b */
    public static final /* synthetic */ int[] f32281b = new int[IconType.values().length];

    static {
        f32280a[IconType.REGULAR_RED.ordinal()] = 1;
        f32280a[IconType.SAVORY_SHIMMER.ordinal()] = 2;
        f32281b[IconType.SAVORY_SHIMMER.ordinal()] = 1;
        f32281b[IconType.REGULAR_RED.ordinal()] = 2;
    }
}
