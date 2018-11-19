package com.tinder.fastmatch.view;

import com.tinder.fastmatch.viewmodel.FastMatchPreviewViewModel.CountPosition;
import com.tinder.fastmatch.viewmodel.FastMatchPreviewViewModel.PreviewState;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.fastmatch.view.c */
public final /* synthetic */ class C9418c {
    /* renamed from: a */
    public static final /* synthetic */ int[] f31558a = new int[CountPosition.values().length];
    /* renamed from: b */
    public static final /* synthetic */ int[] f31559b = new int[PreviewState.values().length];

    static {
        f31558a[CountPosition.AVATAR.ordinal()] = 1;
        f31558a[CountPosition.NONE.ordinal()] = 2;
        f31558a[CountPosition.TITLE.ordinal()] = 3;
        f31559b[PreviewState.HAS_LIKES.ordinal()] = 1;
        f31559b[PreviewState.NO_LIKES.ordinal()] = 2;
        f31559b[PreviewState.LOADING.ordinal()] = 3;
    }
}
