package com.tinder.recs.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import com.tinder.gamepad.view.GamepadButton;
import com.tinder.recs.view.LikeMeter.AssetMode;
import com.tinder.utils.av;

public class LikeButton extends GamepadButton<LikeMeter> {
    public LikeButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LikeMeter createContent(AttributeSet attributeSet) {
        return new LikeMeter(getContext(), (int) av.a(33.0f, getContext()));
    }

    @Nullable
    public LikeMeter getLikeMeter() {
        return (LikeMeter) getContent();
    }

    public void setAssetMode(AssetMode assetMode) {
        LikeMeter likeMeter = (LikeMeter) getContent();
        if (likeMeter != null) {
            likeMeter.setAssetMode(assetMode);
        }
    }
}
