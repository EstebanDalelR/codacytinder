package com.tinder.domain.fastmatch.model;

import com.tinder.common.p076a.C2640a;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/tinder/domain/fastmatch/model/FastMatchCount;", "", "count", "", "isRange", "", "(IZ)V", "getCount", "()I", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class FastMatchCount {
    private final int count;
    private final boolean isRange;

    public FastMatchCount() {
        this(0, false, 3, null);
    }

    @NotNull
    public static /* synthetic */ FastMatchCount copy$default(FastMatchCount fastMatchCount, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fastMatchCount.count;
        }
        if ((i2 & 2) != 0) {
            z = fastMatchCount.isRange;
        }
        return fastMatchCount.copy(i, z);
    }

    public final int component1() {
        return this.count;
    }

    public final boolean component2() {
        return this.isRange;
    }

    @NotNull
    public final FastMatchCount copy(int i, boolean z) {
        return new FastMatchCount(i, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FastMatchCount) {
            FastMatchCount fastMatchCount = (FastMatchCount) obj;
            if ((this.count == fastMatchCount.count ? 1 : null) != null) {
                if ((this.isRange == fastMatchCount.isRange ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.count * 31;
        int i2 = this.isRange;
        if (i2 != 0) {
            i2 = 1;
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FastMatchCount(count=");
        stringBuilder.append(this.count);
        stringBuilder.append(", isRange=");
        stringBuilder.append(this.isRange);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public FastMatchCount(int i, boolean z) {
        this.count = i;
        this.isRange = z;
        C2640a.a(this.count >= 0 ? 1 : 0, "count must not be negative");
    }

    public final int getCount() {
        return this.count;
    }

    public /* synthetic */ FastMatchCount(int i, boolean z, int i2, C15823e c15823e) {
        if ((i2 & 1) != null) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        this(i, z);
    }

    public final boolean isRange() {
        return this.isRange;
    }
}
