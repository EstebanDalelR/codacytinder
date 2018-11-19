package com.tinder.domain.common.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/tinder/domain/common/model/DeviceInfo;", "", "isShimmerCapable", "", "yearClass", "", "(ZI)V", "()Z", "getYearClass", "()I", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class DeviceInfo {
    private final boolean isShimmerCapable;
    private final int yearClass;

    @NotNull
    public static /* synthetic */ DeviceInfo copy$default(DeviceInfo deviceInfo, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = deviceInfo.isShimmerCapable;
        }
        if ((i2 & 2) != 0) {
            i = deviceInfo.yearClass;
        }
        return deviceInfo.copy(z, i);
    }

    public final boolean component1() {
        return this.isShimmerCapable;
    }

    public final int component2() {
        return this.yearClass;
    }

    @NotNull
    public final DeviceInfo copy(boolean z, int i) {
        return new DeviceInfo(z, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceInfo) {
            DeviceInfo deviceInfo = (DeviceInfo) obj;
            if ((this.isShimmerCapable == deviceInfo.isShimmerCapable ? 1 : null) != null) {
                if ((this.yearClass == deviceInfo.yearClass ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.isShimmerCapable;
        if (i != 0) {
            i = 1;
        }
        return (i * 31) + this.yearClass;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DeviceInfo(isShimmerCapable=");
        stringBuilder.append(this.isShimmerCapable);
        stringBuilder.append(", yearClass=");
        stringBuilder.append(this.yearClass);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public DeviceInfo(boolean z, int i) {
        this.isShimmerCapable = z;
        this.yearClass = i;
    }

    public final int getYearClass() {
        return this.yearClass;
    }

    public final boolean isShimmerCapable() {
        return this.isShimmerCapable;
    }
}
