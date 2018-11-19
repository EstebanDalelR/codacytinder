package com.tinder.common.tracker.recyclerview.p199b;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/common/tracker/recyclerview/model/ListItemDurationUpdate;", "", "itemId", "", "totalVisibleDuration", "", "(Ljava/lang/String;J)V", "getItemId", "()Ljava/lang/String;", "getTotalVisibleDuration", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.common.tracker.recyclerview.b.c */
public final class C8566c {
    @NotNull
    /* renamed from: a */
    private final String f30317a;
    /* renamed from: b */
    private final long f30318b;

    @NotNull
    /* renamed from: a */
    public final String m36567a() {
        return this.f30317a;
    }

    /* renamed from: b */
    public final long m36568b() {
        return this.f30318b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8566c) {
            C8566c c8566c = (C8566c) obj;
            if (C2668g.a(this.f30317a, c8566c.f30317a)) {
                if ((this.f30318b == c8566c.f30318b ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f30317a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        long j = this.f30318b;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ListItemDurationUpdate(itemId=");
        stringBuilder.append(this.f30317a);
        stringBuilder.append(", totalVisibleDuration=");
        stringBuilder.append(this.f30318b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C8566c(@NotNull String str, long j) {
        C2668g.b(str, "itemId");
        this.f30317a = str;
        this.f30318b = j;
    }
}
