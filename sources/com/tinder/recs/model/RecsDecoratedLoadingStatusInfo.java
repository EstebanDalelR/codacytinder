package com.tinder.recs.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/recs/model/RecsDecoratedLoadingStatusInfo;", "", "isAgeAndDistanceWithinLimit", "", "isMaleSeekingFemale", "(ZZ)V", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecsDecoratedLoadingStatusInfo {
    private final boolean isAgeAndDistanceWithinLimit;
    private final boolean isMaleSeekingFemale;

    @NotNull
    public static /* synthetic */ RecsDecoratedLoadingStatusInfo copy$default(RecsDecoratedLoadingStatusInfo recsDecoratedLoadingStatusInfo, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = recsDecoratedLoadingStatusInfo.isAgeAndDistanceWithinLimit;
        }
        if ((i & 2) != 0) {
            z2 = recsDecoratedLoadingStatusInfo.isMaleSeekingFemale;
        }
        return recsDecoratedLoadingStatusInfo.copy(z, z2);
    }

    public final boolean component1() {
        return this.isAgeAndDistanceWithinLimit;
    }

    public final boolean component2() {
        return this.isMaleSeekingFemale;
    }

    @NotNull
    public final RecsDecoratedLoadingStatusInfo copy(boolean z, boolean z2) {
        return new RecsDecoratedLoadingStatusInfo(z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RecsDecoratedLoadingStatusInfo) {
            RecsDecoratedLoadingStatusInfo recsDecoratedLoadingStatusInfo = (RecsDecoratedLoadingStatusInfo) obj;
            if ((this.isAgeAndDistanceWithinLimit == recsDecoratedLoadingStatusInfo.isAgeAndDistanceWithinLimit ? 1 : null) != null) {
                if ((this.isMaleSeekingFemale == recsDecoratedLoadingStatusInfo.isMaleSeekingFemale ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.isAgeAndDistanceWithinLimit;
        int i2 = 1;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        boolean z = this.isMaleSeekingFemale;
        if (!z) {
            i2 = z;
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RecsDecoratedLoadingStatusInfo(isAgeAndDistanceWithinLimit=");
        stringBuilder.append(this.isAgeAndDistanceWithinLimit);
        stringBuilder.append(", isMaleSeekingFemale=");
        stringBuilder.append(this.isMaleSeekingFemale);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public RecsDecoratedLoadingStatusInfo(boolean z, boolean z2) {
        this.isAgeAndDistanceWithinLimit = z;
        this.isMaleSeekingFemale = z2;
    }

    public final boolean isAgeAndDistanceWithinLimit() {
        return this.isAgeAndDistanceWithinLimit;
    }

    public final boolean isMaleSeekingFemale() {
        return this.isMaleSeekingFemale;
    }
}
