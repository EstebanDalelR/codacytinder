package com.foursquare.pilgrim;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;

public final class PilgrimSdkBackfillNotification implements Parcelable {
    public static final Creator<PilgrimSdkBackfillNotification> CREATOR = new C19551();
    @NonNull
    /* renamed from: a */
    private CurrentPlace f5257a;

    /* renamed from: com.foursquare.pilgrim.PilgrimSdkBackfillNotification$1 */
    class C19551 implements Creator<PilgrimSdkBackfillNotification> {
        C19551() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6877a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6878a(i);
        }

        /* renamed from: a */
        public PilgrimSdkBackfillNotification m6877a(Parcel parcel) {
            return new PilgrimSdkBackfillNotification(parcel);
        }

        /* renamed from: a */
        public PilgrimSdkBackfillNotification[] m6878a(int i) {
            return new PilgrimSdkBackfillNotification[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected PilgrimSdkBackfillNotification(@NonNull CurrentPlace currentPlace) {
        this.f5257a = currentPlace;
    }

    protected PilgrimSdkBackfillNotification(@NonNull Parcel parcel) {
        this.f5257a = (CurrentPlace) parcel.readParcelable(CurrentPlace.class.getClassLoader());
    }

    @NonNull
    public CurrentPlace getCurrentPlace() {
        return this.f5257a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f5257a, i);
    }
}
