package com.tinder.discovery.p232b;

import com.tinder.discovery.model.DiscoverySegment;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.discovery.b.b */
public final /* synthetic */ class C8884b {
    /* renamed from: a */
    public static final /* synthetic */ int[] f31089a = new int[DiscoverySegment.values().length];

    static {
        f31089a[DiscoverySegment.TOP_PICKS.ordinal()] = 1;
        f31089a[DiscoverySegment.PLACES.ordinal()] = 2;
        f31089a[DiscoverySegment.RECS.ordinal()] = 3;
    }
}
