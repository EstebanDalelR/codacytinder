package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C2507w;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Credential extends zzbfm implements ReflectedParcelable {
    public static final Creator<Credential> CREATOR = new C2432a();
    public static final String EXTRA_KEY = "com.google.android.gms.credentials.Credential";
    @Nullable
    private final String mName;
    private final String zzbuz;
    @Nullable
    private final String zzeem;
    @Nullable
    private final Uri zzeew;
    private final List<IdToken> zzeex;
    @Nullable
    private final String zzeey;
    @Nullable
    private final String zzeez;
    @Nullable
    private final String zzefa;
    @Nullable
    private final String zzefb;
    @Nullable
    private final String zzefc;

    Credential(String str, String str2, Uri uri, List<IdToken> list, String str3, String str4, String str5, String str6, String str7, String str8) {
        str = ((String) ad.m9046a((Object) str, (Object) "credential identifier cannot be null")).trim();
        ad.m9048a(str, (Object) "credential identifier cannot be empty");
        if (str3 == null || !TextUtils.isEmpty(str3)) {
            if (str4 != null) {
                boolean z = false;
                if (!TextUtils.isEmpty(str4)) {
                    Uri parse = Uri.parse(str4);
                    if (parse.isAbsolute() && parse.isHierarchical() && !TextUtils.isEmpty(parse.getScheme())) {
                        if (!TextUtils.isEmpty(parse.getAuthority())) {
                            if ("http".equalsIgnoreCase(parse.getScheme()) || "https".equalsIgnoreCase(parse.getScheme())) {
                                z = true;
                            }
                        }
                    }
                }
                if (!Boolean.valueOf(z).booleanValue()) {
                    throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
                }
            }
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                if (str2 != null && TextUtils.isEmpty(str2.trim())) {
                    str2 = null;
                }
                this.mName = str2;
                this.zzeew = uri;
                this.zzeex = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
                this.zzbuz = str;
                this.zzeey = str3;
                this.zzeem = str4;
                this.zzeez = str5;
                this.zzefa = str6;
                this.zzefb = str7;
                this.zzefc = str8;
                return;
            }
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        throw new IllegalArgumentException("Password must not be empty if set");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.zzbuz, credential.zzbuz) && TextUtils.equals(this.mName, credential.mName) && C2507w.m9173a(this.zzeew, credential.zzeew) && TextUtils.equals(this.zzeey, credential.zzeey) && TextUtils.equals(this.zzeem, credential.zzeem) && TextUtils.equals(this.zzeez, credential.zzeez);
    }

    @Nullable
    public String getAccountType() {
        return this.zzeem;
    }

    @Nullable
    public String getFamilyName() {
        return this.zzefc;
    }

    @Nullable
    public String getGeneratedPassword() {
        return this.zzeez;
    }

    @Nullable
    public String getGivenName() {
        return this.zzefb;
    }

    public String getId() {
        return this.zzbuz;
    }

    public List<IdToken> getIdTokens() {
        return this.zzeex;
    }

    @Nullable
    public String getName() {
        return this.mName;
    }

    @Nullable
    public String getPassword() {
        return this.zzeey;
    }

    @Nullable
    public Uri getProfilePictureUri() {
        return this.zzeew;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzbuz, this.mName, this.zzeew, this.zzeey, this.zzeem, this.zzeez});
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = oj.a(parcel);
        oj.a(parcel, 1, getId(), false);
        oj.a(parcel, 2, getName(), false);
        oj.a(parcel, 3, getProfilePictureUri(), i, false);
        oj.c(parcel, 4, getIdTokens(), false);
        oj.a(parcel, 5, getPassword(), false);
        oj.a(parcel, 6, getAccountType(), false);
        oj.a(parcel, 7, getGeneratedPassword(), false);
        oj.a(parcel, 8, this.zzefa, false);
        oj.a(parcel, 9, getGivenName(), false);
        oj.a(parcel, 10, getFamilyName(), false);
        oj.a(parcel, a);
    }
}
