package com.foursquare.pilgrim;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

public final class PilgrimSdkNearbyNotification implements Parcelable {
    public static final Creator<PilgrimSdkNearbyNotification> CREATOR = new C19561();
    /* renamed from: a */
    private List<NearbyVenue> f5258a;

    /* renamed from: com.foursquare.pilgrim.PilgrimSdkNearbyNotification$1 */
    class C19561 implements Creator<PilgrimSdkNearbyNotification> {
        C19561() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6879a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6880a(i);
        }

        /* renamed from: a */
        public PilgrimSdkNearbyNotification m6879a(Parcel parcel) {
            return new PilgrimSdkNearbyNotification(parcel);
        }

        /* renamed from: a */
        public PilgrimSdkNearbyNotification[] m6880a(int i) {
            return new PilgrimSdkNearbyNotification[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected PilgrimSdkNearbyNotification(List<NearbyVenue> list) {
        this.f5258a = list;
    }

    protected PilgrimSdkNearbyNotification(Parcel parcel) {
        this.f5258a = parcel.createTypedArrayList(NearbyVenue.CREATOR);
    }

    public List<NearbyVenue> getNearbyPlaces() {
        return this.f5258a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f5258a);
    }
}
