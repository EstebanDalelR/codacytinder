package com.tinder.passport.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Pair;
import com.google.gson.annotations.SerializedName;
import com.tinder.common.utils.C8578a;

public class PassportLocation implements Parcelable {
    private static final double COORDINATE_TOLERANCE = 0.01d;
    public static final Creator<PassportLocation> CREATOR = new PassportLocation$1();
    @SerializedName("street_address")
    private String mAddress;
    @SerializedName("locality")
    private LocationName mCityName;
    @SerializedName("country")
    private LocationName mCountryName;
    @SerializedName("administrative_area_level_2")
    private LocationName mCountyName;
    private long mLastSeenDate;
    @SerializedName("lat")
    private double mLatitude;
    @SerializedName("lon")
    private double mLongitude;
    @SerializedName("route")
    private LocationName mRoute;
    @SerializedName("administrative_area_level_1")
    private LocationName mStateName;
    @SerializedName("street_number")
    private LocationName mStreetNum;

    public int describeContents() {
        return 0;
    }

    public PassportLocation() {
        this.mLastSeenDate = System.currentTimeMillis();
    }

    public boolean hasGeoData() {
        return (this.mLatitude == 0.0d || this.mLongitude == 0.0d) ? false : true;
    }

    @Nullable
    public String getRoute() {
        return this.mRoute == null ? null : this.mRoute.mLongName;
    }

    @Nullable
    public String getCountryLong() {
        return this.mCountryName == null ? null : this.mCountryName.mLongName;
    }

    @Nullable
    public String getCountryShort() {
        return this.mCountryName == null ? null : this.mCountryName.mShortName;
    }

    @Nullable
    public String getCity() {
        return this.mCityName == null ? null : this.mCityName.mLongName;
    }

    @Nullable
    public String getCounty() {
        return this.mCountyName == null ? null : this.mCountyName.mLongName;
    }

    public void setCounty(LocationName locationName) {
        this.mCountyName = locationName;
    }

    public String getAddressShort() {
        String str = "";
        if (!TextUtils.isEmpty(getStreetNumber())) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(getStreetNumber());
            str = stringBuilder.toString();
        }
        if (TextUtils.isEmpty(getRoute())) {
            return str;
        }
        if (str.length() > 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" ");
            str = stringBuilder.toString();
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(getRoute());
        return stringBuilder.toString();
    }

    @Nullable
    public String getAddress() {
        return this.mAddress;
    }

    public void setAddress(@Nullable String str) {
        this.mAddress = str;
    }

    @Nullable
    public String getStateProvinceLong() {
        return this.mStateName == null ? null : this.mStateName.mLongName;
    }

    @Nullable
    public String getStateProvinceShort() {
        return this.mStateName == null ? null : this.mStateName.mShortName;
    }

    public double getLatitude() {
        return this.mLatitude;
    }

    public void setLatitude(double d) {
        this.mLatitude = d;
    }

    public double getLongitude() {
        return this.mLongitude;
    }

    public void setLongitude(double d) {
        this.mLongitude = d;
    }

    public long getLastSeenDate() {
        return this.mLastSeenDate;
    }

    public void setLastSeenDate(long j) {
        this.mLastSeenDate = j;
    }

    @Nullable
    public String getStreetNumber() {
        return this.mStreetNum == null ? null : this.mStreetNum.mLongName;
    }

    public String getId() {
        return String.format("%s.%s", new Object[]{Double.valueOf(this.mLatitude), Double.valueOf(this.mLongitude)});
    }

    public void setRoute(@Nullable LocationName locationName) {
        this.mRoute = locationName;
    }

    public void setStreetNumber(@Nullable LocationName locationName) {
        this.mStreetNum = locationName;
    }

    public void setCountry(@Nullable LocationName locationName) {
        this.mCountryName = locationName;
    }

    public void setState(@Nullable LocationName locationName) {
        this.mStateName = locationName;
    }

    public void setCity(@Nullable LocationName locationName) {
        this.mCityName = locationName;
    }

    @Nullable
    public Pair<String, String> getLabels() {
        Object city = getCity();
        CharSequence county = getCounty();
        Object stateProvinceLong = getStateProvinceLong();
        CharSequence countryShort = getCountryShort();
        if (TextUtils.isEmpty(city) || TextUtils.isEmpty(stateProvinceLong)) {
            if (TextUtils.isEmpty(city) || TextUtils.isEmpty(countryShort)) {
                if (!TextUtils.isEmpty(county)) {
                    city = county;
                } else if (!TextUtils.isEmpty(stateProvinceLong)) {
                    city = stateProvinceLong;
                } else if (TextUtils.isEmpty(countryShort)) {
                    city = null;
                    stateProvinceLong = city;
                } else {
                    city = countryShort;
                    stateProvinceLong = null;
                }
            }
            stateProvinceLong = countryShort;
        }
        return new Pair(city, stateProvinceLong);
    }

    public String getDisplayLabel() {
        Pair labels = getLabels();
        if (labels == null) {
            return "";
        }
        String str = (String) labels.first;
        String str2 = (String) labels.second;
        int a = C8578a.a(str) ^ 1;
        int a2 = C8578a.a(str2) ^ 1;
        StringBuilder stringBuilder = new StringBuilder();
        if (a != 0) {
            stringBuilder.append(str);
        }
        if (!(a2 == 0 || a == 0)) {
            stringBuilder.append(", ");
            stringBuilder.append(str2);
        }
        if (a2 != 0 && a == 0) {
            stringBuilder.append(str2);
        }
        return stringBuilder.toString();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TinderLocation{mLatitude=");
        stringBuilder.append(this.mLatitude);
        stringBuilder.append(", mLongitude=");
        stringBuilder.append(this.mLongitude);
        stringBuilder.append(", mCity='");
        stringBuilder.append(getCity());
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PassportLocation)) {
            return super.equals(obj);
        }
        PassportLocation passportLocation = (PassportLocation) obj;
        obj = (Math.abs(passportLocation.getLatitude() - this.mLatitude) >= COORDINATE_TOLERANCE || Math.abs(passportLocation.getLongitude() - this.mLongitude) >= COORDINATE_TOLERANCE) ? null : true;
        return obj;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.mLatitude);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.mLongitude);
        return (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mAddress);
        parcel.writeParcelable(this.mStreetNum, i);
        parcel.writeParcelable(this.mRoute, i);
        parcel.writeDouble(this.mLatitude);
        parcel.writeDouble(this.mLongitude);
        parcel.writeParcelable(this.mCityName, i);
        parcel.writeParcelable(this.mStateName, i);
        parcel.writeParcelable(this.mCountyName, i);
        parcel.writeParcelable(this.mCountryName, i);
        parcel.writeLong(this.mLastSeenDate);
    }

    private PassportLocation(Parcel parcel) {
        this.mAddress = parcel.readString();
        this.mStreetNum = (LocationName) parcel.readParcelable(LocationName.class.getClassLoader());
        this.mRoute = (LocationName) parcel.readParcelable(LocationName.class.getClassLoader());
        this.mLatitude = parcel.readDouble();
        this.mLongitude = parcel.readDouble();
        this.mCityName = (LocationName) parcel.readParcelable(LocationName.class.getClassLoader());
        this.mStateName = (LocationName) parcel.readParcelable(LocationName.class.getClassLoader());
        this.mCountyName = (LocationName) parcel.readParcelable(LocationName.class.getClassLoader());
        this.mCountryName = (LocationName) parcel.readParcelable(LocationName.class.getClassLoader());
        this.mLastSeenDate = parcel.readLong();
    }
}
