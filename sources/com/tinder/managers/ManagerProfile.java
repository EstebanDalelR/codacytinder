package com.tinder.managers;

import android.app.Application;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.text.TextUtils;
import com.android.volley.C3001b;
import com.android.volley.Request;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.bumptech.glide.C0994i;
import com.squareup.sqlbrite.BriteDatabase;
import com.tinder.analytics.C2634g;
import com.tinder.api.CustomJsonRequest;
import com.tinder.api.EnvironmentProvider;
import com.tinder.api.JsonArrayRequestHeader;
import com.tinder.api.JsonObjectRequestHeader;
import com.tinder.api.ManagerNetwork;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.module.OkHttpQualifiers$ReauthAuthenticator;
import com.tinder.data.user.CurrentUserProvider;
import com.tinder.domain.meta.gateway.MetaGateway;
import com.tinder.domain.meta.model.DiscoverySettings;
import com.tinder.domain.meta.model.DiscoverySettings.Builder;
import com.tinder.domain.meta.model.DiscoverySettings.GenderFilter;
import com.tinder.domain.profile.model.ImageUploadRequest;
import com.tinder.enums.Gender;
import com.tinder.enums.UserPhotoSize;
import com.tinder.listeners.ListenerPhoto;
import com.tinder.listeners.ListenerUpdateProfileInfo;
import com.tinder.model.AuthResponse;
import com.tinder.model.ProfilePhoto;
import com.tinder.model.User;
import com.tinder.model.adapter.domain.CurrentUserLegacyUserAdapter;
import com.tinder.p071a.C3868l;
import com.tinder.p071a.C3870m;
import com.tinder.p257g.C9648e;
import com.tinder.profile.adapters.C14367k;
import com.tinder.profile.p364c.C14397a;
import com.tinder.session.analytics.C16579a;
import com.tinder.spotify.model.Artist;
import com.tinder.spotify.model.SearchTrack;
import com.tinder.tinderplus.p428a.C15193i;
import com.tinder.utils.C15363n;
import com.tinder.utils.ad;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import okhttp3.C17692o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.schedulers.Schedulers;

@Singleton
@Deprecated
public class ManagerProfile {
    @Nullable
    /* renamed from: a */
    private User f8304a;
    @NonNull
    /* renamed from: b */
    private final C3870m f8305b;
    @NonNull
    /* renamed from: c */
    private final C3868l f8306c;
    /* renamed from: d */
    private final bk f8307d;
    /* renamed from: e */
    private final bj f8308e;
    /* renamed from: f */
    private final ManagerNetwork f8309f;
    /* renamed from: g */
    private final C2634g f8310g;
    /* renamed from: h */
    private final C9648e f8311h;
    /* renamed from: i */
    private final C16579a f8312i;
    /* renamed from: j */
    private final BriteDatabase f8313j;
    /* renamed from: k */
    private final EnvironmentProvider f8314k;
    /* renamed from: l */
    private final C15193i f8315l;
    /* renamed from: m */
    private final Application f8316m;
    /* renamed from: n */
    private final CurrentUserProvider f8317n;
    /* renamed from: o */
    private final CurrentUserLegacyUserAdapter f8318o;
    /* renamed from: p */
    private final C17692o f8319p;
    /* renamed from: q */
    private final C14367k f8320q;
    /* renamed from: r */
    private final C14397a f8321r;
    /* renamed from: s */
    private final MetaGateway f8322s;
    /* renamed from: t */
    private JsonObjectRequestHeader f8323t;
    /* renamed from: u */
    private JsonArrayRequestHeader f8324u;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Blend {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Discoverability {
    }

    @Inject
    public ManagerProfile(bk bkVar, bj bjVar, C2634g c2634g, ManagerNetwork managerNetwork, C9648e c9648e, BriteDatabase briteDatabase, EnvironmentProvider environmentProvider, C15193i c15193i, C16579a c16579a, Application application, CurrentUserProvider currentUserProvider, CurrentUserLegacyUserAdapter currentUserLegacyUserAdapter, @OkHttpQualifiers$ReauthAuthenticator C17692o c17692o, C3870m c3870m, C3868l c3868l, C14367k c14367k, C14397a c14397a, MetaGateway metaGateway) {
        this.f8316m = application;
        this.f8319p = c17692o;
        this.f8307d = bkVar;
        this.f8308e = bjVar;
        this.f8310g = c2634g;
        this.f8309f = managerNetwork;
        this.f8311h = c9648e;
        this.f8313j = briteDatabase;
        this.f8314k = environmentProvider;
        this.f8315l = c15193i;
        this.f8305b = c3870m;
        this.f8306c = c3868l;
        this.f8312i = c16579a;
        this.f8317n = currentUserProvider;
        this.f8318o = currentUserLegacyUserAdapter;
        this.f8320q = c14367k;
        this.f8321r = c14397a;
        this.f8322s = metaGateway;
    }

    /* renamed from: a */
    private static ProfilePhoto m10061a(@NonNull ProfilePhoto profilePhoto, @NonNull List<ProfilePhoto> list) {
        int size = list.size();
        int i = 0;
        for (ProfilePhoto profilePhoto2 : list) {
            int i2 = 1;
            Object obj = (profilePhoto.clientId == null || !TextUtils.equals(profilePhoto.clientId, profilePhoto2.clientId)) ? null : 1;
            i++;
            if (i != size) {
                i2 = 0;
            }
            if (obj == null) {
                if (i2 != 0) {
                }
            }
            return profilePhoto2;
        }
        return null;
    }

    /* renamed from: a */
    public void m10100a(boolean z, SearchTrack searchTrack, List<Artist> list, String str, String str2, String str3) {
        this.f8304a = m10108c();
        if (this.f8304a != null) {
            this.f8304a.setSpotifyTopArtists(list);
            this.f8304a.setSpotifyThemeTrack(searchTrack);
            this.f8304a.setIsSpotifyConnected(z);
            this.f8304a.setSpotifyLastUpdated(str);
            this.f8304a.setSpotifyUserName(str2);
            this.f8304a.setSpotifyUserType(str3);
            this.f8305b.m14613a(this.f8304a);
        }
    }

    /* renamed from: a */
    public void m10102a(@NonNull ProfilePhoto[] profilePhotoArr, @NonNull ListenerPhoto listenerPhoto) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (ProfilePhoto profilePhoto : profilePhotoArr) {
                if (profilePhoto != null) {
                    jSONArray.put(profilePhoto.getPhotoId());
                }
            }
            jSONObject.put(ManagerWebServices.PARAM_CHANGE_ORDER, jSONArray);
            ad.m10190a(jSONObject.toString());
        } catch (Throwable e) {
            ad.m10193a("Failed to create reuqest for changing photo order", e);
        }
        this.f8324u = new JsonArrayRequestHeader(2, ManagerWebServices.PATH_MEDIA, jSONObject, new al(this, listenerPhoto), new am(listenerPhoto), C2652a.m10116a());
        this.f8324u.setRetryPolicy(new C3001b(ManagerWebServices.TIMEOUT_DEFAULT_MS, 3, 1.0f));
        this.f8309f.addRequest(this.f8324u);
    }

    /* renamed from: b */
    final /* synthetic */ void m10104b(@NonNull ListenerPhoto listenerPhoto, JSONArray jSONArray) {
        ad.m10190a("Set photo order success");
        ad.m10190a(jSONArray.toString());
        try {
            List arrayList = new ArrayList(6);
            if (m10108c() != null) {
                C9648e.a(jSONArray, arrayList);
                m10094a(arrayList);
                listenerPhoto.onSetPhotoOrderSuccess();
                return;
            }
            listenerPhoto.onSetPhotoOrderFailure();
        } catch (Throwable e) {
            ad.m10193a("Failed to parse photo reorder JSON", e);
            listenerPhoto.onSetPhotoOrderFailure();
        }
    }

    /* renamed from: b */
    static final /* synthetic */ void m10073b(@NonNull ListenerPhoto listenerPhoto, VolleyError volleyError) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(volleyError);
        stringBuilder.append(" : ");
        stringBuilder.append(volleyError.getMessage());
        ad.m10197c(stringBuilder.toString());
        listenerPhoto.onSetPhotoOrderFailure();
    }

    /* renamed from: a */
    public void m10082a(int i, int i2, @NonNull ProfilePhoto[] profilePhotoArr, @NonNull ListenerPhoto listenerPhoto) {
        ad.m10189a();
        JSONObject jSONObject = new JSONObject();
        ProfilePhoto profilePhoto = profilePhotoArr[i];
        profilePhotoArr[i] = profilePhotoArr[i2];
        profilePhotoArr[i2] = profilePhoto;
        try {
            i = new JSONArray();
            for (ProfilePhoto profilePhoto2 : profilePhotoArr) {
                if (profilePhoto2 != null) {
                    i.put(profilePhoto2.getPhotoId());
                }
            }
            jSONObject.put(ManagerWebServices.PARAM_CHANGE_ORDER, i);
            ad.m10190a(jSONObject.toString());
        } catch (Throwable e) {
            ad.m10193a("Failed to create json to swap photos", e);
        }
        JsonArrayRequestHeader jsonArrayRequestHeader = new JsonArrayRequestHeader(2, ManagerWebServices.PATH_MEDIA, jSONObject, new av(this, listenerPhoto), new ax(listenerPhoto), C2652a.m10116a());
        jsonArrayRequestHeader.setRetryPolicy(new C3001b(20000, 3, 1.0f));
        this.f8309f.addRequest(jsonArrayRequestHeader);
    }

    /* renamed from: a */
    final /* synthetic */ void m10085a(@NonNull ListenerPhoto listenerPhoto, JSONArray jSONArray) {
        ad.m10190a("Update photo success");
        ad.m10190a(jSONArray.toString());
        try {
            List arrayList = new ArrayList();
            User c = m10108c();
            if (c != null) {
                C9648e.a(jSONArray, arrayList);
                m10094a(arrayList);
                listenerPhoto.onSwapPhotosSuccess();
                this.f8317n.update(this.f8320q.b(c));
                return;
            }
            listenerPhoto.onSwapPhotosFailure();
        } catch (JSONArray jSONArray2) {
            C0001a.m30c(jSONArray2, "Failed to parse user photos", new Object[0]);
            listenerPhoto.onSwapPhotosFailure();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m10067a(@NonNull ListenerPhoto listenerPhoto, VolleyError volleyError) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(volleyError);
        stringBuilder.append(" : ");
        stringBuilder.append(volleyError.getMessage());
        ad.m10197c(stringBuilder.toString());
        listenerPhoto.onSwapPhotosFailure();
    }

    @Deprecated
    /* renamed from: a */
    public void m10079a() {
        this.f8312i.execute();
    }

    @VisibleForTesting
    /* renamed from: b */
    void m10103b() {
        if (this.f8304a == null) {
            String K = this.f8307d.m14934K();
            C3870m c3870m = this.f8305b;
            this.f8304a = C3870m.m14605a(K);
            if (this.f8304a == null) {
                ad.m10197c("My user in manager profile was null, could not reset, not saving photos");
                return;
            }
        }
        for (String d : C15363n.a(this.f8304a)) {
            m10075d(d);
        }
    }

    /* renamed from: d */
    private void m10075d(String str) {
        C0994i.m3486b(this.f8316m).m11774a(str).m15923c(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: a */
    public synchronized void m10094a(@NonNull List<ProfilePhoto> list) {
        if (this.f8304a == null) {
            ad.m10197c("mMyUser was null");
            return;
        }
        this.f8304a.setPhotos(list);
        this.f8306c.m14598a(this.f8304a.getId());
        this.f8306c.m14599a(list, this.f8304a.getId());
    }

    /* renamed from: a */
    public void m10095a(boolean z) {
        if (this.f8304a != null) {
            this.f8304a.setIsPhotoProcessing(z);
            C3870m.m14606a(this.f8304a.getId(), z);
        }
    }

    /* renamed from: a */
    public void m10081a(int i, int i2, String str, @NonNull List<String> list, @NonNull ListenerPhoto listenerPhoto, boolean z, ProfilePhoto profilePhoto, int i3) {
        String str2;
        JSONException e;
        String str3;
        boolean z2;
        ListenerPhoto listenerPhoto2;
        int i4;
        ProfilePhoto profilePhoto2;
        ay ayVar;
        az azVar;
        Request jsonArrayRequestHeader;
        ad.m10189a();
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            str2 = str;
            try {
                jSONArray.put(str2);
                for (String put : list) {
                    jSONArray.put(put);
                }
                jSONObject.put(ManagerWebServices.PARAM_CHANGE_ORDER, jSONArray);
                ad.m10190a(jSONObject.toString());
            } catch (JSONException e2) {
                e = e2;
                ad.m10197c(e.getMessage());
                str3 = ManagerWebServices.PATH_MEDIA;
                z2 = z;
                listenerPhoto2 = listenerPhoto;
                i4 = i2;
                profilePhoto2 = profilePhoto;
                ayVar = new ay(this, z2, listenerPhoto2, i4, profilePhoto2, i3, i);
                azVar = new az(this, z2, listenerPhoto2, i4, profilePhoto2, i, str2, i3);
                jsonArrayRequestHeader = new JsonArrayRequestHeader(2, str3, jSONObject, ayVar, azVar, C2652a.m10116a());
                jsonArrayRequestHeader.setRetryPolicy(new C3001b(ManagerWebServices.TIMEOUT_DEFAULT_MS, 3, 1.0f));
                this.f8309f.addRequest(jsonArrayRequestHeader);
            }
        } catch (JSONException e3) {
            e = e3;
            str2 = str;
            ad.m10197c(e.getMessage());
            str3 = ManagerWebServices.PATH_MEDIA;
            z2 = z;
            listenerPhoto2 = listenerPhoto;
            i4 = i2;
            profilePhoto2 = profilePhoto;
            ayVar = new ay(this, z2, listenerPhoto2, i4, profilePhoto2, i3, i);
            azVar = new az(this, z2, listenerPhoto2, i4, profilePhoto2, i, str2, i3);
            jsonArrayRequestHeader = new JsonArrayRequestHeader(2, str3, jSONObject, ayVar, azVar, C2652a.m10116a());
            jsonArrayRequestHeader.setRetryPolicy(new C3001b(ManagerWebServices.TIMEOUT_DEFAULT_MS, 3, 1.0f));
            this.f8309f.addRequest(jsonArrayRequestHeader);
        }
        str3 = ManagerWebServices.PATH_MEDIA;
        z2 = z;
        listenerPhoto2 = listenerPhoto;
        i4 = i2;
        profilePhoto2 = profilePhoto;
        ayVar = new ay(this, z2, listenerPhoto2, i4, profilePhoto2, i3, i);
        azVar = new az(this, z2, listenerPhoto2, i4, profilePhoto2, i, str2, i3);
        jsonArrayRequestHeader = new JsonArrayRequestHeader(2, str3, jSONObject, ayVar, azVar, C2652a.m10116a());
        jsonArrayRequestHeader.setRetryPolicy(new C3001b(ManagerWebServices.TIMEOUT_DEFAULT_MS, 3, 1.0f));
        this.f8309f.addRequest(jsonArrayRequestHeader);
    }

    /* renamed from: a */
    final /* synthetic */ void m10096a(boolean z, @NonNull ListenerPhoto listenerPhoto, int i, ProfilePhoto profilePhoto, int i2, int i3, JSONArray jSONArray) {
        ad.m10190a("Update photo success");
        ad.m10190a(jSONArray.toString());
        try {
            List arrayList = new ArrayList(6);
            if (m10108c() != null) {
                C9648e.a(jSONArray, arrayList);
                m10094a(arrayList);
                if (z) {
                    listenerPhoto.onAddPhotoSuccess(i, profilePhoto, i2);
                } else {
                    listenerPhoto.onSetMainPhotoSuccess(i3, i);
                }
            }
        } catch (Throwable e) {
            ad.m10193a("Failed to parse response JSON from adding photo and setting it to main", e);
            if (z) {
                ad.m10190a("Adding photo successful, but setting it as main not successful");
                listenerPhoto.onAddPhotoSuccess(i, profilePhoto, i2);
                return;
            }
            listenerPhoto.onSetMainPhotoFailure(i3, i);
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m10097a(boolean z, @NonNull ListenerPhoto listenerPhoto, int i, ProfilePhoto profilePhoto, int i2, String str, int i3, VolleyError volleyError) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(volleyError);
        stringBuilder.append(" : ");
        stringBuilder.append(volleyError.getMessage());
        ad.m10197c(stringBuilder.toString());
        if (z) {
            listenerPhoto.onAddPhotoFailure(i, profilePhoto);
            m10062a(i2, i, str, null, new ManagerProfile$1(this), false, false, profilePhoto, i3);
            return;
        }
        ManagerProfile managerProfile = this;
        listenerPhoto.onSetMainPhotoFailure(i2, i);
    }

    /* renamed from: a */
    public void m10090a(String str, int i, int i2, @NonNull ProfilePhoto profilePhoto, @Nullable String str2, @NonNull ListenerPhoto listenerPhoto, boolean z, ProfilePhoto profilePhoto2, int i3) {
        ProfilePhoto profilePhoto3 = profilePhoto2;
        this.f8321r.a(new ImageUploadRequest(profilePhoto3.clientId, new File(str))).m15467b(C15756a.b()).m15459a(C15674a.a()).m15456a(new ba(this, profilePhoto, profilePhoto3, str2, i, i2, listenerPhoto, z, i3), new bb(listenerPhoto, i2, profilePhoto3));
    }

    /* renamed from: a */
    final /* synthetic */ void m10087a(@NonNull ProfilePhoto profilePhoto, ProfilePhoto profilePhoto2, @Nullable String str, int i, int i2, @NonNull ListenerPhoto listenerPhoto, boolean z, int i3, List list) throws Exception {
        ManagerProfile managerProfile = this;
        List list2 = list;
        ProfilePhoto a = m10061a(profilePhoto, list2);
        ProfilePhoto profilePhoto3 = a == null ? profilePhoto2 : a;
        String photoId = ((ProfilePhoto) list2.get(list.size() - 1)).getPhotoId();
        m10075d(profilePhoto3.getProcessedPhoto(UserPhotoSize.LARGE).imageUrl);
        if (str != null) {
            m10062a(i, i2, str, photoId, listenerPhoto, true, z, profilePhoto3, i3);
        } else if (z) {
            m10081a(i, i2, photoId, m10108c().getOtherPhotoIds(photoId), listenerPhoto, true, profilePhoto3, i3);
        } else {
            m10094a(list2);
            listenerPhoto.onAddPhotoSuccess(i2, profilePhoto3, i3);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m10066a(@NonNull ListenerPhoto listenerPhoto, int i, ProfilePhoto profilePhoto, Throwable th) throws Exception {
        C0001a.m30c(th, "Failed to upload profile photo", new Object[0]);
        listenerPhoto.onAddPhotoFailure(i, profilePhoto);
    }

    /* renamed from: a */
    public void m10080a(int i, int i2, @NonNull ProfilePhoto profilePhoto, @Nullable String str, @NonNull ListenerPhoto listenerPhoto, boolean z, ProfilePhoto profilePhoto2, int i3) {
        ProfilePhoto profilePhoto3 = profilePhoto;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("isMain=");
        boolean z2 = z;
        stringBuilder.append(z2);
        ad.m10190a(stringBuilder.toString());
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", profilePhoto3.facebookId);
            jSONObject2.put(ManagerWebServices.PARAM_XDISTANCE_PERCENT, (double) profilePhoto3.xDistancePercent);
            jSONObject2.put(ManagerWebServices.PARAM_YDISTANCE_PERCENT, (double) profilePhoto3.yDistancePercent);
            jSONObject2.put(ManagerWebServices.PARAM_XOFFSET_PERCENT, (double) profilePhoto3.xOffsetPercent);
            jSONObject2.put(ManagerWebServices.PARAM_YOFFSET_PERCENT, (double) profilePhoto3.yOffsetPercent);
            jSONArray.put(jSONObject2);
            jSONObject.put(ManagerWebServices.PARAM_KEY_SOURCE, ManagerWebServices.PARAM_PHOTOS_SOURCE);
            jSONObject.put(ManagerWebServices.PARAM_KEY_ASSETS, jSONArray);
            ad.m10190a(jSONObject.toString());
        } catch (JSONException e) {
            ad.m10197c(e.getMessage());
        }
        ad.m10190a(jSONObject.toString());
        String str2 = ManagerWebServices.PATH_MEDIA;
        bc bcVar = new bc(this, profilePhoto3, profilePhoto2, str, i, i2, listenerPhoto, z2, i3);
        int i4 = 1;
        String str3 = str2;
        JSONObject jSONObject3 = jSONObject;
        bc bcVar2 = bcVar;
        Request jsonObjectRequestHeader = new JsonObjectRequestHeader(i4, str3, jSONObject3, bcVar2, new bd(listenerPhoto, i2, profilePhoto2), C2652a.m10116a());
        jsonObjectRequestHeader.setRetryPolicy(new C3001b(ManagerWebServices.TIMEOUT_DEFAULT_MS, 3, 1.0f));
        this.f8309f.addRequest(jsonObjectRequestHeader);
    }

    /* renamed from: a */
    final /* synthetic */ void m10088a(@NonNull ProfilePhoto profilePhoto, ProfilePhoto profilePhoto2, @Nullable String str, int i, int i2, @NonNull ListenerPhoto listenerPhoto, boolean z, int i3, JSONObject jSONObject) {
        ManagerProfile managerProfile = this;
        int i4 = i2;
        ListenerPhoto listenerPhoto2 = listenerPhoto;
        ad.m10190a("Add photo success");
        ad.m10190a(jSONObject.toString());
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(ManagerWebServices.PARAM_KEY_ASSETS);
            List arrayList = new ArrayList(6);
            User c = m10108c();
            if (c != null) {
                C9648e c9648e = managerProfile.f8311h;
                C9648e.a(jSONArray, arrayList);
                ProfilePhoto a = m10061a(profilePhoto, arrayList);
                ProfilePhoto profilePhoto3 = a == null ? profilePhoto2 : a;
                String photoId = ((ProfilePhoto) arrayList.get(arrayList.size() - 1)).getPhotoId();
                if (str != null) {
                    m10062a(i, i4, str, photoId, listenerPhoto2, true, z, profilePhoto3, i3);
                } else if (z) {
                    m10081a(i, i4, photoId, c.getOtherPhotoIds(photoId), listenerPhoto2, true, profilePhoto3, i3);
                } else {
                    m10094a(arrayList);
                    listenerPhoto2.onAddPhotoSuccess(i4, profilePhoto3, i3);
                }
            }
        } catch (Throwable e) {
            ad.m10193a("Failed to parse JSON add photo response", e);
            listenerPhoto2.onAddPhotoFailure(i4, profilePhoto2);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m10065a(@NonNull ListenerPhoto listenerPhoto, int i, ProfilePhoto profilePhoto, VolleyError volleyError) {
        C0001a.m30c(volleyError, ManagerWebServices.PATH_MEDIA, new Object[0]);
        listenerPhoto.onAddPhotoFailure(i, profilePhoto);
    }

    /* renamed from: a */
    private void m10062a(int i, int i2, String str, String str2, @NonNull ListenerPhoto listenerPhoto, boolean z, boolean z2, ProfilePhoto profilePhoto, int i3) {
        String str3 = str;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("photoIdToDelete=");
        stringBuilder.append(str3);
        stringBuilder.append(", photoIdAdded=");
        String str4 = str2;
        stringBuilder.append(str4);
        stringBuilder.append(", isDeletingAfterAdd=");
        boolean z3 = z;
        stringBuilder.append(z3);
        stringBuilder.append(", isMain=");
        boolean z4 = z2;
        stringBuilder.append(z4);
        ad.m10190a(stringBuilder.toString());
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str3);
            jSONObject.put(ManagerWebServices.PARAM_KEY_ASSETS, jSONArray);
            ad.m10190a(jSONObject.toString());
        } catch (Throwable e) {
            ad.m10193a("Failed to build delete photo json", e);
        }
        new ManagerProfile$2(this, jSONObject, z3, z4, i, i2, str4, listenerPhoto, profilePhoto, i3).execute((Void[]) null);
    }

    /* renamed from: a */
    public void m10093a(@NonNull ArrayList<String> arrayList, @NonNull ArrayList<Integer> arrayList2, @NonNull ListenerPhoto listenerPhoto) {
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("The number of photo ids should match the number of indices handed in.");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("photoIdsToDelete=");
        stringBuilder.append(arrayList);
        ad.m10190a(stringBuilder.toString());
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
            jSONObject.put(ManagerWebServices.PARAM_KEY_ASSETS, jSONArray);
            ad.m10190a(jSONObject.toString());
        } catch (Throwable e) {
            ad.m10193a("Failed to make json for photo delete", e);
        }
        new ManagerProfile$3(this, jSONObject, arrayList, listenerPhoto, arrayList2).execute((Void[]) null);
    }

    @Nullable
    @Deprecated
    /* renamed from: c */
    public User m10108c() {
        if (this.f8304a == null) {
            String K = this.f8307d.m14934K();
            C3870m c3870m = this.f8305b;
            this.f8304a = C3870m.m14605a(K);
        }
        return this.f8304a;
    }

    @Deprecated
    /* renamed from: d */
    public Observable<User> m10111d() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Select ");
        stringBuilder.append(C3870m.m14612f());
        stringBuilder.append(" from ");
        stringBuilder.append("users");
        stringBuilder.append(" where id=\"");
        stringBuilder.append(this.f8307d.m14934K());
        stringBuilder.append("\"");
        return this.f8313j.a("users", stringBuilder.toString(), new String[0]).a(an.f42484a).k(new ao(this));
    }

    /* renamed from: c */
    final /* synthetic */ User m10109c(User user) {
        User user2 = this.f8304a;
        if (user2 != null) {
            user.setCommonInterests(user2.getCommonInterests());
            user.setUncommonInterests(user2.getUncommonInterests());
            user.setNumConnections(user2.getNumConnections());
            user.setConnections(user2.getConnections());
        }
        return user;
    }

    @Deprecated
    /* renamed from: e */
    public Observable<User> m10113e() {
        return Observable.a(new ap(this));
    }

    /* renamed from: g */
    final /* synthetic */ User m10115g() throws Exception {
        return m10108c();
    }

    @VisibleForTesting
    @Deprecated
    /* renamed from: a */
    void m10099a(boolean z, @NonNull User user, float f, int i, int i2, boolean z2) {
        if (this.f8304a != null && user.getPhotoCount() == 0) {
            user.setPhotos(this.f8304a.getPhotos());
        }
        this.f8304a = null;
        if (z) {
            z = this.f8305b;
            C3870m.m14609b(user);
        }
        this.f8304a = m10108c();
        if (this.f8304a) {
            this.f8304a.setCommonInterests(user.getCommonInterests());
            this.f8304a.setUncommonInterests(user.getUncommonInterests());
            this.f8304a.setNumConnections(user.getNumConnections());
            this.f8304a.setConnections(user.getConnections());
        } else {
            this.f8304a = user;
        }
        this.f8307d.m14966d(user.getId());
        m10103b();
        this.f8308e.m10140e(z2);
        this.f8308e.m10139d(user.isInterestedInMales());
        this.f8308e.m10137c(user.isInterestedInFemales());
        this.f8308e.m10129a(f);
        this.f8308e.m10130a(i);
        this.f8308e.m10134b(i2);
        this.f8317n.update(this.f8318o.adapt(user));
    }

    /* renamed from: a */
    private void m10070a(JSONObject jSONObject, @Nullable ListenerUpdateProfileInfo listenerUpdateProfileInfo) {
        this.f8323t = new JsonObjectRequestHeader(1, ManagerWebServices.URL_PROFILE, jSONObject, new aq(this, listenerUpdateProfileInfo), new ar(listenerUpdateProfileInfo), C2652a.m10116a());
        this.f8309f.addRequest(this.f8323t);
    }

    /* renamed from: a */
    final /* synthetic */ void m10086a(@Nullable ListenerUpdateProfileInfo listenerUpdateProfileInfo, JSONObject jSONObject) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Updated profile: ");
        stringBuilder.append(jSONObject);
        ad.m10200e(stringBuilder.toString());
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(ManagerWebServices.PARAM_USER, jSONObject);
        } catch (Throwable e) {
            ad.m10193a("Failed to retrieve user object in json", e);
        }
        Builder builder = DiscoverySettings.builder();
        try {
            builder.genderFilter(GenderFilter.fromValue(jSONObject.getInt(ManagerWebServices.PARAM_GENDER_FILTER)));
        } catch (Throwable e2) {
            ad.m10194a(e2);
            builder.genderFilter(DiscoverySettings.DEFAULT_GENDER_FILTER);
        }
        AuthResponse a = this.f8311h.a(jSONObject2);
        this.f8322s.updateDiscoverySettings(builder.minAgeFilter(a.getAgeMin()).maxAgeFilter(a.getAgeMax()).isDiscoverable(a.isDiscoverable()).distanceFilter(a.getDistanceFilter()).build()).m10386b(Schedulers.io()).m10381a(au.f44556a, aw.f44557a);
        m10078a(true, a);
        if (listenerUpdateProfileInfo != null) {
            listenerUpdateProfileInfo.onProfileUpdateSuccess();
        }
        m10079a();
    }

    /* renamed from: a */
    static final /* synthetic */ void m10068a(@Nullable ListenerUpdateProfileInfo listenerUpdateProfileInfo, VolleyError volleyError) {
        C0001a.m29c(volleyError);
        if (listenerUpdateProfileInfo != null) {
            listenerUpdateProfileInfo.onProfileUpdateFailed();
        }
    }

    /* renamed from: a */
    public void m10083a(long j, @NonNull ListenerUpdateProfileInfo listenerUpdateProfileInfo) {
        JSONObject jSONObject = new JSONObject();
        if (j > 0) {
            try {
                jSONObject.put(ManagerWebServices.PARAM_BIRTH_DATE, j);
            } catch (Throwable e) {
                ad.m10194a(e);
                return;
            }
        }
        m10070a(jSONObject, listenerUpdateProfileInfo);
    }

    /* renamed from: a */
    public void m10084a(@Nullable Gender gender, long j, @NonNull ListenerUpdateProfileInfo listenerUpdateProfileInfo) {
        JSONObject jSONObject = new JSONObject();
        if (gender != null) {
            try {
                jSONObject.put("gender", gender.getBackendId());
            } catch (Throwable e) {
                ad.m10194a(e);
                return;
            }
        }
        if (j > 0) {
            jSONObject.put(ManagerWebServices.PARAM_BIRTH_DATE, j);
        }
        m10070a(jSONObject, listenerUpdateProfileInfo);
    }

    @Deprecated
    /* renamed from: a */
    public void m10101a(boolean z, boolean z2, boolean z3, float f, int i, int i2, @Nullable String str, boolean z4, @NonNull ListenerUpdateProfileInfo listenerUpdateProfileInfo) {
        boolean z5;
        ManagerProfile managerProfile = this;
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        int i5 = 1;
        if (z2 && z3) {
            managerProfile.f8310g.m9881b(-1);
        } else if (z2) {
            managerProfile.f8310g.m9881b(0);
        } else {
            managerProfile.f8310g.m9881b(1);
        }
        float f2 = f;
        managerProfile.f8310g.m9875a(f2);
        managerProfile.f8310g.m9895g(i3);
        managerProfile.f8310g.m9897h(i4);
        JSONObject jSONObject = new JSONObject();
        if (z3 && z2) {
            i5 = -1;
        } else if (z2) {
            i5 = 0;
        }
        if (str2 != null) {
            try {
                if (managerProfile.f8315l.a()) {
                    jSONObject.put(ManagerWebServices.PARAM_BLEND, str2);
                }
            } catch (JSONException e) {
                JSONException e2 = e;
                z5 = z;
                ad.m10197c(e2.toString());
                if (managerProfile.f8304a != null) {
                    m10099a(false, managerProfile.f8304a, f2, i3, i4, z5);
                }
                m10070a(jSONObject, listenerUpdateProfileInfo);
            }
        }
        z5 = z;
        try {
            jSONObject.put(ManagerWebServices.PARAM_DISCOVERABLE, z5);
            jSONObject.put(ManagerWebServices.PARAM_GENDER_FILTER, i5);
            jSONObject.put(ManagerWebServices.PARAM_AGE_FILTER_MIN, i3);
            jSONObject.put(ManagerWebServices.PARAM_AGE_FILTER_MAX, i4);
            jSONObject.put(ManagerWebServices.PARAM_DISTANCE_FILTER, Math.round(f));
            jSONObject.put("squads_discoverable", z4);
        } catch (JSONException e3) {
            e2 = e3;
            ad.m10197c(e2.toString());
            if (managerProfile.f8304a != null) {
                m10099a(false, managerProfile.f8304a, f2, i3, i4, z5);
            }
            m10070a(jSONObject, listenerUpdateProfileInfo);
        }
        if (managerProfile.f8304a != null) {
            m10099a(false, managerProfile.f8304a, f2, i3, i4, z5);
        }
        m10070a(jSONObject, listenerUpdateProfileInfo);
    }

    @Deprecated
    /* renamed from: a */
    public void m10098a(boolean z, @NonNull ListenerUpdateProfileInfo listenerUpdateProfileInfo) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ManagerWebServices.PARAM_DISCOVERABLE, z);
            m10070a(jSONObject, listenerUpdateProfileInfo);
        } catch (boolean z2) {
            ad.m10197c(z2.toString());
            listenerUpdateProfileInfo.onProfileUpdateFailed();
        }
    }

    @Deprecated
    @NonNull
    /* renamed from: a */
    public AuthResponse m10078a(boolean z, AuthResponse authResponse) {
        User user = authResponse.getUser();
        if (user != null) {
            user.setHideAge(authResponse.isHideAge());
            user.setHideAds(authResponse.isHideAds());
            user.setHideDistance(authResponse.isHideDistance());
            m10099a(z, user, (float) authResponse.getDistanceFilter(), authResponse.getAgeMin(), authResponse.getAgeMax(), authResponse.isDiscoverable());
        } else {
            ad.m10197c("User in the parsed profile was null!");
        }
        return authResponse;
    }

    /* renamed from: a */
    public void m10089a(@NonNull User user) {
        m10099a(true, user, (float) user.getDistanceFilter(), user.getAgeFilterMin(), user.getAgeFilterMax(), user.isDiscoverable());
    }

    /* renamed from: a */
    void m10091a(String str, Listener<String> listener, ErrorListener errorListener) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ManagerWebServices.URL_GET_USER_BY_LINK_IDENTIFIER);
        stringBuilder.append(str);
        this.f8309f.addRequest(new CustomJsonRequest(0, stringBuilder.toString(), CustomJsonRequest.getTinderHeaders(), m10076e(str), new as(listener), new at(errorListener)));
    }

    @Deprecated
    /* renamed from: a */
    public void m10092a(String str, ListenerUpdateProfileInfo listenerUpdateProfileInfo) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ManagerWebServices.PARAM_BLEND, str);
        } catch (String str2) {
            ad.m10197c(str2.getMessage());
        }
        m10070a(jSONObject, listenerUpdateProfileInfo);
    }

    /* renamed from: a */
    public static int m10059a(@NonNull String str) {
        int hashCode = str.hashCode();
        if (hashCode != -2023617739) {
            if (hashCode != -1249477246) {
                if (hashCode != 288459765) {
                    if (hashCode == 1082295151) {
                        if (str.equals("recency") != null) {
                            str = 3;
                            switch (str) {
                                case null:
                                    return 0;
                                case 1:
                                    return 1;
                                case 2:
                                    return 2;
                                case 3:
                                    return 3;
                                default:
                                    return 0;
                            }
                        }
                    }
                } else if (str.equals("distance") != null) {
                    str = 2;
                    switch (str) {
                        case null:
                            return 0;
                        case 1:
                            return 1;
                        case 2:
                            return 2;
                        case 3:
                            return 3;
                        default:
                            return 0;
                    }
                }
            } else if (str.equals("optimal") != null) {
                str = null;
                switch (str) {
                    case null:
                        return 0;
                    case 1:
                        return 1;
                    case 2:
                        return 2;
                    case 3:
                        return 3;
                    default:
                        return 0;
                }
            }
        } else if (str.equals(ManagerWebServices.PARAM_SPOTIFY_POPULARITY) != null) {
            str = true;
            switch (str) {
                case null:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                default:
                    return 0;
            }
        }
        str = -1;
        switch (str) {
            case null:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            default:
                return 0;
        }
    }

    @Deprecated
    /* renamed from: b */
    public void m10106b(@NonNull String str, ListenerUpdateProfileInfo listenerUpdateProfileInfo) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ManagerWebServices.PARAM_DISCOVERABILITY, str);
        } catch (Throwable e) {
            ad.m10193a("Unable to put discoverability string in JSON Object", e);
        }
        m10070a(jSONObject, listenerUpdateProfileInfo);
    }

    @Deprecated
    /* renamed from: b */
    public void m10107b(boolean z, ListenerUpdateProfileInfo listenerUpdateProfileInfo) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ManagerWebServices.PARAM_HIDE_DISTANCE, z);
        } catch (Throwable e) {
            ad.m10193a("Unable to put hide distance boolean in JSON Object", e);
        }
        m10070a(jSONObject, listenerUpdateProfileInfo);
    }

    @Deprecated
    /* renamed from: c */
    public void m10110c(boolean z, ListenerUpdateProfileInfo listenerUpdateProfileInfo) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ManagerWebServices.PARAM_HIDE_AGE, z);
        } catch (Throwable e) {
            ad.m10193a("Unable to put hide age boolean in JSON Object", e);
        }
        m10070a(jSONObject, listenerUpdateProfileInfo);
    }

    @Deprecated
    /* renamed from: d */
    public void m10112d(boolean z, ListenerUpdateProfileInfo listenerUpdateProfileInfo) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ManagerWebServices.PARAM_HIDE_ADS, z);
        } catch (Throwable e) {
            ad.m10193a("Unable to put hide ads boolean in JSON Object", e);
        }
        m10070a(jSONObject, listenerUpdateProfileInfo);
    }

    /* renamed from: e */
    private String m10076e(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("username", str);
        } catch (Throwable e) {
            ad.m10193a("Failed to add username to JSON", e);
        }
        return jSONObject.toString();
    }

    /* renamed from: e */
    public void m10114e(boolean z, ListenerUpdateProfileInfo listenerUpdateProfileInfo) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ManagerWebServices.PARAM_PHOTO_OPTIMIZED, z);
        } catch (Throwable e) {
            ad.m10193a("failed to created json to update photo optimized value", e);
        }
        m10070a(jSONObject, listenerUpdateProfileInfo);
    }

    @Deprecated
    /* renamed from: b */
    public static String m10071b(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return "optimal";
        }
        if (str.equalsIgnoreCase("optimal")) {
            return "optimal";
        }
        if (str.equalsIgnoreCase(ManagerWebServices.PARAM_SPOTIFY_POPULARITY)) {
            return ManagerWebServices.PARAM_SPOTIFY_POPULARITY;
        }
        if (str.equalsIgnoreCase("distance")) {
            return "distance";
        }
        return str.equalsIgnoreCase("recency") != null ? "recency" : "optimal";
    }

    @Deprecated
    /* renamed from: c */
    public static String m10074c(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return "everyone";
        }
        if (str.equals("everyone")) {
            return "everyone";
        }
        if (str.equals("liked")) {
            return "liked";
        }
        return str.equals("outside_fb") != null ? "outside_fb" : "everyone";
    }

    @Deprecated
    /* renamed from: b */
    public void m10105b(@Nullable User user) {
        this.f8304a = user;
    }
}
