package com.tinder.chat.view.message;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.chat.view.ChatAvatarView;

public final class InboundImageMessageView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private InboundImageMessageView f34454b;

    @UiThread
    public InboundImageMessageView_ViewBinding(InboundImageMessageView inboundImageMessageView, View view) {
        this.f34454b = inboundImageMessageView;
        inboundImageMessageView.imageView = (MessageImageView) C0761c.b(view, R.id.chat_message_image_view, "field 'imageView'", MessageImageView.class);
        inboundImageMessageView.heartView = (HeartView) C0761c.b(view, R.id.chatMessageHeart, "field 'heartView'", HeartView.class);
        inboundImageMessageView.avatarView = (ChatAvatarView) C0761c.b(view, R.id.chatMessageAvatar, "field 'avatarView'", ChatAvatarView.class);
        inboundImageMessageView.timestampView = (TextView) C0761c.b(view, R.id.chatMessageTimestamp, "field 'timestampView'", TextView.class);
    }

    public void unbind() {
        InboundImageMessageView inboundImageMessageView = this.f34454b;
        if (inboundImageMessageView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f34454b = null;
        inboundImageMessageView.imageView = null;
        inboundImageMessageView.heartView = null;
        inboundImageMessageView.avatarView = null;
        inboundImageMessageView.timestampView = null;
    }
}
