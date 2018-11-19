package com.tinder.api.request;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;

/* renamed from: com.tinder.api.request.$AutoValue_DiscoverabilitySettingsRequest */
abstract class C$AutoValue_DiscoverabilitySettingsRequest extends DiscoverabilitySettingsRequest {
    private final Boolean isDiscoverable;
    private final Boolean isSquadsDiscoverable;

    static final class Builder extends com.tinder.api.request.DiscoverabilitySettingsRequest.Builder {
        private Boolean isDiscoverable;
        private Boolean isSquadsDiscoverable;

        Builder() {
        }

        Builder(DiscoverabilitySettingsRequest discoverabilitySettingsRequest) {
            this.isDiscoverable = discoverabilitySettingsRequest.isDiscoverable();
            this.isSquadsDiscoverable = discoverabilitySettingsRequest.isSquadsDiscoverable();
        }

        public com.tinder.api.request.DiscoverabilitySettingsRequest.Builder setIsDiscoverable(@Nullable Boolean bool) {
            this.isDiscoverable = bool;
            return this;
        }

        public com.tinder.api.request.DiscoverabilitySettingsRequest.Builder setIsSquadsDiscoverable(@Nullable Boolean bool) {
            this.isSquadsDiscoverable = bool;
            return this;
        }

        public DiscoverabilitySettingsRequest build() {
            return new AutoValue_DiscoverabilitySettingsRequest(this.isDiscoverable, this.isSquadsDiscoverable);
        }
    }

    C$AutoValue_DiscoverabilitySettingsRequest(@Nullable Boolean bool, @Nullable Boolean bool2) {
        this.isDiscoverable = bool;
        this.isSquadsDiscoverable = bool2;
    }

    @Nullable
    @Json(name = "discoverable")
    public Boolean isDiscoverable() {
        return this.isDiscoverable;
    }

    @Nullable
    @Json(name = "squads_discoverable")
    public Boolean isSquadsDiscoverable() {
        return this.isSquadsDiscoverable;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DiscoverabilitySettingsRequest{isDiscoverable=");
        stringBuilder.append(this.isDiscoverable);
        stringBuilder.append(", isSquadsDiscoverable=");
        stringBuilder.append(this.isSquadsDiscoverable);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r5 != r4) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof com.tinder.api.request.DiscoverabilitySettingsRequest;
        r2 = 0;
        if (r1 == 0) goto L_0x003c;
    L_0x0009:
        r5 = (com.tinder.api.request.DiscoverabilitySettingsRequest) r5;
        r1 = r4.isDiscoverable;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.isDiscoverable();
        if (r1 != 0) goto L_0x003a;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.isDiscoverable;
        r3 = r5.isDiscoverable();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003a;
    L_0x0022:
        r1 = r4.isSquadsDiscoverable;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r5 = r5.isSquadsDiscoverable();
        if (r5 != 0) goto L_0x003a;
    L_0x002c:
        goto L_0x003b;
    L_0x002d:
        r1 = r4.isSquadsDiscoverable;
        r5 = r5.isSquadsDiscoverable();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x003a;
    L_0x0039:
        goto L_0x003b;
    L_0x003a:
        r0 = 0;
    L_0x003b:
        return r0;
    L_0x003c:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.request.$AutoValue_DiscoverabilitySettingsRequest.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.isDiscoverable == null ? 0 : this.isDiscoverable.hashCode()) ^ 1000003) * 1000003;
        if (this.isSquadsDiscoverable != null) {
            i = this.isSquadsDiscoverable.hashCode();
        }
        return hashCode ^ i;
    }
}
