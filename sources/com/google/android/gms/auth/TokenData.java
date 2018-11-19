package com.google.android.gms.auth;

import android.os.Bundle;
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
import java.util.List;

public class TokenData extends zzbfm implements ReflectedParcelable {
    public static final Creator<TokenData> CREATOR = new C2460d();
    private int zzeck;
    private final String zzecl;
    private final Long zzecm;
    private final boolean zzecn;
    private final boolean zzeco;
    private final List<String> zzecp;

    TokenData(int i, String str, Long l, boolean z, boolean z2, List<String> list) {
        this.zzeck = i;
        this.zzecl = ad.m9047a(str);
        this.zzecm = l;
        this.zzecn = z;
        this.zzeco = z2;
        this.zzecp = list;
    }

    @Nullable
    public static TokenData zzd(Bundle bundle, String str) {
        bundle.setClassLoader(TokenData.class.getClassLoader());
        bundle = bundle.getBundle(str);
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(TokenData.class.getClassLoader());
        return (TokenData) bundle.getParcelable("TokenData");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.zzecl, tokenData.zzecl) && C2507w.m9173a(this.zzecm, tokenData.zzecm) && this.zzecn == tokenData.zzecn && this.zzeco == tokenData.zzeco && C2507w.m9173a(this.zzecp, tokenData.zzecp);
    }

    public final String getToken() {
        return this.zzecl;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzecl, this.zzecm, Boolean.valueOf(this.zzecn), Boolean.valueOf(this.zzeco), this.zzecp});
    }

    public void writeToParcel(Parcel parcel, int i) {
        i = oj.a(parcel);
        oj.a(parcel, 1, this.zzeck);
        oj.a(parcel, 2, this.zzecl, false);
        oj.a(parcel, 3, this.zzecm, false);
        oj.a(parcel, 4, this.zzecn);
        oj.a(parcel, 5, this.zzeco);
        oj.b(parcel, 6, this.zzecp, false);
        oj.a(parcel, i);
    }
}
