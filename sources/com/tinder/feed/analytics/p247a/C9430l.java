package com.tinder.feed.analytics.p247a;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/tinder/feed/analytics/factory/MediaState;", "", "mediaId", "", "mediaPosition", "", "(Ljava/lang/String;I)V", "getMediaId", "()Ljava/lang/String;", "getMediaPosition", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.analytics.a.l */
public final class C9430l {
    @NotNull
    /* renamed from: a */
    private final String f31597a;
    /* renamed from: b */
    private final int f31598b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9430l) {
            C9430l c9430l = (C9430l) obj;
            if (C2668g.a(this.f31597a, c9430l.f31597a)) {
                if ((this.f31598b == c9430l.f31598b ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f31597a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f31598b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MediaState(mediaId=");
        stringBuilder.append(this.f31597a);
        stringBuilder.append(", mediaPosition=");
        stringBuilder.append(this.f31598b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9430l(@NotNull String str, int i) {
        C2668g.b(str, "mediaId");
        this.f31597a = str;
        this.f31598b = i;
    }

    @NotNull
    /* renamed from: a */
    public final String m39430a() {
        return this.f31597a;
    }

    /* renamed from: b */
    public final int m39431b() {
        return this.f31598b;
    }
}
