package com.tinder.chat.view.message;

import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public final class OutboundGifMessageView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private OutboundGifMessageView f34468b;

    @UiThread
    public OutboundGifMessageView_ViewBinding(OutboundGifMessageView outboundGifMessageView, View view) {
        this.f34468b = outboundGifMessageView;
        outboundGifMessageView.gifView = (MessageGifView) C0761c.b(view, R.id.chat_message_gif_view, "field 'gifView'", MessageGifView.class);
        outboundGifMessageView.heartView = (HeartView) C0761c.b(view, R.id.chatMessageHeart, "field 'heartView'", HeartView.class);
        outboundGifMessageView.timestampView = (TextView) C0761c.b(view, R.id.chatMessageTimestamp, "field 'timestampView'", TextView.class);
        outboundGifMessageView.errorView = C0761c.a(view, R.id.chatMessageError, "field 'errorView'");
        outboundGifMessageView.pendingView = C0761c.a(view, R.id.chatMessagePending, "field 'pendingView'");
        outboundGifMessageView.messageStatusView = (TextView) C0761c.b(view, R.id.chatMessageStatus, "field 'messageStatusView'", TextView.class);
        view = view.getContext();
        outboundGifMessageView.errorStatusColor = C0432b.c(view, R.color.text_semi_dark);
        outboundGifMessageView.sentStatusColor = C0432b.c(view, R.color.text_light);
    }

    public void unbind() {
        OutboundGifMessageView outboundGifMessageView = this.f34468b;
        if (outboundGifMessageView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f34468b = null;
        outboundGifMessageView.gifView = null;
        outboundGifMessageView.heartView = null;
        outboundGifMessageView.timestampView = null;
        outboundGifMessageView.errorView = null;
        outboundGifMessageView.pendingView = null;
        outboundGifMessageView.messageStatusView = null;
    }
}
