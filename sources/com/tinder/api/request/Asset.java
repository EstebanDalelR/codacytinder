package com.tinder.api.request;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/tinder/api/request/Asset;", "", "id", "", "xDistancePercent", "", "xOffsetPercent", "yDistancePercent", "yOffsetPercent", "(Ljava/lang/String;DDDD)V", "getId", "()Ljava/lang/String;", "getXDistancePercent", "()D", "getXOffsetPercent", "getYDistancePercent", "getYOffsetPercent", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class Asset {
    @NotNull
    private final String id;
    private final double xDistancePercent;
    private final double xOffsetPercent;
    private final double yDistancePercent;
    private final double yOffsetPercent;

    @NotNull
    public static /* synthetic */ Asset copy$default(Asset asset, String str, double d, double d2, double d3, double d4, int i, Object obj) {
        Asset asset2 = asset;
        return asset2.copy((i & 1) != 0 ? asset2.id : str, (i & 2) != 0 ? asset2.xDistancePercent : d, (i & 4) != 0 ? asset2.xOffsetPercent : d2, (i & 8) != 0 ? asset2.yDistancePercent : d3, (i & 16) != 0 ? asset2.yOffsetPercent : d4);
    }

    @NotNull
    public final String component1() {
        return this.id;
    }

    public final double component2() {
        return this.xDistancePercent;
    }

    public final double component3() {
        return this.xOffsetPercent;
    }

    public final double component4() {
        return this.yDistancePercent;
    }

    public final double component5() {
        return this.yOffsetPercent;
    }

    @NotNull
    public final Asset copy(@NotNull @Json(name = "id") String str, @Json(name = "xdistance_percent") double d, @Json(name = "xoffset_percent") double d2, @Json(name = "ydistance_percent") double d3, @Json(name = "yoffset_percent") double d4) {
        String str2 = str;
        C2668g.b(str2, "id");
        return new Asset(str2, d, d2, d3, d4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Asset) {
                Asset asset = (Asset) obj;
                if (C2668g.a(this.id, asset.id) && Double.compare(this.xDistancePercent, asset.xDistancePercent) == 0 && Double.compare(this.xOffsetPercent, asset.xOffsetPercent) == 0 && Double.compare(this.yDistancePercent, asset.yDistancePercent) == 0 && Double.compare(this.yOffsetPercent, asset.yOffsetPercent) == 0) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.xDistancePercent);
        hashCode = (hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = Double.doubleToLongBits(this.xOffsetPercent);
        hashCode = (hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = Double.doubleToLongBits(this.yDistancePercent);
        hashCode = (hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = Double.doubleToLongBits(this.yOffsetPercent);
        return hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Asset(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", xDistancePercent=");
        stringBuilder.append(this.xDistancePercent);
        stringBuilder.append(", xOffsetPercent=");
        stringBuilder.append(this.xOffsetPercent);
        stringBuilder.append(", yDistancePercent=");
        stringBuilder.append(this.yDistancePercent);
        stringBuilder.append(", yOffsetPercent=");
        stringBuilder.append(this.yOffsetPercent);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public Asset(@NotNull @Json(name = "id") String str, @Json(name = "xdistance_percent") double d, @Json(name = "xoffset_percent") double d2, @Json(name = "ydistance_percent") double d3, @Json(name = "yoffset_percent") double d4) {
        C2668g.b(str, "id");
        this.id = str;
        this.xDistancePercent = d;
        this.xOffsetPercent = d2;
        this.yDistancePercent = d3;
        this.yOffsetPercent = d4;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final double getXDistancePercent() {
        return this.xDistancePercent;
    }

    public final double getXOffsetPercent() {
        return this.xOffsetPercent;
    }

    public final double getYDistancePercent() {
        return this.yDistancePercent;
    }

    public final double getYOffsetPercent() {
        return this.yOffsetPercent;
    }
}
