package com.tinder.api.model.meta;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.model.meta.Meta.AccountConfig;

/* renamed from: com.tinder.api.model.meta.$AutoValue_Meta_AccountConfig */
abstract class C$AutoValue_Meta_AccountConfig extends AccountConfig {
    private final Boolean needPassword;

    C$AutoValue_Meta_AccountConfig(@Nullable Boolean bool) {
        this.needPassword = bool;
    }

    @Nullable
    @Json(name = "needs_password")
    public Boolean needPassword() {
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
        AccountConfig accountConfig = (AccountConfig) obj;
        if (this.needPassword != null) {
            z = this.needPassword.equals(accountConfig.needPassword());
        } else if (accountConfig.needPassword() != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (this.needPassword == null ? 0 : this.needPassword.hashCode()) ^ 1000003;
    }
}
