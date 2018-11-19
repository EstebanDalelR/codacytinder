package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.facebook.ads.AdError;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig.C2428a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;

public final class HintRequest extends zzbfm implements ReflectedParcelable {
    public static final Creator<HintRequest> CREATOR = new C2438g();
    private int zzeck;
    private final String[] zzefi;
    private final boolean zzefl;
    private final String zzefm;
    private final String zzefn;
    private final CredentialPickerConfig zzefp;
    private final boolean zzefq;
    private final boolean zzefr;

    /* renamed from: com.google.android.gms.auth.api.credentials.HintRequest$a */
    public static final class C2430a {
        /* renamed from: a */
        private boolean f7367a;
        /* renamed from: b */
        private boolean f7368b;
        /* renamed from: c */
        private String[] f7369c;
        /* renamed from: d */
        private CredentialPickerConfig f7370d = new C2428a().m8785a();
        /* renamed from: e */
        private boolean f7371e = false;
        /* renamed from: f */
        private String f7372f;
        /* renamed from: g */
        private String f7373g;

        /* renamed from: a */
        public final C2430a m8800a(boolean z) {
            this.f7367a = z;
            return this;
        }

        /* renamed from: a */
        public final HintRequest m8801a() {
            if (this.f7369c == null) {
                this.f7369c = new String[0];
            }
            if (this.f7367a || this.f7368b || this.f7369c.length != 0) {
                return new HintRequest();
            }
            throw new IllegalStateException("At least one authentication method must be specified");
        }

        /* renamed from: b */
        public final C2430a m8802b(boolean z) {
            this.f7368b = z;
            return this;
        }
    }

    HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, String[] strArr, boolean z3, String str, String str2) {
        this.zzeck = i;
        this.zzefp = (CredentialPickerConfig) ad.m9045a((Object) credentialPickerConfig);
        this.zzefq = z;
        this.zzefr = z2;
        this.zzefi = (String[]) ad.m9045a((Object) strArr);
        if (this.zzeck < 2) {
            this.zzefl = true;
            this.zzefm = null;
            this.zzefn = null;
            return;
        }
        this.zzefl = z3;
        this.zzefm = str;
        this.zzefn = str2;
    }

    private HintRequest(C2430a c2430a) {
        this(2, c2430a.f7370d, c2430a.f7367a, c2430a.f7368b, c2430a.f7369c, c2430a.f7371e, c2430a.f7372f, c2430a.f7373g);
    }

    @NonNull
    public final String[] getAccountTypes() {
        return this.zzefi;
    }

    @NonNull
    public final CredentialPickerConfig getHintPickerConfig() {
        return this.zzefp;
    }

    @Nullable
    public final String getIdTokenNonce() {
        return this.zzefn;
    }

    @Nullable
    public final String getServerClientId() {
        return this.zzefm;
    }

    public final boolean isEmailAddressIdentifierSupported() {
        return this.zzefq;
    }

    public final boolean isIdTokenRequested() {
        return this.zzefl;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.a(parcel);
        oj.a(parcel, 1, getHintPickerConfig(), i, false);
        oj.a(parcel, 2, isEmailAddressIdentifierSupported());
        oj.a(parcel, 3, this.zzefr);
        oj.a(parcel, 4, getAccountTypes(), false);
        oj.a(parcel, 5, isIdTokenRequested());
        oj.a(parcel, 6, getServerClientId(), false);
        oj.a(parcel, 7, getIdTokenNonce(), false);
        oj.a(parcel, AdError.NETWORK_ERROR_CODE, this.zzeck);
        oj.a(parcel, a);
    }
}
