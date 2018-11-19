package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.C2507w;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.images.b */
final class C2495b {
    /* renamed from: a */
    public final Uri f7577a;

    public C2495b(Uri uri) {
        this.f7577a = uri;
    }

    public final boolean equals(Object obj) {
        return !(obj instanceof C2495b) ? false : this == obj ? true : C2507w.m9173a(((C2495b) obj).f7577a, this.f7577a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7577a});
    }
}
