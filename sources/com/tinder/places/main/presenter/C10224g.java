package com.tinder.places.main.presenter;

import com.tinder.domain.places.model.PlacesLoadedState;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.places.main.presenter.g */
public final /* synthetic */ class C10224g {
    /* renamed from: a */
    public static final /* synthetic */ int[] f33319a = new int[PlacesLoadedState.values().length];

    static {
        f33319a[PlacesLoadedState.COLD.ordinal()] = 1;
        f33319a[PlacesLoadedState.LOADING.ordinal()] = 2;
        f33319a[PlacesLoadedState.SUCCESS.ordinal()] = 3;
    }
}
