package com.tinder.fastmatch.view;

import android.support.annotation.UiThread;
import android.view.View;
import com.tinder.R;
import com.tinder.views.grid.RefreshableGridRecsView_ViewBinding;

public final class FastMatchRecsView_ViewBinding extends RefreshableGridRecsView_ViewBinding {
    @UiThread
    public FastMatchRecsView_ViewBinding(FastMatchRecsView fastMatchRecsView, View view) {
        super(fastMatchRecsView, view);
        view = view.getContext().getResources();
        fastMatchRecsView.successTitleText = view.getString(R.string.its_a_match);
        fastMatchRecsView.errorTitleText = view.getString(R.string.error);
    }
}
