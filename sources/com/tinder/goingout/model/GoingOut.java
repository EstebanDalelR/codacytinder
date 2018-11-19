package com.tinder.goingout.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import com.tinder.common.utils.C8578a;
import com.tinder.utils.DateUtils;
import java.util.Calendar;
import java.util.Date;
import javax.annotation.Nullable;

public class GoingOut implements Parcelable {
    public static final Creator<GoingOut> CREATOR = new C96761();
    @SerializedName("creation_date")
    private String mCreationDate;
    @SerializedName("expiration_date")
    private String mExpirationDate;
    @SerializedName("location")
    private Location mLocation;
    @SerializedName("source")
    @Nullable
    private String mSource;
    @SerializedName("source_id")
    @Nullable
    private String mSourceId;
    @SerializedName("status")
    private Status mStatus;

    /* renamed from: com.tinder.goingout.model.GoingOut$1 */
    static class C96761 implements Creator<GoingOut> {
        C96761() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m40121a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m40122a(i);
        }

        /* renamed from: a */
        public GoingOut m40121a(Parcel parcel) {
            return new GoingOut(parcel);
        }

        /* renamed from: a */
        public GoingOut[] m40122a(int i) {
            return new GoingOut[i];
        }
    }

    public enum GoingOutTimeSlot {
        TONIGHT,
        YESTERDAY,
        PLUS_TWO_DAYS
    }

    public static class Location implements Parcelable {
        public static final Creator<Location> CREATOR = new C96771();
        @SerializedName("lat")
        private double mLatitude;
        @SerializedName("location_id")
        private String mLocationId;
        @SerializedName("long")
        private double mLongitude;
        @SerializedName("name")
        private String mName;
        @SerializedName("service_id")
        private String mServiceId;

        /* renamed from: com.tinder.goingout.model.GoingOut$Location$1 */
        static class C96771 implements Creator<Location> {
            C96771() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m40123a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m40124a(i);
            }

            /* renamed from: a */
            public Location m40123a(Parcel parcel) {
                return new Location(parcel);
            }

            /* renamed from: a */
            public Location[] m40124a(int i) {
                return new Location[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        private Location() {
        }

        @Deprecated
        public Location(String str, String str2, String str3, double d, double d2) {
            this.mName = str;
            this.mLocationId = str2;
            this.mServiceId = str3;
            this.mLatitude = d;
            this.mLongitude = d2;
        }

        public String getName() {
            return this.mName;
        }

        public String getLocationId() {
            return this.mLocationId;
        }

        public String getServiceId() {
            return this.mServiceId;
        }

        public double getLatitude() {
            return this.mLatitude;
        }

        public double getLongitude() {
            return this.mLongitude;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    Location location = (Location) obj;
                    if (this.mLatitude != location.getLatitude() || this.mLongitude != location.getLongitude() || !this.mLocationId.equals(location.getLocationId()) || !this.mName.equals(location.getName()) || this.mServiceId.equals(location.getServiceId()) == null) {
                        z = false;
                    }
                    return z;
                }
            }
            return false;
        }

        public int hashCode() {
            int hashCode = (((this.mName.hashCode() * 31) + this.mLocationId.hashCode()) * 31) + this.mServiceId.hashCode();
            long doubleToLongBits = Double.doubleToLongBits(this.mLatitude);
            hashCode = (hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
            doubleToLongBits = Double.doubleToLongBits(this.mLongitude);
            return (hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mName);
            parcel.writeString(this.mLocationId);
            parcel.writeString(this.mServiceId);
            parcel.writeDouble(this.mLatitude);
            parcel.writeDouble(this.mLongitude);
        }

        protected Location(Parcel parcel) {
            this.mName = parcel.readString();
            this.mLocationId = parcel.readString();
            this.mServiceId = parcel.readString();
            this.mLatitude = parcel.readDouble();
            this.mLongitude = parcel.readDouble();
        }
    }

    public static class Status implements Parcelable {
        public static final Creator<Status> CREATOR = new C96781();
        @SerializedName("emoji")
        private String mEmojiTextCode;
        @SerializedName("text")
        private String mStatusDescription;
        @SerializedName("tag")
        private String mStatusTag;

        /* renamed from: com.tinder.goingout.model.GoingOut$Status$1 */
        static class C96781 implements Creator<Status> {
            C96781() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m40125a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m40126a(i);
            }

            /* renamed from: a */
            public Status m40125a(Parcel parcel) {
                return new Status(parcel);
            }

            /* renamed from: a */
            public Status[] m40126a(int i) {
                return new Status[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        private Status() {
        }

        public Status(String str, String str2, String str3) {
            this.mEmojiTextCode = str;
            this.mStatusDescription = str2;
            this.mStatusTag = str3;
        }

        public String getEmojiTextCode() {
            return this.mEmojiTextCode;
        }

        public String getStatusDescription() {
            return this.mStatusDescription;
        }

        public String getStatusTag() {
            return this.mStatusTag;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    Status status = (Status) obj;
                    if (!this.mEmojiTextCode.equals(status.getEmojiTextCode()) || !this.mStatusDescription.equals(status.getStatusDescription()) || this.mStatusTag.equals(status.getStatusTag()) == null) {
                        z = false;
                    }
                    return z;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.mEmojiTextCode.hashCode() * 31) + this.mStatusDescription.hashCode()) * 31) + this.mStatusTag.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mEmojiTextCode);
            parcel.writeString(this.mStatusDescription);
            parcel.writeString(this.mStatusTag);
        }

        protected Status(Parcel parcel) {
            this.mEmojiTextCode = parcel.readString();
            this.mStatusDescription = parcel.readString();
            this.mStatusTag = parcel.readString();
        }
    }

    public int describeContents() {
        return 0;
    }

    public static GoingOut newInstance(@Nullable Status status, @Nullable Location location, String str) {
        return new GoingOut(status, location, str, null, null, null);
    }

    private GoingOut() {
    }

    public GoingOut(Status status, @Nullable Location location, String str, String str2, @Nullable String str3, @Nullable String str4) {
        this.mStatus = status;
        this.mLocation = location;
        this.mCreationDate = str;
        this.mExpirationDate = str2;
        this.mSourceId = str3;
        this.mSource = str4;
    }

    public Status getGoingOutStatus() {
        return this.mStatus;
    }

    @Nullable
    public Location getGoingOutLocation() {
        return this.mLocation;
    }

    public String getCreationDate() {
        return this.mCreationDate;
    }

    public String getExpirationDate() {
        return this.mExpirationDate;
    }

    @Nullable
    public String getSourceId() {
        return this.mSourceId;
    }

    @Nullable
    public String getSource() {
        return this.mSource;
    }

    public void setGoingOutStatus(Status status) {
        this.mStatus = status;
    }

    public void setGoingOutLocation(Location location) {
        this.mLocation = location;
    }

    public void setSourceId(@Nullable String str) {
        this.mSourceId = str;
    }

    public void setSource(@Nullable String str) {
        this.mSource = str;
    }

    public void setExpirationDate(String str) {
        this.mExpirationDate = str;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                GoingOut goingOut = (GoingOut) obj;
                Location goingOutLocation = goingOut.getGoingOutLocation();
                if (!(this.mCreationDate.equals(goingOut.getCreationDate()) && this.mExpirationDate.equals(goingOut.getExpirationDate()) && this.mLocation != null && this.mLocation.equals(goingOutLocation))) {
                    if (this.mLocation != goingOutLocation || C8578a.m36596a(this.mSource) || !this.mSource.equals(goingOut.getSource()) || C8578a.m36596a(this.mSourceId) || !this.mSourceId.equals(goingOut.getSourceId()) || this.mStatus.equals(goingOut.getGoingOutStatus()) == null) {
                        z = false;
                    }
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((this.mStatus.hashCode() * 31) + (this.mLocation != null ? this.mLocation.hashCode() : 0)) * 31) + (this.mCreationDate != null ? this.mCreationDate.hashCode() : 0)) * 31) + (this.mExpirationDate != null ? this.mExpirationDate.hashCode() : 0)) * 31) + (this.mSourceId != null ? this.mSourceId.hashCode() : 0)) * 31;
        if (this.mSource != null) {
            i = this.mSource.hashCode();
        }
        return hashCode + i;
    }

    public boolean isExpired() {
        if (!getGoingOutTimeSlot().equals(GoingOutTimeSlot.PLUS_TWO_DAYS)) {
            if (DateUtils.e(this.mExpirationDate) > 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isYesterdaysStatus() {
        return getGoingOutTimeSlot().equals(GoingOutTimeSlot.YESTERDAY);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mStatus, i);
        parcel.writeParcelable(this.mLocation, i);
        parcel.writeString(this.mCreationDate);
        parcel.writeString(this.mExpirationDate);
        parcel.writeString(this.mSourceId);
        parcel.writeString(this.mSource);
    }

    protected GoingOut(Parcel parcel) {
        this.mStatus = (Status) parcel.readParcelable(Status.class.getClassLoader());
        this.mLocation = (Location) parcel.readParcelable(Location.class.getClassLoader());
        this.mCreationDate = parcel.readString();
        this.mExpirationDate = parcel.readString();
        this.mSourceId = parcel.readString();
        this.mSource = parcel.readString();
    }

    private GoingOutTimeSlot getGoingOutTimeSlot() {
        Date date = new Date(DateUtils.a(this.mCreationDate));
        Calendar.getInstance().setTime(date);
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.add(5, 2);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        if (Calendar.getInstance().getTimeInMillis() / 1000 >= instance.getTimeInMillis() / 1000) {
            return GoingOutTimeSlot.PLUS_TWO_DAYS;
        }
        if (DateUtils.f(this.mCreationDate)) {
            return GoingOutTimeSlot.TONIGHT;
        }
        return GoingOutTimeSlot.YESTERDAY;
    }

    @NonNull
    public String getGoingOutBubbleTextV1(@NonNull GoingOut goingOut, @Nullable String str, @Nullable String str2) {
        Status goingOutStatus = goingOut.getGoingOutStatus();
        goingOut = goingOut.getGoingOutLocation();
        StringBuilder stringBuilder = new StringBuilder();
        appendStringWithPrefix(str, stringBuilder);
        if (goingOutStatus != null) {
            if (goingOutStatus.getStatusDescription() == null) {
                str = "";
            } else {
                str = goingOutStatus.getStatusDescription();
            }
            stringBuilder.append(str);
        }
        if (goingOut != null) {
            goingOut = goingOut.getName();
            if (goingOut != null) {
                stringBuilder.append("  |  ");
                stringBuilder.append(goingOut);
            }
        }
        appendSuffixString(str2, stringBuilder);
        return stringBuilder.toString();
    }

    public String getGoingOutBubbleTextV2(@NonNull GoingOut goingOut, @Nullable String str, @Nullable String str2) {
        goingOut = goingOut.getGoingOutStatus();
        StringBuilder stringBuilder = new StringBuilder();
        appendStringWithPrefix(str, stringBuilder);
        if (goingOut != null && C8578a.m36596a(goingOut.getStatusDescription()) == null) {
            str = new StringBuilder();
            str.append("<b>");
            str.append(goingOut.getStatusDescription().toLowerCase());
            str.append("</b>");
            stringBuilder.append(str.toString());
        }
        appendSuffixString(str2, stringBuilder);
        return stringBuilder.toString();
    }

    private void appendSuffixString(@Nullable String str, StringBuilder stringBuilder) {
        if (!C8578a.m36596a(str)) {
            stringBuilder.append(" ");
            stringBuilder.append(str);
        }
    }

    private void appendStringWithPrefix(@Nullable String str, StringBuilder stringBuilder) {
        if (!C8578a.m36596a(str)) {
            stringBuilder.append(str);
            stringBuilder.append(" ");
        }
    }
}
