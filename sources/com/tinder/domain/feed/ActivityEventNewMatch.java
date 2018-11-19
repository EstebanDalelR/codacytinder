package com.tinder.domain.feed;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/tinder/domain/feed/ActivityEventNewMatch;", "Lcom/tinder/domain/feed/ActivityEvent;", "userNumber", "", "otherUserNumber", "timestamp", "(JJJ)V", "getOtherUserNumber", "()J", "getTimestamp", "getUserNumber", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ActivityEventNewMatch extends ActivityEvent {
    private final long otherUserNumber;
    private final long timestamp;
    private final long userNumber;

    @NotNull
    public static /* synthetic */ ActivityEventNewMatch copy$default(ActivityEventNewMatch activityEventNewMatch, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = activityEventNewMatch.userNumber;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = activityEventNewMatch.otherUserNumber;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = activityEventNewMatch.getTimestamp();
        }
        return activityEventNewMatch.copy(j4, j5, j3);
    }

    public final long component1() {
        return this.userNumber;
    }

    public final long component2() {
        return this.otherUserNumber;
    }

    public final long component3() {
        return getTimestamp();
    }

    @NotNull
    public final ActivityEventNewMatch copy(long j, long j2, long j3) {
        return new ActivityEventNewMatch(j, j2, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActivityEventNewMatch) {
            ActivityEventNewMatch activityEventNewMatch = (ActivityEventNewMatch) obj;
            if ((this.userNumber == activityEventNewMatch.userNumber ? 1 : null) != null) {
                if ((this.otherUserNumber == activityEventNewMatch.otherUserNumber ? 1 : null) != null) {
                    if ((getTimestamp() == activityEventNewMatch.getTimestamp() ? 1 : null) != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.userNumber;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.otherUserNumber;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = getTimestamp();
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActivityEventNewMatch(userNumber=");
        stringBuilder.append(this.userNumber);
        stringBuilder.append(", otherUserNumber=");
        stringBuilder.append(this.otherUserNumber);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(getTimestamp());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final long getUserNumber() {
        return this.userNumber;
    }

    public final long getOtherUserNumber() {
        return this.otherUserNumber;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public ActivityEventNewMatch(long j, long j2, long j3) {
        super();
        this.userNumber = j;
        this.otherUserNumber = j2;
        this.timestamp = j3;
    }
}
