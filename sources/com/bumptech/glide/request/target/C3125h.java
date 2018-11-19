package com.bumptech.glide.request.target;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import com.bumptech.glide.load.resource.p028a.C1041b;

/* renamed from: com.bumptech.glide.request.target.h */
public class C3125h extends C1041b {
    /* renamed from: a */
    private C1041b f9679a;
    /* renamed from: b */
    private C1071a f9680b;
    /* renamed from: c */
    private boolean f9681c;

    /* renamed from: com.bumptech.glide.request.target.h$a */
    static class C1071a extends ConstantState {
        /* renamed from: a */
        private final ConstantState f2916a;
        /* renamed from: b */
        private final int f2917b;

        public int getChangingConfigurations() {
            return 0;
        }

        C1071a(C1071a c1071a) {
            this(c1071a.f2916a, c1071a.f2917b);
        }

        C1071a(ConstantState constantState, int i) {
            this.f2916a = constantState;
            this.f2917b = i;
        }

        public Drawable newDrawable() {
            return newDrawable(null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C3125h(this, null, resources);
        }
    }

    public C3125h(C1041b c1041b, int i) {
        this(new C1071a(c1041b.getConstantState(), i), c1041b, 0);
    }

    C3125h(C1071a c1071a, C1041b c1041b, Resources resources) {
        this.f9680b = c1071a;
        if (c1041b != null) {
            this.f9679a = c1041b;
        } else if (resources != null) {
            this.f9679a = (C1041b) c1071a.f2916a.newDrawable(resources);
        } else {
            this.f9679a = (C1041b) c1071a.f2916a.newDrawable();
        }
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f9679a.setBounds(i, i2, i3, i4);
    }

    public void setBounds(Rect rect) {
        super.setBounds(rect);
        this.f9679a.setBounds(rect);
    }

    public void setChangingConfigurations(int i) {
        this.f9679a.setChangingConfigurations(i);
    }

    public int getChangingConfigurations() {
        return this.f9679a.getChangingConfigurations();
    }

    public void setDither(boolean z) {
        this.f9679a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f9679a.setFilterBitmap(z);
    }

    @TargetApi(11)
    public Callback getCallback() {
        return this.f9679a.getCallback();
    }

    @TargetApi(19)
    public int getAlpha() {
        return this.f9679a.getAlpha();
    }

    public void setColorFilter(int i, Mode mode) {
        this.f9679a.setColorFilter(i, mode);
    }

    public void clearColorFilter() {
        this.f9679a.clearColorFilter();
    }

    public Drawable getCurrent() {
        return this.f9679a.getCurrent();
    }

    public boolean setVisible(boolean z, boolean z2) {
        return this.f9679a.setVisible(z, z2);
    }

    public int getIntrinsicWidth() {
        return this.f9680b.f2917b;
    }

    public int getIntrinsicHeight() {
        return this.f9680b.f2917b;
    }

    public int getMinimumWidth() {
        return this.f9679a.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.f9679a.getMinimumHeight();
    }

    public boolean getPadding(Rect rect) {
        return this.f9679a.getPadding(rect);
    }

    public void invalidateSelf() {
        super.invalidateSelf();
        this.f9679a.invalidateSelf();
    }

    public void unscheduleSelf(Runnable runnable) {
        super.unscheduleSelf(runnable);
        this.f9679a.unscheduleSelf(runnable);
    }

    public void scheduleSelf(Runnable runnable, long j) {
        super.scheduleSelf(runnable, j);
        this.f9679a.scheduleSelf(runnable, j);
    }

    public void draw(Canvas canvas) {
        this.f9679a.draw(canvas);
    }

    public void setAlpha(int i) {
        this.f9679a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f9679a.setColorFilter(colorFilter);
    }

    public int getOpacity() {
        return this.f9679a.getOpacity();
    }

    /* renamed from: a */
    public boolean mo1328a() {
        return this.f9679a.mo1328a();
    }

    /* renamed from: a */
    public void mo1327a(int i) {
        this.f9679a.mo1327a(i);
    }

    public void start() {
        this.f9679a.start();
    }

    public void stop() {
        this.f9679a.stop();
    }

    public boolean isRunning() {
        return this.f9679a.isRunning();
    }

    public Drawable mutate() {
        if (!this.f9681c && super.mutate() == this) {
            this.f9679a = (C1041b) this.f9679a.mutate();
            this.f9680b = new C1071a(this.f9680b);
            this.f9681c = true;
        }
        return this;
    }

    public ConstantState getConstantState() {
        return this.f9680b;
    }
}
