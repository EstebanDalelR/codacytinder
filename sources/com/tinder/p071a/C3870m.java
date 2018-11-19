package com.tinder.p071a;

import android.content.ContentValues;
import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.tinder.api.ManagerWebServices;
import com.tinder.enums.Gender;
import com.tinder.enums.SqlDataType;
import com.tinder.goingout.C9675a;
import com.tinder.goingout.model.GoingOut;
import com.tinder.model.Career;
import com.tinder.model.Interest;
import com.tinder.model.User;
import com.tinder.p257g.C9644a;
import com.tinder.spotify.model.Artist;
import com.tinder.spotify.model.SearchTrack;
import com.tinder.utils.C15375x;
import com.tinder.utils.ad;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java8.util.stream.Collectors;
import java8.util.stream.StreamSupport;

/* renamed from: com.tinder.a.m */
public class C3870m extends C2600a {
    /* renamed from: a */
    private static final List<C2601b> f12125a = Arrays.asList(new C2601b[]{new C2601b("id", SqlDataType.TEXT, true), new C2601b(ManagerWebServices.PARAM_BIO, SqlDataType.TEXT, false), new C2601b(ManagerWebServices.PARAM_BIRTH_DATE, SqlDataType.DATETIME, false), new C2601b("common_friend_count", SqlDataType.INTEGER, false), new C2601b("common_like_count", SqlDataType.INTEGER, false), new C2601b("distance_miles", SqlDataType.INTEGER, false), new C2601b("downloaded", SqlDataType.BOOLEAN, false), new C2601b("failed_choice", SqlDataType.BOOLEAN, false), new C2601b("gender", SqlDataType.INTEGER, false), new C2601b("liked", SqlDataType.BOOLEAN, false), new C2601b(ManagerWebServices.PARAM_PING_TIME, SqlDataType.DATETIME, false), new C2601b(ManagerWebServices.FB_PARAM_NAME_FIRST, SqlDataType.TEXT, false), new C2601b(ManagerWebServices.PARAM_LAST_ACTIVITY_DATE, SqlDataType.TEXT, false), new C2601b("traveling", SqlDataType.BOOLEAN, false), new C2601b(ManagerWebServices.PARAM_VERIFIED, SqlDataType.BOOLEAN, false), new C2601b("is_superlike", SqlDataType.BOOLEAN, false), new C2601b(ManagerWebServices.PARAM_BADGES, SqlDataType.TEXT, false), new C2601b("username", SqlDataType.TEXT, false), new C2601b(ManagerWebServices.PARAM_TEASER, SqlDataType.TEXT, false), new C2601b("is_placeholder", SqlDataType.BOOLEAN, false), new C2601b(ManagerWebServices.PARAM_ALREADY_MATCHED, SqlDataType.BOOLEAN, false), new C2601b("photo_processing", SqlDataType.BOOLEAN, false), new C2601b(ManagerWebServices.PARAM_IS_NEW_USER, SqlDataType.BOOLEAN, false), new C2601b(ManagerWebServices.PARAM_SPOTIFY_THEM_TRACK, SqlDataType.TEXT, false), new C2601b("spotify_tracks", SqlDataType.TEXT, false), new C2601b(ManagerWebServices.PARAM_SPOTIFY_CONNECTED, SqlDataType.BOOLEAN, false), new C2601b("spotify_last_updated", SqlDataType.TEXT, false), new C2601b(ManagerWebServices.PARAM_SPOTIFY_USER_TYPE, SqlDataType.TEXT, false), new C2601b(ManagerWebServices.PARAM_SPOTIFY_USER_NAME, SqlDataType.TEXT, false), new C2601b("more_gender", SqlDataType.TEXT, false), new C2601b("show_gender", SqlDataType.BOOLEAN, false), new C2601b("going_out_data", SqlDataType.TEXT, false), new C2601b(ManagerWebServices.PARAM_INTERESTS, SqlDataType.TEXT, false), new C2601b("num_common_connections", SqlDataType.INTEGER, false), new C2601b(ManagerWebServices.PARAM_PHONE_NUMBER, SqlDataType.TEXT, false)});
    /* renamed from: b */
    private static final List<String> f12126b = Collections.unmodifiableList((List) StreamSupport.a(f12125a).map(C3871n.f12131a).collect(Collectors.a()));
    @NonNull
    /* renamed from: c */
    private static final C3868l f12127c = new C3868l();
    /* renamed from: d */
    private static boolean f12128d = true;
    /* renamed from: e */
    private static final Type f12129e = new C38691().getType();
    /* renamed from: f */
    private static final Gson f12130f = new Gson();

    /* renamed from: com.tinder.a.m$1 */
    static class C38691 extends TypeToken<List<Interest>> {
        C38691() {
        }
    }

    @NonNull
    /* renamed from: c */
    protected String mo2629c() {
        return "users";
    }

    @NonNull
    /* renamed from: e */
    static List<String> m14611e() {
        return f12126b;
    }

    @NonNull
    /* renamed from: f */
    public static String m14612f() {
        List e = C3870m.m14611e();
        StringBuilder stringBuilder = new StringBuilder();
        int size = e.size() - 1;
        for (int i = 0; i < size; i++) {
            stringBuilder.append((String) e.get(i));
            stringBuilder.append(",");
        }
        stringBuilder.append((String) e.get(size));
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static boolean m14606a(String str, boolean z) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("photo_processing", Boolean.valueOf(z));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id= '");
        stringBuilder.append(str);
        stringBuilder.append('\'');
        return C2603i.m9766b().m9774a("users", contentValues, stringBuilder.toString());
    }

    /* renamed from: a */
    public boolean m14613a(User user) {
        ContentValues contentValues = new ContentValues();
        String str = null;
        contentValues.put(ManagerWebServices.PARAM_SPOTIFY_THEM_TRACK, user.getSpotifyThemeTrack() == null ? null : user.getSpotifyThemeTrack().toJsonString());
        String str2 = "spotify_tracks";
        if (user.getSpotifyTopArtists() != null) {
            str = Artist.toListString(user.getSpotifyTopArtists());
        }
        contentValues.put(str2, str);
        contentValues.put(ManagerWebServices.PARAM_SPOTIFY_CONNECTED, Boolean.valueOf(user.isSpotifyConnected()));
        contentValues.put("spotify_last_updated", user.getSpotifyLastUpdatedAt());
        contentValues.put(ManagerWebServices.PARAM_SPOTIFY_USER_NAME, user.getSpotifyUserName());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id= '");
        stringBuilder.append(user.getId());
        stringBuilder.append('\'');
        return C2603i.m9766b().m9774a("users", contentValues, stringBuilder.toString());
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m14609b(@NonNull User user) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("user=");
        stringBuilder.append(user);
        ad.m10190a(stringBuilder.toString());
        return (!C2603i.m9766b().m9775a("users", C3870m.m14610c(user), "id", user.getId()) || f12127c.m14599a(user.getPhotos(), user.getId()) == null) ? null : true;
    }

    @NonNull
    /* renamed from: c */
    public static ContentValues m14610c(@NonNull User user) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", user.getId());
        if (user.getBirthDate() != null) {
            contentValues.put(ManagerWebServices.PARAM_BIO, user.getBio());
        }
        if (user.getBirthDate() != null) {
            contentValues.put(ManagerWebServices.PARAM_BIRTH_DATE, Long.valueOf(user.getBirthDate().getTime()));
        }
        contentValues.put("common_friend_count", Integer.valueOf(user.getCommonFriendCount()));
        contentValues.put("common_like_count", Integer.valueOf(user.getCommonLikeCount()));
        contentValues.put("distance_miles", Integer.valueOf(user.getDistanceMiles()));
        contentValues.put(ManagerWebServices.PARAM_LAST_ACTIVITY_DATE, user.getLastActivityDate());
        if (user.getGender() != null) {
            contentValues.put("gender", Integer.valueOf(user.getGender().ordinal()));
        }
        if (user.getPingTime() != null) {
            contentValues.put(ManagerWebServices.PARAM_PING_TIME, Long.valueOf(user.getPingTime().getTime()));
        }
        contentValues.put(ManagerWebServices.FB_PARAM_NAME_FIRST, user.getName());
        contentValues.put("traveling", Boolean.valueOf(user.isRecAndPassporting()));
        contentValues.put(ManagerWebServices.PARAM_VERIFIED, Boolean.valueOf(user.isVerified()));
        contentValues.put("username", user.getUsername());
        if (user.hasBadge()) {
            contentValues.put(ManagerWebServices.PARAM_BADGES, user.getFirstBadge().toString());
        }
        contentValues.put("is_superlike", Boolean.valueOf(user.isSuperLike()));
        contentValues.put("is_placeholder", Boolean.valueOf(user.isPlaceholder()));
        contentValues.put(ManagerWebServices.PARAM_ALREADY_MATCHED, Boolean.valueOf(user.isAlreadyMatched()));
        contentValues.put("photo_processing", Boolean.valueOf(user.isPhotoProcessing()));
        contentValues.put(ManagerWebServices.PARAM_IS_NEW_USER, Boolean.valueOf(user.isNewUser()));
        if (!TextUtils.isEmpty(Career.toJson(user.getCareer()))) {
            contentValues.put(ManagerWebServices.PARAM_TEASER, C15375x.a().toJson(user.getCareer(), Career.class));
        }
        if (user.getCustomGender() != null) {
            contentValues.put("more_gender", user.getCustomGender());
        }
        contentValues.put("show_gender", Boolean.valueOf(user.getShowGenderOnProfile()));
        Object obj = null;
        Object toJsonString = user.getSpotifyThemeTrack() != null ? user.getSpotifyThemeTrack().toJsonString() : null;
        if (!(user.getSpotifyTopArtists() == null || user.getSpotifyTopArtists().isEmpty())) {
            obj = Artist.toListString(user.getSpotifyTopArtists());
        }
        if (!TextUtils.isEmpty(toJsonString)) {
            contentValues.put(ManagerWebServices.PARAM_SPOTIFY_THEM_TRACK, toJsonString);
        }
        if (!TextUtils.isEmpty(user.getSpotifyLastUpdatedAt())) {
            contentValues.put("spotify_last_updated", user.getSpotifyLastUpdatedAt());
        }
        if (!TextUtils.isEmpty(obj)) {
            contentValues.put("spotify_tracks", obj);
        }
        if (user.isSpotifyConnected()) {
            contentValues.put(ManagerWebServices.PARAM_SPOTIFY_CONNECTED, Boolean.valueOf(user.isSpotifyConnected()));
        }
        if (!TextUtils.isEmpty(user.getSpotifyUserType())) {
            contentValues.put(ManagerWebServices.PARAM_SPOTIFY_USER_TYPE, user.getSpotifyUserType());
        }
        if (!TextUtils.isEmpty(user.getSpotifyUserName())) {
            contentValues.put(ManagerWebServices.PARAM_SPOTIFY_USER_NAME, user.getSpotifyUserName());
        }
        GoingOut goingOut = user.getGoingOut();
        if (goingOut != null) {
            String a = C9675a.a(f12130f, goingOut);
            contentValues.put("going_out_data", a);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("UsersTable Writing json: ");
            stringBuilder.append(a);
            ad.m10196b("GoingOutJsonSyntaxExceptionLog", stringBuilder.toString());
        }
        contentValues.put(ManagerWebServices.PARAM_INTERESTS, C15375x.a().toJson(user.getCommonInterests()));
        contentValues.put("num_common_connections", Integer.valueOf(user.getNumConnections()));
        contentValues.put(ManagerWebServices.PARAM_PHONE_NUMBER, user.getPhoneNumber());
        return contentValues;
    }

    @Nullable
    /* renamed from: a */
    public static User m14605a(@Nullable String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("userId=");
        stringBuilder.append(str);
        ad.m10190a(stringBuilder.toString());
        Cursor cursor = null;
        if (str == null) {
            return null;
        }
        try {
            String[] strArr = new String[]{"*"};
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("id='");
            stringBuilder2.append(str);
            stringBuilder2.append('\'');
            Cursor query = C2603i.m9766b().m9777c().query("users", strArr, stringBuilder2.toString(), null, null, null, null);
            try {
                if (query.moveToFirst()) {
                    User b = C3870m.m14607b(query);
                    if (!(query == null || query.isClosed())) {
                        query.close();
                    }
                    return b;
                }
                ad.m10190a("userId null or nothing in DB, not returning a user");
                if (!(query == null || query.isClosed())) {
                    query.close();
                }
                return null;
            } catch (Throwable th) {
                Throwable th2 = th;
                cursor = query;
                str = th2;
                cursor.close();
                throw str;
            }
        } catch (Throwable th3) {
            str = th3;
            if (!(cursor == null || cursor.isClosed())) {
                cursor.close();
            }
            throw str;
        }
    }

    @NonNull
    /* renamed from: b */
    public static User m14607b(@NonNull Cursor cursor) {
        Cursor cursor2 = cursor;
        String string = cursor2.getString(0);
        String string2 = cursor2.getString(1);
        Date date = new Date(cursor2.getLong(2));
        int i = cursor2.getInt(5);
        Gender gender = Gender.values()[cursor2.getInt(8)];
        String string3 = cursor2.getString(29);
        Date date2 = new Date(cursor2.getLong(10));
        String string4 = cursor2.getString(11);
        String string5 = cursor2.getString(12);
        boolean z = cursor2.getInt(13) > 0;
        boolean z2 = cursor2.getInt(14) > 0;
        boolean z3 = cursor2.getInt(15) > 0;
        String string6 = cursor2.getString(16);
        String string7 = cursor2.getString(17);
        boolean z4 = cursor2.getInt(19) > 0;
        boolean z5 = cursor2.getInt(20) > 0;
        boolean z6 = cursor2.getInt(21) > 0;
        boolean z7 = cursor2.getInt(22) > 0;
        GoingOut goingOut = null;
        SearchTrack fromString = !TextUtils.isEmpty(cursor2.getString(23)) ? SearchTrack.fromString(cursor2.getString(23)) : null;
        List fromStringToListTracks = !TextUtils.isEmpty(cursor2.getString(24)) ? Artist.fromStringToListTracks(cursor2.getString(24)) : null;
        String string8 = cursor2.getString(28);
        String string9 = cursor2.getString(26);
        String string10 = cursor2.getString(27);
        String str = string8;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C9644a.a(string6));
        String str2 = string9;
        String str3 = str;
        boolean z8 = z;
        String str4 = string3;
        boolean z9 = cursor2.getInt(25) > 0;
        User user = new User(string2, date, string, string4, date2, i, null, gender, null, f12127c.m14600b(string), string5, z2, z3, false, arrayList, string7, (Career) C15375x.a(cursor2.getString(18), Career.class), z4, z5, z6, z7, fromString, fromStringToListTracks);
        user.setRecAndPassporting(z8);
        user.setIsSpotifyConnected(z9);
        user.setSpotifyLastUpdated(str2);
        user.setSpotifyUserType(string10);
        user.setSpotifyUserName(str3);
        user.setCustomGender(str4);
        if (f12128d) {
            if (!TextUtils.isEmpty(cursor2.getString(31))) {
                goingOut = C9675a.a(f12130f, cursor2.getString(31), GoingOut.class, cursor.getColumnNames(), 31);
            }
            user.setGoingOut(goingOut);
        }
        user.setShowGenderOnProfile(cursor2.getInt(30) > 0);
        user.setCommonInterests(C3870m.m14608b(cursor2.getString(32)));
        user.setNumConnections(cursor2.getInt(33));
        user.setPhoneNumber(cursor2.getString(34));
        return user;
    }

    @NonNull
    /* renamed from: b */
    protected C2601b[] mo2628b() {
        return (C2601b[]) f12125a.toArray(new C2601b[f12125a.size()]);
    }

    @NonNull
    /* renamed from: b */
    private static List<Interest> m14608b(@Nullable String str) {
        try {
            List<Interest> list = (List) C15375x.a().fromJson(str, f12129e);
            if (list == null) {
                list = Collections.emptyList();
            }
            return list;
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error when parsing interests: ");
            stringBuilder.append(str);
            ad.m10193a(stringBuilder.toString(), e);
            return Collections.emptyList();
        }
    }
}
