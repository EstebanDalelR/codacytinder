package com.tinder.chat.view;

import android.content.res.Resources;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.shimmy.ShimmerFrameLayout;
import com.tinder.views.AvatarView;

public final class EmptyChatViewContainer_ViewBinding implements Unbinder {
    /* renamed from: b */
    private EmptyChatViewContainer f34351b;

    @UiThread
    public EmptyChatViewContainer_ViewBinding(EmptyChatViewContainer emptyChatViewContainer, View view) {
        this.f34351b = emptyChatViewContainer;
        emptyChatViewContainer.chatTitle = (TextView) C0761c.b(view, R.id.empty_chat_title, "field 'chatTitle'", TextView.class);
        emptyChatViewContainer.timestamp = (TextView) C0761c.b(view, R.id.empty_chat_timestamp, "field 'timestamp'", TextView.class);
        emptyChatViewContainer.avatar = (AvatarView) C0761c.b(view, R.id.empty_chat_avatar, "field 'avatar'", AvatarView.class);
        emptyChatViewContainer.shimmerFrameLayout = (ShimmerFrameLayout) C0761c.b(view, R.id.empty_chat_shimmer_frame_layout, "field 'shimmerFrameLayout'", ShimmerFrameLayout.class);
        emptyChatViewContainer.indicatorBackground = (ImageView) C0761c.b(view, R.id.empty_chat_indicator_background, "field 'indicatorBackground'", ImageView.class);
        emptyChatViewContainer.indicator = (ImageView) C0761c.b(view, R.id.empty_chat_indicator, "field 'indicator'", ImageView.class);
        emptyChatViewContainer.suggestionText = (TextView) C0761c.b(view, R.id.empty_chat_suggested_text, "field 'suggestionText'", TextView.class);
        emptyChatViewContainer.avatarBackground = C0761c.a(view, R.id.empty_chat_avatar_background, "field 'avatarBackground'");
        view = view.getContext();
        Resources resources = view.getResources();
        emptyChatViewContainer.suggestionMessages = resources.getStringArray(R.array.empty_message_suggestions);
        emptyChatViewContainer.boostCircleOverlay = C0432b.a(view, R.drawable.gradient_boost_match_avatar);
        emptyChatViewContainer.goldOverlay = C0432b.a(view, R.drawable.gold_gradient_circle);
        emptyChatViewContainer.superlikeCircleOverlay = C0432b.a(view, R.drawable.gradient_superlike_match_avatar);
        emptyChatViewContainer.placesCircleOverlay = C0432b.a(view, R.drawable.places_gradient_circle);
        emptyChatViewContainer.placesIcon = C0432b.a(view, R.drawable.ic_places_icon_empty_chat);
        emptyChatViewContainer.chatTitlePrefix = resources.getString(R.string.matched_with);
        emptyChatViewContainer.iSuperLikeThemText = resources.getString(R.string.superlike_like_statement);
        emptyChatViewContainer.themSuperLikeMeText = resources.getString(R.string.superlike_liked_statement);
        emptyChatViewContainer.chatTitleBoostCredit = resources.getString(R.string.thanks_to_boost);
        emptyChatViewContainer.chatTitleFastMatchCredit = resources.getString(R.string.thanks_to_tinder_gold);
        emptyChatViewContainer.chatTitleTopPicksCredit = resources.getString(R.string.thanks_to_top_picks);
    }

    public void unbind() {
        EmptyChatViewContainer emptyChatViewContainer = this.f34351b;
        if (emptyChatViewContainer == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f34351b = null;
        emptyChatViewContainer.chatTitle = null;
        emptyChatViewContainer.timestamp = null;
        emptyChatViewContainer.avatar = null;
        emptyChatViewContainer.shimmerFrameLayout = null;
        emptyChatViewContainer.indicatorBackground = null;
        emptyChatViewContainer.indicator = null;
        emptyChatViewContainer.suggestionText = null;
        emptyChatViewContainer.avatarBackground = null;
    }
}
