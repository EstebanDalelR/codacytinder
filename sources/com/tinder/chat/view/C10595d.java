package com.tinder.chat.view;

import android.view.MotionEvent;
import com.tinder.reactions.drawer.view.OnTouchInterceptor;

/* renamed from: com.tinder.chat.view.d */
final /* synthetic */ class C10595d implements OnTouchInterceptor {
    /* renamed from: a */
    static final OnTouchInterceptor f34447a = new C10595d();

    private C10595d() {
    }

    public MotionEvent OnTouch(MotionEvent motionEvent) {
        return ChatInputBoxContainer.a(motionEvent);
    }
}
