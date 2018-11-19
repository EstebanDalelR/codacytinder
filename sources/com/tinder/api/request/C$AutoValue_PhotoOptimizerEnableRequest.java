package com.tinder.api.request;

import android.support.annotation.NonNull;
import com.squareup.moshi.Json;

/* renamed from: com.tinder.api.request.$AutoValue_PhotoOptimizerEnableRequest */
abstract class C$AutoValue_PhotoOptimizerEnableRequest extends PhotoOptimizerEnableRequest {
    private final Boolean photoOptimizerEnabled;

    static final class Builder extends com.tinder.api.request.PhotoOptimizerEnableRequest.Builder {
        private Boolean photoOptimizerEnabled;

        Builder() {
        }

        Builder(PhotoOptimizerEnableRequest photoOptimizerEnableRequest) {
            this.photoOptimizerEnabled = photoOptimizerEnableRequest.photoOptimizerEnabled();
        }

        public com.tinder.api.request.PhotoOptimizerEnableRequest.Builder setPhotoOptimizerEnabled(Boolean bool) {
            this.photoOptimizerEnabled = bool;
            return this;
        }

        public PhotoOptimizerEnableRequest build() {
            String str = "";
            if (this.photoOptimizerEnabled == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" photoOptimizerEnabled");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_PhotoOptimizerEnableRequest(this.photoOptimizerEnabled);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    C$AutoValue_PhotoOptimizerEnableRequest(Boolean bool) {
        if (bool == null) {
            throw new NullPointerException("Null photoOptimizerEnabled");
        }
        this.photoOptimizerEnabled = bool;
    }

    @NonNull
    @Json(name = "photo_optimizer_enabled")
    public Boolean photoOptimizerEnabled() {
        return this.photoOptimizerEnabled;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PhotoOptimizerEnableRequest{photoOptimizerEnabled=");
        stringBuilder.append(this.photoOptimizerEnabled);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PhotoOptimizerEnableRequest)) {
            return null;
        }
        return this.photoOptimizerEnabled.equals(((PhotoOptimizerEnableRequest) obj).photoOptimizerEnabled());
    }

    public int hashCode() {
        return this.photoOptimizerEnabled.hashCode() ^ 1000003;
    }
}
