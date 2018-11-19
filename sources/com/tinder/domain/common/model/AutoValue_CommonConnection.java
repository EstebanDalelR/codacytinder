package com.tinder.domain.common.model;

import android.support.annotation.NonNull;

final class AutoValue_CommonConnection extends CommonConnection {
    private final int degree;
    private final String id;
    private final String image;
    private final String name;

    static final class Builder extends com.tinder.domain.common.model.CommonConnection.Builder {
        private Integer degree;
        private String id;
        private String image;
        private String name;

        Builder() {
        }

        Builder(CommonConnection commonConnection) {
            this.id = commonConnection.id();
            this.degree = Integer.valueOf(commonConnection.degree());
            this.name = commonConnection.name();
            this.image = commonConnection.image();
        }

        public com.tinder.domain.common.model.CommonConnection.Builder id(String str) {
            this.id = str;
            return this;
        }

        public com.tinder.domain.common.model.CommonConnection.Builder degree(int i) {
            this.degree = Integer.valueOf(i);
            return this;
        }

        public com.tinder.domain.common.model.CommonConnection.Builder name(String str) {
            this.name = str;
            return this;
        }

        public com.tinder.domain.common.model.CommonConnection.Builder image(String str) {
            this.image = str;
            return this;
        }

        public CommonConnection build() {
            String str = "";
            if (this.id == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" id");
                str = stringBuilder.toString();
            }
            if (this.degree == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" degree");
                str = stringBuilder.toString();
            }
            if (this.name == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" name");
                str = stringBuilder.toString();
            }
            if (this.image == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" image");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_CommonConnection(this.id, this.degree.intValue(), this.name, this.image);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_CommonConnection(String str, int i, String str2, String str3) {
        this.id = str;
        this.degree = i;
        this.name = str2;
        this.image = str3;
    }

    @NonNull
    public String id() {
        return this.id;
    }

    public int degree() {
        return this.degree;
    }

    @NonNull
    public String name() {
        return this.name;
    }

    @NonNull
    public String image() {
        return this.image;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CommonConnection{id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", degree=");
        stringBuilder.append(this.degree);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", image=");
        stringBuilder.append(this.image);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommonConnection)) {
            return false;
        }
        CommonConnection commonConnection = (CommonConnection) obj;
        if (!this.id.equals(commonConnection.id()) || this.degree != commonConnection.degree() || !this.name.equals(commonConnection.name()) || this.image.equals(commonConnection.image()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((this.id.hashCode() ^ 1000003) * 1000003) ^ this.degree) * 1000003) ^ this.name.hashCode()) * 1000003) ^ this.image.hashCode();
    }
}
