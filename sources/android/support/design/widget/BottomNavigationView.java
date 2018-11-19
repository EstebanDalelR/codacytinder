package android.support.design.widget;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.annotation.DrawableRes;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.internal.BottomNavigationPresenter;
import android.support.design.internal.C2748a;
import android.support.v4.view.AbsSavedState;
import android.support.v7.view.SupportMenuInflater;
import android.support.v7.view.menu.MenuBuilder;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class BottomNavigationView extends FrameLayout {
    /* renamed from: a */
    private static final int[] f641a = new int[]{16842912};
    /* renamed from: b */
    private static final int[] f642b = new int[]{-16842910};
    /* renamed from: c */
    private final MenuBuilder f643c;
    /* renamed from: d */
    private final C2748a f644d;
    /* renamed from: e */
    private final BottomNavigationPresenter f645e;
    /* renamed from: f */
    private MenuInflater f646f;
    /* renamed from: g */
    private OnNavigationItemSelectedListener f647g;
    /* renamed from: h */
    private OnNavigationItemReselectedListener f648h;

    public interface OnNavigationItemReselectedListener {
        void onNavigationItemReselected(@NonNull MenuItem menuItem);
    }

    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(@NonNull MenuItem menuItem);
    }

    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C01971();
        Bundle menuPresenterState;

        /* renamed from: android.support.design.widget.BottomNavigationView$SavedState$1 */
        static class C01971 implements ClassLoaderCreator<SavedState> {
            C01971() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m655a(parcel);
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m656a(parcel, classLoader);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m657a(i);
            }

            /* renamed from: a */
            public SavedState m656a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: a */
            public SavedState m655a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState[] m657a(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            readFromParcel(parcel, classLoader);
        }

        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.menuPresenterState);
        }

        private void readFromParcel(Parcel parcel, ClassLoader classLoader) {
            this.menuPresenterState = parcel.readBundle(classLoader);
        }
    }

    public int getMaxItemCount() {
        return 5;
    }

    public void setOnNavigationItemSelectedListener(@Nullable OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.f647g = onNavigationItemSelectedListener;
    }

    public void setOnNavigationItemReselectedListener(@Nullable OnNavigationItemReselectedListener onNavigationItemReselectedListener) {
        this.f648h = onNavigationItemReselectedListener;
    }

    @NonNull
    public Menu getMenu() {
        return this.f643c;
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.f644d.getIconTintList();
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.f644d.setIconTintList(colorStateList);
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.f644d.getItemTextColor();
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.f644d.setItemTextColor(colorStateList);
    }

    @DrawableRes
    public int getItemBackgroundResource() {
        return this.f644d.getItemBackgroundRes();
    }

    public void setItemBackgroundResource(@DrawableRes int i) {
        this.f644d.setItemBackgroundRes(i);
    }

    @IdRes
    public int getSelectedItemId() {
        return this.f644d.getSelectedItemId();
    }

    public void setSelectedItemId(@IdRes int i) {
        i = this.f643c.findItem(i);
        if (i != 0 && !this.f643c.performItemAction(i, this.f645e, 0)) {
            i.setChecked(true);
        }
    }

    private MenuInflater getMenuInflater() {
        if (this.f646f == null) {
            this.f646f = new SupportMenuInflater(getContext());
        }
        return this.f646f;
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.menuPresenterState = new Bundle();
        this.f643c.savePresenterStates(savedState.menuPresenterState);
        return savedState;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.f643c.restorePresenterStates(savedState.menuPresenterState);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }
}
