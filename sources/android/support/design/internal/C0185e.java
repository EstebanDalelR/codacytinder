package android.support.design.internal;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.widget.FrameLayout;

@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.support.design.internal.e */
public class C0185e extends FrameLayout {
    /* renamed from: a */
    Drawable f599a;
    /* renamed from: b */
    Rect f600b;
    /* renamed from: c */
    private Rect f601c;

    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f600b != null && this.f599a != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            this.f601c.set(0, 0, width, this.f600b.top);
            this.f599a.setBounds(this.f601c);
            this.f599a.draw(canvas);
            this.f601c.set(0, height - this.f600b.bottom, width, height);
            this.f599a.setBounds(this.f601c);
            this.f599a.draw(canvas);
            this.f601c.set(0, this.f600b.top, this.f600b.left, height - this.f600b.bottom);
            this.f599a.setBounds(this.f601c);
            this.f599a.draw(canvas);
            this.f601c.set(width - this.f600b.right, this.f600b.top, width, height - this.f600b.bottom);
            this.f599a.setBounds(this.f601c);
            this.f599a.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f599a != null) {
            this.f599a.setCallback(this);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f599a != null) {
            this.f599a.setCallback(null);
        }
    }
}
