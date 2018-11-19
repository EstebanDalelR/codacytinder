package com.firebase.jobdispatcher;

import android.net.Uri;
import android.support.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class ObservedUri {
    /* renamed from: a */
    private final Uri f5097a;
    /* renamed from: b */
    private final int f5098b;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public ObservedUri(@NonNull Uri uri, int i) {
        if (uri == null) {
            throw new IllegalArgumentException("URI must not be null.");
        }
        this.f5097a = uri;
        this.f5098b = i;
    }

    /* renamed from: a */
    public Uri m6575a() {
        return this.f5097a;
    }

    /* renamed from: b */
    public int m6576b() {
        return this.f5098b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ObservedUri)) {
            return false;
        }
        ObservedUri observedUri = (ObservedUri) obj;
        if (this.f5098b != observedUri.f5098b || this.f5097a.equals(observedUri.f5097a) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.f5097a.hashCode() ^ this.f5098b;
    }
}
