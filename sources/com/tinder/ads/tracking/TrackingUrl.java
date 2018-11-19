package com.tinder.ads.tracking;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/ads/tracking/TrackingUrl;", "", "url", "", "key", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "tracking_release"}, k = 1, mv = {1, 1, 7})
public final class TrackingUrl {
    @NotNull
    private final String key;
    @NotNull
    private final String url;

    @NotNull
    public static /* synthetic */ TrackingUrl copy$default(TrackingUrl trackingUrl, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trackingUrl.url;
        }
        if ((i & 2) != 0) {
            str2 = trackingUrl.key;
        }
        return trackingUrl.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.url;
    }

    @NotNull
    public final String component2() {
        return this.key;
    }

    @NotNull
    public final TrackingUrl copy(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "url");
        C2668g.b(str2, "key");
        return new TrackingUrl(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TrackingUrl) {
                TrackingUrl trackingUrl = (TrackingUrl) obj;
                if (C2668g.a(this.url, trackingUrl.url) && C2668g.a(this.key, trackingUrl.key)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.url;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.key;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TrackingUrl(url=");
        stringBuilder.append(this.url);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public TrackingUrl(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "url");
        C2668g.b(str2, "key");
        this.url = str;
        this.key = str2;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }
}
