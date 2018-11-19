package com.tinder.api.request;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/tinder/api/request/InstagramAuthRequestBody;", "", "authorizationCode", "", "(Ljava/lang/String;)V", "getAuthorizationCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class InstagramAuthRequestBody {
    @NotNull
    private final String authorizationCode;

    @NotNull
    public static /* synthetic */ InstagramAuthRequestBody copy$default(InstagramAuthRequestBody instagramAuthRequestBody, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = instagramAuthRequestBody.authorizationCode;
        }
        return instagramAuthRequestBody.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.authorizationCode;
    }

    @NotNull
    public final InstagramAuthRequestBody copy(@NotNull @Json(name = "code") String str) {
        C2668g.b(str, "authorizationCode");
        return new InstagramAuthRequestBody(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InstagramAuthRequestBody) {
                if (C2668g.a(this.authorizationCode, ((InstagramAuthRequestBody) obj).authorizationCode)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.authorizationCode;
        return str != null ? str.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InstagramAuthRequestBody(authorizationCode=");
        stringBuilder.append(this.authorizationCode);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public InstagramAuthRequestBody(@NotNull @Json(name = "code") String str) {
        C2668g.b(str, "authorizationCode");
        this.authorizationCode = str;
    }

    @NotNull
    public final String getAuthorizationCode() {
        return this.authorizationCode;
    }
}
