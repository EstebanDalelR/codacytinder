package com.tinder.smsauth.data.api;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0002"}, d2 = {"Lcom/tinder/smsauth/data/api/RequestOneTimePasswordResponse;", "", "data", "Lcom/tinder/smsauth/data/api/RequestOneTimePasswordResponse$Data;", "(Lcom/tinder/smsauth/data/api/RequestOneTimePasswordResponse$Data;)V", "getData", "()Lcom/tinder/smsauth/data/api/RequestOneTimePasswordResponse$Data;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Data"}, k = 1, mv = {1, 1, 10})
public final class RequestOneTimePasswordResponse {
    @Nullable
    private final Data data;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/smsauth/data/api/RequestOneTimePasswordResponse$Data;", "", "length", "", "(Ljava/lang/Integer;)V", "getLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/tinder/smsauth/data/api/RequestOneTimePasswordResponse$Data;", "equals", "", "other", "hashCode", "toString", "", "data"}, k = 1, mv = {1, 1, 10})
    public static final class Data {
        @Nullable
        private final Integer length;

        @NotNull
        public static /* synthetic */ Data copy$default(Data data, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                num = data.length;
            }
            return data.copy(num);
        }

        @Nullable
        public final Integer component1() {
            return this.length;
        }

        @NotNull
        public final Data copy(@Nullable @Json(name = "otp_length") Integer num) {
            return new Data(num);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Data) {
                    if (C2668g.a(this.length, ((Data) obj).length)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Integer num = this.length;
            return num != null ? num.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Data(length=");
            stringBuilder.append(this.length);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Data(@Nullable @Json(name = "otp_length") Integer num) {
            this.length = num;
        }

        @Nullable
        public final Integer getLength() {
            return this.length;
        }
    }

    @NotNull
    public static /* synthetic */ RequestOneTimePasswordResponse copy$default(RequestOneTimePasswordResponse requestOneTimePasswordResponse, Data data, int i, Object obj) {
        if ((i & 1) != 0) {
            data = requestOneTimePasswordResponse.data;
        }
        return requestOneTimePasswordResponse.copy(data);
    }

    @Nullable
    public final Data component1() {
        return this.data;
    }

    @NotNull
    public final RequestOneTimePasswordResponse copy(@Nullable @Json(name = "data") Data data) {
        return new RequestOneTimePasswordResponse(data);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RequestOneTimePasswordResponse) {
                if (C2668g.a(this.data, ((RequestOneTimePasswordResponse) obj).data)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Data data = this.data;
        return data != null ? data.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RequestOneTimePasswordResponse(data=");
        stringBuilder.append(this.data);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public RequestOneTimePasswordResponse(@Nullable @Json(name = "data") Data data) {
        this.data = data;
    }

    @Nullable
    public final Data getData() {
        return this.data;
    }
}
