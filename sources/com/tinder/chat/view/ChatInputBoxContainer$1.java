package com.tinder.chat.view;

import android.view.ViewGroup.LayoutParams;
import com.facebook.rebound.C1811f;
import com.facebook.rebound.C3442e;
import java.util.Collections;

class ChatInputBoxContainer$1 extends C3442e {
    /* renamed from: a */
    final /* synthetic */ ChatInputBoxContainer f41084a;

    ChatInputBoxContainer$1(ChatInputBoxContainer chatInputBoxContainer) {
        this.f41084a = chatInputBoxContainer;
    }

    public void onSpringActivate(C1811f c1811f) {
        this.f41084a.gifSelector.setVisibility(0);
    }

    public void onSpringUpdate(C1811f c1811f) {
        LayoutParams layoutParams = this.f41084a.gifSelector.getLayoutParams();
        layoutParams.height = Math.max(0, (int) (c1811f.c() * ((double) this.f41084a.gifSelectorHeight)));
        this.f41084a.gifSelector.setLayoutParams(layoutParams);
    }

    public void onSpringAtRest(C1811f c1811f) {
        if (c1811f.c() == 0.0d) {
            this.f41084a.gifSelector.setVisibility(8);
            this.f41084a.gifSelector.m36177a(Collections.emptyList());
        }
    }
}
