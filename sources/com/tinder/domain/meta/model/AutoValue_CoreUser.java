package com.tinder.domain.meta.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.domain.common.model.Badge;
import com.tinder.domain.common.model.Gender;
import com.tinder.domain.common.model.Job;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.common.model.School;
import java.util.List;
import org.joda.time.DateTime;

final class AutoValue_CoreUser extends CoreUser {
    private final List<Badge> badges;
    private final String bio;
    private final DateTime birthDate;
    private final Gender gender;
    private final String id;
    private final List<Job> jobs;
    private final String name;
    private final List<Photo> photos;
    private final List<School> schools;

    static final class Builder extends com.tinder.domain.meta.model.CoreUser.Builder {
        private List<Badge> badges;
        private String bio;
        private DateTime birthDate;
        private Gender gender;
        private String id;
        private List<Job> jobs;
        private String name;
        private List<Photo> photos;
        private List<School> schools;

        Builder() {
        }

        Builder(CoreUser coreUser) {
            this.id = coreUser.id();
            this.badges = coreUser.badges();
            this.bio = coreUser.bio();
            this.birthDate = coreUser.birthDate();
            this.gender = coreUser.gender();
            this.name = coreUser.name();
            this.photos = coreUser.photos();
            this.jobs = coreUser.jobs();
            this.schools = coreUser.schools();
        }

        public com.tinder.domain.meta.model.CoreUser.Builder id(String str) {
            this.id = str;
            return this;
        }

        public com.tinder.domain.meta.model.CoreUser.Builder badges(List<Badge> list) {
            this.badges = list;
            return this;
        }

        public com.tinder.domain.meta.model.CoreUser.Builder bio(@Nullable String str) {
            this.bio = str;
            return this;
        }

        public com.tinder.domain.meta.model.CoreUser.Builder birthDate(@Nullable DateTime dateTime) {
            this.birthDate = dateTime;
            return this;
        }

        public com.tinder.domain.meta.model.CoreUser.Builder gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public com.tinder.domain.meta.model.CoreUser.Builder name(String str) {
            this.name = str;
            return this;
        }

        public com.tinder.domain.meta.model.CoreUser.Builder photos(List<Photo> list) {
            this.photos = list;
            return this;
        }

        public com.tinder.domain.meta.model.CoreUser.Builder jobs(List<Job> list) {
            this.jobs = list;
            return this;
        }

        public com.tinder.domain.meta.model.CoreUser.Builder schools(List<School> list) {
            this.schools = list;
            return this;
        }

        public CoreUser build() {
            String str = "";
            if (this.id == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" id");
                str = stringBuilder.toString();
            }
            if (this.badges == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" badges");
                str = stringBuilder.toString();
            }
            if (this.gender == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" gender");
                str = stringBuilder.toString();
            }
            if (this.name == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" name");
                str = stringBuilder.toString();
            }
            if (this.photos == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" photos");
                str = stringBuilder.toString();
            }
            if (this.jobs == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" jobs");
                str = stringBuilder.toString();
            }
            if (this.schools == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" schools");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_CoreUser(this.id, this.badges, this.bio, this.birthDate, this.gender, this.name, this.photos, this.jobs, this.schools);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_CoreUser(String str, List<Badge> list, @Nullable String str2, @Nullable DateTime dateTime, Gender gender, String str3, List<Photo> list2, List<Job> list3, List<School> list4) {
        this.id = str;
        this.badges = list;
        this.bio = str2;
        this.birthDate = dateTime;
        this.gender = gender;
        this.name = str3;
        this.photos = list2;
        this.jobs = list3;
        this.schools = list4;
    }

    @NonNull
    public String id() {
        return this.id;
    }

    @NonNull
    public List<Badge> badges() {
        return this.badges;
    }

    @Nullable
    public String bio() {
        return this.bio;
    }

    @Nullable
    public DateTime birthDate() {
        return this.birthDate;
    }

    @NonNull
    public Gender gender() {
        return this.gender;
    }

    @NonNull
    public String name() {
        return this.name;
    }

    @NonNull
    public List<Photo> photos() {
        return this.photos;
    }

    @NonNull
    public List<Job> jobs() {
        return this.jobs;
    }

    @NonNull
    public List<School> schools() {
        return this.schools;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CoreUser{id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", badges=");
        stringBuilder.append(this.badges);
        stringBuilder.append(", bio=");
        stringBuilder.append(this.bio);
        stringBuilder.append(", birthDate=");
        stringBuilder.append(this.birthDate);
        stringBuilder.append(", gender=");
        stringBuilder.append(this.gender);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", photos=");
        stringBuilder.append(this.photos);
        stringBuilder.append(", jobs=");
        stringBuilder.append(this.jobs);
        stringBuilder.append(", schools=");
        stringBuilder.append(this.schools);
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
        r1 = r5 instanceof com.tinder.domain.meta.model.CoreUser;
        r2 = 0;
        if (r1 == 0) goto L_0x0090;
    L_0x0009:
        r5 = (com.tinder.domain.meta.model.CoreUser) r5;
        r1 = r4.id;
        r3 = r5.id();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008e;
    L_0x0017:
        r1 = r4.badges;
        r3 = r5.badges();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008e;
    L_0x0023:
        r1 = r4.bio;
        if (r1 != 0) goto L_0x002e;
    L_0x0027:
        r1 = r5.bio();
        if (r1 != 0) goto L_0x008e;
    L_0x002d:
        goto L_0x003a;
    L_0x002e:
        r1 = r4.bio;
        r3 = r5.bio();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008e;
    L_0x003a:
        r1 = r4.birthDate;
        if (r1 != 0) goto L_0x0045;
    L_0x003e:
        r1 = r5.birthDate();
        if (r1 != 0) goto L_0x008e;
    L_0x0044:
        goto L_0x0051;
    L_0x0045:
        r1 = r4.birthDate;
        r3 = r5.birthDate();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008e;
    L_0x0051:
        r1 = r4.gender;
        r3 = r5.gender();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008e;
    L_0x005d:
        r1 = r4.name;
        r3 = r5.name();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008e;
    L_0x0069:
        r1 = r4.photos;
        r3 = r5.photos();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008e;
    L_0x0075:
        r1 = r4.jobs;
        r3 = r5.jobs();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008e;
    L_0x0081:
        r1 = r4.schools;
        r5 = r5.schools();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x008e;
    L_0x008d:
        goto L_0x008f;
    L_0x008e:
        r0 = 0;
    L_0x008f:
        return r0;
    L_0x0090:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.domain.meta.model.AutoValue_CoreUser.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((this.id.hashCode() ^ 1000003) * 1000003) ^ this.badges.hashCode()) * 1000003) ^ (this.bio == null ? 0 : this.bio.hashCode())) * 1000003;
        if (this.birthDate != null) {
            i = this.birthDate.hashCode();
        }
        return ((((((((((hashCode ^ i) * 1000003) ^ this.gender.hashCode()) * 1000003) ^ this.name.hashCode()) * 1000003) ^ this.photos.hashCode()) * 1000003) ^ this.jobs.hashCode()) * 1000003) ^ this.schools.hashCode();
    }

    public com.tinder.domain.meta.model.CoreUser.Builder toBuilder() {
        return new Builder(this);
    }
}
