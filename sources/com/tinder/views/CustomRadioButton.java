package com.tinder.views;

import android.content.Context;
import android.support.v7.widget.AppCompatRadioButton;
import android.util.AttributeSet;
import com.tinder.R;
import com.tinder.utils.CustomFont;
import com.tinder.utils.av;

public class CustomRadioButton extends AppCompatRadioButton {
    public CustomRadioButton(Context context) {
        super(context);
        av.a(this, context, R.font.proximanova_regular);
    }

    public CustomRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        av.a(this, context, CustomFont.m57581a(context, attributeSet));
    }

    public CustomRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        av.a(this, context, CustomFont.m57581a(context, attributeSet));
    }
}
