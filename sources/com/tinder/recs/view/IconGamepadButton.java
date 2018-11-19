package com.tinder.recs.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.C0432b;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.widget.ImageView.ScaleType;
import com.tinder.C6250b.C6249b;
import com.tinder.R;
import com.tinder.gamepad.view.GamepadButton;

public class IconGamepadButton extends GamepadButton<IconImageView> {

    public static class IconImageView extends AppCompatImageView {
        public IconImageView(Context context, int i) {
            super(context);
            setBackgroundColor(C0432b.c(context, R.color.transparent));
        }

        public IconImageView(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public IconImageView(@NonNull Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }
    }

    public IconGamepadButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IconImageView createContent(AttributeSet attributeSet) {
        attributeSet = getContext().obtainStyledAttributes(attributeSet, C6249b.com_tinder_core_view_IconGamepadButton);
        try {
            int resourceId = attributeSet.getResourceId(1, 0);
            int resourceId2 = attributeSet.getResourceId(0, 0);
            attributeSet = new IconImageView(getContext(), 0);
            attributeSet.setScaleType(ScaleType.FIT_CENTER);
            attributeSet.setImageResource(resourceId);
            attributeSet.setBackgroundResource(resourceId2);
            return attributeSet;
        } finally {
            attributeSet.recycle();
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setBackgroundResource(int i) {
        ((IconImageView) getContent()).setBackgroundResource(i);
    }

    public void onAnimationStart() {
        super.onAnimationStart();
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
    }
}
