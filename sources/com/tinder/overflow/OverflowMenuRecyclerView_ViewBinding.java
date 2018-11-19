package com.tinder.overflow;

import android.content.Context;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import com.tinder.R;

public final class OverflowMenuRecyclerView_ViewBinding implements Unbinder {
    public void unbind() {
    }

    @UiThread
    @Deprecated
    public OverflowMenuRecyclerView_ViewBinding(OverflowMenuRecyclerView overflowMenuRecyclerView, View view) {
        this(overflowMenuRecyclerView, view.getContext());
    }

    @UiThread
    public OverflowMenuRecyclerView_ViewBinding(OverflowMenuRecyclerView overflowMenuRecyclerView, Context context) {
        overflowMenuRecyclerView.dividerHeight = context.getResources().getDimensionPixelSize(R.dimen.nav_divider_height);
    }
}
