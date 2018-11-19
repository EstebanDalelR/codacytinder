package com.tinder.api.model.superlikeable;

import com.tinder.api.response.v2.ResponseError;
import com.tinder.api.response.v2.ResponseMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/api/model/superlikeable/SuperLikeableGameResponse;", "", "()V", "Data", "Empty", "Lcom/tinder/api/model/superlikeable/SuperLikeableGameResponse$Data;", "Lcom/tinder/api/model/superlikeable/SuperLikeableGameResponse$Empty;", "api_release"}, k = 1, mv = {1, 1, 10})
public abstract class SuperLikeableGameResponse {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/tinder/api/model/superlikeable/SuperLikeableGameResponse$Data;", "Lcom/tinder/api/model/superlikeable/SuperLikeableGameResponse;", "meta", "Lcom/tinder/api/response/v2/ResponseMeta;", "data", "Lcom/tinder/api/model/superlikeable/SuperLikeableGameResponseData;", "error", "Lcom/tinder/api/response/v2/ResponseError;", "(Lcom/tinder/api/response/v2/ResponseMeta;Lcom/tinder/api/model/superlikeable/SuperLikeableGameResponseData;Lcom/tinder/api/response/v2/ResponseError;)V", "getData", "()Lcom/tinder/api/model/superlikeable/SuperLikeableGameResponseData;", "getError", "()Lcom/tinder/api/response/v2/ResponseError;", "getMeta", "()Lcom/tinder/api/response/v2/ResponseMeta;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
    public static final class Data extends SuperLikeableGameResponse {
        @Nullable
        private final SuperLikeableGameResponseData data;
        @Nullable
        private final ResponseError error;
        @Nullable
        private final ResponseMeta meta;

        @NotNull
        public static /* synthetic */ Data copy$default(Data data, ResponseMeta responseMeta, SuperLikeableGameResponseData superLikeableGameResponseData, ResponseError responseError, int i, Object obj) {
            if ((i & 1) != 0) {
                responseMeta = data.meta;
            }
            if ((i & 2) != 0) {
                superLikeableGameResponseData = data.data;
            }
            if ((i & 4) != 0) {
                responseError = data.error;
            }
            return data.copy(responseMeta, superLikeableGameResponseData, responseError);
        }

        @Nullable
        public final ResponseMeta component1() {
            return this.meta;
        }

        @Nullable
        public final SuperLikeableGameResponseData component2() {
            return this.data;
        }

        @Nullable
        public final ResponseError component3() {
            return this.error;
        }

        @NotNull
        public final Data copy(@Nullable ResponseMeta responseMeta, @Nullable SuperLikeableGameResponseData superLikeableGameResponseData, @Nullable ResponseError responseError) {
            return new Data(responseMeta, superLikeableGameResponseData, responseError);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Data) {
                    Data data = (Data) obj;
                    if (C2668g.a(this.meta, data.meta) && C2668g.a(this.data, data.data) && C2668g.a(this.error, data.error)) {
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
            SuperLikeableGameResponseData superLikeableGameResponseData = this.data;
            hashCode = (hashCode + (superLikeableGameResponseData != null ? superLikeableGameResponseData.hashCode() : 0)) * 31;
            ResponseError responseError = this.error;
            if (responseError != null) {
                i = responseError.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Data(meta=");
            stringBuilder.append(this.meta);
            stringBuilder.append(", data=");
            stringBuilder.append(this.data);
            stringBuilder.append(", error=");
            stringBuilder.append(this.error);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        @Nullable
        public final ResponseMeta getMeta() {
            return this.meta;
        }

        @Nullable
        public final SuperLikeableGameResponseData getData() {
            return this.data;
        }

        @Nullable
        public final ResponseError getError() {
            return this.error;
        }

        public Data(@Nullable ResponseMeta responseMeta, @Nullable SuperLikeableGameResponseData superLikeableGameResponseData, @Nullable ResponseError responseError) {
            super();
            this.meta = responseMeta;
            this.data = superLikeableGameResponseData;
            this.error = responseError;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/tinder/api/model/superlikeable/SuperLikeableGameResponse$Empty;", "Lcom/tinder/api/model/superlikeable/SuperLikeableGameResponse;", "meta", "Lcom/tinder/api/response/v2/ResponseMeta;", "error", "Lcom/tinder/api/response/v2/ResponseError;", "(Lcom/tinder/api/response/v2/ResponseMeta;Lcom/tinder/api/response/v2/ResponseError;)V", "getError", "()Lcom/tinder/api/response/v2/ResponseError;", "getMeta", "()Lcom/tinder/api/response/v2/ResponseMeta;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
    public static final class Empty extends SuperLikeableGameResponse {
        @Nullable
        private final ResponseError error;
        @Nullable
        private final ResponseMeta meta;

        @NotNull
        public static /* synthetic */ Empty copy$default(Empty empty, ResponseMeta responseMeta, ResponseError responseError, int i, Object obj) {
            if ((i & 1) != 0) {
                responseMeta = empty.meta;
            }
            if ((i & 2) != 0) {
                responseError = empty.error;
            }
            return empty.copy(responseMeta, responseError);
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
        public final Empty copy(@Nullable ResponseMeta responseMeta, @Nullable ResponseError responseError) {
            return new Empty(responseMeta, responseError);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Empty) {
                    Empty empty = (Empty) obj;
                    if (C2668g.a(this.meta, empty.meta) && C2668g.a(this.error, empty.error)) {
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
            stringBuilder.append("Empty(meta=");
            stringBuilder.append(this.meta);
            stringBuilder.append(", error=");
            stringBuilder.append(this.error);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        @Nullable
        public final ResponseMeta getMeta() {
            return this.meta;
        }

        @Nullable
        public final ResponseError getError() {
            return this.error;
        }

        public Empty(@Nullable ResponseMeta responseMeta, @Nullable ResponseError responseError) {
            super();
            this.meta = responseMeta;
            this.error = responseError;
        }
    }

    private SuperLikeableGameResponse() {
    }
}
