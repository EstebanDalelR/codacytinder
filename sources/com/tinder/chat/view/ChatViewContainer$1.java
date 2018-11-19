package com.tinder.chat.view;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;

class ChatViewContainer$1 extends OnScrollListener {
    /* renamed from: a */
    final /* synthetic */ ChatViewContainer f34346a;

    ChatViewContainer$1(ChatViewContainer chatViewContainer) {
        this.f34346a = chatViewContainer;
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        super.onScrolled(recyclerView, i, i2);
        recyclerView = recyclerView.getLayoutManager();
        if ((recyclerView instanceof LinearLayoutManager) == 0) {
            throw new IllegalArgumentException("layoutManager needs to be a LinearLayoutManager");
        }
        ChatViewContainer.a(this.f34346a, ((LinearLayoutManager) recyclerView).findFirstVisibleItemPosition() == null ? true : null);
    }
}
