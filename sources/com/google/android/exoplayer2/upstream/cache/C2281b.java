package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSpec;

/* renamed from: com.google.android.exoplayer2.upstream.cache.b */
public final class C2281b {
    /* renamed from: a */
    public static String m8253a(Uri uri) {
        return uri.toString();
    }

    /* renamed from: a */
    public static String m8254a(DataSpec dataSpec) {
        return dataSpec.f6827f != null ? dataSpec.f6827f : C2281b.m8253a(dataSpec.f6822a);
    }
}
