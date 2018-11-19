package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.bn;
import com.google.android.gms.ads.internal.zzbl;

@zzzv
public final class kz {
    /* renamed from: a */
    public static zzakv<zzanh> m20025a(Context context, zzakd zzakd, String str, tb tbVar, bn bnVar) {
        return id.m19922a(id.m19920a(null), new la(context, tbVar, zzakd, bnVar, str), ir.f16195a);
    }

    /* renamed from: a */
    public final zzanh m20026a(Context context, mb mbVar, String str, boolean z, boolean z2, @Nullable tb tbVar, zzakd zzakd, amb amb, zzbl zzbl, bn bnVar, ahw ahw) throws zzanv {
        try {
            return (zzanh) hg.m19845b(context, new lc(this, context, mbVar, str, z, z2, tbVar, zzakd, amb, zzbl, bnVar, ahw));
        } catch (Throwable th) {
            zzanv zzanv = new zzanv(this, "Webview initialization failed.", th);
        }
    }
}
