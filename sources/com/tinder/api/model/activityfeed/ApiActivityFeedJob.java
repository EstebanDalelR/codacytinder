package com.tinder.api.model.activityfeed;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/api/model/activityfeed/ApiActivityFeedJob;", "", "company", "", "title", "(Ljava/lang/String;Ljava/lang/String;)V", "getCompany", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ApiActivityFeedJob {
    @Nullable
    private final String company;
    @Nullable
    private final String title;

    @NotNull
    public static /* synthetic */ ApiActivityFeedJob copy$default(ApiActivityFeedJob apiActivityFeedJob, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiActivityFeedJob.company;
        }
        if ((i & 2) != 0) {
            str2 = apiActivityFeedJob.title;
        }
        return apiActivityFeedJob.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.company;
    }

    @Nullable
    public final String component2() {
        return this.title;
    }

    @NotNull
    public final ApiActivityFeedJob copy(@Nullable String str, @Nullable String str2) {
        return new ApiActivityFeedJob(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApiActivityFeedJob) {
                ApiActivityFeedJob apiActivityFeedJob = (ApiActivityFeedJob) obj;
                if (C2668g.a(this.company, apiActivityFeedJob.company) && C2668g.a(this.title, apiActivityFeedJob.title)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.company;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ApiActivityFeedJob(company=");
        stringBuilder.append(this.company);
        stringBuilder.append(", title=");
        stringBuilder.append(this.title);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ApiActivityFeedJob(@Nullable String str, @Nullable String str2) {
        this.company = str;
        this.title = str2;
    }

    @Nullable
    public final String getCompany() {
        return this.company;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }
}
