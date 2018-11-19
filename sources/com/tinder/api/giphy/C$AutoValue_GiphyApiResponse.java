package com.tinder.api.giphy;

import android.support.annotation.Nullable;
import com.tinder.api.giphy.GiphyApiResponse.Giphy;
import java.util.List;

/* renamed from: com.tinder.api.giphy.$AutoValue_GiphyApiResponse */
abstract class C$AutoValue_GiphyApiResponse extends GiphyApiResponse {
    private final List<Giphy> data;

    C$AutoValue_GiphyApiResponse(@Nullable List<Giphy> list) {
        this.data = list;
    }

    @Nullable
    public List<Giphy> data() {
        return this.data;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GiphyApiResponse{data=");
        stringBuilder.append(this.data);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GiphyApiResponse)) {
            return false;
        }
        GiphyApiResponse giphyApiResponse = (GiphyApiResponse) obj;
        if (this.data != null) {
            z = this.data.equals(giphyApiResponse.data());
        } else if (giphyApiResponse.data() != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (this.data == null ? 0 : this.data.hashCode()) ^ 1000003;
    }
}
