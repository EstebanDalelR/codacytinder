package com.tinder.domain.common.model;

final class AutoValue_TimeInterval extends TimeInterval {
    private final int length;
    private final TimeUnit unit;

    AutoValue_TimeInterval(int i, TimeUnit timeUnit) {
        this.length = i;
        if (timeUnit == null) {
            throw new NullPointerException("Null unit");
        }
        this.unit = timeUnit;
    }

    public int length() {
        return this.length;
    }

    public TimeUnit unit() {
        return this.unit;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TimeInterval{length=");
        stringBuilder.append(this.length);
        stringBuilder.append(", unit=");
        stringBuilder.append(this.unit);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TimeInterval)) {
            return false;
        }
        TimeInterval timeInterval = (TimeInterval) obj;
        if (this.length != timeInterval.length() || this.unit.equals(timeInterval.unit()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.length ^ 1000003) * 1000003) ^ this.unit.hashCode();
    }
}
