package com.tinder.chat.view;

import android.view.View;
import android.view.View.OnFocusChangeListener;

/* renamed from: com.tinder.chat.view.i */
final /* synthetic */ class C8470i implements OnFocusChangeListener {
    /* renamed from: a */
    private final ChatInputBoxContainer f30149a;

    C8470i(ChatInputBoxContainer chatInputBoxContainer) {
        this.f30149a = chatInputBoxContainer;
    }

    public void onFocusChange(View view, boolean z) {
        this.f30149a.a(view, z);
    }
}
