package com.tinder.onboarding.model.network;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import java8.util.Optional;

public class Field<T, META> {
    @Nullable
    @SerializedName("data")
    private final T data;
    @Nullable
    @SerializedName("default")
    private T defaultValue;
    @Nullable
    @SerializedName("editable")
    private final Boolean editable;
    @Nullable
    @SerializedName("meta")
    private final META meta;
    @Nullable
    @SerializedName("required")
    private final Boolean required;
    @Nullable
    @SerializedName("name")
    private final Type type;

    public enum Type {
        NAME,
        BIRTHDAY,
        GENDER,
        CUSTOM_GENDER,
        SHOW_GENDER_ON_PROFILE,
        PHOTOS,
        EMAIL,
        PASSWORD,
        ALLOW_EMAIL_MARKETING
    }

    public static <T> Field<T, Void> create(@NonNull Type type, @NonNull T t) {
        return new Field(type, t);
    }

    private Field(@NonNull Type type, @Nullable T t) {
        this(type, t, null);
    }

    private Field(@NonNull Type type, @Nullable T t, @Nullable T t2) {
        this(type, t, t2, null);
    }

    public Field(@NonNull Type type, @Nullable T t, @Nullable T t2, @Nullable META meta) {
        this(type, t, t2, meta, null, null);
    }

    public Field(@NonNull Type type, @Nullable T t, @Nullable T t2, @Nullable META meta, @Nullable Boolean bool, @Nullable Boolean bool2) {
        this.type = type;
        this.data = t;
        this.defaultValue = t2;
        this.meta = meta;
        this.required = bool;
        this.editable = bool2;
    }

    @Nullable
    public Type getType() {
        return this.type;
    }

    @NonNull
    public Optional<T> getData() {
        return Optional.b(this.data);
    }

    @NonNull
    public Optional<T> getDefaultValue() {
        return Optional.b(this.defaultValue);
    }

    @NonNull
    public Optional<META> getMeta() {
        return Optional.b(this.meta);
    }

    @Nullable
    public Boolean isRequired() {
        return this.required;
    }

    @Nullable
    public Boolean isEditable() {
        return this.editable;
    }
}
