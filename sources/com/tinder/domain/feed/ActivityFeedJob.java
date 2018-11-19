package com.tinder.domain.feed;

import com.tinder.api.ManagerWebServices;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/domain/feed/ActivityFeedJob;", "", "company", "", "title", "(Ljava/lang/String;Ljava/lang/String;)V", "getCompany", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ActivityFeedJob {
    @NotNull
    private final String company;
    @NotNull
    private final String title;

    @NotNull
    public static /* synthetic */ ActivityFeedJob copy$default(ActivityFeedJob activityFeedJob, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activityFeedJob.company;
        }
        if ((i & 2) != 0) {
            str2 = activityFeedJob.title;
        }
        return activityFeedJob.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.company;
    }

    @NotNull
    public final String component2() {
        return this.title;
    }

    @NotNull
    public final ActivityFeedJob copy(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, ManagerWebServices.PARAM_JOB_COMPANY);
        C2668g.b(str2, ManagerWebServices.PARAM_JOB_TITLE);
        return new ActivityFeedJob(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityFeedJob) {
                ActivityFeedJob activityFeedJob = (ActivityFeedJob) obj;
                if (C2668g.a(this.company, activityFeedJob.company) && C2668g.a(this.title, activityFeedJob.title)) {
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
        stringBuilder.append("ActivityFeedJob(company=");
        stringBuilder.append(this.company);
        stringBuilder.append(", title=");
        stringBuilder.append(this.title);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ActivityFeedJob(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, ManagerWebServices.PARAM_JOB_COMPANY);
        C2668g.b(str2, ManagerWebServices.PARAM_JOB_TITLE);
        this.company = str;
        this.title = str2;
    }

    @NotNull
    public final String getCompany() {
        return this.company;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }
}
