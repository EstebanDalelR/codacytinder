package com.tinder.api.model.activityfeed;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/tinder/api/model/activityfeed/ApiActivityFeedSchool;", "", "name", "", "type", "year", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getType", "getYear", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ApiActivityFeedSchool {
    @Nullable
    private final String name;
    @Nullable
    private final String type;
    @Nullable
    private final String year;

    @NotNull
    public static /* synthetic */ ApiActivityFeedSchool copy$default(ApiActivityFeedSchool apiActivityFeedSchool, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiActivityFeedSchool.name;
        }
        if ((i & 2) != 0) {
            str2 = apiActivityFeedSchool.type;
        }
        if ((i & 4) != 0) {
            str3 = apiActivityFeedSchool.year;
        }
        return apiActivityFeedSchool.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.name;
    }

    @Nullable
    public final String component2() {
        return this.type;
    }

    @Nullable
    public final String component3() {
        return this.year;
    }

    @NotNull
    public final ApiActivityFeedSchool copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new ApiActivityFeedSchool(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApiActivityFeedSchool) {
                ApiActivityFeedSchool apiActivityFeedSchool = (ApiActivityFeedSchool) obj;
                if (C2668g.a(this.name, apiActivityFeedSchool.name) && C2668g.a(this.type, apiActivityFeedSchool.type) && C2668g.a(this.year, apiActivityFeedSchool.year)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.type;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.year;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ApiActivityFeedSchool(name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", year=");
        stringBuilder.append(this.year);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ApiActivityFeedSchool(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.name = str;
        this.type = str2;
        this.year = str3;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getYear() {
        return this.year;
    }
}
