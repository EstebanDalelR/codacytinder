package com.tinder.feed.analytics.p247a;

import com.tinder.feed.analytics.ActivityCaptionType;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/feed/analytics/factory/ActivityCaption;", "", "captionType", "Lcom/tinder/feed/analytics/ActivityCaptionType;", "caption", "", "(Lcom/tinder/feed/analytics/ActivityCaptionType;Ljava/lang/String;)V", "getCaption", "()Ljava/lang/String;", "getCaptionType", "()Lcom/tinder/feed/analytics/ActivityCaptionType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.analytics.a.a */
public final class C9422a {
    @NotNull
    /* renamed from: a */
    private final ActivityCaptionType f31571a;
    @NotNull
    /* renamed from: b */
    private final String f31572b;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9422a) {
                C9422a c9422a = (C9422a) obj;
                if (C2668g.a(this.f31571a, c9422a.f31571a) && C2668g.a(this.f31572b, c9422a.f31572b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        ActivityCaptionType activityCaptionType = this.f31571a;
        int i = 0;
        int hashCode = (activityCaptionType != null ? activityCaptionType.hashCode() : 0) * 31;
        String str = this.f31572b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActivityCaption(captionType=");
        stringBuilder.append(this.f31571a);
        stringBuilder.append(", caption=");
        stringBuilder.append(this.f31572b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9422a(@NotNull ActivityCaptionType activityCaptionType, @NotNull String str) {
        C2668g.b(activityCaptionType, "captionType");
        C2668g.b(str, "caption");
        this.f31571a = activityCaptionType;
        this.f31572b = str;
    }

    @NotNull
    /* renamed from: a */
    public final ActivityCaptionType m39392a() {
        return this.f31571a;
    }

    @NotNull
    /* renamed from: b */
    public final String m39393b() {
        return this.f31572b;
    }
}
