package com.tinder.api.request;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.request.SchoolRequestBody.SchoolId;
import java.util.List;

/* renamed from: com.tinder.api.request.$AutoValue_SchoolRequestBody */
abstract class C$AutoValue_SchoolRequestBody extends SchoolRequestBody {
    private final List<SchoolId> schoolIdList;

    static final class Builder extends com.tinder.api.request.SchoolRequestBody.Builder {
        private List<SchoolId> schoolIdList;

        Builder() {
        }

        Builder(SchoolRequestBody schoolRequestBody) {
            this.schoolIdList = schoolRequestBody.schoolIdList();
        }

        public com.tinder.api.request.SchoolRequestBody.Builder setSchoolIdList(@Nullable List<SchoolId> list) {
            this.schoolIdList = list;
            return this;
        }

        public SchoolRequestBody build() {
            return new AutoValue_SchoolRequestBody(this.schoolIdList);
        }
    }

    C$AutoValue_SchoolRequestBody(@Nullable List<SchoolId> list) {
        this.schoolIdList = list;
    }

    @Nullable
    @Json(name = "schools")
    public List<SchoolId> schoolIdList() {
        return this.schoolIdList;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SchoolRequestBody{schoolIdList=");
        stringBuilder.append(this.schoolIdList);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchoolRequestBody)) {
            return false;
        }
        SchoolRequestBody schoolRequestBody = (SchoolRequestBody) obj;
        if (this.schoolIdList != null) {
            z = this.schoolIdList.equals(schoolRequestBody.schoolIdList());
        } else if (schoolRequestBody.schoolIdList() != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (this.schoolIdList == null ? 0 : this.schoolIdList.hashCode()) ^ 1000003;
    }
}
