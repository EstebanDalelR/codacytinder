package com.tinder.api.model.recs;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.model.common.Badge;
import com.tinder.api.model.common.Job;
import com.tinder.api.model.common.Photo;
import com.tinder.api.model.common.School;
import com.tinder.api.model.recs.Rec.User;
import java.util.List;

/* renamed from: com.tinder.api.model.recs.$AutoValue_Rec_User */
abstract class C$AutoValue_Rec_User extends User {
    private final List<Badge> badges;
    private final String bio;
    private final String birthDate;
    private final String customGender;
    private final Integer gender;
    private final Boolean hideAge;
    private final Boolean hideDistance;
    private final String id;
    private final Boolean isBrand;
    private final Boolean isTraveling;
    private final Boolean isVerified;
    private final List<Job> jobs;
    private final String name;
    private final List<Photo> photos;
    private final List<School> schools;
    private final Boolean selectMember;
    private final Boolean showGenderOnProfile;

    C$AutoValue_Rec_User(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<Badge> list, @Nullable String str4, @Nullable List<Photo> list2, @Nullable Integer num, @Nullable List<Job> list3, @Nullable List<School> list4, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Boolean bool7, @Nullable String str5) {
        this.id = str;
        this.bio = str2;
        this.birthDate = str3;
        this.badges = list;
        this.name = str4;
        this.photos = list2;
        this.gender = num;
        this.jobs = list3;
        this.schools = list4;
        this.isTraveling = bool;
        this.showGenderOnProfile = bool2;
        this.hideAge = bool3;
        this.isVerified = bool4;
        this.isBrand = bool5;
        this.hideDistance = bool6;
        this.selectMember = bool7;
        this.customGender = str5;
    }

    @Nullable
    @Json(name = "_id")
    public String id() {
        return this.id;
    }

    @Nullable
    public String bio() {
        return this.bio;
    }

    @Nullable
    @Json(name = "birth_date")
    public String birthDate() {
        return this.birthDate;
    }

    @Nullable
    public List<Badge> badges() {
        return this.badges;
    }

    @Nullable
    public String name() {
        return this.name;
    }

    @Nullable
    public List<Photo> photos() {
        return this.photos;
    }

    @Nullable
    public Integer gender() {
        return this.gender;
    }

    @Nullable
    public List<Job> jobs() {
        return this.jobs;
    }

    @Nullable
    public List<School> schools() {
        return this.schools;
    }

    @Nullable
    @Json(name = "is_traveling")
    public Boolean isTraveling() {
        return this.isTraveling;
    }

    @Nullable
    @Json(name = "show_gender_on_profile")
    public Boolean showGenderOnProfile() {
        return this.showGenderOnProfile;
    }

    @Nullable
    @Json(name = "hide_age")
    public Boolean hideAge() {
        return this.hideAge;
    }

    @Nullable
    @Json(name = "is_verified")
    public Boolean isVerified() {
        return this.isVerified;
    }

    @Nullable
    @Json(name = "is_brand")
    public Boolean isBrand() {
        return this.isBrand;
    }

    @Nullable
    @Json(name = "hide_distance")
    public Boolean hideDistance() {
        return this.hideDistance;
    }

    @Nullable
    @Json(name = "select_member")
    public Boolean selectMember() {
        return this.selectMember;
    }

    @Nullable
    @Json(name = "custom_gender")
    public String customGender() {
        return this.customGender;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("User{id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", bio=");
        stringBuilder.append(this.bio);
        stringBuilder.append(", birthDate=");
        stringBuilder.append(this.birthDate);
        stringBuilder.append(", badges=");
        stringBuilder.append(this.badges);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", photos=");
        stringBuilder.append(this.photos);
        stringBuilder.append(", gender=");
        stringBuilder.append(this.gender);
        stringBuilder.append(", jobs=");
        stringBuilder.append(this.jobs);
        stringBuilder.append(", schools=");
        stringBuilder.append(this.schools);
        stringBuilder.append(", isTraveling=");
        stringBuilder.append(this.isTraveling);
        stringBuilder.append(", showGenderOnProfile=");
        stringBuilder.append(this.showGenderOnProfile);
        stringBuilder.append(", hideAge=");
        stringBuilder.append(this.hideAge);
        stringBuilder.append(", isVerified=");
        stringBuilder.append(this.isVerified);
        stringBuilder.append(", isBrand=");
        stringBuilder.append(this.isBrand);
        stringBuilder.append(", hideDistance=");
        stringBuilder.append(this.hideDistance);
        stringBuilder.append(", selectMember=");
        stringBuilder.append(this.selectMember);
        stringBuilder.append(", customGender=");
        stringBuilder.append(this.customGender);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r5 != r4) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof com.tinder.api.model.recs.Rec.User;
        r2 = 0;
        if (r1 == 0) goto L_0x0195;
    L_0x0009:
        r5 = (com.tinder.api.model.recs.Rec.User) r5;
        r1 = r4.id;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.id();
        if (r1 != 0) goto L_0x0193;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.id;
        r3 = r5.id();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0193;
    L_0x0022:
        r1 = r4.bio;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.bio();
        if (r1 != 0) goto L_0x0193;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.bio;
        r3 = r5.bio();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0193;
    L_0x0039:
        r1 = r4.birthDate;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r1 = r5.birthDate();
        if (r1 != 0) goto L_0x0193;
    L_0x0043:
        goto L_0x0050;
    L_0x0044:
        r1 = r4.birthDate;
        r3 = r5.birthDate();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0193;
    L_0x0050:
        r1 = r4.badges;
        if (r1 != 0) goto L_0x005b;
    L_0x0054:
        r1 = r5.badges();
        if (r1 != 0) goto L_0x0193;
    L_0x005a:
        goto L_0x0067;
    L_0x005b:
        r1 = r4.badges;
        r3 = r5.badges();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0193;
    L_0x0067:
        r1 = r4.name;
        if (r1 != 0) goto L_0x0072;
    L_0x006b:
        r1 = r5.name();
        if (r1 != 0) goto L_0x0193;
    L_0x0071:
        goto L_0x007e;
    L_0x0072:
        r1 = r4.name;
        r3 = r5.name();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0193;
    L_0x007e:
        r1 = r4.photos;
        if (r1 != 0) goto L_0x0089;
    L_0x0082:
        r1 = r5.photos();
        if (r1 != 0) goto L_0x0193;
    L_0x0088:
        goto L_0x0095;
    L_0x0089:
        r1 = r4.photos;
        r3 = r5.photos();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0193;
    L_0x0095:
        r1 = r4.gender;
        if (r1 != 0) goto L_0x00a0;
    L_0x0099:
        r1 = r5.gender();
        if (r1 != 0) goto L_0x0193;
    L_0x009f:
        goto L_0x00ac;
    L_0x00a0:
        r1 = r4.gender;
        r3 = r5.gender();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0193;
    L_0x00ac:
        r1 = r4.jobs;
        if (r1 != 0) goto L_0x00b7;
    L_0x00b0:
        r1 = r5.jobs();
        if (r1 != 0) goto L_0x0193;
    L_0x00b6:
        goto L_0x00c3;
    L_0x00b7:
        r1 = r4.jobs;
        r3 = r5.jobs();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0193;
    L_0x00c3:
        r1 = r4.schools;
        if (r1 != 0) goto L_0x00ce;
    L_0x00c7:
        r1 = r5.schools();
        if (r1 != 0) goto L_0x0193;
    L_0x00cd:
        goto L_0x00da;
    L_0x00ce:
        r1 = r4.schools;
        r3 = r5.schools();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0193;
    L_0x00da:
        r1 = r4.isTraveling;
        if (r1 != 0) goto L_0x00e5;
    L_0x00de:
        r1 = r5.isTraveling();
        if (r1 != 0) goto L_0x0193;
    L_0x00e4:
        goto L_0x00f1;
    L_0x00e5:
        r1 = r4.isTraveling;
        r3 = r5.isTraveling();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0193;
    L_0x00f1:
        r1 = r4.showGenderOnProfile;
        if (r1 != 0) goto L_0x00fc;
    L_0x00f5:
        r1 = r5.showGenderOnProfile();
        if (r1 != 0) goto L_0x0193;
    L_0x00fb:
        goto L_0x0108;
    L_0x00fc:
        r1 = r4.showGenderOnProfile;
        r3 = r5.showGenderOnProfile();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0193;
    L_0x0108:
        r1 = r4.hideAge;
        if (r1 != 0) goto L_0x0113;
    L_0x010c:
        r1 = r5.hideAge();
        if (r1 != 0) goto L_0x0193;
    L_0x0112:
        goto L_0x011f;
    L_0x0113:
        r1 = r4.hideAge;
        r3 = r5.hideAge();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0193;
    L_0x011f:
        r1 = r4.isVerified;
        if (r1 != 0) goto L_0x012a;
    L_0x0123:
        r1 = r5.isVerified();
        if (r1 != 0) goto L_0x0193;
    L_0x0129:
        goto L_0x0136;
    L_0x012a:
        r1 = r4.isVerified;
        r3 = r5.isVerified();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0193;
    L_0x0136:
        r1 = r4.isBrand;
        if (r1 != 0) goto L_0x0141;
    L_0x013a:
        r1 = r5.isBrand();
        if (r1 != 0) goto L_0x0193;
    L_0x0140:
        goto L_0x014d;
    L_0x0141:
        r1 = r4.isBrand;
        r3 = r5.isBrand();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0193;
    L_0x014d:
        r1 = r4.hideDistance;
        if (r1 != 0) goto L_0x0158;
    L_0x0151:
        r1 = r5.hideDistance();
        if (r1 != 0) goto L_0x0193;
    L_0x0157:
        goto L_0x0164;
    L_0x0158:
        r1 = r4.hideDistance;
        r3 = r5.hideDistance();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0193;
    L_0x0164:
        r1 = r4.selectMember;
        if (r1 != 0) goto L_0x016f;
    L_0x0168:
        r1 = r5.selectMember();
        if (r1 != 0) goto L_0x0193;
    L_0x016e:
        goto L_0x017b;
    L_0x016f:
        r1 = r4.selectMember;
        r3 = r5.selectMember();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0193;
    L_0x017b:
        r1 = r4.customGender;
        if (r1 != 0) goto L_0x0186;
    L_0x017f:
        r5 = r5.customGender();
        if (r5 != 0) goto L_0x0193;
    L_0x0185:
        goto L_0x0194;
    L_0x0186:
        r1 = r4.customGender;
        r5 = r5.customGender();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0193;
    L_0x0192:
        goto L_0x0194;
    L_0x0193:
        r0 = 0;
    L_0x0194:
        return r0;
    L_0x0195:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.recs.$AutoValue_Rec_User.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((((((((((((((((((((((((((this.id == null ? 0 : this.id.hashCode()) ^ 1000003) * 1000003) ^ (this.bio == null ? 0 : this.bio.hashCode())) * 1000003) ^ (this.birthDate == null ? 0 : this.birthDate.hashCode())) * 1000003) ^ (this.badges == null ? 0 : this.badges.hashCode())) * 1000003) ^ (this.name == null ? 0 : this.name.hashCode())) * 1000003) ^ (this.photos == null ? 0 : this.photos.hashCode())) * 1000003) ^ (this.gender == null ? 0 : this.gender.hashCode())) * 1000003) ^ (this.jobs == null ? 0 : this.jobs.hashCode())) * 1000003) ^ (this.schools == null ? 0 : this.schools.hashCode())) * 1000003) ^ (this.isTraveling == null ? 0 : this.isTraveling.hashCode())) * 1000003) ^ (this.showGenderOnProfile == null ? 0 : this.showGenderOnProfile.hashCode())) * 1000003) ^ (this.hideAge == null ? 0 : this.hideAge.hashCode())) * 1000003) ^ (this.isVerified == null ? 0 : this.isVerified.hashCode())) * 1000003) ^ (this.isBrand == null ? 0 : this.isBrand.hashCode())) * 1000003) ^ (this.hideDistance == null ? 0 : this.hideDistance.hashCode())) * 1000003) ^ (this.selectMember == null ? 0 : this.selectMember.hashCode())) * 1000003;
        if (this.customGender != null) {
            i = this.customGender.hashCode();
        }
        return hashCode ^ i;
    }
}
