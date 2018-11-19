package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;

public final class IdToken extends zzbfm implements ReflectedParcelable {
    public static final Creator<IdToken> CREATOR = new C2439h();
    @NonNull
    private final String zzeem;
    @NonNull
    private final String zzefs;

    public IdToken(@NonNull String str, @NonNull String str2) {
        ad.m9055b(TextUtils.isEmpty(str) ^ 1, "account type string cannot be null or empty");
        ad.m9055b(TextUtils.isEmpty(str2) ^ 1, "id token string cannot be null or empty");
        this.zzeem = str;
        this.zzefs = str2;
    }

    @NonNull
    public final String getAccountType() {
        return this.zzeem;
    }

    @NonNull
    public final String getIdToken() {
        return this.zzefs;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = oj.a(parcel);
        oj.a(parcel, 1, getAccountType(), false);
        oj.a(parcel, 2, getIdToken(), false);
        oj.a(parcel, i);
    }
}
