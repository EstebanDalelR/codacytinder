package com.tinder.domain.feed;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.model.Gender;
import com.tinder.domain.common.model.Gender.Value;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010'\u001a\u00020\u0011HÆ\u0003Jr\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\u00112\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0018R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001c¨\u0006/"}, d2 = {"Lcom/tinder/domain/feed/ActivityFeedUserInfo;", "", "userId", "", "name", "photos", "", "Lcom/tinder/domain/feed/ActivityFeedPhoto;", "jobs", "Lcom/tinder/domain/feed/ActivityFeedJob;", "schools", "Lcom/tinder/domain/feed/ActivityFeedSchool;", "gender", "Lcom/tinder/domain/common/model/Gender;", "distanceInMiles", "", "isVerified", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/tinder/domain/common/model/Gender;Ljava/lang/Double;Z)V", "getDistanceInMiles", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getGender", "()Lcom/tinder/domain/common/model/Gender;", "()Z", "getJobs", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "getPhotos", "getSchools", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/tinder/domain/common/model/Gender;Ljava/lang/Double;Z)Lcom/tinder/domain/feed/ActivityFeedUserInfo;", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ActivityFeedUserInfo {
    @Nullable
    private final Double distanceInMiles;
    @NotNull
    private final Gender gender;
    private final boolean isVerified;
    @NotNull
    private final List<ActivityFeedJob> jobs;
    @NotNull
    private final String name;
    @NotNull
    private final List<ActivityFeedPhoto> photos;
    @NotNull
    private final List<ActivityFeedSchool> schools;
    @NotNull
    private final String userId;

    @NotNull
    public static /* synthetic */ ActivityFeedUserInfo copy$default(ActivityFeedUserInfo activityFeedUserInfo, String str, String str2, List list, List list2, List list3, Gender gender, Double d, boolean z, int i, Object obj) {
        ActivityFeedUserInfo activityFeedUserInfo2 = activityFeedUserInfo;
        int i2 = i;
        return activityFeedUserInfo2.copy((i2 & 1) != 0 ? activityFeedUserInfo2.userId : str, (i2 & 2) != 0 ? activityFeedUserInfo2.name : str2, (i2 & 4) != 0 ? activityFeedUserInfo2.photos : list, (i2 & 8) != 0 ? activityFeedUserInfo2.jobs : list2, (i2 & 16) != 0 ? activityFeedUserInfo2.schools : list3, (i2 & 32) != 0 ? activityFeedUserInfo2.gender : gender, (i2 & 64) != 0 ? activityFeedUserInfo2.distanceInMiles : d, (i2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? activityFeedUserInfo2.isVerified : z);
    }

    @NotNull
    public final String component1() {
        return this.userId;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final List<ActivityFeedPhoto> component3() {
        return this.photos;
    }

    @NotNull
    public final List<ActivityFeedJob> component4() {
        return this.jobs;
    }

    @NotNull
    public final List<ActivityFeedSchool> component5() {
        return this.schools;
    }

    @NotNull
    public final Gender component6() {
        return this.gender;
    }

    @Nullable
    public final Double component7() {
        return this.distanceInMiles;
    }

    public final boolean component8() {
        return this.isVerified;
    }

    @NotNull
    public final ActivityFeedUserInfo copy(@NotNull String str, @NotNull String str2, @NotNull List<ActivityFeedPhoto> list, @NotNull List<ActivityFeedJob> list2, @NotNull List<ActivityFeedSchool> list3, @NotNull Gender gender, @Nullable Double d, boolean z) {
        String str3 = str;
        C2668g.b(str3, ManagerWebServices.PARAM_USER_ID);
        String str4 = str2;
        C2668g.b(str4, "name");
        List<ActivityFeedPhoto> list4 = list;
        C2668g.b(list4, "photos");
        List<ActivityFeedJob> list5 = list2;
        C2668g.b(list5, ManagerWebServices.PARAM_JOBS);
        List<ActivityFeedSchool> list6 = list3;
        C2668g.b(list6, ManagerWebServices.PARAM_SCHOOLS);
        Gender gender2 = gender;
        C2668g.b(gender2, "gender");
        return new ActivityFeedUserInfo(str3, str4, list4, list5, list6, gender2, d, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActivityFeedUserInfo) {
            ActivityFeedUserInfo activityFeedUserInfo = (ActivityFeedUserInfo) obj;
            if (C2668g.a(this.userId, activityFeedUserInfo.userId) && C2668g.a(this.name, activityFeedUserInfo.name) && C2668g.a(this.photos, activityFeedUserInfo.photos) && C2668g.a(this.jobs, activityFeedUserInfo.jobs) && C2668g.a(this.schools, activityFeedUserInfo.schools) && C2668g.a(this.gender, activityFeedUserInfo.gender) && C2668g.a(this.distanceInMiles, activityFeedUserInfo.distanceInMiles)) {
                if ((this.isVerified == activityFeedUserInfo.isVerified ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.userId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List list = this.photos;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        list = this.jobs;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        list = this.schools;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Gender gender = this.gender;
        hashCode = (hashCode + (gender != null ? gender.hashCode() : 0)) * 31;
        Double d = this.distanceInMiles;
        if (d != null) {
            i = d.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.isVerified;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActivityFeedUserInfo(userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", photos=");
        stringBuilder.append(this.photos);
        stringBuilder.append(", jobs=");
        stringBuilder.append(this.jobs);
        stringBuilder.append(", schools=");
        stringBuilder.append(this.schools);
        stringBuilder.append(", gender=");
        stringBuilder.append(this.gender);
        stringBuilder.append(", distanceInMiles=");
        stringBuilder.append(this.distanceInMiles);
        stringBuilder.append(", isVerified=");
        stringBuilder.append(this.isVerified);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ActivityFeedUserInfo(@NotNull String str, @NotNull String str2, @NotNull List<ActivityFeedPhoto> list, @NotNull List<ActivityFeedJob> list2, @NotNull List<ActivityFeedSchool> list3, @NotNull Gender gender, @Nullable Double d, boolean z) {
        C2668g.b(str, ManagerWebServices.PARAM_USER_ID);
        C2668g.b(str2, "name");
        C2668g.b(list, "photos");
        C2668g.b(list2, ManagerWebServices.PARAM_JOBS);
        C2668g.b(list3, ManagerWebServices.PARAM_SCHOOLS);
        C2668g.b(gender, "gender");
        this.userId = str;
        this.name = str2;
        this.photos = list;
        this.jobs = list2;
        this.schools = list3;
        this.gender = gender;
        this.distanceInMiles = d;
        this.isVerified = z;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public /* synthetic */ ActivityFeedUserInfo(String str, String str2, List list, List list2, List list3, Gender gender, Double d, boolean z, int i, C15823e c15823e) {
        Gender gender2;
        int i2 = i;
        String str3 = (i2 & 2) != 0 ? "" : str2;
        List a = (i2 & 4) != 0 ? C19301m.a() : list;
        List a2 = (i2 & 8) != 0 ? C19301m.a() : list2;
        List a3 = (i2 & 16) != 0 ? C19301m.a() : list3;
        if ((i2 & 32) != 0) {
            Gender create = Gender.create(Value.UNKNOWN);
            C2668g.a(create, "Gender.create(Gender.Value.UNKNOWN)");
            gender2 = create;
        } else {
            gender2 = gender;
        }
        this(str, str3, a, a2, a3, gender2, (i2 & 64) != 0 ? (Double) null : d, (i2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? false : z);
    }

    @NotNull
    public final List<ActivityFeedPhoto> getPhotos() {
        return this.photos;
    }

    @NotNull
    public final List<ActivityFeedJob> getJobs() {
        return this.jobs;
    }

    @NotNull
    public final List<ActivityFeedSchool> getSchools() {
        return this.schools;
    }

    @NotNull
    public final Gender getGender() {
        return this.gender;
    }

    @Nullable
    public final Double getDistanceInMiles() {
        return this.distanceInMiles;
    }

    public final boolean isVerified() {
        return this.isVerified;
    }
}
