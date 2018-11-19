package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DrmSession.DrmSessionException;
import com.google.android.exoplayer2.util.C2289a;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.drm.b */
public final class C3603b<T extends ExoMediaCrypto> implements DrmSession<T> {
    /* renamed from: a */
    private final DrmSessionException f10882a;

    public T getMediaCrypto() {
        return null;
    }

    public byte[] getOfflineLicenseKeySetId() {
        return null;
    }

    public int getState() {
        return 1;
    }

    public Map<String, String> queryKeyStatus() {
        return null;
    }

    public C3603b(DrmSessionException drmSessionException) {
        this.f10882a = (DrmSessionException) C2289a.m8309a((Object) drmSessionException);
    }

    public DrmSessionException getError() {
        return this.f10882a;
    }
}
