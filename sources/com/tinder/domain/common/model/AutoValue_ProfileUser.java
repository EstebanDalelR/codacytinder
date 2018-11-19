package com.tinder.domain.common.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.List;
import org.joda.time.DateTime;

final class AutoValue_ProfileUser extends ProfileUser {
    private final List<Badge> badges;
    private final String bio;
    private final DateTime birthDate;
    private final int connectionCount;
    private final Gender gender;
    private final boolean hideAge;
    private final boolean hideDistance;
    private final String id;
    private final Instagram instagram;
    private final List<Job> jobs;
    private final String name;
    private final List<Photo> photos;
    private final List<School> schools;
    private final boolean showGenderOnProfile;
    private final boolean spotifyConnected;
    private final SpotifyTrack spotifyThemeTrack;
    private final List<SpotifyArtist> spotifyTopArtists;
    private final boolean verified;

    static final class Builder extends com.tinder.domain.common.model.ProfileUser.Builder {
        private List<Badge> badges;
        private String bio;
        private DateTime birthDate;
        private Integer connectionCount;
        private Gender gender;
        private Boolean hideAge;
        private Boolean hideDistance;
        private String id;
        private Instagram instagram;
        private List<Job> jobs;
        private String name;
        private List<Photo> photos;
        private List<School> schools;
        private Boolean showGenderOnProfile;
        private Boolean spotifyConnected;
        private SpotifyTrack spotifyThemeTrack;
        private List<SpotifyArtist> spotifyTopArtists;
        private Boolean verified;

        Builder() {
        }

        Builder(ProfileUser profileUser) {
            this.id = profileUser.id();
            this.badges = profileUser.badges();
            this.bio = profileUser.bio();
            this.birthDate = profileUser.birthDate();
            this.gender = profileUser.gender();
            this.name = profileUser.name();
            this.photos = profileUser.photos();
            this.jobs = profileUser.jobs();
            this.schools = profileUser.schools();
            this.instagram = profileUser.instagram();
            this.spotifyTopArtists = profileUser.spotifyTopArtists();
            this.spotifyThemeTrack = profileUser.spotifyThemeTrack();
            this.spotifyConnected = Boolean.valueOf(profileUser.spotifyConnected());
            this.hideDistance = Boolean.valueOf(profileUser.hideDistance());
            this.hideAge = Boolean.valueOf(profileUser.hideAge());
            this.connectionCount = Integer.valueOf(profileUser.connectionCount());
            this.verified = Boolean.valueOf(profileUser.verified());
            this.showGenderOnProfile = Boolean.valueOf(profileUser.showGenderOnProfile());
        }

        public com.tinder.domain.common.model.ProfileUser.Builder id(String str) {
            this.id = str;
            return this;
        }

        public com.tinder.domain.common.model.ProfileUser.Builder badges(List<Badge> list) {
            this.badges = list;
            return this;
        }

        public com.tinder.domain.common.model.ProfileUser.Builder bio(@Nullable String str) {
            this.bio = str;
            return this;
        }

        public com.tinder.domain.common.model.ProfileUser.Builder birthDate(@Nullable DateTime dateTime) {
            this.birthDate = dateTime;
            return this;
        }

        public com.tinder.domain.common.model.ProfileUser.Builder gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public com.tinder.domain.common.model.ProfileUser.Builder name(String str) {
            this.name = str;
            return this;
        }

        public com.tinder.domain.common.model.ProfileUser.Builder photos(List<Photo> list) {
            this.photos = list;
            return this;
        }

        public com.tinder.domain.common.model.ProfileUser.Builder jobs(List<Job> list) {
            this.jobs = list;
            return this;
        }

        public com.tinder.domain.common.model.ProfileUser.Builder schools(List<School> list) {
            this.schools = list;
            return this;
        }

        public com.tinder.domain.common.model.ProfileUser.Builder instagram(@Nullable Instagram instagram) {
            this.instagram = instagram;
            return this;
        }

        public com.tinder.domain.common.model.ProfileUser.Builder spotifyTopArtists(List<SpotifyArtist> list) {
            this.spotifyTopArtists = list;
            return this;
        }

        public com.tinder.domain.common.model.ProfileUser.Builder spotifyThemeTrack(@Nullable SpotifyTrack spotifyTrack) {
            this.spotifyThemeTrack = spotifyTrack;
            return this;
        }

        public com.tinder.domain.common.model.ProfileUser.Builder spotifyConnected(boolean z) {
            this.spotifyConnected = Boolean.valueOf(z);
            return this;
        }

        public com.tinder.domain.common.model.ProfileUser.Builder hideDistance(boolean z) {
            this.hideDistance = Boolean.valueOf(z);
            return this;
        }

        public com.tinder.domain.common.model.ProfileUser.Builder hideAge(boolean z) {
            this.hideAge = Boolean.valueOf(z);
            return this;
        }

        public com.tinder.domain.common.model.ProfileUser.Builder connectionCount(int i) {
            this.connectionCount = Integer.valueOf(i);
            return this;
        }

        public com.tinder.domain.common.model.ProfileUser.Builder verified(boolean z) {
            this.verified = Boolean.valueOf(z);
            return this;
        }

        public com.tinder.domain.common.model.ProfileUser.Builder showGenderOnProfile(boolean z) {
            this.showGenderOnProfile = Boolean.valueOf(z);
            return this;
        }

        public ProfileUser build() {
            String str = "";
            if (this.id == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" id");
                str = stringBuilder.toString();
            }
            if (r0.badges == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" badges");
                str = stringBuilder.toString();
            }
            if (r0.gender == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" gender");
                str = stringBuilder.toString();
            }
            if (r0.name == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" name");
                str = stringBuilder.toString();
            }
            if (r0.photos == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" photos");
                str = stringBuilder.toString();
            }
            if (r0.jobs == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" jobs");
                str = stringBuilder.toString();
            }
            if (r0.schools == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" schools");
                str = stringBuilder.toString();
            }
            if (r0.spotifyTopArtists == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" spotifyTopArtists");
                str = stringBuilder.toString();
            }
            if (r0.spotifyConnected == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" spotifyConnected");
                str = stringBuilder.toString();
            }
            if (r0.hideDistance == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" hideDistance");
                str = stringBuilder.toString();
            }
            if (r0.hideAge == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" hideAge");
                str = stringBuilder.toString();
            }
            if (r0.connectionCount == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" connectionCount");
                str = stringBuilder.toString();
            }
            if (r0.verified == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" verified");
                str = stringBuilder.toString();
            }
            if (r0.showGenderOnProfile == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" showGenderOnProfile");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_ProfileUser(r0.id, r0.badges, r0.bio, r0.birthDate, r0.gender, r0.name, r0.photos, r0.jobs, r0.schools, r0.instagram, r0.spotifyTopArtists, r0.spotifyThemeTrack, r0.spotifyConnected.booleanValue(), r0.hideDistance.booleanValue(), r0.hideAge.booleanValue(), r0.connectionCount.intValue(), r0.verified.booleanValue(), r0.showGenderOnProfile.booleanValue());
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_ProfileUser(String str, List<Badge> list, @Nullable String str2, @Nullable DateTime dateTime, Gender gender, String str3, List<Photo> list2, List<Job> list3, List<School> list4, @Nullable Instagram instagram, List<SpotifyArtist> list5, @Nullable SpotifyTrack spotifyTrack, boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5) {
        this.id = str;
        this.badges = list;
        this.bio = str2;
        this.birthDate = dateTime;
        this.gender = gender;
        this.name = str3;
        this.photos = list2;
        this.jobs = list3;
        this.schools = list4;
        this.instagram = instagram;
        this.spotifyTopArtists = list5;
        this.spotifyThemeTrack = spotifyTrack;
        this.spotifyConnected = z;
        this.hideDistance = z2;
        this.hideAge = z3;
        this.connectionCount = i;
        this.verified = z4;
        this.showGenderOnProfile = z5;
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

    @Nullable
    public Instagram instagram() {
        return this.instagram;
    }

    @NonNull
    public List<SpotifyArtist> spotifyTopArtists() {
        return this.spotifyTopArtists;
    }

    @Nullable
    public SpotifyTrack spotifyThemeTrack() {
        return this.spotifyThemeTrack;
    }

    public boolean spotifyConnected() {
        return this.spotifyConnected;
    }

    public boolean hideDistance() {
        return this.hideDistance;
    }

    public boolean hideAge() {
        return this.hideAge;
    }

    public int connectionCount() {
        return this.connectionCount;
    }

    public boolean verified() {
        return this.verified;
    }

    public boolean showGenderOnProfile() {
        return this.showGenderOnProfile;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProfileUser{id=");
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
        stringBuilder.append(", instagram=");
        stringBuilder.append(this.instagram);
        stringBuilder.append(", spotifyTopArtists=");
        stringBuilder.append(this.spotifyTopArtists);
        stringBuilder.append(", spotifyThemeTrack=");
        stringBuilder.append(this.spotifyThemeTrack);
        stringBuilder.append(", spotifyConnected=");
        stringBuilder.append(this.spotifyConnected);
        stringBuilder.append(", hideDistance=");
        stringBuilder.append(this.hideDistance);
        stringBuilder.append(", hideAge=");
        stringBuilder.append(this.hideAge);
        stringBuilder.append(", connectionCount=");
        stringBuilder.append(this.connectionCount);
        stringBuilder.append(", verified=");
        stringBuilder.append(this.verified);
        stringBuilder.append(", showGenderOnProfile=");
        stringBuilder.append(this.showGenderOnProfile);
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
        r1 = r5 instanceof com.tinder.domain.common.model.ProfileUser;
        r2 = 0;
        if (r1 == 0) goto L_0x00fa;
    L_0x0009:
        r5 = (com.tinder.domain.common.model.ProfileUser) r5;
        r1 = r4.id;
        r3 = r5.id();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00f8;
    L_0x0017:
        r1 = r4.badges;
        r3 = r5.badges();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00f8;
    L_0x0023:
        r1 = r4.bio;
        if (r1 != 0) goto L_0x002e;
    L_0x0027:
        r1 = r5.bio();
        if (r1 != 0) goto L_0x00f8;
    L_0x002d:
        goto L_0x003a;
    L_0x002e:
        r1 = r4.bio;
        r3 = r5.bio();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00f8;
    L_0x003a:
        r1 = r4.birthDate;
        if (r1 != 0) goto L_0x0045;
    L_0x003e:
        r1 = r5.birthDate();
        if (r1 != 0) goto L_0x00f8;
    L_0x0044:
        goto L_0x0051;
    L_0x0045:
        r1 = r4.birthDate;
        r3 = r5.birthDate();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00f8;
    L_0x0051:
        r1 = r4.gender;
        r3 = r5.gender();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00f8;
    L_0x005d:
        r1 = r4.name;
        r3 = r5.name();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00f8;
    L_0x0069:
        r1 = r4.photos;
        r3 = r5.photos();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00f8;
    L_0x0075:
        r1 = r4.jobs;
        r3 = r5.jobs();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00f8;
    L_0x0081:
        r1 = r4.schools;
        r3 = r5.schools();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00f8;
    L_0x008d:
        r1 = r4.instagram;
        if (r1 != 0) goto L_0x0098;
    L_0x0091:
        r1 = r5.instagram();
        if (r1 != 0) goto L_0x00f8;
    L_0x0097:
        goto L_0x00a4;
    L_0x0098:
        r1 = r4.instagram;
        r3 = r5.instagram();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00f8;
    L_0x00a4:
        r1 = r4.spotifyTopArtists;
        r3 = r5.spotifyTopArtists();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00f8;
    L_0x00b0:
        r1 = r4.spotifyThemeTrack;
        if (r1 != 0) goto L_0x00bb;
    L_0x00b4:
        r1 = r5.spotifyThemeTrack();
        if (r1 != 0) goto L_0x00f8;
    L_0x00ba:
        goto L_0x00c7;
    L_0x00bb:
        r1 = r4.spotifyThemeTrack;
        r3 = r5.spotifyThemeTrack();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00f8;
    L_0x00c7:
        r1 = r4.spotifyConnected;
        r3 = r5.spotifyConnected();
        if (r1 != r3) goto L_0x00f8;
    L_0x00cf:
        r1 = r4.hideDistance;
        r3 = r5.hideDistance();
        if (r1 != r3) goto L_0x00f8;
    L_0x00d7:
        r1 = r4.hideAge;
        r3 = r5.hideAge();
        if (r1 != r3) goto L_0x00f8;
    L_0x00df:
        r1 = r4.connectionCount;
        r3 = r5.connectionCount();
        if (r1 != r3) goto L_0x00f8;
    L_0x00e7:
        r1 = r4.verified;
        r3 = r5.verified();
        if (r1 != r3) goto L_0x00f8;
    L_0x00ef:
        r1 = r4.showGenderOnProfile;
        r5 = r5.showGenderOnProfile();
        if (r1 != r5) goto L_0x00f8;
    L_0x00f7:
        goto L_0x00f9;
    L_0x00f8:
        r0 = 0;
    L_0x00f9:
        return r0;
    L_0x00fa:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.domain.common.model.AutoValue_ProfileUser.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((((((((((this.id.hashCode() ^ 1000003) * 1000003) ^ this.badges.hashCode()) * 1000003) ^ (this.bio == null ? 0 : this.bio.hashCode())) * 1000003) ^ (this.birthDate == null ? 0 : this.birthDate.hashCode())) * 1000003) ^ this.gender.hashCode()) * 1000003) ^ this.name.hashCode()) * 1000003) ^ this.photos.hashCode()) * 1000003) ^ this.jobs.hashCode()) * 1000003) ^ this.schools.hashCode()) * 1000003) ^ (this.instagram == null ? 0 : this.instagram.hashCode())) * 1000003) ^ this.spotifyTopArtists.hashCode()) * 1000003;
        if (this.spotifyThemeTrack != null) {
            i = this.spotifyThemeTrack.hashCode();
        }
        hashCode = (hashCode ^ i) * 1000003;
        i = 1237;
        hashCode = (((((((((hashCode ^ (this.spotifyConnected ? 1231 : 1237)) * 1000003) ^ (this.hideDistance ? 1231 : 1237)) * 1000003) ^ (this.hideAge ? 1231 : 1237)) * 1000003) ^ this.connectionCount) * 1000003) ^ (this.verified ? 1231 : 1237)) * 1000003;
        if (this.showGenderOnProfile) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public com.tinder.domain.common.model.ProfileUser.Builder toBuilder() {
        return new Builder(this);
    }
}
