package com.google.android.gms.auth.api.phone;

import android.content.Context;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.C3787a;
import com.google.android.gms.common.api.Api.C3788d;
import com.google.android.gms.common.api.C2467b;
import com.google.android.gms.common.api.internal.cf;
import com.google.android.gms.internal.nl;
import com.google.android.gms.tasks.C4500a;

/* renamed from: com.google.android.gms.auth.api.phone.b */
public abstract class C3780b extends C2467b<Object> implements SmsRetrieverApi {
    /* renamed from: b */
    private static final C3788d<nl> f11855b = new C3788d();
    /* renamed from: c */
    private static final C3787a<nl, Object> f11856c = new C4286c();
    /* renamed from: d */
    private static final Api<Object> f11857d = new Api("SmsRetriever.API", f11856c, f11855b);

    public C3780b(@NonNull Context context) {
        super(context, f11857d, null, new cf());
    }

    public abstract C4500a<Void> startSmsRetriever();
}
