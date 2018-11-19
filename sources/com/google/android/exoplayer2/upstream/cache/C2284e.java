package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import android.support.annotation.Nullable;

/* renamed from: com.google.android.exoplayer2.upstream.cache.e */
final class C2284e {
    /* renamed from: a */
    public static long m8287a(ContentMetadata contentMetadata) {
        return contentMetadata.get("exo_len", -1);
    }

    /* renamed from: a */
    public static void m8289a(C2285f c2285f, long j) {
        c2285f.m8294a("exo_len", j);
    }

    @Nullable
    /* renamed from: b */
    public static Uri m8291b(ContentMetadata contentMetadata) {
        contentMetadata = contentMetadata.get("exo_redir", (String) null);
        if (contentMetadata == null) {
            return null;
        }
        return Uri.parse(contentMetadata);
    }

    /* renamed from: a */
    public static void m8290a(C2285f c2285f, Uri uri) {
        c2285f.m8295a("exo_redir", uri.toString());
    }

    /* renamed from: a */
    public static void m8288a(C2285f c2285f) {
        c2285f.m8293a("exo_redir");
    }
}
