package com.tinder.model;

import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import com.tinder.api.ApiResponseV2;
import com.tinder.boost.model.C10428i;
import com.tinder.domain.boost.model.BoostStatus;
import com.tinder.spotify.model.SpotifyConnectResponse;

@Deprecated
public class ProfileResponse extends ApiResponseV2 {
    @SerializedName("data")
    protected Data mData;

    public class Data {
        @Nullable
        @SerializedName("boost")
        C10428i mBoostStatus;
        @Nullable
        @SerializedName("spotify")
        SpotifyConnectResponse mSpotify;
    }

    public BoostStatus getBoost() {
        return this.mData.mBoostStatus;
    }

    public SpotifyConnectResponse getSpotify() {
        return this.mData.mSpotify;
    }
}
