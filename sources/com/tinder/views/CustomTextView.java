package com.tinder.views;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.tinder.utils.CustomFont;
import com.tinder.utils.av;

@Deprecated
public class CustomTextView extends AppCompatTextView {
    public CustomTextView(@NonNull Context context) {
        super(context);
    }

    public CustomTextView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            av.a(this, context, CustomFont.m57581a(context, attributeSet));
        }
    }

    public CustomTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode() == 0) {
            av.a(this, context, CustomFont.m57581a(context, attributeSet));
        }
    }
}
