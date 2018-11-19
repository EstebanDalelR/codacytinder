package com.tinder.fastmatch.view;

import android.content.res.Resources;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.views.AvatarView;
import com.tinder.views.CustomTextView;

public final class FastMatchNotificationView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private FastMatchNotificationView f38118b;

    @UiThread
    public FastMatchNotificationView_ViewBinding(FastMatchNotificationView fastMatchNotificationView, View view) {
        this.f38118b = fastMatchNotificationView;
        fastMatchNotificationView.avatarView = (AvatarView) C0761c.b(view, R.id.match_avatar, "field 'avatarView'", AvatarView.class);
        fastMatchNotificationView.titleTextView = (CustomTextView) C0761c.b(view, R.id.notification_title, "field 'titleTextView'", CustomTextView.class);
        fastMatchNotificationView.messageTextView = (CustomTextView) C0761c.b(view, R.id.notification_message, "field 'messageTextView'", CustomTextView.class);
        fastMatchNotificationView.tapToViewIconImageView = (ImageView) C0761c.b(view, R.id.notification_arrow, "field 'tapToViewIconImageView'", ImageView.class);
        view = view.getContext();
        Resources resources = view.getResources();
        fastMatchNotificationView.errorBackgroundColor = C0432b.c(view, R.color.red1);
        fastMatchNotificationView.padding = resources.getDimensionPixelSize(R.dimen.margin_small);
        fastMatchNotificationView.successBackgroundGradient = C0432b.a(view, R.drawable.fast_match_success_notification_gradient);
        fastMatchNotificationView.successTapToViewIcon = C0432b.a(view, R.drawable.ic_fastmatch_notification_success);
        fastMatchNotificationView.errorTapToViewIcon = C0432b.a(view, R.drawable.ic_fastmatch_notification_error);
        fastMatchNotificationView.successTitleText = resources.getString(R.string.its_a_match);
        fastMatchNotificationView.errorTitleText = resources.getString(R.string.error);
    }

    public void unbind() {
        FastMatchNotificationView fastMatchNotificationView = this.f38118b;
        if (fastMatchNotificationView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f38118b = null;
        fastMatchNotificationView.avatarView = null;
        fastMatchNotificationView.titleTextView = null;
        fastMatchNotificationView.messageTextView = null;
        fastMatchNotificationView.tapToViewIconImageView = null;
    }
}
