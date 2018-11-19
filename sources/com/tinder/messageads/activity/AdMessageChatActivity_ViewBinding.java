package com.tinder.messageads.activity;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.chat.activity.ChatActivity_ViewBinding;
import com.tinder.chat.view.ChatAvatarView;

public final class AdMessageChatActivity_ViewBinding extends ChatActivity_ViewBinding {
    /* renamed from: b */
    private AdMessageChatActivity f42728b;

    @UiThread
    public AdMessageChatActivity_ViewBinding(AdMessageChatActivity adMessageChatActivity, View view) {
        super(adMessageChatActivity, view);
        this.f42728b = adMessageChatActivity;
        adMessageChatActivity.messageView = (TextView) C0761c.b(view, R.id.ad_message_chat_message, "field 'messageView'", TextView.class);
        adMessageChatActivity.avatarView = (ChatAvatarView) C0761c.b(view, R.id.ad_message_chat_avatar, "field 'avatarView'", ChatAvatarView.class);
    }

    public void unbind() {
        AdMessageChatActivity adMessageChatActivity = this.f42728b;
        if (adMessageChatActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f42728b = null;
        adMessageChatActivity.messageView = null;
        adMessageChatActivity.avatarView = null;
        super.unbind();
    }
}
