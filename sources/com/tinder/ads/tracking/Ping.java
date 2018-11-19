package com.tinder.ads.tracking;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/tinder/ads/tracking/Ping;", "", "url", "", "timestamp", "", "(Ljava/lang/String;Ljava/lang/Long;)V", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Long;)Lcom/tinder/ads/tracking/Ping;", "equals", "", "other", "hashCode", "", "toString", "tracking_release"}, k = 1, mv = {1, 1, 7})
public final class Ping {
    @Nullable
    private final Long timestamp;
    @NotNull
    private final String url;

    @NotNull
    public static /* synthetic */ Ping copy$default(Ping ping, String str, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ping.url;
        }
        if ((i & 2) != 0) {
            l = ping.timestamp;
        }
        return ping.copy(str, l);
    }

    @NotNull
    public final String component1() {
        return this.url;
    }

    @Nullable
    public final Long component2() {
        return this.timestamp;
    }

    @NotNull
    public final Ping copy(@NotNull String str, @Nullable Long l) {
        C2668g.b(str, "url");
        return new Ping(str, l);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Ping) {
                Ping ping = (Ping) obj;
                if (C2668g.a(this.url, ping.url) && C2668g.a(this.timestamp, ping.timestamp)) {
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
        Long l = this.timestamp;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ping(url=");
        stringBuilder.append(this.url);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public Ping(@NotNull String str, @Nullable Long l) {
        C2668g.b(str, "url");
        this.url = str;
        this.timestamp = l;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }
}
