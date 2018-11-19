package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View.BaseSavedState;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import java.util.ArrayList;

public class FragmentTabHost extends TabHost implements OnTabChangeListener {
    /* renamed from: a */
    private final ArrayList<C0376a> f1240a;
    /* renamed from: b */
    private Context f1241b;
    /* renamed from: c */
    private FragmentManager f1242c;
    /* renamed from: d */
    private int f1243d;
    /* renamed from: e */
    private OnTabChangeListener f1244e;
    /* renamed from: f */
    private C0376a f1245f;
    /* renamed from: g */
    private boolean f1246g;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C03751();
        String curTab;

        /* renamed from: android.support.v4.app.FragmentTabHost$SavedState$1 */
        static class C03751 implements Creator<SavedState> {
            C03751() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m1369a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m1370a(i);
            }

            /* renamed from: a */
            public SavedState m1369a(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: a */
            public SavedState[] m1370a(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.curTab = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.curTab);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FragmentTabHost.SavedState{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" curTab=");
            stringBuilder.append(this.curTab);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
    }

    /* renamed from: android.support.v4.app.FragmentTabHost$a */
    static final class C0376a {
        @NonNull
        /* renamed from: a */
        final String f1236a;
        @NonNull
        /* renamed from: b */
        final Class<?> f1237b;
        @Nullable
        /* renamed from: c */
        final Bundle f1238c;
        /* renamed from: d */
        Fragment f1239d;
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    public void setOnTabChangedListener(OnTabChangeListener onTabChangeListener) {
        this.f1244e = onTabChangeListener;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f1240a.size();
        C0405n c0405n = null;
        for (int i = 0; i < size; i++) {
            C0376a c0376a = (C0376a) this.f1240a.get(i);
            c0376a.f1239d = this.f1242c.mo428a(c0376a.f1236a);
            if (!(c0376a.f1239d == null || c0376a.f1239d.isDetached())) {
                if (c0376a.f1236a.equals(currentTabTag)) {
                    this.f1245f = c0376a;
                } else {
                    if (c0405n == null) {
                        c0405n = this.f1242c.mo429a();
                    }
                    c0405n.mo409b(c0376a.f1239d);
                }
            }
        }
        this.f1246g = true;
        C0405n a = m1372a(currentTabTag, c0405n);
        if (a != null) {
            a.mo410c();
            this.f1242c.mo436b();
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1246g = false;
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.curTab = getCurrentTabTag();
        return savedState;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            setCurrentTabByTag(savedState.curTab);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void onTabChanged(String str) {
        if (this.f1246g) {
            C0405n a = m1372a(str, null);
            if (a != null) {
                a.mo410c();
            }
        }
        if (this.f1244e != null) {
            this.f1244e.onTabChanged(str);
        }
    }

    @Nullable
    /* renamed from: a */
    private C0405n m1372a(@Nullable String str, @Nullable C0405n c0405n) {
        C0376a a = m1371a(str);
        if (this.f1245f != a) {
            if (c0405n == null) {
                c0405n = this.f1242c.mo429a();
            }
            if (!(this.f1245f == null || this.f1245f.f1239d == null)) {
                c0405n.mo409b(this.f1245f.f1239d);
            }
            if (a != null) {
                if (a.f1239d == null) {
                    a.f1239d = Fragment.instantiate(this.f1241b, a.f1237b.getName(), a.f1238c);
                    c0405n.mo403a(this.f1243d, a.f1239d, a.f1236a);
                } else {
                    c0405n.mo411c(a.f1239d);
                }
            }
            this.f1245f = a;
        }
        return c0405n;
    }

    @Nullable
    /* renamed from: a */
    private C0376a m1371a(String str) {
        int size = this.f1240a.size();
        for (int i = 0; i < size; i++) {
            C0376a c0376a = (C0376a) this.f1240a.get(i);
            if (c0376a.f1236a.equals(str)) {
                return c0376a;
            }
        }
        return null;
    }
}
