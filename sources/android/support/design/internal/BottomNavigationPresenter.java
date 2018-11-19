package android.support.design.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuPresenter;
import android.support.v7.view.menu.MenuPresenter.Callback;
import android.support.v7.view.menu.MenuView;
import android.support.v7.view.menu.SubMenuBuilder;
import android.view.ViewGroup;

@RestrictTo({Scope.LIBRARY_GROUP})
public class BottomNavigationPresenter implements MenuPresenter {
    /* renamed from: a */
    private MenuBuilder f8629a;
    /* renamed from: b */
    private C2748a f8630b;
    /* renamed from: c */
    private boolean f8631c;
    /* renamed from: d */
    private int f8632d;

    static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new C01821();
        int selectedItemId;

        /* renamed from: android.support.design.internal.BottomNavigationPresenter$SavedState$1 */
        static class C01821 implements Creator<SavedState> {
            C01821() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m608a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m609a(i);
            }

            /* renamed from: a */
            public SavedState m608a(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: a */
            public SavedState[] m609a(int i) {
                return new SavedState[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        SavedState() {
        }

        SavedState(Parcel parcel) {
            this.selectedItemId = parcel.readInt();
        }

        public void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeInt(this.selectedItemId);
        }
    }

    public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public boolean flagActionItems() {
        return false;
    }

    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
    }

    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    public void setCallback(Callback callback) {
    }

    public void initForMenu(Context context, MenuBuilder menuBuilder) {
        this.f8630b.initialize(this.f8629a);
        this.f8629a = menuBuilder;
    }

    public MenuView getMenuView(ViewGroup viewGroup) {
        return this.f8630b;
    }

    public void updateMenuView(boolean z) {
        if (!this.f8631c) {
            if (z) {
                this.f8630b.m10680a();
            } else {
                this.f8630b.m10682b();
            }
        }
    }

    public int getId() {
        return this.f8632d;
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState();
        savedState.selectedItemId = this.f8630b.getSelectedItemId();
        return savedState;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f8630b.m10681a(((SavedState) parcelable).selectedItemId);
        }
    }

    /* renamed from: a */
    public void m10677a(boolean z) {
        this.f8631c = z;
    }
}
