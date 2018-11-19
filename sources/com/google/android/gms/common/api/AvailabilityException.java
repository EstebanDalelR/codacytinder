package com.google.android.gms.common.api;

import android.support.v4.util.C2880a;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.internal.cg;
import com.google.android.gms.common.internal.ad;
import java.util.ArrayList;

public class AvailabilityException extends Exception {
    /* renamed from: a */
    private final C2880a<cg<?>, ConnectionResult> f7416a;

    public AvailabilityException(C2880a<cg<?>, ConnectionResult> c2880a) {
        this.f7416a = c2880a;
    }

    /* renamed from: a */
    public final C2880a<cg<?>, ConnectionResult> m8848a() {
        return this.f7416a;
    }

    /* renamed from: a */
    public ConnectionResult m8849a(C2467b<? extends ApiOptions> c2467b) {
        cg b = c2467b.m8901b();
        ad.m9055b(this.f7416a.get(b) != null, "The given API was not part of the availability request.");
        return (ConnectionResult) this.f7416a.get(b);
    }

    public String getMessage() {
        Iterable arrayList = new ArrayList();
        Object obj = 1;
        for (cg cgVar : this.f7416a.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) this.f7416a.get(cgVar);
            if (connectionResult.isSuccess()) {
                obj = null;
            }
            String a = cgVar.m8993a();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(a).length() + 2) + String.valueOf(valueOf).length());
            stringBuilder.append(a);
            stringBuilder.append(": ");
            stringBuilder.append(valueOf);
            arrayList.add(stringBuilder.toString());
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(obj != null ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        stringBuilder2.append(TextUtils.join("; ", arrayList));
        return stringBuilder2.toString();
    }
}
