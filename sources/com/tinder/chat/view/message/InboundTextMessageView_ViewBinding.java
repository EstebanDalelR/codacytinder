package com.tinder.chat.view.message;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.chat.view.ChatAvatarView;

public final class InboundTextMessageView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private InboundTextMessageView f34461b;

    @UiThread
    public InboundTextMessageView_ViewBinding(InboundTextMessageView inboundTextMessageView, View view) {
        this.f34461b = inboundTextMessageView;
        inboundTextMessageView.textMessageContentView = (TextView) C0761c.b(view, R.id.chatTextMessageContent, "field 'textMessageContentView'", TextView.class);
        inboundTextMessageView.heartView = (HeartView) C0761c.b(view, R.id.chatMessageHeart, "field 'heartView'", HeartView.class);
        inboundTextMessageView.avatarView = (ChatAvatarView) C0761c.b(view, R.id.chatMessageAvatar, "field 'avatarView'", ChatAvatarView.class);
        inboundTextMessageView.timestampView = (TextView) C0761c.b(view, R.id.chatMessageTimestamp, "field 'timestampView'", TextView.class);
        view = view.getContext().getResources();
        inboundTextMessageView.emojiOnlyTextSize = view.getDimension(R.dimen.text_xl);
        inboundTextMessageView.textSize = view.getDimension(R.dimen.text_s);
    }

    public void unbind() {
        InboundTextMessageView inboundTextMessageView = this.f34461b;
        if (inboundTextMessageView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f34461b = null;
        inboundTextMessageView.textMessageContentView = null;
        inboundTextMessageView.heartView = null;
        inboundTextMessageView.avatarView = null;
        inboundTextMessageView.timestampView = null;
    }
}
