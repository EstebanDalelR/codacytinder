package com.tinder.settings.feed.view;

import android.content.Context;
import android.support.annotation.UiThread;
import android.view.View;
import com.tinder.R;
import com.tinder.settings.views.SwitchRowView;
import com.tinder.settings.views.SwitchRowView_ViewBinding;

public final class FeedSharingOptionItemView_ViewBinding extends SwitchRowView_ViewBinding {
    @UiThread
    @Deprecated
    public FeedSharingOptionItemView_ViewBinding(FeedSharingOptionItemView feedSharingOptionItemView, View view) {
        this(feedSharingOptionItemView, view.getContext());
    }

    @UiThread
    public FeedSharingOptionItemView_ViewBinding(FeedSharingOptionItemView feedSharingOptionItemView, Context context) {
        super((SwitchRowView) feedSharingOptionItemView, context);
        context = context.getResources();
        feedSharingOptionItemView.profileUpdates = context.getString(R.string.feed_setting_option_photos);
        feedSharingOptionItemView.instagram = context.getString(R.string.feed_setting_option_instagram);
        feedSharingOptionItemView.spotifyAnthem = context.getString(R.string.feed_setting_option_spotify_anthem);
        feedSharingOptionItemView.topArtists = context.getString(R.string.feed_setting_option_top_spotify_artists);
    }
}
