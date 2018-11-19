package com.tinder.onboarding.model.network;

import android.support.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import java.util.LinkedList;
import java.util.List;

public class UpdateFieldsRequest {
    @SerializedName("fields")
    @NonNull
    private final List<Field<?, ?>> fields;
    @SerializedName("token")
    @NonNull
    private final transient String token;

    public static class Builder {
        private final List<Field<?, ?>> fields = new LinkedList();
        private final String token;

        public Builder(String str) {
            this.token = str;
        }

        public Builder addField(Field<?, ?> field) {
            this.fields.add(field);
            return this;
        }

        public UpdateFieldsRequest build() {
            return new UpdateFieldsRequest();
        }
    }

    private UpdateFieldsRequest(Builder builder) {
        this.token = builder.token;
        this.fields = builder.fields;
    }

    @NonNull
    public String getToken() {
        return this.token;
    }

    @NonNull
    public List<Field<?, ?>> getFields() {
        return this.fields;
    }
}
