package com.tinder.api.response;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.model.common.User;

/* renamed from: com.tinder.api.response.$AutoValue_UserResponse */
abstract class C$AutoValue_UserResponse extends UserResponse {
    private final User getUser;
    private final Integer status;

    C$AutoValue_UserResponse(@Nullable Integer num, User user) {
        this.status = num;
        if (user == null) {
            throw new NullPointerException("Null getUser");
        }
        this.getUser = user;
    }

    @Nullable
    public Integer status() {
        return this.status;
    }

    @Json(name = "results")
    public User getUser() {
        return this.getUser;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UserResponse{status=");
        stringBuilder.append(this.status);
        stringBuilder.append(", getUser=");
        stringBuilder.append(this.getUser);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r5 != r4) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof com.tinder.api.response.UserResponse;
        r2 = 0;
        if (r1 == 0) goto L_0x0031;
    L_0x0009:
        r5 = (com.tinder.api.response.UserResponse) r5;
        r1 = r4.status;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.status();
        if (r1 != 0) goto L_0x002f;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.status;
        r3 = r5.status();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x002f;
    L_0x0022:
        r1 = r4.getUser;
        r5 = r5.getUser();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x002f;
    L_0x002e:
        goto L_0x0030;
    L_0x002f:
        r0 = 0;
    L_0x0030:
        return r0;
    L_0x0031:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.response.$AutoValue_UserResponse.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return (((this.status == null ? 0 : this.status.hashCode()) ^ 1000003) * 1000003) ^ this.getUser.hashCode();
    }
}
