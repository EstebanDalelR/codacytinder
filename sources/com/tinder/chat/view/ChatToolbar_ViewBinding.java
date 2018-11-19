package com.tinder.chat.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.views.AvatarView;
import com.tinder.views.BadgeView;
import com.tinder.views.CustomTextView;

public class ChatToolbar_ViewBinding implements Unbinder {
    /* renamed from: b */
    private ChatToolbar f34345b;

    @UiThread
    public ChatToolbar_ViewBinding(ChatToolbar chatToolbar, View view) {
        this.f34345b = chatToolbar;
        chatToolbar.avatarView = (AvatarView) C0761c.b(view, R.id.img_avatar, "field 'avatarView'", AvatarView.class);
        chatToolbar.userNameText = (CustomTextView) C0761c.b(view, R.id.chat_toolbar_user_name, "field 'userNameText'", CustomTextView.class);
        chatToolbar.badgeView = (BadgeView) C0761c.b(view, R.id.verified_badge, "field 'badgeView'", BadgeView.class);
        chatToolbar.overflowMenu = (CensorOverflowMenu) C0761c.b(view, R.id.img_overflow, "field 'overflowMenu'", CensorOverflowMenu.class);
        chatToolbar.chatOverflowButton = (ChatOverflowButton) C0761c.b(view, R.id.chat_overflow_button, "field 'chatOverflowButton'", ChatOverflowButton.class);
    }

    @CallSuper
    public void unbind() {
        ChatToolbar chatToolbar = this.f34345b;
        if (chatToolbar == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f34345b = null;
        chatToolbar.avatarView = null;
        chatToolbar.userNameText = null;
        chatToolbar.badgeView = null;
        chatToolbar.overflowMenu = null;
        chatToolbar.chatOverflowButton = null;
    }
}
