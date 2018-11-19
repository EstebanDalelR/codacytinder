package com.tinder.places.recs.presenter;

import com.tinder.domain.recs.model.RatingResult;
import com.tinder.domain.recs.model.Swipe.Type;
import com.tinder.domain.recs.model.SwipeOrigin;
import com.tinder.domain.recs.model.SwipeTerminationEvent;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.places.recs.presenter.b */
public final /* synthetic */ class C10276b {
    /* renamed from: a */
    public static final /* synthetic */ int[] f33406a = new int[Type.values().length];
    /* renamed from: b */
    public static final /* synthetic */ int[] f33407b = new int[RatingResult.values().length];
    /* renamed from: c */
    public static final /* synthetic */ int[] f33408c = new int[RatingResult.values().length];
    /* renamed from: d */
    public static final /* synthetic */ int[] f33409d = new int[Type.values().length];
    /* renamed from: e */
    public static final /* synthetic */ int[] f33410e = new int[Type.values().length];
    /* renamed from: f */
    public static final /* synthetic */ int[] f33411f = new int[SwipeTerminationEvent.Type.values().length];
    /* renamed from: g */
    public static final /* synthetic */ int[] f33412g = new int[Type.values().length];
    /* renamed from: h */
    public static final /* synthetic */ int[] f33413h = new int[Type.values().length];
    /* renamed from: i */
    public static final /* synthetic */ int[] f33414i = new int[SwipeOrigin.values().length];

    static {
        f33406a[Type.LIKE.ordinal()] = 1;
        f33406a[Type.SUPERLIKE.ordinal()] = 2;
        f33407b[RatingResult.ERROR.ordinal()] = 1;
        f33407b[RatingResult.BOUNCER.ordinal()] = 2;
        f33408c[RatingResult.ERROR.ordinal()] = 1;
        f33408c[RatingResult.BOUNCER.ordinal()] = 2;
        f33409d[Type.SUPERLIKE.ordinal()] = 1;
        f33409d[Type.LIKE.ordinal()] = 2;
        f33410e[Type.SUPERLIKE.ordinal()] = 1;
        f33410e[Type.LIKE.ordinal()] = 2;
        f33411f[SwipeTerminationEvent.Type.LEGALLY_INTERRUPTED_FREEZE.ordinal()] = 1;
        f33411f[SwipeTerminationEvent.Type.COMPLETED.ordinal()] = 2;
        f33411f[SwipeTerminationEvent.Type.LEGALLY_INTERRUPTED_REVERT_POST_CONSUMPTION.ordinal()] = 3;
        f33411f[SwipeTerminationEvent.Type.ILLEGALLY_INTERRUPTED_POST_CONSUMPTION.ordinal()] = 4;
        f33411f[SwipeTerminationEvent.Type.LEGALLY_INTERRUPTED_REVERT_PRE_CONSUMPTION.ordinal()] = 5;
        f33411f[SwipeTerminationEvent.Type.ILLEGALLY_INTERRUPTED_PRE_CONSUMPTION.ordinal()] = 6;
        f33412g[Type.LIKE.ordinal()] = 1;
        f33412g[Type.PASS.ordinal()] = 2;
        f33412g[Type.SUPERLIKE.ordinal()] = 3;
        f33413h[Type.LIKE.ordinal()] = 1;
        f33413h[Type.PASS.ordinal()] = 2;
        f33413h[Type.SUPERLIKE.ordinal()] = 3;
        f33414i[SwipeOrigin.USER_PROFILE.ordinal()] = 1;
        f33414i[SwipeOrigin.GRID.ordinal()] = 2;
    }
}
