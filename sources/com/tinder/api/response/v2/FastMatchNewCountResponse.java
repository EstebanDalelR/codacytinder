package com.tinder.api.response.v2;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/tinder/api/response/v2/FastMatchNewCountResponse;", "", "count", "", "newCountToken", "", "(ILjava/lang/String;)V", "getCount", "()I", "getNewCountToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class FastMatchNewCountResponse {
    private final int count;
    @NotNull
    private final String newCountToken;

    @NotNull
    public static /* synthetic */ FastMatchNewCountResponse copy$default(FastMatchNewCountResponse fastMatchNewCountResponse, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fastMatchNewCountResponse.count;
        }
        if ((i2 & 2) != 0) {
            str = fastMatchNewCountResponse.newCountToken;
        }
        return fastMatchNewCountResponse.copy(i, str);
    }

    public final int component1() {
        return this.count;
    }

    @NotNull
    public final String component2() {
        return this.newCountToken;
    }

    @NotNull
    public final FastMatchNewCountResponse copy(int i, @NotNull @Json(name = "new_count_token") String str) {
        C2668g.b(str, "newCountToken");
        return new FastMatchNewCountResponse(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FastMatchNewCountResponse) {
            FastMatchNewCountResponse fastMatchNewCountResponse = (FastMatchNewCountResponse) obj;
            return (this.count == fastMatchNewCountResponse.count ? 1 : null) != null && C2668g.a(this.newCountToken, fastMatchNewCountResponse.newCountToken);
        }
    }

    public int hashCode() {
        int i = this.count * 31;
        String str = this.newCountToken;
        return i + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FastMatchNewCountResponse(count=");
        stringBuilder.append(this.count);
        stringBuilder.append(", newCountToken=");
        stringBuilder.append(this.newCountToken);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public FastMatchNewCountResponse(int i, @NotNull @Json(name = "new_count_token") String str) {
        C2668g.b(str, "newCountToken");
        this.count = i;
        this.newCountToken = str;
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final String getNewCountToken() {
        return this.newCountToken;
    }
}
