package com.tinder.api.model.activityfeed;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000f\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/tinder/api/model/activityfeed/ApiActivityFeedVideo;", "", "width", "", "height", "url", "", "name", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "()Ljava/lang/String;", "getUrl", "getWidth", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/tinder/api/model/activityfeed/ApiActivityFeedVideo;", "equals", "", "other", "hashCode", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ApiActivityFeedVideo {
    @Nullable
    private final Integer height;
    @Nullable
    private final String name;
    @Nullable
    private final String url;
    @Nullable
    private final Integer width;

    @NotNull
    public static /* synthetic */ ApiActivityFeedVideo copy$default(ApiActivityFeedVideo apiActivityFeedVideo, Integer num, Integer num2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = apiActivityFeedVideo.width;
        }
        if ((i & 2) != 0) {
            num2 = apiActivityFeedVideo.height;
        }
        if ((i & 4) != 0) {
            str = apiActivityFeedVideo.url;
        }
        if ((i & 8) != 0) {
            str2 = apiActivityFeedVideo.name;
        }
        return apiActivityFeedVideo.copy(num, num2, str, str2);
    }

    @Nullable
    public final Integer component1() {
        return this.width;
    }

    @Nullable
    public final Integer component2() {
        return this.height;
    }

    @Nullable
    public final String component3() {
        return this.url;
    }

    @Nullable
    public final String component4() {
        return this.name;
    }

    @NotNull
    public final ApiActivityFeedVideo copy(@Nullable Integer num, @Nullable Integer num2, @Nullable String str, @Nullable String str2) {
        return new ApiActivityFeedVideo(num, num2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApiActivityFeedVideo) {
                ApiActivityFeedVideo apiActivityFeedVideo = (ApiActivityFeedVideo) obj;
                if (C2668g.a(this.width, apiActivityFeedVideo.width) && C2668g.a(this.height, apiActivityFeedVideo.height) && C2668g.a(this.url, apiActivityFeedVideo.url) && C2668g.a(this.name, apiActivityFeedVideo.name)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.width;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.height;
        hashCode = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str = this.url;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.name;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ApiActivityFeedVideo(width=");
        stringBuilder.append(this.width);
        stringBuilder.append(", height=");
        stringBuilder.append(this.height);
        stringBuilder.append(", url=");
        stringBuilder.append(this.url);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ApiActivityFeedVideo(@Nullable Integer num, @Nullable Integer num2, @Nullable String str, @Nullable String str2) {
        this.width = num;
        this.height = num2;
        this.url = str;
        this.name = str2;
    }

    @Nullable
    public final Integer getWidth() {
        return this.width;
    }

    @Nullable
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }
}
