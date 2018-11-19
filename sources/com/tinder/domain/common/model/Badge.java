package com.tinder.domain.common.model;

import android.support.annotation.NonNull;

public abstract class Badge {

    public static abstract class Builder {
        public abstract Badge build();

        public abstract Builder color(String str);

        public abstract Builder description(String str);

        public abstract Builder type(Type type);
    }

    public enum Type {
        VERIFIED("verified"),
        PEOPLE_MAG("people_magazine"),
        DEFAULT("default");
        
        private final String key;

        @NonNull
        public static Type fromKey(String str) {
            for (Type type : values()) {
                if (type.key.equals(str)) {
                    return type;
                }
            }
            return DEFAULT;
        }

        private Type(String str) {
            this.key = str;
        }

        public String key() {
            return this.key;
        }
    }

    public abstract String color();

    public abstract String description();

    public abstract Type type();

    public static Builder builder() {
        return new Builder();
    }
}
