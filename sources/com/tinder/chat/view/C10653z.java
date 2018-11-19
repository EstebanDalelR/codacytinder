package com.tinder.chat.view;

import io.reactivex.functions.Consumer;

/* renamed from: com.tinder.chat.view.z */
final /* synthetic */ class C10653z implements Consumer {
    /* renamed from: a */
    private final ChatInputBoxContainer f34944a;

    C10653z(ChatInputBoxContainer chatInputBoxContainer) {
        this.f34944a = chatInputBoxContainer;
    }

    public void accept(Object obj) {
        this.f34944a.c((Integer) obj);
    }
}
