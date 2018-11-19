package com.tinder.api.response;

import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.recs.Rec;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/tinder/api/response/RecsResponse;", "", "meta", "Lcom/tinder/api/response/RecsResponse$Meta;", "data", "Lcom/tinder/api/response/RecsResponse$Data;", "error", "Lcom/tinder/api/response/RecsResponse$Error;", "(Lcom/tinder/api/response/RecsResponse$Meta;Lcom/tinder/api/response/RecsResponse$Data;Lcom/tinder/api/response/RecsResponse$Error;)V", "getData", "()Lcom/tinder/api/response/RecsResponse$Data;", "getError", "()Lcom/tinder/api/response/RecsResponse$Error;", "getMeta", "()Lcom/tinder/api/response/RecsResponse$Meta;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Data", "Error", "Meta", "api_release"}, k = 1, mv = {1, 1, 10})
public final class RecsResponse {
    @Nullable
    private final Data data;
    @Nullable
    private final Error error;
    @NotNull
    private final Meta meta;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJ,\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/tinder/api/response/RecsResponse$Data;", "", "results", "", "Lcom/tinder/api/model/recs/Rec;", "timeout", "", "(Ljava/util/List;Ljava/lang/Long;)V", "getResults", "()Ljava/util/List;", "getTimeout", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Long;)Lcom/tinder/api/response/RecsResponse$Data;", "equals", "", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
    public static final class Data {
        @Nullable
        private final List<Rec> results;
        @Nullable
        private final Long timeout;

        @NotNull
        public static /* synthetic */ Data copy$default(Data data, List list, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                list = data.results;
            }
            if ((i & 2) != 0) {
                l = data.timeout;
            }
            return data.copy(list, l);
        }

        @Nullable
        public final List<Rec> component1() {
            return this.results;
        }

        @Nullable
        public final Long component2() {
            return this.timeout;
        }

        @NotNull
        public final Data copy(@Nullable List<? extends Rec> list, @Nullable Long l) {
            return new Data(list, l);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Data) {
                    Data data = (Data) obj;
                    if (C2668g.a(this.results, data.results) && C2668g.a(this.timeout, data.timeout)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            List list = this.results;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            Long l = this.timeout;
            if (l != null) {
                i = l.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Data(results=");
            stringBuilder.append(this.results);
            stringBuilder.append(", timeout=");
            stringBuilder.append(this.timeout);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Data(@Nullable List<? extends Rec> list, @Nullable Long l) {
            this.results = list;
            this.timeout = l;
        }

        @Nullable
        public final List<Rec> getResults() {
            return this.results;
        }

        @Nullable
        public final Long getTimeout() {
            return this.timeout;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/tinder/api/response/RecsResponse$Error;", "", "message", "", "code", "", "(Ljava/lang/String;I)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
    public static final class Error {
        private final int code;
        @Nullable
        private final String message;

        @NotNull
        public static /* synthetic */ Error copy$default(Error error, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = error.message;
            }
            if ((i2 & 2) != 0) {
                i = error.code;
            }
            return error.copy(str, i);
        }

        @Nullable
        public final String component1() {
            return this.message;
        }

        public final int component2() {
            return this.code;
        }

        @NotNull
        public final Error copy(@Nullable String str, int i) {
            return new Error(str, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Error) {
                Error error = (Error) obj;
                if (C2668g.a(this.message, error.message)) {
                    if ((this.code == error.code ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            String str = this.message;
            return ((str != null ? str.hashCode() : 0) * 31) + this.code;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error(message=");
            stringBuilder.append(this.message);
            stringBuilder.append(", code=");
            stringBuilder.append(this.code);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Error(@Nullable String str, int i) {
            this.message = str;
            this.code = i;
        }

        public final int getCode() {
            return this.code;
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/tinder/api/response/RecsResponse$Meta;", "", "status", "", "(I)V", "getStatus", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
    public static final class Meta {
        private final int status;

        @NotNull
        public static /* synthetic */ Meta copy$default(Meta meta, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = meta.status;
            }
            return meta.copy(i);
        }

        public final int component1() {
            return this.status;
        }

        @NotNull
        public final Meta copy(int i) {
            return new Meta(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Meta) {
                if ((this.status == ((Meta) obj).status ? 1 : null) != null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.status;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Meta(status=");
            stringBuilder.append(this.status);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Meta(int i) {
            this.status = i;
        }

        public final int getStatus() {
            return this.status;
        }
    }

    @NotNull
    public static /* synthetic */ RecsResponse copy$default(RecsResponse recsResponse, Meta meta, Data data, Error error, int i, Object obj) {
        if ((i & 1) != 0) {
            meta = recsResponse.meta;
        }
        if ((i & 2) != 0) {
            data = recsResponse.data;
        }
        if ((i & 4) != 0) {
            error = recsResponse.error;
        }
        return recsResponse.copy(meta, data, error);
    }

    @NotNull
    public final Meta component1() {
        return this.meta;
    }

    @Nullable
    public final Data component2() {
        return this.data;
    }

    @Nullable
    public final Error component3() {
        return this.error;
    }

    @NotNull
    public final RecsResponse copy(@NotNull Meta meta, @Nullable Data data, @Nullable Error error) {
        C2668g.b(meta, ManagerWebServices.PARAM_META);
        return new RecsResponse(meta, data, error);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RecsResponse) {
                RecsResponse recsResponse = (RecsResponse) obj;
                if (C2668g.a(this.meta, recsResponse.meta) && C2668g.a(this.data, recsResponse.data) && C2668g.a(this.error, recsResponse.error)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Meta meta = this.meta;
        int i = 0;
        int hashCode = (meta != null ? meta.hashCode() : 0) * 31;
        Data data = this.data;
        hashCode = (hashCode + (data != null ? data.hashCode() : 0)) * 31;
        Error error = this.error;
        if (error != null) {
            i = error.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RecsResponse(meta=");
        stringBuilder.append(this.meta);
        stringBuilder.append(", data=");
        stringBuilder.append(this.data);
        stringBuilder.append(", error=");
        stringBuilder.append(this.error);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public RecsResponse(@NotNull Meta meta, @Nullable Data data, @Nullable Error error) {
        C2668g.b(meta, ManagerWebServices.PARAM_META);
        this.meta = meta;
        this.data = data;
        this.error = error;
    }

    @Nullable
    public final Data getData() {
        return this.data;
    }

    @Nullable
    public final Error getError() {
        return this.error;
    }

    @NotNull
    public final Meta getMeta() {
        return this.meta;
    }
}
