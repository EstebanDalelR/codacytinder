package com.tinder.api.model.activityfeed;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JD\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/tinder/api/model/activityfeed/ApiActivityEventInstagramConnect;", "", "userNumber", "", "timestamp", "instagramUserName", "", "photos", "", "Lcom/tinder/api/model/activityfeed/ApiActivityFeedPhoto;", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)V", "getInstagramUserName", "()Ljava/lang/String;", "getPhotos", "()Ljava/util/List;", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUserNumber", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)Lcom/tinder/api/model/activityfeed/ApiActivityEventInstagramConnect;", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ApiActivityEventInstagramConnect {
    @Nullable
    private final String instagramUserName;
    @Nullable
    private final List<ApiActivityFeedPhoto> photos;
    @Nullable
    private final Long timestamp;
    @Nullable
    private final Long userNumber;

    @NotNull
    public static /* synthetic */ ApiActivityEventInstagramConnect copy$default(ApiActivityEventInstagramConnect apiActivityEventInstagramConnect, Long l, Long l2, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            l = apiActivityEventInstagramConnect.userNumber;
        }
        if ((i & 2) != 0) {
            l2 = apiActivityEventInstagramConnect.timestamp;
        }
        if ((i & 4) != 0) {
            str = apiActivityEventInstagramConnect.instagramUserName;
        }
        if ((i & 8) != 0) {
            list = apiActivityEventInstagramConnect.photos;
        }
        return apiActivityEventInstagramConnect.copy(l, l2, str, list);
    }

    @Nullable
    public final Long component1() {
        return this.userNumber;
    }

    @Nullable
    public final Long component2() {
        return this.timestamp;
    }

    @Nullable
    public final String component3() {
        return this.instagramUserName;
    }

    @Nullable
    public final List<ApiActivityFeedPhoto> component4() {
        return this.photos;
    }

    @NotNull
    public final ApiActivityEventInstagramConnect copy(@Nullable Long l, @Nullable Long l2, @Nullable String str, @Nullable List<ApiActivityFeedPhoto> list) {
        return new ApiActivityEventInstagramConnect(l, l2, str, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApiActivityEventInstagramConnect) {
                ApiActivityEventInstagramConnect apiActivityEventInstagramConnect = (ApiActivityEventInstagramConnect) obj;
                if (C2668g.a(this.userNumber, apiActivityEventInstagramConnect.userNumber) && C2668g.a(this.timestamp, apiActivityEventInstagramConnect.timestamp) && C2668g.a(this.instagramUserName, apiActivityEventInstagramConnect.instagramUserName) && C2668g.a(this.photos, apiActivityEventInstagramConnect.photos)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Long l = this.userNumber;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Long l2 = this.timestamp;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str = this.instagramUserName;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.photos;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ApiActivityEventInstagramConnect(userNumber=");
        stringBuilder.append(this.userNumber);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", instagramUserName=");
        stringBuilder.append(this.instagramUserName);
        stringBuilder.append(", photos=");
        stringBuilder.append(this.photos);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ApiActivityEventInstagramConnect(@Nullable Long l, @Nullable Long l2, @Nullable String str, @Nullable List<ApiActivityFeedPhoto> list) {
        this.userNumber = l;
        this.timestamp = l2;
        this.instagramUserName = str;
        this.photos = list;
    }

    @Nullable
    public final Long getUserNumber() {
        return this.userNumber;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final String getInstagramUserName() {
        return this.instagramUserName;
    }

    @Nullable
    public final List<ApiActivityFeedPhoto> getPhotos() {
        return this.photos;
    }
}
