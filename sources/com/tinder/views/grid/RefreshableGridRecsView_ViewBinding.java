package com.tinder.views.grid;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.base.view.IdViewAnimator;
import com.tinder.base.view.TouchBlockingFrameLayout;
import com.tinder.cardstack.view.CardGridLayout;

public class RefreshableGridRecsView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private RefreshableGridRecsView f52928b;

    @UiThread
    public RefreshableGridRecsView_ViewBinding(RefreshableGridRecsView refreshableGridRecsView, View view) {
        this.f52928b = refreshableGridRecsView;
        refreshableGridRecsView.swipeRefreshLayout = (SwipeRefreshLayout) C0761c.b(view, R.id.swipe_refresh, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
        refreshableGridRecsView.cardGridLayout = (CardGridLayout) C0761c.b(view, R.id.gridview, "field 'cardGridLayout'", CardGridLayout.class);
        refreshableGridRecsView.emptyGridView = (GridEmptyView) C0761c.b(view, R.id.empty_gridview, "field 'emptyGridView'", GridEmptyView.class);
        refreshableGridRecsView.gridViewContainer = (IdViewAnimator) C0761c.b(view, R.id.gridview_container, "field 'gridViewContainer'", IdViewAnimator.class);
        refreshableGridRecsView.cardGridLayoutBlockingContainter = (TouchBlockingFrameLayout) C0761c.b(view, R.id.gridview_touch_blocking_container, "field 'cardGridLayoutBlockingContainter'", TouchBlockingFrameLayout.class);
        view = view.getContext();
        refreshableGridRecsView.whiteBackgroundColor = C0432b.c(view, R.color.white);
        refreshableGridRecsView.greenBackgroundColor = C0432b.c(view, R.color.green1);
    }

    @CallSuper
    public void unbind() {
        RefreshableGridRecsView refreshableGridRecsView = this.f52928b;
        if (refreshableGridRecsView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f52928b = null;
        refreshableGridRecsView.swipeRefreshLayout = null;
        refreshableGridRecsView.cardGridLayout = null;
        refreshableGridRecsView.emptyGridView = null;
        refreshableGridRecsView.gridViewContainer = null;
        refreshableGridRecsView.cardGridLayoutBlockingContainter = null;
    }
}
