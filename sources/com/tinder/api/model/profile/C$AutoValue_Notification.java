package com.tinder.api.model.profile;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import java.util.List;

/* renamed from: com.tinder.api.model.profile.$AutoValue_Notification */
abstract class C$AutoValue_Notification extends Notification {
    private final List<Integer> reasons;
    private final int tier;
    private final String type;

    C$AutoValue_Notification(String str, int i, @Nullable List<Integer> list) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.type = str;
        this.tier = i;
        this.reasons = list;
    }

    @Json(name = "type")
    public String type() {
        return this.type;
    }

    @Json(name = "tier")
    public int tier() {
        return this.tier;
    }

    @Nullable
    @Json(name = "reasons")
    public List<Integer> reasons() {
        return this.reasons;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Notification{type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", tier=");
        stringBuilder.append(this.tier);
        stringBuilder.append(", reasons=");
        stringBuilder.append(this.reasons);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Notification)) {
            return false;
        }
        Notification notification = (Notification) obj;
        if (this.type.equals(notification.type()) && this.tier == notification.tier()) {
            if (this.reasons == null) {
                if (notification.reasons() == null) {
                    return z;
                }
            } else if (this.reasons.equals(notification.reasons()) != null) {
                return z;
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        return ((((this.type.hashCode() ^ 1000003) * 1000003) ^ this.tier) * 1000003) ^ (this.reasons == null ? 0 : this.reasons.hashCode());
    }
}
