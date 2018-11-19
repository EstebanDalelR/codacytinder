package com.tinder.chat.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public class ChatViewContainer_ViewBinding implements Unbinder {
    /* renamed from: b */
    private ChatViewContainer f34347b;

    @UiThread
    public ChatViewContainer_ViewBinding(ChatViewContainer chatViewContainer, View view) {
        this.f34347b = chatViewContainer;
        chatViewContainer.chatRecyclerView = (RecyclerView) C0761c.b(view, R.id.chat_recycler_view, "field 'chatRecyclerView'", RecyclerView.class);
        chatViewContainer.emptyChatContainer = (EmptyChatViewContainer) C0761c.b(view, R.id.empty_chat_container, "field 'emptyChatContainer'", EmptyChatViewContainer.class);
        chatViewContainer.loadingIndicator = (ProgressBar) C0761c.b(view, R.id.chat_loading_indicator, "field 'loadingIndicator'", ProgressBar.class);
    }

    @CallSuper
    public void unbind() {
        ChatViewContainer chatViewContainer = this.f34347b;
        if (chatViewContainer == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f34347b = null;
        chatViewContainer.chatRecyclerView = null;
        chatViewContainer.emptyChatContainer = null;
        chatViewContainer.loadingIndicator = null;
    }
}
