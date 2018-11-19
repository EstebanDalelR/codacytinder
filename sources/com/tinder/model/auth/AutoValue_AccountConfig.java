package com.tinder.model.auth;

final class AutoValue_AccountConfig extends AccountConfig {
    private final boolean needPassword;

    AutoValue_AccountConfig(boolean z) {
        this.needPassword = z;
    }

    public boolean needPassword() {
        return this.needPassword;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AccountConfig{needPassword=");
        stringBuilder.append(this.needPassword);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AccountConfig)) {
            return false;
        }
        if (this.needPassword != ((AccountConfig) obj).needPassword()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (this.needPassword ? 1231 : 1237) ^ 1000003;
    }
}
