package com.tinder.domain.feed;

import com.tinder.api.ManagerWebServices;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/tinder/domain/feed/ProfileChangeSchool;", "Lcom/tinder/domain/feed/ActivityEvent;", "userNumber", "", "timestamp", "schools", "", "Lcom/tinder/domain/feed/ActivityFeedSchool;", "(JJLjava/util/List;)V", "getSchools", "()Ljava/util/List;", "getTimestamp", "()J", "getUserNumber", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ProfileChangeSchool extends ActivityEvent {
    @NotNull
    private final List<ActivityFeedSchool> schools;
    private final long timestamp;
    private final long userNumber;

    @NotNull
    public static /* synthetic */ ProfileChangeSchool copy$default(ProfileChangeSchool profileChangeSchool, long j, long j2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = profileChangeSchool.userNumber;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = profileChangeSchool.getTimestamp();
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            list = profileChangeSchool.schools;
        }
        return profileChangeSchool.copy(j3, j4, list);
    }

    public final long component1() {
        return this.userNumber;
    }

    public final long component2() {
        return getTimestamp();
    }

    @NotNull
    public final List<ActivityFeedSchool> component3() {
        return this.schools;
    }

    @NotNull
    public final ProfileChangeSchool copy(long j, long j2, @NotNull List<ActivityFeedSchool> list) {
        C2668g.b(list, ManagerWebServices.PARAM_SCHOOLS);
        return new ProfileChangeSchool(j, j2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProfileChangeSchool) {
            ProfileChangeSchool profileChangeSchool = (ProfileChangeSchool) obj;
            if ((this.userNumber == profileChangeSchool.userNumber ? 1 : null) != null) {
                return ((getTimestamp() > profileChangeSchool.getTimestamp() ? 1 : (getTimestamp() == profileChangeSchool.getTimestamp() ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.schools, profileChangeSchool.schools);
            }
        }
    }

    public int hashCode() {
        long j = this.userNumber;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long timestamp = getTimestamp();
        i = (i + ((int) (timestamp ^ (timestamp >>> 32)))) * 31;
        List list = this.schools;
        return i + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProfileChangeSchool(userNumber=");
        stringBuilder.append(this.userNumber);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(getTimestamp());
        stringBuilder.append(", schools=");
        stringBuilder.append(this.schools);
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
    public final List<ActivityFeedSchool> getSchools() {
        return this.schools;
    }

    public ProfileChangeSchool(long j, long j2, @NotNull List<ActivityFeedSchool> list) {
        C2668g.b(list, ManagerWebServices.PARAM_SCHOOLS);
        super();
        this.userNumber = j;
        this.timestamp = j2;
        this.schools = list;
    }
}
