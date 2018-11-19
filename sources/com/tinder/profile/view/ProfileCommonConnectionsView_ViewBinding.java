package com.tinder.profile.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.views.CustomTextView;
import com.viewpagerindicator.CirclePageIndicator;

public class ProfileCommonConnectionsView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private ProfileCommonConnectionsView f50257b;

    @UiThread
    public ProfileCommonConnectionsView_ViewBinding(ProfileCommonConnectionsView profileCommonConnectionsView, View view) {
        this.f50257b = profileCommonConnectionsView;
        profileCommonConnectionsView.profileConnectionsTitleText = (CustomTextView) C0761c.b(view, R.id.profile_connections_title, "field 'profileConnectionsTitleText'", CustomTextView.class);
        profileCommonConnectionsView.profileConnectionsViewpager = (ViewPager) C0761c.b(view, R.id.profile_connections_viewpager, "field 'profileConnectionsViewpager'", ViewPager.class);
        profileCommonConnectionsView.profileConnectionsCirclePageIndicator = (CirclePageIndicator) C0761c.b(view, R.id.profile_connections_indicator, "field 'profileConnectionsCirclePageIndicator'", CirclePageIndicator.class);
    }

    @CallSuper
    public void unbind() {
        ProfileCommonConnectionsView profileCommonConnectionsView = this.f50257b;
        if (profileCommonConnectionsView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f50257b = null;
        profileCommonConnectionsView.profileConnectionsTitleText = null;
        profileCommonConnectionsView.profileConnectionsViewpager = null;
        profileCommonConnectionsView.profileConnectionsCirclePageIndicator = null;
    }
}
