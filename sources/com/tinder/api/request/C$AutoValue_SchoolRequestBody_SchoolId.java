package com.tinder.api.request;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.request.SchoolRequestBody.SchoolId;

/* renamed from: com.tinder.api.request.$AutoValue_SchoolRequestBody_SchoolId */
abstract class C$AutoValue_SchoolRequestBody_SchoolId extends SchoolId {
    private final String id;

    static final class Builder extends com.tinder.api.request.SchoolRequestBody.SchoolId.Builder {
        private String id;

        Builder() {
        }

        Builder(SchoolId schoolId) {
            this.id = schoolId.id();
        }

        public com.tinder.api.request.SchoolRequestBody.SchoolId.Builder setId(@Nullable String str) {
            this.id = str;
            return this;
        }

        public SchoolId build() {
            return new AutoValue_SchoolRequestBody_SchoolId(this.id);
        }
    }

    C$AutoValue_SchoolRequestBody_SchoolId(@Nullable String str) {
        this.id = str;
    }

    @Nullable
    @Json(name = "id")
    public String id() {
        return this.id;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SchoolId{id=");
        stringBuilder.append(this.id);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchoolId)) {
            return false;
        }
        SchoolId schoolId = (SchoolId) obj;
        if (this.id != null) {
            z = this.id.equals(schoolId.id());
        } else if (schoolId.id() != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (this.id == null ? 0 : this.id.hashCode()) ^ 1000003;
    }
}
