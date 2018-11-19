package com.tinder.analytics.p153b;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ae;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J)\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/analytics/leanplum/CrmEvent;", "", "eventName", "", "fieldValues", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getEventName", "()Ljava/lang/String;", "getFieldValues", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "analytics_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.analytics.b.a */
public final class C6211a {
    /* renamed from: a */
    public static final C6210a f22772a = new C6210a();
    @NotNull
    /* renamed from: b */
    private final String f22773b;
    @NotNull
    /* renamed from: c */
    private final Map<String, Object> f22774c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/tinder/analytics/leanplum/CrmEvent$Companion;", "", "()V", "EVENT_SUPERLIKEABLE_AVAILABLE", "", "EVENT_SUPERLIKEABLE_USED", "analytics_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.analytics.b.a$a */
    public static final class C6210a {
        private C6210a() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6211a) {
                C6211a c6211a = (C6211a) obj;
                if (C2668g.a(this.f22773b, c6211a.f22773b) && C2668g.a(this.f22774c, c6211a.f22774c)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f22773b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f22774c;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CrmEvent(eventName=");
        stringBuilder.append(this.f22773b);
        stringBuilder.append(", fieldValues=");
        stringBuilder.append(this.f22774c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C6211a(@NotNull String str, @NotNull Map<String, ? extends Object> map) {
        C2668g.b(str, "eventName");
        C2668g.b(map, "fieldValues");
        this.f22773b = str;
        this.f22774c = map;
    }

    public /* synthetic */ C6211a(String str, Map map, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            map = ae.a();
        }
        this(str, map);
    }

    @NotNull
    /* renamed from: a */
    public final String m26838a() {
        return this.f22773b;
    }

    @NotNull
    /* renamed from: b */
    public final Map<String, Object> m26839b() {
        return this.f22774c;
    }
}
