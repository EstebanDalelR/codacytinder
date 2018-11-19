package com.tinder.api.model.common;

import com.squareup.moshi.Json;
import com.tinder.api.model.common.User.Location;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: com.tinder.api.model.common.$AutoValue_User */
abstract class C$AutoValue_User extends User {
    private final String activeTime;
    private final Integer ageFilterMax;
    private final Integer ageFilterMin;
    private final String apiToken;
    private final List<Badge> badges;
    private final String bio;
    private final String birthDate;
    private final String blend;
    private final List<CommonConnection> commonConnections;
    private final List<Interest> commonInterests;
    private final Integer connectionCount;
    private final String contentHash;
    private final String createDate;
    private final String customGender;
    private final Boolean deactivated;
    private final Boolean discoverable;
    private final String discoverableParty;
    private final Integer distanceFilter;
    private final Integer distanceMi;
    private final String fulleName;
    private final Integer gender;
    private final Integer genderFilter;
    private final Boolean hideAds;
    private final Boolean hideAge;
    private final Boolean hideDistance;
    private final String id;
    private final Instagram instagram;
    private final List<Integer> interestedIn;
    private final List<Interest> interests;
    private final Boolean isNew;
    private final Boolean isVerified;
    private final List<Job> jobs;
    private final Location location;
    private final String locationName;
    private final String locationProximity;
    private final String name;
    private final String phoneNumber;
    private final Boolean photoOptimizerEnabled;
    private final Boolean photoOptimizerResult;
    private final List<Photo> photos;
    private final Boolean photosProcessing;
    private final String pingTime;
    private final List<School> schools;
    private final Boolean showGenderOnProfile;
    private final Boolean spotifyAnthem;
    private final Boolean spotifyConnected;
    private final SpotifyThemeTrack spotifyThemeTrack;
    private final List<SpotifyArtist> spotifyTopArtists;
    private final String username;

    C$AutoValue_User(String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2, @Nullable String str3, @Nullable String str4, String str5, @Nullable String str6, @Nullable String str7, @Nullable Boolean bool, @Nullable List<Interest> list, @Nullable List<Interest> list2, @Nullable Integer num3, @Nullable Integer num4, @Nullable String str8, @Nullable String str9, @Nullable Integer num5, @Nullable Integer num6, @Nullable String str10, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable List<Photo> list3, @Nullable String str11, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable SpotifyThemeTrack spotifyThemeTrack, @Nullable List<SpotifyArtist> list4, @Nullable List<Badge> list5, @Nullable List<Job> list6, @Nullable List<School> list7, @Nullable String str12, @Nullable Boolean bool6, @Nullable Boolean bool7, @Nullable String str13, @Nullable Boolean bool8, @Nullable Boolean bool9, @Nullable List<Integer> list8, @Nullable String str14, @Nullable String str15, @Nullable Location location, @Nullable Boolean bool10, @Nullable Boolean bool11, @Nullable String str16, @Nullable Integer num7, @Nullable List<CommonConnection> list9, @Nullable Boolean bool12, @Nullable Instagram instagram, @Nullable String str17, @Nullable Boolean bool13) {
        User user = this;
        String str18 = str;
        String str19 = str5;
        if (str18 == null) {
            throw new NullPointerException("Null id");
        }
        user.id = str18;
        user.activeTime = str2;
        user.ageFilterMax = num;
        user.ageFilterMin = num2;
        user.apiToken = str3;
        user.bio = str4;
        if (str19 == null) {
            throw new NullPointerException("Null birthDate");
        }
        user.birthDate = str19;
        user.blend = str6;
        user.createDate = str7;
        user.discoverable = bool;
        user.interests = list;
        user.commonInterests = list2;
        user.distanceFilter = num3;
        user.distanceMi = num4;
        user.name = str8;
        user.fulleName = str9;
        user.gender = num5;
        user.genderFilter = num6;
        user.customGender = str10;
        user.showGenderOnProfile = bool2;
        user.photosProcessing = bool3;
        user.photos = list3;
        user.pingTime = str11;
        user.spotifyConnected = bool4;
        user.spotifyAnthem = bool5;
        user.spotifyThemeTrack = spotifyThemeTrack;
        user.spotifyTopArtists = list4;
        user.badges = list5;
        user.jobs = list6;
        user.schools = list7;
        user.username = str12;
        user.photoOptimizerEnabled = bool6;
        user.photoOptimizerResult = bool7;
        user.discoverableParty = str13;
        user.hideAds = bool8;
        user.hideAge = bool9;
        user.interestedIn = list8;
        user.locationName = str14;
        user.locationProximity = str15;
        user.location = location;
        user.isVerified = bool10;
        user.isNew = bool11;
        user.contentHash = str16;
        user.connectionCount = num7;
        user.commonConnections = list9;
        user.hideDistance = bool12;
        user.instagram = instagram;
        user.phoneNumber = str17;
        user.deactivated = bool13;
    }

    @Json(name = "_id")
    public String id() {
        return this.id;
    }

    @Nullable
    @Json(name = "active_time")
    public String activeTime() {
        return this.activeTime;
    }

    @Nullable
    @Json(name = "age_filter_max")
    public Integer ageFilterMax() {
        return this.ageFilterMax;
    }

    @Nullable
    @Json(name = "age_filter_min")
    public Integer ageFilterMin() {
        return this.ageFilterMin;
    }

    @Nullable
    @Json(name = "api_token")
    public String apiToken() {
        return this.apiToken;
    }

    @Nullable
    @Json(name = "bio")
    public String bio() {
        return this.bio;
    }

    @Json(name = "birth_date")
    public String birthDate() {
        return this.birthDate;
    }

    @Nullable
    public String blend() {
        return this.blend;
    }

    @Nullable
    @Json(name = "create_date")
    public String createDate() {
        return this.createDate;
    }

    @Nullable
    @Json(name = "discoverable")
    public Boolean discoverable() {
        return this.discoverable;
    }

    @Nullable
    @Json(name = "interests")
    public List<Interest> interests() {
        return this.interests;
    }

    @Nullable
    @Json(name = "common_interests")
    public List<Interest> commonInterests() {
        return this.commonInterests;
    }

    @Nullable
    @Json(name = "distance_filter")
    public Integer distanceFilter() {
        return this.distanceFilter;
    }

    @Nullable
    @Json(name = "distance_mi")
    public Integer distanceMi() {
        return this.distanceMi;
    }

    @Nullable
    @Json(name = "name")
    public String name() {
        return this.name;
    }

    @Nullable
    @Json(name = "full_name")
    public String fulleName() {
        return this.fulleName;
    }

    @Nullable
    public Integer gender() {
        return this.gender;
    }

    @Nullable
    @Json(name = "gender_filter")
    public Integer genderFilter() {
        return this.genderFilter;
    }

    @Nullable
    @Json(name = "custom_gender")
    public String customGender() {
        return this.customGender;
    }

    @Nullable
    @Json(name = "show_gender_on_profile")
    public Boolean showGenderOnProfile() {
        return this.showGenderOnProfile;
    }

    @Nullable
    @Json(name = "photos_processing")
    public Boolean photosProcessing() {
        return this.photosProcessing;
    }

    @Nullable
    @Json(name = "photos")
    public List<Photo> photos() {
        return this.photos;
    }

    @Nullable
    @Json(name = "ping_time")
    public String pingTime() {
        return this.pingTime;
    }

    @Nullable
    @Json(name = "spotify_connected")
    public Boolean spotifyConnected() {
        return this.spotifyConnected;
    }

    @Nullable
    @Json(name = "spotify_anthem")
    public Boolean spotifyAnthem() {
        return this.spotifyAnthem;
    }

    @Nullable
    @Json(name = "spotify_theme_track")
    public SpotifyThemeTrack spotifyThemeTrack() {
        return this.spotifyThemeTrack;
    }

    @Nullable
    @Json(name = "spotify_top_artists")
    public List<SpotifyArtist> spotifyTopArtists() {
        return this.spotifyTopArtists;
    }

    @Nullable
    @Json(name = "badges")
    public List<Badge> badges() {
        return this.badges;
    }

    @Nullable
    @Json(name = "jobs")
    public List<Job> jobs() {
        return this.jobs;
    }

    @Nullable
    @Json(name = "schools")
    public List<School> schools() {
        return this.schools;
    }

    @Nullable
    @Json(name = "username")
    public String username() {
        return this.username;
    }

    @Nullable
    @Json(name = "photo_optimizer_enabled")
    public Boolean photoOptimizerEnabled() {
        return this.photoOptimizerEnabled;
    }

    @Nullable
    @Json(name = "photo_optimizer_has_result")
    public Boolean photoOptimizerResult() {
        return this.photoOptimizerResult;
    }

    @Nullable
    @Json(name = "discoverable_party")
    public String discoverableParty() {
        return this.discoverableParty;
    }

    @Nullable
    @Json(name = "hide_ads")
    public Boolean hideAds() {
        return this.hideAds;
    }

    @Nullable
    @Json(name = "hide_age")
    public Boolean hideAge() {
        return this.hideAge;
    }

    @Nullable
    @Json(name = "interested_in")
    public List<Integer> interestedIn() {
        return this.interestedIn;
    }

    @Nullable
    @Json(name = "location_name")
    public String locationName() {
        return this.locationName;
    }

    @Nullable
    @Json(name = "location_proximity")
    public String locationProximity() {
        return this.locationProximity;
    }

    @Nullable
    @Json(name = "location")
    public Location location() {
        return this.location;
    }

    @Nullable
    @Json(name = "is_verified")
    public Boolean isVerified() {
        return this.isVerified;
    }

    @Nullable
    @Json(name = "is_new_user")
    public Boolean isNew() {
        return this.isNew;
    }

    @Nullable
    @Json(name = "content_hash")
    public String contentHash() {
        return this.contentHash;
    }

    @Nullable
    @Json(name = "connection_count")
    public Integer connectionCount() {
        return this.connectionCount;
    }

    @Nullable
    @Json(name = "common_connections")
    public List<CommonConnection> commonConnections() {
        return this.commonConnections;
    }

    @Nullable
    @Json(name = "hide_distance")
    public Boolean hideDistance() {
        return this.hideDistance;
    }

    @Nullable
    @Json(name = "instagram")
    public Instagram instagram() {
        return this.instagram;
    }

    @Nullable
    @Json(name = "phone_id")
    public String phoneNumber() {
        return this.phoneNumber;
    }

    @Nullable
    @Json(name = "deactivated")
    public Boolean deactivated() {
        return this.deactivated;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("User{id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", activeTime=");
        stringBuilder.append(this.activeTime);
        stringBuilder.append(", ageFilterMax=");
        stringBuilder.append(this.ageFilterMax);
        stringBuilder.append(", ageFilterMin=");
        stringBuilder.append(this.ageFilterMin);
        stringBuilder.append(", apiToken=");
        stringBuilder.append(this.apiToken);
        stringBuilder.append(", bio=");
        stringBuilder.append(this.bio);
        stringBuilder.append(", birthDate=");
        stringBuilder.append(this.birthDate);
        stringBuilder.append(", blend=");
        stringBuilder.append(this.blend);
        stringBuilder.append(", createDate=");
        stringBuilder.append(this.createDate);
        stringBuilder.append(", discoverable=");
        stringBuilder.append(this.discoverable);
        stringBuilder.append(", interests=");
        stringBuilder.append(this.interests);
        stringBuilder.append(", commonInterests=");
        stringBuilder.append(this.commonInterests);
        stringBuilder.append(", distanceFilter=");
        stringBuilder.append(this.distanceFilter);
        stringBuilder.append(", distanceMi=");
        stringBuilder.append(this.distanceMi);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", fulleName=");
        stringBuilder.append(this.fulleName);
        stringBuilder.append(", gender=");
        stringBuilder.append(this.gender);
        stringBuilder.append(", genderFilter=");
        stringBuilder.append(this.genderFilter);
        stringBuilder.append(", customGender=");
        stringBuilder.append(this.customGender);
        stringBuilder.append(", showGenderOnProfile=");
        stringBuilder.append(this.showGenderOnProfile);
        stringBuilder.append(", photosProcessing=");
        stringBuilder.append(this.photosProcessing);
        stringBuilder.append(", photos=");
        stringBuilder.append(this.photos);
        stringBuilder.append(", pingTime=");
        stringBuilder.append(this.pingTime);
        stringBuilder.append(", spotifyConnected=");
        stringBuilder.append(this.spotifyConnected);
        stringBuilder.append(", spotifyAnthem=");
        stringBuilder.append(this.spotifyAnthem);
        stringBuilder.append(", spotifyThemeTrack=");
        stringBuilder.append(this.spotifyThemeTrack);
        stringBuilder.append(", spotifyTopArtists=");
        stringBuilder.append(this.spotifyTopArtists);
        stringBuilder.append(", badges=");
        stringBuilder.append(this.badges);
        stringBuilder.append(", jobs=");
        stringBuilder.append(this.jobs);
        stringBuilder.append(", schools=");
        stringBuilder.append(this.schools);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", photoOptimizerEnabled=");
        stringBuilder.append(this.photoOptimizerEnabled);
        stringBuilder.append(", photoOptimizerResult=");
        stringBuilder.append(this.photoOptimizerResult);
        stringBuilder.append(", discoverableParty=");
        stringBuilder.append(this.discoverableParty);
        stringBuilder.append(", hideAds=");
        stringBuilder.append(this.hideAds);
        stringBuilder.append(", hideAge=");
        stringBuilder.append(this.hideAge);
        stringBuilder.append(", interestedIn=");
        stringBuilder.append(this.interestedIn);
        stringBuilder.append(", locationName=");
        stringBuilder.append(this.locationName);
        stringBuilder.append(", locationProximity=");
        stringBuilder.append(this.locationProximity);
        stringBuilder.append(", location=");
        stringBuilder.append(this.location);
        stringBuilder.append(", isVerified=");
        stringBuilder.append(this.isVerified);
        stringBuilder.append(", isNew=");
        stringBuilder.append(this.isNew);
        stringBuilder.append(", contentHash=");
        stringBuilder.append(this.contentHash);
        stringBuilder.append(", connectionCount=");
        stringBuilder.append(this.connectionCount);
        stringBuilder.append(", commonConnections=");
        stringBuilder.append(this.commonConnections);
        stringBuilder.append(", hideDistance=");
        stringBuilder.append(this.hideDistance);
        stringBuilder.append(", instagram=");
        stringBuilder.append(this.instagram);
        stringBuilder.append(", phoneNumber=");
        stringBuilder.append(this.phoneNumber);
        stringBuilder.append(", deactivated=");
        stringBuilder.append(this.deactivated);
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
        r1 = r5 instanceof com.tinder.api.model.common.User;
        r2 = 0;
        if (r1 == 0) goto L_0x045f;
    L_0x0009:
        r5 = (com.tinder.api.model.common.User) r5;
        r1 = r4.id;
        r3 = r5.id();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x0017:
        r1 = r4.activeTime;
        if (r1 != 0) goto L_0x0022;
    L_0x001b:
        r1 = r5.activeTime();
        if (r1 != 0) goto L_0x045d;
    L_0x0021:
        goto L_0x002e;
    L_0x0022:
        r1 = r4.activeTime;
        r3 = r5.activeTime();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x002e:
        r1 = r4.ageFilterMax;
        if (r1 != 0) goto L_0x0039;
    L_0x0032:
        r1 = r5.ageFilterMax();
        if (r1 != 0) goto L_0x045d;
    L_0x0038:
        goto L_0x0045;
    L_0x0039:
        r1 = r4.ageFilterMax;
        r3 = r5.ageFilterMax();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x0045:
        r1 = r4.ageFilterMin;
        if (r1 != 0) goto L_0x0050;
    L_0x0049:
        r1 = r5.ageFilterMin();
        if (r1 != 0) goto L_0x045d;
    L_0x004f:
        goto L_0x005c;
    L_0x0050:
        r1 = r4.ageFilterMin;
        r3 = r5.ageFilterMin();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x005c:
        r1 = r4.apiToken;
        if (r1 != 0) goto L_0x0067;
    L_0x0060:
        r1 = r5.apiToken();
        if (r1 != 0) goto L_0x045d;
    L_0x0066:
        goto L_0x0073;
    L_0x0067:
        r1 = r4.apiToken;
        r3 = r5.apiToken();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x0073:
        r1 = r4.bio;
        if (r1 != 0) goto L_0x007e;
    L_0x0077:
        r1 = r5.bio();
        if (r1 != 0) goto L_0x045d;
    L_0x007d:
        goto L_0x008a;
    L_0x007e:
        r1 = r4.bio;
        r3 = r5.bio();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x008a:
        r1 = r4.birthDate;
        r3 = r5.birthDate();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x0096:
        r1 = r4.blend;
        if (r1 != 0) goto L_0x00a1;
    L_0x009a:
        r1 = r5.blend();
        if (r1 != 0) goto L_0x045d;
    L_0x00a0:
        goto L_0x00ad;
    L_0x00a1:
        r1 = r4.blend;
        r3 = r5.blend();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x00ad:
        r1 = r4.createDate;
        if (r1 != 0) goto L_0x00b8;
    L_0x00b1:
        r1 = r5.createDate();
        if (r1 != 0) goto L_0x045d;
    L_0x00b7:
        goto L_0x00c4;
    L_0x00b8:
        r1 = r4.createDate;
        r3 = r5.createDate();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x00c4:
        r1 = r4.discoverable;
        if (r1 != 0) goto L_0x00cf;
    L_0x00c8:
        r1 = r5.discoverable();
        if (r1 != 0) goto L_0x045d;
    L_0x00ce:
        goto L_0x00db;
    L_0x00cf:
        r1 = r4.discoverable;
        r3 = r5.discoverable();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x00db:
        r1 = r4.interests;
        if (r1 != 0) goto L_0x00e6;
    L_0x00df:
        r1 = r5.interests();
        if (r1 != 0) goto L_0x045d;
    L_0x00e5:
        goto L_0x00f2;
    L_0x00e6:
        r1 = r4.interests;
        r3 = r5.interests();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x00f2:
        r1 = r4.commonInterests;
        if (r1 != 0) goto L_0x00fd;
    L_0x00f6:
        r1 = r5.commonInterests();
        if (r1 != 0) goto L_0x045d;
    L_0x00fc:
        goto L_0x0109;
    L_0x00fd:
        r1 = r4.commonInterests;
        r3 = r5.commonInterests();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x0109:
        r1 = r4.distanceFilter;
        if (r1 != 0) goto L_0x0114;
    L_0x010d:
        r1 = r5.distanceFilter();
        if (r1 != 0) goto L_0x045d;
    L_0x0113:
        goto L_0x0120;
    L_0x0114:
        r1 = r4.distanceFilter;
        r3 = r5.distanceFilter();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x0120:
        r1 = r4.distanceMi;
        if (r1 != 0) goto L_0x012b;
    L_0x0124:
        r1 = r5.distanceMi();
        if (r1 != 0) goto L_0x045d;
    L_0x012a:
        goto L_0x0137;
    L_0x012b:
        r1 = r4.distanceMi;
        r3 = r5.distanceMi();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x0137:
        r1 = r4.name;
        if (r1 != 0) goto L_0x0142;
    L_0x013b:
        r1 = r5.name();
        if (r1 != 0) goto L_0x045d;
    L_0x0141:
        goto L_0x014e;
    L_0x0142:
        r1 = r4.name;
        r3 = r5.name();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x014e:
        r1 = r4.fulleName;
        if (r1 != 0) goto L_0x0159;
    L_0x0152:
        r1 = r5.fulleName();
        if (r1 != 0) goto L_0x045d;
    L_0x0158:
        goto L_0x0165;
    L_0x0159:
        r1 = r4.fulleName;
        r3 = r5.fulleName();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x0165:
        r1 = r4.gender;
        if (r1 != 0) goto L_0x0170;
    L_0x0169:
        r1 = r5.gender();
        if (r1 != 0) goto L_0x045d;
    L_0x016f:
        goto L_0x017c;
    L_0x0170:
        r1 = r4.gender;
        r3 = r5.gender();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x017c:
        r1 = r4.genderFilter;
        if (r1 != 0) goto L_0x0187;
    L_0x0180:
        r1 = r5.genderFilter();
        if (r1 != 0) goto L_0x045d;
    L_0x0186:
        goto L_0x0193;
    L_0x0187:
        r1 = r4.genderFilter;
        r3 = r5.genderFilter();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x0193:
        r1 = r4.customGender;
        if (r1 != 0) goto L_0x019e;
    L_0x0197:
        r1 = r5.customGender();
        if (r1 != 0) goto L_0x045d;
    L_0x019d:
        goto L_0x01aa;
    L_0x019e:
        r1 = r4.customGender;
        r3 = r5.customGender();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x01aa:
        r1 = r4.showGenderOnProfile;
        if (r1 != 0) goto L_0x01b5;
    L_0x01ae:
        r1 = r5.showGenderOnProfile();
        if (r1 != 0) goto L_0x045d;
    L_0x01b4:
        goto L_0x01c1;
    L_0x01b5:
        r1 = r4.showGenderOnProfile;
        r3 = r5.showGenderOnProfile();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x01c1:
        r1 = r4.photosProcessing;
        if (r1 != 0) goto L_0x01cc;
    L_0x01c5:
        r1 = r5.photosProcessing();
        if (r1 != 0) goto L_0x045d;
    L_0x01cb:
        goto L_0x01d8;
    L_0x01cc:
        r1 = r4.photosProcessing;
        r3 = r5.photosProcessing();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x01d8:
        r1 = r4.photos;
        if (r1 != 0) goto L_0x01e3;
    L_0x01dc:
        r1 = r5.photos();
        if (r1 != 0) goto L_0x045d;
    L_0x01e2:
        goto L_0x01ef;
    L_0x01e3:
        r1 = r4.photos;
        r3 = r5.photos();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x01ef:
        r1 = r4.pingTime;
        if (r1 != 0) goto L_0x01fa;
    L_0x01f3:
        r1 = r5.pingTime();
        if (r1 != 0) goto L_0x045d;
    L_0x01f9:
        goto L_0x0206;
    L_0x01fa:
        r1 = r4.pingTime;
        r3 = r5.pingTime();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x0206:
        r1 = r4.spotifyConnected;
        if (r1 != 0) goto L_0x0211;
    L_0x020a:
        r1 = r5.spotifyConnected();
        if (r1 != 0) goto L_0x045d;
    L_0x0210:
        goto L_0x021d;
    L_0x0211:
        r1 = r4.spotifyConnected;
        r3 = r5.spotifyConnected();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x021d:
        r1 = r4.spotifyAnthem;
        if (r1 != 0) goto L_0x0228;
    L_0x0221:
        r1 = r5.spotifyAnthem();
        if (r1 != 0) goto L_0x045d;
    L_0x0227:
        goto L_0x0234;
    L_0x0228:
        r1 = r4.spotifyAnthem;
        r3 = r5.spotifyAnthem();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x0234:
        r1 = r4.spotifyThemeTrack;
        if (r1 != 0) goto L_0x023f;
    L_0x0238:
        r1 = r5.spotifyThemeTrack();
        if (r1 != 0) goto L_0x045d;
    L_0x023e:
        goto L_0x024b;
    L_0x023f:
        r1 = r4.spotifyThemeTrack;
        r3 = r5.spotifyThemeTrack();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x024b:
        r1 = r4.spotifyTopArtists;
        if (r1 != 0) goto L_0x0256;
    L_0x024f:
        r1 = r5.spotifyTopArtists();
        if (r1 != 0) goto L_0x045d;
    L_0x0255:
        goto L_0x0262;
    L_0x0256:
        r1 = r4.spotifyTopArtists;
        r3 = r5.spotifyTopArtists();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x0262:
        r1 = r4.badges;
        if (r1 != 0) goto L_0x026d;
    L_0x0266:
        r1 = r5.badges();
        if (r1 != 0) goto L_0x045d;
    L_0x026c:
        goto L_0x0279;
    L_0x026d:
        r1 = r4.badges;
        r3 = r5.badges();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x0279:
        r1 = r4.jobs;
        if (r1 != 0) goto L_0x0284;
    L_0x027d:
        r1 = r5.jobs();
        if (r1 != 0) goto L_0x045d;
    L_0x0283:
        goto L_0x0290;
    L_0x0284:
        r1 = r4.jobs;
        r3 = r5.jobs();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x0290:
        r1 = r4.schools;
        if (r1 != 0) goto L_0x029b;
    L_0x0294:
        r1 = r5.schools();
        if (r1 != 0) goto L_0x045d;
    L_0x029a:
        goto L_0x02a7;
    L_0x029b:
        r1 = r4.schools;
        r3 = r5.schools();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x02a7:
        r1 = r4.username;
        if (r1 != 0) goto L_0x02b2;
    L_0x02ab:
        r1 = r5.username();
        if (r1 != 0) goto L_0x045d;
    L_0x02b1:
        goto L_0x02be;
    L_0x02b2:
        r1 = r4.username;
        r3 = r5.username();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x02be:
        r1 = r4.photoOptimizerEnabled;
        if (r1 != 0) goto L_0x02c9;
    L_0x02c2:
        r1 = r5.photoOptimizerEnabled();
        if (r1 != 0) goto L_0x045d;
    L_0x02c8:
        goto L_0x02d5;
    L_0x02c9:
        r1 = r4.photoOptimizerEnabled;
        r3 = r5.photoOptimizerEnabled();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x02d5:
        r1 = r4.photoOptimizerResult;
        if (r1 != 0) goto L_0x02e0;
    L_0x02d9:
        r1 = r5.photoOptimizerResult();
        if (r1 != 0) goto L_0x045d;
    L_0x02df:
        goto L_0x02ec;
    L_0x02e0:
        r1 = r4.photoOptimizerResult;
        r3 = r5.photoOptimizerResult();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x02ec:
        r1 = r4.discoverableParty;
        if (r1 != 0) goto L_0x02f7;
    L_0x02f0:
        r1 = r5.discoverableParty();
        if (r1 != 0) goto L_0x045d;
    L_0x02f6:
        goto L_0x0303;
    L_0x02f7:
        r1 = r4.discoverableParty;
        r3 = r5.discoverableParty();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x0303:
        r1 = r4.hideAds;
        if (r1 != 0) goto L_0x030e;
    L_0x0307:
        r1 = r5.hideAds();
        if (r1 != 0) goto L_0x045d;
    L_0x030d:
        goto L_0x031a;
    L_0x030e:
        r1 = r4.hideAds;
        r3 = r5.hideAds();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x031a:
        r1 = r4.hideAge;
        if (r1 != 0) goto L_0x0325;
    L_0x031e:
        r1 = r5.hideAge();
        if (r1 != 0) goto L_0x045d;
    L_0x0324:
        goto L_0x0331;
    L_0x0325:
        r1 = r4.hideAge;
        r3 = r5.hideAge();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x0331:
        r1 = r4.interestedIn;
        if (r1 != 0) goto L_0x033c;
    L_0x0335:
        r1 = r5.interestedIn();
        if (r1 != 0) goto L_0x045d;
    L_0x033b:
        goto L_0x0348;
    L_0x033c:
        r1 = r4.interestedIn;
        r3 = r5.interestedIn();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x0348:
        r1 = r4.locationName;
        if (r1 != 0) goto L_0x0353;
    L_0x034c:
        r1 = r5.locationName();
        if (r1 != 0) goto L_0x045d;
    L_0x0352:
        goto L_0x035f;
    L_0x0353:
        r1 = r4.locationName;
        r3 = r5.locationName();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x035f:
        r1 = r4.locationProximity;
        if (r1 != 0) goto L_0x036a;
    L_0x0363:
        r1 = r5.locationProximity();
        if (r1 != 0) goto L_0x045d;
    L_0x0369:
        goto L_0x0376;
    L_0x036a:
        r1 = r4.locationProximity;
        r3 = r5.locationProximity();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x0376:
        r1 = r4.location;
        if (r1 != 0) goto L_0x0381;
    L_0x037a:
        r1 = r5.location();
        if (r1 != 0) goto L_0x045d;
    L_0x0380:
        goto L_0x038d;
    L_0x0381:
        r1 = r4.location;
        r3 = r5.location();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x038d:
        r1 = r4.isVerified;
        if (r1 != 0) goto L_0x0398;
    L_0x0391:
        r1 = r5.isVerified();
        if (r1 != 0) goto L_0x045d;
    L_0x0397:
        goto L_0x03a4;
    L_0x0398:
        r1 = r4.isVerified;
        r3 = r5.isVerified();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x03a4:
        r1 = r4.isNew;
        if (r1 != 0) goto L_0x03af;
    L_0x03a8:
        r1 = r5.isNew();
        if (r1 != 0) goto L_0x045d;
    L_0x03ae:
        goto L_0x03bb;
    L_0x03af:
        r1 = r4.isNew;
        r3 = r5.isNew();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x03bb:
        r1 = r4.contentHash;
        if (r1 != 0) goto L_0x03c6;
    L_0x03bf:
        r1 = r5.contentHash();
        if (r1 != 0) goto L_0x045d;
    L_0x03c5:
        goto L_0x03d2;
    L_0x03c6:
        r1 = r4.contentHash;
        r3 = r5.contentHash();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x03d2:
        r1 = r4.connectionCount;
        if (r1 != 0) goto L_0x03dd;
    L_0x03d6:
        r1 = r5.connectionCount();
        if (r1 != 0) goto L_0x045d;
    L_0x03dc:
        goto L_0x03e9;
    L_0x03dd:
        r1 = r4.connectionCount;
        r3 = r5.connectionCount();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x03e9:
        r1 = r4.commonConnections;
        if (r1 != 0) goto L_0x03f4;
    L_0x03ed:
        r1 = r5.commonConnections();
        if (r1 != 0) goto L_0x045d;
    L_0x03f3:
        goto L_0x0400;
    L_0x03f4:
        r1 = r4.commonConnections;
        r3 = r5.commonConnections();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x0400:
        r1 = r4.hideDistance;
        if (r1 != 0) goto L_0x040b;
    L_0x0404:
        r1 = r5.hideDistance();
        if (r1 != 0) goto L_0x045d;
    L_0x040a:
        goto L_0x0417;
    L_0x040b:
        r1 = r4.hideDistance;
        r3 = r5.hideDistance();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x0417:
        r1 = r4.instagram;
        if (r1 != 0) goto L_0x0422;
    L_0x041b:
        r1 = r5.instagram();
        if (r1 != 0) goto L_0x045d;
    L_0x0421:
        goto L_0x042e;
    L_0x0422:
        r1 = r4.instagram;
        r3 = r5.instagram();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x042e:
        r1 = r4.phoneNumber;
        if (r1 != 0) goto L_0x0439;
    L_0x0432:
        r1 = r5.phoneNumber();
        if (r1 != 0) goto L_0x045d;
    L_0x0438:
        goto L_0x0445;
    L_0x0439:
        r1 = r4.phoneNumber;
        r3 = r5.phoneNumber();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x045d;
    L_0x0445:
        r1 = r4.deactivated;
        if (r1 != 0) goto L_0x0450;
    L_0x0449:
        r5 = r5.deactivated();
        if (r5 != 0) goto L_0x045d;
    L_0x044f:
        goto L_0x045e;
    L_0x0450:
        r1 = r4.deactivated;
        r5 = r5.deactivated();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x045d;
    L_0x045c:
        goto L_0x045e;
    L_0x045d:
        r0 = 0;
    L_0x045e:
        return r0;
    L_0x045f:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.common.$AutoValue_User.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.id.hashCode() ^ 1000003) * 1000003) ^ (this.activeTime == null ? 0 : this.activeTime.hashCode())) * 1000003) ^ (this.ageFilterMax == null ? 0 : this.ageFilterMax.hashCode())) * 1000003) ^ (this.ageFilterMin == null ? 0 : this.ageFilterMin.hashCode())) * 1000003) ^ (this.apiToken == null ? 0 : this.apiToken.hashCode())) * 1000003) ^ (this.bio == null ? 0 : this.bio.hashCode())) * 1000003) ^ this.birthDate.hashCode()) * 1000003) ^ (this.blend == null ? 0 : this.blend.hashCode())) * 1000003) ^ (this.createDate == null ? 0 : this.createDate.hashCode())) * 1000003) ^ (this.discoverable == null ? 0 : this.discoverable.hashCode())) * 1000003) ^ (this.interests == null ? 0 : this.interests.hashCode())) * 1000003) ^ (this.commonInterests == null ? 0 : this.commonInterests.hashCode())) * 1000003) ^ (this.distanceFilter == null ? 0 : this.distanceFilter.hashCode())) * 1000003) ^ (this.distanceMi == null ? 0 : this.distanceMi.hashCode())) * 1000003) ^ (this.name == null ? 0 : this.name.hashCode())) * 1000003) ^ (this.fulleName == null ? 0 : this.fulleName.hashCode())) * 1000003) ^ (this.gender == null ? 0 : this.gender.hashCode())) * 1000003) ^ (this.genderFilter == null ? 0 : this.genderFilter.hashCode())) * 1000003) ^ (this.customGender == null ? 0 : this.customGender.hashCode())) * 1000003) ^ (this.showGenderOnProfile == null ? 0 : this.showGenderOnProfile.hashCode())) * 1000003) ^ (this.photosProcessing == null ? 0 : this.photosProcessing.hashCode())) * 1000003) ^ (this.photos == null ? 0 : this.photos.hashCode())) * 1000003) ^ (this.pingTime == null ? 0 : this.pingTime.hashCode())) * 1000003) ^ (this.spotifyConnected == null ? 0 : this.spotifyConnected.hashCode())) * 1000003) ^ (this.spotifyAnthem == null ? 0 : this.spotifyAnthem.hashCode())) * 1000003) ^ (this.spotifyThemeTrack == null ? 0 : this.spotifyThemeTrack.hashCode())) * 1000003) ^ (this.spotifyTopArtists == null ? 0 : this.spotifyTopArtists.hashCode())) * 1000003) ^ (this.badges == null ? 0 : this.badges.hashCode())) * 1000003) ^ (this.jobs == null ? 0 : this.jobs.hashCode())) * 1000003) ^ (this.schools == null ? 0 : this.schools.hashCode())) * 1000003) ^ (this.username == null ? 0 : this.username.hashCode())) * 1000003) ^ (this.photoOptimizerEnabled == null ? 0 : this.photoOptimizerEnabled.hashCode())) * 1000003) ^ (this.photoOptimizerResult == null ? 0 : this.photoOptimizerResult.hashCode())) * 1000003) ^ (this.discoverableParty == null ? 0 : this.discoverableParty.hashCode())) * 1000003) ^ (this.hideAds == null ? 0 : this.hideAds.hashCode())) * 1000003) ^ (this.hideAge == null ? 0 : this.hideAge.hashCode())) * 1000003) ^ (this.interestedIn == null ? 0 : this.interestedIn.hashCode())) * 1000003) ^ (this.locationName == null ? 0 : this.locationName.hashCode())) * 1000003) ^ (this.locationProximity == null ? 0 : this.locationProximity.hashCode())) * 1000003) ^ (this.location == null ? 0 : this.location.hashCode())) * 1000003) ^ (this.isVerified == null ? 0 : this.isVerified.hashCode())) * 1000003) ^ (this.isNew == null ? 0 : this.isNew.hashCode())) * 1000003) ^ (this.contentHash == null ? 0 : this.contentHash.hashCode())) * 1000003) ^ (this.connectionCount == null ? 0 : this.connectionCount.hashCode())) * 1000003) ^ (this.commonConnections == null ? 0 : this.commonConnections.hashCode())) * 1000003) ^ (this.hideDistance == null ? 0 : this.hideDistance.hashCode())) * 1000003) ^ (this.instagram == null ? 0 : this.instagram.hashCode())) * 1000003) ^ (this.phoneNumber == null ? 0 : this.phoneNumber.hashCode())) * 1000003;
        if (this.deactivated != null) {
            i = this.deactivated.hashCode();
        }
        return hashCode ^ i;
    }
}
