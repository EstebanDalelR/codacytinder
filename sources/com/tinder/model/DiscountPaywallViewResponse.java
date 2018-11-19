package com.tinder.model;

import com.google.gson.annotations.SerializedName;

public class DiscountPaywallViewResponse {
    @SerializedName("expires_at")
    private long mExpiresAt;
    @SerializedName("viewed_at")
    private long mViewedAt;

    public long getViewedAt() {
        return this.mViewedAt;
    }

    public long getExpiresAt() {
        return this.mExpiresAt;
    }
}
