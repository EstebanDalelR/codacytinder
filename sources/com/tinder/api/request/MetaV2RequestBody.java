package com.tinder.api.request;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\tJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/tinder/api/request/MetaV2RequestBody;", "", "lat", "", "lon", "forceFetch", "", "(DDLjava/lang/Boolean;)V", "getForceFetch", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLat", "()D", "getLon", "component1", "component2", "component3", "copy", "(DDLjava/lang/Boolean;)Lcom/tinder/api/request/MetaV2RequestBody;", "equals", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class MetaV2RequestBody {
    @Nullable
    private final Boolean forceFetch;
    private final double lat;
    private final double lon;

    @NotNull
    public static /* synthetic */ MetaV2RequestBody copy$default(MetaV2RequestBody metaV2RequestBody, double d, double d2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            d = metaV2RequestBody.lat;
        }
        double d3 = d;
        if ((i & 2) != 0) {
            d2 = metaV2RequestBody.lon;
        }
        double d4 = d2;
        if ((i & 4) != 0) {
            bool = metaV2RequestBody.forceFetch;
        }
        return metaV2RequestBody.copy(d3, d4, bool);
    }

    public final double component1() {
        return this.lat;
    }

    public final double component2() {
        return this.lon;
    }

    @Nullable
    public final Boolean component3() {
        return this.forceFetch;
    }

    @NotNull
    public final MetaV2RequestBody copy(double d, double d2, @Nullable @Json(name = "force_fetch_resources") Boolean bool) {
        return new MetaV2RequestBody(d, d2, bool);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MetaV2RequestBody) {
                MetaV2RequestBody metaV2RequestBody = (MetaV2RequestBody) obj;
                if (Double.compare(this.lat, metaV2RequestBody.lat) == 0 && Double.compare(this.lon, metaV2RequestBody.lon) == 0 && C2668g.a(this.forceFetch, metaV2RequestBody.forceFetch)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.lat);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.lon);
        i = (i + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31;
        Boolean bool = this.forceFetch;
        return i + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MetaV2RequestBody(lat=");
        stringBuilder.append(this.lat);
        stringBuilder.append(", lon=");
        stringBuilder.append(this.lon);
        stringBuilder.append(", forceFetch=");
        stringBuilder.append(this.forceFetch);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public MetaV2RequestBody(double d, double d2, @Nullable @Json(name = "force_fetch_resources") Boolean bool) {
        this.lat = d;
        this.lon = d2;
        this.forceFetch = bool;
    }

    public final double getLat() {
        return this.lat;
    }

    public final double getLon() {
        return this.lon;
    }

    public /* synthetic */ MetaV2RequestBody(double d, double d2, Boolean bool, int i, C15823e c15823e) {
        if ((i & 4) != 0) {
            bool = Boolean.valueOf(true);
        }
        this(d, d2, bool);
    }

    @Nullable
    public final Boolean getForceFetch() {
        return this.forceFetch;
    }
}
