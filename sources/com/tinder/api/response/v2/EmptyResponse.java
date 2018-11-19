package com.tinder.api.response.v2;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/tinder/api/response/v2/EmptyResponse;", "", "meta", "Lcom/tinder/api/response/v2/ResponseMeta;", "error", "Lcom/tinder/api/response/v2/ResponseError;", "(Lcom/tinder/api/response/v2/ResponseMeta;Lcom/tinder/api/response/v2/ResponseError;)V", "getError", "()Lcom/tinder/api/response/v2/ResponseError;", "getMeta", "()Lcom/tinder/api/response/v2/ResponseMeta;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "api_release"}, k = 1, mv = {1, 1, 10})
public final class EmptyResponse {
    public static final Companion Companion = new Companion();
    @Nullable
    private final ResponseError error;
    @Nullable
    private final ResponseMeta meta;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/tinder/api/response/v2/EmptyResponse$Companion;", "", "()V", "from", "Lcom/tinder/api/response/v2/EmptyResponse;", "code", "", "api_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final EmptyResponse from(int i) {
            return new EmptyResponse(new ResponseMeta(i), 0);
        }
    }

    @NotNull
    public static /* synthetic */ EmptyResponse copy$default(EmptyResponse emptyResponse, ResponseMeta responseMeta, ResponseError responseError, int i, Object obj) {
        if ((i & 1) != 0) {
            responseMeta = emptyResponse.meta;
        }
        if ((i & 2) != 0) {
            responseError = emptyResponse.error;
        }
        return emptyResponse.copy(responseMeta, responseError);
    }

    @JvmStatic
    @NotNull
    public static final EmptyResponse from(int i) {
        return Companion.from(i);
    }

    @Nullable
    public final ResponseMeta component1() {
        return this.meta;
    }

    @Nullable
    public final ResponseError component2() {
        return this.error;
    }

    @NotNull
    public final EmptyResponse copy(@Nullable ResponseMeta responseMeta, @Nullable ResponseError responseError) {
        return new EmptyResponse(responseMeta, responseError);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmptyResponse) {
                EmptyResponse emptyResponse = (EmptyResponse) obj;
                if (C2668g.a(this.meta, emptyResponse.meta) && C2668g.a(this.error, emptyResponse.error)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        ResponseMeta responseMeta = this.meta;
        int i = 0;
        int hashCode = (responseMeta != null ? responseMeta.hashCode() : 0) * 31;
        ResponseError responseError = this.error;
        if (responseError != null) {
            i = responseError.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EmptyResponse(meta=");
        stringBuilder.append(this.meta);
        stringBuilder.append(", error=");
        stringBuilder.append(this.error);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public EmptyResponse(@Nullable ResponseMeta responseMeta, @Nullable ResponseError responseError) {
        this.meta = responseMeta;
        this.error = responseError;
    }

    @Nullable
    public final ResponseError getError() {
        return this.error;
    }

    @Nullable
    public final ResponseMeta getMeta() {
        return this.meta;
    }
}
