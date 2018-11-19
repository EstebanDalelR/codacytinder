package com.tinder.domain.feed;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/tinder/domain/feed/InstagramConnect;", "Lcom/tinder/domain/feed/ActivityEvent;", "userNumber", "", "timestamp", "instagramUserName", "", "photos", "", "Lcom/tinder/domain/feed/ActivityFeedPhoto;", "(JJLjava/lang/String;Ljava/util/List;)V", "getInstagramUserName", "()Ljava/lang/String;", "getPhotos", "()Ljava/util/List;", "getTimestamp", "()J", "getUserNumber", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class InstagramConnect extends ActivityEvent {
    @NotNull
    private final String instagramUserName;
    @NotNull
    private final List<ActivityFeedPhoto> photos;
    private final long timestamp;
    private final long userNumber;

    @NotNull
    public static /* synthetic */ InstagramConnect copy$default(InstagramConnect instagramConnect, long j, long j2, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = instagramConnect.userNumber;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = instagramConnect.getTimestamp();
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            str = instagramConnect.instagramUserName;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            list = instagramConnect.photos;
        }
        return instagramConnect.copy(j3, j4, str2, list);
    }

    public final long component1() {
        return this.userNumber;
    }

    public final long component2() {
        return getTimestamp();
    }

    @NotNull
    public final String component3() {
        return this.instagramUserName;
    }

    @NotNull
    public final List<ActivityFeedPhoto> component4() {
        return this.photos;
    }

    @NotNull
    public final InstagramConnect copy(long j, long j2, @NotNull String str, @NotNull List<ActivityFeedPhoto> list) {
        C2668g.b(str, "instagramUserName");
        C2668g.b(list, "photos");
        return new InstagramConnect(j, j2, str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InstagramConnect) {
            InstagramConnect instagramConnect = (InstagramConnect) obj;
            if ((this.userNumber == instagramConnect.userNumber ? 1 : null) != null) {
                return ((getTimestamp() > instagramConnect.getTimestamp() ? 1 : (getTimestamp() == instagramConnect.getTimestamp() ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.instagramUserName, instagramConnect.instagramUserName) && C2668g.a(this.photos, instagramConnect.photos);
            }
        }
    }

    public int hashCode() {
        long j = this.userNumber;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long timestamp = getTimestamp();
        i = (i + ((int) (timestamp ^ (timestamp >>> 32)))) * 31;
        String str = this.instagramUserName;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.photos;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InstagramConnect(userNumber=");
        stringBuilder.append(this.userNumber);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(getTimestamp());
        stringBuilder.append(", instagramUserName=");
        stringBuilder.append(this.instagramUserName);
        stringBuilder.append(", photos=");
        stringBuilder.append(this.photos);
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
    public final String getInstagramUserName() {
        return this.instagramUserName;
    }

    @NotNull
    public final List<ActivityFeedPhoto> getPhotos() {
        return this.photos;
    }

    public InstagramConnect(long j, long j2, @NotNull String str, @NotNull List<ActivityFeedPhoto> list) {
        C2668g.b(str, "instagramUserName");
        C2668g.b(list, "photos");
        super();
        this.userNumber = j;
        this.timestamp = j2;
        this.instagramUserName = str;
        this.photos = list;
    }
}
