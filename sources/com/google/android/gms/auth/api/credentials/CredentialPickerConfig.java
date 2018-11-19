package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.ads.AdError;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class CredentialPickerConfig extends zzbfm implements ReflectedParcelable {
    public static final Creator<CredentialPickerConfig> CREATOR = new C2434c();
    private final boolean mShowCancelButton;
    private int zzeck;
    private final boolean zzefd;
    @Deprecated
    private final boolean zzefe;
    private final int zzeff;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Prompt {
    }

    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialPickerConfig$a */
    public static class C2428a {
        /* renamed from: a */
        private boolean f7357a = false;
        /* renamed from: b */
        private boolean f7358b = true;
        /* renamed from: c */
        private int f7359c = 1;

        /* renamed from: a */
        public CredentialPickerConfig m8785a() {
            return new CredentialPickerConfig();
        }
    }

    CredentialPickerConfig(int i, boolean z, boolean z2, boolean z3, int i2) {
        this.zzeck = i;
        this.zzefd = z;
        this.mShowCancelButton = z2;
        z = true;
        if (i < 2) {
            int i3;
            this.zzefe = z3;
            if (z3) {
                i3 = 3;
            }
            this.zzeff = i3;
            return;
        }
        if (i2 != 3) {
            z = false;
        }
        this.zzefe = z;
        this.zzeff = i2;
    }

    private CredentialPickerConfig(C2428a c2428a) {
        this(2, c2428a.f7357a, c2428a.f7358b, false, c2428a.f7359c);
    }

    @Deprecated
    public final boolean isForNewAccount() {
        return this.zzeff == 3;
    }

    public final boolean shouldShowAddAccountButton() {
        return this.zzefd;
    }

    public final boolean shouldShowCancelButton() {
        return this.mShowCancelButton;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = oj.a(parcel);
        oj.a(parcel, 1, shouldShowAddAccountButton());
        oj.a(parcel, 2, shouldShowCancelButton());
        oj.a(parcel, 3, isForNewAccount());
        oj.a(parcel, 4, this.zzeff);
        oj.a(parcel, AdError.NETWORK_ERROR_CODE, this.zzeck);
        oj.a(parcel, i);
    }
}
