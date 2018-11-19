package com.foursquare.pilgrim;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.foursquare.api.FoursquareLocation;
import com.foursquare.api.types.Venue;
import com.foursquare.internal.util.C1940b;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;

public final class CurrentPlace implements Parcelable {
    public static final Creator<CurrentPlace> CREATOR = new C19511();
    @SerializedName("pilgrimVisitId")
    /* renamed from: a */
    private String f5230a;
    @SerializedName("venue")
    /* renamed from: b */
    private Venue f5231b;
    @SerializedName("type")
    /* renamed from: c */
    private RegionType f5232c;
    @SerializedName("arrival")
    /* renamed from: d */
    private long f5233d = 0;
    @SerializedName("departure")
    /* renamed from: e */
    private long f5234e = 0;
    @SerializedName("confidence")
    /* renamed from: f */
    private Confidence f5235f;
    @SerializedName("location")
    /* renamed from: g */
    private FoursquareLocation f5236g;
    @SerializedName("wifi")
    /* renamed from: h */
    private String f5237h;
    @SerializedName("otherPossibleVenues")
    /* renamed from: i */
    private List<Venue> f5238i;
    @SerializedName("isBackfill")
    /* renamed from: j */
    private boolean f5239j;
    @SerializedName("sentArrivalTrigger")
    /* renamed from: k */
    private boolean f5240k;

    /* renamed from: com.foursquare.pilgrim.CurrentPlace$1 */
    class C19511 implements Creator<CurrentPlace> {
        C19511() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6853a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6854a(i);
        }

        /* renamed from: a */
        public CurrentPlace m6853a(Parcel parcel) {
            return new CurrentPlace(parcel);
        }

        /* renamed from: a */
        public CurrentPlace[] m6854a(int i) {
            return new CurrentPlace[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    CurrentPlace(Venue venue, @NonNull RegionType regionType, long j, Confidence confidence, String str, FoursquareLocation foursquareLocation, String str2, List<Venue> list, boolean z) {
        this.f5230a = str;
        this.f5231b = venue;
        this.f5232c = regionType;
        this.f5233d = j;
        this.f5235f = confidence;
        this.f5236g = foursquareLocation;
        this.f5237h = str2;
        this.f5238i = list;
        this.f5239j = z;
    }

    protected CurrentPlace(Parcel parcel) {
        this.f5230a = parcel.readString();
        this.f5231b = (Venue) parcel.readParcelable(Venue.class.getClassLoader());
        this.f5233d = parcel.readLong();
        this.f5234e = parcel.readLong();
        this.f5232c = (RegionType) parcel.readSerializable();
        this.f5235f = (Confidence) parcel.readSerializable();
        this.f5238i = parcel.createTypedArrayList(Venue.CREATOR);
        boolean z = false;
        this.f5240k = parcel.readInt() == 1;
        if (parcel.readInt() == 1) {
            z = true;
        }
        this.f5239j = z;
    }

    public Confidence getConfidence() {
        return this.f5235f;
    }

    @Nullable
    public String getPilgrimVisitId() {
        return this.f5230a;
    }

    /* renamed from: a */
    void m6862a(String str) {
        this.f5230a = str;
    }

    /* renamed from: a */
    void m6861a(@NonNull RegionType regionType) {
        this.f5232c = regionType;
    }

    /* renamed from: a */
    void m6860a(Confidence confidence) {
        this.f5235f = confidence;
    }

    /* renamed from: a */
    void m6859a(Venue venue) {
        this.f5231b = venue;
    }

    /* renamed from: a */
    void m6863a(List<Venue> list) {
        this.f5238i = list;
    }

    @Nullable
    public FoursquareLocation getLocation() {
        return this.f5236g;
    }

    /* renamed from: a */
    String m6857a() {
        return this.f5237h;
    }

    @Nullable
    public Venue getVenue() {
        return this.f5231b;
    }

    @NonNull
    public RegionType getType() {
        return this.f5232c;
    }

    public boolean hasExited() {
        return this.f5234e > 0;
    }

    public long getVisitLength() {
        return this.f5234e - this.f5233d;
    }

    public long getArrival() {
        return this.f5233d;
    }

    public long getDeparture() {
        return this.f5234e;
    }

    public List<Venue> getOtherPossibleVenues() {
        return this.f5238i;
    }

    public boolean isBackfill() {
        return this.f5239j;
    }

    /* renamed from: a */
    void m6858a(long j) {
        this.f5234e = j;
    }

    /* renamed from: b */
    boolean m6865b() {
        return this.f5240k;
    }

    /* renamed from: a */
    void m6864a(boolean z) {
        this.f5240k = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5230a);
        parcel.writeParcelable(this.f5231b, i);
        parcel.writeLong(this.f5233d);
        parcel.writeLong(this.f5234e);
        parcel.writeSerializable(this.f5232c);
        parcel.writeSerializable(this.f5235f);
        parcel.writeTypedList(this.f5238i);
        parcel.writeInt(this.f5240k);
        parcel.writeInt(this.f5239j);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CurrentPlace{pilgrimVisitId='");
        stringBuilder.append(this.f5230a == null ? "none" : this.f5230a);
        stringBuilder.append('\'');
        stringBuilder.append(", venue=");
        stringBuilder.append(this.f5231b == null ? "none" : this.f5231b.getName());
        stringBuilder.append(", type=");
        stringBuilder.append(this.f5232c);
        stringBuilder.append(", arrival=");
        stringBuilder.append(this.f5233d);
        stringBuilder.append(", departure=");
        stringBuilder.append(this.f5234e);
        stringBuilder.append(", confidence=");
        stringBuilder.append(this.f5235f);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    @Nullable
    /* renamed from: a */
    static CurrentPlace m6855a(@NonNull Context context) {
        return (CurrentPlace) C1940b.m6813a(context, "current_place.json", 0, TypeToken.get(CurrentPlace.class), false);
    }

    /* renamed from: a */
    static void m6856a(@NonNull Context context, @Nullable CurrentPlace currentPlace) {
        C1940b.m6820a(context, "current_place.json", 0, (Object) currentPlace, (Type) CurrentPlace.class);
    }
}
