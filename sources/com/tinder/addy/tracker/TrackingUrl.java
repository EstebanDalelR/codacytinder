package com.tinder.addy.tracker;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u001aB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/tinder/addy/tracker/TrackingUrl;", "", "adId", "", "key", "url", "eventType", "Lcom/tinder/addy/tracker/TrackingUrl$EventType;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tinder/addy/tracker/TrackingUrl$EventType;)V", "getAdId", "()Ljava/lang/String;", "getEventType", "()Lcom/tinder/addy/tracker/TrackingUrl$EventType;", "getKey", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "EventType", "addy_release"}, k = 1, mv = {1, 1, 10})
public final class TrackingUrl {
    @NotNull
    /* renamed from: a */
    private final String f22766a;
    @NotNull
    /* renamed from: b */
    private final String f22767b;
    @NotNull
    /* renamed from: c */
    private final String f22768c;
    @NotNull
    /* renamed from: d */
    private final EventType f22769d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/tinder/addy/tracker/TrackingUrl$EventType;", "", "token", "", "addy_release"}, k = 1, mv = {1, 1, 10})
    public interface EventType {
        @NotNull
        String token();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TrackingUrl) {
                TrackingUrl trackingUrl = (TrackingUrl) obj;
                if (C2668g.a(this.f22766a, trackingUrl.f22766a) && C2668g.a(this.f22767b, trackingUrl.f22767b) && C2668g.a(this.f22768c, trackingUrl.f22768c) && C2668g.a(this.f22769d, trackingUrl.f22769d)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f22766a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f22767b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f22768c;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        EventType eventType = this.f22769d;
        if (eventType != null) {
            i = eventType.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TrackingUrl(adId=");
        stringBuilder.append(this.f22766a);
        stringBuilder.append(", key=");
        stringBuilder.append(this.f22767b);
        stringBuilder.append(", url=");
        stringBuilder.append(this.f22768c);
        stringBuilder.append(", eventType=");
        stringBuilder.append(this.f22769d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public TrackingUrl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull EventType eventType) {
        C2668g.b(str, "adId");
        C2668g.b(str2, "key");
        C2668g.b(str3, "url");
        C2668g.b(eventType, "eventType");
        this.f22766a = str;
        this.f22767b = str2;
        this.f22768c = str3;
        this.f22769d = eventType;
    }

    @NotNull
    /* renamed from: a */
    public final String m26830a() {
        return this.f22766a;
    }

    @NotNull
    /* renamed from: b */
    public final String m26831b() {
        return this.f22767b;
    }

    @NotNull
    /* renamed from: c */
    public final String m26832c() {
        return this.f22768c;
    }

    @NotNull
    /* renamed from: d */
    public final EventType m26833d() {
        return this.f22769d;
    }
}
