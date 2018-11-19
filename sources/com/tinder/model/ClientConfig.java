package com.tinder.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class ClientConfig implements Parcelable {
    public static final Creator<ClientConfig> CREATOR = new C99181();
    @Nullable
    private RateCardConfig rateCard;
    @Nullable
    private List<String> tPlusScreenConfig;

    /* renamed from: com.tinder.model.ClientConfig$1 */
    static class C99181 implements Creator<ClientConfig> {
        C99181() {
        }

        public ClientConfig createFromParcel(Parcel parcel) {
            return new ClientConfig(parcel);
        }

        public ClientConfig[] newArray(int i) {
            return new ClientConfig[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public ClientConfig() {
        this.tPlusScreenConfig = new ArrayList();
    }

    protected ClientConfig(Parcel parcel) {
        this.rateCard = (RateCardConfig) parcel.readParcelable(RateCardConfig.class.getClassLoader());
        this.tPlusScreenConfig = parcel.createStringArrayList();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.rateCard, i);
        parcel.writeStringList(this.tPlusScreenConfig);
    }

    @Nullable
    public RateCardConfig getRateCard() {
        return this.rateCard;
    }

    public void setRateCard(@Nullable RateCardConfig rateCardConfig) {
        this.rateCard = rateCardConfig;
    }

    public void setTPlusScreenConfig(@Nullable List<String> list) {
        this.tPlusScreenConfig = list;
    }

    @Nullable
    public List<String> getTPlusScreenConfig() {
        return this.tPlusScreenConfig;
    }
}
