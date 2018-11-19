package com.tinder.profile.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.views.CustomTextView;

public class ProfileRecommendToFriendView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private ProfileRecommendToFriendView f50284b;

    @UiThread
    public ProfileRecommendToFriendView_ViewBinding(ProfileRecommendToFriendView profileRecommendToFriendView, View view) {
        this.f50284b = profileRecommendToFriendView;
        profileRecommendToFriendView.recommendToFriendTextGroup = (ViewGroup) C0761c.b(view, R.id.recommend_to_friend_text_group, "field 'recommendToFriendTextGroup'", ViewGroup.class);
        profileRecommendToFriendView.textRecommendTitle = (CustomTextView) C0761c.b(view, R.id.recommend_title, "field 'textRecommendTitle'", CustomTextView.class);
        profileRecommendToFriendView.textRecommendSubTitle = (CustomTextView) C0761c.b(view, R.id.recommend_subtitle, "field 'textRecommendSubTitle'", CustomTextView.class);
        profileRecommendToFriendView.spinner = (ProgressBar) C0761c.b(view, R.id.spinner, "field 'spinner'", ProgressBar.class);
        profileRecommendToFriendView.recommendFriendTextTemplate = view.getContext().getResources().getString(R.string.profile_recommend_template);
    }

    @CallSuper
    public void unbind() {
        ProfileRecommendToFriendView profileRecommendToFriendView = this.f50284b;
        if (profileRecommendToFriendView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f50284b = null;
        profileRecommendToFriendView.recommendToFriendTextGroup = null;
        profileRecommendToFriendView.textRecommendTitle = null;
        profileRecommendToFriendView.textRecommendSubTitle = null;
        profileRecommendToFriendView.spinner = null;
    }
}
