package com.tinder.spotify.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

public class SpotifyDefaultTrackListResponse {
    /* renamed from: a */
    private List<SearchTrack> f46864a = new ArrayList();
    @Keep
    @SerializedName("items")
    private List<TrackWrapper> mTrackList;

    public class TrackWrapper {
        @Keep
        @SerializedName("track")
        SearchTrack mTrack;

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("track: ");
            stringBuilder.append(this.mTrack);
            return stringBuilder.toString();
        }
    }

    /* renamed from: a */
    public List<SearchTrack> m56724a() {
        if (!this.f46864a.isEmpty()) {
            return this.f46864a;
        }
        for (TrackWrapper trackWrapper : this.mTrackList) {
            this.f46864a.add(trackWrapper.mTrack);
        }
        return this.f46864a;
    }
}
