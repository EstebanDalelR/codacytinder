package com.tinder.views;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import com.tinder.utils.CustomFont;
import com.tinder.utils.av;

public class CustomButton extends AppCompatButton {
    public CustomButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            av.a(this, context, CustomFont.m57581a(context, attributeSet));
        }
    }
}
