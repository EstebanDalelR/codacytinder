package com.tinder.api.response.v2;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/tinder/api/response/v2/ResponseError;", "", "message", "", "code", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/tinder/api/response/v2/ResponseError;", "equals", "", "other", "hashCode", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ResponseError {
    @Nullable
    private final Integer code;
    @Nullable
    private final String message;

    @NotNull
    public static /* synthetic */ ResponseError copy$default(ResponseError responseError, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = responseError.message;
        }
        if ((i & 2) != 0) {
            num = responseError.code;
        }
        return responseError.copy(str, num);
    }

    @Nullable
    public final String component1() {
        return this.message;
    }

    @Nullable
    public final Integer component2() {
        return this.code;
    }

    @NotNull
    public final ResponseError copy(@Nullable String str, @Nullable Integer num) {
        return new ResponseError(str, num);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ResponseError) {
                ResponseError responseError = (ResponseError) obj;
                if (C2668g.a(this.message, responseError.message) && C2668g.a(this.code, responseError.code)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.message;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.code;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ResponseError(message=");
        stringBuilder.append(this.message);
        stringBuilder.append(", code=");
        stringBuilder.append(this.code);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ResponseError(@Nullable String str, @Nullable Integer num) {
        this.message = str;
        this.code = num;
    }

    @Nullable
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }
}
