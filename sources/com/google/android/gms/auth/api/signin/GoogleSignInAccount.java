package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.util.C3827e;
import com.google.android.gms.common.util.zzd;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInAccount extends zzbfm implements ReflectedParcelable {
    public static final Creator<GoogleSignInAccount> CREATOR = new C2447c();
    private static zzd zzegr = C3827e.m14460a();
    private int versionCode;
    private String zzbuz;
    private List<Scope> zzecp;
    private String zzefb;
    private String zzefc;
    private String zzefs;
    private String zzegs;
    private String zzegt;
    private Uri zzegu;
    private String zzegv;
    private long zzegw;
    private String zzegx;
    private Set<Scope> zzegy = new HashSet();

    GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.versionCode = i;
        this.zzbuz = str;
        this.zzefs = str2;
        this.zzegs = str3;
        this.zzegt = str4;
        this.zzegu = uri;
        this.zzegv = str5;
        this.zzegw = j;
        this.zzegx = str6;
        this.zzecp = list;
        this.zzefb = str7;
        this.zzefc = str8;
    }

    private final JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (getId() != null) {
                jSONObject.put("id", getId());
            }
            if (getIdToken() != null) {
                jSONObject.put("tokenId", getIdToken());
            }
            if (getEmail() != null) {
                jSONObject.put("email", getEmail());
            }
            if (getDisplayName() != null) {
                jSONObject.put("displayName", getDisplayName());
            }
            if (getGivenName() != null) {
                jSONObject.put("givenName", getGivenName());
            }
            if (getFamilyName() != null) {
                jSONObject.put("familyName", getFamilyName());
            }
            if (getPhotoUrl() != null) {
                jSONObject.put("photoUrl", getPhotoUrl().toString());
            }
            if (getServerAuthCode() != null) {
                jSONObject.put("serverAuthCode", getServerAuthCode());
            }
            jSONObject.put("expirationTime", this.zzegw);
            jSONObject.put("obfuscatedIdentifier", this.zzegx);
            JSONArray jSONArray = new JSONArray();
            Scope[] scopeArr = (Scope[]) this.zzecp.toArray(new Scope[this.zzecp.size()]);
            Arrays.sort(scopeArr, C2446b.f7390a);
            for (Scope zzagw : scopeArr) {
                jSONArray.put(zzagw.zzagw());
            }
            jSONObject.put("grantedScopes", jSONArray);
            return jSONObject;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private static GoogleSignInAccount zza(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Uri uri, @Nullable Long l, @NonNull String str7, @NonNull Set<Scope> set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, (l == null ? Long.valueOf(zzegr.currentTimeMillis() / 1000) : l).longValue(), ad.m9047a(str7), new ArrayList((Collection) ad.m9045a((Object) set)), str5, str6);
    }

    public static GoogleSignInAccount zzaaz() {
        Account account = new Account("<<default account>>", "com.google");
        return zza(null, null, account.name, null, null, null, null, Long.valueOf(0), account.name, new HashSet());
    }

    @Nullable
    public static GoogleSignInAccount zzeu(@Nullable String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        Object optString = jSONObject.optString("photoUrl", null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        Set hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount zza = zza(jSONObject.optString("id"), jSONObject.optString("tokenId", null), jSONObject.optString("email", null), jSONObject.optString("displayName", null), jSONObject.optString("givenName", null), jSONObject.optString("familyName", null), parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        zza.zzegv = jSONObject.optString("serverAuthCode", null);
        return zza;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.zzegx.equals(this.zzegx) && googleSignInAccount.zzabb().equals(zzabb());
    }

    @Nullable
    public Account getAccount() {
        return this.zzegs == null ? null : new Account(this.zzegs, "com.google");
    }

    @Nullable
    public String getDisplayName() {
        return this.zzegt;
    }

    @Nullable
    public String getEmail() {
        return this.zzegs;
    }

    @Nullable
    public String getFamilyName() {
        return this.zzefc;
    }

    @Nullable
    public String getGivenName() {
        return this.zzefb;
    }

    @NonNull
    public Set<Scope> getGrantedScopes() {
        return new HashSet(this.zzecp);
    }

    @Nullable
    public String getId() {
        return this.zzbuz;
    }

    @Nullable
    public String getIdToken() {
        return this.zzefs;
    }

    @Nullable
    public Uri getPhotoUrl() {
        return this.zzegu;
    }

    @Nullable
    public String getServerAuthCode() {
        return this.zzegv;
    }

    public int hashCode() {
        return ((this.zzegx.hashCode() + 527) * 31) + zzabb().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = oj.a(parcel);
        oj.a(parcel, 1, this.versionCode);
        oj.a(parcel, 2, getId(), false);
        oj.a(parcel, 3, getIdToken(), false);
        oj.a(parcel, 4, getEmail(), false);
        oj.a(parcel, 5, getDisplayName(), false);
        oj.a(parcel, 6, getPhotoUrl(), i, false);
        oj.a(parcel, 7, getServerAuthCode(), false);
        oj.a(parcel, 8, this.zzegw);
        oj.a(parcel, 9, this.zzegx, false);
        oj.c(parcel, 10, this.zzecp, false);
        oj.a(parcel, 11, getGivenName(), false);
        oj.a(parcel, 12, getFamilyName(), false);
        oj.a(parcel, a);
    }

    public final GoogleSignInAccount zza(Scope... scopeArr) {
        if (scopeArr != null) {
            Collections.addAll(this.zzegy, scopeArr);
        }
        return this;
    }

    public final boolean zza() {
        return zzegr.currentTimeMillis() / 1000 >= this.zzegw - 300;
    }

    @NonNull
    public final String zzaba() {
        return this.zzegx;
    }

    @NonNull
    public final Set<Scope> zzabb() {
        Set<Scope> hashSet = new HashSet(this.zzecp);
        hashSet.addAll(this.zzegy);
        return hashSet;
    }

    public final String zzabc() {
        JSONObject toJsonObject = toJsonObject();
        toJsonObject.remove("serverAuthCode");
        return toJsonObject.toString();
    }
}
