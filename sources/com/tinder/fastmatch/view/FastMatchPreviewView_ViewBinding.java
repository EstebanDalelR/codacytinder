package com.tinder.fastmatch.view;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.views.AvatarView;
import com.tinder.views.FastMatchEntryLoadingBar;

public final class FastMatchPreviewView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private FastMatchPreviewView f38130b;

    @UiThread
    public FastMatchPreviewView_ViewBinding(FastMatchPreviewView fastMatchPreviewView, View view) {
        this.f38130b = fastMatchPreviewView;
        fastMatchPreviewView.fastMatchOverlay = (FrameLayout) C0761c.b(view, R.id.fast_match_overlay, "field 'fastMatchOverlay'", FrameLayout.class);
        fastMatchPreviewView.emptyFastMatchOverlay = C0761c.a(view, R.id.empty_fast_match_overlay, "field 'emptyFastMatchOverlay'");
        fastMatchPreviewView.loadingBar = (FastMatchEntryLoadingBar) C0761c.b(view, R.id.loading_bar, "field 'loadingBar'", FastMatchEntryLoadingBar.class);
        fastMatchPreviewView.avatarView = (AvatarView) C0761c.b(view, R.id.match_thumb, "field 'avatarView'", AvatarView.class);
        fastMatchPreviewView.matchIndicatorBackgroundView = C0761c.a(view, R.id.match_attribution_icon_background, "field 'matchIndicatorBackgroundView'");
        fastMatchPreviewView.matchIndicatorView = C0761c.a(view, R.id.match_attribution_icon, "field 'matchIndicatorView'");
        fastMatchPreviewView.nonsubscriberLikesCountBackground = C0761c.a(view, R.id.nonsubscriber_likes_count_background, "field 'nonsubscriberLikesCountBackground'");
        fastMatchPreviewView.nonsubscriberLikesCount = (TextView) C0761c.b(view, R.id.nonsubscriber_likes_count, "field 'nonsubscriberLikesCount'", TextView.class);
        fastMatchPreviewView.emptyCenterView = C0761c.a(view, R.id.fast_match_empty_center_view, "field 'emptyCenterView'");
        fastMatchPreviewView.innerCircleAvatar = C0761c.a(view, R.id.fast_match_avatar_view, "field 'innerCircleAvatar'");
        fastMatchPreviewView.countRangeFormatString = view.getContext().getResources().getString(R.string.count_range_string);
    }

    public void unbind() {
        FastMatchPreviewView fastMatchPreviewView = this.f38130b;
        if (fastMatchPreviewView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f38130b = null;
        fastMatchPreviewView.fastMatchOverlay = null;
        fastMatchPreviewView.emptyFastMatchOverlay = null;
        fastMatchPreviewView.loadingBar = null;
        fastMatchPreviewView.avatarView = null;
        fastMatchPreviewView.matchIndicatorBackgroundView = null;
        fastMatchPreviewView.matchIndicatorView = null;
        fastMatchPreviewView.nonsubscriberLikesCountBackground = null;
        fastMatchPreviewView.nonsubscriberLikesCount = null;
        fastMatchPreviewView.emptyCenterView = null;
        fastMatchPreviewView.innerCircleAvatar = null;
    }
}
