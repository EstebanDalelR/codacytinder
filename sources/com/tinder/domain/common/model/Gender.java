package com.tinder.domain.common.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.common.utils.C8578a;

public abstract class Gender {

    public enum Value {
        MALE(0),
        FEMALE(1),
        UNKNOWN(-1);
        
        private final int id;

        private Value(int i) {
            this.id = i;
        }

        public int id() {
            return this.id;
        }

        @NonNull
        public static Value fromId(int i) {
            switch (i) {
                case 0:
                    return MALE;
                case 1:
                    return FEMALE;
                default:
                    return UNKNOWN;
            }
        }
    }

    @Nullable
    public abstract String customGender();

    @NonNull
    public abstract Value value();

    @NonNull
    public static Gender create(@NonNull Value value) {
        return create(value, null);
    }

    @NonNull
    public static Gender create(@NonNull Value value, @Nullable String str) {
        return new AutoValue_Gender(value, str);
    }

    @NonNull
    public static Gender create(int i, @Nullable String str) {
        Value fromId = Value.fromId(i);
        if (C8578a.m36596a(str)) {
            return create(fromId);
        }
        return create(fromId, str);
    }
}
