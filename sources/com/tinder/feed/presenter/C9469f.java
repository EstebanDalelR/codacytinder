package com.tinder.feed.presenter;

import com.tinder.feed.analytics.session.FeedPositionRequestProvider.Request;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.presenter.f */
public final /* synthetic */ class C9469f {
    /* renamed from: a */
    public static final /* synthetic */ int[] f31767a = new int[Request.values().length];

    static {
        f31767a[Request.FIRST_ITEM_POSITION.ordinal()] = 1;
        f31767a[Request.LAST_ITEM_POSITION.ordinal()] = 2;
    }
}
