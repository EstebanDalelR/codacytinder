package com.tinder.views;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import com.tinder.utils.CustomFont;
import com.tinder.utils.av;

public class CustomSwitch extends SwitchCompat {
    public CustomSwitch(@NonNull Context context) {
        super(context);
    }

    public CustomSwitch(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            av.a(this, context, CustomFont.m57581a(context, attributeSet));
        }
    }
}
