package com.tinder.chat.view.message;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public final class MessageGifView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private MessageGifView f34462b;

    @UiThread
    public MessageGifView_ViewBinding(MessageGifView messageGifView, View view) {
        this.f34462b = messageGifView;
        messageGifView.gifView = (ImageView) C0761c.b(view, R.id.gif_content, "field 'gifView'", ImageView.class);
        messageGifView.loadingIndicator = C0761c.a(view, R.id.loading_indicator, "field 'loadingIndicator'");
    }

    public void unbind() {
        MessageGifView messageGifView = this.f34462b;
        if (messageGifView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f34462b = null;
        messageGifView.gifView = null;
        messageGifView.loadingIndicator = null;
    }
}
