package com.tinder.api.request;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.request.AutoValue_SchoolRequestBody_SchoolId.MoshiJsonAdapter;
import java.util.ArrayList;
import java.util.List;

public abstract class SchoolRequestBody {

    public static abstract class Builder {
        public abstract SchoolRequestBody build();

        public abstract Builder setSchoolIdList(List<SchoolId> list);
    }

    public static class Factory {
        @NonNull
        public SchoolRequestBody create(@NonNull List<String> list) {
            List arrayList = new ArrayList();
            for (String id : list) {
                arrayList.add(SchoolId.builder().setId(id).build());
            }
            return SchoolRequestBody.builder().setSchoolIdList(arrayList).build();
        }
    }

    public static abstract class SchoolId {

        public static abstract class Builder {
            public abstract SchoolId build();

            public abstract Builder setId(@Nullable String str);
        }

        @Nullable
        @Json(name = "id")
        public abstract String id();

        public static JsonAdapter<SchoolId> jsonAdapter(C5987p c5987p) {
            return new MoshiJsonAdapter(c5987p);
        }

        public static Builder builder() {
            return new Builder();
        }
    }

    @Nullable
    @Json(name = "schools")
    public abstract List<SchoolId> schoolIdList();

    public static JsonAdapter<SchoolRequestBody> jsonAdapter(C5987p c5987p) {
        return new AutoValue_SchoolRequestBody.MoshiJsonAdapter(c5987p);
    }

    public static Builder builder() {
        return new Builder();
    }
}
