package com.tinder.api.response.v2;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/tinder/api/response/v2/ResponseMeta;", "", "status", "", "(I)V", "getStatus", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ResponseMeta {
    private final int status;

    @NotNull
    public static /* synthetic */ ResponseMeta copy$default(ResponseMeta responseMeta, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = responseMeta.status;
        }
        return responseMeta.copy(i);
    }

    public final int component1() {
        return this.status;
    }

    @NotNull
    public final ResponseMeta copy(int i) {
        return new ResponseMeta(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ResponseMeta) {
            if ((this.status == ((ResponseMeta) obj).status ? 1 : null) != null) {
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
        stringBuilder.append("ResponseMeta(status=");
        stringBuilder.append(this.status);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ResponseMeta(int i) {
        this.status = i;
    }

    public final int getStatus() {
        return this.status;
    }
}
