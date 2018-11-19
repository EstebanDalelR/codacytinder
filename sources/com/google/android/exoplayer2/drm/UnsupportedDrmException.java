package com.google.android.exoplayer2.drm;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class UnsupportedDrmException extends Exception {

    @Retention(RetentionPolicy.SOURCE)
    public @interface Reason {
    }
}
