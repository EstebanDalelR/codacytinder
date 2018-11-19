package com.tinder.profile.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.viewpagerindicator.CirclePageIndicator;

public class ProfileTopArtistsView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private ProfileTopArtistsView f50297b;

    @UiThread
    public ProfileTopArtistsView_ViewBinding(ProfileTopArtistsView profileTopArtistsView, View view) {
        this.f50297b = profileTopArtistsView;
        profileTopArtistsView.circlePageIndicator = (CirclePageIndicator) C0761c.b(view, R.id.spotify_top_track_indicator, "field 'circlePageIndicator'", CirclePageIndicator.class);
        profileTopArtistsView.viewPager = (ViewPager) C0761c.b(view, R.id.spotify_top_track_view_pager_view, "field 'viewPager'", ViewPager.class);
    }

    @CallSuper
    public void unbind() {
        ProfileTopArtistsView profileTopArtistsView = this.f50297b;
        if (profileTopArtistsView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f50297b = null;
        profileTopArtistsView.circlePageIndicator = null;
        profileTopArtistsView.viewPager = null;
    }
}
