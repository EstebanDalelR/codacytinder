package com.tinder.chat.view.message;

import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public final class OutboundImageMessageView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private OutboundImageMessageView f34471b;

    @UiThread
    public OutboundImageMessageView_ViewBinding(OutboundImageMessageView outboundImageMessageView, View view) {
        this.f34471b = outboundImageMessageView;
        outboundImageMessageView.imageView = (MessageImageView) C0761c.b(view, R.id.chat_message_image_view, "field 'imageView'", MessageImageView.class);
        outboundImageMessageView.heartView = (HeartView) C0761c.b(view, R.id.chatMessageHeart, "field 'heartView'", HeartView.class);
        outboundImageMessageView.timestampView = (TextView) C0761c.b(view, R.id.chatMessageTimestamp, "field 'timestampView'", TextView.class);
        outboundImageMessageView.errorView = C0761c.a(view, R.id.chatMessageError, "field 'errorView'");
        outboundImageMessageView.pendingView = C0761c.a(view, R.id.chatMessagePending, "field 'pendingView'");
        outboundImageMessageView.messageStatusView = (TextView) C0761c.b(view, R.id.chatMessageStatus, "field 'messageStatusView'", TextView.class);
        view = view.getContext();
        outboundImageMessageView.errorStatusColor = C0432b.c(view, R.color.text_semi_dark);
        outboundImageMessageView.sentStatusColor = C0432b.c(view, R.color.text_light);
    }

    public void unbind() {
        OutboundImageMessageView outboundImageMessageView = this.f34471b;
        if (outboundImageMessageView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f34471b = null;
        outboundImageMessageView.imageView = null;
        outboundImageMessageView.heartView = null;
        outboundImageMessageView.timestampView = null;
        outboundImageMessageView.errorView = null;
        outboundImageMessageView.pendingView = null;
        outboundImageMessageView.messageStatusView = null;
    }
}
