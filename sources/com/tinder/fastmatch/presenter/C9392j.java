package com.tinder.fastmatch.presenter;

import com.tinder.domain.recs.model.RatingResult;
import com.tinder.domain.recs.model.Swipe.Type;
import com.tinder.domain.recs.model.SwipeOrigin;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.fastmatch.presenter.j */
public final /* synthetic */ class C9392j {
    /* renamed from: a */
    public static final /* synthetic */ int[] f31495a = new int[Type.values().length];
    /* renamed from: b */
    public static final /* synthetic */ int[] f31496b = new int[RatingResult.values().length];
    /* renamed from: c */
    public static final /* synthetic */ int[] f31497c = new int[Type.values().length];
    /* renamed from: d */
    public static final /* synthetic */ int[] f31498d = new int[Type.values().length];
    /* renamed from: e */
    public static final /* synthetic */ int[] f31499e = new int[Type.values().length];
    /* renamed from: f */
    public static final /* synthetic */ int[] f31500f = new int[SwipeOrigin.values().length];

    static {
        f31495a[Type.LIKE.ordinal()] = 1;
        f31495a[Type.SUPERLIKE.ordinal()] = 2;
        f31496b[RatingResult.ERROR.ordinal()] = 1;
        f31496b[RatingResult.BOUNCER.ordinal()] = 2;
        f31497c[Type.SUPERLIKE.ordinal()] = 1;
        f31497c[Type.LIKE.ordinal()] = 2;
        f31498d[Type.LIKE.ordinal()] = 1;
        f31498d[Type.PASS.ordinal()] = 2;
        f31498d[Type.SUPERLIKE.ordinal()] = 3;
        f31499e[Type.LIKE.ordinal()] = 1;
        f31499e[Type.PASS.ordinal()] = 2;
        f31499e[Type.SUPERLIKE.ordinal()] = 3;
        f31500f[SwipeOrigin.USER_PROFILE.ordinal()] = 1;
        f31500f[SwipeOrigin.GRID.ordinal()] = 2;
    }
}
