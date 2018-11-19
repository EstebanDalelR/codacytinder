package com.tinder.chat.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.chat.view.ChatToolbar;
import com.tinder.reactions.drawer.view.ChatInputEditText;

public class ChatActivity_ViewBinding implements Unbinder {
    /* renamed from: b */
    private ChatActivity f34173b;

    @UiThread
    public ChatActivity_ViewBinding(ChatActivity chatActivity, View view) {
        this.f34173b = chatActivity;
        chatActivity.rootContainer = (ViewGroup) C0761c.b(view, R.id.chatRootContainer, "field 'rootContainer'", ViewGroup.class);
        chatActivity.toolbar = (ChatToolbar) C0761c.b(view, R.id.chat_toolbar, "field 'toolbar'", ChatToolbar.class);
        chatActivity.textMessageEditText = (ChatInputEditText) C0761c.a(view, R.id.chat_input_text, "field 'textMessageEditText'", ChatInputEditText.class);
    }

    @CallSuper
    public void unbind() {
        ChatActivity chatActivity = this.f34173b;
        if (chatActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f34173b = null;
        chatActivity.rootContainer = null;
        chatActivity.toolbar = null;
        chatActivity.textMessageEditText = null;
    }
}
