package com.tinder.match.views;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.shimmy.ShimmerFrameLayout;
import com.tinder.views.AvatarView;

public final class NewMatchRowView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private NewMatchRowView f39269b;

    @UiThread
    public NewMatchRowView_ViewBinding(NewMatchRowView newMatchRowView, View view) {
        this.f39269b = newMatchRowView;
        newMatchRowView.avatarView = (AvatarView) C0761c.b(view, R.id.match_thumb, "field 'avatarView'", AvatarView.class);
        newMatchRowView.unviewedIndicator = C0761c.a(view, R.id.imageView_unviewed_indicator, "field 'unviewedIndicator'");
        newMatchRowView.shimmerFrameLayout = (ShimmerFrameLayout) C0761c.b(view, R.id.shimmer_frame_layout, "field 'shimmerFrameLayout'", ShimmerFrameLayout.class);
        newMatchRowView.matchAttributionIcon = (ImageView) C0761c.b(view, R.id.match_attribution_icon, "field 'matchAttributionIcon'", ImageView.class);
        newMatchRowView.goldMatchAttributionBackground = (ImageView) C0761c.b(view, R.id.match_attribution_icon_gold_background, "field 'goldMatchAttributionBackground'", ImageView.class);
        newMatchRowView.name = (TextView) C0761c.b(view, R.id.match_name, "field 'name'", TextView.class);
        newMatchRowView.newMatchRowContainer = (RelativeLayout) C0761c.b(view, R.id.new_match_row_container, "field 'newMatchRowContainer'", RelativeLayout.class);
    }

    public void unbind() {
        NewMatchRowView newMatchRowView = this.f39269b;
        if (newMatchRowView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f39269b = null;
        newMatchRowView.avatarView = null;
        newMatchRowView.unviewedIndicator = null;
        newMatchRowView.shimmerFrameLayout = null;
        newMatchRowView.matchAttributionIcon = null;
        newMatchRowView.goldMatchAttributionBackground = null;
        newMatchRowView.name = null;
        newMatchRowView.newMatchRowContainer = null;
    }
}
