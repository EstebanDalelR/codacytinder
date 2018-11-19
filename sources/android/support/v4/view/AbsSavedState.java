package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public abstract class AbsSavedState implements Parcelable {
    public static final Creator<AbsSavedState> CREATOR = new C05652();
    public static final AbsSavedState EMPTY_STATE = new C28821();
    private final Parcelable mSuperState;

    /* renamed from: android.support.v4.view.AbsSavedState$2 */
    static class C05652 implements ClassLoaderCreator<AbsSavedState> {
        C05652() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m2097a(parcel);
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return m2098a(parcel, classLoader);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m2099a(i);
        }

        /* renamed from: a */
        public AbsSavedState m2098a(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.EMPTY_STATE;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: a */
        public AbsSavedState m2097a(Parcel parcel) {
            return m2098a(parcel, null);
        }

        /* renamed from: a */
        public AbsSavedState[] m2099a(int i) {
            return new AbsSavedState[i];
        }
    }

    /* renamed from: android.support.v4.view.AbsSavedState$1 */
    static class C28821 extends AbsSavedState {
        C28821() {
            super();
        }
    }

    public int describeContents() {
        return 0;
    }

    private AbsSavedState() {
        this.mSuperState = null;
    }

    protected AbsSavedState(@NonNull Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        if (parcelable == EMPTY_STATE) {
            parcelable = null;
        }
        this.mSuperState = parcelable;
    }

    protected AbsSavedState(@NonNull Parcel parcel) {
        this(parcel, null);
    }

    protected AbsSavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
        parcel = parcel.readParcelable(classLoader);
        if (parcel == null) {
            parcel = EMPTY_STATE;
        }
        this.mSuperState = parcel;
    }

    @Nullable
    public final Parcelable getSuperState() {
        return this.mSuperState;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mSuperState, i);
    }
}
