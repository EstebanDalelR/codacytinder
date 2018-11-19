package com.tinder.domain.feed;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/tinder/domain/feed/ActivityFeedSchool;", "", "name", "", "type", "year", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getType", "getYear", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ActivityFeedSchool {
    @NotNull
    private final String name;
    @NotNull
    private final String type;
    @NotNull
    private final String year;

    @NotNull
    public static /* synthetic */ ActivityFeedSchool copy$default(ActivityFeedSchool activityFeedSchool, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activityFeedSchool.name;
        }
        if ((i & 2) != 0) {
            str2 = activityFeedSchool.type;
        }
        if ((i & 4) != 0) {
            str3 = activityFeedSchool.year;
        }
        return activityFeedSchool.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    @NotNull
    public final String component2() {
        return this.type;
    }

    @NotNull
    public final String component3() {
        return this.year;
    }

    @NotNull
    public final ActivityFeedSchool copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        C2668g.b(str, "name");
        C2668g.b(str2, "type");
        C2668g.b(str3, "year");
        return new ActivityFeedSchool(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityFeedSchool) {
                ActivityFeedSchool activityFeedSchool = (ActivityFeedSchool) obj;
                if (C2668g.a(this.name, activityFeedSchool.name) && C2668g.a(this.type, activityFeedSchool.type) && C2668g.a(this.year, activityFeedSchool.year)) {
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
        stringBuilder.append("ActivityFeedSchool(name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", year=");
        stringBuilder.append(this.year);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ActivityFeedSchool(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        C2668g.b(str, "name");
        C2668g.b(str2, "type");
        C2668g.b(str3, "year");
        this.name = str;
        this.type = str2;
        this.year = str3;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getYear() {
        return this.year;
    }
}
