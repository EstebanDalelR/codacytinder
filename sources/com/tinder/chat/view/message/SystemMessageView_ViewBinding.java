package com.tinder.chat.view.message;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public final class SystemMessageView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private SystemMessageView f34481b;

    @UiThread
    public SystemMessageView_ViewBinding(SystemMessageView systemMessageView, View view) {
        this.f34481b = systemMessageView;
        systemMessageView.textMessageContentView = (TextView) C0761c.b(view, R.id.chatTextMessageContent, "field 'textMessageContentView'", TextView.class);
    }

    public void unbind() {
        SystemMessageView systemMessageView = this.f34481b;
        if (systemMessageView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f34481b = null;
        systemMessageView.textMessageContentView = null;
    }
}
