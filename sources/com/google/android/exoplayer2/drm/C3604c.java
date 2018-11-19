package com.google.android.exoplayer2.drm;

import android.annotation.TargetApi;
import android.media.MediaCrypto;

@TargetApi(16)
/* renamed from: com.google.android.exoplayer2.drm.c */
public final class C3604c implements ExoMediaCrypto {
    /* renamed from: a */
    private final MediaCrypto f10883a;
    /* renamed from: b */
    private final boolean f10884b;

    /* renamed from: a */
    public MediaCrypto m13566a() {
        return this.f10883a;
    }

    public boolean requiresSecureDecoderComponent(String str) {
        return (this.f10884b || this.f10883a.requiresSecureDecoderComponent(str) == null) ? null : true;
    }
}
