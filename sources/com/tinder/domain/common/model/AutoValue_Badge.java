package com.tinder.domain.common.model;

import com.tinder.domain.common.model.Badge.Type;

final class AutoValue_Badge extends Badge {
    private final String color;
    private final String description;
    private final Type type;

    static final class Builder extends com.tinder.domain.common.model.Badge.Builder {
        private String color;
        private String description;
        private Type type;

        Builder() {
        }

        Builder(Badge badge) {
            this.type = badge.type();
            this.description = badge.description();
            this.color = badge.color();
        }

        public com.tinder.domain.common.model.Badge.Builder type(Type type) {
            this.type = type;
            return this;
        }

        public com.tinder.domain.common.model.Badge.Builder description(String str) {
            this.description = str;
            return this;
        }

        public com.tinder.domain.common.model.Badge.Builder color(String str) {
            this.color = str;
            return this;
        }

        public Badge build() {
            String str = "";
            if (this.type == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" type");
                str = stringBuilder.toString();
            }
            if (this.description == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" description");
                str = stringBuilder.toString();
            }
            if (this.color == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" color");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_Badge(this.type, this.description, this.color);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_Badge(Type type, String str, String str2) {
        this.type = type;
        this.description = str;
        this.color = str2;
    }

    public Type type() {
        return this.type;
    }

    public String description() {
        return this.description;
    }

    public String color() {
        return this.color;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Badge{type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", description=");
        stringBuilder.append(this.description);
        stringBuilder.append(", color=");
        stringBuilder.append(this.color);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Badge)) {
            return false;
        }
        Badge badge = (Badge) obj;
        if (!this.type.equals(badge.type()) || !this.description.equals(badge.description()) || this.color.equals(badge.color()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((this.type.hashCode() ^ 1000003) * 1000003) ^ this.description.hashCode()) * 1000003) ^ this.color.hashCode();
    }
}
