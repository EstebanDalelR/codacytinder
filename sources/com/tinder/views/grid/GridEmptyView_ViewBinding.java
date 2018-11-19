package com.tinder.views.grid;

import android.content.Context;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import com.tinder.R;

public final class GridEmptyView_ViewBinding implements Unbinder {
    public void unbind() {
    }

    @UiThread
    @Deprecated
    public GridEmptyView_ViewBinding(GridEmptyView gridEmptyView, View view) {
        this(gridEmptyView, view.getContext());
    }

    @UiThread
    public GridEmptyView_ViewBinding(GridEmptyView gridEmptyView, Context context) {
        gridEmptyView.spanCount = context.getResources().getInteger(R.integer.grid_recs_span_count);
    }
}
