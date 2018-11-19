package com.tinder.recs.model;

final class AutoValue_TappyConfig extends TappyConfig {
    private final int indicatorStartDelay;
    private final boolean isTutorialShown;

    static final class Builder extends com.tinder.recs.model.TappyConfig.Builder {
        private Integer indicatorStartDelay;
        private Boolean isTutorialShown;

        Builder() {
        }

        Builder(TappyConfig tappyConfig) {
            this.isTutorialShown = Boolean.valueOf(tappyConfig.isTutorialShown());
            this.indicatorStartDelay = Integer.valueOf(tappyConfig.indicatorStartDelay());
        }

        public com.tinder.recs.model.TappyConfig.Builder isTutorialShown(boolean z) {
            this.isTutorialShown = Boolean.valueOf(z);
            return this;
        }

        public com.tinder.recs.model.TappyConfig.Builder indicatorStartDelay(int i) {
            this.indicatorStartDelay = Integer.valueOf(i);
            return this;
        }

        public TappyConfig build() {
            String str = "";
            if (this.isTutorialShown == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" isTutorialShown");
                str = stringBuilder.toString();
            }
            if (this.indicatorStartDelay == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" indicatorStartDelay");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_TappyConfig(this.isTutorialShown.booleanValue(), this.indicatorStartDelay.intValue());
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_TappyConfig(boolean z, int i) {
        this.isTutorialShown = z;
        this.indicatorStartDelay = i;
    }

    public boolean isTutorialShown() {
        return this.isTutorialShown;
    }

    public int indicatorStartDelay() {
        return this.indicatorStartDelay;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TappyConfig{isTutorialShown=");
        stringBuilder.append(this.isTutorialShown);
        stringBuilder.append(", indicatorStartDelay=");
        stringBuilder.append(this.indicatorStartDelay);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TappyConfig)) {
            return false;
        }
        TappyConfig tappyConfig = (TappyConfig) obj;
        if (this.isTutorialShown != tappyConfig.isTutorialShown() || this.indicatorStartDelay != tappyConfig.indicatorStartDelay()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (((this.isTutorialShown ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.indicatorStartDelay;
    }

    public com.tinder.recs.model.TappyConfig.Builder toBuilder() {
        return new Builder(this);
    }
}
