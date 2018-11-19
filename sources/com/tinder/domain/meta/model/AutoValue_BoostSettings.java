package com.tinder.domain.meta.model;

import android.support.annotation.NonNull;
import org.joda.time.DateTime;

final class AutoValue_BoostSettings extends BoostSettings {
    private final int boostRefreshAmount;
    private final int boostRefreshInterval;
    private final BoostSettings$Unit boostRefreshIntervalUnit;
    private final long duration;
    private final DateTime expireAt;
    private final String id;
    private final double multiplier;
    private final int remaining;
    private final DateTime resetAt;

    static final class Builder extends BoostSettings$Builder {
        private Integer boostRefreshAmount;
        private Integer boostRefreshInterval;
        private BoostSettings$Unit boostRefreshIntervalUnit;
        private Long duration;
        private DateTime expireAt;
        private String id;
        private Double multiplier;
        private Integer remaining;
        private DateTime resetAt;

        Builder() {
        }

        Builder(BoostSettings boostSettings) {
            this.remaining = Integer.valueOf(boostSettings.remaining());
            this.boostRefreshAmount = Integer.valueOf(boostSettings.boostRefreshAmount());
            this.boostRefreshInterval = Integer.valueOf(boostSettings.boostRefreshInterval());
            this.boostRefreshIntervalUnit = boostSettings.boostRefreshIntervalUnit();
            this.resetAt = boostSettings.resetAt();
            this.duration = Long.valueOf(boostSettings.duration());
            this.expireAt = boostSettings.expireAt();
            this.id = boostSettings.id();
            this.multiplier = Double.valueOf(boostSettings.multiplier());
        }

        public BoostSettings$Builder remaining(int i) {
            this.remaining = Integer.valueOf(i);
            return this;
        }

        public BoostSettings$Builder boostRefreshAmount(int i) {
            this.boostRefreshAmount = Integer.valueOf(i);
            return this;
        }

        public BoostSettings$Builder boostRefreshInterval(int i) {
            this.boostRefreshInterval = Integer.valueOf(i);
            return this;
        }

        public BoostSettings$Builder boostRefreshIntervalUnit(BoostSettings$Unit boostSettings$Unit) {
            this.boostRefreshIntervalUnit = boostSettings$Unit;
            return this;
        }

        public BoostSettings$Builder resetAt(DateTime dateTime) {
            this.resetAt = dateTime;
            return this;
        }

        public BoostSettings$Builder duration(long j) {
            this.duration = Long.valueOf(j);
            return this;
        }

        public BoostSettings$Builder expireAt(DateTime dateTime) {
            this.expireAt = dateTime;
            return this;
        }

        public BoostSettings$Builder id(String str) {
            this.id = str;
            return this;
        }

        public BoostSettings$Builder multiplier(double d) {
            this.multiplier = Double.valueOf(d);
            return this;
        }

        public BoostSettings build() {
            String str = "";
            if (this.remaining == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" remaining");
                str = stringBuilder.toString();
            }
            if (this.boostRefreshAmount == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" boostRefreshAmount");
                str = stringBuilder.toString();
            }
            if (this.boostRefreshInterval == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" boostRefreshInterval");
                str = stringBuilder.toString();
            }
            if (this.boostRefreshIntervalUnit == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" boostRefreshIntervalUnit");
                str = stringBuilder.toString();
            }
            if (this.resetAt == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" resetAt");
                str = stringBuilder.toString();
            }
            if (this.duration == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" duration");
                str = stringBuilder.toString();
            }
            if (this.expireAt == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" expireAt");
                str = stringBuilder.toString();
            }
            if (this.id == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" id");
                str = stringBuilder.toString();
            }
            if (this.multiplier == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" multiplier");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_BoostSettings(this.remaining.intValue(), this.boostRefreshAmount.intValue(), this.boostRefreshInterval.intValue(), this.boostRefreshIntervalUnit, this.resetAt, this.duration.longValue(), this.expireAt, this.id, this.multiplier.doubleValue());
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_BoostSettings(int i, int i2, int i3, BoostSettings$Unit boostSettings$Unit, DateTime dateTime, long j, DateTime dateTime2, String str, double d) {
        this.remaining = i;
        this.boostRefreshAmount = i2;
        this.boostRefreshInterval = i3;
        this.boostRefreshIntervalUnit = boostSettings$Unit;
        this.resetAt = dateTime;
        this.duration = j;
        this.expireAt = dateTime2;
        this.id = str;
        this.multiplier = d;
    }

    public int remaining() {
        return this.remaining;
    }

    public int boostRefreshAmount() {
        return this.boostRefreshAmount;
    }

    public int boostRefreshInterval() {
        return this.boostRefreshInterval;
    }

    @NonNull
    public BoostSettings$Unit boostRefreshIntervalUnit() {
        return this.boostRefreshIntervalUnit;
    }

    @NonNull
    public DateTime resetAt() {
        return this.resetAt;
    }

    public long duration() {
        return this.duration;
    }

    @NonNull
    public DateTime expireAt() {
        return this.expireAt;
    }

    @NonNull
    public String id() {
        return this.id;
    }

    public double multiplier() {
        return this.multiplier;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BoostSettings{remaining=");
        stringBuilder.append(this.remaining);
        stringBuilder.append(", boostRefreshAmount=");
        stringBuilder.append(this.boostRefreshAmount);
        stringBuilder.append(", boostRefreshInterval=");
        stringBuilder.append(this.boostRefreshInterval);
        stringBuilder.append(", boostRefreshIntervalUnit=");
        stringBuilder.append(this.boostRefreshIntervalUnit);
        stringBuilder.append(", resetAt=");
        stringBuilder.append(this.resetAt);
        stringBuilder.append(", duration=");
        stringBuilder.append(this.duration);
        stringBuilder.append(", expireAt=");
        stringBuilder.append(this.expireAt);
        stringBuilder.append(", id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", multiplier=");
        stringBuilder.append(this.multiplier);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BoostSettings)) {
            return false;
        }
        BoostSettings boostSettings = (BoostSettings) obj;
        if (this.remaining != boostSettings.remaining() || this.boostRefreshAmount != boostSettings.boostRefreshAmount() || this.boostRefreshInterval != boostSettings.boostRefreshInterval() || !this.boostRefreshIntervalUnit.equals(boostSettings.boostRefreshIntervalUnit()) || !this.resetAt.equals(boostSettings.resetAt()) || this.duration != boostSettings.duration() || !this.expireAt.equals(boostSettings.expireAt()) || !this.id.equals(boostSettings.id()) || Double.doubleToLongBits(this.multiplier) != Double.doubleToLongBits(boostSettings.multiplier())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (int) (((long) (((((((int) (((long) ((((((((((this.remaining ^ 1000003) * 1000003) ^ this.boostRefreshAmount) * 1000003) ^ this.boostRefreshInterval) * 1000003) ^ this.boostRefreshIntervalUnit.hashCode()) * 1000003) ^ this.resetAt.hashCode()) * 1000003)) ^ ((this.duration >>> 32) ^ this.duration))) * 1000003) ^ this.expireAt.hashCode()) * 1000003) ^ this.id.hashCode()) * 1000003)) ^ ((Double.doubleToLongBits(this.multiplier) >>> 32) ^ Double.doubleToLongBits(this.multiplier)));
    }
}
