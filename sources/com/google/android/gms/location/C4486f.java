package com.google.android.gms.location;

import android.content.Context;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.C3787a;
import com.google.android.gms.common.api.Api.C3788d;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.ck;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.internal.qr;
import com.google.android.gms.internal.rf;
import com.google.android.gms.internal.rw;
import com.google.android.gms.internal.sd;

/* renamed from: com.google.android.gms.location.f */
public class C4486f {
    /* renamed from: a */
    public static final Api<Object> f16730a = new Api("LocationServices.API", f16735f, f16734e);
    @Deprecated
    /* renamed from: b */
    public static final FusedLocationProviderApi f16731b = new qr();
    @Deprecated
    /* renamed from: c */
    public static final GeofencingApi f16732c = new rf();
    @Deprecated
    /* renamed from: d */
    public static final SettingsApi f16733d = new sd();
    /* renamed from: e */
    private static final C3788d<rw> f16734e = new C3788d();
    /* renamed from: f */
    private static final C3787a<rw, Object> f16735f = new ag();

    /* renamed from: com.google.android.gms.location.f$a */
    public static abstract class C8038a<R extends Result> extends ck<R, rw> {
        public C8038a(GoogleApiClient googleApiClient) {
            super(C4486f.f16730a, googleApiClient);
        }

        public final /* synthetic */ void setResult(Object obj) {
            super.a((Result) obj);
        }
    }

    /* renamed from: a */
    public static rw m20356a(GoogleApiClient googleApiClient) {
        boolean z = false;
        ad.b(googleApiClient != null, "GoogleApiClient parameter is required.");
        rw rwVar = (rw) googleApiClient.a(f16734e);
        if (rwVar != null) {
            z = true;
        }
        ad.a(z, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return rwVar;
    }

    /* renamed from: a */
    public static C6281c m20357a(@NonNull Context context) {
        return new C6281c(context);
    }
}
