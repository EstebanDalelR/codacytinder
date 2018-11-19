package com.tinder.views;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class AlphaOptimizedView extends View {
    public boolean hasOverlappingRendering() {
        return false;
    }

    public AlphaOptimizedView(Context context) {
        this(context, null);
    }

    public AlphaOptimizedView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
