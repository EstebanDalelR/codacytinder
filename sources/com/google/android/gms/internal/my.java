package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import com.google.android.gms.auth.api.C2422a.C4391a;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.common.internal.ad;

public final class my {
    /* renamed from: a */
    public static PendingIntent m20052a(Context context, @Nullable C4391a c4391a, HintRequest hintRequest) {
        ad.a(context, "context must not be null");
        ad.a(hintRequest, "request must not be null");
        zzbfq a = (c4391a == null || c4391a.a() == null) ? PasswordSpecification.zzeft : c4391a.a();
        Intent putExtra = new Intent("com.google.android.gms.auth.api.credentials.PICKER").putExtra("com.google.android.gms.credentials.hintRequestVersion", 2).putExtra("com.google.android.gms.credentials.RequestType", "Hints").putExtra("com.google.android.gms.credentials.ClaimedCallingPackage", null);
        ok.m20115a(a, putExtra, "com.google.android.gms.credentials.PasswordSpecification");
        ok.m20115a((zzbfq) hintRequest, putExtra, "com.google.android.gms.credentials.HintRequest");
        return PendingIntent.getActivity(context, 2000, putExtra, 134217728);
    }
}
