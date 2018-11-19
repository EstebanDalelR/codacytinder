package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.support.annotation.Nullable;

@zzzv
public final class jv extends jq {
    @Nullable
    /* renamed from: a */
    public final jp mo4645a(Context context, zzamp zzamp, int i, boolean z, amb amb, kc kcVar) {
        Object obj;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            if (applicationInfo.targetSdkVersion < 11) {
                obj = null;
                if (obj == null) {
                    return null;
                }
                return new jf(context, z, zzamp.zzsx().m20048d(), kcVar, new kd(context, zzamp.zzsk(), zzamp.getRequestId(), amb, zzamp.zzsh()));
            }
        }
        obj = 1;
        if (obj == null) {
            return null;
        }
        return new jf(context, z, zzamp.zzsx().m20048d(), kcVar, new kd(context, zzamp.zzsk(), zzamp.getRequestId(), amb, zzamp.zzsh()));
    }
}
