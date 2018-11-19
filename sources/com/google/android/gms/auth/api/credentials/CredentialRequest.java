package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.facebook.ads.AdError;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig.C2428a;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class CredentialRequest extends zzbfm {
    public static final Creator<CredentialRequest> CREATOR = new C2436e();
    private int zzeck;
    private final boolean zzefh;
    private final String[] zzefi;
    private final CredentialPickerConfig zzefj;
    private final CredentialPickerConfig zzefk;
    private final boolean zzefl;
    private final String zzefm;
    private final String zzefn;
    private final boolean zzefo;

    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialRequest$a */
    public static final class C2429a {
        /* renamed from: a */
        private boolean f7360a;
        /* renamed from: b */
        private String[] f7361b;
        /* renamed from: c */
        private CredentialPickerConfig f7362c;
        /* renamed from: d */
        private CredentialPickerConfig f7363d;
        /* renamed from: e */
        private boolean f7364e;
        @Nullable
        /* renamed from: f */
        private String f7365f;
        @Nullable
        /* renamed from: g */
        private String f7366g;
    }

    CredentialRequest(int i, boolean z, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z2, String str, String str2, boolean z3) {
        this.zzeck = i;
        this.zzefh = z;
        this.zzefi = (String[]) ad.m9045a((Object) strArr);
        if (credentialPickerConfig == null) {
            credentialPickerConfig = new C2428a().m8785a();
        }
        this.zzefj = credentialPickerConfig;
        if (credentialPickerConfig2 == null) {
            credentialPickerConfig2 = new C2428a().m8785a();
        }
        this.zzefk = credentialPickerConfig2;
        if (i < 3) {
            this.zzefl = true;
            this.zzefm = null;
            this.zzefn = null;
        } else {
            this.zzefl = z2;
            this.zzefm = str;
            this.zzefn = str2;
        }
        this.zzefo = z3;
    }

    private CredentialRequest(C2429a c2429a) {
        this(4, c2429a.f7360a, c2429a.f7361b, c2429a.f7362c, c2429a.f7363d, c2429a.f7364e, c2429a.f7365f, c2429a.f7366g, false);
    }

    @NonNull
    public final String[] getAccountTypes() {
        return this.zzefi;
    }

    @NonNull
    public final Set<String> getAccountTypesSet() {
        return new HashSet(Arrays.asList(this.zzefi));
    }

    @NonNull
    public final CredentialPickerConfig getCredentialHintPickerConfig() {
        return this.zzefk;
    }

    @NonNull
    public final CredentialPickerConfig getCredentialPickerConfig() {
        return this.zzefj;
    }

    @Nullable
    public final String getIdTokenNonce() {
        return this.zzefn;
    }

    @Nullable
    public final String getServerClientId() {
        return this.zzefm;
    }

    @Deprecated
    public final boolean getSupportsPasswordLogin() {
        return isPasswordLoginSupported();
    }

    public final boolean isIdTokenRequested() {
        return this.zzefl;
    }

    public final boolean isPasswordLoginSupported() {
        return this.zzefh;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.a(parcel);
        oj.a(parcel, 1, isPasswordLoginSupported());
        oj.a(parcel, 2, getAccountTypes(), false);
        oj.a(parcel, 3, getCredentialPickerConfig(), i, false);
        oj.a(parcel, 4, getCredentialHintPickerConfig(), i, false);
        oj.a(parcel, 5, isIdTokenRequested());
        oj.a(parcel, 6, getServerClientId(), false);
        oj.a(parcel, 7, getIdTokenNonce(), false);
        oj.a(parcel, AdError.NETWORK_ERROR_CODE, this.zzeck);
        oj.a(parcel, 8, this.zzefo);
        oj.a(parcel, a);
    }
}
