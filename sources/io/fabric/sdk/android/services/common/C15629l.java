package io.fabric.sdk.android.services.common;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: io.fabric.sdk.android.services.common.l */
public class C15629l {
    /* renamed from: a */
    public static int m58705a(int i) {
        return (i < Callback.DEFAULT_DRAG_ANIMATION_DURATION || i > 299) ? (i < MapboxConstants.ANIMATION_DURATION || i > 399) ? (i < 400 || i > 499) ? i >= 500 ? 1 : 1 : 0 : 1 : 0;
    }
}
