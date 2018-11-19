package com.tinder.places.settings.presenter;

import com.tinder.domain.meta.model.DiscoverySettings.GenderFilter;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.places.settings.presenter.d */
public final /* synthetic */ class C14319d {
    /* renamed from: a */
    public static final /* synthetic */ int[] f45488a = new int[GenderFilter.values().length];

    static {
        f45488a[GenderFilter.MALE.ordinal()] = 1;
        f45488a[GenderFilter.FEMALE.ordinal()] = 2;
        f45488a[GenderFilter.BOTH.ordinal()] = 3;
    }
}
