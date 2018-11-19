package com.tinder.chat.view;

import com.facebook.rebound.C1811f;
import com.facebook.rebound.SpringListener;

class ChatInputBoxContainer$3 implements SpringListener {
    /* renamed from: a */
    final /* synthetic */ ChatInputBoxContainer f34328a;

    public void onSpringActivate(C1811f c1811f) {
    }

    public void onSpringEndStateChange(C1811f c1811f) {
    }

    public void onSpringUpdate(C1811f c1811f) {
    }

    ChatInputBoxContainer$3(ChatInputBoxContainer chatInputBoxContainer) {
        this.f34328a = chatInputBoxContainer;
    }

    public void onSpringAtRest(C1811f c1811f) {
        this.f34328a.bitmojiPickerView.setVisibility(8);
        ChatInputBoxContainer.b(this.f34328a).getLayoutParams().height = ChatInputBoxContainer.c(this.f34328a);
        ChatInputBoxContainer.d(this.f34328a).b(this);
    }
}
