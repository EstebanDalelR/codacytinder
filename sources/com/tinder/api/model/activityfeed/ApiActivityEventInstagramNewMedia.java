package com.tinder.api.model.activityfeed;

import com.squareup.moshi.Json;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003Jh\u0010 \u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0018\u0010\u0014¨\u0006("}, d2 = {"Lcom/tinder/api/model/activityfeed/ApiActivityEventInstagramNewMedia;", "", "id", "", "userId", "", "userName", "userNumber", "timestamp", "caption", "media", "", "Lcom/tinder/api/model/activityfeed/ApiActivityEventInstagramMedia;", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)V", "getCaption", "()Ljava/lang/String;", "getId", "getMedia", "()Ljava/util/List;", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUserId", "getUserName", "getUserNumber", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)Lcom/tinder/api/model/activityfeed/ApiActivityEventInstagramNewMedia;", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ApiActivityEventInstagramNewMedia {
    @Nullable
    private final String caption;
    @Nullable
    private final String id;
    @Nullable
    private final List<ApiActivityEventInstagramMedia> media;
    @Nullable
    private final Long timestamp;
    @Nullable
    private final Long userId;
    @Nullable
    private final String userName;
    @Nullable
    private final Long userNumber;

    @NotNull
    public static /* synthetic */ ApiActivityEventInstagramNewMedia copy$default(ApiActivityEventInstagramNewMedia apiActivityEventInstagramNewMedia, String str, Long l, String str2, Long l2, Long l3, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiActivityEventInstagramNewMedia.id;
        }
        if ((i & 2) != 0) {
            l = apiActivityEventInstagramNewMedia.userId;
        }
        Long l4 = l;
        if ((i & 4) != 0) {
            str2 = apiActivityEventInstagramNewMedia.userName;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            l2 = apiActivityEventInstagramNewMedia.userNumber;
        }
        Long l5 = l2;
        if ((i & 16) != 0) {
            l3 = apiActivityEventInstagramNewMedia.timestamp;
        }
        Long l6 = l3;
        if ((i & 32) != 0) {
            str3 = apiActivityEventInstagramNewMedia.caption;
        }
        String str5 = str3;
        if ((i & 64) != 0) {
            list = apiActivityEventInstagramNewMedia.media;
        }
        return apiActivityEventInstagramNewMedia.copy(str, l4, str4, l5, l6, str5, list);
    }

    @Nullable
    public final String component1() {
        return this.id;
    }

    @Nullable
    public final Long component2() {
        return this.userId;
    }

    @Nullable
    public final String component3() {
        return this.userName;
    }

    @Nullable
    public final Long component4() {
        return this.userNumber;
    }

    @Nullable
    public final Long component5() {
        return this.timestamp;
    }

    @Nullable
    public final String component6() {
        return this.caption;
    }

    @Nullable
    public final List<ApiActivityEventInstagramMedia> component7() {
        return this.media;
    }

    @NotNull
    public final ApiActivityEventInstagramNewMedia copy(@Nullable @Json(name = "instagramMediaId") String str, @Nullable @Json(name = "instagramUserId") Long l, @Nullable @Json(name = "instagramUserName") String str2, @Nullable Long l2, @Nullable Long l3, @Nullable String str3, @Nullable List<ApiActivityEventInstagramMedia> list) {
        return new ApiActivityEventInstagramNewMedia(str, l, str2, l2, l3, str3, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApiActivityEventInstagramNewMedia) {
                ApiActivityEventInstagramNewMedia apiActivityEventInstagramNewMedia = (ApiActivityEventInstagramNewMedia) obj;
                if (C2668g.a(this.id, apiActivityEventInstagramNewMedia.id) && C2668g.a(this.userId, apiActivityEventInstagramNewMedia.userId) && C2668g.a(this.userName, apiActivityEventInstagramNewMedia.userName) && C2668g.a(this.userNumber, apiActivityEventInstagramNewMedia.userNumber) && C2668g.a(this.timestamp, apiActivityEventInstagramNewMedia.timestamp) && C2668g.a(this.caption, apiActivityEventInstagramNewMedia.caption) && C2668g.a(this.media, apiActivityEventInstagramNewMedia.media)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l = this.userId;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str2 = this.userName;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        l = this.userNumber;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.timestamp;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str2 = this.caption;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List list = this.media;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ApiActivityEventInstagramNewMedia(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", userName=");
        stringBuilder.append(this.userName);
        stringBuilder.append(", userNumber=");
        stringBuilder.append(this.userNumber);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", caption=");
        stringBuilder.append(this.caption);
        stringBuilder.append(", media=");
        stringBuilder.append(this.media);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ApiActivityEventInstagramNewMedia(@Nullable @Json(name = "instagramMediaId") String str, @Nullable @Json(name = "instagramUserId") Long l, @Nullable @Json(name = "instagramUserName") String str2, @Nullable Long l2, @Nullable Long l3, @Nullable String str3, @Nullable List<ApiActivityEventInstagramMedia> list) {
        this.id = str;
        this.userId = l;
        this.userName = str2;
        this.userNumber = l2;
        this.timestamp = l3;
        this.caption = str3;
        this.media = list;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Long getUserId() {
        return this.userId;
    }

    @Nullable
    public final String getUserName() {
        return this.userName;
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
    public final String getCaption() {
        return this.caption;
    }

    @Nullable
    public final List<ApiActivityEventInstagramMedia> getMedia() {
        return this.media;
    }
}
