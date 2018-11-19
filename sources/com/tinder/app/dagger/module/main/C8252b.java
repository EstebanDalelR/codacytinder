package com.tinder.app.dagger.module.main;

import com.tinder.discovery.model.DiscoverySegment;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.app.dagger.module.main.b */
public final /* synthetic */ class C8252b {
    /* renamed from: a */
    public static final /* synthetic */ int[] f29465a = new int[DiscoverySegment.values().length];

    static {
        f29465a[DiscoverySegment.RECS.ordinal()] = 1;
        f29465a[DiscoverySegment.TOP_PICKS.ordinal()] = 2;
        f29465a[DiscoverySegment.PLACES.ordinal()] = 3;
    }
}
