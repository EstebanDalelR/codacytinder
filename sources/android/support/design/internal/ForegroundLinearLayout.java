package android.support.design.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.design.C0181a.C0180k;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.Gravity;

@RestrictTo({Scope.LIBRARY_GROUP})
public class ForegroundLinearLayout extends LinearLayoutCompat {
    /* renamed from: a */
    protected boolean f8633a;
    /* renamed from: b */
    boolean f8634b;
    /* renamed from: c */
    private Drawable f8635c;
    /* renamed from: d */
    private final Rect f8636d;
    /* renamed from: e */
    private final Rect f8637e;
    /* renamed from: f */
    private int f8638f;

    public ForegroundLinearLayout(Context context) {
        this(context, null);
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8636d = new Rect();
        this.f8637e = new Rect();
        this.f8638f = 119;
        this.f8633a = true;
        this.f8634b = false;
        context = context.obtainStyledAttributes(attributeSet, C0180k.ForegroundLinearLayout, i, 0);
        this.f8638f = context.getInt(C0180k.ForegroundLinearLayout_android_foregroundGravity, this.f8638f);
        attributeSet = context.getDrawable(C0180k.ForegroundLinearLayout_android_foreground);
        if (attributeSet != null) {
            setForeground(attributeSet);
        }
        this.f8633a = context.getBoolean(C0180k.ForegroundLinearLayout_foregroundInsidePadding, true);
        context.recycle();
    }

    public int getForegroundGravity() {
        return this.f8638f;
    }

    public void setForegroundGravity(int i) {
        if (this.f8638f != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f8638f = i;
            if (this.f8638f == 119 && this.f8635c != 0) {
                this.f8635c.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            if (drawable != this.f8635c) {
                return null;
            }
        }
        return true;
    }

    @RequiresApi(11)
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f8635c != null) {
            this.f8635c.jumpToCurrentState();
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f8635c != null && this.f8635c.isStateful()) {
            this.f8635c.setState(getDrawableState());
        }
    }

    public void setForeground(Drawable drawable) {
        if (this.f8635c != drawable) {
            if (this.f8635c != null) {
                this.f8635c.setCallback(null);
                unscheduleDrawable(this.f8635c);
            }
            this.f8635c = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f8638f == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public Drawable getForeground() {
        return this.f8635c;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f8634b = z | this.f8634b;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f8634b = true;
    }

    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (this.f8635c != null) {
            Drawable drawable = this.f8635c;
            if (this.f8634b) {
                this.f8634b = false;
                Rect rect = this.f8636d;
                Rect rect2 = this.f8637e;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f8633a) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f8638f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @RequiresApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        if (this.f8635c != null) {
            this.f8635c.setHotspot(f, f2);
        }
    }
}
