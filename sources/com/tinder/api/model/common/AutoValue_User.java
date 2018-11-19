package com.tinder.api.model.common;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.C5992r;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.common.User.Location;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

final class AutoValue_User extends C$AutoValue_User {

    public static final class MoshiJsonAdapter extends JsonAdapter<User> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_ID_UNDERSCORE, "active_time", ManagerWebServices.PARAM_AGE_FILTER_MAX, ManagerWebServices.PARAM_AGE_FILTER_MIN, "api_token", ManagerWebServices.PARAM_BIO, ManagerWebServices.PARAM_BIRTH_DATE, ManagerWebServices.PARAM_BLEND, ManagerWebServices.PARAM_CREATE_DATE, ManagerWebServices.PARAM_DISCOVERABLE, ManagerWebServices.PARAM_INTERESTS, ManagerWebServices.PARAM_COMMON_INTERESTS, ManagerWebServices.PARAM_DISTANCE_FILTER, ManagerWebServices.PARAM_DISTANCE_MI, "name", "full_name", "gender", ManagerWebServices.PARAM_GENDER_FILTER, ManagerWebServices.PARAM_CUSTOM_GENDER, ManagerWebServices.PARAM_SHOW_GENDER, ManagerWebServices.PARAM_PROCESSING_PHOTOS, "photos", ManagerWebServices.PARAM_PING_TIME, ManagerWebServices.PARAM_SPOTIFY_CONNECTED, "spotify_anthem", ManagerWebServices.PARAM_SPOTIFY_THEM_TRACK, ManagerWebServices.PARAM_SPOTIFY_TOP_ARTISTS, ManagerWebServices.PARAM_BADGES, ManagerWebServices.PARAM_JOBS, ManagerWebServices.PARAM_SCHOOLS, "username", ManagerWebServices.PARAM_PHOTO_OPTIMIZED, ManagerWebServices.PARAM_PHOTO_OPTIMIZED_RESULTS, ManagerWebServices.PARAM_DISCOVERABILITY, ManagerWebServices.PARAM_HIDE_ADS, ManagerWebServices.PARAM_HIDE_AGE, "interested_in", "location_name", ManagerWebServices.PARAM_LOCATION_PROXIMITY, "location", ManagerWebServices.PARAM_VERIFIED, ManagerWebServices.PARAM_IS_NEW_USER, ManagerWebServices.PARAM_CONTENT_HASH, ManagerWebServices.PARAM_CONNECTION_COUNT, ManagerWebServices.PARAM_COMMON_CONNECTIONS, ManagerWebServices.PARAM_HIDE_DISTANCE, ManagerWebServices.IG_PARAM_INSTAGRAM, ManagerWebServices.PARAM_PHONE_ID, "deactivated"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<String> activeTimeAdapter;
        private final JsonAdapter<Integer> ageFilterMaxAdapter;
        private final JsonAdapter<Integer> ageFilterMinAdapter;
        private final JsonAdapter<String> apiTokenAdapter;
        private final JsonAdapter<List<Badge>> badgesAdapter;
        private final JsonAdapter<String> bioAdapter;
        private final JsonAdapter<String> birthDateAdapter;
        private final JsonAdapter<String> blendAdapter;
        private final JsonAdapter<List<CommonConnection>> commonConnectionsAdapter;
        private final JsonAdapter<List<Interest>> commonInterestsAdapter;
        private final JsonAdapter<Integer> connectionCountAdapter;
        private final JsonAdapter<String> contentHashAdapter;
        private final JsonAdapter<String> createDateAdapter;
        private final JsonAdapter<String> customGenderAdapter;
        private final JsonAdapter<Boolean> deactivatedAdapter;
        private final JsonAdapter<Boolean> discoverableAdapter;
        private final JsonAdapter<String> discoverablePartyAdapter;
        private final JsonAdapter<Integer> distanceFilterAdapter;
        private final JsonAdapter<Integer> distanceMiAdapter;
        private final JsonAdapter<String> fulleNameAdapter;
        private final JsonAdapter<Integer> genderAdapter;
        private final JsonAdapter<Integer> genderFilterAdapter;
        private final JsonAdapter<Boolean> hideAdsAdapter;
        private final JsonAdapter<Boolean> hideAgeAdapter;
        private final JsonAdapter<Boolean> hideDistanceAdapter;
        private final JsonAdapter<String> idAdapter;
        private final JsonAdapter<Instagram> instagramAdapter;
        private final JsonAdapter<List<Integer>> interestedInAdapter;
        private final JsonAdapter<List<Interest>> interestsAdapter;
        private final JsonAdapter<Boolean> isNewAdapter;
        private final JsonAdapter<Boolean> isVerifiedAdapter;
        private final JsonAdapter<List<Job>> jobsAdapter;
        private final JsonAdapter<Location> locationAdapter;
        private final JsonAdapter<String> locationNameAdapter;
        private final JsonAdapter<String> locationProximityAdapter;
        private final JsonAdapter<String> nameAdapter;
        private final JsonAdapter<String> phoneNumberAdapter;
        private final JsonAdapter<Boolean> photoOptimizerEnabledAdapter;
        private final JsonAdapter<Boolean> photoOptimizerResultAdapter;
        private final JsonAdapter<List<Photo>> photosAdapter;
        private final JsonAdapter<Boolean> photosProcessingAdapter;
        private final JsonAdapter<String> pingTimeAdapter;
        private final JsonAdapter<List<School>> schoolsAdapter;
        private final JsonAdapter<Boolean> showGenderOnProfileAdapter;
        private final JsonAdapter<Boolean> spotifyAnthemAdapter;
        private final JsonAdapter<Boolean> spotifyConnectedAdapter;
        private final JsonAdapter<SpotifyThemeTrack> spotifyThemeTrackAdapter;
        private final JsonAdapter<List<SpotifyArtist>> spotifyTopArtistsAdapter;
        private final JsonAdapter<String> usernameAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.idAdapter = c5987p.a(String.class);
            this.activeTimeAdapter = c5987p.a(String.class);
            this.ageFilterMaxAdapter = c5987p.a(Integer.class);
            this.ageFilterMinAdapter = c5987p.a(Integer.class);
            this.apiTokenAdapter = c5987p.a(String.class);
            this.bioAdapter = c5987p.a(String.class);
            this.birthDateAdapter = c5987p.a(String.class);
            this.blendAdapter = c5987p.a(String.class);
            this.createDateAdapter = c5987p.a(String.class);
            this.discoverableAdapter = c5987p.a(Boolean.class);
            this.interestsAdapter = c5987p.a(C5992r.a(List.class, new Type[]{Interest.class}));
            this.commonInterestsAdapter = c5987p.a(C5992r.a(List.class, new Type[]{Interest.class}));
            this.distanceFilterAdapter = c5987p.a(Integer.class);
            this.distanceMiAdapter = c5987p.a(Integer.class);
            this.nameAdapter = c5987p.a(String.class);
            this.fulleNameAdapter = c5987p.a(String.class);
            this.genderAdapter = c5987p.a(Integer.class);
            this.genderFilterAdapter = c5987p.a(Integer.class);
            this.customGenderAdapter = c5987p.a(String.class);
            this.showGenderOnProfileAdapter = c5987p.a(Boolean.class);
            this.photosProcessingAdapter = c5987p.a(Boolean.class);
            this.photosAdapter = c5987p.a(C5992r.a(List.class, new Type[]{Photo.class}));
            this.pingTimeAdapter = c5987p.a(String.class);
            this.spotifyConnectedAdapter = c5987p.a(Boolean.class);
            this.spotifyAnthemAdapter = c5987p.a(Boolean.class);
            this.spotifyThemeTrackAdapter = c5987p.a(SpotifyThemeTrack.class);
            this.spotifyTopArtistsAdapter = c5987p.a(C5992r.a(List.class, new Type[]{SpotifyArtist.class}));
            this.badgesAdapter = c5987p.a(C5992r.a(List.class, new Type[]{Badge.class}));
            this.jobsAdapter = c5987p.a(C5992r.a(List.class, new Type[]{Job.class}));
            this.schoolsAdapter = c5987p.a(C5992r.a(List.class, new Type[]{School.class}));
            this.usernameAdapter = c5987p.a(String.class);
            this.photoOptimizerEnabledAdapter = c5987p.a(Boolean.class);
            this.photoOptimizerResultAdapter = c5987p.a(Boolean.class);
            this.discoverablePartyAdapter = c5987p.a(String.class);
            this.hideAdsAdapter = c5987p.a(Boolean.class);
            this.hideAgeAdapter = c5987p.a(Boolean.class);
            this.interestedInAdapter = c5987p.a(C5992r.a(List.class, new Type[]{Integer.class}));
            this.locationNameAdapter = c5987p.a(String.class);
            this.locationProximityAdapter = c5987p.a(String.class);
            this.locationAdapter = c5987p.a(Location.class);
            this.isVerifiedAdapter = c5987p.a(Boolean.class);
            this.isNewAdapter = c5987p.a(Boolean.class);
            this.contentHashAdapter = c5987p.a(String.class);
            this.connectionCountAdapter = c5987p.a(Integer.class);
            this.commonConnectionsAdapter = c5987p.a(C5992r.a(List.class, new Type[]{CommonConnection.class}));
            this.hideDistanceAdapter = c5987p.a(Boolean.class);
            this.instagramAdapter = c5987p.a(Instagram.class);
            this.phoneNumberAdapter = c5987p.a(String.class);
            this.deactivatedAdapter = c5987p.a(Boolean.class);
        }

        public User fromJson(JsonReader jsonReader) throws IOException {
            MoshiJsonAdapter moshiJsonAdapter = this;
            JsonReader jsonReader2 = jsonReader;
            jsonReader.e();
            String str = null;
            String str2 = str;
            Integer num = str2;
            Integer num2 = num;
            String str3 = num2;
            String str4 = str3;
            String str5 = str4;
            String str6 = str5;
            String str7 = str6;
            Boolean bool = str7;
            List list = bool;
            List list2 = list;
            Integer num3 = list2;
            Integer num4 = num3;
            String str8 = num4;
            String str9 = str8;
            Integer num5 = str9;
            Integer num6 = num5;
            String str10 = num6;
            Boolean bool2 = str10;
            Boolean bool3 = bool2;
            List list3 = bool3;
            String str11 = list3;
            Boolean bool4 = str11;
            Boolean bool5 = bool4;
            SpotifyThemeTrack spotifyThemeTrack = bool5;
            List list4 = spotifyThemeTrack;
            List list5 = list4;
            List list6 = list5;
            List list7 = list6;
            String str12 = list7;
            Boolean bool6 = str12;
            Boolean bool7 = bool6;
            String str13 = bool7;
            Boolean bool8 = str13;
            Boolean bool9 = bool8;
            List list8 = bool9;
            String str14 = list8;
            String str15 = str14;
            Location location = str15;
            Boolean bool10 = location;
            Boolean bool11 = bool10;
            String str16 = bool11;
            Integer num7 = str16;
            List list9 = num7;
            Boolean bool12 = list9;
            Instagram instagram = bool12;
            String str17 = instagram;
            Boolean bool13 = str17;
            while (jsonReader.g()) {
                switch (jsonReader2.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        str = (String) moshiJsonAdapter.idAdapter.fromJson(jsonReader2);
                        break;
                    case 1:
                        str2 = (String) moshiJsonAdapter.activeTimeAdapter.fromJson(jsonReader2);
                        break;
                    case 2:
                        num = (Integer) moshiJsonAdapter.ageFilterMaxAdapter.fromJson(jsonReader2);
                        break;
                    case 3:
                        num2 = (Integer) moshiJsonAdapter.ageFilterMinAdapter.fromJson(jsonReader2);
                        break;
                    case 4:
                        str3 = (String) moshiJsonAdapter.apiTokenAdapter.fromJson(jsonReader2);
                        break;
                    case 5:
                        str4 = (String) moshiJsonAdapter.bioAdapter.fromJson(jsonReader2);
                        break;
                    case 6:
                        str5 = (String) moshiJsonAdapter.birthDateAdapter.fromJson(jsonReader2);
                        break;
                    case 7:
                        str6 = (String) moshiJsonAdapter.blendAdapter.fromJson(jsonReader2);
                        break;
                    case 8:
                        str7 = (String) moshiJsonAdapter.createDateAdapter.fromJson(jsonReader2);
                        break;
                    case 9:
                        bool = (Boolean) moshiJsonAdapter.discoverableAdapter.fromJson(jsonReader2);
                        break;
                    case 10:
                        list = (List) moshiJsonAdapter.interestsAdapter.fromJson(jsonReader2);
                        break;
                    case 11:
                        list2 = (List) moshiJsonAdapter.commonInterestsAdapter.fromJson(jsonReader2);
                        break;
                    case 12:
                        num3 = (Integer) moshiJsonAdapter.distanceFilterAdapter.fromJson(jsonReader2);
                        break;
                    case 13:
                        num4 = (Integer) moshiJsonAdapter.distanceMiAdapter.fromJson(jsonReader2);
                        break;
                    case 14:
                        str8 = (String) moshiJsonAdapter.nameAdapter.fromJson(jsonReader2);
                        break;
                    case 15:
                        str9 = (String) moshiJsonAdapter.fulleNameAdapter.fromJson(jsonReader2);
                        break;
                    case 16:
                        num5 = (Integer) moshiJsonAdapter.genderAdapter.fromJson(jsonReader2);
                        break;
                    case 17:
                        num6 = (Integer) moshiJsonAdapter.genderFilterAdapter.fromJson(jsonReader2);
                        break;
                    case 18:
                        str10 = (String) moshiJsonAdapter.customGenderAdapter.fromJson(jsonReader2);
                        break;
                    case 19:
                        bool2 = (Boolean) moshiJsonAdapter.showGenderOnProfileAdapter.fromJson(jsonReader2);
                        break;
                    case 20:
                        bool3 = (Boolean) moshiJsonAdapter.photosProcessingAdapter.fromJson(jsonReader2);
                        break;
                    case 21:
                        list3 = (List) moshiJsonAdapter.photosAdapter.fromJson(jsonReader2);
                        break;
                    case 22:
                        str11 = (String) moshiJsonAdapter.pingTimeAdapter.fromJson(jsonReader2);
                        break;
                    case 23:
                        bool4 = (Boolean) moshiJsonAdapter.spotifyConnectedAdapter.fromJson(jsonReader2);
                        break;
                    case 24:
                        bool5 = (Boolean) moshiJsonAdapter.spotifyAnthemAdapter.fromJson(jsonReader2);
                        break;
                    case 25:
                        spotifyThemeTrack = (SpotifyThemeTrack) moshiJsonAdapter.spotifyThemeTrackAdapter.fromJson(jsonReader2);
                        break;
                    case 26:
                        list4 = (List) moshiJsonAdapter.spotifyTopArtistsAdapter.fromJson(jsonReader2);
                        break;
                    case 27:
                        list5 = (List) moshiJsonAdapter.badgesAdapter.fromJson(jsonReader2);
                        break;
                    case 28:
                        list6 = (List) moshiJsonAdapter.jobsAdapter.fromJson(jsonReader2);
                        break;
                    case 29:
                        list7 = (List) moshiJsonAdapter.schoolsAdapter.fromJson(jsonReader2);
                        break;
                    case 30:
                        str12 = (String) moshiJsonAdapter.usernameAdapter.fromJson(jsonReader2);
                        break;
                    case 31:
                        bool6 = (Boolean) moshiJsonAdapter.photoOptimizerEnabledAdapter.fromJson(jsonReader2);
                        break;
                    case 32:
                        bool7 = (Boolean) moshiJsonAdapter.photoOptimizerResultAdapter.fromJson(jsonReader2);
                        break;
                    case 33:
                        str13 = (String) moshiJsonAdapter.discoverablePartyAdapter.fromJson(jsonReader2);
                        break;
                    case 34:
                        bool8 = (Boolean) moshiJsonAdapter.hideAdsAdapter.fromJson(jsonReader2);
                        break;
                    case 35:
                        bool9 = (Boolean) moshiJsonAdapter.hideAgeAdapter.fromJson(jsonReader2);
                        break;
                    case 36:
                        list8 = (List) moshiJsonAdapter.interestedInAdapter.fromJson(jsonReader2);
                        break;
                    case 37:
                        str14 = (String) moshiJsonAdapter.locationNameAdapter.fromJson(jsonReader2);
                        break;
                    case 38:
                        str15 = (String) moshiJsonAdapter.locationProximityAdapter.fromJson(jsonReader2);
                        break;
                    case 39:
                        location = (Location) moshiJsonAdapter.locationAdapter.fromJson(jsonReader2);
                        break;
                    case 40:
                        bool10 = (Boolean) moshiJsonAdapter.isVerifiedAdapter.fromJson(jsonReader2);
                        break;
                    case 41:
                        bool11 = (Boolean) moshiJsonAdapter.isNewAdapter.fromJson(jsonReader2);
                        break;
                    case 42:
                        str16 = (String) moshiJsonAdapter.contentHashAdapter.fromJson(jsonReader2);
                        break;
                    case 43:
                        num7 = (Integer) moshiJsonAdapter.connectionCountAdapter.fromJson(jsonReader2);
                        break;
                    case 44:
                        list9 = (List) moshiJsonAdapter.commonConnectionsAdapter.fromJson(jsonReader2);
                        break;
                    case 45:
                        bool12 = (Boolean) moshiJsonAdapter.hideDistanceAdapter.fromJson(jsonReader2);
                        break;
                    case 46:
                        instagram = (Instagram) moshiJsonAdapter.instagramAdapter.fromJson(jsonReader2);
                        break;
                    case 47:
                        str17 = (String) moshiJsonAdapter.phoneNumberAdapter.fromJson(jsonReader2);
                        break;
                    case 48:
                        bool13 = (Boolean) moshiJsonAdapter.deactivatedAdapter.fromJson(jsonReader2);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_User(str, str2, num, num2, str3, str4, str5, str6, str7, bool, list, list2, num3, num4, str8, str9, num5, num6, str10, bool2, bool3, list3, str11, bool4, bool5, spotifyThemeTrack, list4, list5, list6, list7, str12, bool6, bool7, str13, bool8, bool9, list8, str14, str15, location, bool10, bool11, str16, num7, list9, bool12, instagram, str17, bool13);
        }

        public void toJson(C5983k c5983k, User user) throws IOException {
            c5983k.c();
            c5983k.b(ManagerWebServices.PARAM_ID_UNDERSCORE);
            this.idAdapter.toJson(c5983k, user.id());
            String activeTime = user.activeTime();
            if (activeTime != null) {
                c5983k.b("active_time");
                this.activeTimeAdapter.toJson(c5983k, activeTime);
            }
            Integer ageFilterMax = user.ageFilterMax();
            if (ageFilterMax != null) {
                c5983k.b(ManagerWebServices.PARAM_AGE_FILTER_MAX);
                this.ageFilterMaxAdapter.toJson(c5983k, ageFilterMax);
            }
            ageFilterMax = user.ageFilterMin();
            if (ageFilterMax != null) {
                c5983k.b(ManagerWebServices.PARAM_AGE_FILTER_MIN);
                this.ageFilterMinAdapter.toJson(c5983k, ageFilterMax);
            }
            activeTime = user.apiToken();
            if (activeTime != null) {
                c5983k.b("api_token");
                this.apiTokenAdapter.toJson(c5983k, activeTime);
            }
            activeTime = user.bio();
            if (activeTime != null) {
                c5983k.b(ManagerWebServices.PARAM_BIO);
                this.bioAdapter.toJson(c5983k, activeTime);
            }
            c5983k.b(ManagerWebServices.PARAM_BIRTH_DATE);
            this.birthDateAdapter.toJson(c5983k, user.birthDate());
            activeTime = user.blend();
            if (activeTime != null) {
                c5983k.b(ManagerWebServices.PARAM_BLEND);
                this.blendAdapter.toJson(c5983k, activeTime);
            }
            activeTime = user.createDate();
            if (activeTime != null) {
                c5983k.b(ManagerWebServices.PARAM_CREATE_DATE);
                this.createDateAdapter.toJson(c5983k, activeTime);
            }
            Boolean discoverable = user.discoverable();
            if (discoverable != null) {
                c5983k.b(ManagerWebServices.PARAM_DISCOVERABLE);
                this.discoverableAdapter.toJson(c5983k, discoverable);
            }
            List interests = user.interests();
            if (interests != null) {
                c5983k.b(ManagerWebServices.PARAM_INTERESTS);
                this.interestsAdapter.toJson(c5983k, interests);
            }
            interests = user.commonInterests();
            if (interests != null) {
                c5983k.b(ManagerWebServices.PARAM_COMMON_INTERESTS);
                this.commonInterestsAdapter.toJson(c5983k, interests);
            }
            ageFilterMax = user.distanceFilter();
            if (ageFilterMax != null) {
                c5983k.b(ManagerWebServices.PARAM_DISTANCE_FILTER);
                this.distanceFilterAdapter.toJson(c5983k, ageFilterMax);
            }
            ageFilterMax = user.distanceMi();
            if (ageFilterMax != null) {
                c5983k.b(ManagerWebServices.PARAM_DISTANCE_MI);
                this.distanceMiAdapter.toJson(c5983k, ageFilterMax);
            }
            activeTime = user.name();
            if (activeTime != null) {
                c5983k.b("name");
                this.nameAdapter.toJson(c5983k, activeTime);
            }
            activeTime = user.fulleName();
            if (activeTime != null) {
                c5983k.b("full_name");
                this.fulleNameAdapter.toJson(c5983k, activeTime);
            }
            ageFilterMax = user.gender();
            if (ageFilterMax != null) {
                c5983k.b("gender");
                this.genderAdapter.toJson(c5983k, ageFilterMax);
            }
            ageFilterMax = user.genderFilter();
            if (ageFilterMax != null) {
                c5983k.b(ManagerWebServices.PARAM_GENDER_FILTER);
                this.genderFilterAdapter.toJson(c5983k, ageFilterMax);
            }
            activeTime = user.customGender();
            if (activeTime != null) {
                c5983k.b(ManagerWebServices.PARAM_CUSTOM_GENDER);
                this.customGenderAdapter.toJson(c5983k, activeTime);
            }
            discoverable = user.showGenderOnProfile();
            if (discoverable != null) {
                c5983k.b(ManagerWebServices.PARAM_SHOW_GENDER);
                this.showGenderOnProfileAdapter.toJson(c5983k, discoverable);
            }
            discoverable = user.photosProcessing();
            if (discoverable != null) {
                c5983k.b(ManagerWebServices.PARAM_PROCESSING_PHOTOS);
                this.photosProcessingAdapter.toJson(c5983k, discoverable);
            }
            interests = user.photos();
            if (interests != null) {
                c5983k.b("photos");
                this.photosAdapter.toJson(c5983k, interests);
            }
            activeTime = user.pingTime();
            if (activeTime != null) {
                c5983k.b(ManagerWebServices.PARAM_PING_TIME);
                this.pingTimeAdapter.toJson(c5983k, activeTime);
            }
            discoverable = user.spotifyConnected();
            if (discoverable != null) {
                c5983k.b(ManagerWebServices.PARAM_SPOTIFY_CONNECTED);
                this.spotifyConnectedAdapter.toJson(c5983k, discoverable);
            }
            discoverable = user.spotifyAnthem();
            if (discoverable != null) {
                c5983k.b("spotify_anthem");
                this.spotifyAnthemAdapter.toJson(c5983k, discoverable);
            }
            SpotifyThemeTrack spotifyThemeTrack = user.spotifyThemeTrack();
            if (spotifyThemeTrack != null) {
                c5983k.b(ManagerWebServices.PARAM_SPOTIFY_THEM_TRACK);
                this.spotifyThemeTrackAdapter.toJson(c5983k, spotifyThemeTrack);
            }
            interests = user.spotifyTopArtists();
            if (interests != null) {
                c5983k.b(ManagerWebServices.PARAM_SPOTIFY_TOP_ARTISTS);
                this.spotifyTopArtistsAdapter.toJson(c5983k, interests);
            }
            interests = user.badges();
            if (interests != null) {
                c5983k.b(ManagerWebServices.PARAM_BADGES);
                this.badgesAdapter.toJson(c5983k, interests);
            }
            interests = user.jobs();
            if (interests != null) {
                c5983k.b(ManagerWebServices.PARAM_JOBS);
                this.jobsAdapter.toJson(c5983k, interests);
            }
            interests = user.schools();
            if (interests != null) {
                c5983k.b(ManagerWebServices.PARAM_SCHOOLS);
                this.schoolsAdapter.toJson(c5983k, interests);
            }
            activeTime = user.username();
            if (activeTime != null) {
                c5983k.b("username");
                this.usernameAdapter.toJson(c5983k, activeTime);
            }
            discoverable = user.photoOptimizerEnabled();
            if (discoverable != null) {
                c5983k.b(ManagerWebServices.PARAM_PHOTO_OPTIMIZED);
                this.photoOptimizerEnabledAdapter.toJson(c5983k, discoverable);
            }
            discoverable = user.photoOptimizerResult();
            if (discoverable != null) {
                c5983k.b(ManagerWebServices.PARAM_PHOTO_OPTIMIZED_RESULTS);
                this.photoOptimizerResultAdapter.toJson(c5983k, discoverable);
            }
            activeTime = user.discoverableParty();
            if (activeTime != null) {
                c5983k.b(ManagerWebServices.PARAM_DISCOVERABILITY);
                this.discoverablePartyAdapter.toJson(c5983k, activeTime);
            }
            discoverable = user.hideAds();
            if (discoverable != null) {
                c5983k.b(ManagerWebServices.PARAM_HIDE_ADS);
                this.hideAdsAdapter.toJson(c5983k, discoverable);
            }
            discoverable = user.hideAge();
            if (discoverable != null) {
                c5983k.b(ManagerWebServices.PARAM_HIDE_AGE);
                this.hideAgeAdapter.toJson(c5983k, discoverable);
            }
            interests = user.interestedIn();
            if (interests != null) {
                c5983k.b("interested_in");
                this.interestedInAdapter.toJson(c5983k, interests);
            }
            activeTime = user.locationName();
            if (activeTime != null) {
                c5983k.b("location_name");
                this.locationNameAdapter.toJson(c5983k, activeTime);
            }
            activeTime = user.locationProximity();
            if (activeTime != null) {
                c5983k.b(ManagerWebServices.PARAM_LOCATION_PROXIMITY);
                this.locationProximityAdapter.toJson(c5983k, activeTime);
            }
            Location location = user.location();
            if (location != null) {
                c5983k.b("location");
                this.locationAdapter.toJson(c5983k, location);
            }
            discoverable = user.isVerified();
            if (discoverable != null) {
                c5983k.b(ManagerWebServices.PARAM_VERIFIED);
                this.isVerifiedAdapter.toJson(c5983k, discoverable);
            }
            discoverable = user.isNew();
            if (discoverable != null) {
                c5983k.b(ManagerWebServices.PARAM_IS_NEW_USER);
                this.isNewAdapter.toJson(c5983k, discoverable);
            }
            activeTime = user.contentHash();
            if (activeTime != null) {
                c5983k.b(ManagerWebServices.PARAM_CONTENT_HASH);
                this.contentHashAdapter.toJson(c5983k, activeTime);
            }
            ageFilterMax = user.connectionCount();
            if (ageFilterMax != null) {
                c5983k.b(ManagerWebServices.PARAM_CONNECTION_COUNT);
                this.connectionCountAdapter.toJson(c5983k, ageFilterMax);
            }
            interests = user.commonConnections();
            if (interests != null) {
                c5983k.b(ManagerWebServices.PARAM_COMMON_CONNECTIONS);
                this.commonConnectionsAdapter.toJson(c5983k, interests);
            }
            discoverable = user.hideDistance();
            if (discoverable != null) {
                c5983k.b(ManagerWebServices.PARAM_HIDE_DISTANCE);
                this.hideDistanceAdapter.toJson(c5983k, discoverable);
            }
            Instagram instagram = user.instagram();
            if (instagram != null) {
                c5983k.b(ManagerWebServices.IG_PARAM_INSTAGRAM);
                this.instagramAdapter.toJson(c5983k, instagram);
            }
            activeTime = user.phoneNumber();
            if (activeTime != null) {
                c5983k.b(ManagerWebServices.PARAM_PHONE_ID);
                this.phoneNumberAdapter.toJson(c5983k, activeTime);
            }
            user = user.deactivated();
            if (user != null) {
                c5983k.b("deactivated");
                this.deactivatedAdapter.toJson(c5983k, user);
            }
            c5983k.d();
        }
    }

    AutoValue_User(String str, String str2, Integer num, Integer num2, String str3, String str4, String str5, String str6, String str7, Boolean bool, List<Interest> list, List<Interest> list2, Integer num3, Integer num4, String str8, String str9, Integer num5, Integer num6, String str10, Boolean bool2, Boolean bool3, List<Photo> list3, String str11, Boolean bool4, Boolean bool5, SpotifyThemeTrack spotifyThemeTrack, List<SpotifyArtist> list4, List<Badge> list5, List<Job> list6, List<School> list7, String str12, Boolean bool6, Boolean bool7, String str13, Boolean bool8, Boolean bool9, List<Integer> list8, String str14, String str15, Location location, Boolean bool10, Boolean bool11, String str16, Integer num7, List<CommonConnection> list9, Boolean bool12, Instagram instagram, String str17, Boolean bool13) {
        super(str, str2, num, num2, str3, str4, str5, str6, str7, bool, list, list2, num3, num4, str8, str9, num5, num6, str10, bool2, bool3, list3, str11, bool4, bool5, spotifyThemeTrack, list4, list5, list6, list7, str12, bool6, bool7, str13, bool8, bool9, list8, str14, str15, location, bool10, bool11, str16, num7, list9, bool12, instagram, str17, bool13);
    }
}
