package com.tinder.domain.common.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.domain.common.model.Gender.Value;

final class AutoValue_Gender extends Gender {
    private final String customGender;
    private final Value value;

    AutoValue_Gender(Value value, @Nullable String str) {
        if (value == null) {
            throw new NullPointerException("Null value");
        }
        this.value = value;
        this.customGender = str;
    }

    @NonNull
    public Value value() {
        return this.value;
    }

    @Nullable
    public String customGender() {
        return this.customGender;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Gender{value=");
        stringBuilder.append(this.value);
        stringBuilder.append(", customGender=");
        stringBuilder.append(this.customGender);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Gender)) {
            return false;
        }
        Gender gender = (Gender) obj;
        if (this.value.equals(gender.value())) {
            if (this.customGender == null) {
                if (gender.customGender() == null) {
                    return z;
                }
            } else if (this.customGender.equals(gender.customGender()) != null) {
                return z;
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        return ((this.value.hashCode() ^ 1000003) * 1000003) ^ (this.customGender == null ? 0 : this.customGender.hashCode());
    }
}
