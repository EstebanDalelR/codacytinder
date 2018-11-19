package com.tinder.api.model.common;

import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.common.AutoValue_TinderSelect_Select.MoshiJsonAdapter;
import javax.annotation.Nullable;

public abstract class TinderSelect {

    public static abstract class Select {

        public static abstract class Builder {
            public abstract Select build();

            public abstract Builder setDateAdded(@Nullable String str);

            public abstract Builder setInvitationCount(@Nullable Integer num);

            public abstract Builder setRecsEnabled(@Nullable Boolean bool);
        }

        @Nullable
        @Json(name = "date_added")
        public abstract String dateAdded();

        @Nullable
        @Json(name = "invitation_count")
        public abstract Integer invitationCount();

        @Nullable
        @Json(name = "select_recs_enabled")
        public abstract Boolean recsEnabled();

        public static JsonAdapter<Select> jsonAdapter(C5987p c5987p) {
            return new MoshiJsonAdapter(c5987p);
        }
    }

    @Nullable
    @Json(name = "select")
    public abstract Select select();

    public static JsonAdapter<TinderSelect> jsonAdapter(C5987p c5987p) {
        return new AutoValue_TinderSelect.MoshiJsonAdapter(c5987p);
    }
}
