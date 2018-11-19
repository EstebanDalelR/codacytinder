package com.tinder.chat.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import com.tinder.chat.view.message.BindableChatItemView;
import com.tinder.chat.view.message.SimpleBindableChatItemView;
import com.tinder.chat.view.model.ChatItem;

/* renamed from: com.tinder.chat.adapter.c */
public class C10518c extends ViewHolder {
    public C10518c(@NonNull View view) {
        super(view);
    }

    /* renamed from: a */
    public void m42492a(@NonNull ChatItem chatItem) {
        if (this.itemView instanceof BindableChatItemView) {
            ((BindableChatItemView) this.itemView).bind(chatItem);
        } else if ((this.itemView instanceof SimpleBindableChatItemView) != null) {
            ((SimpleBindableChatItemView) this.itemView).bind();
        }
    }
}
