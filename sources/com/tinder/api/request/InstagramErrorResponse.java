package com.tinder.api.request;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/tinder/api/request/InstagramErrorResponse;", "", "statusCode", "", "errorMessage", "", "(ILjava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "getStatusCode", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class InstagramErrorResponse {
    @Nullable
    private final String errorMessage;
    private final int statusCode;

    @NotNull
    public static /* synthetic */ InstagramErrorResponse copy$default(InstagramErrorResponse instagramErrorResponse, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = instagramErrorResponse.statusCode;
        }
        if ((i2 & 2) != 0) {
            str = instagramErrorResponse.errorMessage;
        }
        return instagramErrorResponse.copy(i, str);
    }

    public final int component1() {
        return this.statusCode;
    }

    @Nullable
    public final String component2() {
        return this.errorMessage;
    }

    @NotNull
    public final InstagramErrorResponse copy(@Json(name = "status") int i, @Nullable @Json(name = "error") String str) {
        return new InstagramErrorResponse(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InstagramErrorResponse) {
            InstagramErrorResponse instagramErrorResponse = (InstagramErrorResponse) obj;
            return (this.statusCode == instagramErrorResponse.statusCode ? 1 : null) != null && C2668g.a(this.errorMessage, instagramErrorResponse.errorMessage);
        }
    }

    public int hashCode() {
        int i = this.statusCode * 31;
        String str = this.errorMessage;
        return i + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InstagramErrorResponse(statusCode=");
        stringBuilder.append(this.statusCode);
        stringBuilder.append(", errorMessage=");
        stringBuilder.append(this.errorMessage);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public InstagramErrorResponse(@Json(name = "status") int i, @Nullable @Json(name = "error") String str) {
        this.statusCode = i;
        this.errorMessage = str;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }
}
