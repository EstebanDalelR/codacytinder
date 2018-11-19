package com.tinder.match.presenter;

import com.tinder.match.views.MatchesSearchView.State;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.match.presenter.b */
public final /* synthetic */ class C9866b {
    /* renamed from: a */
    public static final /* synthetic */ int[] f32672a = new int[State.values().length];

    static {
        f32672a[State.SEARCH_ON.ordinal()] = 1;
        f32672a[State.SEARCHING.ordinal()] = 2;
        f32672a[State.SEARCH_OFF.ordinal()] = 3;
    }
}
