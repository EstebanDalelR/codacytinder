package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ahz;
import com.google.android.gms.internal.cy;
import com.google.android.gms.internal.cz;
import com.google.android.gms.internal.jq;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.kh;
import com.google.android.gms.internal.zzafc;
import com.google.android.gms.internal.zzanf;
import com.google.android.gms.internal.zzzv;

@zzzv
public final class bn {
    /* renamed from: a */
    public final zzanf f7212a;
    /* renamed from: b */
    public final jq f7213b;
    /* renamed from: c */
    public final zzafc f7214c;
    /* renamed from: d */
    public final ahz f7215d;

    private bn(zzanf zzanf, jq jqVar, zzafc zzafc, ahz ahz) {
        this.f7212a = zzanf;
        this.f7213b = jqVar;
        this.f7214c = zzafc;
        this.f7215d = ahz;
    }

    /* renamed from: a */
    public static bn m8686a(Context context) {
        return new bn(new kh(), new jv(), new cy(new cz()), new ahz(context));
    }
}
