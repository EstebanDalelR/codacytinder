package com.tinder.views;

import android.content.Context;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import com.tinder.R;

public final class FastMatchEntryLoadingBar_ViewBinding implements Unbinder {
    public void unbind() {
    }

    @UiThread
    @Deprecated
    public FastMatchEntryLoadingBar_ViewBinding(FastMatchEntryLoadingBar fastMatchEntryLoadingBar, View view) {
        this(fastMatchEntryLoadingBar, view.getContext());
    }

    @UiThread
    public FastMatchEntryLoadingBar_ViewBinding(FastMatchEntryLoadingBar fastMatchEntryLoadingBar, Context context) {
        fastMatchEntryLoadingBar.gradientColors = context.getResources().getIntArray(R.array.fast_match_gradient_colors);
    }
}
