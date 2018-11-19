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

public final class MatchMessagesRowView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private MatchMessagesRowView f39263b;

    @UiThread
    public MatchMessagesRowView_ViewBinding(MatchMessagesRowView matchMessagesRowView, View view) {
        this.f39263b = matchMessagesRowView;
        matchMessagesRowView.avatarView = (AvatarView) C0761c.b(view, R.id.avatar, "field 'avatarView'", AvatarView.class);
        matchMessagesRowView.unviewedIndicator = C0761c.a(view, R.id.unviewed_indicator, "field 'unviewedIndicator'");
        matchMessagesRowView.name = (TextView) C0761c.b(view, R.id.name, "field 'name'", TextView.class);
        matchMessagesRowView.shimmerFrameLayout = (ShimmerFrameLayout) C0761c.b(view, R.id.shimmer_frame_layout, "field 'shimmerFrameLayout'", ShimmerFrameLayout.class);
        matchMessagesRowView.matchAttributionIcon = (ImageView) C0761c.b(view, R.id.match_attribution_icon, "field 'matchAttributionIcon'", ImageView.class);
        matchMessagesRowView.goldAttributionBackground = (ImageView) C0761c.b(view, R.id.match_attribution_icon_gold_background, "field 'goldAttributionBackground'", ImageView.class);
        matchMessagesRowView.replyArrow = C0761c.a(view, R.id.reply_arrow, "field 'replyArrow'");
        matchMessagesRowView.mutedIcon = C0761c.a(view, R.id.mute_icon, "field 'mutedIcon'");
        matchMessagesRowView.message = (TextView) C0761c.b(view, R.id.subtext, "field 'message'", TextView.class);
        matchMessagesRowView.matchRowView = (RelativeLayout) C0761c.b(view, R.id.match_with_message_row_contents, "field 'matchRowView'", RelativeLayout.class);
        matchMessagesRowView.leftMargin = view.getContext().getResources().getDimensionPixelSize(R.dimen.space_s);
    }

    public void unbind() {
        MatchMessagesRowView matchMessagesRowView = this.f39263b;
        if (matchMessagesRowView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f39263b = null;
        matchMessagesRowView.avatarView = null;
        matchMessagesRowView.unviewedIndicator = null;
        matchMessagesRowView.name = null;
        matchMessagesRowView.shimmerFrameLayout = null;
        matchMessagesRowView.matchAttributionIcon = null;
        matchMessagesRowView.goldAttributionBackground = null;
        matchMessagesRowView.replyArrow = null;
        matchMessagesRowView.mutedIcon = null;
        matchMessagesRowView.message = null;
        matchMessagesRowView.matchRowView = null;
    }
}
