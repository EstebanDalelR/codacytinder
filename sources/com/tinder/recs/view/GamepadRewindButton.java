package com.tinder.recs.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0012\u0010\u0011\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/recs/view/GamepadRewindButton;", "Lcom/tinder/recs/view/IconGamepadButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "isAnimating", "", "isButtonEnabled", "onClickListener", "Landroid/view/View$OnClickListener;", "onAnimationEnd", "", "onAnimationStart", "setEnabled", "enabled", "setOnClickListener", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class GamepadRewindButton extends IconGamepadButton {
    private HashMap _$_findViewCache;
    private boolean isAnimating;
    private boolean isButtonEnabled;
    private OnClickListener onClickListener;

    public void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), view);
        return view;
    }

    public GamepadRewindButton(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
    }

    public void setEnabled(boolean z) {
        this.isButtonEnabled = z;
        if (!this.isAnimating) {
            super.setEnabled(z);
        }
    }

    public void setOnClickListener(@Nullable OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
        if (!this.isAnimating) {
            super.setOnClickListener(onClickListener);
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        this.isAnimating = true;
        super.setOnClickListener(null);
        super.setEnabled(true);
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        this.isAnimating = false;
        setRotation(0.0f);
        super.setOnClickListener(this.onClickListener);
        super.setEnabled(this.isButtonEnabled);
    }
}
