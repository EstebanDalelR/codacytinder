package com.tinder.domain.feed;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/tinder/domain/feed/ProfileChangeAnthem;", "Lcom/tinder/domain/feed/ActivityEvent;", "userNumber", "", "timestamp", "song", "Lcom/tinder/domain/feed/ActivityFeedSong;", "(JJLcom/tinder/domain/feed/ActivityFeedSong;)V", "getSong", "()Lcom/tinder/domain/feed/ActivityFeedSong;", "getTimestamp", "()J", "getUserNumber", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ProfileChangeAnthem extends ActivityEvent {
    @NotNull
    private final ActivityFeedSong song;
    private final long timestamp;
    private final long userNumber;

    @NotNull
    public static /* synthetic */ ProfileChangeAnthem copy$default(ProfileChangeAnthem profileChangeAnthem, long j, long j2, ActivityFeedSong activityFeedSong, int i, Object obj) {
        if ((i & 1) != 0) {
            j = profileChangeAnthem.userNumber;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = profileChangeAnthem.getTimestamp();
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            activityFeedSong = profileChangeAnthem.song;
        }
        return profileChangeAnthem.copy(j3, j4, activityFeedSong);
    }

    public final long component1() {
        return this.userNumber;
    }

    public final long component2() {
        return getTimestamp();
    }

    @NotNull
    public final ActivityFeedSong component3() {
        return this.song;
    }

    @NotNull
    public final ProfileChangeAnthem copy(long j, long j2, @NotNull ActivityFeedSong activityFeedSong) {
        C2668g.b(activityFeedSong, "song");
        return new ProfileChangeAnthem(j, j2, activityFeedSong);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProfileChangeAnthem) {
            ProfileChangeAnthem profileChangeAnthem = (ProfileChangeAnthem) obj;
            if ((this.userNumber == profileChangeAnthem.userNumber ? 1 : null) != null) {
                return ((getTimestamp() > profileChangeAnthem.getTimestamp() ? 1 : (getTimestamp() == profileChangeAnthem.getTimestamp() ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.song, profileChangeAnthem.song);
            }
        }
    }

    public int hashCode() {
        long j = this.userNumber;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long timestamp = getTimestamp();
        i = (i + ((int) (timestamp ^ (timestamp >>> 32)))) * 31;
        ActivityFeedSong activityFeedSong = this.song;
        return i + (activityFeedSong != null ? activityFeedSong.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProfileChangeAnthem(userNumber=");
        stringBuilder.append(this.userNumber);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(getTimestamp());
        stringBuilder.append(", song=");
        stringBuilder.append(this.song);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final long getUserNumber() {
        return this.userNumber;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final ActivityFeedSong getSong() {
        return this.song;
    }

    public ProfileChangeAnthem(long j, long j2, @NotNull ActivityFeedSong activityFeedSong) {
        C2668g.b(activityFeedSong, "song");
        super();
        this.userNumber = j;
        this.timestamp = j2;
        this.song = activityFeedSong;
    }
}
