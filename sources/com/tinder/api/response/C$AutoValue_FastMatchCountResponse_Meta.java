package com.tinder.api.response;

import android.support.annotation.Nullable;
import com.tinder.api.response.FastMatchCountResponse.Meta;

/* renamed from: com.tinder.api.response.$AutoValue_FastMatchCountResponse_Meta */
abstract class C$AutoValue_FastMatchCountResponse_Meta extends Meta {
    private final Integer status;

    C$AutoValue_FastMatchCountResponse_Meta(@Nullable Integer num) {
        this.status = num;
    }

    @Nullable
    public Integer status() {
        return this.status;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Meta{status=");
        stringBuilder.append(this.status);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Meta)) {
            return false;
        }
        Meta meta = (Meta) obj;
        if (this.status != null) {
            z = this.status.equals(meta.status());
        } else if (meta.status() != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (this.status == null ? 0 : this.status.hashCode()) ^ 1000003;
    }
}
