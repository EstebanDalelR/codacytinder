package com.tinder.chat.view;

import io.reactivex.functions.Consumer;

final /* synthetic */ class ac implements Consumer {
    /* renamed from: a */
    private final ChatInputBoxContainer f34354a;

    ac(ChatInputBoxContainer chatInputBoxContainer) {
        this.f34354a = chatInputBoxContainer;
    }

    public void accept(Object obj) {
        this.f34354a.a((Integer) obj);
    }
}
