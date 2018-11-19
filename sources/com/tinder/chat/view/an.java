package com.tinder.chat.view;

import com.tinder.chat.view.CensorOverflowMenu.Listener;
import kotlin.jvm.functions.Function0;

final /* synthetic */ class an implements Function0 {
    /* renamed from: a */
    private final ChatToolbar f41109a;
    /* renamed from: b */
    private final Listener f41110b;

    an(ChatToolbar chatToolbar, Listener listener) {
        this.f41109a = chatToolbar;
        this.f41110b = listener;
    }

    public Object invoke() {
        return this.f41109a.m42656a(this.f41110b);
    }
}
