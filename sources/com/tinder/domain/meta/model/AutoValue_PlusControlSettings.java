package com.tinder.domain.meta.model;

import android.support.annotation.NonNull;
import com.tinder.domain.meta.model.PlusControlSettings.Blend;
import com.tinder.domain.meta.model.PlusControlSettings.DiscoverableParty;

final class AutoValue_PlusControlSettings extends PlusControlSettings {
    private final Blend blend;
    private final DiscoverableParty discoverableParty;
    private final boolean isHideAds;
    private final boolean isHideAge;
    private final boolean isHideDistance;

    static final class Builder extends com.tinder.domain.meta.model.PlusControlSettings.Builder {
        private Blend blend;
        private DiscoverableParty discoverableParty;
        private Boolean isHideAds;
        private Boolean isHideAge;
        private Boolean isHideDistance;

        Builder() {
        }

        Builder(PlusControlSettings plusControlSettings) {
            this.isHideAds = Boolean.valueOf(plusControlSettings.isHideAds());
            this.isHideAge = Boolean.valueOf(plusControlSettings.isHideAge());
            this.isHideDistance = Boolean.valueOf(plusControlSettings.isHideDistance());
            this.discoverableParty = plusControlSettings.discoverableParty();
            this.blend = plusControlSettings.blend();
        }

        public com.tinder.domain.meta.model.PlusControlSettings.Builder isHideAds(boolean z) {
            this.isHideAds = Boolean.valueOf(z);
            return this;
        }

        public com.tinder.domain.meta.model.PlusControlSettings.Builder isHideAge(boolean z) {
            this.isHideAge = Boolean.valueOf(z);
            return this;
        }

        public com.tinder.domain.meta.model.PlusControlSettings.Builder isHideDistance(boolean z) {
            this.isHideDistance = Boolean.valueOf(z);
            return this;
        }

        public com.tinder.domain.meta.model.PlusControlSettings.Builder discoverableParty(DiscoverableParty discoverableParty) {
            this.discoverableParty = discoverableParty;
            return this;
        }

        public com.tinder.domain.meta.model.PlusControlSettings.Builder blend(Blend blend) {
            this.blend = blend;
            return this;
        }

        public PlusControlSettings build() {
            String str = "";
            if (this.isHideAds == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" isHideAds");
                str = stringBuilder.toString();
            }
            if (this.isHideAge == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" isHideAge");
                str = stringBuilder.toString();
            }
            if (this.isHideDistance == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" isHideDistance");
                str = stringBuilder.toString();
            }
            if (this.discoverableParty == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" discoverableParty");
                str = stringBuilder.toString();
            }
            if (this.blend == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" blend");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_PlusControlSettings(this.isHideAds.booleanValue(), this.isHideAge.booleanValue(), this.isHideDistance.booleanValue(), this.discoverableParty, this.blend);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_PlusControlSettings(boolean z, boolean z2, boolean z3, DiscoverableParty discoverableParty, Blend blend) {
        this.isHideAds = z;
        this.isHideAge = z2;
        this.isHideDistance = z3;
        this.discoverableParty = discoverableParty;
        this.blend = blend;
    }

    @Deprecated
    public boolean isHideAds() {
        return this.isHideAds;
    }

    public boolean isHideAge() {
        return this.isHideAge;
    }

    public boolean isHideDistance() {
        return this.isHideDistance;
    }

    @NonNull
    public DiscoverableParty discoverableParty() {
        return this.discoverableParty;
    }

    @NonNull
    public Blend blend() {
        return this.blend;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PlusControlSettings{isHideAds=");
        stringBuilder.append(this.isHideAds);
        stringBuilder.append(", isHideAge=");
        stringBuilder.append(this.isHideAge);
        stringBuilder.append(", isHideDistance=");
        stringBuilder.append(this.isHideDistance);
        stringBuilder.append(", discoverableParty=");
        stringBuilder.append(this.discoverableParty);
        stringBuilder.append(", blend=");
        stringBuilder.append(this.blend);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlusControlSettings)) {
            return false;
        }
        PlusControlSettings plusControlSettings = (PlusControlSettings) obj;
        if (this.isHideAds != plusControlSettings.isHideAds() || this.isHideAge != plusControlSettings.isHideAge() || this.isHideDistance != plusControlSettings.isHideDistance() || !this.discoverableParty.equals(plusControlSettings.discoverableParty()) || this.blend.equals(plusControlSettings.blend()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = 1237;
        int i2 = ((((this.isHideAds ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.isHideAge ? 1231 : 1237)) * 1000003;
        if (this.isHideDistance) {
            i = 1231;
        }
        return ((((i2 ^ i) * 1000003) ^ this.discoverableParty.hashCode()) * 1000003) ^ this.blend.hashCode();
    }

    public com.tinder.domain.meta.model.PlusControlSettings.Builder toBuilder() {
        return new Builder(this);
    }
}
