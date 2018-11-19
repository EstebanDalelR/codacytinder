package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.annotation.DrawableRes;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.design.internal.C0185e;
import android.support.design.internal.C2754c;
import android.support.design.internal.C3991b;
import android.support.v4.content.C0432b;
import android.support.v4.view.AbsSavedState;
import android.support.v7.view.SupportMenuInflater;
import android.support.v7.view.menu.MenuItemImpl;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View.MeasureSpec;

public class NavigationView extends C0185e {
    /* renamed from: d */
    private static final int[] f8722d = new int[]{16842912};
    /* renamed from: e */
    private static final int[] f8723e = new int[]{-16842910};
    /* renamed from: c */
    OnNavigationItemSelectedListener f8724c;
    /* renamed from: f */
    private final C3991b f8725f;
    /* renamed from: g */
    private final C2754c f8726g;
    /* renamed from: h */
    private int f8727h;
    /* renamed from: i */
    private MenuInflater f8728i;

    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(@NonNull MenuItem menuItem);
    }

    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C02101();
        public Bundle menuState;

        /* renamed from: android.support.design.widget.NavigationView$SavedState$1 */
        static class C02101 implements ClassLoaderCreator<SavedState> {
            C02101() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m732a(parcel);
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m733a(parcel, classLoader);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m734a(i);
            }

            /* renamed from: a */
            public SavedState m733a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: a */
            public SavedState m732a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState[] m734a(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.menuState = parcel.readBundle(classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.menuState);
        }
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.menuState = new Bundle();
        this.f8725f.savePresenterStates(savedState.menuState);
        return savedState;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.f8725f.restorePresenterStates(savedState.menuState);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void setNavigationItemSelectedListener(@Nullable OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.f8724c = onNavigationItemSelectedListener;
    }

    protected void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = MeasureSpec.makeMeasureSpec(Math.min(MeasureSpec.getSize(i), this.f8727h), 1073741824);
        } else if (mode == 0) {
            i = MeasureSpec.makeMeasureSpec(this.f8727h, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public Menu getMenu() {
        return this.f8725f;
    }

    public int getHeaderCount() {
        return this.f8726g.m10695a();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.f8726g.m10700b();
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.f8726g.m10697a(colorStateList);
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.f8726g.m10702c();
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.f8726g.m10701b(colorStateList);
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.f8726g.m10703d();
    }

    public void setItemBackgroundResource(@DrawableRes int i) {
        setItemBackground(C0432b.m1640a(getContext(), i));
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.f8726g.m10698a(drawable);
    }

    public void setCheckedItem(@IdRes int i) {
        i = this.f8725f.findItem(i);
        if (i != 0) {
            this.f8726g.m10699a((MenuItemImpl) i);
        }
    }

    public void setItemTextAppearance(@StyleRes int i) {
        this.f8726g.m10696a(i);
    }

    private MenuInflater getMenuInflater() {
        if (this.f8728i == null) {
            this.f8728i = new SupportMenuInflater(getContext());
        }
        return this.f8728i;
    }
}
