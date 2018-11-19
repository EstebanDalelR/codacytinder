package com.tinder.onboarding.model.network;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;
import java8.util.Objects;

public class FieldsResponse extends DataResponse<Data> {

    public static class Data {
        @Nullable
        @SerializedName("fields")
        private List<Field<?, ?>> mFields;
        @SerializedName("is_underage")
        private boolean mIsUnderage;
    }

    @NonNull
    public List<Field<?, ?>> getFields() {
        return Collections.unmodifiableList(((Data) this.mData).mFields);
    }

    public boolean isUserUnderage() {
        Objects.b(this.mData);
        return ((Data) this.mData).mIsUnderage;
    }
}
