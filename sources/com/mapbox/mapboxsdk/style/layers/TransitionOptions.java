package com.mapbox.mapboxsdk.style.layers;

public class TransitionOptions {
    private long delay;
    private long duration;

    public TransitionOptions(long j, long j2) {
        this.duration = j;
        this.delay = j2;
    }

    public static TransitionOptions fromTransitionOptions(long j, long j2) {
        return new TransitionOptions(j, j2);
    }

    public long getDuration() {
        return this.duration;
    }

    public long getDelay() {
        return this.delay;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                TransitionOptions transitionOptions = (TransitionOptions) obj;
                if (this.duration != transitionOptions.duration) {
                    return false;
                }
                if (this.delay != transitionOptions.delay) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) (this.duration ^ (this.duration >>> 32))) * 31) + ((int) (this.delay ^ (this.delay >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TransitionOptions{duration=");
        stringBuilder.append(this.duration);
        stringBuilder.append(", delay=");
        stringBuilder.append(this.delay);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
