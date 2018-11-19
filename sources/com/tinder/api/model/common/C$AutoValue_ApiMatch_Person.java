package com.tinder.api.model.common;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.model.common.ApiMatch.Person;
import java.util.List;

/* renamed from: com.tinder.api.model.common.$AutoValue_ApiMatch_Person */
abstract class C$AutoValue_ApiMatch_Person extends Person {
    private final List<Badge> badges;
    private final String bio;
    private final String birthDate;
    private final Integer gender;
    private final String id;
    private final String name;
    private final List<Photo> photos;
    private final String pingTime;

    C$AutoValue_ApiMatch_Person(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4, @Nullable String str5, @Nullable List<Photo> list, @Nullable List<Badge> list2) {
        this.id = str;
        this.bio = str2;
        this.birthDate = str3;
        this.gender = num;
        this.name = str4;
        this.pingTime = str5;
        this.photos = list;
        this.badges = list2;
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
    public Integer gender() {
        return this.gender;
    }

    @Nullable
    public String name() {
        return this.name;
    }

    @Nullable
    @Json(name = "ping_time")
    public String pingTime() {
        return this.pingTime;
    }

    @Nullable
    public List<Photo> photos() {
        return this.photos;
    }

    @Nullable
    public List<Badge> badges() {
        return this.badges;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Person{id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", bio=");
        stringBuilder.append(this.bio);
        stringBuilder.append(", birthDate=");
        stringBuilder.append(this.birthDate);
        stringBuilder.append(", gender=");
        stringBuilder.append(this.gender);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", pingTime=");
        stringBuilder.append(this.pingTime);
        stringBuilder.append(", photos=");
        stringBuilder.append(this.photos);
        stringBuilder.append(", badges=");
        stringBuilder.append(this.badges);
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
        r1 = r5 instanceof com.tinder.api.model.common.ApiMatch.Person;
        r2 = 0;
        if (r1 == 0) goto L_0x00c6;
    L_0x0009:
        r5 = (com.tinder.api.model.common.ApiMatch.Person) r5;
        r1 = r4.id;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.id();
        if (r1 != 0) goto L_0x00c4;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.id;
        r3 = r5.id();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c4;
    L_0x0022:
        r1 = r4.bio;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.bio();
        if (r1 != 0) goto L_0x00c4;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.bio;
        r3 = r5.bio();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c4;
    L_0x0039:
        r1 = r4.birthDate;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r1 = r5.birthDate();
        if (r1 != 0) goto L_0x00c4;
    L_0x0043:
        goto L_0x0050;
    L_0x0044:
        r1 = r4.birthDate;
        r3 = r5.birthDate();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c4;
    L_0x0050:
        r1 = r4.gender;
        if (r1 != 0) goto L_0x005b;
    L_0x0054:
        r1 = r5.gender();
        if (r1 != 0) goto L_0x00c4;
    L_0x005a:
        goto L_0x0067;
    L_0x005b:
        r1 = r4.gender;
        r3 = r5.gender();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c4;
    L_0x0067:
        r1 = r4.name;
        if (r1 != 0) goto L_0x0072;
    L_0x006b:
        r1 = r5.name();
        if (r1 != 0) goto L_0x00c4;
    L_0x0071:
        goto L_0x007e;
    L_0x0072:
        r1 = r4.name;
        r3 = r5.name();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c4;
    L_0x007e:
        r1 = r4.pingTime;
        if (r1 != 0) goto L_0x0089;
    L_0x0082:
        r1 = r5.pingTime();
        if (r1 != 0) goto L_0x00c4;
    L_0x0088:
        goto L_0x0095;
    L_0x0089:
        r1 = r4.pingTime;
        r3 = r5.pingTime();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c4;
    L_0x0095:
        r1 = r4.photos;
        if (r1 != 0) goto L_0x00a0;
    L_0x0099:
        r1 = r5.photos();
        if (r1 != 0) goto L_0x00c4;
    L_0x009f:
        goto L_0x00ac;
    L_0x00a0:
        r1 = r4.photos;
        r3 = r5.photos();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c4;
    L_0x00ac:
        r1 = r4.badges;
        if (r1 != 0) goto L_0x00b7;
    L_0x00b0:
        r5 = r5.badges();
        if (r5 != 0) goto L_0x00c4;
    L_0x00b6:
        goto L_0x00c5;
    L_0x00b7:
        r1 = r4.badges;
        r5 = r5.badges();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x00c4;
    L_0x00c3:
        goto L_0x00c5;
    L_0x00c4:
        r0 = 0;
    L_0x00c5:
        return r0;
    L_0x00c6:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.common.$AutoValue_ApiMatch_Person.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((((((((this.id == null ? 0 : this.id.hashCode()) ^ 1000003) * 1000003) ^ (this.bio == null ? 0 : this.bio.hashCode())) * 1000003) ^ (this.birthDate == null ? 0 : this.birthDate.hashCode())) * 1000003) ^ (this.gender == null ? 0 : this.gender.hashCode())) * 1000003) ^ (this.name == null ? 0 : this.name.hashCode())) * 1000003) ^ (this.pingTime == null ? 0 : this.pingTime.hashCode())) * 1000003) ^ (this.photos == null ? 0 : this.photos.hashCode())) * 1000003;
        if (this.badges != null) {
            i = this.badges.hashCode();
        }
        return hashCode ^ i;
    }
}
