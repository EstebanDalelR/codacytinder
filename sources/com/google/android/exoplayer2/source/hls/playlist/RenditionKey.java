package com.google.android.exoplayer2.source.hls.playlist;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class RenditionKey implements Comparable<RenditionKey> {
    /* renamed from: a */
    public final int f6387a;
    /* renamed from: b */
    public final int f6388b;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    public /* synthetic */ int compareTo(@NonNull Object obj) {
        return m7892a((RenditionKey) obj);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f6387a);
        stringBuilder.append(".");
        stringBuilder.append(this.f6388b);
        return stringBuilder.toString();
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                RenditionKey renditionKey = (RenditionKey) obj;
                if (this.f6387a != renditionKey.f6387a || this.f6388b != renditionKey.f6388b) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f6387a * 31) + this.f6388b;
    }

    /* renamed from: a */
    public int m7892a(@NonNull RenditionKey renditionKey) {
        int i = this.f6387a - renditionKey.f6387a;
        return i == 0 ? this.f6388b - renditionKey.f6388b : i;
    }
}
