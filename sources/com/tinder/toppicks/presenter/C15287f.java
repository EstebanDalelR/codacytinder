package com.tinder.toppicks.presenter;

import com.tinder.domain.recs.model.RatingResult;
import com.tinder.domain.recs.model.Swipe.Type;
import com.tinder.domain.recs.model.SwipeOrigin;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.presenter.f */
public final /* synthetic */ class C15287f {
    /* renamed from: a */
    public static final /* synthetic */ int[] f47425a = new int[Type.values().length];
    /* renamed from: b */
    public static final /* synthetic */ int[] f47426b = new int[Type.values().length];
    /* renamed from: c */
    public static final /* synthetic */ int[] f47427c = new int[Type.values().length];
    /* renamed from: d */
    public static final /* synthetic */ int[] f47428d = new int[RatingResult.values().length];
    /* renamed from: e */
    public static final /* synthetic */ int[] f47429e = new int[RatingResult.values().length];
    /* renamed from: f */
    public static final /* synthetic */ int[] f47430f = new int[Type.values().length];
    /* renamed from: g */
    public static final /* synthetic */ int[] f47431g = new int[SwipeOrigin.values().length];

    static {
        f47425a[Type.LIKE.ordinal()] = 1;
        f47425a[Type.PASS.ordinal()] = 2;
        f47425a[Type.SUPERLIKE.ordinal()] = 3;
        f47426b[Type.LIKE.ordinal()] = 1;
        f47426b[Type.PASS.ordinal()] = 2;
        f47426b[Type.SUPERLIKE.ordinal()] = 3;
        f47427c[Type.LIKE.ordinal()] = 1;
        f47427c[Type.SUPERLIKE.ordinal()] = 2;
        f47428d[RatingResult.ERROR.ordinal()] = 1;
        f47428d[RatingResult.BOUNCER.ordinal()] = 2;
        f47428d[RatingResult.SUCCESSFUL.ordinal()] = 3;
        f47429e[RatingResult.ERROR.ordinal()] = 1;
        f47429e[RatingResult.BOUNCER.ordinal()] = 2;
        f47430f[Type.SUPERLIKE.ordinal()] = 1;
        f47430f[Type.LIKE.ordinal()] = 2;
        f47431g[SwipeOrigin.USER_PROFILE.ordinal()] = 1;
        f47431g[SwipeOrigin.GRID.ordinal()] = 2;
    }
}
