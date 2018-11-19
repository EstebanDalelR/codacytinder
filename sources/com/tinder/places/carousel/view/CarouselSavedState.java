package com.tinder.places.carousel.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;

public class CarouselSavedState implements Parcelable {
    public static final Creator<CarouselSavedState> CREATOR = new C101971();
    private final int centerItemPosition;
    private final Parcelable superState;

    /* renamed from: com.tinder.places.carousel.view.CarouselSavedState$1 */
    static class C101971 implements Creator<CarouselSavedState> {
        C101971() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m41505a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m41506a(i);
        }

        /* renamed from: a */
        public CarouselSavedState m41505a(Parcel parcel) {
            return new CarouselSavedState(parcel);
        }

        /* renamed from: a */
        public CarouselSavedState[] m41506a(int i) {
            return new CarouselSavedState[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    private CarouselSavedState(@NonNull Parcel parcel) {
        this.superState = parcel.readParcelable(Parcelable.class.getClassLoader());
        this.centerItemPosition = parcel.readInt();
    }

    public int getCenterItemPosition() {
        return this.centerItemPosition;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.superState, i);
        parcel.writeInt(this.centerItemPosition);
    }
}
