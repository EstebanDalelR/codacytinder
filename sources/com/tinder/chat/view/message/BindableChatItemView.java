package com.tinder.chat.view.message;

import com.tinder.chat.view.model.ChatItem;

public interface BindableChatItemView<ITEM extends ChatItem> {
    void bind(ITEM item);
}
