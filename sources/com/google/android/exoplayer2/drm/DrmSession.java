package com.google.android.exoplayer2.drm;

import android.annotation.TargetApi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

@TargetApi(16)
public interface DrmSession<T extends ExoMediaCrypto> {

    public static class DrmSessionException extends Exception {
        public DrmSessionException(Throwable th) {
            super(th);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    DrmSessionException getError();

    T getMediaCrypto();

    byte[] getOfflineLicenseKeySetId();

    int getState();

    Map<String, String> queryKeyStatus();
}
