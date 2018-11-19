package android.support.graphics.drawable;

import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.C0450a;
import android.support.v4.graphics.drawable.TintAwareDrawable;

/* renamed from: android.support.graphics.drawable.g */
abstract class C2782g extends Drawable implements TintAwareDrawable {
    /* renamed from: b */
    Drawable f8816b;

    C2782g() {
    }

    public void setColorFilter(int i, Mode mode) {
        if (this.f8816b != null) {
            this.f8816b.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    public ColorFilter getColorFilter() {
        return this.f8816b != null ? C0450a.m1728e(this.f8816b) : null;
    }

    protected boolean onLevelChange(int i) {
        if (this.f8816b != null) {
            return this.f8816b.setLevel(i);
        }
        return super.onLevelChange(i);
    }

    protected void onBoundsChange(Rect rect) {
        if (this.f8816b != null) {
            this.f8816b.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    public void setHotspot(float f, float f2) {
        if (this.f8816b != null) {
            C0450a.m1716a(this.f8816b, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f8816b != null) {
            C0450a.m1718a(this.f8816b, i, i2, i3, i4);
        }
    }

    public void setFilterBitmap(boolean z) {
        if (this.f8816b != null) {
            this.f8816b.setFilterBitmap(z);
        }
    }

    public void jumpToCurrentState() {
        if (this.f8816b != null) {
            C0450a.m1715a(this.f8816b);
        }
    }

    public void applyTheme(Theme theme) {
        if (this.f8816b != null) {
            C0450a.m1720a(this.f8816b, theme);
        }
    }

    public void clearColorFilter() {
        if (this.f8816b != null) {
            this.f8816b.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public Drawable getCurrent() {
        if (this.f8816b != null) {
            return this.f8816b.getCurrent();
        }
        return super.getCurrent();
    }

    public int getMinimumWidth() {
        if (this.f8816b != null) {
            return this.f8816b.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    public int getMinimumHeight() {
        if (this.f8816b != null) {
            return this.f8816b.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    public boolean getPadding(Rect rect) {
        if (this.f8816b != null) {
            return this.f8816b.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    public int[] getState() {
        if (this.f8816b != null) {
            return this.f8816b.getState();
        }
        return super.getState();
    }

    public Region getTransparentRegion() {
        if (this.f8816b != null) {
            return this.f8816b.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    public void setChangingConfigurations(int i) {
        if (this.f8816b != null) {
            this.f8816b.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    public boolean setState(int[] iArr) {
        if (this.f8816b != null) {
            return this.f8816b.setState(iArr);
        }
        return super.setState(iArr);
    }
}
