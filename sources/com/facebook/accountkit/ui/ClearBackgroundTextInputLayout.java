package com.facebook.accountkit.ui;

import android.content.Context;
import android.support.design.widget.TextInputLayout;
import android.util.AttributeSet;

public class ClearBackgroundTextInputLayout extends TextInputLayout {
    public ClearBackgroundTextInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setError(CharSequence charSequence) {
        super.setError(charSequence);
        m16017a();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        m16017a();
    }

    /* renamed from: a */
    private void m16017a() {
        if (getEditText() != null) {
            getEditText().getBackground().clearColorFilter();
        }
    }
}
