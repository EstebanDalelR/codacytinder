package com.tinder.domain.common;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ae;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C19068g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001 B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006!"}, d2 = {"Lcom/tinder/domain/common/TrackingUrl;", "", "event", "Lcom/tinder/domain/common/TrackingUrl$Event;", "unique", "", "url", "", "pingTime", "Lorg/joda/time/DateTime;", "lineItemId", "(Lcom/tinder/domain/common/TrackingUrl$Event;ZLjava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;)V", "getEvent", "()Lcom/tinder/domain/common/TrackingUrl$Event;", "getLineItemId", "()Ljava/lang/String;", "getPingTime", "()Lorg/joda/time/DateTime;", "getUnique", "()Z", "getUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "Event", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class TrackingUrl {
    @NotNull
    private final Event event;
    @Nullable
    private final String lineItemId;
    @Nullable
    private final DateTime pingTime;
    private final boolean unique;
    @NotNull
    private final String url;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/tinder/domain/common/TrackingUrl$Event;", "", "key", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "IMPRESSION", "OPEN", "CLICK", "SWIPES", "Companion", "domain_release"}, k = 1, mv = {1, 1, 10})
    public enum Event {
        ;
        
        public static final Companion Companion = null;
        private static final Map<String, Event> map = null;
        @NotNull
        private final String key;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0005H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/domain/common/TrackingUrl$Event$Companion;", "", "()V", "map", "", "", "Lcom/tinder/domain/common/TrackingUrl$Event;", "fromKey", "key", "domain_release"}, k = 1, mv = {1, 1, 10})
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            @NotNull
            public final Event fromKey(@NotNull String str) {
                C2668g.b(str, "key");
                Object obj = Event.map.get(str);
                if (obj != null) {
                    return (Event) obj;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown key ");
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString().toString());
            }
        }

        @JvmStatic
        @NotNull
        public static final Event fromKey(@NotNull String str) {
            return Companion.fromKey(str);
        }

        protected Event(String str) {
            C2668g.b(str, "key");
            this.key = str;
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }

        static {
            Companion = new Companion();
            Event[] values = values();
            Map linkedHashMap = new LinkedHashMap(C19068g.c(ae.a(values.length), 16));
            int length = values.length;
            int i;
            while (i < length) {
                Event event = values[i];
                linkedHashMap.put(event.key, event);
                i++;
            }
            map = linkedHashMap;
        }
    }

    @NotNull
    public static /* synthetic */ TrackingUrl copy$default(TrackingUrl trackingUrl, Event event, boolean z, String str, DateTime dateTime, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            event = trackingUrl.event;
        }
        if ((i & 2) != 0) {
            z = trackingUrl.unique;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            str = trackingUrl.url;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            dateTime = trackingUrl.pingTime;
        }
        DateTime dateTime2 = dateTime;
        if ((i & 16) != 0) {
            str2 = trackingUrl.lineItemId;
        }
        return trackingUrl.copy(event, z2, str3, dateTime2, str2);
    }

    @NotNull
    public final Event component1() {
        return this.event;
    }

    public final boolean component2() {
        return this.unique;
    }

    @NotNull
    public final String component3() {
        return this.url;
    }

    @Nullable
    public final DateTime component4() {
        return this.pingTime;
    }

    @Nullable
    public final String component5() {
        return this.lineItemId;
    }

    @NotNull
    public final TrackingUrl copy(@NotNull Event event, boolean z, @NotNull String str, @Nullable DateTime dateTime, @Nullable String str2) {
        C2668g.b(event, "event");
        C2668g.b(str, "url");
        return new TrackingUrl(event, z, str, dateTime, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TrackingUrl) {
            TrackingUrl trackingUrl = (TrackingUrl) obj;
            if (C2668g.a(this.event, trackingUrl.event)) {
                return (this.unique == trackingUrl.unique ? 1 : null) != null && C2668g.a(this.url, trackingUrl.url) && C2668g.a(this.pingTime, trackingUrl.pingTime) && C2668g.a(this.lineItemId, trackingUrl.lineItemId);
            }
        }
    }

    public int hashCode() {
        Event event = this.event;
        int i = 0;
        int hashCode = (event != null ? event.hashCode() : 0) * 31;
        int i2 = this.unique;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        String str = this.url;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        DateTime dateTime = this.pingTime;
        hashCode = (hashCode + (dateTime != null ? dateTime.hashCode() : 0)) * 31;
        str = this.lineItemId;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TrackingUrl(event=");
        stringBuilder.append(this.event);
        stringBuilder.append(", unique=");
        stringBuilder.append(this.unique);
        stringBuilder.append(", url=");
        stringBuilder.append(this.url);
        stringBuilder.append(", pingTime=");
        stringBuilder.append(this.pingTime);
        stringBuilder.append(", lineItemId=");
        stringBuilder.append(this.lineItemId);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public TrackingUrl(@NotNull Event event, boolean z, @NotNull String str, @Nullable DateTime dateTime, @Nullable String str2) {
        C2668g.b(event, "event");
        C2668g.b(str, "url");
        this.event = event;
        this.unique = z;
        this.url = str;
        this.pingTime = dateTime;
        this.lineItemId = str2;
    }

    @NotNull
    public final Event getEvent() {
        return this.event;
    }

    public final boolean getUnique() {
        return this.unique;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public /* synthetic */ TrackingUrl(Event event, boolean z, String str, DateTime dateTime, String str2, int i, C15823e c15823e) {
        if ((i & 8) != null) {
            dateTime = null;
        }
        DateTime dateTime2 = dateTime;
        if ((i & 16) != null) {
            str2 = null;
        }
        this(event, z, str, dateTime2, str2);
    }

    @Nullable
    public final DateTime getPingTime() {
        return this.pingTime;
    }

    @Nullable
    public final String getLineItemId() {
        return this.lineItemId;
    }
}
