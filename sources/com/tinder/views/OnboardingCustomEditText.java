package com.tinder.views;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

public class OnboardingCustomEditText extends CustomEditText {

    /* renamed from: com.tinder.views.OnboardingCustomEditText$a */
    private class C15437a extends InputConnectionWrapper {
        /* renamed from: a */
        final /* synthetic */ OnboardingCustomEditText f47794a;

        C15437a(OnboardingCustomEditText onboardingCustomEditText, InputConnection inputConnection, boolean z) {
            this.f47794a = onboardingCustomEditText;
            super(inputConnection, z);
        }

        public boolean deleteSurroundingText(int i, int i2) {
            boolean z = true;
            if (i != 1 || i2 != 0) {
                return super.deleteSurroundingText(i, i2);
            }
            if (super.sendKeyEvent(new KeyEvent(0, 67)) == 0 || super.sendKeyEvent(new KeyEvent(1, 67)) == 0) {
                z = false;
            }
            return z;
        }
    }

    public OnboardingCustomEditText(Context context) {
        super(context);
    }

    public OnboardingCustomEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public OnboardingCustomEditText(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return new C15437a(this, super.onCreateInputConnection(editorInfo), true);
    }
}
