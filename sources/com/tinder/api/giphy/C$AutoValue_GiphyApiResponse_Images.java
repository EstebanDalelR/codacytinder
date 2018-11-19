package com.tinder.api.giphy;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.giphy.GiphyApiResponse.Image;
import com.tinder.api.giphy.GiphyApiResponse.Images;

/* renamed from: com.tinder.api.giphy.$AutoValue_GiphyApiResponse_Images */
abstract class C$AutoValue_GiphyApiResponse_Images extends Images {
    private final Image fixedHeightImage;

    C$AutoValue_GiphyApiResponse_Images(@Nullable Image image) {
        this.fixedHeightImage = image;
    }

    @Nullable
    @Json(name = "fixed_height")
    public Image fixedHeightImage() {
        return this.fixedHeightImage;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Images{fixedHeightImage=");
        stringBuilder.append(this.fixedHeightImage);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Images)) {
            return false;
        }
        Images images = (Images) obj;
        if (this.fixedHeightImage != null) {
            z = this.fixedHeightImage.equals(images.fixedHeightImage());
        } else if (images.fixedHeightImage() != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (this.fixedHeightImage == null ? 0 : this.fixedHeightImage.hashCode()) ^ 1000003;
    }
}
