package com.tinder.chat.view.message;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.chat.view.ChatAvatarView;

public final class InboundGifMessageView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private InboundGifMessageView f34451b;

    @UiThread
    public InboundGifMessageView_ViewBinding(InboundGifMessageView inboundGifMessageView, View view) {
        this.f34451b = inboundGifMessageView;
        inboundGifMessageView.gifView = (MessageGifView) C0761c.b(view, R.id.chat_message_gif_view, "field 'gifView'", MessageGifView.class);
        inboundGifMessageView.heartView = (HeartView) C0761c.b(view, R.id.chatMessageHeart, "field 'heartView'", HeartView.class);
        inboundGifMessageView.avatarView = (ChatAvatarView) C0761c.b(view, R.id.chatMessageAvatar, "field 'avatarView'", ChatAvatarView.class);
        inboundGifMessageView.timestampView = (TextView) C0761c.b(view, R.id.chatMessageTimestamp, "field 'timestampView'", TextView.class);
    }

    public void unbind() {
        InboundGifMessageView inboundGifMessageView = this.f34451b;
        if (inboundGifMessageView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f34451b = null;
        inboundGifMessageView.gifView = null;
        inboundGifMessageView.heartView = null;
        inboundGifMessageView.avatarView = null;
        inboundGifMessageView.timestampView = null;
    }
}
