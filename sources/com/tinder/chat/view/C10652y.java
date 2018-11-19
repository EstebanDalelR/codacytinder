package com.tinder.chat.view;

import io.reactivex.functions.Consumer;

/* renamed from: com.tinder.chat.view.y */
final /* synthetic */ class C10652y implements Consumer {
    /* renamed from: a */
    private final ChatInputBoxContainer f34943a;

    C10652y(ChatInputBoxContainer chatInputBoxContainer) {
        this.f34943a = chatInputBoxContainer;
    }

    public void accept(Object obj) {
        this.f34943a.b((Throwable) obj);
    }
}
