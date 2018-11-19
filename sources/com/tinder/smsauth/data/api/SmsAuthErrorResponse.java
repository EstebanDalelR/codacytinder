package com.tinder.smsauth.data.api;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/smsauth/data/api/SmsAuthErrorResponse;", "", "error", "Lcom/tinder/smsauth/data/api/SmsAuthErrorResponse$Error;", "(Lcom/tinder/smsauth/data/api/SmsAuthErrorResponse$Error;)V", "getError", "()Lcom/tinder/smsauth/data/api/SmsAuthErrorResponse$Error;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Error", "data"}, k = 1, mv = {1, 1, 10})
public final class SmsAuthErrorResponse {
    @Nullable
    private final Error error;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/tinder/smsauth/data/api/SmsAuthErrorResponse$Error;", "", "code", "", "message", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/tinder/smsauth/data/api/SmsAuthErrorResponse$Error;", "equals", "", "other", "hashCode", "toString", "data"}, k = 1, mv = {1, 1, 10})
    public static final class Error {
        @Nullable
        private final Integer code;
        @Nullable
        private final String message;

        @NotNull
        public static /* synthetic */ Error copy$default(Error error, Integer num, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                num = error.code;
            }
            if ((i & 2) != 0) {
                str = error.message;
            }
            return error.copy(num, str);
        }

        @Nullable
        public final Integer component1() {
            return this.code;
        }

        @Nullable
        public final String component2() {
            return this.message;
        }

        @NotNull
        public final Error copy(@Nullable @Json(name = "code") Integer num, @Nullable @Json(name = "message") String str) {
            return new Error(num, str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Error) {
                    Error error = (Error) obj;
                    if (C2668g.a(this.code, error.code) && C2668g.a(this.message, error.message)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Integer num = this.code;
            int i = 0;
            int hashCode = (num != null ? num.hashCode() : 0) * 31;
            String str = this.message;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error(code=");
            stringBuilder.append(this.code);
            stringBuilder.append(", message=");
            stringBuilder.append(this.message);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Error(@Nullable @Json(name = "code") Integer num, @Nullable @Json(name = "message") String str) {
            this.code = num;
            this.message = str;
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

    @NotNull
    public static /* synthetic */ SmsAuthErrorResponse copy$default(SmsAuthErrorResponse smsAuthErrorResponse, Error error, int i, Object obj) {
        if ((i & 1) != 0) {
            error = smsAuthErrorResponse.error;
        }
        return smsAuthErrorResponse.copy(error);
    }

    @Nullable
    public final Error component1() {
        return this.error;
    }

    @NotNull
    public final SmsAuthErrorResponse copy(@Nullable @Json(name = "error") Error error) {
        return new SmsAuthErrorResponse(error);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SmsAuthErrorResponse) {
                if (C2668g.a(this.error, ((SmsAuthErrorResponse) obj).error)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Error error = this.error;
        return error != null ? error.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SmsAuthErrorResponse(error=");
        stringBuilder.append(this.error);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public SmsAuthErrorResponse(@Nullable @Json(name = "error") Error error) {
        this.error = error;
    }

    @Nullable
    public final Error getError() {
        return this.error;
    }
}
