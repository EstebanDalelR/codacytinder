package com.tinder.domain.feed;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/tinder/domain/feed/ProfileAddLoop;", "Lcom/tinder/domain/feed/ActivityEvent;", "userNumber", "", "timestamp", "loops", "", "Lcom/tinder/domain/feed/ActivityFeedLoop;", "(JJLjava/util/List;)V", "getLoops", "()Ljava/util/List;", "getTimestamp", "()J", "getUserNumber", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ProfileAddLoop extends ActivityEvent {
    @NotNull
    private final List<ActivityFeedLoop> loops;
    private final long timestamp;
    private final long userNumber;

    @NotNull
    public static /* synthetic */ ProfileAddLoop copy$default(ProfileAddLoop profileAddLoop, long j, long j2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = profileAddLoop.userNumber;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = profileAddLoop.getTimestamp();
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            list = profileAddLoop.loops;
        }
        return profileAddLoop.copy(j3, j4, list);
    }

    public final long component1() {
        return this.userNumber;
    }

    public final long component2() {
        return getTimestamp();
    }

    @NotNull
    public final List<ActivityFeedLoop> component3() {
        return this.loops;
    }

    @NotNull
    public final ProfileAddLoop copy(long j, long j2, @NotNull List<ActivityFeedLoop> list) {
        C2668g.b(list, "loops");
        return new ProfileAddLoop(j, j2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProfileAddLoop) {
            ProfileAddLoop profileAddLoop = (ProfileAddLoop) obj;
            if ((this.userNumber == profileAddLoop.userNumber ? 1 : null) != null) {
                return ((getTimestamp() > profileAddLoop.getTimestamp() ? 1 : (getTimestamp() == profileAddLoop.getTimestamp() ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.loops, profileAddLoop.loops);
            }
        }
    }

    public int hashCode() {
        long j = this.userNumber;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long timestamp = getTimestamp();
        i = (i + ((int) (timestamp ^ (timestamp >>> 32)))) * 31;
        List list = this.loops;
        return i + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProfileAddLoop(userNumber=");
        stringBuilder.append(this.userNumber);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(getTimestamp());
        stringBuilder.append(", loops=");
        stringBuilder.append(this.loops);
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
    public final List<ActivityFeedLoop> getLoops() {
        return this.loops;
    }

    public ProfileAddLoop(long j, long j2, @NotNull List<ActivityFeedLoop> list) {
        C2668g.b(list, "loops");
        super();
        this.userNumber = j;
        this.timestamp = j2;
        this.loops = list;
    }
}
