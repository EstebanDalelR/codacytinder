package com.tinder.chat.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tinder.R;

public class AnimationViewContainer extends FrameLayout {
    public AnimationViewContainer(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m36173a();
    }

    /* renamed from: a */
    private void m36173a() {
        inflate(getContext(), R.layout.chat_animation_view_container, this);
    }
}
