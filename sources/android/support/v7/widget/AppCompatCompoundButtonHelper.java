package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.annotation.Nullable;
import android.support.v4.graphics.drawable.C0450a;
import android.support.v4.widget.C0634c;
import android.support.v7.appcompat.C0667R;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;
import android.widget.CompoundButton;

class AppCompatCompoundButtonHelper {
    private ColorStateList mButtonTintList = null;
    private Mode mButtonTintMode = null;
    private boolean mHasButtonTint = false;
    private boolean mHasButtonTintMode = false;
    private boolean mSkipNextApply;
    private final CompoundButton mView;

    interface DirectSetButtonDrawableInterface {
        void setButtonDrawable(Drawable drawable);
    }

    AppCompatCompoundButtonHelper(CompoundButton compoundButton) {
        this.mView = compoundButton;
    }

    void loadFromAttributes(AttributeSet attributeSet, int i) {
        attributeSet = this.mView.getContext().obtainStyledAttributes(attributeSet, C0667R.styleable.CompoundButton, i, 0);
        try {
            if (attributeSet.hasValue(C0667R.styleable.CompoundButton_android_button) != 0) {
                i = attributeSet.getResourceId(C0667R.styleable.CompoundButton_android_button, 0);
                if (i != 0) {
                    this.mView.setButtonDrawable(AppCompatResources.getDrawable(this.mView.getContext(), i));
                }
            }
            if (attributeSet.hasValue(C0667R.styleable.CompoundButton_buttonTint) != 0) {
                C0634c.m2562a(this.mView, attributeSet.getColorStateList(C0667R.styleable.CompoundButton_buttonTint));
            }
            if (attributeSet.hasValue(C0667R.styleable.CompoundButton_buttonTintMode) != 0) {
                C0634c.m2563a(this.mView, DrawableUtils.parseTintMode(attributeSet.getInt(C0667R.styleable.CompoundButton_buttonTintMode, -1), null));
            }
            attributeSet.recycle();
        } catch (Throwable th) {
            attributeSet.recycle();
        }
    }

    void setSupportButtonTintList(ColorStateList colorStateList) {
        this.mButtonTintList = colorStateList;
        this.mHasButtonTint = true;
        applyButtonTint();
    }

    ColorStateList getSupportButtonTintList() {
        return this.mButtonTintList;
    }

    void setSupportButtonTintMode(@Nullable Mode mode) {
        this.mButtonTintMode = mode;
        this.mHasButtonTintMode = true;
        applyButtonTint();
    }

    Mode getSupportButtonTintMode() {
        return this.mButtonTintMode;
    }

    void onSetButtonDrawable() {
        if (this.mSkipNextApply) {
            this.mSkipNextApply = false;
            return;
        }
        this.mSkipNextApply = true;
        applyButtonTint();
    }

    void applyButtonTint() {
        Drawable a = C0634c.m2561a(this.mView);
        if (a == null) {
            return;
        }
        if (this.mHasButtonTint || this.mHasButtonTintMode) {
            a = C0450a.m1730g(a).mutate();
            if (this.mHasButtonTint) {
                C0450a.m1719a(a, this.mButtonTintList);
            }
            if (this.mHasButtonTintMode) {
                C0450a.m1722a(a, this.mButtonTintMode);
            }
            if (a.isStateful()) {
                a.setState(this.mView.getDrawableState());
            }
            this.mView.setButtonDrawable(a);
        }
    }

    int getCompoundPaddingLeft(int i) {
        if (VERSION.SDK_INT >= 17) {
            return i;
        }
        Drawable a = C0634c.m2561a(this.mView);
        return a != null ? i + a.getIntrinsicWidth() : i;
    }
}
