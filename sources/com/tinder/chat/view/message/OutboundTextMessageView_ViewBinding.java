package com.tinder.chat.view.message;

import android.content.res.Resources;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public final class OutboundTextMessageView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private OutboundTextMessageView f34480b;

    @UiThread
    public OutboundTextMessageView_ViewBinding(OutboundTextMessageView outboundTextMessageView, View view) {
        this.f34480b = outboundTextMessageView;
        outboundTextMessageView.textMessageContentView = (TextView) C0761c.b(view, R.id.chatTextMessageContent, "field 'textMessageContentView'", TextView.class);
        outboundTextMessageView.heartView = (HeartView) C0761c.b(view, R.id.chatMessageHeart, "field 'heartView'", HeartView.class);
        outboundTextMessageView.errorView = C0761c.a(view, R.id.chatMessageError, "field 'errorView'");
        outboundTextMessageView.pendingView = C0761c.a(view, R.id.chatMessagePending, "field 'pendingView'");
        outboundTextMessageView.messageStatusView = (TextView) C0761c.b(view, R.id.chatMessageStatus, "field 'messageStatusView'", TextView.class);
        outboundTextMessageView.timestampView = (TextView) C0761c.b(view, R.id.chatMessageTimestamp, "field 'timestampView'", TextView.class);
        view = view.getContext();
        Resources resources = view.getResources();
        outboundTextMessageView.errorStatusColor = C0432b.c(view, R.color.text_semi_dark);
        outboundTextMessageView.sentStatusColor = C0432b.c(view, R.color.text_light);
        outboundTextMessageView.emojiOnlyTextSize = resources.getDimension(R.dimen.text_xl);
        outboundTextMessageView.textSize = resources.getDimension(R.dimen.text_s);
    }

    public void unbind() {
        OutboundTextMessageView outboundTextMessageView = this.f34480b;
        if (outboundTextMessageView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f34480b = null;
        outboundTextMessageView.textMessageContentView = null;
        outboundTextMessageView.heartView = null;
        outboundTextMessageView.errorView = null;
        outboundTextMessageView.pendingView = null;
        outboundTextMessageView.messageStatusView = null;
        outboundTextMessageView.timestampView = null;
    }
}
