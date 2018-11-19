package com.tinder.p257g;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.ads.AdError;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.meta.model.PlusControlSettings;
import com.tinder.domain.meta.model.PlusControlSettings.Blend;
import com.tinder.domain.meta.model.PlusControlSettings.DiscoverableParty;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.enums.Gender;
import com.tinder.managers.ManagerProfile;
import com.tinder.model.AuthResponse;
import com.tinder.model.Career;
import com.tinder.model.CommonConnection;
import com.tinder.model.ConnectionsGroup;
import com.tinder.model.Interest;
import com.tinder.model.ProcessedPhoto;
import com.tinder.model.ProfilePhoto;
import com.tinder.model.User;
import com.tinder.model.builders.AuthResponseBuilder;
import com.tinder.passport.model.PassportLocation;
import com.tinder.spotify.model.Artist;
import com.tinder.spotify.model.SearchTrack;
import com.tinder.tinderplus.C2657a;
import com.tinder.tinderplus.p428a.C15193i;
import com.tinder.utils.DateUtils;
import com.tinder.utils.ad;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Singleton
/* renamed from: com.tinder.g.e */
public class C9648e {
    /* renamed from: a */
    private final C15193i f32187a;
    /* renamed from: b */
    private final C2657a f32188b;
    /* renamed from: c */
    private final SubscriptionProvider f32189c;

    /* renamed from: com.tinder.g.e$1 */
    static class C118541 extends TypeToken<List<Artist>> {
        C118541() {
        }
    }

    /* renamed from: com.tinder.g.e$2 */
    class C118552 extends TypeToken<List<Artist>> {
        /* renamed from: a */
        final /* synthetic */ C9648e f38670a;

        C118552(C9648e c9648e) {
            this.f38670a = c9648e;
        }
    }

    @Inject
    public C9648e(C15193i c15193i, C2657a c2657a, SubscriptionProvider subscriptionProvider) {
        this.f32187a = c15193i;
        this.f32188b = c2657a;
        this.f32189c = subscriptionProvider;
    }

    @Nullable
    /* renamed from: a */
    public static User m40043a(@NonNull JSONObject jSONObject, boolean z) throws JSONException, ParseException {
        Date date;
        boolean z2;
        List list;
        String str;
        User user;
        JSONObject jSONObject2 = jSONObject;
        boolean z3 = z;
        DateFormat a = DateUtils.a();
        String optString = jSONObject2.optString(ManagerWebServices.PARAM_BIO);
        String string = jSONObject2.getString(ManagerWebServices.PARAM_BIRTH_DATE);
        boolean equals = "-1".equals(string);
        if (equals) {
            date = null;
        } else {
            date = a.parse(string);
        }
        String d = C9648e.m40047d(jSONObject);
        Date parse = jSONObject2.has(ManagerWebServices.PARAM_PING_TIME) ? a.parse(jSONObject2.getString(ManagerWebServices.PARAM_PING_TIME)) : null;
        int i = jSONObject2.getInt("gender");
        boolean z4 = i == -1;
        Gender gender = Gender.values()[Math.abs(i)];
        String optString2 = jSONObject2.optString(ManagerWebServices.PARAM_CUSTOM_GENDER);
        boolean optBoolean = jSONObject2.optBoolean(ManagerWebServices.PARAM_SHOW_GENDER);
        String string2 = jSONObject2.getString("name");
        String optString3 = jSONObject2.optString("username", "");
        boolean z5 = equals;
        int optDouble = (int) jSONObject2.optDouble(ManagerWebServices.PARAM_DISTANCE_MI);
        String optString4 = jSONObject2.optString("location_name");
        String optString5 = jSONObject2.optString(ManagerWebServices.PARAM_LOCATION_PROXIMITY);
        JSONArray optJSONArray = jSONObject2.optJSONArray("photos");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray(ManagerWebServices.PARAM_SPOTIFY_TOP_ARTISTS);
        Gson gson = new Gson();
        List list2 = optJSONArray2 != null ? (List) gson.fromJson(optJSONArray2.toString(), new C118541().getType()) : null;
        JSONObject optJSONObject = jSONObject2.optJSONObject(ManagerWebServices.PARAM_SPOTIFY_THEM_TRACK);
        SearchTrack searchTrack = optJSONObject != null ? (SearchTrack) gson.fromJson(optJSONObject.toString(), SearchTrack.class) : null;
        equals = jSONObject2.optBoolean(ManagerWebServices.PARAM_SPOTIFY_CONNECTED);
        String optString6 = jSONObject2.optString(ManagerWebServices.PARAM_SPOTIFY_LAST_UPDATED);
        boolean z6 = optBoolean;
        String optString7 = jSONObject2.optString(ManagerWebServices.PARAM_PING_TIME, "");
        boolean optBoolean2 = jSONObject2.optBoolean(ManagerWebServices.PARAM_HIDE_AGE, false);
        optBoolean = jSONObject2.optBoolean(ManagerWebServices.PARAM_HIDE_DISTANCE, false);
        if (optJSONArray != null) {
            z2 = optBoolean;
            List arrayList = new ArrayList(optJSONArray.length());
            C9648e.m40045a(optJSONArray, arrayList);
            list = arrayList;
        } else {
            z2 = optBoolean;
            list = new ArrayList(0);
        }
        optJSONArray = jSONObject2.optJSONArray(ManagerWebServices.PARAM_BADGES);
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray != null) {
            str = optString6;
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                arrayList2.add(C9644a.m40033a(optJSONArray.getJSONObject(i2)));
            }
        } else {
            str = optString6;
        }
        boolean optBoolean3 = jSONObject2.optBoolean(ManagerWebServices.PARAM_VERIFIED, false);
        boolean optBoolean4 = jSONObject2.optBoolean(ManagerWebServices.PARAM_IS_SUPERLIKE, false);
        boolean optBoolean5 = jSONObject2.optBoolean(ManagerWebServices.PARAM_IS_BRAND, false);
        boolean optBoolean6 = jSONObject2.optBoolean(ManagerWebServices.PARAM_PLACEHOLDER, false);
        boolean optBoolean7 = jSONObject2.optBoolean(ManagerWebServices.PARAM_ALREADY_MATCHED, false);
        User user2 = r4;
        boolean z7 = z4;
        boolean z8 = z6;
        z4 = optBoolean2;
        boolean z9 = z2;
        String optString8 = jSONObject2.optString(ManagerWebServices.PARAM_CONTENT_HASH);
        String optString9 = jSONObject2.optString(ManagerWebServices.PARAM_S_NUMBER, "");
        String str2 = str;
        boolean z10 = equals;
        boolean z11 = z5;
        User user3 = new User(string2, optString, date, d, parse, gender, null, null, optDouble, list, optString7, optString4, optString5, optBoolean3, optBoolean4, optBoolean5, arrayList2, optString3, Career.fromJsonObject(jSONObject), optBoolean6, optBoolean7, jSONObject2.optBoolean(ManagerWebServices.PARAM_PROCESSING_PHOTOS, false), jSONObject2.optBoolean(ManagerWebServices.PARAM_PHOTO_OPTIMIZED, false), jSONObject2.optBoolean(ManagerWebServices.PARAM_IS_NEW_USER, false), optString8, searchTrack, list2);
        if (z3) {
            user = user2;
            user.setCommonInterests(C9648e.m40049f(jSONObject));
        } else {
            user = user2;
            Pair c = C9648e.m40046c(jSONObject);
            user.setCommonInterests((List) c.first);
            user.setUncommonInterests((List) c.second);
        }
        Pair a2 = C9648e.m40042a(jSONObject2, z3, user);
        if (a2 != null) {
            user.setNumConnections(((Integer) a2.first).intValue());
            user.setConnections((ConnectionsGroup) a2.second);
        }
        user.setCustomGender(optString2);
        user.setHideAge(z4);
        user.setHideDistance(z9);
        user.setSNumber(optString9);
        user.setContentHash(optString8);
        user.setIsSpotifyConnected(z10);
        user.setSpotifyLastUpdated(str2);
        user.setShowGenderOnProfile(z8);
        user.setCreateDate(jSONObject2.optString(ManagerWebServices.PARAM_CREATE_DATE, null));
        user.setDiscoverable(jSONObject2.optBoolean(ManagerWebServices.PARAM_DISCOVERABLE, true));
        user.setDistanceFilter(jSONObject2.optInt(ManagerWebServices.PARAM_DISTANCE_FILTER, 50));
        if (jSONObject2.has(ManagerWebServices.PARAM_GENDER_FILTER)) {
            user.setInterestedIn(C9648e.m40048e(jSONObject));
        }
        int ageInt = user.getAgeInt();
        if (ageInt > 0) {
            user.setAgeFilterMin(jSONObject2.optInt(ManagerWebServices.PARAM_AGE_FILTER_MIN, Math.max(18, ageInt - 10)));
            user.setAgeFilterMax(jSONObject2.optInt(ManagerWebServices.PARAM_AGE_FILTER_MAX, ageInt + 10));
        } else {
            user.setAgeFilterMin(18);
            user.setAgeFilterMax(AdError.NETWORK_ERROR_CODE);
        }
        user.setHideAds(jSONObject2.optBoolean(ManagerWebServices.PARAM_HIDE_ADS, false));
        user.setAgeVerificationRequired(z11);
        user.setGenderVerificationRequired(z7);
        user.setDiscoverability(ManagerProfile.c(jSONObject2.optString(ManagerWebServices.PARAM_DISCOVERABILITY)));
        user.setBlend(ManagerProfile.b(jSONObject2.optString(ManagerWebServices.PARAM_BLEND)));
        user.setInstagramDataSet(C9646c.m40038a(jSONObject));
        user.setPhoneNumber(jSONObject2.optString(ManagerWebServices.PARAM_PHONE_ID, ""));
        return user;
    }

    /* renamed from: d */
    private static String m40047d(@NonNull JSONObject jSONObject) throws JSONException, ParseException {
        if (jSONObject.has(ManagerWebServices.PARAM_ID_UNDERSCORE)) {
            return jSONObject.getString(ManagerWebServices.PARAM_ID_UNDERSCORE);
        }
        if (jSONObject.has("id")) {
            return jSONObject.getString("id");
        }
        ad.c("User does not have id");
        return null;
    }

    /* renamed from: e */
    private static List<Gender> m40048e(@NonNull JSONObject jSONObject) throws JSONException, ParseException {
        List arrayList = new ArrayList(2);
        jSONObject = jSONObject.getInt(ManagerWebServices.PARAM_GENDER_FILTER);
        if (jSONObject == -1) {
            arrayList.add(Gender.MALE);
            arrayList.add(Gender.FEMALE);
        } else if (jSONObject == null) {
            arrayList.add(Gender.MALE);
        } else {
            arrayList.add(Gender.FEMALE);
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: a */
    public AuthResponse m40050a(@NonNull JSONObject jSONObject) {
        AuthResponseBuilder authResponseBuilder = new AuthResponseBuilder();
        String optString = jSONObject.optString("error", null);
        if (optString != null) {
            authResponseBuilder.setError(true);
            authResponseBuilder.setErrorBody(optString);
        }
        optString = jSONObject.optString(ManagerWebServices.PARAM_TOKEN, null);
        boolean optBoolean = jSONObject.optBoolean(ManagerWebServices.PARAM_TWEEN_COLLECT_EMAIL);
        authResponseBuilder.setTweenErrorNumber(jSONObject.optInt(ManagerWebServices.PARAM_ERROR_NO_TWEEN));
        authResponseBuilder.setTweenShouldCollectEmail(optBoolean);
        authResponseBuilder.setAuthToken(optString);
        if (!jSONObject.isNull(ManagerWebServices.PARAM_USER)) {
            try {
                m40044a(authResponseBuilder, jSONObject.getJSONObject(ManagerWebServices.PARAM_USER));
            } catch (JSONObject jSONObject2) {
                ad.a("Failed to retrieve user object in json", jSONObject2);
            }
        }
        return authResponseBuilder.build();
    }

    /* renamed from: a */
    private void m40044a(@NonNull AuthResponseBuilder authResponseBuilder, @NonNull JSONObject jSONObject) {
        Throwable th;
        Throwable e;
        C9648e c9648e = this;
        AuthResponseBuilder authResponseBuilder2 = authResponseBuilder;
        JSONObject jSONObject2 = jSONObject;
        DateFormat a = DateUtils.a();
        C9648e c9648e2;
        try {
            Date date;
            List list;
            int i;
            PassportLocation b = m40051b(jSONObject2);
            if (!jSONObject2.isNull(ManagerWebServices.PARAM_POS)) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(ManagerWebServices.PARAM_POS);
                authResponseBuilder2.setLatitude(jSONObject3.getDouble(ManagerWebServices.PARAM_LAT)).setLongitude(jSONObject3.getDouble(ManagerWebServices.PARAM_LON));
            }
            String optString = jSONObject2.optString(ManagerWebServices.PARAM_CREATE_DATE, null);
            String b2 = ManagerProfile.b(jSONObject2.optString(ManagerWebServices.PARAM_BLEND));
            int optInt = jSONObject2.optInt(ManagerWebServices.PARAM_DISTANCE_FILTER);
            int optInt2 = jSONObject2.optInt(ManagerWebServices.PARAM_AGE_FILTER_MIN);
            int optInt3 = jSONObject2.optInt(ManagerWebServices.PARAM_AGE_FILTER_MAX);
            String string = jSONObject2.getString(ManagerWebServices.PARAM_BIRTH_DATE);
            boolean equals = string.equals("-1");
            if (equals) {
                date = null;
            } else {
                date = a.parse(string);
            }
            Date parse = !TextUtils.isEmpty(jSONObject2.optString(ManagerWebServices.PARAM_PING_TIME, null)) ? a.parse(jSONObject2.getString(ManagerWebServices.PARAM_PING_TIME)) : null;
            int i2 = jSONObject2.getInt("gender");
            boolean z = i2 == -1;
            Gender gender = Gender.values()[Math.abs(i2)];
            String optString2 = jSONObject2.optString(ManagerWebServices.PARAM_CUSTOM_GENDER);
            String optString3 = jSONObject2.optString(ManagerWebServices.PARAM_BIO, "");
            boolean z2 = z;
            if (optString3.length() > 500) {
                optString3 = optString3.substring(0, 500);
            }
            String str = optString3;
            optString3 = jSONObject2.getString(ManagerWebServices.PARAM_ID_UNDERSCORE);
            String string2 = jSONObject2.getString("name");
            boolean z3 = equals;
            String optString4 = jSONObject2.optString("username", null);
            String optString5 = jSONObject2.optString(ManagerWebServices.PARAM_FACEBOOK_ID, null);
            boolean optBoolean = jSONObject2.optBoolean(ManagerWebServices.PARAM_DISCOVERABLE, true);
            boolean optBoolean2 = jSONObject2.optBoolean("squads_discoverable", true);
            equals = jSONObject2.optBoolean(ManagerWebServices.PARAM_SHOW_ONLY_GROUPS_IN_DISCOVERY, false);
            String c = ManagerProfile.c(jSONObject2.optString(ManagerWebServices.PARAM_DISCOVERABILITY));
            boolean z4 = equals;
            boolean optBoolean3 = jSONObject2.optBoolean(ManagerWebServices.PARAM_HIDE_ADS, false);
            boolean optBoolean4 = jSONObject2.optBoolean(ManagerWebServices.PARAM_HIDE_AGE, false);
            boolean optBoolean5 = jSONObject2.optBoolean(ManagerWebServices.PARAM_HIDE_DISTANCE, false);
            StringBuilder stringBuilder = new StringBuilder();
            boolean z5 = optBoolean5;
            stringBuilder.append("userId=");
            stringBuilder.append(optString3);
            ad.a(stringBuilder.toString());
            JSONArray optJSONArray = jSONObject2.optJSONArray("photos");
            int i3 = optInt3;
            boolean optBoolean6 = jSONObject2.optBoolean(ManagerWebServices.PARAM_PROCESSING_PHOTOS, false);
            if (optBoolean6 || optJSONArray == null) {
                list = null;
            } else {
                List arrayList = new ArrayList(optJSONArray.length());
                C9648e.m40045a(optJSONArray, arrayList);
                list = arrayList;
            }
            boolean optBoolean7 = jSONObject2.optBoolean(ManagerWebServices.PARAM_IS_NEW_USER, false);
            optJSONArray = jSONObject2.optJSONArray(ManagerWebServices.PARAM_BADGES);
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray != null) {
                i = optInt2;
                for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                    arrayList2.add(C9644a.m40033a(optJSONArray.getJSONObject(i4)));
                }
            } else {
                i = optInt2;
            }
            String optString6 = jSONObject2.optString(ManagerWebServices.PARAM_PING_TIME, "");
            optJSONArray = jSONObject2.optJSONArray(ManagerWebServices.PARAM_SPOTIFY_TOP_ARTISTS);
            Gson gson = new Gson();
            List list2 = optJSONArray != null ? (List) gson.fromJson(optJSONArray.toString(), new C118552(c9648e).getType()) : null;
            JSONObject optJSONObject = jSONObject2.optJSONObject(ManagerWebServices.PARAM_SPOTIFY_THEM_TRACK);
            SearchTrack searchTrack = optJSONObject != null ? (SearchTrack) gson.fromJson(optJSONObject.toString(), SearchTrack.class) : null;
            boolean optBoolean8 = jSONObject2.optBoolean(ManagerWebServices.PARAM_SPOTIFY_CONNECTED);
            String optString7 = jSONObject2.optString(ManagerWebServices.PARAM_SPOTIFY_LAST_UPDATED);
            String optString8 = jSONObject2.optString(ManagerWebServices.PARAM_SPOTIFY_USER_NAME);
            String optString9 = jSONObject2.optString(ManagerWebServices.PARAM_SPOTIFY_USER_TYPE);
            String str2 = optString7;
            boolean optBoolean9 = jSONObject2.optBoolean(ManagerWebServices.PARAM_BANNED, false);
            boolean optBoolean10 = jSONObject2.optBoolean(ManagerWebServices.PARAM_VERIFIED, false);
            boolean optBoolean11 = jSONObject2.optBoolean(ManagerWebServices.PARAM_IS_SUPERLIKE, false);
            boolean optBoolean12 = jSONObject2.optBoolean(ManagerWebServices.PARAM_IS_BRAND, false);
            boolean optBoolean13 = jSONObject2.optBoolean(ManagerWebServices.PARAM_PLACEHOLDER, false);
            boolean optBoolean14 = jSONObject2.optBoolean(ManagerWebServices.PARAM_ALREADY_MATCHED, false);
            boolean optBoolean15 = jSONObject2.optBoolean(ManagerWebServices.PARAM_IS_TRAVELING);
            optString7 = jSONObject2.optString(ManagerWebServices.PARAM_S_NUMBER, "");
            PassportLocation passportLocation = b;
            String str3 = optString;
            String str4 = b2;
            optString = optString2;
            boolean z6 = optBoolean;
            boolean z7 = optBoolean2;
            boolean z8 = optBoolean4;
            boolean z9 = z5;
            b2 = optString8;
            String str5 = optString9;
            boolean z10 = optBoolean9;
            User user = user;
            boolean z11 = z2;
            boolean z12 = optBoolean3;
            String str6 = c;
            String str7 = optString7;
            boolean z13 = z3;
            boolean z14 = z4;
            String str8 = str2;
            boolean z15 = optBoolean15;
            optString7 = optString3;
            int i5 = i3;
            boolean z16 = optBoolean8;
            int i6 = i;
            try {
                user = new User(str, date, optString7, string2, parse, optInt, optString5, gender, jSONObject2.has(ManagerWebServices.PARAM_GENDER_FILTER) ? C9648e.m40048e(jSONObject) : null, list, optString6, optBoolean10, optBoolean11, optBoolean12, arrayList2, optString4, Career.fromJsonObject(jSONObject), optBoolean13, optBoolean14, optBoolean6, optBoolean7, searchTrack, list2);
                List f = C9648e.m40049f(jSONObject);
                user = r59;
                Pair a2 = C9648e.m40042a(jSONObject2, true, user);
                user.setCommonInterests(f);
                if (a2 != null) {
                    try {
                        user.setNumConnections(((Integer) a2.first).intValue());
                        user.setConnections((ConnectionsGroup) a2.second);
                    } catch (Throwable e2) {
                        th = e2;
                        c9648e2 = this;
                        ad.a("Failed to parse birthday or ping time for rec", th);
                    } catch (Throwable e22) {
                        th = e22;
                        c9648e2 = this;
                        ad.a("Failed to parse JSON for recs response", th);
                    } catch (Throwable e222) {
                        th = e222;
                        c9648e2 = this;
                        ad.a("Unknown exception in rec parsing", th);
                    }
                }
                user.setIsSpotifyConnected(z16);
                user.setSpotifyLastUpdated(str8);
                user.setSpotifyUserType(str5);
                user.setSpotifyUserName(b2);
                user.setSNumber(str7);
                user.setCustomGender(optString);
                boolean optBoolean16 = jSONObject2.optBoolean(ManagerWebServices.PARAM_PHOTO_OPTIMIZED, false);
                boolean optBoolean17 = jSONObject2.optBoolean(ManagerWebServices.PARAM_PHOTO_OPTIMIZED_RESULTS, false);
                String str9 = str6;
                boolean z17 = z12;
                boolean z18 = z8;
                z16 = z9;
                b2 = str4;
                z = z18;
                try {
                    this.f32188b.a(PlusControlSettings.builder().discoverableParty(DiscoverableParty.from(str9)).isHideAds(z17).isHideAge(z18).isHideDistance(z16).blend(Blend.from(b2)).build(), c9648e2.f32189c.get());
                    AuthResponseBuilder authResponseBuilder3 = authResponseBuilder;
                    authResponseBuilder3.setBlend(b2);
                    authResponseBuilder3.setDiscoverability(str9);
                    authResponseBuilder3.setPassportLocation(passportLocation);
                    authResponseBuilder3.setCreateDate(str3);
                    authResponseBuilder3.setTraveling(z15);
                    authResponseBuilder3.setUser(user);
                    authResponseBuilder3.setDistanceFilter(optInt);
                    authResponseBuilder3.setAgeMin(i6);
                    authResponseBuilder3.setAgeMax(i5);
                    authResponseBuilder3.setIsBanned(z10);
                    authResponseBuilder3.setNeedsAgeVerification(z13);
                    authResponseBuilder3.setNeedsGenderVerification(z11);
                    authResponseBuilder3.setIsDiscoverable(z6);
                    authResponseBuilder3.setIsAllowedToGroupAdd(z7);
                    authResponseBuilder3.setShowOnlyGroupsInDiscovery(z14);
                    authResponseBuilder3.setHideAds(z17);
                    authResponseBuilder3.setHideAge(z);
                    authResponseBuilder3.setHideDistance(z16);
                    authResponseBuilder3.setOptimizedPhotos(optBoolean16);
                    authResponseBuilder3.setHasPhotoResults(optBoolean17);
                } catch (ParseException e3) {
                    e222 = e3;
                    th = e222;
                    ad.a("Failed to parse birthday or ping time for rec", th);
                } catch (JSONException e4) {
                    e222 = e4;
                    th = e222;
                    ad.a("Failed to parse JSON for recs response", th);
                } catch (Exception e5) {
                    e222 = e5;
                    th = e222;
                    ad.a("Unknown exception in rec parsing", th);
                }
            } catch (ParseException e6) {
                e222 = e6;
                c9648e2 = this;
                th = e222;
                ad.a("Failed to parse birthday or ping time for rec", th);
            } catch (JSONException e7) {
                e222 = e7;
                c9648e2 = this;
                th = e222;
                ad.a("Failed to parse JSON for recs response", th);
            } catch (Exception e8) {
                e222 = e8;
                c9648e2 = this;
                th = e222;
                ad.a("Unknown exception in rec parsing", th);
            }
        } catch (ParseException e9) {
            e222 = e9;
            c9648e2 = c9648e;
            th = e222;
            ad.a("Failed to parse birthday or ping time for rec", th);
        } catch (JSONException e10) {
            e222 = e10;
            c9648e2 = c9648e;
            th = e222;
            ad.a("Failed to parse JSON for recs response", th);
        } catch (Exception e11) {
            e222 = e11;
            c9648e2 = c9648e;
            th = e222;
            ad.a("Unknown exception in rec parsing", th);
        }
    }

    @Nullable
    /* renamed from: b */
    public PassportLocation m40051b(@NonNull JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray(ManagerWebServices.PARAM_TRAVEL_LOCATION_INFO);
        if (optJSONArray == null) {
            return null;
        }
        try {
            PassportLocation b = C9647d.m40041b(optJSONArray.getJSONObject(0));
            jSONObject = jSONObject.getJSONObject(ManagerWebServices.PARAM_TRAVEL_POS);
            if (jSONObject != null) {
                C9647d.m40040a(b, jSONObject);
            }
            return b;
        } catch (JSONObject jSONObject2) {
            ad.a("Failed to parse passport location", jSONObject2);
            return null;
        }
    }

    /* renamed from: a */
    public static void m40045a(@NonNull JSONArray jSONArray, @NonNull List<ProfilePhoto> list) throws JSONException {
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("id");
            String optString = jSONObject.optString("url");
            String optString2 = jSONObject.optString(ManagerWebServices.PARAM_FACEBOOK_ID_SHORT);
            JSONArray jSONArray2 = jSONObject.getJSONArray(ManagerWebServices.PARAM_PROCESSED_FILES_CAMEL);
            List arrayList = new ArrayList(jSONArray2.length());
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                ProcessedPhoto processedPhoto = new ProcessedPhoto(jSONObject2.getString("url"), jSONObject2.getInt("width"), jSONObject2.getInt("height"));
                processedPhoto.setPhotoId(string);
                arrayList.add(processedPhoto);
            }
            ProfilePhoto profilePhoto = new ProfilePhoto(optString, string, arrayList, C9650h.m40055a(jSONObject));
            profilePhoto.facebookId = optString2;
            list.add(profilePhoto);
        }
    }

    @NonNull
    /* renamed from: c */
    public static Pair<List<Interest>, List<Interest>> m40046c(@NonNull JSONObject jSONObject) throws JSONException {
        int i;
        int i2;
        JSONArray optJSONArray = jSONObject.optJSONArray(ManagerWebServices.PARAM_COMMON_INTERESTS);
        if (optJSONArray == null) {
            i = 0;
        } else {
            i = optJSONArray.length();
        }
        List arrayList = new ArrayList(i);
        if (optJSONArray != null) {
            for (i = 0; i < optJSONArray.length(); i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                arrayList.add(new Interest(jSONObject2.optString("id"), jSONObject2.optString("name")));
            }
        }
        jSONObject = jSONObject.optJSONArray(ManagerWebServices.PARAM_UNCOMMON_INTERESTS);
        if (jSONObject == null) {
            i2 = 0;
        } else {
            i2 = jSONObject.length();
        }
        List arrayList2 = new ArrayList(i2);
        if (jSONObject != null) {
            for (int i3 = 0; i3 < jSONObject.length(); i3++) {
                JSONObject jSONObject3 = jSONObject.getJSONObject(i3);
                arrayList2.add(new Interest(jSONObject3.getString("id"), jSONObject3.getString("name")));
            }
        }
        return new Pair(arrayList, arrayList2);
    }

    @NonNull
    /* renamed from: f */
    private static List<Interest> m40049f(@NonNull JSONObject jSONObject) throws JSONException {
        int i;
        jSONObject = jSONObject.optJSONArray(ManagerWebServices.PARAM_INTERESTS);
        if (jSONObject == null) {
            i = 0;
        } else {
            i = jSONObject.length();
        }
        List<Interest> arrayList = new ArrayList(i);
        if (jSONObject != null) {
            for (int i2 = 0; i2 < jSONObject.length(); i2++) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(i2);
                arrayList.add(new Interest(jSONObject2.getString("id"), jSONObject2.getString("name")));
            }
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: a */
    private static Pair<Integer, ConnectionsGroup> m40042a(@NonNull JSONObject jSONObject, boolean z, @NonNull User user) {
        z = jSONObject.optInt(ManagerWebServices.PARAM_CONNECTION_COUNT, z ? user.getNumConnections() : false);
        user = new ArrayList();
        List arrayList = new ArrayList();
        jSONObject = jSONObject.optJSONArray(ManagerWebServices.PARAM_COMMON_CONNECTIONS);
        Object obj = null;
        if (jSONObject != null) {
            for (int i = 0; i < jSONObject.length(); i++) {
                JSONObject optJSONObject = jSONObject.optJSONObject(i);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("id", null);
                    Object optString2 = optJSONObject.optString("name", null);
                    int optInt = optJSONObject.optInt(ManagerWebServices.PARAM_DEGREE, 1);
                    if (TextUtils.isEmpty(optString2)) {
                        arrayList.add(new CommonConnection(optString, optInt, null, null, null, null));
                    } else {
                        String optString3;
                        String str;
                        String str2;
                        optJSONObject = optJSONObject.optJSONObject(ManagerWebServices.PARAM_PHOTO);
                        if (optJSONObject != null) {
                            String optString4 = optJSONObject.optString(ManagerWebServices.PARAM_SMALL, null);
                            String optString5 = optJSONObject.optString(ManagerWebServices.PARAM_MED, null);
                            optString3 = optJSONObject.optString(ManagerWebServices.PARAM_LARGE, null);
                            str = optString4;
                            str2 = optString5;
                        } else {
                            str = null;
                            str2 = str;
                            optString3 = str2;
                        }
                        user.add(new CommonConnection(optString, optInt, optString2, str, str2, optString3));
                    }
                }
            }
            obj = new ConnectionsGroup(user, arrayList);
        }
        return new Pair(Integer.valueOf(z), obj);
    }
}
