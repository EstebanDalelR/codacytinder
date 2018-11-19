package com.tinder.ads.analytics;

import com.tinder.ads.analytics.AdEventFields.From;
import com.tinder.ads.analytics.AdEventFields.Provider;
import com.tinder.ads.analytics.AdEventFields.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class AutoValue_AdEventFields extends AdEventFields {
    private final Number adCadence;
    private final String campaignId;
    private final String creativeId;
    private final From from;
    private final Boolean mute;
    private final Provider provider;
    private final Type type;

    static final class Builder extends com.tinder.ads.analytics.AdEventFields.Builder {
        private Number adCadence;
        private String campaignId;
        private String creativeId;
        private From from;
        private Boolean mute;
        private Provider provider;
        private Type type;

        Builder() {
        }

        Builder(AdEventFields adEventFields) {
            this.adCadence = adEventFields.adCadence();
            this.creativeId = adEventFields.creativeId();
            this.campaignId = adEventFields.campaignId();
            this.provider = adEventFields.provider();
            this.type = adEventFields.type();
            this.from = adEventFields.from();
            this.mute = adEventFields.mute();
        }

        public com.tinder.ads.analytics.AdEventFields.Builder adCadence(@Nullable Number number) {
            this.adCadence = number;
            return this;
        }

        public com.tinder.ads.analytics.AdEventFields.Builder creativeId(@Nullable String str) {
            this.creativeId = str;
            return this;
        }

        public com.tinder.ads.analytics.AdEventFields.Builder campaignId(@Nullable String str) {
            this.campaignId = str;
            return this;
        }

        public com.tinder.ads.analytics.AdEventFields.Builder provider(Provider provider) {
            this.provider = provider;
            return this;
        }

        public com.tinder.ads.analytics.AdEventFields.Builder type(Type type) {
            this.type = type;
            return this;
        }

        public com.tinder.ads.analytics.AdEventFields.Builder from(From from) {
            this.from = from;
            return this;
        }

        public com.tinder.ads.analytics.AdEventFields.Builder mute(@Nullable Boolean bool) {
            this.mute = bool;
            return this;
        }

        public AdEventFields build() {
            String str = "";
            if (this.provider == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" provider");
                str = stringBuilder.toString();
            }
            if (this.type == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" type");
                str = stringBuilder.toString();
            }
            if (this.from == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" from");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_AdEventFields(this.adCadence, this.creativeId, this.campaignId, this.provider, this.type, this.from, this.mute);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_AdEventFields(@Nullable Number number, @Nullable String str, @Nullable String str2, Provider provider, Type type, From from, @Nullable Boolean bool) {
        this.adCadence = number;
        this.creativeId = str;
        this.campaignId = str2;
        this.provider = provider;
        this.type = type;
        this.from = from;
        this.mute = bool;
    }

    @Nullable
    public Number adCadence() {
        return this.adCadence;
    }

    @Nullable
    public String creativeId() {
        return this.creativeId;
    }

    @Nullable
    public String campaignId() {
        return this.campaignId;
    }

    @NotNull
    public Provider provider() {
        return this.provider;
    }

    @NotNull
    public Type type() {
        return this.type;
    }

    @NotNull
    public From from() {
        return this.from;
    }

    @Nullable
    public Boolean mute() {
        return this.mute;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AdEventFields{adCadence=");
        stringBuilder.append(this.adCadence);
        stringBuilder.append(", creativeId=");
        stringBuilder.append(this.creativeId);
        stringBuilder.append(", campaignId=");
        stringBuilder.append(this.campaignId);
        stringBuilder.append(", provider=");
        stringBuilder.append(this.provider);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", from=");
        stringBuilder.append(this.from);
        stringBuilder.append(", mute=");
        stringBuilder.append(this.mute);
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
        r1 = r5 instanceof com.tinder.ads.analytics.AdEventFields;
        r2 = 0;
        if (r1 == 0) goto L_0x008e;
    L_0x0009:
        r5 = (com.tinder.ads.analytics.AdEventFields) r5;
        r1 = r4.adCadence;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.adCadence();
        if (r1 != 0) goto L_0x008c;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.adCadence;
        r3 = r5.adCadence();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008c;
    L_0x0022:
        r1 = r4.creativeId;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.creativeId();
        if (r1 != 0) goto L_0x008c;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.creativeId;
        r3 = r5.creativeId();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008c;
    L_0x0039:
        r1 = r4.campaignId;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r1 = r5.campaignId();
        if (r1 != 0) goto L_0x008c;
    L_0x0043:
        goto L_0x0050;
    L_0x0044:
        r1 = r4.campaignId;
        r3 = r5.campaignId();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008c;
    L_0x0050:
        r1 = r4.provider;
        r3 = r5.provider();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008c;
    L_0x005c:
        r1 = r4.type;
        r3 = r5.type();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008c;
    L_0x0068:
        r1 = r4.from;
        r3 = r5.from();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008c;
    L_0x0074:
        r1 = r4.mute;
        if (r1 != 0) goto L_0x007f;
    L_0x0078:
        r5 = r5.mute();
        if (r5 != 0) goto L_0x008c;
    L_0x007e:
        goto L_0x008d;
    L_0x007f:
        r1 = r4.mute;
        r5 = r5.mute();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x008c;
    L_0x008b:
        goto L_0x008d;
    L_0x008c:
        r0 = 0;
    L_0x008d:
        return r0;
    L_0x008e:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.ads.analytics.AutoValue_AdEventFields.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((((((this.adCadence == null ? 0 : this.adCadence.hashCode()) ^ 1000003) * 1000003) ^ (this.creativeId == null ? 0 : this.creativeId.hashCode())) * 1000003) ^ (this.campaignId == null ? 0 : this.campaignId.hashCode())) * 1000003) ^ this.provider.hashCode()) * 1000003) ^ this.type.hashCode()) * 1000003) ^ this.from.hashCode()) * 1000003;
        if (this.mute != null) {
            i = this.mute.hashCode();
        }
        return hashCode ^ i;
    }
}
