package com.tinder.domain.feed;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/tinder/domain/feed/ActivityFeedVideo;", "", "width", "", "height", "url", "", "name", "(IILjava/lang/String;Ljava/lang/String;)V", "getHeight", "()I", "getName", "()Ljava/lang/String;", "getUrl", "getWidth", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ActivityFeedVideo {
    private final int height;
    @NotNull
    private final String name;
    @NotNull
    private final String url;
    private final int width;

    @NotNull
    public static /* synthetic */ ActivityFeedVideo copy$default(ActivityFeedVideo activityFeedVideo, int i, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = activityFeedVideo.width;
        }
        if ((i3 & 2) != 0) {
            i2 = activityFeedVideo.height;
        }
        if ((i3 & 4) != 0) {
            str = activityFeedVideo.url;
        }
        if ((i3 & 8) != 0) {
            str2 = activityFeedVideo.name;
        }
        return activityFeedVideo.copy(i, i2, str, str2);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    @NotNull
    public final String component3() {
        return this.url;
    }

    @NotNull
    public final String component4() {
        return this.name;
    }

    @NotNull
    public final ActivityFeedVideo copy(int i, int i2, @NotNull String str, @NotNull String str2) {
        C2668g.b(str, "url");
        C2668g.b(str2, "name");
        return new ActivityFeedVideo(i, i2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActivityFeedVideo) {
            ActivityFeedVideo activityFeedVideo = (ActivityFeedVideo) obj;
            if ((this.width == activityFeedVideo.width ? 1 : null) != null) {
                return (this.height == activityFeedVideo.height ? 1 : null) != null && C2668g.a(this.url, activityFeedVideo.url) && C2668g.a(this.name, activityFeedVideo.name);
            }
        }
    }

    public int hashCode() {
        int i = ((this.width * 31) + this.height) * 31;
        String str = this.url;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.name;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActivityFeedVideo(width=");
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

    public ActivityFeedVideo(int i, int i2, @NotNull String str, @NotNull String str2) {
        C2668g.b(str, "url");
        C2668g.b(str2, "name");
        this.width = i;
        this.height = i2;
        this.url = str;
        this.name = str2;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }
}
