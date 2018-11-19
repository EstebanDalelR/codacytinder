package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/* renamed from: android.support.v4.graphics.drawable.e */
class C2845e extends Drawable implements Callback, TintAwareDrawable, WrappedDrawable {
    /* renamed from: a */
    static final Mode f9035a = Mode.SRC_IN;
    /* renamed from: b */
    C0453a f9036b;
    /* renamed from: c */
    Drawable f9037c;
    /* renamed from: d */
    private int f9038d;
    /* renamed from: e */
    private Mode f9039e;
    /* renamed from: f */
    private boolean f9040f;
    /* renamed from: g */
    private boolean f9041g;

    /* renamed from: android.support.v4.graphics.drawable.e$a */
    protected static abstract class C0453a extends ConstantState {
        /* renamed from: a */
        int f1509a;
        /* renamed from: b */
        ConstantState f1510b;
        /* renamed from: c */
        ColorStateList f1511c = null;
        /* renamed from: d */
        Mode f1512d = C2845e.f9035a;

        @NonNull
        public abstract Drawable newDrawable(@Nullable Resources resources);

        C0453a(@Nullable C0453a c0453a, @Nullable Resources resources) {
            if (c0453a != null) {
                this.f1509a = c0453a.f1509a;
                this.f1510b = c0453a.f1510b;
                this.f1511c = c0453a.f1511c;
                this.f1512d = c0453a.f1512d;
            }
        }

        @NonNull
        public Drawable newDrawable() {
            return newDrawable(null);
        }

        public int getChangingConfigurations() {
            return this.f1509a | (this.f1510b != null ? this.f1510b.getChangingConfigurations() : 0);
        }

        /* renamed from: a */
        boolean m1741a() {
            return this.f1510b != null;
        }
    }

    /* renamed from: android.support.v4.graphics.drawable.e$b */
    private static class C2844b extends C0453a {
        C2844b(@Nullable C0453a c0453a, @Nullable Resources resources) {
            super(c0453a, resources);
        }

        @NonNull
        public Drawable newDrawable(@Nullable Resources resources) {
            return new C2845e(this, resources);
        }
    }

    /* renamed from: b */
    protected boolean mo3663b() {
        return true;
    }

    C2845e(@NonNull C0453a c0453a, @Nullable Resources resources) {
        this.f9036b = c0453a;
        m11248a(resources);
    }

    C2845e(@Nullable Drawable drawable) {
        this.f9036b = mo3039a();
        setWrappedDrawable(drawable);
    }

    /* renamed from: a */
    private void m11248a(@Nullable Resources resources) {
        if (this.f9036b != null && this.f9036b.f1510b != null) {
            setWrappedDrawable(this.f9036b.f1510b.newDrawable(resources));
        }
    }

    public void jumpToCurrentState() {
        this.f9037c.jumpToCurrentState();
    }

    public void draw(@NonNull Canvas canvas) {
        this.f9037c.draw(canvas);
    }

    protected void onBoundsChange(Rect rect) {
        if (this.f9037c != null) {
            this.f9037c.setBounds(rect);
        }
    }

    public void setChangingConfigurations(int i) {
        this.f9037c.setChangingConfigurations(i);
    }

    public int getChangingConfigurations() {
        return (super.getChangingConfigurations() | (this.f9036b != null ? this.f9036b.getChangingConfigurations() : 0)) | this.f9037c.getChangingConfigurations();
    }

    public void setDither(boolean z) {
        this.f9037c.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f9037c.setFilterBitmap(z);
    }

    public void setAlpha(int i) {
        this.f9037c.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f9037c.setColorFilter(colorFilter);
    }

    public boolean isStateful() {
        ColorStateList colorStateList = (!mo3663b() || this.f9036b == null) ? null : this.f9036b.f1511c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f9037c.isStateful();
    }

    public boolean setState(@NonNull int[] iArr) {
        boolean state = this.f9037c.setState(iArr);
        if (m11249a(iArr) == null) {
            if (!state) {
                return null;
            }
        }
        return 1;
    }

    @NonNull
    public int[] getState() {
        return this.f9037c.getState();
    }

    @NonNull
    public Drawable getCurrent() {
        return this.f9037c.getCurrent();
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (!super.setVisible(z, z2)) {
            if (!this.f9037c.setVisible(z, z2)) {
                return false;
            }
        }
        return true;
    }

    public int getOpacity() {
        return this.f9037c.getOpacity();
    }

    public Region getTransparentRegion() {
        return this.f9037c.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.f9037c.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.f9037c.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.f9037c.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.f9037c.getMinimumHeight();
    }

    public boolean getPadding(@NonNull Rect rect) {
        return this.f9037c.getPadding(rect);
    }

    @Nullable
    public ConstantState getConstantState() {
        if (this.f9036b == null || !this.f9036b.m1741a()) {
            return null;
        }
        this.f9036b.f1509a = getChangingConfigurations();
        return this.f9036b;
    }

    @NonNull
    public Drawable mutate() {
        if (!this.f9041g && super.mutate() == this) {
            this.f9036b = mo3039a();
            if (this.f9037c != null) {
                this.f9037c.mutate();
            }
            if (this.f9036b != null) {
                this.f9036b.f1510b = this.f9037c != null ? this.f9037c.getConstantState() : null;
            }
            this.f9041g = true;
        }
        return this;
    }

    @NonNull
    /* renamed from: a */
    C0453a mo3039a() {
        return new C2844b(this.f9036b, null);
    }

    public void invalidateDrawable(@NonNull Drawable drawable) {
        invalidateSelf();
    }

    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        unscheduleSelf(runnable);
    }

    protected boolean onLevelChange(int i) {
        return this.f9037c.setLevel(i);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f9036b.f1511c = colorStateList;
        m11249a(getState());
    }

    public void setTintMode(@NonNull Mode mode) {
        this.f9036b.f1512d = mode;
        m11249a(getState());
    }

    /* renamed from: a */
    private boolean m11249a(int[] iArr) {
        if (!mo3663b()) {
            return false;
        }
        ColorStateList colorStateList = this.f9036b.f1511c;
        Mode mode = this.f9036b.f1512d;
        if (colorStateList == null || mode == null) {
            this.f9040f = false;
            clearColorFilter();
        } else {
            iArr = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f9040f && iArr == this.f9038d && mode == this.f9039e)) {
                setColorFilter(iArr, mode);
                this.f9038d = iArr;
                this.f9039e = mode;
                this.f9040f = true;
                return true;
            }
        }
        return false;
    }

    public final Drawable getWrappedDrawable() {
        return this.f9037c;
    }

    public final void setWrappedDrawable(Drawable drawable) {
        if (this.f9037c != null) {
            this.f9037c.setCallback(null);
        }
        this.f9037c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            if (this.f9036b != null) {
                this.f9036b.f1510b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }
}
