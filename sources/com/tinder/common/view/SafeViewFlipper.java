package com.tinder.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class SafeViewFlipper extends FrameLayout {
    public SafeViewFlipper(Context context) {
        super(context);
    }

    public SafeViewFlipper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setDisplayedChild(int i) {
        showOnly(i);
    }

    private void showOnly(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (i2 == i) {
                childAt.setVisibility(0);
            } else {
                childAt.setVisibility(8);
            }
        }
    }
}
