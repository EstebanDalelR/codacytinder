package com.google.android.gms.location;

import android.app.PendingIntent;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.api.C2467b;
import com.google.android.gms.common.api.internal.cf;
import com.google.android.gms.common.internal.C2510z;
import com.google.android.gms.tasks.C4500a;

/* renamed from: com.google.android.gms.location.b */
public class C6280b extends C2467b<Object> {
    public C6280b(@NonNull Context context) {
        super(context, C4486f.f16730a, null, new cf());
    }

    @RequiresPermission("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    /* renamed from: a */
    public C4500a<Void> m27588a(long j, PendingIntent pendingIntent) {
        return C2510z.a(C4483a.f16723b.requestActivityUpdates(d(), j, pendingIntent));
    }

    @RequiresPermission("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    /* renamed from: a */
    public C4500a<Void> m27589a(PendingIntent pendingIntent) {
        return C2510z.a(C4483a.f16723b.removeActivityUpdates(d(), pendingIntent));
    }
}
