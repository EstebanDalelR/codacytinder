package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.support.annotation.Nullable;
import com.google.android.exoplayer2.util.C2289a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

public final class DataSpec {
    /* renamed from: a */
    public final Uri f6822a;
    @Nullable
    /* renamed from: b */
    public final byte[] f6823b;
    /* renamed from: c */
    public final long f6824c;
    /* renamed from: d */
    public final long f6825d;
    /* renamed from: e */
    public final long f6826e;
    @Nullable
    /* renamed from: f */
    public final String f6827f;
    /* renamed from: g */
    public final int f6828g;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public DataSpec(Uri uri) {
        this(uri, 0);
    }

    public DataSpec(Uri uri, int i) {
        this(uri, 0, -1, null, i);
    }

    public DataSpec(Uri uri, long j, long j2, @Nullable String str) {
        this(uri, j, j, j2, str, 0);
    }

    public DataSpec(Uri uri, long j, long j2, @Nullable String str, int i) {
        this(uri, j, j, j2, str, i);
    }

    public DataSpec(Uri uri, long j, long j2, long j3, @Nullable String str, int i) {
        this(uri, null, j, j2, j3, str, i);
    }

    public DataSpec(Uri uri, @Nullable byte[] bArr, long j, long j2, long j3, @Nullable String str, int i) {
        boolean z = false;
        C2289a.m8311a(j >= 0);
        C2289a.m8311a(j2 >= 0);
        if (j3 > 0 || j3 == -1) {
            z = true;
        }
        C2289a.m8311a(z);
        this.f6822a = uri;
        this.f6823b = bArr;
        this.f6824c = j;
        this.f6825d = j2;
        this.f6826e = j3;
        this.f6827f = str;
        this.f6828g = i;
    }

    /* renamed from: a */
    public boolean m8236a(int i) {
        return (this.f6828g & i) == i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DataSpec[");
        stringBuilder.append(this.f6822a);
        stringBuilder.append(", ");
        stringBuilder.append(Arrays.toString(this.f6823b));
        stringBuilder.append(", ");
        stringBuilder.append(this.f6824c);
        stringBuilder.append(", ");
        stringBuilder.append(this.f6825d);
        stringBuilder.append(", ");
        stringBuilder.append(this.f6826e);
        stringBuilder.append(", ");
        stringBuilder.append(this.f6827f);
        stringBuilder.append(", ");
        stringBuilder.append(this.f6828g);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public DataSpec m8234a(long j) {
        long j2 = -1;
        if (this.f6826e != -1) {
            j2 = this.f6826e - j;
        }
        return m8235a(j, j2);
    }

    /* renamed from: a */
    public DataSpec m8235a(long j, long j2) {
        DataSpec dataSpec = this;
        if (j == 0 && dataSpec.f6826e == j2) {
            return dataSpec;
        }
        return new DataSpec(dataSpec.f6822a, dataSpec.f6823b, dataSpec.f6824c + j, dataSpec.f6825d + j, j2, dataSpec.f6827f, dataSpec.f6828g);
    }
}
