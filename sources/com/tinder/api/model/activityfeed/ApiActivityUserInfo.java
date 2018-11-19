package com.tinder.api.model.activityfeed;

import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B{\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0013J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u000fHÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0011\u0010\u001aR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b!\u0010\u001aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015¨\u00064"}, d2 = {"Lcom/tinder/api/model/activityfeed/ApiActivityUserInfo;", "", "userId", "", "name", "photos", "", "Lcom/tinder/api/model/activityfeed/ApiActivityFeedPhoto;", "schools", "Lcom/tinder/api/model/activityfeed/ApiActivityFeedSchool;", "jobs", "Lcom/tinder/api/model/activityfeed/ApiActivityFeedJob;", "distanceInMiles", "", "gender", "", "customGender", "isVerified", "showGenderOnProfile", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCustomGender", "()Ljava/lang/String;", "getDistanceInMiles", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getGender", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getJobs", "()Ljava/util/List;", "getName", "getPhotos", "getSchools", "getShowGenderOnProfile", "getUserId", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/tinder/api/model/activityfeed/ApiActivityUserInfo;", "equals", "", "other", "hashCode", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ApiActivityUserInfo {
    @Nullable
    private final String customGender;
    @Nullable
    private final Double distanceInMiles;
    @Nullable
    private final Integer gender;
    @Nullable
    private final Integer isVerified;
    @Nullable
    private final List<ApiActivityFeedJob> jobs;
    @Nullable
    private final String name;
    @Nullable
    private final List<ApiActivityFeedPhoto> photos;
    @Nullable
    private final List<ApiActivityFeedSchool> schools;
    @Nullable
    private final Integer showGenderOnProfile;
    @Nullable
    private final String userId;

    @NotNull
    public static /* synthetic */ ApiActivityUserInfo copy$default(ApiActivityUserInfo apiActivityUserInfo, String str, String str2, List list, List list2, List list3, Double d, Integer num, String str3, Integer num2, Integer num3, int i, Object obj) {
        ApiActivityUserInfo apiActivityUserInfo2 = apiActivityUserInfo;
        int i2 = i;
        return apiActivityUserInfo2.copy((i2 & 1) != 0 ? apiActivityUserInfo2.userId : str, (i2 & 2) != 0 ? apiActivityUserInfo2.name : str2, (i2 & 4) != 0 ? apiActivityUserInfo2.photos : list, (i2 & 8) != 0 ? apiActivityUserInfo2.schools : list2, (i2 & 16) != 0 ? apiActivityUserInfo2.jobs : list3, (i2 & 32) != 0 ? apiActivityUserInfo2.distanceInMiles : d, (i2 & 64) != 0 ? apiActivityUserInfo2.gender : num, (i2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? apiActivityUserInfo2.customGender : str3, (i2 & 256) != 0 ? apiActivityUserInfo2.isVerified : num2, (i2 & 512) != 0 ? apiActivityUserInfo2.showGenderOnProfile : num3);
    }

    @Nullable
    public final String component1() {
        return this.userId;
    }

    @Nullable
    public final Integer component10() {
        return this.showGenderOnProfile;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    @Nullable
    public final List<ApiActivityFeedPhoto> component3() {
        return this.photos;
    }

    @Nullable
    public final List<ApiActivityFeedSchool> component4() {
        return this.schools;
    }

    @Nullable
    public final List<ApiActivityFeedJob> component5() {
        return this.jobs;
    }

    @Nullable
    public final Double component6() {
        return this.distanceInMiles;
    }

    @Nullable
    public final Integer component7() {
        return this.gender;
    }

    @Nullable
    public final String component8() {
        return this.customGender;
    }

    @Nullable
    public final Integer component9() {
        return this.isVerified;
    }

    @NotNull
    public final ApiActivityUserInfo copy(@Nullable String str, @Nullable String str2, @Nullable List<ApiActivityFeedPhoto> list, @Nullable List<ApiActivityFeedSchool> list2, @Nullable List<ApiActivityFeedJob> list3, @Nullable Double d, @Nullable Integer num, @Nullable String str3, @Nullable Integer num2, @Nullable Integer num3) {
        return new ApiActivityUserInfo(str, str2, list, list2, list3, d, num, str3, num2, num3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApiActivityUserInfo) {
                ApiActivityUserInfo apiActivityUserInfo = (ApiActivityUserInfo) obj;
                if (C2668g.a(this.userId, apiActivityUserInfo.userId) && C2668g.a(this.name, apiActivityUserInfo.name) && C2668g.a(this.photos, apiActivityUserInfo.photos) && C2668g.a(this.schools, apiActivityUserInfo.schools) && C2668g.a(this.jobs, apiActivityUserInfo.jobs) && C2668g.a(this.distanceInMiles, apiActivityUserInfo.distanceInMiles) && C2668g.a(this.gender, apiActivityUserInfo.gender) && C2668g.a(this.customGender, apiActivityUserInfo.customGender) && C2668g.a(this.isVerified, apiActivityUserInfo.isVerified) && C2668g.a(this.showGenderOnProfile, apiActivityUserInfo.showGenderOnProfile)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.userId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List list = this.photos;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        list = this.schools;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        list = this.jobs;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Double d = this.distanceInMiles;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        Integer num = this.gender;
        hashCode = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        str2 = this.customGender;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        num = this.isVerified;
        hashCode = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        num = this.showGenderOnProfile;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ApiActivityUserInfo(userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", photos=");
        stringBuilder.append(this.photos);
        stringBuilder.append(", schools=");
        stringBuilder.append(this.schools);
        stringBuilder.append(", jobs=");
        stringBuilder.append(this.jobs);
        stringBuilder.append(", distanceInMiles=");
        stringBuilder.append(this.distanceInMiles);
        stringBuilder.append(", gender=");
        stringBuilder.append(this.gender);
        stringBuilder.append(", customGender=");
        stringBuilder.append(this.customGender);
        stringBuilder.append(", isVerified=");
        stringBuilder.append(this.isVerified);
        stringBuilder.append(", showGenderOnProfile=");
        stringBuilder.append(this.showGenderOnProfile);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ApiActivityUserInfo(@Nullable String str, @Nullable String str2, @Nullable List<ApiActivityFeedPhoto> list, @Nullable List<ApiActivityFeedSchool> list2, @Nullable List<ApiActivityFeedJob> list3, @Nullable Double d, @Nullable Integer num, @Nullable String str3, @Nullable Integer num2, @Nullable Integer num3) {
        this.userId = str;
        this.name = str2;
        this.photos = list;
        this.schools = list2;
        this.jobs = list3;
        this.distanceInMiles = d;
        this.gender = num;
        this.customGender = str3;
        this.isVerified = num2;
        this.showGenderOnProfile = num3;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final List<ApiActivityFeedPhoto> getPhotos() {
        return this.photos;
    }

    @Nullable
    public final List<ApiActivityFeedSchool> getSchools() {
        return this.schools;
    }

    @Nullable
    public final List<ApiActivityFeedJob> getJobs() {
        return this.jobs;
    }

    @Nullable
    public final Double getDistanceInMiles() {
        return this.distanceInMiles;
    }

    @Nullable
    public final Integer getGender() {
        return this.gender;
    }

    @Nullable
    public final String getCustomGender() {
        return this.customGender;
    }

    @Nullable
    public final Integer isVerified() {
        return this.isVerified;
    }

    @Nullable
    public final Integer getShowGenderOnProfile() {
        return this.showGenderOnProfile;
    }
}
