package com.tinder.api.model.activityfeed;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileChangeBio;", "", "userNumber", "", "timestamp", "bio", "", "oldBio", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getBio", "()Ljava/lang/String;", "getOldBio", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUserNumber", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileChangeBio;", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ApiActivityEventProfileChangeBio {
    @Nullable
    private final String bio;
    @Nullable
    private final String oldBio;
    @Nullable
    private final Long timestamp;
    @Nullable
    private final Long userNumber;

    @NotNull
    public static /* synthetic */ ApiActivityEventProfileChangeBio copy$default(ApiActivityEventProfileChangeBio apiActivityEventProfileChangeBio, Long l, Long l2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = apiActivityEventProfileChangeBio.userNumber;
        }
        if ((i & 2) != 0) {
            l2 = apiActivityEventProfileChangeBio.timestamp;
        }
        if ((i & 4) != 0) {
            str = apiActivityEventProfileChangeBio.bio;
        }
        if ((i & 8) != 0) {
            str2 = apiActivityEventProfileChangeBio.oldBio;
        }
        return apiActivityEventProfileChangeBio.copy(l, l2, str, str2);
    }

    @Nullable
    public final Long component1() {
        return this.userNumber;
    }

    @Nullable
    public final Long component2() {
        return this.timestamp;
    }

    @Nullable
    public final String component3() {
        return this.bio;
    }

    @Nullable
    public final String component4() {
        return this.oldBio;
    }

    @NotNull
    public final ApiActivityEventProfileChangeBio copy(@Nullable Long l, @Nullable Long l2, @Nullable String str, @Nullable String str2) {
        return new ApiActivityEventProfileChangeBio(l, l2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApiActivityEventProfileChangeBio) {
                ApiActivityEventProfileChangeBio apiActivityEventProfileChangeBio = (ApiActivityEventProfileChangeBio) obj;
                if (C2668g.a(this.userNumber, apiActivityEventProfileChangeBio.userNumber) && C2668g.a(this.timestamp, apiActivityEventProfileChangeBio.timestamp) && C2668g.a(this.bio, apiActivityEventProfileChangeBio.bio) && C2668g.a(this.oldBio, apiActivityEventProfileChangeBio.oldBio)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Long l = this.userNumber;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Long l2 = this.timestamp;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str = this.bio;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.oldBio;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ApiActivityEventProfileChangeBio(userNumber=");
        stringBuilder.append(this.userNumber);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", bio=");
        stringBuilder.append(this.bio);
        stringBuilder.append(", oldBio=");
        stringBuilder.append(this.oldBio);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ApiActivityEventProfileChangeBio(@Nullable Long l, @Nullable Long l2, @Nullable String str, @Nullable String str2) {
        this.userNumber = l;
        this.timestamp = l2;
        this.bio = str;
        this.oldBio = str2;
    }

    @Nullable
    public final Long getUserNumber() {
        return this.userNumber;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final String getBio() {
        return this.bio;
    }

    @Nullable
    public final String getOldBio() {
        return this.oldBio;
    }
}
