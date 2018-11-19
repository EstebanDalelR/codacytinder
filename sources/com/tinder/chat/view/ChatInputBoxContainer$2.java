package com.tinder.chat.view;

import android.view.ViewGroup.LayoutParams;
import com.facebook.rebound.C1811f;
import com.facebook.rebound.C3442e;

class ChatInputBoxContainer$2 extends C3442e {
    /* renamed from: a */
    final /* synthetic */ ChatInputBoxContainer f41085a;

    ChatInputBoxContainer$2(ChatInputBoxContainer chatInputBoxContainer) {
        this.f41085a = chatInputBoxContainer;
    }

    public void onSpringActivate(C1811f c1811f) {
        this.f41085a.bitmojiPickerView.setVisibility(0);
    }

    public void onSpringUpdate(C1811f c1811f) {
        LayoutParams layoutParams = this.f41085a.bitmojiPickerView.getLayoutParams();
        layoutParams.height = Math.max(0, (int) (c1811f.c() * ((double) ChatInputBoxContainer.a(this.f41085a))));
        this.f41085a.bitmojiPickerView.setLayoutParams(layoutParams);
    }

    public void onSpringAtRest(C1811f c1811f) {
        if (c1811f.c() == 0.0d) {
            this.f41085a.bitmojiPickerView.setVisibility(8);
        }
    }
}
