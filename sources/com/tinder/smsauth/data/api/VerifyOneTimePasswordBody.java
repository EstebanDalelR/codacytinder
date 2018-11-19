package com.tinder.smsauth.data.api;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/smsauth/data/api/VerifyOneTimePasswordBody;", "", "phoneNumber", "", "code", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getPhoneNumber", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "data"}, k = 1, mv = {1, 1, 10})
public final class VerifyOneTimePasswordBody {
    @NotNull
    private final String code;
    @NotNull
    private final String phoneNumber;

    @NotNull
    public static /* synthetic */ VerifyOneTimePasswordBody copy$default(VerifyOneTimePasswordBody verifyOneTimePasswordBody, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verifyOneTimePasswordBody.phoneNumber;
        }
        if ((i & 2) != 0) {
            str2 = verifyOneTimePasswordBody.code;
        }
        return verifyOneTimePasswordBody.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.phoneNumber;
    }

    @NotNull
    public final String component2() {
        return this.code;
    }

    @NotNull
    public final VerifyOneTimePasswordBody copy(@NotNull @Json(name = "phone_number") String str, @NotNull @Json(name = "otp_code") String str2) {
        C2668g.b(str, "phoneNumber");
        C2668g.b(str2, "code");
        return new VerifyOneTimePasswordBody(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VerifyOneTimePasswordBody) {
                VerifyOneTimePasswordBody verifyOneTimePasswordBody = (VerifyOneTimePasswordBody) obj;
                if (C2668g.a(this.phoneNumber, verifyOneTimePasswordBody.phoneNumber) && C2668g.a(this.code, verifyOneTimePasswordBody.code)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.phoneNumber;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.code;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("VerifyOneTimePasswordBody(phoneNumber=");
        stringBuilder.append(this.phoneNumber);
        stringBuilder.append(", code=");
        stringBuilder.append(this.code);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public VerifyOneTimePasswordBody(@NotNull @Json(name = "phone_number") String str, @NotNull @Json(name = "otp_code") String str2) {
        C2668g.b(str, "phoneNumber");
        C2668g.b(str2, "code");
        this.phoneNumber = str;
        this.code = str2;
    }

    @NotNull
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }
}
