package com.tinder.api.model.profile;

import com.squareup.moshi.Json;
import com.tinder.api.model.common.Job.Company;
import com.tinder.api.model.common.Job.Title;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/api/model/profile/UpdateJobRequestBody;", "", "title", "Lcom/tinder/api/model/common/Job$Title;", "company", "Lcom/tinder/api/model/common/Job$Company;", "(Lcom/tinder/api/model/common/Job$Title;Lcom/tinder/api/model/common/Job$Company;)V", "getCompany", "()Lcom/tinder/api/model/common/Job$Company;", "getTitle", "()Lcom/tinder/api/model/common/Job$Title;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class UpdateJobRequestBody {
    @Nullable
    private final Company company;
    @Nullable
    private final Title title;

    @NotNull
    public static /* synthetic */ UpdateJobRequestBody copy$default(UpdateJobRequestBody updateJobRequestBody, Title title, Company company, int i, Object obj) {
        if ((i & 1) != 0) {
            title = updateJobRequestBody.title;
        }
        if ((i & 2) != 0) {
            company = updateJobRequestBody.company;
        }
        return updateJobRequestBody.copy(title, company);
    }

    @Nullable
    public final Title component1() {
        return this.title;
    }

    @Nullable
    public final Company component2() {
        return this.company;
    }

    @NotNull
    public final UpdateJobRequestBody copy(@Nullable @Json(name = "title") Title title, @Nullable @Json(name = "company") Company company) {
        return new UpdateJobRequestBody(title, company);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UpdateJobRequestBody) {
                UpdateJobRequestBody updateJobRequestBody = (UpdateJobRequestBody) obj;
                if (C2668g.a(this.title, updateJobRequestBody.title) && C2668g.a(this.company, updateJobRequestBody.company)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Title title = this.title;
        int i = 0;
        int hashCode = (title != null ? title.hashCode() : 0) * 31;
        Company company = this.company;
        if (company != null) {
            i = company.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UpdateJobRequestBody(title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", company=");
        stringBuilder.append(this.company);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public UpdateJobRequestBody(@Nullable @Json(name = "title") Title title, @Nullable @Json(name = "company") Company company) {
        this.title = title;
        this.company = company;
    }

    @Nullable
    public final Title getTitle() {
        return this.title;
    }

    @Nullable
    public final Company getCompany() {
        return this.company;
    }
}
