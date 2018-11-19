package com.foursquare.pilgrim;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.foursquare.api.FoursquareLocation;

public final class PilgrimSdkPlaceNotification implements Parcelable {
    public static final Creator<PilgrimSdkPlaceNotification> CREATOR = new C19571();
    @NonNull
    /* renamed from: a */
    private CurrentPlace f5259a;
    @Nullable
    /* renamed from: b */
    private FoursquareLocation f5260b;

    /* renamed from: com.foursquare.pilgrim.PilgrimSdkPlaceNotification$1 */
    class C19571 implements Creator<PilgrimSdkPlaceNotification> {
        C19571() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6881a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6882a(i);
        }

        /* renamed from: a */
        public PilgrimSdkPlaceNotification m6881a(Parcel parcel) {
            return new PilgrimSdkPlaceNotification(parcel);
        }

        /* renamed from: a */
        public PilgrimSdkPlaceNotification[] m6882a(int i) {
            return new PilgrimSdkPlaceNotification[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected PilgrimSdkPlaceNotification(@NonNull CurrentPlace currentPlace, @Nullable FoursquareLocation foursquareLocation) {
        this.f5259a = currentPlace;
        this.f5260b = foursquareLocation;
    }

    protected PilgrimSdkPlaceNotification(Parcel parcel) {
        this.f5259a = (CurrentPlace) parcel.readParcelable(CurrentPlace.class.getClassLoader());
        this.f5260b = (FoursquareLocation) parcel.readParcelable(FoursquareLocation.class.getClassLoader());
    }

    @NonNull
    public CurrentPlace getCurrentPlace() {
        return this.f5259a;
    }

    @Nullable
    @Deprecated
    public FoursquareLocation getCurrentLocation() {
        return this.f5260b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f5259a, i);
        parcel.writeParcelable(this.f5260b, i);
    }
}
