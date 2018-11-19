package com.foursquare.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.foursquare.api.Add3rdPartyCheckinParams.VenueIdType;
import java.util.Date;

final class AutoValue_Add3rdPartyCheckinParams extends C$AutoValue_Add3rdPartyCheckinParams {
    public static final Creator<AutoValue_Add3rdPartyCheckinParams> CREATOR = new C18891();

    /* renamed from: com.foursquare.api.AutoValue_Add3rdPartyCheckinParams$1 */
    class C18891 implements Creator<AutoValue_Add3rdPartyCheckinParams> {
        C18891() {
        }

        public AutoValue_Add3rdPartyCheckinParams createFromParcel(Parcel parcel) {
            return new AutoValue_Add3rdPartyCheckinParams(parcel.readString(), VenueIdType.valueOf(parcel.readString()), (Date) parcel.readSerializable(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (FoursquareLocation) parcel.readParcelable(FoursquareLocation.class.getClassLoader()));
        }

        public AutoValue_Add3rdPartyCheckinParams[] newArray(int i) {
            return new AutoValue_Add3rdPartyCheckinParams[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    AutoValue_Add3rdPartyCheckinParams(String str, VenueIdType venueIdType, Date date, String str2, String str3, FoursquareLocation foursquareLocation) {
        super(str, venueIdType, date, str2, str3, foursquareLocation);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(venueId());
        parcel.writeString(venueIdType().name());
        parcel.writeSerializable(now());
        if (pilgrimVisitId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(pilgrimVisitId());
        }
        if (wifiScan() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(wifiScan());
        }
        parcel.writeParcelable(ll(), i);
    }
}
