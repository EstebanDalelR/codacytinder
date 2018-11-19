package com.foursquare.pilgrim;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import com.foursquare.api.types.FoursquareType;
import com.foursquare.api.types.Venue;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

public class NearbyVenue implements Parcelable, FoursquareType {
    public static final Creator<NearbyVenue> CREATOR = new C19531();
    @SerializedName("matchTypes")
    /* renamed from: a */
    private List<String> f10587a;
    @SerializedName("venue")
    /* renamed from: b */
    private Venue f10588b;

    /* renamed from: com.foursquare.pilgrim.NearbyVenue$1 */
    class C19531 implements Creator<NearbyVenue> {
        C19531() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6868a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6869a(i);
        }

        /* renamed from: a */
        public NearbyVenue m6868a(Parcel parcel) {
            return new NearbyVenue(parcel);
        }

        /* renamed from: a */
        public NearbyVenue[] m6869a(int i) {
            return new NearbyVenue[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    protected NearbyVenue(Parcel parcel) {
        this.f10587a = parcel.createStringArrayList();
        this.f10588b = (Venue) parcel.readParcelable(Venue.class.getClassLoader());
    }

    @NonNull
    public List<TriggerPlaceType> getMatchTypes() {
        List<TriggerPlaceType> arrayList = new ArrayList(this.f10587a != null ? this.f10587a.size() : 0);
        if (this.f10587a != null) {
            for (String valueOfIgnoreCase : this.f10587a) {
                arrayList.add(TriggerPlaceType.valueOfIgnoreCase(valueOfIgnoreCase));
            }
        }
        return arrayList;
    }

    @NonNull
    public Venue getVenue() {
        return this.f10588b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f10587a);
        parcel.writeParcelable(this.f10588b, i);
    }
}
