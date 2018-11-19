package com.tinder.domain.updates.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/tinder/domain/updates/model/PollInterval;", "", "persistentMillis", "", "standardMillis", "(JJ)V", "getPersistentMillis", "()J", "getStandardMillis", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class PollInterval {
    private final long persistentMillis;
    private final long standardMillis;

    @NotNull
    public static /* synthetic */ PollInterval copy$default(PollInterval pollInterval, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = pollInterval.persistentMillis;
        }
        if ((i & 2) != 0) {
            j2 = pollInterval.standardMillis;
        }
        return pollInterval.copy(j, j2);
    }

    public final long component1() {
        return this.persistentMillis;
    }

    public final long component2() {
        return this.standardMillis;
    }

    @NotNull
    public final PollInterval copy(long j, long j2) {
        return new PollInterval(j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PollInterval) {
            PollInterval pollInterval = (PollInterval) obj;
            if ((this.persistentMillis == pollInterval.persistentMillis ? 1 : null) != null) {
                if ((this.standardMillis == pollInterval.standardMillis ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.persistentMillis;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.standardMillis;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PollInterval(persistentMillis=");
        stringBuilder.append(this.persistentMillis);
        stringBuilder.append(", standardMillis=");
        stringBuilder.append(this.standardMillis);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public PollInterval(long j, long j2) {
        this.persistentMillis = j;
        this.standardMillis = j2;
        j = null;
        if ((this.persistentMillis > 0 ? 1 : null) == null) {
            throw new IllegalArgumentException("persistentMillis must be positive".toString());
        }
        if (this.standardMillis > 0) {
            j = 1;
        }
        if (j == null) {
            throw new IllegalArgumentException("standardMillis must be positive".toString());
        }
    }

    public final long getPersistentMillis() {
        return this.persistentMillis;
    }

    public final long getStandardMillis() {
        return this.standardMillis;
    }
}
