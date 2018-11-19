package com.tinder.domain.fastmatch.model;

import com.tinder.common.p076a.C2640a;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/tinder/domain/fastmatch/model/FastMatchNewCount;", "", "count", "", "newCountToken", "", "(ILjava/lang/String;)V", "getCount", "()I", "getNewCountToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class FastMatchNewCount {
    private final int count;
    @NotNull
    private final String newCountToken;

    @NotNull
    public static /* synthetic */ FastMatchNewCount copy$default(FastMatchNewCount fastMatchNewCount, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fastMatchNewCount.count;
        }
        if ((i2 & 2) != 0) {
            str = fastMatchNewCount.newCountToken;
        }
        return fastMatchNewCount.copy(i, str);
    }

    public final int component1() {
        return this.count;
    }

    @NotNull
    public final String component2() {
        return this.newCountToken;
    }

    @NotNull
    public final FastMatchNewCount copy(int i, @NotNull String str) {
        C2668g.b(str, "newCountToken");
        return new FastMatchNewCount(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FastMatchNewCount) {
            FastMatchNewCount fastMatchNewCount = (FastMatchNewCount) obj;
            return (this.count == fastMatchNewCount.count ? 1 : null) != null && C2668g.a(this.newCountToken, fastMatchNewCount.newCountToken);
        }
    }

    public int hashCode() {
        int i = this.count * 31;
        String str = this.newCountToken;
        return i + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FastMatchNewCount(count=");
        stringBuilder.append(this.count);
        stringBuilder.append(", newCountToken=");
        stringBuilder.append(this.newCountToken);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public FastMatchNewCount(int i, @NotNull String str) {
        C2668g.b(str, "newCountToken");
        this.count = i;
        this.newCountToken = str;
        C2640a.a(this.count >= 0 ? 1 : 0, "count must not be negative");
    }

    public /* synthetic */ FastMatchNewCount(int i, String str, int i2, C15823e c15823e) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        this(i, str);
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final String getNewCountToken() {
        return this.newCountToken;
    }
}
