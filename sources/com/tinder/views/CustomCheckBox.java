package com.tinder.views;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.AppCompatCheckBox;
import android.util.AttributeSet;
import com.tinder.utils.CustomFont;
import com.tinder.utils.av;

public class CustomCheckBox extends AppCompatCheckBox {
    public CustomCheckBox(Context context) {
        super(context);
    }

    public CustomCheckBox(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        av.a(this, context, CustomFont.m57581a(context, attributeSet));
    }
}
