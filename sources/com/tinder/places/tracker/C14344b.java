package com.tinder.places.tracker;

import com.foursquare.pilgrim.RegionType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.places.tracker.b */
public final /* synthetic */ class C14344b {
    /* renamed from: a */
    public static final /* synthetic */ int[] f45509a = new int[RegionType.values().length];

    static {
        f45509a[RegionType.VENUE.ordinal()] = 1;
        f45509a[RegionType.HOME.ordinal()] = 2;
        f45509a[RegionType.WORK.ordinal()] = 3;
        f45509a[RegionType.UNKNOWN.ordinal()] = 4;
        f45509a[RegionType.NONE.ordinal()] = 5;
        f45509a[RegionType.OTHER.ordinal()] = 6;
    }
}
