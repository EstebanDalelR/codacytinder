package com.tinder.main.adapter;

import com.tinder.discovery.model.DiscoverySegment;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.main.adapter.c */
public final /* synthetic */ class C9814c {
    /* renamed from: a */
    public static final /* synthetic */ int[] f32510a = new int[DiscoverySegment.values().length];

    static {
        f32510a[DiscoverySegment.PLACES.ordinal()] = 1;
        f32510a[DiscoverySegment.RECS.ordinal()] = 2;
        f32510a[DiscoverySegment.TOP_PICKS.ordinal()] = 3;
    }
}
