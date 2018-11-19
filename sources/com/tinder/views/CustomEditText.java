package com.tinder.views;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.tinder.utils.CustomFont;
import com.tinder.utils.av;

public class CustomEditText extends AppCompatEditText {
    /* renamed from: a */
    private OnKeyListener f14087a;

    public CustomEditText(Context context) {
        super(context);
    }

    public CustomEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        av.m10217a((View) this, context, CustomFont.a(context, attributeSet));
    }

    public CustomEditText(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        av.m10217a((View) this, context, CustomFont.a(context, attributeSet));
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return new CustomEditText$a(this, super.onCreateInputConnection(editorInfo), true);
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (this.f14087a != null) {
            this.f14087a.onKey(this, i, keyEvent);
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public void setOnKeyListener(OnKeyListener onKeyListener) {
        this.f14087a = onKeyListener;
        super.setOnKeyListener(onKeyListener);
    }
}
