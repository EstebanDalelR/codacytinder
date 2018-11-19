package com.tinder.settings.feed.view;

import android.content.Context;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import com.tinder.R;

public final class FeedSharingOptionsRecyclerView_ViewBinding implements Unbinder {
    public void unbind() {
    }

    @UiThread
    @Deprecated
    public FeedSharingOptionsRecyclerView_ViewBinding(FeedSharingOptionsRecyclerView feedSharingOptionsRecyclerView, View view) {
        this(feedSharingOptionsRecyclerView, view.getContext());
    }

    @UiThread
    public FeedSharingOptionsRecyclerView_ViewBinding(FeedSharingOptionsRecyclerView feedSharingOptionsRecyclerView, Context context) {
        feedSharingOptionsRecyclerView.dividerHeight = context.getResources().getDimensionPixelSize(R.dimen.space_xxxs);
    }
}
