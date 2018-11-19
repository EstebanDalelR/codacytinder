package com.tinder.views;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

class CustomEditText$a extends InputConnectionWrapper {
    /* renamed from: a */
    final /* synthetic */ CustomEditText f47731a;

    CustomEditText$a(CustomEditText customEditText, InputConnection inputConnection, boolean z) {
        this.f47731a = customEditText;
        super(inputConnection, z);
    }

    public boolean deleteSurroundingText(int i, int i2) {
        if (CustomEditText.a(this.f47731a) != null) {
            CustomEditText.a(this.f47731a).onKey(this.f47731a, 67, new KeyEvent(1, 67));
        }
        return super.deleteSurroundingText(i, i2);
    }
}
