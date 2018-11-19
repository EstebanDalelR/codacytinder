package com.tinder.domain.profile.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/tinder/domain/profile/model/InstagramAuthResult;", "", "userName", "", "hasFetched", "", "(Ljava/lang/String;Z)V", "getHasFetched", "()Z", "getUserName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class InstagramAuthResult {
    private final boolean hasFetched;
    @NotNull
    private final String userName;

    @NotNull
    public static /* synthetic */ InstagramAuthResult copy$default(InstagramAuthResult instagramAuthResult, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = instagramAuthResult.userName;
        }
        if ((i & 2) != 0) {
            z = instagramAuthResult.hasFetched;
        }
        return instagramAuthResult.copy(str, z);
    }

    @NotNull
    public final String component1() {
        return this.userName;
    }

    public final boolean component2() {
        return this.hasFetched;
    }

    @NotNull
    public final InstagramAuthResult copy(@NotNull String str, boolean z) {
        C2668g.b(str, "userName");
        return new InstagramAuthResult(str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InstagramAuthResult) {
            InstagramAuthResult instagramAuthResult = (InstagramAuthResult) obj;
            if (C2668g.a(this.userName, instagramAuthResult.userName)) {
                if ((this.hasFetched == instagramAuthResult.hasFetched ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.userName;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        int i = this.hasFetched;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InstagramAuthResult(userName=");
        stringBuilder.append(this.userName);
        stringBuilder.append(", hasFetched=");
        stringBuilder.append(this.hasFetched);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public InstagramAuthResult(@NotNull String str, boolean z) {
        C2668g.b(str, "userName");
        this.userName = str;
        this.hasFetched = z;
    }

    @NotNull
    public final String getUserName() {
        return this.userName;
    }

    public final boolean getHasFetched() {
        return this.hasFetched;
    }
}
