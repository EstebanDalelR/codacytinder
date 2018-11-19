package com.tinder.spotify.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;

public class SpotifySearchResponse {
    @Keep
    @SerializedName("tracks")
    private C15053b mSearchResponseItem;

    /* renamed from: a */
    public C15053b m56728a() {
        return this.mSearchResponseItem;
    }
}
