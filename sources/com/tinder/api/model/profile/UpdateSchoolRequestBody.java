package com.tinder.api.model.profile;

import com.squareup.moshi.Json;
import com.tinder.api.model.common.School;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/tinder/api/model/profile/UpdateSchoolRequestBody;", "", "schools", "", "Lcom/tinder/api/model/common/School;", "(Ljava/util/List;)V", "getSchools", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class UpdateSchoolRequestBody {
    @Nullable
    private final List<School> schools;

    @NotNull
    public static /* synthetic */ UpdateSchoolRequestBody copy$default(UpdateSchoolRequestBody updateSchoolRequestBody, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = updateSchoolRequestBody.schools;
        }
        return updateSchoolRequestBody.copy(list);
    }

    @Nullable
    public final List<School> component1() {
        return this.schools;
    }

    @NotNull
    public final UpdateSchoolRequestBody copy(@Nullable @Json(name = "schools") List<? extends School> list) {
        return new UpdateSchoolRequestBody(list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UpdateSchoolRequestBody) {
                if (C2668g.a(this.schools, ((UpdateSchoolRequestBody) obj).schools)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List list = this.schools;
        return list != null ? list.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UpdateSchoolRequestBody(schools=");
        stringBuilder.append(this.schools);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public UpdateSchoolRequestBody(@Nullable @Json(name = "schools") List<? extends School> list) {
        this.schools = list;
    }

    @Nullable
    public final List<School> getSchools() {
        return this.schools;
    }
}
