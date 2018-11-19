package com.google.android.gms.location;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.C3787a;
import com.google.android.gms.common.api.Api.C3788d;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.ck;
import com.google.android.gms.internal.qh;
import com.google.android.gms.internal.rw;

/* renamed from: com.google.android.gms.location.a */
public class C4483a {
    /* renamed from: a */
    public static final Api<Object> f16722a = new Api("ActivityRecognition.API", f16725d, f16724c);
    @Deprecated
    /* renamed from: b */
    public static final ActivityRecognitionApi f16723b = new qh();
    /* renamed from: c */
    private static final C3788d<rw> f16724c = new C3788d();
    /* renamed from: d */
    private static final C3787a<rw, Object> f16725d = new C7365h();

    /* renamed from: com.google.android.gms.location.a$a */
    public static abstract class C8037a<R extends Result> extends ck<R, rw> {
        public C8037a(GoogleApiClient googleApiClient) {
            super(C4483a.f16722a, googleApiClient);
        }

        public final /* synthetic */ void setResult(Object obj) {
            super.a((Result) obj);
        }
    }

    /* renamed from: a */
    public static C6280b m20350a(Context context) {
        return new C6280b(context);
    }
}
