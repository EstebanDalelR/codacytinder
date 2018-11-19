package com.tinder.onboarding.view;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java8.util.function.Consumer;

/* renamed from: com.tinder.onboarding.view.l */
final /* synthetic */ class C12214l implements Consumer {
    /* renamed from: a */
    private final View f39570a;

    C12214l(View view) {
        this.f39570a = view;
    }

    public void accept(Object obj) {
        ((InputMethodManager) obj).showSoftInput(this.f39570a, 1);
    }
}
