package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import android.view.View;
import com.google.android.gms.ads.internal.zzae;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.dynamic.IObjectWrapper;

@zzzv
public final class amc extends ame {
    /* renamed from: a */
    private final zzae f26665a;
    @Nullable
    /* renamed from: b */
    private final String f26666b;
    /* renamed from: c */
    private final String f26667c;

    public amc(zzae zzae, @Nullable String str, String str2) {
        this.f26665a = zzae;
        this.f26666b = str;
        this.f26667c = str2;
    }

    public final String getContent() {
        return this.f26667c;
    }

    public final void recordClick() {
        this.f26665a.zzcs();
    }

    public final void recordImpression() {
        this.f26665a.zzct();
    }

    public final void zze(@Nullable IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper != null) {
            this.f26665a.zzh((View) C4296b.a(iObjectWrapper));
        }
    }

    public final String zzjj() {
        return this.f26666b;
    }
}
