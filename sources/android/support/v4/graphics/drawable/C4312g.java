package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.graphics.drawable.C2845e.C0453a;
import android.util.Log;
import java.lang.reflect.Method;

@RequiresApi(21)
/* renamed from: android.support.v4.graphics.drawable.g */
class C4312g extends C4018f {
    /* renamed from: d */
    private static Method f14138d;

    /* renamed from: android.support.v4.graphics.drawable.g$a */
    private static class C2847a extends C0453a {
        C2847a(@Nullable C0453a c0453a, @Nullable Resources resources) {
            super(c0453a, resources);
        }

        @NonNull
        public Drawable newDrawable(@Nullable Resources resources) {
            return new C4312g(this, resources);
        }
    }

    C4312g(Drawable drawable) {
        super(drawable);
        m17467c();
    }

    C4312g(C0453a c0453a, Resources resources) {
        super(c0453a, resources);
        m17467c();
    }

    public void setHotspot(float f, float f2) {
        this.c.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.c.setHotspotBounds(i, i2, i3, i4);
    }

    public void getOutline(@NonNull Outline outline) {
        this.c.getOutline(outline);
    }

    @NonNull
    public Rect getDirtyBounds() {
        return this.c.getDirtyBounds();
    }

    public void setTintList(ColorStateList colorStateList) {
        if (mo3663b()) {
            super.setTintList(colorStateList);
        } else {
            this.c.setTintList(colorStateList);
        }
    }

    public void setTint(int i) {
        if (mo3663b()) {
            super.setTint(i);
        } else {
            this.c.setTint(i);
        }
    }

    public void setTintMode(Mode mode) {
        if (mo3663b()) {
            super.setTintMode(mode);
        } else {
            this.c.setTintMode(mode);
        }
    }

    public boolean setState(@NonNull int[] iArr) {
        if (super.setState(iArr) == null) {
            return null;
        }
        invalidateSelf();
        return 1;
    }

    /* renamed from: b */
    protected boolean mo3663b() {
        boolean z = false;
        if (VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.c;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            z = true;
        }
        return z;
    }

    @NonNull
    /* renamed from: a */
    C0453a mo3039a() {
        return new C2847a(this.b, null);
    }

    /* renamed from: c */
    private void m17467c() {
        if (f14138d == null) {
            try {
                f14138d = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Throwable e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }
}
