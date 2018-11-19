package com.tinder.dialogs;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.tinder.dialogs.f */
final /* synthetic */ class C8854f implements OnClickListener {
    /* renamed from: a */
    private final C11114d f31011a;
    /* renamed from: b */
    private final OnClickListener f31012b;

    C8854f(C11114d c11114d, OnClickListener onClickListener) {
        this.f31011a = c11114d;
        this.f31012b = onClickListener;
    }

    public void onClick(View view) {
        this.f31011a.m43849a(this.f31012b, view);
    }
}
